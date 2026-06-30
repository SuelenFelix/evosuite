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

public class GameSession_getPdId_179383157638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453323;

    public GameSession_getPdId_179383157638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453323 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        setLongField(term453323, term453323.getClass(), "id", 0L);
        setIntField(term453323, term453323.getClass(), "acceptId", 0);
        setField(term453323, term453323.getClass(), "pdId", null);
        setField(term453323, term453323.getClass(), "startMode", null);
        setField(term453323, term453323.getClass(), "startTime", null);
        setField(term453323, term453323.getClass(), "lastUpdateTime", null);
        setField(term453323, term453323.getClass(), "stageIndex", null);
        setField(term453323, term453323.getClass(), "stageResultIndex", null);
        setField(term453323, term453323.getClass(), "lastPvId", null);
        setField(term453323, term453323.getClass(), "levelNumber", null);
        setField(term453323, term453323.getClass(), "levelExp", null);
        setField(term453323, term453323.getClass(), "oldLevelNumber", null);
        setField(term453323, term453323.getClass(), "oldLevelExp", null);
        setField(term453323, term453323.getClass(), "vp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdId", argTypes, term453323, args);
    }

};


