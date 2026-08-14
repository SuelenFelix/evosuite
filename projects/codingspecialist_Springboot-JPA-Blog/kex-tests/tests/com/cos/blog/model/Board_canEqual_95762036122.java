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

public class Board_canEqual_95762036122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20452;
     Object term20580;

    public Board_canEqual_95762036122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20632 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term20631 = ((Class) term20632).getDeclaredField((String) "ADMIN");
        ((Field) term20631).setAccessible(true);
        Object enum48 = ((Field) term20631).get((Object) null);
        Object term20543 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term20546 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term20549 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term20551 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term20543, term20543.getClass(), "id", 65264024);
        setField(term20543, term20543.getClass(), "content", "");
        setIntField(term20546, term20546.getClass(), "id", -252449812);
        setField(term20546, term20546.getClass(), "title", null);
        setField(term20546, term20546.getClass(), "content", null);
        setIntField(term20546, term20546.getClass(), "count", -1885268968);
        setField(term20546, term20546.getClass(), "user", null);
        setField(term20546, term20546.getClass(), "replys", null);
        setField(term20546, term20546.getClass(), "createDate", null);
        setField(term20543, term20543.getClass(), "board", term20546);
        setIntField(term20549, term20549.getClass(), "id", -1592093430);
        setField(term20549, term20549.getClass(), "username", null);
        setField(term20549, term20549.getClass(), "password", null);
        setField(term20549, term20549.getClass(), "email", null);
        setField(term20549, term20549.getClass(), "role", enum48);
        setField(term20549, term20549.getClass(), "oauth", null);
        setField(term20549, term20549.getClass(), "createDate", null);
        setField(term20543, term20543.getClass(), "user", term20549);
        setField(term20551, term20551.getClass(), "date", null);
        setField(term20551, term20551.getClass(), "time", null);
        setField(term20543, term20543.getClass(), "createDate", term20551);
        Object term20552 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term20555 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term20558 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term20560 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term20552, term20552.getClass(), "id", 1822317628);
        setField(term20552, term20552.getClass(), "content", "");
        setIntField(term20555, term20555.getClass(), "id", 0);
        setField(term20555, term20555.getClass(), "title", null);
        setField(term20555, term20555.getClass(), "content", null);
        setIntField(term20555, term20555.getClass(), "count", 0);
        setField(term20555, term20555.getClass(), "user", null);
        setField(term20555, term20555.getClass(), "replys", null);
        setField(term20555, term20555.getClass(), "createDate", null);
        setField(term20552, term20552.getClass(), "board", term20555);
        setIntField(term20558, term20558.getClass(), "id", 0);
        setField(term20558, term20558.getClass(), "username", null);
        setField(term20558, term20558.getClass(), "password", null);
        setField(term20558, term20558.getClass(), "email", null);
        setField(term20558, term20558.getClass(), "role", null);
        setField(term20558, term20558.getClass(), "oauth", null);
        setField(term20558, term20558.getClass(), "createDate", null);
        setField(term20552, term20552.getClass(), "user", term20558);
        setField(term20560, term20560.getClass(), "date", null);
        setField(term20560, term20560.getClass(), "time", null);
        setField(term20552, term20552.getClass(), "createDate", term20560);
        Object term20561 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term20564 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term20567 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term20561, term20561.getClass(), "id", 675891483);
        setField(term20561, term20561.getClass(), "content", "");
        setIntField(term20564, term20564.getClass(), "id", -317900470);
        setField(term20564, term20564.getClass(), "title", null);
        setField(term20564, term20564.getClass(), "content", null);
        setIntField(term20564, term20564.getClass(), "count", -979568);
        setField(term20564, term20564.getClass(), "user", null);
        setField(term20564, term20564.getClass(), "replys", null);
        setField(term20564, term20564.getClass(), "createDate", null);
        setField(term20561, term20561.getClass(), "board", term20564);
        setField(term20561, term20561.getClass(), "user", term20558);
        setField(term20567, term20567.getClass(), "date", null);
        setField(term20567, term20567.getClass(), "time", null);
        setField(term20561, term20561.getClass(), "createDate", term20567);
        ArrayList term20541 = new ArrayList();
        ((ArrayList) term20541).add(term20543);
        ((ArrayList) term20541).add(term20552);
        ((ArrayList) term20541).add(term20552);
        ((ArrayList) term20541).add(term20561);
        term20452 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term20479 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term20538 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term20570 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20571 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20575 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term20452, term20452.getClass(), "id", 1615957955);
        setField(term20452, term20452.getClass(), "title", "VPkEFShMUB");
        setField(term20452, term20452.getClass(), "content", "ZIgHysIFcL");
        setIntField(term20452, term20452.getClass(), "count", 1779370220);
        setIntField(term20479, term20479.getClass(), "id", -1716046610);
        setField(term20479, term20479.getClass(), "username", "ofSfQtWBjp");
        setField(term20479, term20479.getClass(), "password", "vkbIpZOlcY");
        setField(term20479, term20479.getClass(), "email", "XbAeosZekH");
        setField(term20479, term20479.getClass(), "role", enum48);
        setField(term20479, term20479.getClass(), "oauth", "EvGPvjswTz");
        setIntField(term20538, term20538.getClass(), "nanos", 637000000);
        setLongField(term20538, term20538.getClass(), "fastTime", 1667554008000L);
        setField(term20538, term20538.getClass(), "cdate", null);
        setField(term20479, term20479.getClass(), "createDate", term20538);
        setField(term20452, term20452.getClass(), "user", term20479);
        setField(term20452, term20452.getClass(), "replys", term20541);
        setIntField(term20571, term20571.getClass(), "year", 2016);
        setShortField(term20571, term20571.getClass(), "month", (short) 8);
        setShortField(term20571, term20571.getClass(), "day", (short) 27);
        setField(term20570, term20570.getClass(), "date", term20571);
        setByteField(term20575, term20575.getClass(), "hour", (byte) 3);
        setByteField(term20575, term20575.getClass(), "minute", (byte) 10);
        setByteField(term20575, term20575.getClass(), "second", (byte) 27);
        setIntField(term20575, term20575.getClass(), "nano", 429898470);
        setField(term20570, term20570.getClass(), "time", term20575);
        setField(term20452, term20452.getClass(), "createDate", term20570);
        term20580 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20580;
        callMethod(klass, "canEqual", argTypes, term20452, args);
    }

};


