package org.codefx.demo.effective_java._06_unnecessary_objects;

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
import static org.codefx.demo.effective_java._06_unnecessary_objects.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;

public class OffsetDateTimeParse_OffsetDateTimeParser_parseChar_6452364158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266;
     Object term273;

    public OffsetDateTimeParse_OffsetDateTimeParser_parseChar_6452364158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266 = (int[]) newIntArray(6);
        setIntElement(term266, 0, -1456670397);
        setIntElement(term266, 1, 1622346318);
        setIntElement(term266, 2, 1048535127);
        setIntElement(term266, 3, -655067527);
        setIntElement(term266, 4, -6029667);
        setIntElement(term266, 5, -2068769794);
        term273 = new Character('A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._06_unnecessary_objects.OffsetDateTimeParse$OffsetDateTimeParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = "hRNSzYYIrc";
        args[1] = term266;
        args[2] = term273;
        callMethod(klass, "parseChar", argTypes, null, args);
    }

};


