package com.yq;

// 接口不能实例化(new)
    /*
          但可以有以下形式：
         1.new  接口(){
                    重写接口中的方法()
          }

         2.new 接口[N];

     */

// 考察核心：对数组的理解
    /*
            数组的分类：
                1.基本类型数组
                { 基本类型的具体值,1,2,3,4,5 }
                2.引用类型数组
                {  所引用对象的堆地址, 0xABC123 ,0x11EEBB,0xDCCS123  }
     */
interface  InterfaceA{
}

public class Test05 {
    //  {  对象的地址0, 对象的地址1  }
    InterfaceA []a = new InterfaceA[2];


}
