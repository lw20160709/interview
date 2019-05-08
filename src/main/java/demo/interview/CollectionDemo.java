package demo.interview;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * &lt;一句话功能简述&gt; &lt;功能详细描述&gt;
 *
 * @author 刘伟
 * @version [版本号, 2019年 04月 28 日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 **/
public class CollectionDemo
{
    public static void main(String[] args)
    {
        
        /**
         * ArrayList 源码解读
         * 1、初始大小为10
         * 2、扩容算法 int newCapacity = oldCapacity + (oldCapacity >> 1);
         * 3、若发生扩容，则做数组拷贝
         * 4、fail-fast机制：多线程修改同一个Collection时，iterator中会抛出
         * ConcurrentModificationException，解决办法：采用concurrent包中的copOnWriteArrayList
         */
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1");
        for (int i = 2; i < 15; i++)
        {
            arrayList.add(String.valueOf(i));
        }
        arrayList.add("15");
        arrayList.add("16");


        /**
         * LinkedList
         * 1、双向链表
         */


        /**
         * HashMap
         * 1、初始容量为16，初始扩容阈值为16*0.75=12
         * 2、达到阈值后，扩容 容量*2，阈值*2
         * 3、hash单链表、红黑树转换阈值为8
         */
        HashMap<String,String> map = new HashMap<String, String>();
        for(int i=1;i<12;i++){
            map.put(String.valueOf(i),"liuwei");
        }
        map.put(String.valueOf("12"),"liuwei");
        map.put(String.valueOf("13"),"liuwei");
        map.put(String.valueOf("14"),"liuwei");
        map.put(String.valueOf("15"),"liuwei");
        map.put(String.valueOf("16"),"liuwei");
        map.put(String.valueOf("17"),"liuwei");

    }
}
