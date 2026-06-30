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

public class GameSession_setVp_192472702063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453402;

    public GameSession_setVp_192472702063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453402 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        setLongField(term453402, term453402.getClass(), "id", 0L);
        setIntField(term453402, term453402.getClass(), "acceptId", 0);
        setField(term453402, term453402.getClass(), "pdId", null);
        setField(term453402, term453402.getClass(), "startMode", null);
        setField(term453402, term453402.getClass(), "startTime", null);
        setField(term453402, term453402.getClass(), "lastUpdateTime", null);
        setField(term453402, term453402.getClass(), "stageIndex", null);
        setField(term453402, term453402.getClass(), "stageResultIndex", null);
        setField(term453402, term453402.getClass(), "lastPvId", null);
        setField(term453402, term453402.getClass(), "levelNumber", null);
        setField(term453402, term453402.getClass(), "levelExp", null);
        setField(term453402, term453402.getClass(), "oldLevelNumber", null);
        setField(term453402, term453402.getClass(), "oldLevelExp", null);
        setField(term453402, term453402.getClass(), "vp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVp", argTypes, term453402, args);
    }

};


