package icu.samnyan.aqua.sega.diva.model.response.databank;

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
import static icu.samnyan.aqua.sega.diva.model.response.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ContestInfoResponse_init_8653237590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14987;

    public ContestInfoResponse_init_8653237590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14992 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14988, term14988.getClass(), "year", 2015);
        setShortField(term14988, term14988.getClass(), "month", (short) 9);
        setShortField(term14988, term14988.getClass(), "day", (short) 16);
        setField(term14987, term14987.getClass(), "date", term14988);
        setByteField(term14992, term14992.getClass(), "hour", (byte) 6);
        setByteField(term14992, term14992.getClass(), "minute", (byte) 19);
        setByteField(term14992, term14992.getClass(), "second", (byte) 42);
        setIntField(term14992, term14992.getClass(), "nano", 630084975);
        setField(term14987, term14987.getClass(), "time", term14992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ContestInfoResponse");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = "EAIAAStlTz";
        args[1] = "yIWXcOQTgy";
        args[2] = "xAWekqanqc";
        args[3] = term14987;
        args[4] = "GSOWFHMlbF";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


