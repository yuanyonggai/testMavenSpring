import com.wisely.script.DemoService
class DemoServiceImpl implements DemoService{
    def msg
    String sayHello(){
        return 'hello'+msg+' ook' //第一次打印后修改成为'hello'+msg+' not ok'
    }
}