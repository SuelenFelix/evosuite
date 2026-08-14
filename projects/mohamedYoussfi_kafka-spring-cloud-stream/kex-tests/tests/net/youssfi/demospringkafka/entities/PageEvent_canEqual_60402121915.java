package net.youssfi.demospringkafka.entities;

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
import static net.youssfi.demospringkafka.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PageEvent_canEqual_60402121915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term844;
     Object term872;

    public PageEvent_canEqual_60402121915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term844 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent"));
        Object term869 = newInstance(Class.forName("java.util.Date"));
        setField(term844, term844.getClass(), "name", "kuTXqwMtDB");
        setField(term844, term844.getClass(), "user", "Ghbwtircqb");
        setLongField(term869, term869.getClass(), "fastTime", 1437757323580L);
        setField(term869, term869.getClass(), "cdate", null);
        setField(term844, term844.getClass(), "date", term869);
        setLongField(term844, term844.getClass(), "duration", 5127676408959197577L);
        term872 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term872;
        callMethod(klass, "canEqual", argTypes, term844, args);
    }

};


