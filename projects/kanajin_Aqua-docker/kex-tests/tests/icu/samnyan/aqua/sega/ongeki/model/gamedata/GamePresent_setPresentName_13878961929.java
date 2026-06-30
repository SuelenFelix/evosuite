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

public class GamePresent_setPresentName_13878961929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19013;

    public GamePresent_setPresentName_13878961929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19013 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent"));
        setLongField(term19013, term19013.getClass(), "presentId", -5786861555969446503L);
        setField(term19013, term19013.getClass(), "presentName", "UBPHmOICBs");
        setIntField(term19013, term19013.getClass(), "rewardId", 114754804);
        setIntField(term19013, term19013.getClass(), "stock", 1687361082);
        setField(term19013, term19013.getClass(), "message", "IDJUVPgUJf");
        setField(term19013, term19013.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term19013, term19013.getClass(), "endDate", "2099-01-01 05:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JmnWRJUxGr";
        callMethod(klass, "setPresentName", argTypes, term19013, args);
    }

};


