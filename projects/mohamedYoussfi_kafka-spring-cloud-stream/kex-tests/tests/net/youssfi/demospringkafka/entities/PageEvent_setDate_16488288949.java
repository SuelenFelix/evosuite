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

public class PageEvent_setDate_16488288949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term687;
     Object term715;

    public PageEvent_setDate_16488288949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term687 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent"));
        Object term712 = newInstance(Class.forName("java.util.Date"));
        setField(term687, term687.getClass(), "name", "IoAlmYsBwc");
        setField(term687, term687.getClass(), "user", "TEParAifyi");
        setLongField(term712, term712.getClass(), "fastTime", 1349069753960L);
        setField(term712, term712.getClass(), "cdate", null);
        setField(term687, term687.getClass(), "date", term712);
        setLongField(term687, term687.getClass(), "duration", 2535595959091595249L);
        term715 = newInstance(Class.forName("java.util.Date"));
        setLongField(term715, term715.getClass(), "fastTime", 1706078172457L);
        setField(term715, term715.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term715;
        callMethod(klass, "setDate", argTypes, term687, args);
    }

};


