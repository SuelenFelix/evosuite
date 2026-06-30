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

public class GameSetting_setRebootStartTime_97896364412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1185;

    public GameSetting_setRebootStartTime_97896364412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1185 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1185, term1185.getClass(), "dataVersion", 107945604);
        setBooleanField(term1185, term1185.getClass(), "isMaintenance", false);
        setIntField(term1185, term1185.getClass(), "requestInterval", -1963464809);
        setField(term1185, term1185.getClass(), "rebootStartTime", "BYqFIqCKAV");
        setField(term1185, term1185.getClass(), "rebootEndTime", "vrQLuWIDJX");
        setBooleanField(term1185, term1185.getClass(), "isBackgroundDistribute", false);
        setIntField(term1185, term1185.getClass(), "maxCountCharacter", 71190297);
        setIntField(term1185, term1185.getClass(), "maxCountItem", 1202361360);
        setIntField(term1185, term1185.getClass(), "maxCountMusic", -2015048153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "flxyYxBRtu";
        callMethod(klass, "setRebootStartTime", argTypes, term1185, args);
    }

};


