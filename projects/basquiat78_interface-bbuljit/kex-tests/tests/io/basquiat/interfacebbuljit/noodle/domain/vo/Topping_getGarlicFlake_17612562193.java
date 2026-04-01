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

public class Topping_getGarlicFlake_17612562193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1625;

    public Topping_getGarlicFlake_17612562193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1641 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term1640 = ((Class) term1641).getDeclaredField((String) "ADD");
        ((Field) term1640).setAccessible(true);
        Object enum6 = ((Field) term1640).get((Object) null);
        Class<? extends Object> term1902 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term1901 = ((Class) term1902).getDeclaredField((String) "NOT");
        ((Field) term1901).setAccessible(true);
        Object enum7 = ((Field) term1901).get((Object) null);
        term1625 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term1625, term1625.getClass(), "egg", enum6);
        setField(term1625, term1625.getClass(), "rice", enum7);
        setField(term1625, term1625.getClass(), "garlicFlake", enum7);
        setField(term1625, term1625.getClass(), "peanutButter", enum6);
        setField(term1625, term1625.getClass(), "spicySource", enum6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGarlicFlake", argTypes, term1625, args);
    }

};


