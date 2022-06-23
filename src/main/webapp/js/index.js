function Paging(options,callback) {
    let defaultValue = {
        total: 0,
        current: 1,
        firstText: '首页',
        prevText: '上一页',
        nextText: '下一页',
        lastText: '尾页',
        PageSize: 10,
        PageNum: 5,
        container: document.getElementsByClassName('paging')[0]
    }

    this.options = Object.assign({}, defaultValue, options);
    this.show();
    this.PageClick(callback)
}

Paging.prototype.show = function () {
    let disable = "";
    let PageTotalNum = this.getPageTotalNum();
    this.options.container.innerHTML = "";
    if(this.options.current === 1){
        disable = 'disable'
    }
    this.createElement('first ' + disable, this.options.firstText);
    this.createElement('prev ' + disable, this.options.prevText);

    this.createNumElement();

    disable = ""
    if(this.options.current === PageTotalNum){
        disable = 'disable'
    }
    this.createElement('next ' + disable, this.options.nextText);
    this.createElement('last ' + disable, this.options.lastText);

    let span = document.createElement('span');
    let i = `<i>${this.options.current}</i> /<i>${PageTotalNum}</i>`;
    span.innerHTML = i;
    this.options.container.appendChild(span)
}

Paging.prototype.createNumElement = function() {
    let min = this.options.current - Math.floor(this.options.PageNum / 2);
    if(min < 1) {
        min = 1;
    }
    let max = min + this.options.PageNum - 1;
    let PageTotalNum = this.getPageTotalNum();
    if (max > PageTotalNum){
        max = PageTotalNum;
    }
    let active = "";
    for(let i = min; i <= max; i ++) {
        if(this.options.current === i) {
            active = 'active';
        }else{
            active = '';
        }
        this.createElement('pagingDiv ' + active, i);
    }
}


Paging.prototype.createElement = function(specialStyle, content) {
    let oDiv = document.createElement('div');
    oDiv.className = specialStyle;
    oDiv.innerText = content;
    this.options.container.appendChild(oDiv);
}

Paging.prototype.getPageTotalNum = function() {
    return Math.ceil(this.options.total / this.options.PageSize)
}

Paging.prototype.PageClick = function(callback) {
    let _this = this;
    let PageTotalNum = this.getPageTotalNum();
	let pagenum;
    this.options.container.addEventListener('click', function(e) {
        if(e.target.classList.contains('first')){
             pagenum=1;
 
        } else if (e.target.classList.contains('prev')) {
			pagenum=_this.options.current - 1;
     
        } else if (e.target.classList.contains('next')) {
			 pagenum=_this.options.current + 1;

        } else if (e.target.classList.contains('last')) {
			 pagenum=PageTotalNum;

        } else if(e.target.classList.contains('pagingDiv')){
			 pagenum=+e.target.innerText;
           
        }
		 _this.toPage(pagenum);
		 if(pagenum>=1&&pagenum<=PageTotalNum){
			 callback(pagenum);
		 }else if(pagenum<1){
			 callback(1);
		 }else if(pagenum>PageTotalNum){
			 callback(PageTotalNum);
		 }
		 
    })
}

Paging.prototype.toPage = function (page){
    let PageTotalNum = this.getPageTotalNum();
    if(page < 1) {
        page = 1;
    }
    if(page > PageTotalNum){
        page = PageTotalNum;
    }
    this.options.current = page;
    this.show()
}