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
     Object term18006;
     Object term18016;

    public Progress_tick_10673125871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18006 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Progress"));
        setLongField(term18006, term18006.getClass(), "startTime", -8257434502486459194L);
        setLongField(term18006, term18006.getClass(), "lastTickTime", -8400487765614892086L);
        setLongField(term18006, term18006.getClass(), "lastCount", 5270370404989704783L);
        setIntField(term18006, term18006.getClass(), "lastRate", -2015854073);
        setIntField(term18006, term18006.getClass(), "lastAvgRate", 538259104);
        setLongField(term18006, term18006.getClass(), "total", 7411271909051562686L);
        setLongField(term18006, term18006.getClass(), "count", 4872422362414183754L);
        setLongField(term18006, term18006.getClass(), "width", 6811161968424632369L);
        setLongField(term18006, term18006.getClass(), "segSize", -7237588299778557629L);
        term18016 = new Integer(96566506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Progress");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18016;
        callMethod(klass, "tick", argTypes, term18006, args);
    }

};


