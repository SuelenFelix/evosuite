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

public class GameSetting_getOnlineDataVersion_32737312033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7086;

    public GameSetting_getOnlineDataVersion_32737312033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7086 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term7086, term7086.getClass(), "dataVersion", null);
        setField(term7086, term7086.getClass(), "onlineDataVersion", null);
        setBooleanField(term7086, term7086.getClass(), "isMaintenance", false);
        setIntField(term7086, term7086.getClass(), "requestInterval", 0);
        setField(term7086, term7086.getClass(), "rebootStartTime", null);
        setField(term7086, term7086.getClass(), "rebootEndTime", null);
        setBooleanField(term7086, term7086.getClass(), "isBackgroundDistribute", false);
        setIntField(term7086, term7086.getClass(), "maxCountCharacter", 0);
        setIntField(term7086, term7086.getClass(), "maxCountCard", 0);
        setIntField(term7086, term7086.getClass(), "maxCountItem", 0);
        setIntField(term7086, term7086.getClass(), "maxCountMusic", 0);
        setIntField(term7086, term7086.getClass(), "maxCountMusicItem", 0);
        setIntField(term7086, term7086.getClass(), "macCountRivalMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOnlineDataVersion", argTypes, term7086, args);
    }

};


