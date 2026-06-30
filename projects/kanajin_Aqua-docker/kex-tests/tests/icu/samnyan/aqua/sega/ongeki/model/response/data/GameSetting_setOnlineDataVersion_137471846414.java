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

public class GameSetting_setOnlineDataVersion_137471846414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5316;

    public GameSetting_setOnlineDataVersion_137471846414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5316 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term5316, term5316.getClass(), "dataVersion", "lEcrFlxJXH");
        setField(term5316, term5316.getClass(), "onlineDataVersion", "VNdDwXMYxR");
        setBooleanField(term5316, term5316.getClass(), "isMaintenance", true);
        setIntField(term5316, term5316.getClass(), "requestInterval", -491132382);
        setField(term5316, term5316.getClass(), "rebootStartTime", "bVbexZPmwW");
        setField(term5316, term5316.getClass(), "rebootEndTime", "tvxYdqiyGc");
        setBooleanField(term5316, term5316.getClass(), "isBackgroundDistribute", false);
        setIntField(term5316, term5316.getClass(), "maxCountCharacter", 918882916);
        setIntField(term5316, term5316.getClass(), "maxCountCard", 1544012770);
        setIntField(term5316, term5316.getClass(), "maxCountItem", 1922068039);
        setIntField(term5316, term5316.getClass(), "maxCountMusic", -410564443);
        setIntField(term5316, term5316.getClass(), "maxCountMusicItem", 996017434);
        setIntField(term5316, term5316.getClass(), "macCountRivalMusic", -983870300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZEXFoMSKeG";
        callMethod(klass, "setOnlineDataVersion", argTypes, term5316, args);
    }

};


