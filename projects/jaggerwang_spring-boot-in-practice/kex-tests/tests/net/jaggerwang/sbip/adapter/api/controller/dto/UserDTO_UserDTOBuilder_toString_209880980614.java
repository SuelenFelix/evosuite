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

public class UserDTO_UserDTOBuilder_toString_209880980614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36374;

    public UserDTO_UserDTOBuilder_toString_209880980614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term36375 = new Long(-1237494311441603673L);
        Long term36425 = new Long(3550928874058758597L);
        Long term36460 = new Long(987797117310260031L);
        Long term36462 = new Long(-4703513086610650698L);
        Class<? extends Object> term36650 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term36649 = ((Class) term36650).getDeclaredField((String) "LOCAL");
        ((Field) term36649).setAccessible(true);
        Object enum70 = ((Field) term36649).get((Object) null);
        Long term36510 = new Long(-8123300791906968552L);
        HashMap term36556 = new HashMap();
        Long term36565 = new Long(7654605795400256601L);
        Long term36567 = new Long(3610800451815944213L);
        Long term36569 = new Long(-3548672426577893003L);
        Long term36571 = new Long(1592020674405941254L);
        Long term36573 = new Long(4098407345651793258L);
        Long term36575 = new Long(3128610259359668233L);
        Boolean term36597 = new Boolean(true);
        term36374 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder"));
        Object term36439 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36440 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36444 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36449 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36450 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36454 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36459 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term36497 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term36524 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36525 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36529 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36534 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36535 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36539 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36564 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term36577 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36578 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36582 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36592 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term36374, term36374.getClass(), "id", term36375);
        setField(term36374, term36374.getClass(), "username", "EgSgEFIyyN");
        setField(term36374, term36374.getClass(), "password", "iAOFcXaLSf");
        setField(term36374, term36374.getClass(), "mobile", "EHoNUaeyvT");
        setField(term36374, term36374.getClass(), "email", "ZwKmasCVIy");
        setField(term36374, term36374.getClass(), "avatarId", term36425);
        setField(term36374, term36374.getClass(), "intro", "pxokrVaeMd");
        setIntField(term36440, term36440.getClass(), "year", 2018);
        setShortField(term36440, term36440.getClass(), "month", (short) 11);
        setShortField(term36440, term36440.getClass(), "day", (short) 23);
        setField(term36439, term36439.getClass(), "date", term36440);
        setByteField(term36444, term36444.getClass(), "hour", (byte) 15);
        setByteField(term36444, term36444.getClass(), "minute", (byte) 21);
        setByteField(term36444, term36444.getClass(), "second", (byte) 39);
        setIntField(term36444, term36444.getClass(), "nano", 255623386);
        setField(term36439, term36439.getClass(), "time", term36444);
        setField(term36374, term36374.getClass(), "createdAt", term36439);
        setIntField(term36450, term36450.getClass(), "year", 2016);
        setShortField(term36450, term36450.getClass(), "month", (short) 11);
        setShortField(term36450, term36450.getClass(), "day", (short) 8);
        setField(term36449, term36449.getClass(), "date", term36450);
        setByteField(term36454, term36454.getClass(), "hour", (byte) 7);
        setByteField(term36454, term36454.getClass(), "minute", (byte) 33);
        setByteField(term36454, term36454.getClass(), "second", (byte) 30);
        setIntField(term36454, term36454.getClass(), "nano", 274725601);
        setField(term36449, term36449.getClass(), "time", term36454);
        setField(term36374, term36374.getClass(), "updatedAt", term36449);
        setField(term36459, term36459.getClass(), "id", term36460);
        setField(term36459, term36459.getClass(), "userId", term36462);
        setField(term36459, term36459.getClass(), "region", enum70);
        setField(term36459, term36459.getClass(), "bucket", "ujxmmZZcbT");
        setField(term36459, term36459.getClass(), "path", "BOvgwHfoHQ");
        setField(term36497, term36497.getClass(), "name", "hPpFNeDBIb");
        setField(term36497, term36497.getClass(), "size", term36510);
        setField(term36497, term36497.getClass(), "type", "DNOtiLPAIY");
        setField(term36459, term36459.getClass(), "meta", term36497);
        setIntField(term36525, term36525.getClass(), "year", 2028);
        setShortField(term36525, term36525.getClass(), "month", (short) 4);
        setShortField(term36525, term36525.getClass(), "day", (short) 19);
        setField(term36524, term36524.getClass(), "date", term36525);
        setByteField(term36529, term36529.getClass(), "hour", (byte) 1);
        setByteField(term36529, term36529.getClass(), "minute", (byte) 47);
        setByteField(term36529, term36529.getClass(), "second", (byte) 52);
        setIntField(term36529, term36529.getClass(), "nano", 666536453);
        setField(term36524, term36524.getClass(), "time", term36529);
        setField(term36459, term36459.getClass(), "createdAt", term36524);
        setIntField(term36535, term36535.getClass(), "year", 2023);
        setShortField(term36535, term36535.getClass(), "month", (short) 12);
        setShortField(term36535, term36535.getClass(), "day", (short) 8);
        setField(term36534, term36534.getClass(), "date", term36535);
        setByteField(term36539, term36539.getClass(), "hour", (byte) 1);
        setByteField(term36539, term36539.getClass(), "minute", (byte) 26);
        setByteField(term36539, term36539.getClass(), "second", (byte) 38);
        setIntField(term36539, term36539.getClass(), "nano", 334721598);
        setField(term36534, term36534.getClass(), "time", term36539);
        setField(term36459, term36459.getClass(), "updatedAt", term36534);
        setField(term36459, term36459.getClass(), "url", "FnEkAHBfyV");
        setField(term36459, term36459.getClass(), "thumbs", term36556);
        setField(term36374, term36374.getClass(), "avatar", term36459);
        setField(term36564, term36564.getClass(), "id", term36565);
        setField(term36564, term36564.getClass(), "userId", term36567);
        setField(term36564, term36564.getClass(), "postCount", term36569);
        setField(term36564, term36564.getClass(), "likeCount", term36571);
        setField(term36564, term36564.getClass(), "followingCount", term36573);
        setField(term36564, term36564.getClass(), "followerCount", term36575);
        setIntField(term36578, term36578.getClass(), "year", 2015);
        setShortField(term36578, term36578.getClass(), "month", (short) 5);
        setShortField(term36578, term36578.getClass(), "day", (short) 26);
        setField(term36577, term36577.getClass(), "date", term36578);
        setByteField(term36582, term36582.getClass(), "hour", (byte) 9);
        setByteField(term36582, term36582.getClass(), "minute", (byte) 34);
        setByteField(term36582, term36582.getClass(), "second", (byte) 10);
        setIntField(term36582, term36582.getClass(), "nano", 873043034);
        setField(term36577, term36577.getClass(), "time", term36582);
        setField(term36564, term36564.getClass(), "createdAt", term36577);
        setIntField(term36588, term36588.getClass(), "year", 2021);
        setShortField(term36588, term36588.getClass(), "month", (short) 11);
        setShortField(term36588, term36588.getClass(), "day", (short) 13);
        setField(term36587, term36587.getClass(), "date", term36588);
        setByteField(term36592, term36592.getClass(), "hour", (byte) 7);
        setByteField(term36592, term36592.getClass(), "minute", (byte) 27);
        setByteField(term36592, term36592.getClass(), "second", (byte) 1);
        setIntField(term36592, term36592.getClass(), "nano", 59611302);
        setField(term36587, term36587.getClass(), "time", term36592);
        setField(term36564, term36564.getClass(), "updatedAt", term36587);
        setField(term36374, term36374.getClass(), "stat", term36564);
        setField(term36374, term36374.getClass(), "following", term36597);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term36374, args);
    }

};


