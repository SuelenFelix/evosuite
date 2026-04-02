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

public class Progress_tick_10673106652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18012;

    public Progress_tick_10673106652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18012 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Progress"));
        setLongField(term18012, term18012.getClass(), "startTime", 6967924379644551255L);
        setLongField(term18012, term18012.getClass(), "lastTickTime", -2813493605142626659L);
        setLongField(term18012, term18012.getClass(), "lastCount", -8885298608300233488L);
        setIntField(term18012, term18012.getClass(), "lastRate", -343325701);
        setIntField(term18012, term18012.getClass(), "lastAvgRate", 107945604);
        setLongField(term18012, term18012.getClass(), "total", -4325723315152823407L);
        setLongField(term18012, term18012.getClass(), "count", 2535595959091595249L);
        setLongField(term18012, term18012.getClass(), "width", -5476826692763582090L);
        setLongField(term18012, term18012.getClass(), "segSize", -872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Progress");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tick", argTypes, term18012, args);
    }

};


