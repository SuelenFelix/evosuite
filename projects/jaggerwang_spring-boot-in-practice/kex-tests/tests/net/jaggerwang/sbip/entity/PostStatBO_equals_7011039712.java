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

public class PostStatBO_equals_7011039712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24760;
     Object term24787;

    public PostStatBO_equals_7011039712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24761 = new Long(-6656996002079682356L);
        Long term24763 = new Long(2166921473521388808L);
        Long term24765 = new Long(0L);
        term24760 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term24767 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24768 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24772 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24777 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24778 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24782 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24760, term24760.getClass(), "id", term24761);
        setField(term24760, term24760.getClass(), "postId", term24763);
        setField(term24760, term24760.getClass(), "likeCount", term24765);
        setIntField(term24768, term24768.getClass(), "year", 2025);
        setShortField(term24768, term24768.getClass(), "month", (short) 2);
        setShortField(term24768, term24768.getClass(), "day", (short) 23);
        setField(term24767, term24767.getClass(), "date", term24768);
        setByteField(term24772, term24772.getClass(), "hour", (byte) 16);
        setByteField(term24772, term24772.getClass(), "minute", (byte) 39);
        setByteField(term24772, term24772.getClass(), "second", (byte) 42);
        setIntField(term24772, term24772.getClass(), "nano", 342777686);
        setField(term24767, term24767.getClass(), "time", term24772);
        setField(term24760, term24760.getClass(), "createdAt", term24767);
        setIntField(term24778, term24778.getClass(), "year", 2029);
        setShortField(term24778, term24778.getClass(), "month", (short) 8);
        setShortField(term24778, term24778.getClass(), "day", (short) 14);
        setField(term24777, term24777.getClass(), "date", term24778);
        setByteField(term24782, term24782.getClass(), "hour", (byte) 10);
        setByteField(term24782, term24782.getClass(), "minute", (byte) 28);
        setByteField(term24782, term24782.getClass(), "second", (byte) 23);
        setIntField(term24782, term24782.getClass(), "nano", 676524979);
        setField(term24777, term24777.getClass(), "time", term24782);
        setField(term24760, term24760.getClass(), "updatedAt", term24777);
        term24787 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24787;
        callMethod(klass, "equals", argTypes, term24760, args);
    }

};


