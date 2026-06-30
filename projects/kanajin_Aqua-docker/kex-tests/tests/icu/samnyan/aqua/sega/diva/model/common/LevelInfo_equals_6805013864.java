package icu.samnyan.aqua.sega.diva.model.common;

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
import static icu.samnyan.aqua.sega.diva.model.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LevelInfo_equals_6805013864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1767;
     Object term1770;

    public LevelInfo_equals_6805013864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1767 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.LevelInfo"));
        setIntField(term1767, term1767.getClass(), "levelNumber", -522618178);
        setIntField(term1767, term1767.getClass(), "levelExp", 1134449235);
        term1770 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.LevelInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1770;
        callMethod(klass, "equals", argTypes, term1767, args);
    }

};


