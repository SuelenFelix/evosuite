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

public class NoodleDto_setNoodleName_4190856313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1135;

    public NoodleDto_setNoodleName_4190856313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1186 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term1185 = ((Class) term1186).getDeclaredField((String) "ADD");
        ((Field) term1185).setAccessible(true);
        Object enum4 = ((Field) term1185).get((Object) null);
        Class<? extends Object> term1447 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term1446 = ((Class) term1447).getDeclaredField((String) "NOT");
        ((Field) term1446).setAccessible(true);
        Object enum5 = ((Field) term1446).get((Object) null);
        term1135 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto"));
        Object term1148 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term1135, term1135.getClass(), "noodleName", "MuLcgQHgqz");
        setField(term1148, term1148.getClass(), "egg", enum4);
        setField(term1148, term1148.getClass(), "rice", enum5);
        setField(term1148, term1148.getClass(), "garlicFlake", enum4);
        setField(term1148, term1148.getClass(), "peanutButter", enum5);
        setField(term1148, term1148.getClass(), "spicySource", enum4);
        setField(term1135, term1135.getClass(), "topping", term1148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        callMethod(klass, "setNoodleName", argTypes, term1135, args);
    }

};


