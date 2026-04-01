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
import java.lang.String;
import java.lang.Object;

public class NoodleDto_init_16199221710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4532;

    public NoodleDto_init_16199221710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4558 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term4557 = ((Class) term4558).getDeclaredField((String) "NOT");
        ((Field) term4557).setAccessible(true);
        Object enum16 = ((Field) term4557).get((Object) null);
        Class<? extends Object> term4819 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term4818 = ((Class) term4819).getDeclaredField((String) "ADD");
        ((Field) term4818).setAccessible(true);
        Object enum17 = ((Field) term4818).get((Object) null);
        term4532 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term4532, term4532.getClass(), "egg", enum16);
        setField(term4532, term4532.getClass(), "rice", enum16);
        setField(term4532, term4532.getClass(), "garlicFlake", enum16);
        setField(term4532, term4532.getClass(), "peanutButter", enum17);
        setField(term4532, term4532.getClass(), "spicySource", enum16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Object[] args = new Object[2];
        args[0] = "RMFIsYGgne";
        args[1] = term4532;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


