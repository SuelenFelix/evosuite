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

public class Docx4JSRUtil_ReplaceCommand_compareTo_5380755657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170;

    public Docx4JSRUtil_ReplaceCommand_compareTo_5380755657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170 = newInstance(Class.forName("de.phip1611.Docx4JSRUtil$ReplaceCommand"));
        setField(term170, term170.getClass(), "newValue", null);
        setField(term170, term170.getClass(), "foundMetaItem", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.phip1611.Docx4JSRUtil$ReplaceCommand");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.phip1611.Docx4JSRUtil$ReplaceCommand");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "compareTo", argTypes, term170, args);
    }

};


