package icu.samnyan.aqua.sega.chusan.model.response.data;

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
import static icu.samnyan.aqua.sega.chusan.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GameSetting_setMaxCountCharacter_124957646164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12097;
     Object term12106;

    public GameSetting_setMaxCountCharacter_124957646164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12097 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term12097, term12097.getClass(), "romVersion", null);
        setField(term12097, term12097.getClass(), "dataVersion", null);
        setBooleanField(term12097, term12097.getClass(), "isMaintenance", false);
        setIntField(term12097, term12097.getClass(), "requestInterval", 0);
        setField(term12097, term12097.getClass(), "rebootStartTime", null);
        setField(term12097, term12097.getClass(), "rebootEndTime", null);
        setBooleanField(term12097, term12097.getClass(), "isBackgroundDistribute", false);
        setIntField(term12097, term12097.getClass(), "maxCountCharacter", 0);
        setIntField(term12097, term12097.getClass(), "maxCountItem", 0);
        setIntField(term12097, term12097.getClass(), "maxCountMusic", 0);
        setField(term12097, term12097.getClass(), "matchStartTime", null);
        setField(term12097, term12097.getClass(), "matchEndTime", null);
        setIntField(term12097, term12097.getClass(), "matchTimeLimit", 0);
        setIntField(term12097, term12097.getClass(), "matchErrorLimit", 0);
        setField(term12097, term12097.getClass(), "matchingUri", null);
        setField(term12097, term12097.getClass(), "udpHolePunchUri", null);
        setField(term12097, term12097.getClass(), "reflectorUri", null);
        term12106 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term12106;
        callMethod(klass, "setMaxCountCharacter", argTypes, term12097, args);
    }

};


