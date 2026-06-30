package icu.samnyan.aqua.sega.chunithm.model.response.data;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class GameSetting_setBackgroundDistribute_69867485814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1333;
     Object term1365;

    public GameSetting_setBackgroundDistribute_69867485814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1333 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1333, term1333.getClass(), "dataVersion", 9726679);
        setBooleanField(term1333, term1333.getClass(), "isMaintenance", true);
        setIntField(term1333, term1333.getClass(), "requestInterval", -25637976);
        setField(term1333, term1333.getClass(), "rebootStartTime", "OWDIEULEFu");
        setField(term1333, term1333.getClass(), "rebootEndTime", "dWRymuLBtr");
        setBooleanField(term1333, term1333.getClass(), "isBackgroundDistribute", true);
        setIntField(term1333, term1333.getClass(), "maxCountCharacter", 1555897383);
        setIntField(term1333, term1333.getClass(), "maxCountItem", 202001407);
        setIntField(term1333, term1333.getClass(), "maxCountMusic", 158873461);
        term1365 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1365;
        callMethod(klass, "setBackgroundDistribute", argTypes, term1333, args);
    }

};


