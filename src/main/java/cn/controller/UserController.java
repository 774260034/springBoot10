//package cn.controller;
//
//import cn.domain.User;
//import cn.service.UserService;
//import me.joshlarson.json.JSONArray;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpSession;
//import java.util.List;
//import java.util.UUID;
//
//
//@Controller
//public class UserController {
//    @Resource
//    private UserService userService;
//    @RequestMapping("/getUser")
//    @ResponseBody
//    public User getUser(){
//        User user=new User();
//        user.setName("zs");
//        user.setPassword("123456");
//        JSONArray jsonArray=new JSONArray();
//        jsonArray.toString();
//        return user;
//    }
//    @RequestMapping("/user/index")
//public String index(Model model){
//        model.addAttribute("name","张三使用模板渲染数据");
//        model.addAttribute("status",false);
//        return "index";
//}
//@RequestMapping("user/list")
//public String list(Model model){
//        List list=userService.getUserList();
//     model.addAttribute("userList",list);
//    return "list";
//    }
//    @RequestMapping("/user/getuid")
//    public Object getUid(HttpSession httpSession){
//        UUID uid=(UUID) httpSession.getAttribute("uid");
//        if (uid==null){
//            uid=UUID.randomUUID();
//            httpSession.setAttribute("uid",uid);
//        }
//        return httpSession.getId();
//    }
//
//}
//
