package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Progress_tick_10673125874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18026;
     Object term18036;

    public Progress_tick_10673125874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18026 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Progress"));
        setLongField(term18026, term18026.getClass(), "startTime", 0L);
        setLongField(term18026, term18026.getClass(), "lastTickTime", 0L);
        setLongField(term18026, term18026.getClass(), "lastCount", 0L);
        setIntField(term18026, term18026.getClass(), "lastRate", 0);
        setIntField(term18026, term18026.getClass(), "lastAvgRate", 0);
        setLongField(term18026, term18026.getClass(), "total", 0L);
        setLongField(term18026, term18026.getClass(), "count", 0L);
        setLongField(term18026, term18026.getClass(), "width", 0L);
        setLongField(term18026, term18026.getClass(), "segSize", 0L);
        term18036 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Progress");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18036;
        callMethod(klass, "tick", argTypes, term18026, args);
    }

};


