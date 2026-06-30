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

public class GamePresent_equals_150372855136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20629;

    public GamePresent_equals_150372855136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20629 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent"));
        setLongField(term20629, term20629.getClass(), "presentId", 0L);
        setField(term20629, term20629.getClass(), "presentName", null);
        setIntField(term20629, term20629.getClass(), "rewardId", 0);
        setIntField(term20629, term20629.getClass(), "stock", 0);
        setField(term20629, term20629.getClass(), "message", null);
        setField(term20629, term20629.getClass(), "startDate", null);
        setField(term20629, term20629.getClass(), "endDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term20629, args);
    }

};


