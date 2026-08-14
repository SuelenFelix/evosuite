package de.phip1611;

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
import static de.phip1611.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Docx4JSRUtil_ReplaceCommand_init_16311639990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;

    public Docx4JSRUtil_ReplaceCommand_init_16311639990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = newInstance(Class.forName("de.phip1611.StringFindUtil$FoundResult"));
        setIntField(term51, term51.getClass(), "start", -616727354);
        setIntField(term51, term51.getClass(), "end", -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.phip1611.Docx4JSRUtil$ReplaceCommand");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("de.phip1611.StringFindUtil$FoundResult");
        Object[] args = new Object[2];
        args[0] = "sjlJAEtRrb";
        args[1] = term51;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


