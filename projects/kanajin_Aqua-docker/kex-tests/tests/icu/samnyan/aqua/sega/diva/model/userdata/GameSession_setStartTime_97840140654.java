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

public class GameSession_setStartTime_97840140654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453375;

    public GameSession_setStartTime_97840140654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453375 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        setLongField(term453375, term453375.getClass(), "id", 0L);
        setIntField(term453375, term453375.getClass(), "acceptId", 0);
        setField(term453375, term453375.getClass(), "pdId", null);
        setField(term453375, term453375.getClass(), "startMode", null);
        setField(term453375, term453375.getClass(), "startTime", null);
        setField(term453375, term453375.getClass(), "lastUpdateTime", null);
        setField(term453375, term453375.getClass(), "stageIndex", null);
        setField(term453375, term453375.getClass(), "stageResultIndex", null);
        setField(term453375, term453375.getClass(), "lastPvId", null);
        setField(term453375, term453375.getClass(), "levelNumber", null);
        setField(term453375, term453375.getClass(), "levelExp", null);
        setField(term453375, term453375.getClass(), "oldLevelNumber", null);
        setField(term453375, term453375.getClass(), "oldLevelExp", null);
        setField(term453375, term453375.getClass(), "vp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStartTime", argTypes, term453375, args);
    }

};


