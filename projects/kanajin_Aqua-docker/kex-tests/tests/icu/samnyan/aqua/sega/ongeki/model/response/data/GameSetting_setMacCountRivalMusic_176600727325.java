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

public class GameSetting_setMacCountRivalMusic_176600727325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6476;
     Object term6534;

    public GameSetting_setMacCountRivalMusic_176600727325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6476 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term6476, term6476.getClass(), "dataVersion", "KpurAcrHYT");
        setField(term6476, term6476.getClass(), "onlineDataVersion", "QjvDwgKJGz");
        setBooleanField(term6476, term6476.getClass(), "isMaintenance", true);
        setIntField(term6476, term6476.getClass(), "requestInterval", -1483966656);
        setField(term6476, term6476.getClass(), "rebootStartTime", "ngYxiXTZrk");
        setField(term6476, term6476.getClass(), "rebootEndTime", "YTxBqWRAlo");
        setBooleanField(term6476, term6476.getClass(), "isBackgroundDistribute", true);
        setIntField(term6476, term6476.getClass(), "maxCountCharacter", -334260786);
        setIntField(term6476, term6476.getClass(), "maxCountCard", -765890956);
        setIntField(term6476, term6476.getClass(), "maxCountItem", -214452542);
        setIntField(term6476, term6476.getClass(), "maxCountMusic", -21429773);
        setIntField(term6476, term6476.getClass(), "maxCountMusicItem", 1774728742);
        setIntField(term6476, term6476.getClass(), "macCountRivalMusic", -1822211508);
        term6534 = new Integer(-177243872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6534;
        callMethod(klass, "setMacCountRivalMusic", argTypes, term6476, args);
    }

};


