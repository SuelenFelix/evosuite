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

public class NoodleDto_NoodleDtoBuilder_toString_4273105144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6791;

    public NoodleDto_NoodleDtoBuilder_toString_4273105144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6823 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term6822 = ((Class) term6823).getDeclaredField((String) "ADD");
        ((Field) term6822).setAccessible(true);
        Object enum24 = ((Field) term6822).get((Object) null);
        term6791 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto$NoodleDtoBuilder"));
        Object term6804 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term6791, term6791.getClass(), "noodleName", "oVcInYnLWB");
        setField(term6804, term6804.getClass(), "egg", enum24);
        setField(term6804, term6804.getClass(), "rice", enum24);
        setField(term6804, term6804.getClass(), "garlicFlake", enum24);
        setField(term6804, term6804.getClass(), "peanutButter", enum24);
        setField(term6804, term6804.getClass(), "spicySource", enum24);
        setField(term6791, term6791.getClass(), "topping", term6804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto$NoodleDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6791, args);
    }

};


