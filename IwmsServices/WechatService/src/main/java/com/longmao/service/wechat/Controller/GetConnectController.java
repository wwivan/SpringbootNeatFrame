package com.longmao.service.wechat.Controller;

//import com.longmao.common.util.Response;
import com.longmao.common.util.Response;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: wwivan
 * @Date: 2020/4/1日10:19
 * @Description:
 */
@RequestMapping("/connect")
@RestController
@CrossOrigin
public class GetConnectController {
    @GetMapping("/get")
    @ResponseBody
    public Response get(){
        return Response.success("请求成功");
    }

}
