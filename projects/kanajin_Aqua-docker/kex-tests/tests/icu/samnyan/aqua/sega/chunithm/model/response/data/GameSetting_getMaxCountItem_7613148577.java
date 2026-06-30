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

public class GameSetting_getMaxCountItem_7613148577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term919;

    public GameSetting_getMaxCountItem_7613148577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term919 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term919, term919.getClass(), "dataVersion", 339854490);
        setBooleanField(term919, term919.getClass(), "isMaintenance", false);
        setIntField(term919, term919.getClass(), "requestInterval", -615654495);
        setField(term919, term919.getClass(), "rebootStartTime", "oVcInYnLWB");
        setField(term919, term919.getClass(), "rebootEndTime", "aJlieCFVtF");
        setBooleanField(term919, term919.getClass(), "isBackgroundDistribute", false);
        setIntField(term919, term919.getClass(), "maxCountCharacter", -1476117762);
        setIntField(term919, term919.getClass(), "maxCountItem", -341962980);
        setIntField(term919, term919.getClass(), "maxCountMusic", 1532716628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCountItem", argTypes, term919, args);
    }

};


