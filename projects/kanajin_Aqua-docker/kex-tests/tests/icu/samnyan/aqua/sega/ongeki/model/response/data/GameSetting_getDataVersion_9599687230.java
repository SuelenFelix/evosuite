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

public class GameSetting_getDataVersion_9599687230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3922;

    public GameSetting_getDataVersion_9599687230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3922 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term3922, term3922.getClass(), "dataVersion", "NZdTuwSCIM");
        setField(term3922, term3922.getClass(), "onlineDataVersion", "dDHcmzPAmP");
        setBooleanField(term3922, term3922.getClass(), "isMaintenance", true);
        setIntField(term3922, term3922.getClass(), "requestInterval", 1223703911);
        setField(term3922, term3922.getClass(), "rebootStartTime", "HEaTkWYBgv");
        setField(term3922, term3922.getClass(), "rebootEndTime", "MpJsPKLTIU");
        setBooleanField(term3922, term3922.getClass(), "isBackgroundDistribute", false);
        setIntField(term3922, term3922.getClass(), "maxCountCharacter", -1824905298);
        setIntField(term3922, term3922.getClass(), "maxCountCard", -2062724184);
        setIntField(term3922, term3922.getClass(), "maxCountItem", -716654499);
        setIntField(term3922, term3922.getClass(), "maxCountMusic", 1641117123);
        setIntField(term3922, term3922.getClass(), "maxCountMusicItem", -1084408453);
        setIntField(term3922, term3922.getClass(), "macCountRivalMusic", -1466822773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataVersion", argTypes, term3922, args);
    }

};


