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
import java.lang.Object;

public class Docx4JSRUtil_ReplaceCommand_getNewValue_5300814441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64;

    public Docx4JSRUtil_ReplaceCommand_getNewValue_5300814441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64 = newInstance(Class.forName("de.phip1611.Docx4JSRUtil$ReplaceCommand"));
        Object term77 = newInstance(Class.forName("de.phip1611.StringFindUtil$FoundResult"));
        setField(term64, term64.getClass(), "newValue", "MuLcgQHgqz");
        setIntField(term77, term77.getClass(), "start", -2038273078);
        setIntField(term77, term77.getClass(), "end", 1227103734);
        setField(term64, term64.getClass(), "foundMetaItem", term77);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.phip1611.Docx4JSRUtil$ReplaceCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNewValue", argTypes, term64, args);
    }

};


