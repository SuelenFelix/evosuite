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

public class GameSetting_hashCode_101405550328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6774;

    public GameSetting_hashCode_101405550328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6774 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term6774, term6774.getClass(), "dataVersion", "uOJFOUcNvv");
        setField(term6774, term6774.getClass(), "onlineDataVersion", "tkmmGweDwJ");
        setBooleanField(term6774, term6774.getClass(), "isMaintenance", true);
        setIntField(term6774, term6774.getClass(), "requestInterval", 2146718886);
        setField(term6774, term6774.getClass(), "rebootStartTime", "pMfTuAFXxg");
        setField(term6774, term6774.getClass(), "rebootEndTime", "XCZmhkblRc");
        setBooleanField(term6774, term6774.getClass(), "isBackgroundDistribute", true);
        setIntField(term6774, term6774.getClass(), "maxCountCharacter", -985577036);
        setIntField(term6774, term6774.getClass(), "maxCountCard", 802539130);
        setIntField(term6774, term6774.getClass(), "maxCountItem", 2105146188);
        setIntField(term6774, term6774.getClass(), "maxCountMusic", -862415480);
        setIntField(term6774, term6774.getClass(), "maxCountMusicItem", 312605349);
        setIntField(term6774, term6774.getClass(), "macCountRivalMusic", -402072606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6774, args);
    }

};


