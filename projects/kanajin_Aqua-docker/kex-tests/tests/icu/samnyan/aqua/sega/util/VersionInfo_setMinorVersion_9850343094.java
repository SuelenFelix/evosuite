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

public class VersionInfo_setMinorVersion_9850343094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;
     Object term38;

    public VersionInfo_setMinorVersion_9850343094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32 = new Integer(-883034806);
        Integer term34 = new Integer(1585847225);
        Integer term36 = new Integer(597278769);
        term31 = newInstance(Class.forName("icu.samnyan.aqua.sega.util.VersionInfo"));
        setField(term31, term31.getClass(), "majorVersion", term32);
        setField(term31, term31.getClass(), "minorVersion", term34);
        setField(term31, term31.getClass(), "releaseVersion", term36);
        term38 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.util.VersionInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term38;
        callMethod(klass, "setMinorVersion", argTypes, term31, args);
    }

};


