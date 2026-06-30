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

public class VersionInfo_canEqual_225596197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;
     Object term64;

    public VersionInfo_canEqual_225596197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term58 = new Integer(-1007160944);
        Integer term60 = new Integer(1135664017);
        Integer term62 = new Integer(590364439);
        term57 = newInstance(Class.forName("icu.samnyan.aqua.sega.util.VersionInfo"));
        setField(term57, term57.getClass(), "majorVersion", term58);
        setField(term57, term57.getClass(), "minorVersion", term60);
        setField(term57, term57.getClass(), "releaseVersion", term62);
        term64 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.util.VersionInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term64;
        callMethod(klass, "canEqual", argTypes, term57, args);
    }

};


