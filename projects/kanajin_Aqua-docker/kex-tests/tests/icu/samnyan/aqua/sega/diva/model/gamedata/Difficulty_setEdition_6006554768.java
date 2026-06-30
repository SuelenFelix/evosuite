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

public class Difficulty_setEdition_6006554768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5907;
     Object term6022;

    public Difficulty_setEdition_6006554768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5910 = new Integer(1104108112);
        Integer term5912 = new Integer(1648665618);
        Integer term5986 = new Integer(633765954);
        HashMap term5988 = new HashMap();
        term5907 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term5909 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term5907, term5907.getClass(), "id", 5904678961906211249L);
        setField(term5909, term5909.getClass(), "pvId", term5910);
        setField(term5909, term5909.getClass(), "bpm", term5912);
        setField(term5909, term5909.getClass(), "songName", "EOsBgwlmva");
        setField(term5909, term5909.getClass(), "songNameEng", "qcSJruZuJy");
        setField(term5909, term5909.getClass(), "songNameReading", "NOSJtfgqAs");
        setField(term5909, term5909.getClass(), "arranger", "SUDRrjpChc");
        setField(term5909, term5909.getClass(), "lyrics", "pmpprxfFwy");
        setField(term5909, term5909.getClass(), "music", "AQbnQoJwOO");
        setField(term5909, term5909.getClass(), "performerNumber", term5986);
        setField(term5909, term5909.getClass(), "difficulty", term5988);
        setField(term5907, term5907.getClass(), "pv", term5909);
        setIntField(term5907, term5907.getClass(), "edition", -370828664);
        setField(term5907, term5907.getClass(), "level", "xfqaJVcHGx");
        setIntField(term5907, term5907.getClass(), "version", 1168633950);
        setField(term5907, term5907.getClass(), "diff", "bANxpqKESI");
        term6022 = new Integer(1607082164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6022;
        callMethod(klass, "setEdition", argTypes, term5907, args);
    }

};


