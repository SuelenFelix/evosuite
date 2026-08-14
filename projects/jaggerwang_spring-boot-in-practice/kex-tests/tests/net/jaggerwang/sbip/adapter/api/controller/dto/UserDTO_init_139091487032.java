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

public class UserDTO_init_139091487032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16328;
     Object term16378;
     Object term16392;
     Object term16402;
     Object term16412;
     Object term16520;
     Object term16553;

    public UserDTO_init_139091487032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16328 = new Long(-5871746020807491998L);
        term16378 = new Long(4742108233936970770L);
        term16392 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16393 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16397 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term16393, term16393.getClass(), "year", 2022);
        setShortField(term16393, term16393.getClass(), "month", (short) 5);
        setShortField(term16393, term16393.getClass(), "day", (short) 29);
        setField(term16392, term16392.getClass(), "date", term16393);
        setByteField(term16397, term16397.getClass(), "hour", (byte) 11);
        setByteField(term16397, term16397.getClass(), "minute", (byte) 41);
        setByteField(term16397, term16397.getClass(), "second", (byte) 43);
        setIntField(term16397, term16397.getClass(), "nano", 984890757);
        setField(term16392, term16392.getClass(), "time", term16397);
        term16402 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16403 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16407 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term16403, term16403.getClass(), "year", 2029);
        setShortField(term16403, term16403.getClass(), "month", (short) 4);
        setShortField(term16403, term16403.getClass(), "day", (short) 27);
        setField(term16402, term16402.getClass(), "date", term16403);
        setByteField(term16407, term16407.getClass(), "hour", (byte) 16);
        setByteField(term16407, term16407.getClass(), "minute", (byte) 25);
        setByteField(term16407, term16407.getClass(), "second", (byte) 10);
        setIntField(term16407, term16407.getClass(), "nano", 699018782);
        setField(term16402, term16402.getClass(), "time", term16407);
        Long term16413 = new Long(2722004046017350471L);
        Long term16415 = new Long(6636235983121346803L);
        Class<? extends Object> term16606 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term16605 = ((Class) term16606).getDeclaredField((String) "LOCAL");
        ((Field) term16605).setAccessible(true);
        Object enum29 = ((Field) term16605).get((Object) null);
        Long term16463 = new Long(146749226579788091L);
        HashMap term16509 = new HashMap();
        term16412 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term16450 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term16477 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16478 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16482 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16488 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16492 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16412, term16412.getClass(), "id", term16413);
        setField(term16412, term16412.getClass(), "userId", term16415);
        setField(term16412, term16412.getClass(), "region", enum29);
        setField(term16412, term16412.getClass(), "bucket", "fzeqPnzpnt");
        setField(term16412, term16412.getClass(), "path", "RxbhrFBjkO");
        setField(term16450, term16450.getClass(), "name", "aanyiAOJCl");
        setField(term16450, term16450.getClass(), "size", term16463);
        setField(term16450, term16450.getClass(), "type", "VDokbsCuqq");
        setField(term16412, term16412.getClass(), "meta", term16450);
        setIntField(term16478, term16478.getClass(), "year", 2023);
        setShortField(term16478, term16478.getClass(), "month", (short) 12);
        setShortField(term16478, term16478.getClass(), "day", (short) 12);
        setField(term16477, term16477.getClass(), "date", term16478);
        setByteField(term16482, term16482.getClass(), "hour", (byte) 0);
        setByteField(term16482, term16482.getClass(), "minute", (byte) 12);
        setByteField(term16482, term16482.getClass(), "second", (byte) 38);
        setIntField(term16482, term16482.getClass(), "nano", 430999236);
        setField(term16477, term16477.getClass(), "time", term16482);
        setField(term16412, term16412.getClass(), "createdAt", term16477);
        setIntField(term16488, term16488.getClass(), "year", 2018);
        setShortField(term16488, term16488.getClass(), "month", (short) 6);
        setShortField(term16488, term16488.getClass(), "day", (short) 17);
        setField(term16487, term16487.getClass(), "date", term16488);
        setByteField(term16492, term16492.getClass(), "hour", (byte) 1);
        setByteField(term16492, term16492.getClass(), "minute", (byte) 3);
        setByteField(term16492, term16492.getClass(), "second", (byte) 5);
        setIntField(term16492, term16492.getClass(), "nano", 914834044);
        setField(term16487, term16487.getClass(), "time", term16492);
        setField(term16412, term16412.getClass(), "updatedAt", term16487);
        setField(term16412, term16412.getClass(), "url", "xClUIcPECX");
        setField(term16412, term16412.getClass(), "thumbs", term16509);
        Long term16521 = new Long(-1279670138064751276L);
        Long term16523 = new Long(-7205236974351118210L);
        Long term16525 = new Long(-2136893352275781569L);
        Long term16527 = new Long(-9147545274054597570L);
        Long term16529 = new Long(-8398381579707958144L);
        Long term16531 = new Long(-2195061939206930224L);
        term16520 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term16533 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16534 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16538 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16543 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16544 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16548 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16520, term16520.getClass(), "id", term16521);
        setField(term16520, term16520.getClass(), "userId", term16523);
        setField(term16520, term16520.getClass(), "postCount", term16525);
        setField(term16520, term16520.getClass(), "likeCount", term16527);
        setField(term16520, term16520.getClass(), "followingCount", term16529);
        setField(term16520, term16520.getClass(), "followerCount", term16531);
        setIntField(term16534, term16534.getClass(), "year", 2021);
        setShortField(term16534, term16534.getClass(), "month", (short) 5);
        setShortField(term16534, term16534.getClass(), "day", (short) 6);
        setField(term16533, term16533.getClass(), "date", term16534);
        setByteField(term16538, term16538.getClass(), "hour", (byte) 21);
        setByteField(term16538, term16538.getClass(), "minute", (byte) 10);
        setByteField(term16538, term16538.getClass(), "second", (byte) 43);
        setIntField(term16538, term16538.getClass(), "nano", 123313014);
        setField(term16533, term16533.getClass(), "time", term16538);
        setField(term16520, term16520.getClass(), "createdAt", term16533);
        setIntField(term16544, term16544.getClass(), "year", 2011);
        setShortField(term16544, term16544.getClass(), "month", (short) 6);
        setShortField(term16544, term16544.getClass(), "day", (short) 21);
        setField(term16543, term16543.getClass(), "date", term16544);
        setByteField(term16548, term16548.getClass(), "hour", (byte) 3);
        setByteField(term16548, term16548.getClass(), "minute", (byte) 19);
        setByteField(term16548, term16548.getClass(), "second", (byte) 41);
        setIntField(term16548, term16548.getClass(), "nano", 920537748);
        setField(term16543, term16543.getClass(), "time", term16548);
        setField(term16520, term16520.getClass(), "updatedAt", term16543);
        term16553 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[12];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.Long");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        argTypes[8] = Class.forName("java.time.LocalDateTime");
        argTypes[9] = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        argTypes[10] = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        argTypes[11] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[12];
        args[0] = term16328;
        args[1] = "GPSEWEDSTo";
        args[2] = "RCOqfVsRHt";
        args[3] = "TSyCeEZPaT";
        args[4] = "JeZFtaqkzW";
        args[5] = term16378;
        args[6] = "vOVuNSCCLe";
        args[7] = term16392;
        args[8] = term16402;
        args[9] = term16412;
        args[10] = term16520;
        args[11] = term16553;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


