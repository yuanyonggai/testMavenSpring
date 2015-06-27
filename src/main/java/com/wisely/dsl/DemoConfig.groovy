import com.wisely.dsl.DemoService//import要注册为bean的类
//所有的bean的声明放在beans下
beans{
//demoService为bean name,DemoService为类本身,msg = "world"为注入的属性
    demoService(DemoService){
        msg = "world"
    }
}