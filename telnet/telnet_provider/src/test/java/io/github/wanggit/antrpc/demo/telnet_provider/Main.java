package io.github.wanggit.antrpc.demo.telnet_provider;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    @Test
    public void diff() throws IOException {
        String html = "<div class=\"element-item portfolio-item design\">\n" +
                "                        <a href=\"#_name_\" class=\"portfolio-link\" data-toggle=\"modal\">\n" +
                "                            <div class=\"caption\">\n" +
                "                                <div class=\"caption-content\">\n" +
                "                                    <i class=\"fa fa-search-plus fa-3x\"></i>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                            <img src=\"img/extends/prods/small/_name_.png\" class=\"img-responsive\" alt=\"\"/>\n" +
                "                        </a>\n" +
                "                    </div>";
        String[] names = new String[]{
                "LA6045",
                "LA6051",
                "LA6053",
                "LA6057",
                "LA6066",
                "LA6067",
                "LA6075",
                "LA6082",
                "LA6087",
                "LA6089",
                "LA6090",
                "LA6092",
                "LA6099",
                "LA7023",
                "LA7053",
                "LA7084",
                "LA7089",
                "LA7095",
                "LA8055",
                "LA8061",
                "LA8062"
        };
        for (String name : names) {
            System.out.println(html.replaceAll("_name_", name));
        }
    }

    @Test
    public void test2(){
        String html = "<div class=\"portfolio-modal modal fade\" id=\"_name_\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n" +
                "    <div class=\"modal-content\">\n" +
                "        <div class=\"close-modal\" data-dismiss=\"modal\">\n" +
                "            <div class=\"lr\">\n" +
                "                <div class=\"rl\">\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div class=\"container\">\n" +
                "            <div class=\"row\">\n" +
                "                <div class=\"col-lg-8 col-lg-offset-2\">\n" +
                "                    <div class=\"modal-body\">\n" +
                "                        <h2>_value_</h2>\n" +
                "                        <hr class=\"star-primary\">\n" +
                "                        <img src=\"img/extends/prods/big/_name_.png\" class=\"img-responsive img-centered\" alt=\"\">\n" +
                "                        <p>我是就是_value_，想不想介绍一个这个产品呢？你看着办，就是好用。</p>\n" +
                "                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\"><i class=\"fa fa-times\"></i>\n" +
                "                            关闭\n" +
                "                        </button>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>";
        Map<String, String> datas = new TreeMap<>();
        datas.put("LA6045", "抓管气囊");
        datas.put("LA6067", "抓管活塞");
        datas.put("LA6053", "锭子挡圈");
        datas.put("LA6090", "尘笼滤网");
        datas.put("LA6057", "抓管器整件");
        datas.put("LA6099", "充气隔膜");
        datas.put("LA6051", "抓管帽");
        datas.put("LA6066", "落纱铜涡轮");
        datas.put("LA6082", "落纱管座");
        datas.put("LA6075", "链条滑块");
        datas.put("LA6089", "尘笼密封条");
        datas.put("LA6087", "钢带支架");
        datas.put("LA6092", "网格圈");
        datas.put("LA7023", "电机制动片");
        datas.put("LA7084", "络筒气缸");
        datas.put("LA7089", "金属气缸");
        datas.put("LA7095", "并条多楔带");
        datas.put("LA7053", "传动链条");
        datas.put("LA8055", "精梳机刮皮");
        datas.put("LA8062", "并条下刮皮");
        datas.put("LA8061", "并条上刮皮");
        for (Map.Entry<String, String> entry : datas.entrySet()) {
            System.out.println(html.replaceAll("_name_", entry.getKey()).replaceAll("_value_", entry.getValue()));
        }
    }

}
