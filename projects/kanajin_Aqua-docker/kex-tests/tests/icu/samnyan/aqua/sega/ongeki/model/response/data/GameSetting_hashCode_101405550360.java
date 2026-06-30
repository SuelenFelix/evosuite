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

public class GameSetting_hashCode_101405550360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7374;

    public GameSetting_hashCode_101405550360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7374 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term7374, term7374.getClass(), "dataVersion", null);
        setField(term7374, term7374.getClass(), "onlineDataVersion", null);
        setBooleanField(term7374, term7374.getClass(), "isMaintenance", false);
        setIntField(term7374, term7374.getClass(), "requestInterval", 0);
        setField(term7374, term7374.getClass(), "rebootStartTime", null);
        setField(term7374, term7374.getClass(), "rebootEndTime", null);
        setBooleanField(term7374, term7374.getClass(), "isBackgroundDistribute", false);
        setIntField(term7374, term7374.getClass(), "maxCountCharacter", 0);
        setIntField(term7374, term7374.getClass(), "maxCountCard", 0);
        setIntField(term7374, term7374.getClass(), "maxCountItem", 0);
        setIntField(term7374, term7374.getClass(), "maxCountMusic", 0);
        setIntField(term7374, term7374.getClass(), "maxCountMusicItem", 0);
        setIntField(term7374, term7374.getClass(), "macCountRivalMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7374, args);
    }

};


