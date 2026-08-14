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

public class Reply_setCreateDate_180550636514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7214;
     Object term7405;

    public Reply_setCreateDate_180550636514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7476 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term7475 = ((Class) term7476).getDeclaredField((String) "USER");
        ((Field) term7475).setAccessible(true);
        Object enum15 = ((Field) term7475).get((Object) null);
        Object term7313 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term7313, term7313.getClass(), "id", 1870727665);
        setField(term7313, term7313.getClass(), "content", null);
        setField(term7313, term7313.getClass(), "board", null);
        setField(term7313, term7313.getClass(), "user", null);
        setField(term7313, term7313.getClass(), "createDate", null);
        Object term7315 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term7315, term7315.getClass(), "id", -1070592289);
        setField(term7315, term7315.getClass(), "content", null);
        setField(term7315, term7315.getClass(), "board", null);
        setField(term7315, term7315.getClass(), "user", null);
        setField(term7315, term7315.getClass(), "createDate", null);
        Object term7317 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term7317, term7317.getClass(), "id", 0);
        setField(term7317, term7317.getClass(), "content", null);
        setField(term7317, term7317.getClass(), "board", null);
        setField(term7317, term7317.getClass(), "user", null);
        setField(term7317, term7317.getClass(), "createDate", null);
        Object term7319 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term7319, term7319.getClass(), "id", 0);
        setField(term7319, term7319.getClass(), "content", null);
        setField(term7319, term7319.getClass(), "board", null);
        setField(term7319, term7319.getClass(), "user", null);
        setField(term7319, term7319.getClass(), "createDate", null);
        ArrayList term7311 = new ArrayList();
        ((ArrayList) term7311).add(term7313);
        ((ArrayList) term7311).add(term7315);
        ((ArrayList) term7311).add(term7315);
        ((ArrayList) term7311).add(term7313);
        ((ArrayList) term7311).add(term7317);
        ((ArrayList) term7311).add(term7317);
        ((ArrayList) term7311).add(term7319);
        Class<? extends Object> term7670 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term7669 = ((Class) term7670).getDeclaredField((String) "ADMIN");
        ((Field) term7669).setAccessible(true);
        Object enum16 = ((Field) term7669).get((Object) null);
        term7214 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term7228 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term7255 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term7308 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term7323 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7324 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7328 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7333 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term7392 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term7395 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7396 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7400 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term7214, term7214.getClass(), "id", 1050765721);
        setField(term7214, term7214.getClass(), "content", "mfHtgSbdjD");
        setIntField(term7228, term7228.getClass(), "id", 474518942);
        setField(term7228, term7228.getClass(), "title", "cmuaUiHMVL");
        setField(term7228, term7228.getClass(), "content", "xjoSGPWUgu");
        setIntField(term7228, term7228.getClass(), "count", -1656687479);
        setIntField(term7255, term7255.getClass(), "id", -249614216);
        setField(term7255, term7255.getClass(), "username", "uzmqjnOUXu");
        setField(term7255, term7255.getClass(), "password", "xeyjTOCOJb");
        setField(term7255, term7255.getClass(), "email", "DGRqjjdhzy");
        setField(term7255, term7255.getClass(), "role", enum15);
        setField(term7255, term7255.getClass(), "oauth", "lQFkjJUPAR");
        setIntField(term7308, term7308.getClass(), "nanos", 651000000);
        setLongField(term7308, term7308.getClass(), "fastTime", 1663402967000L);
        setField(term7308, term7308.getClass(), "cdate", null);
        setField(term7255, term7255.getClass(), "createDate", term7308);
        setField(term7228, term7228.getClass(), "user", term7255);
        setField(term7228, term7228.getClass(), "replys", term7311);
        setIntField(term7324, term7324.getClass(), "year", 2016);
        setShortField(term7324, term7324.getClass(), "month", (short) 4);
        setShortField(term7324, term7324.getClass(), "day", (short) 18);
        setField(term7323, term7323.getClass(), "date", term7324);
        setByteField(term7328, term7328.getClass(), "hour", (byte) 15);
        setByteField(term7328, term7328.getClass(), "minute", (byte) 56);
        setByteField(term7328, term7328.getClass(), "second", (byte) 45);
        setIntField(term7328, term7328.getClass(), "nano", 248103350);
        setField(term7323, term7323.getClass(), "time", term7328);
        setField(term7228, term7228.getClass(), "createDate", term7323);
        setField(term7214, term7214.getClass(), "board", term7228);
        setIntField(term7333, term7333.getClass(), "id", -634976996);
        setField(term7333, term7333.getClass(), "username", "XMHwbfiHRl");
        setField(term7333, term7333.getClass(), "password", "bucTnYicnp");
        setField(term7333, term7333.getClass(), "email", "EkgprvqZlM");
        setField(term7333, term7333.getClass(), "role", enum16);
        setField(term7333, term7333.getClass(), "oauth", "fbnKvthhOz");
        setIntField(term7392, term7392.getClass(), "nanos", 343000000);
        setLongField(term7392, term7392.getClass(), "fastTime", 1264027000000L);
        setField(term7392, term7392.getClass(), "cdate", null);
        setField(term7333, term7333.getClass(), "createDate", term7392);
        setField(term7214, term7214.getClass(), "user", term7333);
        setIntField(term7396, term7396.getClass(), "year", 2028);
        setShortField(term7396, term7396.getClass(), "month", (short) 3);
        setShortField(term7396, term7396.getClass(), "day", (short) 25);
        setField(term7395, term7395.getClass(), "date", term7396);
        setByteField(term7400, term7400.getClass(), "hour", (byte) 6);
        setByteField(term7400, term7400.getClass(), "minute", (byte) 9);
        setByteField(term7400, term7400.getClass(), "second", (byte) 35);
        setIntField(term7400, term7400.getClass(), "nano", 744453524);
        setField(term7395, term7395.getClass(), "time", term7400);
        setField(term7214, term7214.getClass(), "createDate", term7395);
        term7405 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7406 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7410 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term7406, term7406.getClass(), "year", 2017);
        setShortField(term7406, term7406.getClass(), "month", (short) 6);
        setShortField(term7406, term7406.getClass(), "day", (short) 28);
        setField(term7405, term7405.getClass(), "date", term7406);
        setByteField(term7410, term7410.getClass(), "hour", (byte) 8);
        setByteField(term7410, term7410.getClass(), "minute", (byte) 1);
        setByteField(term7410, term7410.getClass(), "second", (byte) 14);
        setIntField(term7410, term7410.getClass(), "nano", 501033715);
        setField(term7405, term7405.getClass(), "time", term7410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term7405;
        callMethod(klass, "setCreateDate", argTypes, term7214, args);
    }

};


