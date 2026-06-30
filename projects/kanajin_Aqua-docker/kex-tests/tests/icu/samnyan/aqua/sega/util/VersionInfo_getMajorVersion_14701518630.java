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

public class VersionInfo_getMajorVersion_14701518630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public VersionInfo_getMajorVersion_14701518630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Integer term4 = new Integer(1162663216);
        Integer term6 = new Integer(1484323161);
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.util.VersionInfo"));
        setField(term1, term1.getClass(), "majorVersion", term2);
        setField(term1, term1.getClass(), "minorVersion", term4);
        setField(term1, term1.getClass(), "releaseVersion", term6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.util.VersionInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMajorVersion", argTypes, term1, args);
    }

};


