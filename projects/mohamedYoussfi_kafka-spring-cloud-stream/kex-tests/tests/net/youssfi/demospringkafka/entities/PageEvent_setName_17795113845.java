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

public class PageEvent_setName_17795113845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543;

    public PageEvent_setName_17795113845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term543 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent"));
        Object term568 = newInstance(Class.forName("java.util.Date"));
        setField(term543, term543.getClass(), "name", "xOEqzGAmDU");
        setField(term543, term543.getClass(), "user", "eZFUvlxvGV");
        setLongField(term568, term568.getClass(), "fastTime", 1589457921030L);
        setField(term568, term568.getClass(), "cdate", null);
        setField(term543, term543.getClass(), "date", term568);
        setLongField(term543, term543.getClass(), "duration", -8885298608300233488L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        callMethod(klass, "setName", argTypes, term543, args);
    }

};


