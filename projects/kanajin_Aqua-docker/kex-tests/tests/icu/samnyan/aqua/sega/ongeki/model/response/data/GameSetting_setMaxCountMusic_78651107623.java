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

public class GameSetting_setMaxCountMusic_78651107623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6276;
     Object term6334;

    public GameSetting_setMaxCountMusic_78651107623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6276 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term6276, term6276.getClass(), "dataVersion", "YcTbglHiUq");
        setField(term6276, term6276.getClass(), "onlineDataVersion", "TiUqHrjoEU");
        setBooleanField(term6276, term6276.getClass(), "isMaintenance", false);
        setIntField(term6276, term6276.getClass(), "requestInterval", 2095699770);
        setField(term6276, term6276.getClass(), "rebootStartTime", "eoEvZbdLjL");
        setField(term6276, term6276.getClass(), "rebootEndTime", "BkIxsyPkGy");
        setBooleanField(term6276, term6276.getClass(), "isBackgroundDistribute", false);
        setIntField(term6276, term6276.getClass(), "maxCountCharacter", -1365904757);
        setIntField(term6276, term6276.getClass(), "maxCountCard", -1487263349);
        setIntField(term6276, term6276.getClass(), "maxCountItem", -1009732764);
        setIntField(term6276, term6276.getClass(), "maxCountMusic", 950783153);
        setIntField(term6276, term6276.getClass(), "maxCountMusicItem", -801175078);
        setIntField(term6276, term6276.getClass(), "macCountRivalMusic", 2085098404);
        term6334 = new Integer(-684064427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6334;
        callMethod(klass, "setMaxCountMusic", argTypes, term6276, args);
    }

};


