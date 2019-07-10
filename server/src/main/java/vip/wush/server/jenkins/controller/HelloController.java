package vip.wush.server.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/5/20 16:19
 */

@RestController
public class HelloController {

    /**
     * @api {GET} /hello  demo-hello 测试接口
     * @apiGroup spring-jenkins-demo
     * @apiName HelloController
     * @apiDescription  测试接口
     *
     * @apiParam {String} name 名字
     * @apiParamExample 请求示例
     * GET: /hello?name=test
     *
     * @apiSuccess {number} errcode      返回码
     * @apiSuccess {String} errmsg       返回码描述
     * @apiSuccessExample 正确时的返回JSON数据包如下
     * {
     *    "errcode":0,
     *    "errmsg":"ok"
     * }
     *
     * @apiError   -1     系统繁忙，请稍候再试
     *
     * @apiErrorExample 错误时的返回JSON数据包如下（示例为系统异常）
     * {
     *     "errcode": -1,
     *     "errmsg": "系统繁忙，请稍候再试"
     * }
     */
    @GetMapping("/hello")
    public String hello(String name){
        if(name == null || "".equals(name)){
            throw new RuntimeException("name must be not null!");
        }
        return name;
    }
}

