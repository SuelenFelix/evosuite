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

public class GameSetting_getRebootStartTime_34460659627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1841;

    public GameSetting_getRebootStartTime_34460659627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1841 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1841, term1841.getClass(), "dataVersion", 0);
        setBooleanField(term1841, term1841.getClass(), "isMaintenance", false);
        setIntField(term1841, term1841.getClass(), "requestInterval", 0);
        setField(term1841, term1841.getClass(), "rebootStartTime", null);
        setField(term1841, term1841.getClass(), "rebootEndTime", null);
        setBooleanField(term1841, term1841.getClass(), "isBackgroundDistribute", false);
        setIntField(term1841, term1841.getClass(), "maxCountCharacter", 0);
        setIntField(term1841, term1841.getClass(), "maxCountItem", 0);
        setIntField(term1841, term1841.getClass(), "maxCountMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootStartTime", argTypes, term1841, args);
    }

};


