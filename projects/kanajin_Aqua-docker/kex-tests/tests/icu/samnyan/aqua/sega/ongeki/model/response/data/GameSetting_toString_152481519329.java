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

public class GameSetting_toString_152481519329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6872;

    public GameSetting_toString_152481519329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6872 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term6872, term6872.getClass(), "dataVersion", "gFUWMydGCU");
        setField(term6872, term6872.getClass(), "onlineDataVersion", "LLegSTfqJt");
        setBooleanField(term6872, term6872.getClass(), "isMaintenance", true);
        setIntField(term6872, term6872.getClass(), "requestInterval", -477355193);
        setField(term6872, term6872.getClass(), "rebootStartTime", "XQfmqLbqHS");
        setField(term6872, term6872.getClass(), "rebootEndTime", "jLVLqQSjqg");
        setBooleanField(term6872, term6872.getClass(), "isBackgroundDistribute", true);
        setIntField(term6872, term6872.getClass(), "maxCountCharacter", 168425089);
        setIntField(term6872, term6872.getClass(), "maxCountCard", -571931590);
        setIntField(term6872, term6872.getClass(), "maxCountItem", 37757400);
        setIntField(term6872, term6872.getClass(), "maxCountMusic", -1632221612);
        setIntField(term6872, term6872.getClass(), "maxCountMusicItem", 1545314376);
        setIntField(term6872, term6872.getClass(), "macCountRivalMusic", 437959151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6872, args);
    }

};


