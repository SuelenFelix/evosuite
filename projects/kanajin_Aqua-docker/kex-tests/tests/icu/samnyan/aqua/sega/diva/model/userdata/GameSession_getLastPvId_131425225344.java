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

public class GameSession_getLastPvId_131425225344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453341;

    public GameSession_getLastPvId_131425225344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453341 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        setLongField(term453341, term453341.getClass(), "id", 0L);
        setIntField(term453341, term453341.getClass(), "acceptId", 0);
        setField(term453341, term453341.getClass(), "pdId", null);
        setField(term453341, term453341.getClass(), "startMode", null);
        setField(term453341, term453341.getClass(), "startTime", null);
        setField(term453341, term453341.getClass(), "lastUpdateTime", null);
        setField(term453341, term453341.getClass(), "stageIndex", null);
        setField(term453341, term453341.getClass(), "stageResultIndex", null);
        setField(term453341, term453341.getClass(), "lastPvId", null);
        setField(term453341, term453341.getClass(), "levelNumber", null);
        setField(term453341, term453341.getClass(), "levelExp", null);
        setField(term453341, term453341.getClass(), "oldLevelNumber", null);
        setField(term453341, term453341.getClass(), "oldLevelExp", null);
        setField(term453341, term453341.getClass(), "vp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPvId", argTypes, term453341, args);
    }

};


