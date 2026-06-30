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

public class GameSetting_setMaxCountItem_150658625254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7306;
     Object term7316;

    public GameSetting_setMaxCountItem_150658625254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7306 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term7306, term7306.getClass(), "dataVersion", null);
        setField(term7306, term7306.getClass(), "onlineDataVersion", null);
        setBooleanField(term7306, term7306.getClass(), "isMaintenance", false);
        setIntField(term7306, term7306.getClass(), "requestInterval", 0);
        setField(term7306, term7306.getClass(), "rebootStartTime", null);
        setField(term7306, term7306.getClass(), "rebootEndTime", null);
        setBooleanField(term7306, term7306.getClass(), "isBackgroundDistribute", false);
        setIntField(term7306, term7306.getClass(), "maxCountCharacter", 0);
        setIntField(term7306, term7306.getClass(), "maxCountCard", 0);
        setIntField(term7306, term7306.getClass(), "maxCountItem", 0);
        setIntField(term7306, term7306.getClass(), "maxCountMusic", 0);
        setIntField(term7306, term7306.getClass(), "maxCountMusicItem", 0);
        setIntField(term7306, term7306.getClass(), "macCountRivalMusic", 0);
        term7316 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7316;
        callMethod(klass, "setMaxCountItem", argTypes, term7306, args);
    }

};


