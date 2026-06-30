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

public class GameSetting_setMaintenance_154192762634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1899;
     Object term1907;

    public GameSetting_setMaintenance_154192762634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1899 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1899, term1899.getClass(), "dataVersion", 0);
        setBooleanField(term1899, term1899.getClass(), "isMaintenance", false);
        setIntField(term1899, term1899.getClass(), "requestInterval", 0);
        setField(term1899, term1899.getClass(), "rebootStartTime", null);
        setField(term1899, term1899.getClass(), "rebootEndTime", null);
        setBooleanField(term1899, term1899.getClass(), "isBackgroundDistribute", false);
        setIntField(term1899, term1899.getClass(), "maxCountCharacter", 0);
        setIntField(term1899, term1899.getClass(), "maxCountItem", 0);
        setIntField(term1899, term1899.getClass(), "maxCountMusic", 0);
        term1907 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1907;
        callMethod(klass, "setMaintenance", argTypes, term1899, args);
    }

};


