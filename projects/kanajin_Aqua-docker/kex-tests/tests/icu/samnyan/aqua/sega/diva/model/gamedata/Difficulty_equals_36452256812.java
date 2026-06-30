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
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;

public class Difficulty_equals_36452256812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6735;
     Object term6850;

    public Difficulty_equals_36452256812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6738 = new Integer(852806940);
        Integer term6740 = new Integer(698551724);
        Integer term6814 = new Integer(-1631048635);
        HashMap term6816 = new HashMap();
        term6735 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term6737 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term6735, term6735.getClass(), "id", 1253549421411622358L);
        setField(term6737, term6737.getClass(), "pvId", term6738);
        setField(term6737, term6737.getClass(), "bpm", term6740);
        setField(term6737, term6737.getClass(), "songName", "FuCKfgAhpC");
        setField(term6737, term6737.getClass(), "songNameEng", "gqMysJhxfA");
        setField(term6737, term6737.getClass(), "songNameReading", "HtLEppUqzI");
        setField(term6737, term6737.getClass(), "arranger", "bVlRrMQeRY");
        setField(term6737, term6737.getClass(), "lyrics", "SXaXhlzAIB");
        setField(term6737, term6737.getClass(), "music", "UPVTXSXUNh");
        setField(term6737, term6737.getClass(), "performerNumber", term6814);
        setField(term6737, term6737.getClass(), "difficulty", term6816);
        setField(term6735, term6735.getClass(), "pv", term6737);
        setIntField(term6735, term6735.getClass(), "edition", 433248783);
        setField(term6735, term6735.getClass(), "level", "lwwreKJCFL");
        setIntField(term6735, term6735.getClass(), "version", -507944154);
        setField(term6735, term6735.getClass(), "diff", "PWBggYjpOQ");
        term6850 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6850;
        callMethod(klass, "equals", argTypes, term6735, args);
    }

};


