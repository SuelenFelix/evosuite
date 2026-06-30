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
import java.lang.Integer;

public class GameSetting_setMaxCountCard_131764308153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7294;
     Object term7304;

    public GameSetting_setMaxCountCard_131764308153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7294 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term7294, term7294.getClass(), "dataVersion", null);
        setField(term7294, term7294.getClass(), "onlineDataVersion", null);
        setBooleanField(term7294, term7294.getClass(), "isMaintenance", false);
        setIntField(term7294, term7294.getClass(), "requestInterval", 0);
        setField(term7294, term7294.getClass(), "rebootStartTime", null);
        setField(term7294, term7294.getClass(), "rebootEndTime", null);
        setBooleanField(term7294, term7294.getClass(), "isBackgroundDistribute", false);
        setIntField(term7294, term7294.getClass(), "maxCountCharacter", 0);
        setIntField(term7294, term7294.getClass(), "maxCountCard", 0);
        setIntField(term7294, term7294.getClass(), "maxCountItem", 0);
        setIntField(term7294, term7294.getClass(), "maxCountMusic", 0);
        setIntField(term7294, term7294.getClass(), "maxCountMusicItem", 0);
        setIntField(term7294, term7294.getClass(), "macCountRivalMusic", 0);
        term7304 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7304;
        callMethod(klass, "setMaxCountCard", argTypes, term7294, args);
    }

};


