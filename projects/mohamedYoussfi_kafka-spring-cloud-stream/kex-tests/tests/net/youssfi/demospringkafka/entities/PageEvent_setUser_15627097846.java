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

public class PageEvent_setUser_15627097846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613;

    public PageEvent_setUser_15627097846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term613 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent"));
        Object term638 = newInstance(Class.forName("java.util.Date"));
        setField(term613, term613.getClass(), "name", "vrQLuWIDJX");
        setField(term613, term613.getClass(), "user", "flxyYxBRtu");
        setLongField(term638, term638.getClass(), "fastTime", 1745462962080L);
        setField(term638, term638.getClass(), "cdate", null);
        setField(term613, term613.getClass(), "date", term638);
        setLongField(term613, term613.getClass(), "duration", -4325723315152823407L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OclPbYPkcH";
        callMethod(klass, "setUser", argTypes, term613, args);
    }

};


