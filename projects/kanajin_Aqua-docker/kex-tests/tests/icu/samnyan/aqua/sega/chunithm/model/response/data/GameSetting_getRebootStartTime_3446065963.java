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

public class GameSetting_getRebootStartTime_3446065963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term711;

    public GameSetting_getRebootStartTime_3446065963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term711 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term711, term711.getClass(), "dataVersion", 1442160736);
        setBooleanField(term711, term711.getClass(), "isMaintenance", true);
        setIntField(term711, term711.getClass(), "requestInterval", 1114000454);
        setField(term711, term711.getClass(), "rebootStartTime", "SzjVpOQTyS");
        setField(term711, term711.getClass(), "rebootEndTime", "MjGYSRKTNF");
        setBooleanField(term711, term711.getClass(), "isBackgroundDistribute", true);
        setIntField(term711, term711.getClass(), "maxCountCharacter", -556405712);
        setIntField(term711, term711.getClass(), "maxCountItem", -1772434990);
        setIntField(term711, term711.getClass(), "maxCountMusic", -1845499264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootStartTime", argTypes, term711, args);
    }

};


