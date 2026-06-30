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

public class GamePresent_equals_150372855115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19921;
     Object term19995;

    public GamePresent_equals_150372855115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19921 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent"));
        setLongField(term19921, term19921.getClass(), "presentId", -685023850445639859L);
        setField(term19921, term19921.getClass(), "presentName", "iUkOOQhEkw");
        setIntField(term19921, term19921.getClass(), "rewardId", -1222614956);
        setIntField(term19921, term19921.getClass(), "stock", -1870495012);
        setField(term19921, term19921.getClass(), "message", "wmVoFoUVmU");
        setField(term19921, term19921.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term19921, term19921.getClass(), "endDate", "2099-01-01 05:00:00.0");
        term19995 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term19995;
        callMethod(klass, "equals", argTypes, term19921, args);
    }

};


