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

public class VersionInfo_setMajorVersion_8458588713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22;
     Object term29;

    public VersionInfo_setMajorVersion_8458588713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23 = new Integer(-1339778481);
        Integer term25 = new Integer(1725571209);
        Integer term27 = new Integer(-522618178);
        term22 = newInstance(Class.forName("icu.samnyan.aqua.sega.util.VersionInfo"));
        setField(term22, term22.getClass(), "majorVersion", term23);
        setField(term22, term22.getClass(), "minorVersion", term25);
        setField(term22, term22.getClass(), "releaseVersion", term27);
        term29 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.util.VersionInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term29;
        callMethod(klass, "setMajorVersion", argTypes, term22, args);
    }

};


