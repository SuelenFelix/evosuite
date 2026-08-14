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
import java.lang.Object;

public class PostLike_init_150544048817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31575;
     Object term31577;
     Object term31579;
     Object term31581;
     Object term31591;

    public PostLike_init_150544048817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31575 = new Long(-3022442322233520981L);
        term31577 = new Long(-8735757853649335051L);
        term31579 = new Long(7016651719770171901L);
        term31581 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31582 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31586 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term31582, term31582.getClass(), "year", 2026);
        setShortField(term31582, term31582.getClass(), "month", (short) 10);
        setShortField(term31582, term31582.getClass(), "day", (short) 15);
        setField(term31581, term31581.getClass(), "date", term31582);
        setByteField(term31586, term31586.getClass(), "hour", (byte) 15);
        setByteField(term31586, term31586.getClass(), "minute", (byte) 25);
        setByteField(term31586, term31586.getClass(), "second", (byte) 12);
        setIntField(term31586, term31586.getClass(), "nano", 467763340);
        setField(term31581, term31581.getClass(), "time", term31586);
        term31591 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31592 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31596 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term31592, term31592.getClass(), "year", 2023);
        setShortField(term31592, term31592.getClass(), "month", (short) 1);
        setShortField(term31592, term31592.getClass(), "day", (short) 25);
        setField(term31591, term31591.getClass(), "date", term31592);
        setByteField(term31596, term31596.getClass(), "hour", (byte) 2);
        setByteField(term31596, term31596.getClass(), "minute", (byte) 13);
        setByteField(term31596, term31596.getClass(), "second", (byte) 2);
        setIntField(term31596, term31596.getClass(), "nano", 723644716);
        setField(term31591, term31591.getClass(), "time", term31596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[5];
        args[0] = term31575;
        args[1] = term31577;
        args[2] = term31579;
        args[3] = term31581;
        args[4] = term31591;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


