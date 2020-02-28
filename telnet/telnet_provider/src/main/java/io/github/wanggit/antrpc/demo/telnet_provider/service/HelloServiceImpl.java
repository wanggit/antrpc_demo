package io.github.wanggit.antrpc.demo.telnet_provider.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.github.wanggit.antrpc.commons.annotations.RpcMethod;
import io.github.wanggit.antrpc.commons.annotations.RpcService;
import io.github.wanggit.antrpc.demo.telnet.api.HelloService;
import io.github.wanggit.antrpc.demo.telnet.api.UserDTO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RpcService
public class HelloServiceImpl implements HelloService {
    @Override
    @RpcMethod(rateLimitEnable = true, limit = 10, durationInSeconds = 30)
    public String sayHello(String s) {
        return "Hello " + s;
    }

    @Override
    @RpcMethod
    public String sayBay(String s) {
        return "Bay " + s;
    }

    @Override
    @RpcMethod
    public String test(String s, int i, Integer integer) {
        return "result test: " + s + ", " + i + ", " + integer ;
    }

    @Override
    @RpcMethod
    public String doTest(String s, UserDTO userDTO) {
        return "result doTest: " + s + ", " + JSONObject.toJSONString(userDTO);
    }

    @Override
    @RpcMethod
    public String testIntArray(String s, int[] ints) {
        return "result testIntArray: " + s + ", " + JSONObject.toJSONString(ints);
    }

    @Override
    @RpcMethod
    public String testIntegerArray(String s, Integer[] integers) {
        return "result testIntegerArray: " + s + ", " + JSONObject.toJSONString(integers);
    }

    @Override
    @RpcMethod
    public String testBigDecimal(String s, BigDecimal bigDecimal) {
        return "result testBigDecimal: " + s + ", " + bigDecimal.doubleValue();
    }

    @Override
    @RpcMethod
    public String testList(String s, List<Integer> list) {
        return "result testList: " + s + ", " + JSONObject.toJSONString(list);
    }

    @Override
    @RpcMethod
    public String testSet(String s, Set<String> set) {
        return "result testSet: " + s + ", " + JSONObject.toJSONString(set);
    }

    @Override
    @RpcMethod
    public String testMap(String s, Map<String, String> map) {
        return "result testMap: " + s + ", " + JSONObject.toJSONString(map);
    }

    @Override
    @RpcMethod
    public String testListUserDTOs(String s, List<UserDTO> list) {
        return "result testListUserDTOs: " + s + ", " + JSONObject.toJSONString(list);
    }
}
