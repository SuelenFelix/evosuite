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

public class PageEvent_toString_192733708312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term929;

    public PageEvent_toString_192733708312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term929 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent"));
        Object term954 = newInstance(Class.forName("java.util.Date"));
        setField(term929, term929.getClass(), "name", "nyiiPDVjAc");
        setField(term929, term929.getClass(), "user", "aKnKipADSo");
        setLongField(term954, term954.getClass(), "fastTime", 1725122217647L);
        setField(term954, term954.getClass(), "cdate", null);
        setField(term929, term929.getClass(), "date", term954);
        setLongField(term929, term929.getClass(), "duration", -4920224193275732920L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term929, args);
    }

};


