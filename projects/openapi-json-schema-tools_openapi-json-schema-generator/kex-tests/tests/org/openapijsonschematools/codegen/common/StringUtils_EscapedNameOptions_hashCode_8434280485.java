package org.openapijsonschematools.codegen.common;

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
import static org.openapijsonschematools.codegen.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StringUtils_EscapedNameOptions_hashCode_8434280485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13615;

    public StringUtils_EscapedNameOptions_hashCode_8434280485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13615 = newInstance(Class.forName("org.openapijsonschematools.codegen.common.StringUtils$EscapedNameOptions"));
        setField(term13615, term13615.getClass(), "name", null);
        setField(term13615, term13615.getClass(), "appendToReplacement", null);
        setField(term13615, term13615.getClass(), "specialChars", null);
        setField(term13615, term13615.getClass(), "charactersToAllow", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.StringUtils$EscapedNameOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term13615, args);
    }

};


