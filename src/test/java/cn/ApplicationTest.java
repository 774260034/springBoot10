//package cn;
//
//import cn.controller.UserController;
//import cn.dao.UserDao;
//import cn.domain.User;
//import cn.util.NoteProperties;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ApplicationTest {
////    @Autowired
////    private NoteProperties noteProperties;
//    @Autowired
//    private UserDao userDao;
//
//    private MockMvc mockMvc;
//    @Before //在执行测试之前执行
//    public void setUp(){
//        mockMvc= MockMvcBuilders.standaloneSetup(UserController.class).build();
//    }
//
//    @Test
//    public void getUser() throws Exception {
//        //MockMvcRequestBuilders.get("/getUser")设置请求方式get和接口方法请求地址
//        //accept(MediaType.APPLICATION_JSON) 设置数据格式json
//        //param("name","zs") 设置传递给接口方法参数
//        String responseString=  mockMvc.perform(
//                MockMvcRequestBuilders.get("/getUser")
//                        .accept(MediaType.APPLICATION_JSON)
//                        .param("name","zs")
//        ).andExpect(status().isOk())
//                .andDo(print()) //andDo(print())打印出请求和相应的内容
//                .andReturn().getResponse().getContentAsString(); ////将相应的数据转换为字符串
//        ; //andDo(print())打印出请求和相应的内容
//
//        System.out.println("响应的内容："+responseString);
//
//    }
//@Test
//public void testPr(){
//   // System.out.println(noteProperties.getKey());
//    User user=new User();
//    user.setName("zs");
//
//    System.out.println(user.getName());
//}
//@Autowired
//private StringRedisTemplate stringRedisTemplate;
//@Test
//public void testRedis(){
//    ValueOperations valueOperations=stringRedisTemplate.opsForValue();
//    valueOperations.set("cfb","1231");
//    System.out.println(valueOperations.get("cfb"));
//}
//@Autowired
//private RedisTemplate redisTemplate;
//public void testRedisObject(){
//    User user=new User();
//    user.setName("zs");
//    user.setPassword("123456");
//    ValueOperations<String,User> valueOperations=redisTemplate.opsForValue();
//    valueOperations.set("userMsg",user);
//
//
//}
//
//}
//
