package icu.samnyan.aqua.sega.ongeki.model.gamedata;

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
import static icu.samnyan.aqua.sega.ongeki.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class GameSkill_setId_212213189618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term963;
     Object term965;

    public GameSkill_setId_212213189618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term963 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameSkill"));
        setLongField(term963, term963.getClass(), "id", 0L);
        setField(term963, term963.getClass(), "name", null);
        setField(term963, term963.getClass(), "category", null);
        setField(term963, term963.getClass(), "info", null);
        term965 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameSkill");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term965;
        callMethod(klass, "setId", argTypes, term963, args);
    }

};


