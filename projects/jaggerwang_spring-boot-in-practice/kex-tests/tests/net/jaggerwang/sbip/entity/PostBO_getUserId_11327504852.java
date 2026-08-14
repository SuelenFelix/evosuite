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

public class PostBO_getUserId_11327504852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13598;

    public PostBO_getUserId_11327504852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13599 = new Long(3752337209837437327L);
        Long term13601 = new Long(1860789353508856614L);
        Class<? extends Object> term13657 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term13656 = ((Class) term13657).getDeclaredField((String) "VIDEO");
        ((Field) term13656).setAccessible(true);
        Object enum34 = ((Field) term13656).get((Object) null);
        Long term13626 = new Long(-7456852906235966771L);
        Long term13628 = new Long(-67485388932970712L);
        Long term13630 = new Long(5806367330808555223L);
        ArrayList term13624 = new ArrayList();
        ((ArrayList) term13624).add(term13626);
        ((ArrayList) term13624).add(term13628);
        ((ArrayList) term13624).add(term13630);
        Long term13634 = new Long(4576699120365923235L);
        term13598 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term13636 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13637 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13641 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13646 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13647 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13651 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13598, term13598.getClass(), "id", term13599);
        setField(term13598, term13598.getClass(), "userId", term13601);
        setField(term13598, term13598.getClass(), "type", enum34);
        setField(term13598, term13598.getClass(), "text", "HWkpTmtlrc");
        setField(term13598, term13598.getClass(), "imageIds", term13624);
        setField(term13598, term13598.getClass(), "videoId", term13634);
        setIntField(term13637, term13637.getClass(), "year", 2020);
        setShortField(term13637, term13637.getClass(), "month", (short) 10);
        setShortField(term13637, term13637.getClass(), "day", (short) 8);
        setField(term13636, term13636.getClass(), "date", term13637);
        setByteField(term13641, term13641.getClass(), "hour", (byte) 15);
        setByteField(term13641, term13641.getClass(), "minute", (byte) 57);
        setByteField(term13641, term13641.getClass(), "second", (byte) 17);
        setIntField(term13641, term13641.getClass(), "nano", 288139529);
        setField(term13636, term13636.getClass(), "time", term13641);
        setField(term13598, term13598.getClass(), "createdAt", term13636);
        setIntField(term13647, term13647.getClass(), "year", 2022);
        setShortField(term13647, term13647.getClass(), "month", (short) 6);
        setShortField(term13647, term13647.getClass(), "day", (short) 12);
        setField(term13646, term13646.getClass(), "date", term13647);
        setByteField(term13651, term13651.getClass(), "hour", (byte) 14);
        setByteField(term13651, term13651.getClass(), "minute", (byte) 3);
        setByteField(term13651, term13651.getClass(), "second", (byte) 7);
        setIntField(term13651, term13651.getClass(), "nano", 637592645);
        setField(term13646, term13646.getClass(), "time", term13651);
        setField(term13598, term13598.getClass(), "updatedAt", term13646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term13598, args);
    }

};


