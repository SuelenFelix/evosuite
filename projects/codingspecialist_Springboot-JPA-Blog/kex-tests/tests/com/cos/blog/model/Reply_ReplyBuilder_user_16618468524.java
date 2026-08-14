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

public class Reply_ReplyBuilder_user_16618468524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43536;
     Object term43720;

    public Reply_ReplyBuilder_user_16618468524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43834 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term43833 = ((Class) term43834).getDeclaredField((String) "USER");
        ((Field) term43833).setAccessible(true);
        Object enum90 = ((Field) term43833).get((Object) null);
        Object term43635 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term43635, term43635.getClass(), "id", 138122227);
        setField(term43635, term43635.getClass(), "content", null);
        setField(term43635, term43635.getClass(), "board", null);
        setField(term43635, term43635.getClass(), "user", null);
        setField(term43635, term43635.getClass(), "createDate", null);
        ArrayList term43633 = new ArrayList();
        ((ArrayList) term43633).add(term43635);
        Class<? extends Object> term44028 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term44027 = ((Class) term44028).getDeclaredField((String) "USER");
        ((Field) term44027).setAccessible(true);
        Object enum91 = ((Field) term44027).get((Object) null);
        term43536 = newInstance(Class.forName("com.cos.blog.model.Reply$ReplyBuilder"));
        Object term43550 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term43577 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term43630 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term43639 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43640 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43644 = newInstance(Class.forName("java.time.LocalTime"));
        Object term43649 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term43707 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term43710 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43711 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43715 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term43536, term43536.getClass(), "id", 501801161);
        setField(term43536, term43536.getClass(), "content", "kRYwILGOiG");
        setIntField(term43550, term43550.getClass(), "id", 2103971768);
        setField(term43550, term43550.getClass(), "title", "lGzUITCYwf");
        setField(term43550, term43550.getClass(), "content", "OOTylmfCYh");
        setIntField(term43550, term43550.getClass(), "count", -939132796);
        setIntField(term43577, term43577.getClass(), "id", 159279866);
        setField(term43577, term43577.getClass(), "username", "tDqwvIixso");
        setField(term43577, term43577.getClass(), "password", "liEYQdFeWW");
        setField(term43577, term43577.getClass(), "email", "ADqXMyhBwX");
        setField(term43577, term43577.getClass(), "role", enum90);
        setField(term43577, term43577.getClass(), "oauth", "bxkUNyUzCb");
        setIntField(term43630, term43630.getClass(), "nanos", 438000000);
        setLongField(term43630, term43630.getClass(), "fastTime", 1782892833000L);
        setField(term43630, term43630.getClass(), "cdate", null);
        setField(term43577, term43577.getClass(), "createDate", term43630);
        setField(term43550, term43550.getClass(), "user", term43577);
        setField(term43550, term43550.getClass(), "replys", term43633);
        setIntField(term43640, term43640.getClass(), "year", 2022);
        setShortField(term43640, term43640.getClass(), "month", (short) 4);
        setShortField(term43640, term43640.getClass(), "day", (short) 10);
        setField(term43639, term43639.getClass(), "date", term43640);
        setByteField(term43644, term43644.getClass(), "hour", (byte) 5);
        setByteField(term43644, term43644.getClass(), "minute", (byte) 55);
        setByteField(term43644, term43644.getClass(), "second", (byte) 27);
        setIntField(term43644, term43644.getClass(), "nano", 974485423);
        setField(term43639, term43639.getClass(), "time", term43644);
        setField(term43550, term43550.getClass(), "createDate", term43639);
        setField(term43536, term43536.getClass(), "board", term43550);
        setIntField(term43649, term43649.getClass(), "id", 1422430512);
        setField(term43649, term43649.getClass(), "username", "qXysRdBrsg");
        setField(term43649, term43649.getClass(), "password", "hbtKoWkZLU");
        setField(term43649, term43649.getClass(), "email", "VCWjXeMQGX");
        setField(term43649, term43649.getClass(), "role", enum91);
        setField(term43649, term43649.getClass(), "oauth", "KzrkBfSzqK");
        setIntField(term43707, term43707.getClass(), "nanos", 260000000);
        setLongField(term43707, term43707.getClass(), "fastTime", 1851591644000L);
        setField(term43707, term43707.getClass(), "cdate", null);
        setField(term43649, term43649.getClass(), "createDate", term43707);
        setField(term43536, term43536.getClass(), "user", term43649);
        setIntField(term43711, term43711.getClass(), "year", 2026);
        setShortField(term43711, term43711.getClass(), "month", (short) 11);
        setShortField(term43711, term43711.getClass(), "day", (short) 25);
        setField(term43710, term43710.getClass(), "date", term43711);
        setByteField(term43715, term43715.getClass(), "hour", (byte) 12);
        setByteField(term43715, term43715.getClass(), "minute", (byte) 39);
        setByteField(term43715, term43715.getClass(), "second", (byte) 8);
        setIntField(term43715, term43715.getClass(), "nano", 444272669);
        setField(term43710, term43710.getClass(), "time", term43715);
        setField(term43536, term43536.getClass(), "createDate", term43710);
        term43720 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term43770 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term43720, term43720.getClass(), "id", 1796581482);
        setField(term43720, term43720.getClass(), "username", "cFNqeNRwhB");
        setField(term43720, term43720.getClass(), "password", "TQJASDuFUN");
        setField(term43720, term43720.getClass(), "email", "mOILNTkENv");
        setField(term43720, term43720.getClass(), "role", enum91);
        setField(term43720, term43720.getClass(), "oauth", "xgjvpKAqFv");
        setIntField(term43770, term43770.getClass(), "nanos", 882000000);
        setLongField(term43770, term43770.getClass(), "fastTime", 1380463404000L);
        setField(term43770, term43770.getClass(), "cdate", null);
        setField(term43720, term43720.getClass(), "createDate", term43770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply$ReplyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.User");
        Object[] args = new Object[1];
        args[0] = term43720;
        callMethod(klass, "user", argTypes, term43536, args);
    }

};


