package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostStatDTO_init_78178882318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90637;
     Object term90639;
     Object term90641;
     Object term90643;
     Object term90653;

    public PostStatDTO_init_78178882318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90637 = new Long(-7907370981376515453L);
        term90639 = new Long(912529279953387872L);
        term90641 = new Long(6140052465174132392L);
        term90643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90648 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term90644, term90644.getClass(), "year", 2015);
        setShortField(term90644, term90644.getClass(), "month", (short) 10);
        setShortField(term90644, term90644.getClass(), "day", (short) 27);
        setField(term90643, term90643.getClass(), "date", term90644);
        setByteField(term90648, term90648.getClass(), "hour", (byte) 11);
        setByteField(term90648, term90648.getClass(), "minute", (byte) 12);
        setByteField(term90648, term90648.getClass(), "second", (byte) 3);
        setIntField(term90648, term90648.getClass(), "nano", 677546253);
        setField(term90643, term90643.getClass(), "time", term90648);
        term90653 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90654 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90658 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term90654, term90654.getClass(), "year", 2012);
        setShortField(term90654, term90654.getClass(), "month", (short) 11);
        setShortField(term90654, term90654.getClass(), "day", (short) 6);
        setField(term90653, term90653.getClass(), "date", term90654);
        setByteField(term90658, term90658.getClass(), "hour", (byte) 20);
        setByteField(term90658, term90658.getClass(), "minute", (byte) 4);
        setByteField(term90658, term90658.getClass(), "second", (byte) 31);
        setIntField(term90658, term90658.getClass(), "nano", 756557394);
        setField(term90653, term90653.getClass(), "time", term90658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[5];
        args[0] = term90637;
        args[1] = term90639;
        args[2] = term90641;
        args[3] = term90643;
        args[4] = term90653;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


