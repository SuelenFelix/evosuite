package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Post_hashCode_143775005022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10680;

    public Post_hashCode_143775005022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10681 = new Long(-7709317346333670618L);
        Long term10683 = new Long(-1964501434345816975L);
        Class<? extends Object> term10736 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term10735 = ((Class) term10736).getDeclaredField((String) "TEXT");
        ((Field) term10735).setAccessible(true);
        Object enum32 = ((Field) term10735).get((Object) null);
        Long term10707 = new Long(4689907154423223972L);
        Long term10709 = new Long(8512025621149521819L);
        ArrayList term10705 = new ArrayList();
        ((ArrayList) term10705).add(term10707);
        ((ArrayList) term10705).add(term10709);
        Long term10713 = new Long(2022482096970820459L);
        term10680 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term10715 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10716 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10720 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10725 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10726 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10730 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10680, term10680.getClass(), "id", term10681);
        setField(term10680, term10680.getClass(), "userId", term10683);
        setField(term10680, term10680.getClass(), "type", enum32);
        setField(term10680, term10680.getClass(), "text", "kBdSllIBVz");
        setField(term10680, term10680.getClass(), "imageIds", term10705);
        setField(term10680, term10680.getClass(), "videoId", term10713);
        setIntField(term10716, term10716.getClass(), "year", 2017);
        setShortField(term10716, term10716.getClass(), "month", (short) 6);
        setShortField(term10716, term10716.getClass(), "day", (short) 28);
        setField(term10715, term10715.getClass(), "date", term10716);
        setByteField(term10720, term10720.getClass(), "hour", (byte) 8);
        setByteField(term10720, term10720.getClass(), "minute", (byte) 1);
        setByteField(term10720, term10720.getClass(), "second", (byte) 14);
        setIntField(term10720, term10720.getClass(), "nano", 501033715);
        setField(term10715, term10715.getClass(), "time", term10720);
        setField(term10680, term10680.getClass(), "createdAt", term10715);
        setIntField(term10726, term10726.getClass(), "year", 2016);
        setShortField(term10726, term10726.getClass(), "month", (short) 10);
        setShortField(term10726, term10726.getClass(), "day", (short) 10);
        setField(term10725, term10725.getClass(), "date", term10726);
        setByteField(term10730, term10730.getClass(), "hour", (byte) 16);
        setByteField(term10730, term10730.getClass(), "minute", (byte) 7);
        setByteField(term10730, term10730.getClass(), "second", (byte) 16);
        setIntField(term10730, term10730.getClass(), "nano", 995200309);
        setField(term10725, term10725.getClass(), "time", term10730);
        setField(term10680, term10680.getClass(), "updatedAt", term10725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term10680, args);
    }

};


