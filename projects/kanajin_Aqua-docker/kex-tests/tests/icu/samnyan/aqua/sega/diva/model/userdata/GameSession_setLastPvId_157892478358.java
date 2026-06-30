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

public class GameSession_setLastPvId_157892478358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453387;

    public GameSession_setLastPvId_157892478358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453387 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        setLongField(term453387, term453387.getClass(), "id", 0L);
        setIntField(term453387, term453387.getClass(), "acceptId", 0);
        setField(term453387, term453387.getClass(), "pdId", null);
        setField(term453387, term453387.getClass(), "startMode", null);
        setField(term453387, term453387.getClass(), "startTime", null);
        setField(term453387, term453387.getClass(), "lastUpdateTime", null);
        setField(term453387, term453387.getClass(), "stageIndex", null);
        setField(term453387, term453387.getClass(), "stageResultIndex", null);
        setField(term453387, term453387.getClass(), "lastPvId", null);
        setField(term453387, term453387.getClass(), "levelNumber", null);
        setField(term453387, term453387.getClass(), "levelExp", null);
        setField(term453387, term453387.getClass(), "oldLevelNumber", null);
        setField(term453387, term453387.getClass(), "oldLevelExp", null);
        setField(term453387, term453387.getClass(), "vp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPvId", argTypes, term453387, args);
    }

};


