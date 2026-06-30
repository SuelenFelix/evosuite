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
import java.lang.Boolean;

public class GameSetting_setMaintenance_45138700547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7226;
     Object term7236;

    public GameSetting_setMaintenance_45138700547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7226 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term7226, term7226.getClass(), "dataVersion", null);
        setField(term7226, term7226.getClass(), "onlineDataVersion", null);
        setBooleanField(term7226, term7226.getClass(), "isMaintenance", false);
        setIntField(term7226, term7226.getClass(), "requestInterval", 0);
        setField(term7226, term7226.getClass(), "rebootStartTime", null);
        setField(term7226, term7226.getClass(), "rebootEndTime", null);
        setBooleanField(term7226, term7226.getClass(), "isBackgroundDistribute", false);
        setIntField(term7226, term7226.getClass(), "maxCountCharacter", 0);
        setIntField(term7226, term7226.getClass(), "maxCountCard", 0);
        setIntField(term7226, term7226.getClass(), "maxCountItem", 0);
        setIntField(term7226, term7226.getClass(), "maxCountMusic", 0);
        setIntField(term7226, term7226.getClass(), "maxCountMusicItem", 0);
        setIntField(term7226, term7226.getClass(), "macCountRivalMusic", 0);
        term7236 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7236;
        callMethod(klass, "setMaintenance", argTypes, term7226, args);
    }

};


