package io.github.wanggit.antrpc.demo.telnet_provider;

import com.google.common.io.Files;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    @Test
    public void diff() throws IOException {
        File result = new File("D:\\works\\github\\antrpc_demo\\telnet\\telnet_provider\\result.txt");
        File total = new File("D:\\works\\github\\antrpc_demo\\telnet\\telnet_provider\\total.txt");
        Set<String> resultList = new HashSet<>(Files.readLines(result, Charset.defaultCharset()));
        Set<String> totalList = new HashSet<>(Files.readLines(total, Charset.defaultCharset()));
        System.out.println(resultList);
        System.out.println(totalList);
        totalList.removeAll(resultList);
        System.out.println(totalList);
    }

}
