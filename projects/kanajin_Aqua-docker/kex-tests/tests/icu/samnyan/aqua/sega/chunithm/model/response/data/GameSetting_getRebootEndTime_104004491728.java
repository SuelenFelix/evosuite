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

public class GameSetting_getRebootEndTime_104004491728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1849;

    public GameSetting_getRebootEndTime_104004491728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1849 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1849, term1849.getClass(), "dataVersion", 0);
        setBooleanField(term1849, term1849.getClass(), "isMaintenance", false);
        setIntField(term1849, term1849.getClass(), "requestInterval", 0);
        setField(term1849, term1849.getClass(), "rebootStartTime", null);
        setField(term1849, term1849.getClass(), "rebootEndTime", null);
        setBooleanField(term1849, term1849.getClass(), "isBackgroundDistribute", false);
        setIntField(term1849, term1849.getClass(), "maxCountCharacter", 0);
        setIntField(term1849, term1849.getClass(), "maxCountItem", 0);
        setIntField(term1849, term1849.getClass(), "maxCountMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootEndTime", argTypes, term1849, args);
    }

};


