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

public class GameSession_setLevelExp_104477774760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453393;

    public GameSession_setLevelExp_104477774760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453393 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        setLongField(term453393, term453393.getClass(), "id", 0L);
        setIntField(term453393, term453393.getClass(), "acceptId", 0);
        setField(term453393, term453393.getClass(), "pdId", null);
        setField(term453393, term453393.getClass(), "startMode", null);
        setField(term453393, term453393.getClass(), "startTime", null);
        setField(term453393, term453393.getClass(), "lastUpdateTime", null);
        setField(term453393, term453393.getClass(), "stageIndex", null);
        setField(term453393, term453393.getClass(), "stageResultIndex", null);
        setField(term453393, term453393.getClass(), "lastPvId", null);
        setField(term453393, term453393.getClass(), "levelNumber", null);
        setField(term453393, term453393.getClass(), "levelExp", null);
        setField(term453393, term453393.getClass(), "oldLevelNumber", null);
        setField(term453393, term453393.getClass(), "oldLevelExp", null);
        setField(term453393, term453393.getClass(), "vp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLevelExp", argTypes, term453393, args);
    }

};


