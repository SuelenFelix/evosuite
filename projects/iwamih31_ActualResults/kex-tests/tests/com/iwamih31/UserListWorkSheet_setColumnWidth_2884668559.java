package com.iwamih31;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UserListWorkSheet_setColumnWidth_2884668559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29842;
     Object term30864;

    public UserListWorkSheet_setColumnWidth_2884668559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29842 = newInstance(Class.forName("com.iwamih31.UserListWorkSheet"));
        Object[] term30173 = (Object[]) newArray("java.lang.String", 8);
        Object[] term30206 = (Object[]) newArray("java.lang.String", 8);
        Object[] term30239 = (Object[]) newArray("java.lang.String", 8);
        Object[] term30272 = (Object[]) newArray("java.lang.String", 8);
        Object[] term30305 = (Object[]) newArray("java.lang.String", 8);
        Object[] term30338 = (Object[]) newArray("java.lang.String", 8);
        Object[] term30371 = (Object[]) newArray("java.lang.String", 8);
        Object[] term30404 = (Object[]) newArray("java.lang.String", 8);
        Object[] term30437 = (Object[]) newArray("java.lang.String", 8);
        Object[] term30470 = (Object[]) newArray("java.lang.String", 8);
        int[] term30515 = (int[]) newIntArray(5);
        Object[] term30521 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 5);
        Object[] term30522 = (Object[]) newArray("java.lang.String", 8);
        Object[] term30619 = (Object[]) newArray("java.lang.String", 3);
        Object[] term30656 = (Object[]) newArray("java.lang.String", 6);
        Object[] term30729 = (Object[]) newArray("java.lang.String", 8);
        Object[] term30826 = (Object[]) newArray("java.lang.String", 3);
        setElement(term30173, 0, "  ");
        setElement(term30173, 1, "  ");
        setElement(term30173, 2, "  ");
        setElement(term30173, 3, "  ");
        setElement(term30173, 4, "  ");
        setElement(term30173, 5, "  ");
        setElement(term30173, 6, "  ");
        setElement(term30173, 7, "  ");
        setField(term29842, term29842.getClass(), "row_1_Border", term30173);
        setElement(term30206, 0, "  ");
        setElement(term30206, 1, "  ");
        setElement(term30206, 2, "  ");
        setElement(term30206, 3, "  ");
        setElement(term30206, 4, "  ");
        setElement(term30206, 5, "  ");
        setElement(term30206, 6, "  ");
        setElement(term30206, 7, "  ");
        setField(term29842, term29842.getClass(), "row_1_Align_", term30206);
        setElement(term30239, 0, "  ");
        setElement(term30239, 1, "  ");
        setElement(term30239, 2, "  ");
        setElement(term30239, 3, "  ");
        setElement(term30239, 4, "  ");
        setElement(term30239, 5, "  ");
        setElement(term30239, 6, "  ");
        setElement(term30239, 7, "  ");
        setField(term29842, term29842.getClass(), "row_2_Border", term30239);
        setElement(term30272, 0, "  ");
        setElement(term30272, 1, "  ");
        setElement(term30272, 2, "  ");
        setElement(term30272, 3, "  ");
        setElement(term30272, 4, "  ");
        setElement(term30272, 5, "  ");
        setElement(term30272, 6, "  ");
        setElement(term30272, 7, "  ");
        setField(term29842, term29842.getClass(), "row_2_Align_", term30272);
        setElement(term30305, 0, "  ");
        setElement(term30305, 1, "  ");
        setElement(term30305, 2, "  ");
        setElement(term30305, 3, "  ");
        setElement(term30305, 4, "  ");
        setElement(term30305, 5, "  ");
        setElement(term30305, 6, "  ");
        setElement(term30305, 7, "  ");
        setField(term29842, term29842.getClass(), "row_3_Border", term30305);
        setElement(term30338, 0, "  ");
        setElement(term30338, 1, "  ");
        setElement(term30338, 2, "  ");
        setElement(term30338, 3, "  ");
        setElement(term30338, 4, "  ");
        setElement(term30338, 5, "  ");
        setElement(term30338, 6, "  ");
        setElement(term30338, 7, "  ");
        setField(term29842, term29842.getClass(), "row_3_Align_", term30338);
        setElement(term30371, 0, "  ");
        setElement(term30371, 1, "  ");
        setElement(term30371, 2, "  ");
        setElement(term30371, 3, "  ");
        setElement(term30371, 4, "  ");
        setElement(term30371, 5, "  ");
        setElement(term30371, 6, "  ");
        setElement(term30371, 7, "  ");
        setField(term29842, term29842.getClass(), "label_Border", term30371);
        setElement(term30404, 0, "  ");
        setElement(term30404, 1, "  ");
        setElement(term30404, 2, "  ");
        setElement(term30404, 3, "  ");
        setElement(term30404, 4, "  ");
        setElement(term30404, 5, "  ");
        setElement(term30404, 6, "  ");
        setElement(term30404, 7, "  ");
        setField(term29842, term29842.getClass(), "label_Align_", term30404);
        setElement(term30437, 0, "  ");
        setElement(term30437, 1, "  ");
        setElement(term30437, 2, "  ");
        setElement(term30437, 3, "  ");
        setElement(term30437, 4, "  ");
        setElement(term30437, 5, "  ");
        setElement(term30437, 6, "  ");
        setElement(term30437, 7, "  ");
        setField(term29842, term29842.getClass(), "data__Border", term30437);
        setElement(term30470, 0, "  ");
        setElement(term30470, 1, "  ");
        setElement(term30470, 2, "  ");
        setElement(term30470, 3, "  ");
        setElement(term30470, 4, "  ");
        setElement(term30470, 5, "  ");
        setElement(term30470, 6, "  ");
        setElement(term30470, 7, "  ");
        setField(term29842, term29842.getClass(), "data__Align_", term30470);
        setField(term29842, term29842.getClass(), "sheet_Name", "LnNRVsjmxw");
        setIntElement(term30515, 0, -1845499264);
        setIntElement(term30515, 1, -505439934);
        setIntElement(term30515, 2, -344842608);
        setIntElement(term30515, 3, 941650513);
        setIntElement(term30515, 4, 444029505);
        setField(term29842, term29842.getClass(), "column_Width", term30515);
        setElement(term30522, 0, "PlOnDkNrvX");
        setElement(term30522, 1, "MltgFGldop");
        setElement(term30522, 2, "JCWSoxnBJs");
        setElement(term30522, 3, "vAxcpvjEEa");
        setElement(term30522, 4, "FCkOgIBqXE");
        setElement(term30522, 5, "kadRHthQRD");
        setElement(term30522, 6, "cGbJSRSpNn");
        setElement(term30522, 7, "MzXzaqaiHW");
        setElement(term30521, 0, term30522);
        setElement(term30619, 0, "jWOWtrhVkA");
        setElement(term30619, 1, "IyOhWYyaDV");
        setElement(term30619, 2, "omWrkCSFzy");
        setElement(term30521, 1, term30619);
        setElement(term30656, 0, "VFYvUTgYFB");
        setElement(term30656, 1, "BrWqhEIUUj");
        setElement(term30656, 2, "WfUmxdiHcU");
        setElement(term30656, 3, "BRrftvRvmF");
        setElement(term30656, 4, "fvoyRbZTsm");
        setElement(term30656, 5, "iOCnOQXWTl");
        setElement(term30521, 2, term30656);
        setElement(term30729, 0, "ARnOWpgtAg");
        setElement(term30729, 1, "MRrYxZoJBW");
        setElement(term30729, 2, "fheZXFNQZh");
        setElement(term30729, 3, "YxHVWlebna");
        setElement(term30729, 4, "IEmAQCkrPE");
        setElement(term30729, 5, "lqFGhtlNRM");
        setElement(term30729, 6, "GLxLHUsuLw");
        setElement(term30729, 7, "HuKdqrrxIm");
        setElement(term30521, 3, term30729);
        setElement(term30826, 0, "yJKKddLqMb");
        setElement(term30826, 1, "LWEYaXeKBe");
        setElement(term30826, 2, "cNoFvpHBHw");
        setElement(term30521, 4, term30826);
        setField(term29842, term29842.getClass(), "value_Data", term30521);
        setBooleanField(term29842, term29842.getClass(), "printSetup", true);
        term30864 = (int[]) newIntArray(1);
        setIntElement(term30864, 0, -1034506028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.UserListWorkSheet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term30864;
        callMethod(klass, "setColumn_Width", argTypes, term29842, args);
    }

};


