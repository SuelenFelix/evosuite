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
import java.lang.Long;

public class GameSession_setId_27528384150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453359;
     Object term453362;

    public GameSession_setId_27528384150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453359 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        setLongField(term453359, term453359.getClass(), "id", 0L);
        setIntField(term453359, term453359.getClass(), "acceptId", 0);
        setField(term453359, term453359.getClass(), "pdId", null);
        setField(term453359, term453359.getClass(), "startMode", null);
        setField(term453359, term453359.getClass(), "startTime", null);
        setField(term453359, term453359.getClass(), "lastUpdateTime", null);
        setField(term453359, term453359.getClass(), "stageIndex", null);
        setField(term453359, term453359.getClass(), "stageResultIndex", null);
        setField(term453359, term453359.getClass(), "lastPvId", null);
        setField(term453359, term453359.getClass(), "levelNumber", null);
        setField(term453359, term453359.getClass(), "levelExp", null);
        setField(term453359, term453359.getClass(), "oldLevelNumber", null);
        setField(term453359, term453359.getClass(), "oldLevelExp", null);
        setField(term453359, term453359.getClass(), "vp", null);
        term453362 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term453362;
        callMethod(klass, "setId", argTypes, term453359, args);
    }

};


