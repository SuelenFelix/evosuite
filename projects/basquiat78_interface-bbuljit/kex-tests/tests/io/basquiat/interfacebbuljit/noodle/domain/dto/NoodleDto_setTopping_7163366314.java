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

public class NoodleDto_setTopping_7163366314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1717;
     Object term1745;

    public NoodleDto_setTopping_7163366314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1757 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term1756 = ((Class) term1757).getDeclaredField((String) "ADD");
        ((Field) term1756).setAccessible(true);
        Object enum6 = ((Field) term1756).get((Object) null);
        Class<? extends Object> term2018 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term2017 = ((Class) term2018).getDeclaredField((String) "NOT");
        ((Field) term2017).setAccessible(true);
        Object enum7 = ((Field) term2017).get((Object) null);
        term1717 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto"));
        Object term1730 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term1717, term1717.getClass(), "noodleName", "jJCZpVmanW");
        setField(term1730, term1730.getClass(), "egg", enum6);
        setField(term1730, term1730.getClass(), "rice", enum7);
        setField(term1730, term1730.getClass(), "garlicFlake", enum7);
        setField(term1730, term1730.getClass(), "peanutButter", enum6);
        setField(term1730, term1730.getClass(), "spicySource", enum6);
        setField(term1717, term1717.getClass(), "topping", term1730);
        term1745 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term1745, term1745.getClass(), "egg", enum7);
        setField(term1745, term1745.getClass(), "rice", enum7);
        setField(term1745, term1745.getClass(), "garlicFlake", enum7);
        setField(term1745, term1745.getClass(), "peanutButter", enum7);
        setField(term1745, term1745.getClass(), "spicySource", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Object[] args = new Object[1];
        args[0] = term1745;
        callMethod(klass, "setTopping", argTypes, term1717, args);
    }

};


