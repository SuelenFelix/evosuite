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

public class VersionInfo_setReleaseVersion_7548982175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40;
     Object term47;

    public VersionInfo_setReleaseVersion_7548982175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41 = new Integer(-1456670397);
        Integer term43 = new Integer(1622346318);
        Integer term45 = new Integer(1048535127);
        term40 = newInstance(Class.forName("icu.samnyan.aqua.sega.util.VersionInfo"));
        setField(term40, term40.getClass(), "majorVersion", term41);
        setField(term40, term40.getClass(), "minorVersion", term43);
        setField(term40, term40.getClass(), "releaseVersion", term45);
        term47 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.util.VersionInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term47;
        callMethod(klass, "setReleaseVersion", argTypes, term40, args);
    }

};


