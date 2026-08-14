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

public class PostStatBO_setLikeCount_13469092339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24657;
     Object term24684;

    public PostStatBO_setLikeCount_13469092339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24658 = new Long(7656211287234019484L);
        Long term24660 = new Long(-872579514000598474L);
        Long term24662 = new Long(0L);
        term24657 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term24664 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24665 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24669 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24674 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24675 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24679 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24657, term24657.getClass(), "id", term24658);
        setField(term24657, term24657.getClass(), "postId", term24660);
        setField(term24657, term24657.getClass(), "likeCount", term24662);
        setIntField(term24665, term24665.getClass(), "year", 2024);
        setShortField(term24665, term24665.getClass(), "month", (short) 9);
        setShortField(term24665, term24665.getClass(), "day", (short) 7);
        setField(term24664, term24664.getClass(), "date", term24665);
        setByteField(term24669, term24669.getClass(), "hour", (byte) 2);
        setByteField(term24669, term24669.getClass(), "minute", (byte) 37);
        setByteField(term24669, term24669.getClass(), "second", (byte) 4);
        setIntField(term24669, term24669.getClass(), "nano", 236043949);
        setField(term24664, term24664.getClass(), "time", term24669);
        setField(term24657, term24657.getClass(), "createdAt", term24664);
        setIntField(term24675, term24675.getClass(), "year", 2025);
        setShortField(term24675, term24675.getClass(), "month", (short) 7);
        setShortField(term24675, term24675.getClass(), "day", (short) 4);
        setField(term24674, term24674.getClass(), "date", term24675);
        setByteField(term24679, term24679.getClass(), "hour", (byte) 18);
        setByteField(term24679, term24679.getClass(), "minute", (byte) 13);
        setByteField(term24679, term24679.getClass(), "second", (byte) 37);
        setIntField(term24679, term24679.getClass(), "nano", 681447348);
        setField(term24674, term24674.getClass(), "time", term24679);
        setField(term24657, term24657.getClass(), "updatedAt", term24674);
        term24684 = new Long(5097769785635819744L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term24684;
        callMethod(klass, "setLikeCount", argTypes, term24657, args);
    }

};


