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

public class GameSetting_setBackgroundDistribute_39186576319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5876;
     Object term5934;

    public GameSetting_setBackgroundDistribute_39186576319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5876 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term5876, term5876.getClass(), "dataVersion", "FlxVmiMYKP");
        setField(term5876, term5876.getClass(), "onlineDataVersion", "fgOpAWlGYN");
        setBooleanField(term5876, term5876.getClass(), "isMaintenance", false);
        setIntField(term5876, term5876.getClass(), "requestInterval", -1833121756);
        setField(term5876, term5876.getClass(), "rebootStartTime", "PNzNzzjSXM");
        setField(term5876, term5876.getClass(), "rebootEndTime", "ktKcSZiuGM");
        setBooleanField(term5876, term5876.getClass(), "isBackgroundDistribute", true);
        setIntField(term5876, term5876.getClass(), "maxCountCharacter", -1493632787);
        setIntField(term5876, term5876.getClass(), "maxCountCard", -1056969264);
        setIntField(term5876, term5876.getClass(), "maxCountItem", -709130701);
        setIntField(term5876, term5876.getClass(), "maxCountMusic", 86144663);
        setIntField(term5876, term5876.getClass(), "maxCountMusicItem", -1480903995);
        setIntField(term5876, term5876.getClass(), "macCountRivalMusic", -2111772603);
        term5934 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5934;
        callMethod(klass, "setBackgroundDistribute", argTypes, term5876, args);
    }

};


