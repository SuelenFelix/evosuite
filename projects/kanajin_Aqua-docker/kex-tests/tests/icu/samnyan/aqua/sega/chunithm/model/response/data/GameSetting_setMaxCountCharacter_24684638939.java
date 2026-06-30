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

public class GameSetting_setMaxCountCharacter_24684638939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1945;
     Object term1953;

    public GameSetting_setMaxCountCharacter_24684638939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1945 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1945, term1945.getClass(), "dataVersion", 0);
        setBooleanField(term1945, term1945.getClass(), "isMaintenance", false);
        setIntField(term1945, term1945.getClass(), "requestInterval", 0);
        setField(term1945, term1945.getClass(), "rebootStartTime", null);
        setField(term1945, term1945.getClass(), "rebootEndTime", null);
        setBooleanField(term1945, term1945.getClass(), "isBackgroundDistribute", false);
        setIntField(term1945, term1945.getClass(), "maxCountCharacter", 0);
        setIntField(term1945, term1945.getClass(), "maxCountItem", 0);
        setIntField(term1945, term1945.getClass(), "maxCountMusic", 0);
        term1953 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1953;
        callMethod(klass, "setMaxCountCharacter", argTypes, term1945, args);
    }

};


