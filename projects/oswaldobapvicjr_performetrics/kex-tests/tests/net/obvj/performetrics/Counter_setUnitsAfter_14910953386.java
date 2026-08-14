package net.obvj.performetrics;

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
import static net.obvj.performetrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public class Counter_setUnitsAfter_14910953386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216987;
     Object term217021;

    public Counter_setUnitsAfter_14910953386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term217024 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term217023 = ((Class) term217024).getDeclaredField((String) "CPU_TIME");
        ((Field) term217023).setAccessible(true);
        Object enum783 = ((Field) term217023).get((Object) null);
        Class<? extends Object> term217230 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term217229 = ((Class) term217230).getDeclaredField((String) "FAST");
        ((Field) term217229).setAccessible(true);
        Object enum784 = ((Field) term217229).get((Object) null);
        term216987 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term216987, term216987.getClass(), "type", enum783);
        setField(term216987, term216987.getClass(), "conversionMode", enum784);
        setLongField(term216987, term216987.getClass(), "unitsBefore", -8338004844694486146L);
        setLongField(term216987, term216987.getClass(), "unitsAfter", 6426732259596412988L);
        setBooleanField(term216987, term216987.getClass(), "unitsAfterSet", false);
        term217021 = new Long(185793058502220865L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term217021;
        callMethod(klass, "setUnitsAfter", argTypes, term216987, args);
    }

};


