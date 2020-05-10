package routers

import (
	"webDemo/controllers"
	"github.com/astaxie/beego"
)

func init() {
	beego.Router("/query", &controllers.MainController{}, "Post:PayQuery")
	beego.Router("/add", &controllers.MainController{}, "Post:PayAdd")
	beego.Router("/", &controllers.MainController{})
}
