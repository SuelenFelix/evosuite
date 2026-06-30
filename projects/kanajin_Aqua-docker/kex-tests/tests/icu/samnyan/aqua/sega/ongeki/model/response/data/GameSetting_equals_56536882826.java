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

public class GameSetting_equals_56536882826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6576;
     Object term6634;

    public GameSetting_equals_56536882826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6576 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term6576, term6576.getClass(), "dataVersion", "ReruUQRXwl");
        setField(term6576, term6576.getClass(), "onlineDataVersion", "DWEsVQwuaE");
        setBooleanField(term6576, term6576.getClass(), "isMaintenance", false);
        setIntField(term6576, term6576.getClass(), "requestInterval", 1485047282);
        setField(term6576, term6576.getClass(), "rebootStartTime", "qGkNzZAeDN");
        setField(term6576, term6576.getClass(), "rebootEndTime", "wdtiuPgTVJ");
        setBooleanField(term6576, term6576.getClass(), "isBackgroundDistribute", true);
        setIntField(term6576, term6576.getClass(), "maxCountCharacter", 1624190794);
        setIntField(term6576, term6576.getClass(), "maxCountCard", -773608881);
        setIntField(term6576, term6576.getClass(), "maxCountItem", -1642688455);
        setIntField(term6576, term6576.getClass(), "maxCountMusic", -1184558215);
        setIntField(term6576, term6576.getClass(), "maxCountMusicItem", 2123688338);
        setIntField(term6576, term6576.getClass(), "macCountRivalMusic", -1051941387);
        term6634 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6634;
        callMethod(klass, "equals", argTypes, term6576, args);
    }

};


