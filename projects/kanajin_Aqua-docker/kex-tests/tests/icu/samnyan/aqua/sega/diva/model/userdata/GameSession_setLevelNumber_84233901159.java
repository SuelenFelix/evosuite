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

public class GameSession_setLevelNumber_84233901159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453390;

    public GameSession_setLevelNumber_84233901159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453390 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        setLongField(term453390, term453390.getClass(), "id", 0L);
        setIntField(term453390, term453390.getClass(), "acceptId", 0);
        setField(term453390, term453390.getClass(), "pdId", null);
        setField(term453390, term453390.getClass(), "startMode", null);
        setField(term453390, term453390.getClass(), "startTime", null);
        setField(term453390, term453390.getClass(), "lastUpdateTime", null);
        setField(term453390, term453390.getClass(), "stageIndex", null);
        setField(term453390, term453390.getClass(), "stageResultIndex", null);
        setField(term453390, term453390.getClass(), "lastPvId", null);
        setField(term453390, term453390.getClass(), "levelNumber", null);
        setField(term453390, term453390.getClass(), "levelExp", null);
        setField(term453390, term453390.getClass(), "oldLevelNumber", null);
        setField(term453390, term453390.getClass(), "oldLevelExp", null);
        setField(term453390, term453390.getClass(), "vp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLevelNumber", argTypes, term453390, args);
    }

};


