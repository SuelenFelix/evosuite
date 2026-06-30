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

public class NoodleDto_NoodleDtoBuilder_topping_8106951327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7084;

    public NoodleDto_NoodleDtoBuilder_topping_8106951327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7084 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto$NoodleDtoBuilder"));
        setField(term7084, term7084.getClass(), "noodleName", null);
        setField(term7084, term7084.getClass(), "topping", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto$NoodleDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "topping", argTypes, term7084, args);
    }

};


