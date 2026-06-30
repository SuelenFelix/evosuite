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

public class GameSetting_canEqual_23879380127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6675;
     Object term6733;

    public GameSetting_canEqual_23879380127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6675 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term6675, term6675.getClass(), "dataVersion", "HUgzMgrpsK");
        setField(term6675, term6675.getClass(), "onlineDataVersion", "ubaBUfLolu");
        setBooleanField(term6675, term6675.getClass(), "isMaintenance", true);
        setIntField(term6675, term6675.getClass(), "requestInterval", -640763660);
        setField(term6675, term6675.getClass(), "rebootStartTime", "itAUCFhZhq");
        setField(term6675, term6675.getClass(), "rebootEndTime", "bIqaKgXgPm");
        setBooleanField(term6675, term6675.getClass(), "isBackgroundDistribute", true);
        setIntField(term6675, term6675.getClass(), "maxCountCharacter", -1189468129);
        setIntField(term6675, term6675.getClass(), "maxCountCard", -1099664830);
        setIntField(term6675, term6675.getClass(), "maxCountItem", 873502011);
        setIntField(term6675, term6675.getClass(), "maxCountMusic", -2004575734);
        setIntField(term6675, term6675.getClass(), "maxCountMusicItem", 1491468856);
        setIntField(term6675, term6675.getClass(), "macCountRivalMusic", 962385185);
        term6733 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6733;
        callMethod(klass, "canEqual", argTypes, term6675, args);
    }

};


