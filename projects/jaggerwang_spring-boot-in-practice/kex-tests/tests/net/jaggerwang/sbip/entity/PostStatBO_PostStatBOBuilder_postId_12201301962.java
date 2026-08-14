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

public class PostStatBO_PostStatBOBuilder_postId_12201301962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21138;
     Object term21166;

    public PostStatBO_PostStatBOBuilder_postId_12201301962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21139 = new Long(-4003544865306793676L);
        Long term21141 = new Long(-769824408235898287L);
        Long term21144 = new Long(-2828343143039517941L);
        term21138 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder"));
        Object term21146 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21147 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21151 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21161 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21138, term21138.getClass(), "id", term21139);
        setField(term21138, term21138.getClass(), "postId", term21141);
        setBooleanField(term21138, term21138.getClass(), "likeCount$set", false);
        setField(term21138, term21138.getClass(), "likeCount$value", term21144);
        setIntField(term21147, term21147.getClass(), "year", 2017);
        setShortField(term21147, term21147.getClass(), "month", (short) 6);
        setShortField(term21147, term21147.getClass(), "day", (short) 7);
        setField(term21146, term21146.getClass(), "date", term21147);
        setByteField(term21151, term21151.getClass(), "hour", (byte) 13);
        setByteField(term21151, term21151.getClass(), "minute", (byte) 52);
        setByteField(term21151, term21151.getClass(), "second", (byte) 17);
        setIntField(term21151, term21151.getClass(), "nano", 78180039);
        setField(term21146, term21146.getClass(), "time", term21151);
        setField(term21138, term21138.getClass(), "createdAt", term21146);
        setIntField(term21157, term21157.getClass(), "year", 2017);
        setShortField(term21157, term21157.getClass(), "month", (short) 6);
        setShortField(term21157, term21157.getClass(), "day", (short) 23);
        setField(term21156, term21156.getClass(), "date", term21157);
        setByteField(term21161, term21161.getClass(), "hour", (byte) 23);
        setByteField(term21161, term21161.getClass(), "minute", (byte) 29);
        setByteField(term21161, term21161.getClass(), "second", (byte) 17);
        setIntField(term21161, term21161.getClass(), "nano", 491252353);
        setField(term21156, term21156.getClass(), "time", term21161);
        setField(term21138, term21138.getClass(), "updatedAt", term21156);
        term21166 = new Long(2809748481176687920L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term21166;
        callMethod(klass, "postId", argTypes, term21138, args);
    }

};


