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
import java.lang.Boolean;

public class GameSetting_setBackgroundDistribute_39186576351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7270;
     Object term7280;

    public GameSetting_setBackgroundDistribute_39186576351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7270 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term7270, term7270.getClass(), "dataVersion", null);
        setField(term7270, term7270.getClass(), "onlineDataVersion", null);
        setBooleanField(term7270, term7270.getClass(), "isMaintenance", false);
        setIntField(term7270, term7270.getClass(), "requestInterval", 0);
        setField(term7270, term7270.getClass(), "rebootStartTime", null);
        setField(term7270, term7270.getClass(), "rebootEndTime", null);
        setBooleanField(term7270, term7270.getClass(), "isBackgroundDistribute", false);
        setIntField(term7270, term7270.getClass(), "maxCountCharacter", 0);
        setIntField(term7270, term7270.getClass(), "maxCountCard", 0);
        setIntField(term7270, term7270.getClass(), "maxCountItem", 0);
        setIntField(term7270, term7270.getClass(), "maxCountMusic", 0);
        setIntField(term7270, term7270.getClass(), "maxCountMusicItem", 0);
        setIntField(term7270, term7270.getClass(), "macCountRivalMusic", 0);
        term7280 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7280;
        callMethod(klass, "setBackgroundDistribute", argTypes, term7270, args);
    }

};


