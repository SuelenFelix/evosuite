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

public class GameSetting_setMaxCountCharacter_84369423220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5976;
     Object term6034;

    public GameSetting_setMaxCountCharacter_84369423220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5976 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term5976, term5976.getClass(), "dataVersion", "PSOttyUeqv");
        setField(term5976, term5976.getClass(), "onlineDataVersion", "HmEvTlmzXo");
        setBooleanField(term5976, term5976.getClass(), "isMaintenance", false);
        setIntField(term5976, term5976.getClass(), "requestInterval", 637942911);
        setField(term5976, term5976.getClass(), "rebootStartTime", "BMMonTIZgJ");
        setField(term5976, term5976.getClass(), "rebootEndTime", "QXyFXBjFde");
        setBooleanField(term5976, term5976.getClass(), "isBackgroundDistribute", true);
        setIntField(term5976, term5976.getClass(), "maxCountCharacter", -395396657);
        setIntField(term5976, term5976.getClass(), "maxCountCard", 1677171453);
        setIntField(term5976, term5976.getClass(), "maxCountItem", -2108979704);
        setIntField(term5976, term5976.getClass(), "maxCountMusic", 1629835601);
        setIntField(term5976, term5976.getClass(), "maxCountMusicItem", 1866184476);
        setIntField(term5976, term5976.getClass(), "macCountRivalMusic", -17998574);
        term6034 = new Integer(145080354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6034;
        callMethod(klass, "setMaxCountCharacter", argTypes, term5976, args);
    }

};


