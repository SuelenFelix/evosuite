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

public class Topping_getSpicySource_12531624055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2431;

    public Topping_getSpicySource_12531624055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2447 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term2446 = ((Class) term2447).getDeclaredField((String) "ADD");
        ((Field) term2446).setAccessible(true);
        Object enum9 = ((Field) term2446).get((Object) null);
        Class<? extends Object> term2708 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term2707 = ((Class) term2708).getDeclaredField((String) "NOT");
        ((Field) term2707).setAccessible(true);
        Object enum10 = ((Field) term2707).get((Object) null);
        term2431 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term2431, term2431.getClass(), "egg", enum9);
        setField(term2431, term2431.getClass(), "rice", enum9);
        setField(term2431, term2431.getClass(), "garlicFlake", enum9);
        setField(term2431, term2431.getClass(), "peanutButter", enum10);
        setField(term2431, term2431.getClass(), "spicySource", enum10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpicySource", argTypes, term2431, args);
    }

};


