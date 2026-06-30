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

public class GameSession_equals_161230093464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453405;

    public GameSession_equals_161230093464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453405 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        setLongField(term453405, term453405.getClass(), "id", 0L);
        setIntField(term453405, term453405.getClass(), "acceptId", 0);
        setField(term453405, term453405.getClass(), "pdId", null);
        setField(term453405, term453405.getClass(), "startMode", null);
        setField(term453405, term453405.getClass(), "startTime", null);
        setField(term453405, term453405.getClass(), "lastUpdateTime", null);
        setField(term453405, term453405.getClass(), "stageIndex", null);
        setField(term453405, term453405.getClass(), "stageResultIndex", null);
        setField(term453405, term453405.getClass(), "lastPvId", null);
        setField(term453405, term453405.getClass(), "levelNumber", null);
        setField(term453405, term453405.getClass(), "levelExp", null);
        setField(term453405, term453405.getClass(), "oldLevelNumber", null);
        setField(term453405, term453405.getClass(), "oldLevelExp", null);
        setField(term453405, term453405.getClass(), "vp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term453405, args);
    }

};


