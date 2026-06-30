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

public class GamePresent_getStock_12921216114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18331;

    public GamePresent_getStock_12921216114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18331 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent"));
        setLongField(term18331, term18331.getClass(), "presentId", 4949335493504695457L);
        setField(term18331, term18331.getClass(), "presentName", "CwNELDTAPP");
        setIntField(term18331, term18331.getClass(), "rewardId", -1239406390);
        setIntField(term18331, term18331.getClass(), "stock", 1557431527);
        setField(term18331, term18331.getClass(), "message", "GSzQdbHLHw");
        setField(term18331, term18331.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term18331, term18331.getClass(), "endDate", "2099-01-01 05:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStock", argTypes, term18331, args);
    }

};


