package controller;

import javafx.beans.binding.When;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author chenjian
 * @date 2019/5/22 15:05
 * @Description
 */
@Controller
@ResponseBody
@RequestMapping("/test")
public class TestCoontroller {

    @RequestMapping("str")
    public Object Test(){

       String[] a = {"qqq","sds","cdf"};
       String b = "sss";
        for (int i=0;i<4;i++){
               a =  StringUtils.addStringToArray(a,b);
        }
        List c = Arrays.asList(a);
        Set s = new HashSet(c);
        return s;
    }
}
