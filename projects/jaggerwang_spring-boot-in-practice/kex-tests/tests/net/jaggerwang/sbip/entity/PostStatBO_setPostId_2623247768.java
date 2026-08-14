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

public class PostStatBO_setPostId_2623247768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24628;
     Object term24655;

    public PostStatBO_setPostId_2623247768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24629 = new Long(8640463098965331396L);
        Long term24631 = new Long(-4136906775323730350L);
        Long term24633 = new Long(0L);
        term24628 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term24635 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24636 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24640 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24645 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24646 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24650 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24628, term24628.getClass(), "id", term24629);
        setField(term24628, term24628.getClass(), "postId", term24631);
        setField(term24628, term24628.getClass(), "likeCount", term24633);
        setIntField(term24636, term24636.getClass(), "year", 2018);
        setShortField(term24636, term24636.getClass(), "month", (short) 2);
        setShortField(term24636, term24636.getClass(), "day", (short) 4);
        setField(term24635, term24635.getClass(), "date", term24636);
        setByteField(term24640, term24640.getClass(), "hour", (byte) 5);
        setByteField(term24640, term24640.getClass(), "minute", (byte) 35);
        setByteField(term24640, term24640.getClass(), "second", (byte) 40);
        setIntField(term24640, term24640.getClass(), "nano", 354661894);
        setField(term24635, term24635.getClass(), "time", term24640);
        setField(term24628, term24628.getClass(), "createdAt", term24635);
        setIntField(term24646, term24646.getClass(), "year", 2010);
        setShortField(term24646, term24646.getClass(), "month", (short) 3);
        setShortField(term24646, term24646.getClass(), "day", (short) 23);
        setField(term24645, term24645.getClass(), "date", term24646);
        setByteField(term24650, term24650.getClass(), "hour", (byte) 17);
        setByteField(term24650, term24650.getClass(), "minute", (byte) 32);
        setByteField(term24650, term24650.getClass(), "second", (byte) 36);
        setIntField(term24650, term24650.getClass(), "nano", 470582535);
        setField(term24645, term24645.getClass(), "time", term24650);
        setField(term24628, term24628.getClass(), "updatedAt", term24645);
        term24655 = new Long(6381166215871562039L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term24655;
        callMethod(klass, "setPostId", argTypes, term24628, args);
    }

};


