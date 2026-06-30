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

public class VersionInfo_getReleaseVersion_95753747714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87;

    public VersionInfo_getReleaseVersion_95753747714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87 = newInstance(Class.forName("icu.samnyan.aqua.sega.util.VersionInfo"));
        setField(term87, term87.getClass(), "majorVersion", null);
        setField(term87, term87.getClass(), "minorVersion", null);
        setField(term87, term87.getClass(), "releaseVersion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.util.VersionInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseVersion", argTypes, term87, args);
    }

};


