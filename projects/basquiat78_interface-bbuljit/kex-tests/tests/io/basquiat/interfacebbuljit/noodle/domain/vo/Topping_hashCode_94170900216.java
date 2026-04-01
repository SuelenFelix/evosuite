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

public class Topping_hashCode_94170900216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4586;

    public Topping_hashCode_94170900216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4586 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term4586, term4586.getClass(), "egg", null);
        setField(term4586, term4586.getClass(), "rice", null);
        setField(term4586, term4586.getClass(), "garlicFlake", null);
        setField(term4586, term4586.getClass(), "peanutButter", null);
        setField(term4586, term4586.getClass(), "spicySource", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4586, args);
    }

};


