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
import java.lang.Boolean;

public class GameSetting_setMaintenance_4550477659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12046;
     Object term12055;

    public GameSetting_setMaintenance_4550477659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12046 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term12046, term12046.getClass(), "romVersion", null);
        setField(term12046, term12046.getClass(), "dataVersion", null);
        setBooleanField(term12046, term12046.getClass(), "isMaintenance", false);
        setIntField(term12046, term12046.getClass(), "requestInterval", 0);
        setField(term12046, term12046.getClass(), "rebootStartTime", null);
        setField(term12046, term12046.getClass(), "rebootEndTime", null);
        setBooleanField(term12046, term12046.getClass(), "isBackgroundDistribute", false);
        setIntField(term12046, term12046.getClass(), "maxCountCharacter", 0);
        setIntField(term12046, term12046.getClass(), "maxCountItem", 0);
        setIntField(term12046, term12046.getClass(), "maxCountMusic", 0);
        setField(term12046, term12046.getClass(), "matchStartTime", null);
        setField(term12046, term12046.getClass(), "matchEndTime", null);
        setIntField(term12046, term12046.getClass(), "matchTimeLimit", 0);
        setIntField(term12046, term12046.getClass(), "matchErrorLimit", 0);
        setField(term12046, term12046.getClass(), "matchingUri", null);
        setField(term12046, term12046.getClass(), "udpHolePunchUri", null);
        setField(term12046, term12046.getClass(), "reflectorUri", null);
        term12055 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term12055;
        callMethod(klass, "setMaintenance", argTypes, term12046, args);
    }

};


