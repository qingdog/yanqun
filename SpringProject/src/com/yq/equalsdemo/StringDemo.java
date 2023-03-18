package com.yq.equalsdemo;

public class StringDemo {
    public static void main(String[] args) {
        //在某种编码格式下，中文占 2 个字节，英文占 1 个字节。
        // 现要求输入一个**字符串**和**字节数**，
        // 输出该字节数量的子字符串。（忽略被截断的半个汉子）

        String words = "HELLO张三" ;
        int bytes = 8 ;
        //  因为字符串无法直接 计数，例如“张三HELLO”是一个字符串，不能对其直接进行计数操作
        // 因此需要将 字符串转为数组后 再进行计数
        // {"张","三","H",...,}
        // 对数组进行计数时，判断：如果是汉字 +2，否则 +1
        // 1.将 字符串转为数组后
        //  {"张","三","H",...,}
            String[]  strings = strToArray(words);
        // 2. 对数组进行计数时，判断：如果是汉字 +2，否则 +1
           countNum(strings,bytes) ;

    }

    // "张三HELLO" -> {"张","三","H",...,}
    private static String[] strToArray(String words){
        // {,,,...,}
        String[] strs = new String[words.length()];
        //给 {张,三,,...,} 填值
        //"张三HELLO"
        for(int i=0;i<words.length();i++) {
            strs[i] = words.substring(i, i + 1);
        }
        return strs ;
    }
    //strings:{"张","三","H",...,}
    private  static  int countNum(String[] strings,int bytes){
        int count = 0 ;
        String reg = "[\u4e00-\u9fa5]"; // 如果字符处于 该区间，则表示该字符是一个汉字
        for(int i=0;i<strings.length;i++) {
            if (strings[i].matches(  reg )) {
                count += 2;
            } else {  // 如果是数字、如果是英文、如果是符号
                count += 1;
            }
            if (count <= bytes) {
                System.out.print(strings[i]); //输出结果
            }
        }
        return count ;
    }
}
