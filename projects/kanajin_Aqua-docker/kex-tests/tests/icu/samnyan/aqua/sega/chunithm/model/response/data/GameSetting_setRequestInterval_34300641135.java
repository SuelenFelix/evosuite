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
import java.lang.Integer;

public class GameSetting_setRequestInterval_34300641135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1909;
     Object term1917;

    public GameSetting_setRequestInterval_34300641135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1909 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1909, term1909.getClass(), "dataVersion", 0);
        setBooleanField(term1909, term1909.getClass(), "isMaintenance", false);
        setIntField(term1909, term1909.getClass(), "requestInterval", 0);
        setField(term1909, term1909.getClass(), "rebootStartTime", null);
        setField(term1909, term1909.getClass(), "rebootEndTime", null);
        setBooleanField(term1909, term1909.getClass(), "isBackgroundDistribute", false);
        setIntField(term1909, term1909.getClass(), "maxCountCharacter", 0);
        setIntField(term1909, term1909.getClass(), "maxCountItem", 0);
        setIntField(term1909, term1909.getClass(), "maxCountMusic", 0);
        term1917 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1917;
        callMethod(klass, "setRequestInterval", argTypes, term1909, args);
    }

};


