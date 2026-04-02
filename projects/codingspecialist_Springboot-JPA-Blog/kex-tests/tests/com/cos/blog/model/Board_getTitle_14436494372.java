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

public class Board_getTitle_14436494372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14266;

    public Board_getTitle_14436494372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14437 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term14436 = ((Class) term14437).getDeclaredField((String) "USER");
        ((Field) term14436).setAccessible(true);
        Object enum32 = ((Field) term14436).get((Object) null);
        Object term14356 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term14359 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term14362 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term14364 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term14356, term14356.getClass(), "id", -1748391876);
        setField(term14356, term14356.getClass(), "content", "");
        setIntField(term14359, term14359.getClass(), "id", 43258317);
        setField(term14359, term14359.getClass(), "title", null);
        setField(term14359, term14359.getClass(), "content", null);
        setIntField(term14359, term14359.getClass(), "count", 1707220033);
        setField(term14359, term14359.getClass(), "user", null);
        setField(term14359, term14359.getClass(), "replys", null);
        setField(term14359, term14359.getClass(), "createDate", null);
        setField(term14356, term14356.getClass(), "board", term14359);
        setIntField(term14362, term14362.getClass(), "id", 510162332);
        setField(term14362, term14362.getClass(), "username", null);
        setField(term14362, term14362.getClass(), "password", null);
        setField(term14362, term14362.getClass(), "email", null);
        setField(term14362, term14362.getClass(), "role", enum32);
        setField(term14362, term14362.getClass(), "oauth", null);
        setField(term14362, term14362.getClass(), "createDate", null);
        setField(term14356, term14356.getClass(), "user", term14362);
        setField(term14364, term14364.getClass(), "date", null);
        setField(term14364, term14364.getClass(), "time", null);
        setField(term14356, term14356.getClass(), "createDate", term14364);
        Object term14365 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term14368 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term14371 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term14373 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term14365, term14365.getClass(), "id", -1455526612);
        setField(term14365, term14365.getClass(), "content", "");
        setIntField(term14368, term14368.getClass(), "id", 0);
        setField(term14368, term14368.getClass(), "title", null);
        setField(term14368, term14368.getClass(), "content", null);
        setIntField(term14368, term14368.getClass(), "count", 0);
        setField(term14368, term14368.getClass(), "user", null);
        setField(term14368, term14368.getClass(), "replys", null);
        setField(term14368, term14368.getClass(), "createDate", null);
        setField(term14365, term14365.getClass(), "board", term14368);
        setIntField(term14371, term14371.getClass(), "id", 0);
        setField(term14371, term14371.getClass(), "username", null);
        setField(term14371, term14371.getClass(), "password", null);
        setField(term14371, term14371.getClass(), "email", null);
        setField(term14371, term14371.getClass(), "role", null);
        setField(term14371, term14371.getClass(), "oauth", null);
        setField(term14371, term14371.getClass(), "createDate", null);
        setField(term14365, term14365.getClass(), "user", term14371);
        setField(term14373, term14373.getClass(), "date", null);
        setField(term14373, term14373.getClass(), "time", null);
        setField(term14365, term14365.getClass(), "createDate", term14373);
        ArrayList term14354 = new ArrayList();
        ((ArrayList) term14354).add(term14356);
        ((ArrayList) term14354).add(term14365);
        term14266 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term14293 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term14351 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term14376 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14377 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14381 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14266, term14266.getClass(), "id", -1941343035);
        setField(term14266, term14266.getClass(), "title", "acPRDlpsid");
        setField(term14266, term14266.getClass(), "content", "YyojIzvxLZ");
        setIntField(term14266, term14266.getClass(), "count", 947897214);
        setIntField(term14293, term14293.getClass(), "id", 1496340209);
        setField(term14293, term14293.getClass(), "username", "fxapaYlZea");
        setField(term14293, term14293.getClass(), "password", "VJgREHwfRM");
        setField(term14293, term14293.getClass(), "email", "kXnpLIZTAr");
        setField(term14293, term14293.getClass(), "role", enum32);
        setField(term14293, term14293.getClass(), "oauth", "ZiMAmqpbzk");
        setIntField(term14351, term14351.getClass(), "nanos", 379000000);
        setLongField(term14351, term14351.getClass(), "fastTime", 1299420278000L);
        setField(term14351, term14351.getClass(), "cdate", null);
        setField(term14293, term14293.getClass(), "createDate", term14351);
        setField(term14266, term14266.getClass(), "user", term14293);
        setField(term14266, term14266.getClass(), "replys", term14354);
        setIntField(term14377, term14377.getClass(), "year", 2018);
        setShortField(term14377, term14377.getClass(), "month", (short) 10);
        setShortField(term14377, term14377.getClass(), "day", (short) 3);
        setField(term14376, term14376.getClass(), "date", term14377);
        setByteField(term14381, term14381.getClass(), "hour", (byte) 12);
        setByteField(term14381, term14381.getClass(), "minute", (byte) 49);
        setByteField(term14381, term14381.getClass(), "second", (byte) 38);
        setIntField(term14381, term14381.getClass(), "nano", 549840711);
        setField(term14376, term14376.getClass(), "time", term14381);
        setField(term14266, term14266.getClass(), "createDate", term14376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term14266, args);
    }

};


