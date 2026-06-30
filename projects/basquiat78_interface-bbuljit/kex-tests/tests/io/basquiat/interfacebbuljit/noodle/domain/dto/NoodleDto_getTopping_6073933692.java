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

public class NoodleDto_getTopping_6073933692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term575;

    public NoodleDto_getTopping_6073933692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term614 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term613 = ((Class) term614).getDeclaredField((String) "NOT");
        ((Field) term613).setAccessible(true);
        Object enum2 = ((Field) term613).get((Object) null);
        Class<? extends Object> term875 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term874 = ((Class) term875).getDeclaredField((String) "ADD");
        ((Field) term874).setAccessible(true);
        Object enum3 = ((Field) term874).get((Object) null);
        term575 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto"));
        Object term588 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term575, term575.getClass(), "noodleName", "sjlJAEtRrb");
        setField(term588, term588.getClass(), "egg", enum2);
        setField(term588, term588.getClass(), "rice", enum2);
        setField(term588, term588.getClass(), "garlicFlake", enum2);
        setField(term588, term588.getClass(), "peanutButter", enum3);
        setField(term588, term588.getClass(), "spicySource", enum2);
        setField(term575, term575.getClass(), "topping", term588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTopping", argTypes, term575, args);
    }

};


