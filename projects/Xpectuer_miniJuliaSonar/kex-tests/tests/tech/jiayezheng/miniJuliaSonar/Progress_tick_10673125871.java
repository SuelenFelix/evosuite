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

public class Progress_tick_10673125871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18000;
     Object term18010;

    public Progress_tick_10673125871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18000 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Progress"));
        setLongField(term18000, term18000.getClass(), "startTime", -8257434502486459194L);
        setLongField(term18000, term18000.getClass(), "lastTickTime", -8400487765614892086L);
        setLongField(term18000, term18000.getClass(), "lastCount", 5270370404989704783L);
        setIntField(term18000, term18000.getClass(), "lastRate", -2015854073);
        setIntField(term18000, term18000.getClass(), "lastAvgRate", 538259104);
        setLongField(term18000, term18000.getClass(), "total", 7411271909051562686L);
        setLongField(term18000, term18000.getClass(), "count", 4872422362414183754L);
        setLongField(term18000, term18000.getClass(), "width", 6811161968424632369L);
        setLongField(term18000, term18000.getClass(), "segSize", -7237588299778557629L);
        term18010 = new Integer(96566506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Progress");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18010;
        callMethod(klass, "tick", argTypes, term18000, args);
    }

};


