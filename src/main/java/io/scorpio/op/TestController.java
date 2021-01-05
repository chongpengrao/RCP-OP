package io.scorpio.op;

import com.google.common.base.Strings;
import io.scorpio.op.common.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author scorpio
 * @date 2021/1/5 0005
 */
@RestController
@Api(tags = "测试接口")
public class TestController {

    @GetMapping("/test")
    @ApiOperation("测试方法")
    public Result<String> test(String name){
        return new Result<String>().ok("Hello,"+ (Strings.isNullOrEmpty(name) ? "World" : name));
    }
}
