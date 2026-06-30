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
import java.lang.Integer;

public class LevelInfo_setLevelNumber_87098773512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1791;
     Object term1794;

    public LevelInfo_setLevelNumber_87098773512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1791 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.LevelInfo"));
        setIntField(term1791, term1791.getClass(), "levelNumber", 0);
        setIntField(term1791, term1791.getClass(), "levelExp", 0);
        term1794 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.LevelInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1794;
        callMethod(klass, "setLevelNumber", argTypes, term1791, args);
    }

};


