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
import java.lang.Integer;

public class GameMusic_setBossCardId_196328264117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15207;
     Object term15319;

    public GameMusic_setBossCardId_196328264117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15207 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term15207, term15207.getClass(), "id", -8652538484981166496L);
        setField(term15207, term15207.getClass(), "name", "mwmFMNEzkK");
        setField(term15207, term15207.getClass(), "sortName", "kVAmKknVln");
        setField(term15207, term15207.getClass(), "artistName", "MRFLbEGYKG");
        setField(term15207, term15207.getClass(), "genre", "BYrGukTyof");
        setIntField(term15207, term15207.getClass(), "bossCardId", 9726679);
        setIntField(term15207, term15207.getClass(), "bossLevel", -25637976);
        setField(term15207, term15207.getClass(), "level0", "jiCGTTzKGB");
        setField(term15207, term15207.getClass(), "level1", "MqICFYzDJj");
        setField(term15207, term15207.getClass(), "level2", "YgQvdcBQKw");
        setField(term15207, term15207.getClass(), "level3", "FiYYLuailz");
        setField(term15207, term15207.getClass(), "level4", "XebAeSnCKZ");
        term15319 = new Integer(1555897383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15319;
        callMethod(klass, "setBossCardId", argTypes, term15207, args);
    }

};


