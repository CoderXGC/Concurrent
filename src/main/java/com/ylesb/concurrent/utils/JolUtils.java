package com.ylesb.concurrent.utils;
/**
 * @title: JolUtils
 * @projectName Concurrent
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/5/718:49
 */

/**
 * @className    : JolUtils
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/5/7 18:49]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/5/7 18:49]
 * @updateRemark : [描述说明本次修改内容] 
 */
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;
import org.openjdk.jol.vm.VirtualMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public   class JolUtils {
    public static String toPrintableSimple(Object o) {
        return getHeader64Bit(o);
    }

    public static void main(String[] args) {
        System.out.println( getHeader64Bit(new Object()));
    }

    public static String getHeader64Bit(Object o) {
        VirtualMachine vm = VM.current();
        long word = vm.getLong(o, 0);
        List<String> list = new ArrayList<>(8);
        for (int i = 0; i < 8; i++) {
            list.add(toBinary((word >> i * 8) & 0xFF) );
        }
        Collections.reverse(list);
        return String.join(" ",list);
    }

    // very ineffective, so what?
    private static String toBinary(long x) {
        StringBuilder s = new StringBuilder(Long.toBinaryString(x));
        int deficit = 8 - s.length();
        for (int c = 0; c < deficit; c++) {
            s.insert(0, "0");
        }
        return s.toString();
    }

}

