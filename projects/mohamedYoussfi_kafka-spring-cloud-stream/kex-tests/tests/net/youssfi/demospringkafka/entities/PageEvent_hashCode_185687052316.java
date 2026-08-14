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

public class PageEvent_hashCode_185687052316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term893;

    public PageEvent_hashCode_185687052316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term893 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent"));
        Object term918 = newInstance(Class.forName("java.util.Date"));
        setField(term893, term893.getClass(), "name", "xrwlQZdwCp");
        setField(term893, term893.getClass(), "user", "IDCWpPLRkE");
        setLongField(term918, term918.getClass(), "fastTime", 1668569229825L);
        setField(term918, term918.getClass(), "cdate", null);
        setField(term893, term893.getClass(), "date", term918);
        setLongField(term893, term893.getClass(), "duration", -6573104506744284592L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term893, args);
    }

};


