package in.cubestack.apps.blog.post.service;

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
import static in.cubestack.apps.blog.post.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class TagService_update_3573411243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27522;

    public TagService_update_3573411243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27559 = new Long(-8469818909085103606L);
        term27522 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Tag"));
        Object term27561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27566 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27571 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27572 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27576 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27522, term27522.getClass(), "title", "vyvpqcHTQN");
        setField(term27522, term27522.getClass(), "slug", "QQcpNMSHvA");
        setField(term27522, term27522.getClass(), "content", "FLLklaMZvg");
        setField(term27522, term27522.getClass(), "id", term27559);
        setIntField(term27562, term27562.getClass(), "year", 2017);
        setShortField(term27562, term27562.getClass(), "month", (short) 11);
        setShortField(term27562, term27562.getClass(), "day", (short) 19);
        setField(term27561, term27561.getClass(), "date", term27562);
        setByteField(term27566, term27566.getClass(), "hour", (byte) 2);
        setByteField(term27566, term27566.getClass(), "minute", (byte) 52);
        setByteField(term27566, term27566.getClass(), "second", (byte) 15);
        setIntField(term27566, term27566.getClass(), "nano", 625778933);
        setField(term27561, term27561.getClass(), "time", term27566);
        setField(term27522, term27522.getClass(), "createdAt", term27561);
        setIntField(term27572, term27572.getClass(), "year", 2015);
        setShortField(term27572, term27572.getClass(), "month", (short) 10);
        setShortField(term27572, term27572.getClass(), "day", (short) 3);
        setField(term27571, term27571.getClass(), "date", term27572);
        setByteField(term27576, term27576.getClass(), "hour", (byte) 10);
        setByteField(term27576, term27576.getClass(), "minute", (byte) 45);
        setByteField(term27576, term27576.getClass(), "second", (byte) 18);
        setIntField(term27576, term27576.getClass(), "nano", 333457081);
        setField(term27571, term27571.getClass(), "time", term27576);
        setField(term27522, term27522.getClass(), "updatedAt", term27571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.TagService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.post.domain.Tag");
        Object[] args = new Object[1];
        args[0] = term27522;
        callMethod(klass, "update", argTypes, null, args);
    }

};


