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

public class Pv_getDifficulty_18010173489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1369;

    public Pv_getDifficulty_18010173489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1370 = new Integer(-1963464809);
        Integer term1372 = new Integer(71190297);
        Integer term1446 = new Integer(1202361360);
        HashMap term1448 = new HashMap();
        term1369 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term1369, term1369.getClass(), "pvId", term1370);
        setField(term1369, term1369.getClass(), "bpm", term1372);
        setField(term1369, term1369.getClass(), "songName", "vSeruUyNWX");
        setField(term1369, term1369.getClass(), "songNameEng", "UkKvaeJfEC");
        setField(term1369, term1369.getClass(), "songNameReading", "WPxXsahPRq");
        setField(term1369, term1369.getClass(), "arranger", "IENRuqmwUU");
        setField(term1369, term1369.getClass(), "lyrics", "GsWxOwXvSu");
        setField(term1369, term1369.getClass(), "music", "bKBSncrMEZ");
        setField(term1369, term1369.getClass(), "performerNumber", term1446);
        setField(term1369, term1369.getClass(), "difficulty", term1448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDifficulty", argTypes, term1369, args);
    }

};


