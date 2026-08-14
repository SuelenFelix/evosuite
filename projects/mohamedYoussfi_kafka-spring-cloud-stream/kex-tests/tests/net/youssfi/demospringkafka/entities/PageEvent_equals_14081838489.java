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

public class PageEvent_equals_14081838489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term783;
     Object term811;

    public PageEvent_equals_14081838489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term783 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent"));
        Object term808 = newInstance(Class.forName("java.util.Date"));
        setField(term783, term783.getClass(), "name", "AijpHYOFuy");
        setField(term783, term783.getClass(), "user", "SbAoxhfrkn");
        setLongField(term808, term808.getClass(), "fastTime", 1882638884364L);
        setField(term808, term808.getClass(), "cdate", null);
        setField(term783, term783.getClass(), "date", term808);
        setLongField(term783, term783.getClass(), "duration", -316468845751588286L);
        term811 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term811;
        callMethod(klass, "equals", argTypes, term783, args);
    }

};


