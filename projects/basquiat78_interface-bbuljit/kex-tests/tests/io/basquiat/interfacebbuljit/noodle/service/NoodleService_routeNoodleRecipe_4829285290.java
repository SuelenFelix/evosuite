package io.basquiat.interfacebbuljit.noodle.service;

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
import static io.basquiat.interfacebbuljit.noodle.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class NoodleService_routeNoodleRecipe_4829285290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object enum0;
     Object term32;

    public NoodleService_routeNoodleRecipe_4829285290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.service.NoodleService"));
        Class<? extends Object> term221 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.NoodleType");
        Field term220 = ((Class) term221).getDeclaredField((String) "PASTA");
        ((Field) term220).setAccessible(true);
        enum0 = ((Field) term220).get((Object) null);
        Class<? extends Object> term512 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term511 = ((Class) term512).getDeclaredField((String) "ADD");
        ((Field) term511).setAccessible(true);
        Object enum1 = ((Field) term511).get((Object) null);
        Class<? extends Object> term773 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term772 = ((Class) term773).getDeclaredField((String) "NOT");
        ((Field) term772).setAccessible(true);
        Object enum2 = ((Field) term772).get((Object) null);
        term32 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term32, term32.getClass(), "egg", enum1);
        setField(term32, term32.getClass(), "rice", enum1);
        setField(term32, term32.getClass(), "garlicFlake", enum1);
        setField(term32, term32.getClass(), "peanutButter", enum1);
        setField(term32, term32.getClass(), "spicySource", enum2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.service.NoodleService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.basquiat.interfacebbuljit.noodle.code.NoodleType");
        argTypes[1] = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Object[] args = new Object[2];
        args[0] = enum0;
        args[1] = term32;
        callMethod(klass, "routeNoodleRecipe", argTypes, term7, args);
    }

};


