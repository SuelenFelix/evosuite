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

public class GameSession_getOldLevelExp_172942387248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453353;

    public GameSession_getOldLevelExp_172942387248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453353 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        setLongField(term453353, term453353.getClass(), "id", 0L);
        setIntField(term453353, term453353.getClass(), "acceptId", 0);
        setField(term453353, term453353.getClass(), "pdId", null);
        setField(term453353, term453353.getClass(), "startMode", null);
        setField(term453353, term453353.getClass(), "startTime", null);
        setField(term453353, term453353.getClass(), "lastUpdateTime", null);
        setField(term453353, term453353.getClass(), "stageIndex", null);
        setField(term453353, term453353.getClass(), "stageResultIndex", null);
        setField(term453353, term453353.getClass(), "lastPvId", null);
        setField(term453353, term453353.getClass(), "levelNumber", null);
        setField(term453353, term453353.getClass(), "levelExp", null);
        setField(term453353, term453353.getClass(), "oldLevelNumber", null);
        setField(term453353, term453353.getClass(), "oldLevelExp", null);
        setField(term453353, term453353.getClass(), "vp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOldLevelExp", argTypes, term453353, args);
    }

};


