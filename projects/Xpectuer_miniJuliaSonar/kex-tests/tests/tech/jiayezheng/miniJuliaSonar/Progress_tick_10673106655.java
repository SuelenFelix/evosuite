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

public class Progress_tick_10673106655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18044;

    public Progress_tick_10673106655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18044 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Progress"));
        setLongField(term18044, term18044.getClass(), "startTime", 0L);
        setLongField(term18044, term18044.getClass(), "lastTickTime", 0L);
        setLongField(term18044, term18044.getClass(), "lastCount", 0L);
        setIntField(term18044, term18044.getClass(), "lastRate", 0);
        setIntField(term18044, term18044.getClass(), "lastAvgRate", 0);
        setLongField(term18044, term18044.getClass(), "total", 0L);
        setLongField(term18044, term18044.getClass(), "count", 0L);
        setLongField(term18044, term18044.getClass(), "width", 0L);
        setLongField(term18044, term18044.getClass(), "segSize", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Progress");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tick", argTypes, term18044, args);
    }

};


