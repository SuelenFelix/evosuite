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

public class Reply_canEqual_140689331716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8194;
     Object term8383;

    public Reply_canEqual_140689331716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8445 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term8444 = ((Class) term8445).getDeclaredField((String) "USER");
        ((Field) term8444).setAccessible(true);
        Object enum18 = ((Field) term8444).get((Object) null);
        Object term8293 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term8293, term8293.getClass(), "id", 1741500243);
        setField(term8293, term8293.getClass(), "content", null);
        setField(term8293, term8293.getClass(), "board", null);
        setField(term8293, term8293.getClass(), "user", null);
        setField(term8293, term8293.getClass(), "createDate", null);
        Object term8295 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term8295, term8295.getClass(), "id", 0);
        setField(term8295, term8295.getClass(), "content", null);
        setField(term8295, term8295.getClass(), "board", null);
        setField(term8295, term8295.getClass(), "user", null);
        setField(term8295, term8295.getClass(), "createDate", null);
        Object term8297 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term8297, term8297.getClass(), "id", 0);
        setField(term8297, term8297.getClass(), "content", null);
        setField(term8297, term8297.getClass(), "board", null);
        setField(term8297, term8297.getClass(), "user", null);
        setField(term8297, term8297.getClass(), "createDate", null);
        ArrayList term8291 = new ArrayList();
        ((ArrayList) term8291).add(term8293);
        ((ArrayList) term8291).add(term8295);
        ((ArrayList) term8291).add(term8297);
        ((ArrayList) term8291).add(term8297);
        Class<? extends Object> term8639 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term8638 = ((Class) term8639).getDeclaredField((String) "ADMIN");
        ((Field) term8638).setAccessible(true);
        Object enum19 = ((Field) term8638).get((Object) null);
        term8194 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term8208 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term8235 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term8288 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term8301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8306 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8311 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term8370 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term8373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8378 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term8194, term8194.getClass(), "id", -1422859977);
        setField(term8194, term8194.getClass(), "content", "DPwIqlszZo");
        setIntField(term8208, term8208.getClass(), "id", -1972436591);
        setField(term8208, term8208.getClass(), "title", "mNgDshwZNc");
        setField(term8208, term8208.getClass(), "content", "pDqgDbJoFw");
        setIntField(term8208, term8208.getClass(), "count", 68922753);
        setIntField(term8235, term8235.getClass(), "id", -220791533);
        setField(term8235, term8235.getClass(), "username", "iVOvTzOxwt");
        setField(term8235, term8235.getClass(), "password", "BjZQdecXvB");
        setField(term8235, term8235.getClass(), "email", "iUkOOQhEkw");
        setField(term8235, term8235.getClass(), "role", enum18);
        setField(term8235, term8235.getClass(), "oauth", "wmVoFoUVmU");
        setIntField(term8288, term8288.getClass(), "nanos", 309000000);
        setLongField(term8288, term8288.getClass(), "fastTime", 1589735951000L);
        setField(term8288, term8288.getClass(), "cdate", null);
        setField(term8235, term8235.getClass(), "createDate", term8288);
        setField(term8208, term8208.getClass(), "user", term8235);
        setField(term8208, term8208.getClass(), "replys", term8291);
        setIntField(term8302, term8302.getClass(), "year", 2021);
        setShortField(term8302, term8302.getClass(), "month", (short) 8);
        setShortField(term8302, term8302.getClass(), "day", (short) 23);
        setField(term8301, term8301.getClass(), "date", term8302);
        setByteField(term8306, term8306.getClass(), "hour", (byte) 15);
        setByteField(term8306, term8306.getClass(), "minute", (byte) 43);
        setByteField(term8306, term8306.getClass(), "second", (byte) 10);
        setIntField(term8306, term8306.getClass(), "nano", 893504165);
        setField(term8301, term8301.getClass(), "time", term8306);
        setField(term8208, term8208.getClass(), "createDate", term8301);
        setField(term8194, term8194.getClass(), "board", term8208);
        setIntField(term8311, term8311.getClass(), "id", 1272542218);
        setField(term8311, term8311.getClass(), "username", "bIrtpkYJWT");
        setField(term8311, term8311.getClass(), "password", "VuLLXpvPpZ");
        setField(term8311, term8311.getClass(), "email", "UEdzEKEEEV");
        setField(term8311, term8311.getClass(), "role", enum19);
        setField(term8311, term8311.getClass(), "oauth", "BcENaQFYSd");
        setIntField(term8370, term8370.getClass(), "nanos", 58000000);
        setLongField(term8370, term8370.getClass(), "fastTime", 1335378452000L);
        setField(term8370, term8370.getClass(), "cdate", null);
        setField(term8311, term8311.getClass(), "createDate", term8370);
        setField(term8194, term8194.getClass(), "user", term8311);
        setIntField(term8374, term8374.getClass(), "year", 2015);
        setShortField(term8374, term8374.getClass(), "month", (short) 2);
        setShortField(term8374, term8374.getClass(), "day", (short) 1);
        setField(term8373, term8373.getClass(), "date", term8374);
        setByteField(term8378, term8378.getClass(), "hour", (byte) 11);
        setByteField(term8378, term8378.getClass(), "minute", (byte) 31);
        setByteField(term8378, term8378.getClass(), "second", (byte) 24);
        setIntField(term8378, term8378.getClass(), "nano", 461437823);
        setField(term8373, term8373.getClass(), "time", term8378);
        setField(term8194, term8194.getClass(), "createDate", term8373);
        term8383 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8383;
        callMethod(klass, "canEqual", argTypes, term8194, args);
    }

};


