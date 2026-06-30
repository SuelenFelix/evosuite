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

public class GameSetting_setOnlineDataVersion_137471846446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7216;

    public GameSetting_setOnlineDataVersion_137471846446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7216 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term7216, term7216.getClass(), "dataVersion", null);
        setField(term7216, term7216.getClass(), "onlineDataVersion", null);
        setBooleanField(term7216, term7216.getClass(), "isMaintenance", false);
        setIntField(term7216, term7216.getClass(), "requestInterval", 0);
        setField(term7216, term7216.getClass(), "rebootStartTime", null);
        setField(term7216, term7216.getClass(), "rebootEndTime", null);
        setBooleanField(term7216, term7216.getClass(), "isBackgroundDistribute", false);
        setIntField(term7216, term7216.getClass(), "maxCountCharacter", 0);
        setIntField(term7216, term7216.getClass(), "maxCountCard", 0);
        setIntField(term7216, term7216.getClass(), "maxCountItem", 0);
        setIntField(term7216, term7216.getClass(), "maxCountMusic", 0);
        setIntField(term7216, term7216.getClass(), "maxCountMusicItem", 0);
        setIntField(term7216, term7216.getClass(), "macCountRivalMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOnlineDataVersion", argTypes, term7216, args);
    }

};


