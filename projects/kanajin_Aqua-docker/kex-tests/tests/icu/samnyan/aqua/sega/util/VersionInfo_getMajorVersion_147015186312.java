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

public class VersionInfo_getMajorVersion_147015186312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;

    public VersionInfo_getMajorVersion_147015186312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85 = newInstance(Class.forName("icu.samnyan.aqua.sega.util.VersionInfo"));
        setField(term85, term85.getClass(), "majorVersion", null);
        setField(term85, term85.getClass(), "minorVersion", null);
        setField(term85, term85.getClass(), "releaseVersion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.util.VersionInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMajorVersion", argTypes, term85, args);
    }

};


