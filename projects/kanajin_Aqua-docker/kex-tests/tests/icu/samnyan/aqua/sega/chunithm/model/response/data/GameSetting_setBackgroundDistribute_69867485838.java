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

public class GameSetting_setBackgroundDistribute_69867485838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1935;
     Object term1943;

    public GameSetting_setBackgroundDistribute_69867485838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1935 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1935, term1935.getClass(), "dataVersion", 0);
        setBooleanField(term1935, term1935.getClass(), "isMaintenance", false);
        setIntField(term1935, term1935.getClass(), "requestInterval", 0);
        setField(term1935, term1935.getClass(), "rebootStartTime", null);
        setField(term1935, term1935.getClass(), "rebootEndTime", null);
        setBooleanField(term1935, term1935.getClass(), "isBackgroundDistribute", false);
        setIntField(term1935, term1935.getClass(), "maxCountCharacter", 0);
        setIntField(term1935, term1935.getClass(), "maxCountItem", 0);
        setIntField(term1935, term1935.getClass(), "maxCountMusic", 0);
        term1943 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1943;
        callMethod(klass, "setBackgroundDistribute", argTypes, term1935, args);
    }

};


