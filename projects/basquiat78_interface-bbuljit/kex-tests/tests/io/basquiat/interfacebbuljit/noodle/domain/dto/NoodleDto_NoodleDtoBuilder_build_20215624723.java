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

public class NoodleDto_NoodleDtoBuilder_build_20215624723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6231;

    public NoodleDto_NoodleDtoBuilder_build_20215624723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6270 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term6269 = ((Class) term6270).getDeclaredField((String) "ADD");
        ((Field) term6269).setAccessible(true);
        Object enum22 = ((Field) term6269).get((Object) null);
        Class<? extends Object> term6531 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term6530 = ((Class) term6531).getDeclaredField((String) "NOT");
        ((Field) term6530).setAccessible(true);
        Object enum23 = ((Field) term6530).get((Object) null);
        term6231 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto$NoodleDtoBuilder"));
        Object term6244 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term6231, term6231.getClass(), "noodleName", "LQFpaHEwXR");
        setField(term6244, term6244.getClass(), "egg", enum22);
        setField(term6244, term6244.getClass(), "rice", enum23);
        setField(term6244, term6244.getClass(), "garlicFlake", enum23);
        setField(term6244, term6244.getClass(), "peanutButter", enum23);
        setField(term6244, term6244.getClass(), "spicySource", enum22);
        setField(term6231, term6231.getClass(), "topping", term6244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto$NoodleDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term6231, args);
    }

};


