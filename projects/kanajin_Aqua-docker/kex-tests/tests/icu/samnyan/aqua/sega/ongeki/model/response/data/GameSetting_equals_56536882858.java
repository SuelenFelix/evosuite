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

public class GameSetting_equals_56536882858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7354;

    public GameSetting_equals_56536882858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7354 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term7354, term7354.getClass(), "dataVersion", null);
        setField(term7354, term7354.getClass(), "onlineDataVersion", null);
        setBooleanField(term7354, term7354.getClass(), "isMaintenance", false);
        setIntField(term7354, term7354.getClass(), "requestInterval", 0);
        setField(term7354, term7354.getClass(), "rebootStartTime", null);
        setField(term7354, term7354.getClass(), "rebootEndTime", null);
        setBooleanField(term7354, term7354.getClass(), "isBackgroundDistribute", false);
        setIntField(term7354, term7354.getClass(), "maxCountCharacter", 0);
        setIntField(term7354, term7354.getClass(), "maxCountCard", 0);
        setIntField(term7354, term7354.getClass(), "maxCountItem", 0);
        setIntField(term7354, term7354.getClass(), "maxCountMusic", 0);
        setIntField(term7354, term7354.getClass(), "maxCountMusicItem", 0);
        setIntField(term7354, term7354.getClass(), "macCountRivalMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term7354, args);
    }

};


