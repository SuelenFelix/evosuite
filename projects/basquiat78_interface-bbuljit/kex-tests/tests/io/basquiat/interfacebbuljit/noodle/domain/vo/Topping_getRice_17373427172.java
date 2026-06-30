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

public class Topping_getRice_17373427172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1088;

    public Topping_getRice_17373427172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1104 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term1103 = ((Class) term1104).getDeclaredField((String) "ADD");
        ((Field) term1103).setAccessible(true);
        Object enum4 = ((Field) term1103).get((Object) null);
        Class<? extends Object> term1365 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term1364 = ((Class) term1365).getDeclaredField((String) "NOT");
        ((Field) term1364).setAccessible(true);
        Object enum5 = ((Field) term1364).get((Object) null);
        term1088 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term1088, term1088.getClass(), "egg", enum4);
        setField(term1088, term1088.getClass(), "rice", enum5);
        setField(term1088, term1088.getClass(), "garlicFlake", enum4);
        setField(term1088, term1088.getClass(), "peanutButter", enum5);
        setField(term1088, term1088.getClass(), "spicySource", enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRice", argTypes, term1088, args);
    }

};


