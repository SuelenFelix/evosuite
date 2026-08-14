package com.cos.blog.model;

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
import static com.cos.blog.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Integer;

public class Board_setCount_85765219914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17436;
     Object term17556;

    public Board_setCount_85765219914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17609 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term17608 = ((Class) term17609).getDeclaredField((String) "USER");
        ((Field) term17608).setAccessible(true);
        Object enum41 = ((Field) term17608).get((Object) null);
        Object term17526 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term17529 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term17532 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term17534 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term17526, term17526.getClass(), "id", -124088550);
        setField(term17526, term17526.getClass(), "content", "");
        setIntField(term17529, term17529.getClass(), "id", 777492093);
        setField(term17529, term17529.getClass(), "title", null);
        setField(term17529, term17529.getClass(), "content", null);
        setIntField(term17529, term17529.getClass(), "count", 1414025609);
        setField(term17529, term17529.getClass(), "user", null);
        setField(term17529, term17529.getClass(), "replys", null);
        setField(term17529, term17529.getClass(), "createDate", null);
        setField(term17526, term17526.getClass(), "board", term17529);
        setIntField(term17532, term17532.getClass(), "id", 0);
        setField(term17532, term17532.getClass(), "username", null);
        setField(term17532, term17532.getClass(), "password", null);
        setField(term17532, term17532.getClass(), "email", null);
        setField(term17532, term17532.getClass(), "role", null);
        setField(term17532, term17532.getClass(), "oauth", null);
        setField(term17532, term17532.getClass(), "createDate", null);
        setField(term17526, term17526.getClass(), "user", term17532);
        setField(term17534, term17534.getClass(), "date", null);
        setField(term17534, term17534.getClass(), "time", null);
        setField(term17526, term17526.getClass(), "createDate", term17534);
        Object term17535 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term17538 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term17541 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term17543 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term17535, term17535.getClass(), "id", -246967963);
        setField(term17535, term17535.getClass(), "content", "");
        setIntField(term17538, term17538.getClass(), "id", 0);
        setField(term17538, term17538.getClass(), "title", null);
        setField(term17538, term17538.getClass(), "content", null);
        setIntField(term17538, term17538.getClass(), "count", 0);
        setField(term17538, term17538.getClass(), "user", null);
        setField(term17538, term17538.getClass(), "replys", null);
        setField(term17538, term17538.getClass(), "createDate", null);
        setField(term17535, term17535.getClass(), "board", term17538);
        setIntField(term17541, term17541.getClass(), "id", 0);
        setField(term17541, term17541.getClass(), "username", null);
        setField(term17541, term17541.getClass(), "password", null);
        setField(term17541, term17541.getClass(), "email", null);
        setField(term17541, term17541.getClass(), "role", null);
        setField(term17541, term17541.getClass(), "oauth", null);
        setField(term17541, term17541.getClass(), "createDate", null);
        setField(term17535, term17535.getClass(), "user", term17541);
        setField(term17543, term17543.getClass(), "date", null);
        setField(term17543, term17543.getClass(), "time", null);
        setField(term17535, term17535.getClass(), "createDate", term17543);
        ArrayList term17524 = new ArrayList();
        ((ArrayList) term17524).add(term17526);
        ((ArrayList) term17524).add(term17535);
        term17436 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term17463 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term17521 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term17546 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17547 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17551 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term17436, term17436.getClass(), "id", 1163761623);
        setField(term17436, term17436.getClass(), "title", "IoefPqGtaj");
        setField(term17436, term17436.getClass(), "content", "YMmtjELJuB");
        setIntField(term17436, term17436.getClass(), "count", 718742281);
        setIntField(term17463, term17463.getClass(), "id", 1532723756);
        setField(term17463, term17463.getClass(), "username", "FzyIShiOmb");
        setField(term17463, term17463.getClass(), "password", "PEUfeJaZTk");
        setField(term17463, term17463.getClass(), "email", "AIvyeIdskz");
        setField(term17463, term17463.getClass(), "role", enum41);
        setField(term17463, term17463.getClass(), "oauth", "iSQqMWMRlU");
        setIntField(term17521, term17521.getClass(), "nanos", 965000000);
        setLongField(term17521, term17521.getClass(), "fastTime", 1707075231000L);
        setField(term17521, term17521.getClass(), "cdate", null);
        setField(term17463, term17463.getClass(), "createDate", term17521);
        setField(term17436, term17436.getClass(), "user", term17463);
        setField(term17436, term17436.getClass(), "replys", term17524);
        setIntField(term17547, term17547.getClass(), "year", 2016);
        setShortField(term17547, term17547.getClass(), "month", (short) 5);
        setShortField(term17547, term17547.getClass(), "day", (short) 9);
        setField(term17546, term17546.getClass(), "date", term17547);
        setByteField(term17551, term17551.getClass(), "hour", (byte) 1);
        setByteField(term17551, term17551.getClass(), "minute", (byte) 20);
        setByteField(term17551, term17551.getClass(), "second", (byte) 56);
        setIntField(term17551, term17551.getClass(), "nano", 198437232);
        setField(term17546, term17546.getClass(), "time", term17551);
        setField(term17436, term17436.getClass(), "createDate", term17546);
        term17556 = new Integer(-1777140369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17556;
        callMethod(klass, "setCount", argTypes, term17436, args);
    }

};


