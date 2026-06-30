package io.basquiat.interfacebbuljit.noodle.domain.dto;

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
import static io.basquiat.interfacebbuljit.noodle.domain.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class NoodleDto_equals_10589089925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2278;
     Object term2306;

    public NoodleDto_equals_10589089925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2318 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term2317 = ((Class) term2318).getDeclaredField((String) "ADD");
        ((Field) term2317).setAccessible(true);
        Object enum8 = ((Field) term2317).get((Object) null);
        Class<? extends Object> term2579 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term2578 = ((Class) term2579).getDeclaredField((String) "NOT");
        ((Field) term2578).setAccessible(true);
        Object enum9 = ((Field) term2578).get((Object) null);
        term2278 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto"));
        Object term2291 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term2278, term2278.getClass(), "noodleName", "EGtDIRbSSb");
        setField(term2291, term2291.getClass(), "egg", enum8);
        setField(term2291, term2291.getClass(), "rice", enum8);
        setField(term2291, term2291.getClass(), "garlicFlake", enum8);
        setField(term2291, term2291.getClass(), "peanutButter", enum9);
        setField(term2291, term2291.getClass(), "spicySource", enum9);
        setField(term2278, term2278.getClass(), "topping", term2291);
        term2306 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2306;
        callMethod(klass, "equals", argTypes, term2278, args);
    }

};


