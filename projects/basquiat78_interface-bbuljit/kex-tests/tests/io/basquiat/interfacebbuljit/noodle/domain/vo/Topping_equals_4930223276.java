package io.basquiat.interfacebbuljit.noodle.domain.vo;

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
import static io.basquiat.interfacebbuljit.noodle.domain.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Topping_equals_4930223276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2968;
     Object term2983;

    public Topping_equals_4930223276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2985 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term2984 = ((Class) term2985).getDeclaredField((String) "NOT");
        ((Field) term2984).setAccessible(true);
        Object enum11 = ((Field) term2984).get((Object) null);
        Class<? extends Object> term3246 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term3245 = ((Class) term3246).getDeclaredField((String) "ADD");
        ((Field) term3245).setAccessible(true);
        Object enum12 = ((Field) term3245).get((Object) null);
        term2968 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term2968, term2968.getClass(), "egg", enum11);
        setField(term2968, term2968.getClass(), "rice", enum11);
        setField(term2968, term2968.getClass(), "garlicFlake", enum11);
        setField(term2968, term2968.getClass(), "peanutButter", enum11);
        setField(term2968, term2968.getClass(), "spicySource", enum12);
        term2983 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2983;
        callMethod(klass, "equals", argTypes, term2968, args);
    }

};


