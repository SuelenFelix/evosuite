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

public class GameSetting_getMaxCountCharacter_213451750239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7146;

    public GameSetting_getMaxCountCharacter_213451750239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7146 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term7146, term7146.getClass(), "dataVersion", null);
        setField(term7146, term7146.getClass(), "onlineDataVersion", null);
        setBooleanField(term7146, term7146.getClass(), "isMaintenance", false);
        setIntField(term7146, term7146.getClass(), "requestInterval", 0);
        setField(term7146, term7146.getClass(), "rebootStartTime", null);
        setField(term7146, term7146.getClass(), "rebootEndTime", null);
        setBooleanField(term7146, term7146.getClass(), "isBackgroundDistribute", false);
        setIntField(term7146, term7146.getClass(), "maxCountCharacter", 0);
        setIntField(term7146, term7146.getClass(), "maxCountCard", 0);
        setIntField(term7146, term7146.getClass(), "maxCountItem", 0);
        setIntField(term7146, term7146.getClass(), "maxCountMusic", 0);
        setIntField(term7146, term7146.getClass(), "maxCountMusicItem", 0);
        setIntField(term7146, term7146.getClass(), "macCountRivalMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCountCharacter", argTypes, term7146, args);
    }

};


