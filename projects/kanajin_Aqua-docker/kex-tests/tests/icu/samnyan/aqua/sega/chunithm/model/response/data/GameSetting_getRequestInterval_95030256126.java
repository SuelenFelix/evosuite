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

public class GameSetting_getRequestInterval_95030256126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1833;

    public GameSetting_getRequestInterval_95030256126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1833 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1833, term1833.getClass(), "dataVersion", 0);
        setBooleanField(term1833, term1833.getClass(), "isMaintenance", false);
        setIntField(term1833, term1833.getClass(), "requestInterval", 0);
        setField(term1833, term1833.getClass(), "rebootStartTime", null);
        setField(term1833, term1833.getClass(), "rebootEndTime", null);
        setBooleanField(term1833, term1833.getClass(), "isBackgroundDistribute", false);
        setIntField(term1833, term1833.getClass(), "maxCountCharacter", 0);
        setIntField(term1833, term1833.getClass(), "maxCountItem", 0);
        setIntField(term1833, term1833.getClass(), "maxCountMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestInterval", argTypes, term1833, args);
    }

};


