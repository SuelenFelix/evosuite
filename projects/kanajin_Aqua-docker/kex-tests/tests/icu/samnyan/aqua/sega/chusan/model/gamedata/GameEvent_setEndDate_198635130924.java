package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameEvent_setEndDate_198635130924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427;

    public GameEvent_setEndDate_198635130924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term427 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent"));
        setIntField(term427, term427.getClass(), "id", 0);
        setIntField(term427, term427.getClass(), "type", 0);
        setField(term427, term427.getClass(), "startDate", null);
        setField(term427, term427.getClass(), "endDate", null);
        setBooleanField(term427, term427.getClass(), "enable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEndDate", argTypes, term427, args);
    }

};


