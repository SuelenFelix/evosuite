package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class User2VO_equals_171086067631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29506;
     Object term29720;

    public User2VO_equals_171086067631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29507 = new Integer(2634669);
        Integer term29581 = new Integer(-1912429941);
        Class<? extends Object> term29802 = Class.forName((String) "java.io.File$PathStatus");
        Field term29801 = ((Class) term29802).getDeclaredField((String) "CHECKED");
        ((Field) term29801).setAccessible(true);
        Object enum31 = ((Field) term29801).get((Object) null);
        ArrayList term29668 = new ArrayList();
        ((ArrayList) term29668).add("VPJfuXpuzc");
        ((ArrayList) term29668).add("zdrDwRmBqL");
        ((ArrayList) term29668).add("DhSRNlYOFL");
        ((ArrayList) term29668).add("mrmNORhOYE");
        term29506 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term29595 = newInstance(Class.forName("java.io.File"));
        setField(term29506, term29506.getClass(), "id", term29507);
        setField(term29506, term29506.getClass(), "email", "lvQpEwdZeM");
        setField(term29506, term29506.getClass(), "password", "xtNmObxmHy");
        setField(term29506, term29506.getClass(), "username", "nComTwhtzu");
        setField(term29506, term29506.getClass(), "power", "gXyUtfRzMt");
        setField(term29506, term29506.getClass(), "nickname", "RUmloTNkOF");
        setField(term29506, term29506.getClass(), "sex", "xlEdrgoOEf");
        setField(term29506, term29506.getClass(), "age", term29581);
        setField(term29506, term29506.getClass(), "phone", "DfKLAuTNTf");
        setField(term29595, term29595.getClass(), "path", "lWuRJaTZQB");
        setField(term29595, term29595.getClass(), "status", enum31);
        setIntField(term29595, term29595.getClass(), "prefixLength", -1179120542);
        setField(term29595, term29595.getClass(), "filePath", null);
        setField(term29506, term29506.getClass(), "facePic", term29595);
        setField(term29506, term29506.getClass(), "faceUrl", "jiQYzmbdOz");
        setField(term29506, term29506.getClass(), "headUrl", "HBnovMFfRR");
        setField(term29506, term29506.getClass(), "introduce", "kvBRGWtVMY");
        setField(term29506, term29506.getClass(), "ip", "nnkddhphsi");
        setField(term29506, term29506.getClass(), "partnames", term29668);
        term29720 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29720;
        callMethod(klass, "equals", argTypes, term29506, args);
    }

};


