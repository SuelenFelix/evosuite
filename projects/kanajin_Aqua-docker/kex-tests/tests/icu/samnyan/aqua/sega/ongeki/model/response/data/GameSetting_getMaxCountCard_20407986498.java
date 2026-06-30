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

public class GameSetting_getMaxCountCard_20407986498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4706;

    public GameSetting_getMaxCountCard_20407986498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4706 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term4706, term4706.getClass(), "dataVersion", "TVxGTjeDcu");
        setField(term4706, term4706.getClass(), "onlineDataVersion", "ABPtcyCzkR");
        setBooleanField(term4706, term4706.getClass(), "isMaintenance", true);
        setIntField(term4706, term4706.getClass(), "requestInterval", -1477091217);
        setField(term4706, term4706.getClass(), "rebootStartTime", "QgHhxMyKvr");
        setField(term4706, term4706.getClass(), "rebootEndTime", "VGiXZZTWRO");
        setBooleanField(term4706, term4706.getClass(), "isBackgroundDistribute", false);
        setIntField(term4706, term4706.getClass(), "maxCountCharacter", 2023226154);
        setIntField(term4706, term4706.getClass(), "maxCountCard", 2111611214);
        setIntField(term4706, term4706.getClass(), "maxCountItem", -2031129784);
        setIntField(term4706, term4706.getClass(), "maxCountMusic", 251039122);
        setIntField(term4706, term4706.getClass(), "maxCountMusicItem", 459471826);
        setIntField(term4706, term4706.getClass(), "macCountRivalMusic", -1054011286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCountCard", argTypes, term4706, args);
    }

};


