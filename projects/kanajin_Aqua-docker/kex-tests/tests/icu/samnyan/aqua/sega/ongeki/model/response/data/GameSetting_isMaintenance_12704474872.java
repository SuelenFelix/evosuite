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

public class GameSetting_isMaintenance_12704474872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4118;

    public GameSetting_isMaintenance_12704474872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4118 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term4118, term4118.getClass(), "dataVersion", "zyZTzHNjQr");
        setField(term4118, term4118.getClass(), "onlineDataVersion", "YSrFKQQwXE");
        setBooleanField(term4118, term4118.getClass(), "isMaintenance", true);
        setIntField(term4118, term4118.getClass(), "requestInterval", -1547322575);
        setField(term4118, term4118.getClass(), "rebootStartTime", "qxhOsmyyjm");
        setField(term4118, term4118.getClass(), "rebootEndTime", "DuKcNfVVYR");
        setBooleanField(term4118, term4118.getClass(), "isBackgroundDistribute", false);
        setIntField(term4118, term4118.getClass(), "maxCountCharacter", -61444233);
        setIntField(term4118, term4118.getClass(), "maxCountCard", -400720912);
        setIntField(term4118, term4118.getClass(), "maxCountItem", 1266192397);
        setIntField(term4118, term4118.getClass(), "maxCountMusic", 218346781);
        setIntField(term4118, term4118.getClass(), "maxCountMusicItem", -984660976);
        setIntField(term4118, term4118.getClass(), "macCountRivalMusic", -1419341969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMaintenance", argTypes, term4118, args);
    }

};


