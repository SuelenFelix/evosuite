package icu.samnyan.aqua.sega.util;

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
import static icu.samnyan.aqua.sega.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class VersionInfo_equals_8267222486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term56;

    public VersionInfo_equals_8267222486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term50 = new Integer(-6029667);
        Integer term52 = new Integer(-2068769794);
        Integer term54 = new Integer(-117576464);
        term49 = newInstance(Class.forName("icu.samnyan.aqua.sega.util.VersionInfo"));
        setField(term49, term49.getClass(), "majorVersion", term50);
        setField(term49, term49.getClass(), "minorVersion", term52);
        setField(term49, term49.getClass(), "releaseVersion", term54);
        term56 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.util.VersionInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term56;
        callMethod(klass, "equals", argTypes, term49, args);
    }

};


