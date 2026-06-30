package space.gavinklfong.invest.forex.dtos;

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
import static space.gavinklfong.invest.forex.dtos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class ForexRate_init_20710763211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24980;
     Object term25007;
     Object term25009;

    public ForexRate_init_20710763211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24980 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term24980, term24980.getClass(), "seconds", 1838357779L);
        setIntField(term24980, term24980.getClass(), "nanos", 277000000);
        term25007 = new Double(0.3626177854778667);
        term25009 = new Double(0.3163771663728089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.time.Instant");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.Double");
        argTypes[4] = Class.forName("java.lang.Double");
        Object[] args = new Object[5];
        args[0] = term24980;
        args[1] = "DPskuFUobI";
        args[2] = "wBGfLpNNiZ";
        args[3] = term25007;
        args[4] = term25009;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


