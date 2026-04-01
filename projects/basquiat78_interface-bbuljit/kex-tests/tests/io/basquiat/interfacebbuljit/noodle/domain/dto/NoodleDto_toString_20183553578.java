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

public class NoodleDto_toString_20183553578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3960;

    public NoodleDto_toString_20183553578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3999 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term3998 = ((Class) term3999).getDeclaredField((String) "ADD");
        ((Field) term3998).setAccessible(true);
        Object enum14 = ((Field) term3998).get((Object) null);
        Class<? extends Object> term4260 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term4259 = ((Class) term4260).getDeclaredField((String) "NOT");
        ((Field) term4259).setAccessible(true);
        Object enum15 = ((Field) term4259).get((Object) null);
        term3960 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto"));
        Object term3973 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term3960, term3960.getClass(), "noodleName", "hRNSzYYIrc");
        setField(term3973, term3973.getClass(), "egg", enum14);
        setField(term3973, term3973.getClass(), "rice", enum14);
        setField(term3973, term3973.getClass(), "garlicFlake", enum15);
        setField(term3973, term3973.getClass(), "peanutButter", enum15);
        setField(term3973, term3973.getClass(), "spicySource", enum14);
        setField(term3960, term3960.getClass(), "topping", term3973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3960, args);
    }

};


