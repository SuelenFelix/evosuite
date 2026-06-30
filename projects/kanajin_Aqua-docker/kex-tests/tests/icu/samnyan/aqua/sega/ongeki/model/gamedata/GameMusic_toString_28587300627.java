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

public class GameMusic_toString_28587300627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17343;

    public GameMusic_toString_28587300627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17343 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term17343, term17343.getClass(), "id", 3133860696238261492L);
        setField(term17343, term17343.getClass(), "name", "mRBtFTxVdE");
        setField(term17343, term17343.getClass(), "sortName", "IVacFDAZcj");
        setField(term17343, term17343.getClass(), "artistName", "EEYmuwyVDP");
        setField(term17343, term17343.getClass(), "genre", "EWFbEDAVrE");
        setIntField(term17343, term17343.getClass(), "bossCardId", 1384592638);
        setIntField(term17343, term17343.getClass(), "bossLevel", -1002370457);
        setField(term17343, term17343.getClass(), "level0", "EMiMtYgfvr");
        setField(term17343, term17343.getClass(), "level1", "OyYyYYnJuF");
        setField(term17343, term17343.getClass(), "level2", "aYLvcxZohT");
        setField(term17343, term17343.getClass(), "level3", "mnHyQbMyld");
        setField(term17343, term17343.getClass(), "level4", "KHtaDOIcJZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17343, args);
    }

};


