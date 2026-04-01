package org.openapijsonschematools.codegen.clicommands;

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
import static org.openapijsonschematools.codegen.clicommands.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;

public class ConfigHelp_writePlainTextFromMap_35238516713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429;
     Object term449;

    public ConfigHelp_writePlainTextFromMap_35238516713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term429 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term430 = (byte[]) newByteArray(16);
        setField(term429, term429.getClass(), "value", term430);
        setByteField(term429, term429.getClass(), "coder", (byte) -66);
        setIntField(term429, term429.getClass(), "count", -522618178);
        term449 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.clicommands.ConfigHelp");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = term429;
        args[1] = term449;
        args[2] = "xxtlPwDYFs";
        args[3] = "jJCZpVmanW";
        args[4] = "EGtDIRbSSb";
        args[5] = "SzjVpOQTyS";
        callMethod(klass, "writePlainTextFromMap", argTypes, null, args);
    }

};


