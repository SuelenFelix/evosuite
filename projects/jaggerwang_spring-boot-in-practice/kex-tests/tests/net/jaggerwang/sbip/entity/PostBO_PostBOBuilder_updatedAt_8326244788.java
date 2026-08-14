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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PostBO_PostBOBuilder_updatedAt_8326244788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23594;
     Object term23648;

    public PostBO_PostBOBuilder_updatedAt_8326244788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23595 = new Long(-4146453776626172590L);
        Long term23597 = new Long(-5876259280451647338L);
        Class<? extends Object> term23659 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term23658 = ((Class) term23659).getDeclaredField((String) "VIDEO");
        ((Field) term23658).setAccessible(true);
        Object enum67 = ((Field) term23658).get((Object) null);
        Long term23622 = new Long(-4562564710769146498L);
        ArrayList term23620 = new ArrayList();
        ((ArrayList) term23620).add(term23622);
        Long term23626 = new Long(-6254265799185295775L);
        term23594 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder"));
        Object term23628 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23629 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23633 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23638 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23639 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23643 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23594, term23594.getClass(), "id", term23595);
        setField(term23594, term23594.getClass(), "userId", term23597);
        setField(term23594, term23594.getClass(), "type", enum67);
        setField(term23594, term23594.getClass(), "text", "RMsXuyzKJV");
        setField(term23594, term23594.getClass(), "imageIds", term23620);
        setField(term23594, term23594.getClass(), "videoId", term23626);
        setIntField(term23629, term23629.getClass(), "year", 2011);
        setShortField(term23629, term23629.getClass(), "month", (short) 4);
        setShortField(term23629, term23629.getClass(), "day", (short) 18);
        setField(term23628, term23628.getClass(), "date", term23629);
        setByteField(term23633, term23633.getClass(), "hour", (byte) 15);
        setByteField(term23633, term23633.getClass(), "minute", (byte) 35);
        setByteField(term23633, term23633.getClass(), "second", (byte) 7);
        setIntField(term23633, term23633.getClass(), "nano", 925983040);
        setField(term23628, term23628.getClass(), "time", term23633);
        setField(term23594, term23594.getClass(), "createdAt", term23628);
        setIntField(term23639, term23639.getClass(), "year", 2023);
        setShortField(term23639, term23639.getClass(), "month", (short) 5);
        setShortField(term23639, term23639.getClass(), "day", (short) 19);
        setField(term23638, term23638.getClass(), "date", term23639);
        setByteField(term23643, term23643.getClass(), "hour", (byte) 20);
        setByteField(term23643, term23643.getClass(), "minute", (byte) 50);
        setByteField(term23643, term23643.getClass(), "second", (byte) 49);
        setIntField(term23643, term23643.getClass(), "nano", 806710892);
        setField(term23638, term23638.getClass(), "time", term23643);
        setField(term23594, term23594.getClass(), "updatedAt", term23638);
        term23648 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23649 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23653 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term23649, term23649.getClass(), "year", 2022);
        setShortField(term23649, term23649.getClass(), "month", (short) 8);
        setShortField(term23649, term23649.getClass(), "day", (short) 3);
        setField(term23648, term23648.getClass(), "date", term23649);
        setByteField(term23653, term23653.getClass(), "hour", (byte) 18);
        setByteField(term23653, term23653.getClass(), "minute", (byte) 3);
        setByteField(term23653, term23653.getClass(), "second", (byte) 33);
        setIntField(term23653, term23653.getClass(), "nano", 770583920);
        setField(term23648, term23648.getClass(), "time", term23653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term23648;
        callMethod(klass, "updatedAt", argTypes, term23594, args);
    }

};


