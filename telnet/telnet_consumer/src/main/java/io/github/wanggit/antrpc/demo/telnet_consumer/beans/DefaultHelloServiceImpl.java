package io.github.wanggit.antrpc.demo.telnet_consumer.beans;

import io.github.wanggit.antrpc.commons.annotations.OnRpcFail;
import io.github.wanggit.antrpc.demo.telnet.api.HelloService;
import io.github.wanggit.antrpc.demo.telnet.api.UserDTO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

@OnRpcFail(clazz = HelloService.class)
public class DefaultHelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String s) {
        return "Default!!";
    }

    @Override
    public String sayBay(String s) {
        return "Default!!";
    }

    @Override
    public String test(String s, int i, Integer integer) {
        return "Default!!";
    }

    @Override
    public String doTest(String s, UserDTO userDTO) {
        return "Default!!";
    }

    @Override
    public String testIntArray(String s, int[] ints) {
        return "Default!!";
    }

    @Override
    public String testIntegerArray(String s, Integer[] integers) {
        return "Default!!";
    }

    @Override
    public String testBigDecimal(String s, BigDecimal bigDecimal) {
        return "Default!!";
    }

    @Override
    public String testList(String s, List<Integer> list) {
        return "Default!!";
    }

    @Override
    public String testSet(String s, Set<String> set) {
        return "Default!!";
    }

    @Override
    public String testMap(String s, Map<String, String> map) {
        return "Default!!";
    }

    @Override
    public String testListUserDTOs(String s, List<UserDTO> list) {
        return "Default!!";
    }
}
