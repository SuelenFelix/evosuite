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

public class GameSetting_setMaxCountCharacter_84369423252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7282;
     Object term7292;

    public GameSetting_setMaxCountCharacter_84369423252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7282 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term7282, term7282.getClass(), "dataVersion", null);
        setField(term7282, term7282.getClass(), "onlineDataVersion", null);
        setBooleanField(term7282, term7282.getClass(), "isMaintenance", false);
        setIntField(term7282, term7282.getClass(), "requestInterval", 0);
        setField(term7282, term7282.getClass(), "rebootStartTime", null);
        setField(term7282, term7282.getClass(), "rebootEndTime", null);
        setBooleanField(term7282, term7282.getClass(), "isBackgroundDistribute", false);
        setIntField(term7282, term7282.getClass(), "maxCountCharacter", 0);
        setIntField(term7282, term7282.getClass(), "maxCountCard", 0);
        setIntField(term7282, term7282.getClass(), "maxCountItem", 0);
        setIntField(term7282, term7282.getClass(), "maxCountMusic", 0);
        setIntField(term7282, term7282.getClass(), "maxCountMusicItem", 0);
        setIntField(term7282, term7282.getClass(), "macCountRivalMusic", 0);
        term7292 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7292;
        callMethod(klass, "setMaxCountCharacter", argTypes, term7282, args);
    }

};


