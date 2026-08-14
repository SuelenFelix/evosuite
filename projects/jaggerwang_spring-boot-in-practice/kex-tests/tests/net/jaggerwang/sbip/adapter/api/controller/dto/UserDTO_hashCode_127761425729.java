package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.lang.Boolean;

public class UserDTO_hashCode_127761425729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15234;

    public UserDTO_hashCode_127761425729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15235 = new Long(-6609679920238945303L);
        Long term15285 = new Long(-7296330380944173376L);
        Long term15320 = new Long(-8890284990655172580L);
        Long term15322 = new Long(-5951743062322506095L);
        Class<? extends Object> term15510 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term15509 = ((Class) term15510).getDeclaredField((String) "LOCAL");
        ((Field) term15509).setAccessible(true);
        Object enum27 = ((Field) term15509).get((Object) null);
        Long term15370 = new Long(768144790810175653L);
        HashMap term15416 = new HashMap();
        Long term15425 = new Long(-1497280900081695731L);
        Long term15427 = new Long(-3602825674339018793L);
        Long term15429 = new Long(3086974592680165932L);
        Long term15431 = new Long(-532956263280568707L);
        Long term15433 = new Long(6073193746616629086L);
        Long term15435 = new Long(-2463629530824341661L);
        Boolean term15457 = new Boolean(true);
        term15234 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term15299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15304 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15314 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15319 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term15357 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term15384 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15385 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15389 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15394 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15395 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15399 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15424 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term15437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15442 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15447 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15448 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15452 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term15234, term15234.getClass(), "id", term15235);
        setField(term15234, term15234.getClass(), "username", "GEJABPlHSI");
        setField(term15234, term15234.getClass(), "password", "aQFUvuaYxd");
        setField(term15234, term15234.getClass(), "mobile", "zNFLXMifnS");
        setField(term15234, term15234.getClass(), "email", "HHQcYMSBVc");
        setField(term15234, term15234.getClass(), "avatarId", term15285);
        setField(term15234, term15234.getClass(), "intro", "wdoqITnaAP");
        setIntField(term15300, term15300.getClass(), "year", 2020);
        setShortField(term15300, term15300.getClass(), "month", (short) 2);
        setShortField(term15300, term15300.getClass(), "day", (short) 1);
        setField(term15299, term15299.getClass(), "date", term15300);
        setByteField(term15304, term15304.getClass(), "hour", (byte) 0);
        setByteField(term15304, term15304.getClass(), "minute", (byte) 46);
        setByteField(term15304, term15304.getClass(), "second", (byte) 1);
        setIntField(term15304, term15304.getClass(), "nano", 544722812);
        setField(term15299, term15299.getClass(), "time", term15304);
        setField(term15234, term15234.getClass(), "createdAt", term15299);
        setIntField(term15310, term15310.getClass(), "year", 2027);
        setShortField(term15310, term15310.getClass(), "month", (short) 8);
        setShortField(term15310, term15310.getClass(), "day", (short) 16);
        setField(term15309, term15309.getClass(), "date", term15310);
        setByteField(term15314, term15314.getClass(), "hour", (byte) 15);
        setByteField(term15314, term15314.getClass(), "minute", (byte) 1);
        setByteField(term15314, term15314.getClass(), "second", (byte) 18);
        setIntField(term15314, term15314.getClass(), "nano", 245350825);
        setField(term15309, term15309.getClass(), "time", term15314);
        setField(term15234, term15234.getClass(), "updatedAt", term15309);
        setField(term15319, term15319.getClass(), "id", term15320);
        setField(term15319, term15319.getClass(), "userId", term15322);
        setField(term15319, term15319.getClass(), "region", enum27);
        setField(term15319, term15319.getClass(), "bucket", "rIPMBcrNqB");
        setField(term15319, term15319.getClass(), "path", "UDaboHZHhz");
        setField(term15357, term15357.getClass(), "name", "nRvKihUSPj");
        setField(term15357, term15357.getClass(), "size", term15370);
        setField(term15357, term15357.getClass(), "type", "BbNeQJpYPr");
        setField(term15319, term15319.getClass(), "meta", term15357);
        setIntField(term15385, term15385.getClass(), "year", 2026);
        setShortField(term15385, term15385.getClass(), "month", (short) 7);
        setShortField(term15385, term15385.getClass(), "day", (short) 4);
        setField(term15384, term15384.getClass(), "date", term15385);
        setByteField(term15389, term15389.getClass(), "hour", (byte) 8);
        setByteField(term15389, term15389.getClass(), "minute", (byte) 51);
        setByteField(term15389, term15389.getClass(), "second", (byte) 9);
        setIntField(term15389, term15389.getClass(), "nano", 936880887);
        setField(term15384, term15384.getClass(), "time", term15389);
        setField(term15319, term15319.getClass(), "createdAt", term15384);
        setIntField(term15395, term15395.getClass(), "year", 2022);
        setShortField(term15395, term15395.getClass(), "month", (short) 5);
        setShortField(term15395, term15395.getClass(), "day", (short) 26);
        setField(term15394, term15394.getClass(), "date", term15395);
        setByteField(term15399, term15399.getClass(), "hour", (byte) 6);
        setByteField(term15399, term15399.getClass(), "minute", (byte) 54);
        setByteField(term15399, term15399.getClass(), "second", (byte) 49);
        setIntField(term15399, term15399.getClass(), "nano", 822216068);
        setField(term15394, term15394.getClass(), "time", term15399);
        setField(term15319, term15319.getClass(), "updatedAt", term15394);
        setField(term15319, term15319.getClass(), "url", "riMtzCoxNj");
        setField(term15319, term15319.getClass(), "thumbs", term15416);
        setField(term15234, term15234.getClass(), "avatar", term15319);
        setField(term15424, term15424.getClass(), "id", term15425);
        setField(term15424, term15424.getClass(), "userId", term15427);
        setField(term15424, term15424.getClass(), "postCount", term15429);
        setField(term15424, term15424.getClass(), "likeCount", term15431);
        setField(term15424, term15424.getClass(), "followingCount", term15433);
        setField(term15424, term15424.getClass(), "followerCount", term15435);
        setIntField(term15438, term15438.getClass(), "year", 2022);
        setShortField(term15438, term15438.getClass(), "month", (short) 12);
        setShortField(term15438, term15438.getClass(), "day", (short) 19);
        setField(term15437, term15437.getClass(), "date", term15438);
        setByteField(term15442, term15442.getClass(), "hour", (byte) 11);
        setByteField(term15442, term15442.getClass(), "minute", (byte) 25);
        setByteField(term15442, term15442.getClass(), "second", (byte) 6);
        setIntField(term15442, term15442.getClass(), "nano", 620469872);
        setField(term15437, term15437.getClass(), "time", term15442);
        setField(term15424, term15424.getClass(), "createdAt", term15437);
        setIntField(term15448, term15448.getClass(), "year", 2013);
        setShortField(term15448, term15448.getClass(), "month", (short) 5);
        setShortField(term15448, term15448.getClass(), "day", (short) 3);
        setField(term15447, term15447.getClass(), "date", term15448);
        setByteField(term15452, term15452.getClass(), "hour", (byte) 18);
        setByteField(term15452, term15452.getClass(), "minute", (byte) 52);
        setByteField(term15452, term15452.getClass(), "second", (byte) 15);
        setIntField(term15452, term15452.getClass(), "nano", 241685081);
        setField(term15447, term15447.getClass(), "time", term15452);
        setField(term15424, term15424.getClass(), "updatedAt", term15447);
        setField(term15234, term15234.getClass(), "stat", term15424);
        setField(term15234, term15234.getClass(), "following", term15457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term15234, args);
    }

};


