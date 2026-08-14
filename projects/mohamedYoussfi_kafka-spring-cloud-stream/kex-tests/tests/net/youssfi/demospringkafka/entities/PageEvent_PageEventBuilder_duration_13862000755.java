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
import java.lang.Long;

public class PageEvent_PageEventBuilder_duration_13862000755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193;
     Object term221;

    public PageEvent_PageEventBuilder_duration_13862000755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent$PageEventBuilder"));
        Object term218 = newInstance(Class.forName("java.util.Date"));
        setField(term193, term193.getClass(), "name", "hRNSzYYIrc");
        setField(term193, term193.getClass(), "user", "RMFIsYGgne");
        setLongField(term218, term218.getClass(), "fastTime", 1442639565302L);
        setField(term218, term218.getClass(), "cdate", null);
        setField(term193, term193.getClass(), "date", term218);
        setLongField(term193, term193.getClass(), "duration", -8400487765614892086L);
        term221 = new Long(5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent$PageEventBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term221;
        callMethod(klass, "duration", argTypes, term193, args);
    }

};


