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

public class GameSetting_getDataVersion_95996872332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7076;

    public GameSetting_getDataVersion_95996872332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7076 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term7076, term7076.getClass(), "dataVersion", null);
        setField(term7076, term7076.getClass(), "onlineDataVersion", null);
        setBooleanField(term7076, term7076.getClass(), "isMaintenance", false);
        setIntField(term7076, term7076.getClass(), "requestInterval", 0);
        setField(term7076, term7076.getClass(), "rebootStartTime", null);
        setField(term7076, term7076.getClass(), "rebootEndTime", null);
        setBooleanField(term7076, term7076.getClass(), "isBackgroundDistribute", false);
        setIntField(term7076, term7076.getClass(), "maxCountCharacter", 0);
        setIntField(term7076, term7076.getClass(), "maxCountCard", 0);
        setIntField(term7076, term7076.getClass(), "maxCountItem", 0);
        setIntField(term7076, term7076.getClass(), "maxCountMusic", 0);
        setIntField(term7076, term7076.getClass(), "maxCountMusicItem", 0);
        setIntField(term7076, term7076.getClass(), "macCountRivalMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataVersion", argTypes, term7076, args);
    }

};


