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

public class Topping_toString_14524686928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4043;

    public Topping_toString_14524686928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4059 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term4058 = ((Class) term4059).getDeclaredField((String) "ADD");
        ((Field) term4058).setAccessible(true);
        Object enum15 = ((Field) term4058).get((Object) null);
        Class<? extends Object> term4320 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term4319 = ((Class) term4320).getDeclaredField((String) "NOT");
        ((Field) term4319).setAccessible(true);
        Object enum16 = ((Field) term4319).get((Object) null);
        term4043 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term4043, term4043.getClass(), "egg", enum15);
        setField(term4043, term4043.getClass(), "rice", enum15);
        setField(term4043, term4043.getClass(), "garlicFlake", enum16);
        setField(term4043, term4043.getClass(), "peanutButter", enum16);
        setField(term4043, term4043.getClass(), "spicySource", enum15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4043, args);
    }

};


