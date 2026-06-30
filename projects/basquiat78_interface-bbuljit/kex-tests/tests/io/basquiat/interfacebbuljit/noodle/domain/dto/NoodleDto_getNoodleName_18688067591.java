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

public class NoodleDto_getNoodleName_18688067591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public NoodleDto_getNoodleName_18688067591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term53 = ((Class) term54).getDeclaredField((String) "ADD");
        ((Field) term53).setAccessible(true);
        Object enum0 = ((Field) term53).get((Object) null);
        Class<? extends Object> term315 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term314 = ((Class) term315).getDeclaredField((String) "NOT");
        ((Field) term314).setAccessible(true);
        Object enum1 = ((Field) term314).get((Object) null);
        term1 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto"));
        Object term14 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term1, term1.getClass(), "noodleName", "PAEBtnZtTD");
        setField(term14, term14.getClass(), "egg", enum0);
        setField(term14, term14.getClass(), "rice", enum0);
        setField(term14, term14.getClass(), "garlicFlake", enum0);
        setField(term14, term14.getClass(), "peanutButter", enum0);
        setField(term14, term14.getClass(), "spicySource", enum1);
        setField(term1, term1.getClass(), "topping", term14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNoodleName", argTypes, term1, args);
    }

};


