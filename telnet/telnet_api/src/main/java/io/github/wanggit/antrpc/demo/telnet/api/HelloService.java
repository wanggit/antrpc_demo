package io.github.wanggit.antrpc.demo.telnet.api;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface HelloService {

    String sayHello(String name);

    String sayBay(String name);

    String test(String name, int age, Integer count);

    String doTest(String label, UserDTO userDTO);

    String testIntArray(String label, int[] arr);

    String testIntegerArray(String label, Integer[] arr);

    String testBigDecimal(String label, BigDecimal decimal);

    String testList(String label, List<Integer> list);

    String testSet(String label, Set<String> set);

    String testMap(String label, Map<String, String> map);

    String testListUserDTOs(String label, List<UserDTO> userDTOS);

}
