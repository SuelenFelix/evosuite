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

public class PageEvent_getDate_18323642283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447;

    public PageEvent_getDate_18323642283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term447 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent"));
        Object term472 = newInstance(Class.forName("java.util.Date"));
        setField(term447, term447.getClass(), "name", "HyxfbSQYBe");
        setField(term447, term447.getClass(), "user", "pCTimMblYc");
        setLongField(term472, term472.getClass(), "fastTime", 1500721068023L);
        setField(term472, term472.getClass(), "cdate", null);
        setField(term447, term447.getClass(), "date", term472);
        setLongField(term447, term447.getClass(), "duration", 6967924379644551255L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term447, args);
    }

};


