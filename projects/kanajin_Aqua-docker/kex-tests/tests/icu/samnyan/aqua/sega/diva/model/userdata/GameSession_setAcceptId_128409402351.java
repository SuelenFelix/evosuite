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
import java.lang.Integer;

public class GameSession_setAcceptId_128409402351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453364;
     Object term453367;

    public GameSession_setAcceptId_128409402351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453364 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        setLongField(term453364, term453364.getClass(), "id", 0L);
        setIntField(term453364, term453364.getClass(), "acceptId", 0);
        setField(term453364, term453364.getClass(), "pdId", null);
        setField(term453364, term453364.getClass(), "startMode", null);
        setField(term453364, term453364.getClass(), "startTime", null);
        setField(term453364, term453364.getClass(), "lastUpdateTime", null);
        setField(term453364, term453364.getClass(), "stageIndex", null);
        setField(term453364, term453364.getClass(), "stageResultIndex", null);
        setField(term453364, term453364.getClass(), "lastPvId", null);
        setField(term453364, term453364.getClass(), "levelNumber", null);
        setField(term453364, term453364.getClass(), "levelExp", null);
        setField(term453364, term453364.getClass(), "oldLevelNumber", null);
        setField(term453364, term453364.getClass(), "oldLevelExp", null);
        setField(term453364, term453364.getClass(), "vp", null);
        term453367 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term453367;
        callMethod(klass, "setAcceptId", argTypes, term453364, args);
    }

};


