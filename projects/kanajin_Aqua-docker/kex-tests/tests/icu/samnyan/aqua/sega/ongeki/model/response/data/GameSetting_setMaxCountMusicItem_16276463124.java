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

public class GameSetting_setMaxCountMusicItem_16276463124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6376;
     Object term6434;

    public GameSetting_setMaxCountMusicItem_16276463124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6376 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term6376, term6376.getClass(), "dataVersion", "mrMGwoRgVY");
        setField(term6376, term6376.getClass(), "onlineDataVersion", "mxVLTgCwki");
        setBooleanField(term6376, term6376.getClass(), "isMaintenance", false);
        setIntField(term6376, term6376.getClass(), "requestInterval", -1981080836);
        setField(term6376, term6376.getClass(), "rebootStartTime", "wCurppnDSA");
        setField(term6376, term6376.getClass(), "rebootEndTime", "JydxSNTMYt");
        setBooleanField(term6376, term6376.getClass(), "isBackgroundDistribute", false);
        setIntField(term6376, term6376.getClass(), "maxCountCharacter", -176676344);
        setIntField(term6376, term6376.getClass(), "maxCountCard", 1949009312);
        setIntField(term6376, term6376.getClass(), "maxCountItem", -432054743);
        setIntField(term6376, term6376.getClass(), "maxCountMusic", -859726380);
        setIntField(term6376, term6376.getClass(), "maxCountMusicItem", -1498422654);
        setIntField(term6376, term6376.getClass(), "macCountRivalMusic", -1499829233);
        term6434 = new Integer(-888855662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6434;
        callMethod(klass, "setMaxCountMusicItem", argTypes, term6376, args);
    }

};


