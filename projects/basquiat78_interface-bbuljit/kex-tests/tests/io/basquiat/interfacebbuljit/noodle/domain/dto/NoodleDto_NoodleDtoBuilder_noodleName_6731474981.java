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

public class NoodleDto_NoodleDtoBuilder_noodleName_6731474981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5088;

    public NoodleDto_NoodleDtoBuilder_noodleName_6731474981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5139 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term5138 = ((Class) term5139).getDeclaredField((String) "ADD");
        ((Field) term5138).setAccessible(true);
        Object enum18 = ((Field) term5138).get((Object) null);
        Class<? extends Object> term5400 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term5399 = ((Class) term5400).getDeclaredField((String) "NOT");
        ((Field) term5399).setAccessible(true);
        Object enum19 = ((Field) term5399).get((Object) null);
        term5088 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto$NoodleDtoBuilder"));
        Object term5101 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term5088, term5088.getClass(), "noodleName", "NRdvgJlhkX");
        setField(term5101, term5101.getClass(), "egg", enum18);
        setField(term5101, term5101.getClass(), "rice", enum18);
        setField(term5101, term5101.getClass(), "garlicFlake", enum19);
        setField(term5101, term5101.getClass(), "peanutButter", enum18);
        setField(term5101, term5101.getClass(), "spicySource", enum19);
        setField(term5088, term5088.getClass(), "topping", term5101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto$NoodleDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uuaPigETmJ";
        callMethod(klass, "noodleName", argTypes, term5088, args);
    }

};


