package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserBO_UserBOBuilder_mobile_4737836784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28626;

    public UserBO_UserBOBuilder_mobile_4737836784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28627 = new Long(4947643967691976731L);
        Long term28677 = new Long(4548576710115075073L);
        term28626 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder"));
        Object term28691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28696 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28701 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28702 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28706 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28626, term28626.getClass(), "id", term28627);
        setField(term28626, term28626.getClass(), "username", "IHqvyhMtuM");
        setField(term28626, term28626.getClass(), "password", "dAldIGYAXV");
        setField(term28626, term28626.getClass(), "mobile", "mLwibAPEsa");
        setField(term28626, term28626.getClass(), "email", "zsWKWiTFuo");
        setField(term28626, term28626.getClass(), "avatarId", term28677);
        setField(term28626, term28626.getClass(), "intro", "UPUbwyHQKN");
        setIntField(term28692, term28692.getClass(), "year", 2016);
        setShortField(term28692, term28692.getClass(), "month", (short) 10);
        setShortField(term28692, term28692.getClass(), "day", (short) 12);
        setField(term28691, term28691.getClass(), "date", term28692);
        setByteField(term28696, term28696.getClass(), "hour", (byte) 11);
        setByteField(term28696, term28696.getClass(), "minute", (byte) 25);
        setByteField(term28696, term28696.getClass(), "second", (byte) 37);
        setIntField(term28696, term28696.getClass(), "nano", 215113477);
        setField(term28691, term28691.getClass(), "time", term28696);
        setField(term28626, term28626.getClass(), "createdAt", term28691);
        setIntField(term28702, term28702.getClass(), "year", 2012);
        setShortField(term28702, term28702.getClass(), "month", (short) 12);
        setShortField(term28702, term28702.getClass(), "day", (short) 10);
        setField(term28701, term28701.getClass(), "date", term28702);
        setByteField(term28706, term28706.getClass(), "hour", (byte) 6);
        setByteField(term28706, term28706.getClass(), "minute", (byte) 26);
        setByteField(term28706, term28706.getClass(), "second", (byte) 38);
        setIntField(term28706, term28706.getClass(), "nano", 934336730);
        setField(term28701, term28701.getClass(), "time", term28706);
        setField(term28626, term28626.getClass(), "updatedAt", term28701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lgQkrXANyI";
        callMethod(klass, "mobile", argTypes, term28626, args);
    }

};


