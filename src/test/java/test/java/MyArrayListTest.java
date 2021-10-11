package test.java;

import com.company.MyArrayList;
import com.company.MyList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayListTest {

    MyList<String> list;
    int listSize;

    @Before
    public void setUp() {
        list = new MyArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        listSize = 3;
    }

    @Test
    public void testSize() {
//        Assert.assertArrayEquals(listSize, list.size());
    }
}
