package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.HashMap;

public class Pv_equals_109419177920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3284;
     Object term3376;

    public Pv_equals_109419177920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3285 = new Integer(-100825168);
        Integer term3287 = new Integer(768407648);
        Integer term3361 = new Integer(-350454594);
        HashMap term3363 = new HashMap();
        term3284 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term3284, term3284.getClass(), "pvId", term3285);
        setField(term3284, term3284.getClass(), "bpm", term3287);
        setField(term3284, term3284.getClass(), "songName", "kevWstoxwq");
        setField(term3284, term3284.getClass(), "songNameEng", "aSYOhFwzSm");
        setField(term3284, term3284.getClass(), "songNameReading", "pVZlzrBeDB");
        setField(term3284, term3284.getClass(), "arranger", "EfSUvjuZAA");
        setField(term3284, term3284.getClass(), "lyrics", "PrHWfHydsG");
        setField(term3284, term3284.getClass(), "music", "igruEzTbBE");
        setField(term3284, term3284.getClass(), "performerNumber", term3361);
        setField(term3284, term3284.getClass(), "difficulty", term3363);
        term3376 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3376;
        callMethod(klass, "equals", argTypes, term3284, args);
    }

};


