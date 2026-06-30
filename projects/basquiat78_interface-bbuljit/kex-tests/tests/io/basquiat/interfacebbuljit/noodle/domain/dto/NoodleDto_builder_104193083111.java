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

public class NoodleDto_builder_104193083111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5079;

    public NoodleDto_builder_104193083111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5079 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto"));
        setField(term5079, term5079.getClass(), "noodleName", null);
        setField(term5079, term5079.getClass(), "topping", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "builder", argTypes, term5079, args);
    }

};


