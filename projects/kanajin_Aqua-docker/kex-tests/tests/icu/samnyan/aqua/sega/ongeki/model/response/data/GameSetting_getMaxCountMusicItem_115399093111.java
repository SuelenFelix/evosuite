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

public class GameSetting_getMaxCountMusicItem_115399093111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5000;

    public GameSetting_getMaxCountMusicItem_115399093111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5000 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term5000, term5000.getClass(), "dataVersion", "ujxmmZZcbT");
        setField(term5000, term5000.getClass(), "onlineDataVersion", "BOvgwHfoHQ");
        setBooleanField(term5000, term5000.getClass(), "isMaintenance", false);
        setIntField(term5000, term5000.getClass(), "requestInterval", 61954667);
        setField(term5000, term5000.getClass(), "rebootStartTime", "hPpFNeDBIb");
        setField(term5000, term5000.getClass(), "rebootEndTime", "DNOtiLPAIY");
        setBooleanField(term5000, term5000.getClass(), "isBackgroundDistribute", false);
        setIntField(term5000, term5000.getClass(), "maxCountCharacter", -919022885);
        setIntField(term5000, term5000.getClass(), "maxCountCard", -1836286878);
        setIntField(term5000, term5000.getClass(), "maxCountItem", 276336694);
        setIntField(term5000, term5000.getClass(), "maxCountMusic", 1627938506);
        setIntField(term5000, term5000.getClass(), "maxCountMusicItem", 386284750);
        setIntField(term5000, term5000.getClass(), "macCountRivalMusic", 906856023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCountMusicItem", argTypes, term5000, args);
    }

};


