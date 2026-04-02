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

public class Board_toString_80598863322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20183;

    public Board_toString_80598863322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20379 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term20378 = ((Class) term20379).getDeclaredField((String) "USER");
        ((Field) term20378).setAccessible(true);
        Object enum49 = ((Field) term20378).get((Object) null);
        Object term20273 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term20276 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term20279 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term20281 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term20273, term20273.getClass(), "id", 1430066560);
        setField(term20273, term20273.getClass(), "content", "");
        setIntField(term20276, term20276.getClass(), "id", 836734074);
        setField(term20276, term20276.getClass(), "title", null);
        setField(term20276, term20276.getClass(), "content", null);
        setIntField(term20276, term20276.getClass(), "count", -1747711865);
        setField(term20276, term20276.getClass(), "user", null);
        setField(term20276, term20276.getClass(), "replys", null);
        setField(term20276, term20276.getClass(), "createDate", null);
        setField(term20273, term20273.getClass(), "board", term20276);
        setIntField(term20279, term20279.getClass(), "id", -232333014);
        setField(term20279, term20279.getClass(), "username", null);
        setField(term20279, term20279.getClass(), "password", null);
        setField(term20279, term20279.getClass(), "email", null);
        setField(term20279, term20279.getClass(), "role", null);
        setField(term20279, term20279.getClass(), "oauth", null);
        setField(term20279, term20279.getClass(), "createDate", null);
        setField(term20273, term20273.getClass(), "user", term20279);
        setField(term20281, term20281.getClass(), "date", null);
        setField(term20281, term20281.getClass(), "time", null);
        setField(term20273, term20273.getClass(), "createDate", term20281);
        Object term20282 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term20285 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term20288 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term20290 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term20282, term20282.getClass(), "id", -383508597);
        setField(term20282, term20282.getClass(), "content", "");
        setIntField(term20285, term20285.getClass(), "id", 0);
        setField(term20285, term20285.getClass(), "title", null);
        setField(term20285, term20285.getClass(), "content", null);
        setIntField(term20285, term20285.getClass(), "count", 0);
        setField(term20285, term20285.getClass(), "user", null);
        setField(term20285, term20285.getClass(), "replys", null);
        setField(term20285, term20285.getClass(), "createDate", null);
        setField(term20282, term20282.getClass(), "board", term20285);
        setIntField(term20288, term20288.getClass(), "id", 0);
        setField(term20288, term20288.getClass(), "username", null);
        setField(term20288, term20288.getClass(), "password", null);
        setField(term20288, term20288.getClass(), "email", null);
        setField(term20288, term20288.getClass(), "role", null);
        setField(term20288, term20288.getClass(), "oauth", null);
        setField(term20288, term20288.getClass(), "createDate", null);
        setField(term20282, term20282.getClass(), "user", term20288);
        setField(term20290, term20290.getClass(), "date", null);
        setField(term20290, term20290.getClass(), "time", null);
        setField(term20282, term20282.getClass(), "createDate", term20290);
        Object term20291 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term20294 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term20297 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term20299 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term20291, term20291.getClass(), "id", 225873732);
        setField(term20291, term20291.getClass(), "content", "");
        setIntField(term20294, term20294.getClass(), "id", 529879356);
        setField(term20294, term20294.getClass(), "title", null);
        setField(term20294, term20294.getClass(), "content", null);
        setIntField(term20294, term20294.getClass(), "count", 18072182);
        setField(term20294, term20294.getClass(), "user", null);
        setField(term20294, term20294.getClass(), "replys", null);
        setField(term20294, term20294.getClass(), "createDate", null);
        setField(term20291, term20291.getClass(), "board", term20294);
        setIntField(term20297, term20297.getClass(), "id", 904607217);
        setField(term20297, term20297.getClass(), "username", null);
        setField(term20297, term20297.getClass(), "password", null);
        setField(term20297, term20297.getClass(), "email", null);
        setField(term20297, term20297.getClass(), "role", enum49);
        setField(term20297, term20297.getClass(), "oauth", null);
        setField(term20297, term20297.getClass(), "createDate", null);
        setField(term20291, term20291.getClass(), "user", term20297);
        setField(term20299, term20299.getClass(), "date", null);
        setField(term20299, term20299.getClass(), "time", null);
        setField(term20291, term20291.getClass(), "createDate", term20299);
        Object term20300 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term20303 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term20306 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term20308 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term20300, term20300.getClass(), "id", -1092883950);
        setField(term20300, term20300.getClass(), "content", "");
        setIntField(term20303, term20303.getClass(), "id", 950385621);
        setField(term20303, term20303.getClass(), "title", null);
        setField(term20303, term20303.getClass(), "content", null);
        setIntField(term20303, term20303.getClass(), "count", -232352320);
        setField(term20303, term20303.getClass(), "user", term20279);
        setField(term20303, term20303.getClass(), "replys", null);
        setField(term20303, term20303.getClass(), "createDate", null);
        setField(term20300, term20300.getClass(), "board", term20303);
        setIntField(term20306, term20306.getClass(), "id", 0);
        setField(term20306, term20306.getClass(), "username", null);
        setField(term20306, term20306.getClass(), "password", null);
        setField(term20306, term20306.getClass(), "email", null);
        setField(term20306, term20306.getClass(), "role", null);
        setField(term20306, term20306.getClass(), "oauth", null);
        setField(term20306, term20306.getClass(), "createDate", null);
        setField(term20300, term20300.getClass(), "user", term20306);
        setField(term20308, term20308.getClass(), "date", null);
        setField(term20308, term20308.getClass(), "time", null);
        setField(term20300, term20300.getClass(), "createDate", term20308);
        Object term20309 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term20312 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term20315 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term20309, term20309.getClass(), "id", -819372164);
        setField(term20309, term20309.getClass(), "content", "");
        setIntField(term20312, term20312.getClass(), "id", 0);
        setField(term20312, term20312.getClass(), "title", null);
        setField(term20312, term20312.getClass(), "content", null);
        setIntField(term20312, term20312.getClass(), "count", 0);
        setField(term20312, term20312.getClass(), "user", null);
        setField(term20312, term20312.getClass(), "replys", null);
        setField(term20312, term20312.getClass(), "createDate", null);
        setField(term20309, term20309.getClass(), "board", term20312);
        setField(term20309, term20309.getClass(), "user", term20306);
        setField(term20315, term20315.getClass(), "date", null);
        setField(term20315, term20315.getClass(), "time", null);
        setField(term20309, term20309.getClass(), "createDate", term20315);
        ArrayList term20271 = new ArrayList();
        ((ArrayList) term20271).add(term20273);
        ((ArrayList) term20271).add(term20282);
        ((ArrayList) term20271).add(term20291);
        ((ArrayList) term20271).add(term20300);
        ((ArrayList) term20271).add(term20309);
        term20183 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term20210 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term20268 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term20318 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20319 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20323 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term20183, term20183.getClass(), "id", -1421649118);
        setField(term20183, term20183.getClass(), "title", "fpyUFzdCwQ");
        setField(term20183, term20183.getClass(), "content", "OQqBkSGDem");
        setIntField(term20183, term20183.getClass(), "count", -511248284);
        setIntField(term20210, term20210.getClass(), "id", 788630042);
        setField(term20210, term20210.getClass(), "username", "vZzZOvsIYn");
        setField(term20210, term20210.getClass(), "password", "pAIBwhAbDu");
        setField(term20210, term20210.getClass(), "email", "iqhNUjVbRG");
        setField(term20210, term20210.getClass(), "role", enum49);
        setField(term20210, term20210.getClass(), "oauth", "SSqIrPwJXd");
        setIntField(term20268, term20268.getClass(), "nanos", 454000000);
        setLongField(term20268, term20268.getClass(), "fastTime", 1387743261000L);
        setField(term20268, term20268.getClass(), "cdate", null);
        setField(term20210, term20210.getClass(), "createDate", term20268);
        setField(term20183, term20183.getClass(), "user", term20210);
        setField(term20183, term20183.getClass(), "replys", term20271);
        setIntField(term20319, term20319.getClass(), "year", 2028);
        setShortField(term20319, term20319.getClass(), "month", (short) 6);
        setShortField(term20319, term20319.getClass(), "day", (short) 11);
        setField(term20318, term20318.getClass(), "date", term20319);
        setByteField(term20323, term20323.getClass(), "hour", (byte) 15);
        setByteField(term20323, term20323.getClass(), "minute", (byte) 2);
        setByteField(term20323, term20323.getClass(), "second", (byte) 44);
        setIntField(term20323, term20323.getClass(), "nano", 463103620);
        setField(term20318, term20318.getClass(), "time", term20323);
        setField(term20183, term20183.getClass(), "createDate", term20318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term20183, args);
    }

};


