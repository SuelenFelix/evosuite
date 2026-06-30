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

public class GameSetting_getRebootStartTime_143514721736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7116;

    public GameSetting_getRebootStartTime_143514721736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7116 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term7116, term7116.getClass(), "dataVersion", null);
        setField(term7116, term7116.getClass(), "onlineDataVersion", null);
        setBooleanField(term7116, term7116.getClass(), "isMaintenance", false);
        setIntField(term7116, term7116.getClass(), "requestInterval", 0);
        setField(term7116, term7116.getClass(), "rebootStartTime", null);
        setField(term7116, term7116.getClass(), "rebootEndTime", null);
        setBooleanField(term7116, term7116.getClass(), "isBackgroundDistribute", false);
        setIntField(term7116, term7116.getClass(), "maxCountCharacter", 0);
        setIntField(term7116, term7116.getClass(), "maxCountCard", 0);
        setIntField(term7116, term7116.getClass(), "maxCountItem", 0);
        setIntField(term7116, term7116.getClass(), "maxCountMusic", 0);
        setIntField(term7116, term7116.getClass(), "maxCountMusicItem", 0);
        setIntField(term7116, term7116.getClass(), "macCountRivalMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootStartTime", argTypes, term7116, args);
    }

};


