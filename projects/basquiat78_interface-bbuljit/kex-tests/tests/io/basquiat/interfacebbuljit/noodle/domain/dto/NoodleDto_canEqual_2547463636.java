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

public class NoodleDto_canEqual_2547463636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2839;
     Object term2867;

    public NoodleDto_canEqual_2547463636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2879 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term2878 = ((Class) term2879).getDeclaredField((String) "NOT");
        ((Field) term2878).setAccessible(true);
        Object enum10 = ((Field) term2878).get((Object) null);
        Class<? extends Object> term3140 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term3139 = ((Class) term3140).getDeclaredField((String) "ADD");
        ((Field) term3139).setAccessible(true);
        Object enum11 = ((Field) term3139).get((Object) null);
        term2839 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto"));
        Object term2852 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term2839, term2839.getClass(), "noodleName", "SzjVpOQTyS");
        setField(term2852, term2852.getClass(), "egg", enum10);
        setField(term2852, term2852.getClass(), "rice", enum10);
        setField(term2852, term2852.getClass(), "garlicFlake", enum10);
        setField(term2852, term2852.getClass(), "peanutButter", enum10);
        setField(term2852, term2852.getClass(), "spicySource", enum11);
        setField(term2839, term2839.getClass(), "topping", term2852);
        term2867 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2867;
        callMethod(klass, "canEqual", argTypes, term2839, args);
    }

};


