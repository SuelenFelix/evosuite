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

public class Topping_getEgg_5498612451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551;

    public Topping_getEgg_5498612451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term567 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term566 = ((Class) term567).getDeclaredField((String) "NOT");
        ((Field) term566).setAccessible(true);
        Object enum2 = ((Field) term566).get((Object) null);
        Class<? extends Object> term828 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term827 = ((Class) term828).getDeclaredField((String) "ADD");
        ((Field) term827).setAccessible(true);
        Object enum3 = ((Field) term827).get((Object) null);
        term551 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term551, term551.getClass(), "egg", enum2);
        setField(term551, term551.getClass(), "rice", enum2);
        setField(term551, term551.getClass(), "garlicFlake", enum2);
        setField(term551, term551.getClass(), "peanutButter", enum3);
        setField(term551, term551.getClass(), "spicySource", enum2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEgg", argTypes, term551, args);
    }

};


