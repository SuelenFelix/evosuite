package icu.samnyan.aqua.sega.ongeki.model.response.data;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_setRebootStartTime_11157697749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7250;

    public GameSetting_setRebootStartTime_11157697749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7250 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term7250, term7250.getClass(), "dataVersion", null);
        setField(term7250, term7250.getClass(), "onlineDataVersion", null);
        setBooleanField(term7250, term7250.getClass(), "isMaintenance", false);
        setIntField(term7250, term7250.getClass(), "requestInterval", 0);
        setField(term7250, term7250.getClass(), "rebootStartTime", null);
        setField(term7250, term7250.getClass(), "rebootEndTime", null);
        setBooleanField(term7250, term7250.getClass(), "isBackgroundDistribute", false);
        setIntField(term7250, term7250.getClass(), "maxCountCharacter", 0);
        setIntField(term7250, term7250.getClass(), "maxCountCard", 0);
        setIntField(term7250, term7250.getClass(), "maxCountItem", 0);
        setIntField(term7250, term7250.getClass(), "maxCountMusic", 0);
        setIntField(term7250, term7250.getClass(), "maxCountMusicItem", 0);
        setIntField(term7250, term7250.getClass(), "macCountRivalMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRebootStartTime", argTypes, term7250, args);
    }

};


