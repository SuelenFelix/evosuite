package icu.samnyan.aqua.sega.diva.model.userdata;

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
import static icu.samnyan.aqua.sega.diva.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSession_hashCode_206098760966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453411;

    public GameSession_hashCode_206098760966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453411 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        setLongField(term453411, term453411.getClass(), "id", 0L);
        setIntField(term453411, term453411.getClass(), "acceptId", 0);
        setField(term453411, term453411.getClass(), "pdId", null);
        setField(term453411, term453411.getClass(), "startMode", null);
        setField(term453411, term453411.getClass(), "startTime", null);
        setField(term453411, term453411.getClass(), "lastUpdateTime", null);
        setField(term453411, term453411.getClass(), "stageIndex", null);
        setField(term453411, term453411.getClass(), "stageResultIndex", null);
        setField(term453411, term453411.getClass(), "lastPvId", null);
        setField(term453411, term453411.getClass(), "levelNumber", null);
        setField(term453411, term453411.getClass(), "levelExp", null);
        setField(term453411, term453411.getClass(), "oldLevelNumber", null);
        setField(term453411, term453411.getClass(), "oldLevelExp", null);
        setField(term453411, term453411.getClass(), "vp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term453411, args);
    }

};


