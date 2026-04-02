package in.cubestack.apps.blog.comment.domain;

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
import static in.cubestack.apps.blog.comment.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Comment_init_11733280561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;
     Object term38;

    public Comment_init_11733280561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81 = Class.forName((String) "in.cubestack.apps.blog.comment.domain.CommentStatus");
        Field term80 = ((Class) term81).getDeclaredField((String) "PUBLISHED");
        ((Field) term80).setAccessible(true);
        enum0 = ((Field) term80).get((Object) null);
        term38 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term39, term39.getClass(), "year", 2012);
        setShortField(term39, term39.getClass(), "month", (short) 8);
        setShortField(term39, term39.getClass(), "day", (short) 25);
        setField(term38, term38.getClass(), "date", term39);
        setByteField(term43, term43.getClass(), "hour", (byte) 5);
        setByteField(term43, term43.getClass(), "minute", (byte) 20);
        setByteField(term43, term43.getClass(), "second", (byte) 50);
        setIntField(term43, term43.getClass(), "nano", 345595912);
        setField(term38, term38.getClass(), "time", term43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.comment.domain.Comment");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("in.cubestack.apps.blog.comment.domain.CommentStatus");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[4];
        args[0] = "PAEBtnZtTD";
        args[1] = enum0;
        args[2] = "sjlJAEtRrb";
        args[3] = term38;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


