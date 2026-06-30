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

public class NoodleDto_hashCode_15075956677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3400;

    public NoodleDto_hashCode_15075956677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3439 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term3438 = ((Class) term3439).getDeclaredField((String) "NOT");
        ((Field) term3438).setAccessible(true);
        Object enum12 = ((Field) term3438).get((Object) null);
        Class<? extends Object> term3700 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term3699 = ((Class) term3700).getDeclaredField((String) "ADD");
        ((Field) term3699).setAccessible(true);
        Object enum13 = ((Field) term3699).get((Object) null);
        term3400 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto"));
        Object term3413 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term3400, term3400.getClass(), "noodleName", "MjGYSRKTNF");
        setField(term3413, term3413.getClass(), "egg", enum12);
        setField(term3413, term3413.getClass(), "rice", enum12);
        setField(term3413, term3413.getClass(), "garlicFlake", enum12);
        setField(term3413, term3413.getClass(), "peanutButter", enum12);
        setField(term3413, term3413.getClass(), "spicySource", enum13);
        setField(term3400, term3400.getClass(), "topping", term3413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3400, args);
    }

};


