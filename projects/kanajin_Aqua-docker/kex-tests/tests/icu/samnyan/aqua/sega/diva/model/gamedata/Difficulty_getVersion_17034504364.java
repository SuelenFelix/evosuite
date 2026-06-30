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

public class Difficulty_getVersion_17034504364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4973;

    public Difficulty_getVersion_17034504364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4976 = new Integer(299791142);
        Integer term4978 = new Integer(1862191391);
        Integer term5052 = new Integer(1131398807);
        HashMap term5054 = new HashMap();
        term4973 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term4975 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term4973, term4973.getClass(), "id", -7310273014364148916L);
        setField(term4975, term4975.getClass(), "pvId", term4976);
        setField(term4975, term4975.getClass(), "bpm", term4978);
        setField(term4975, term4975.getClass(), "songName", "IoRhBfdSuN");
        setField(term4975, term4975.getClass(), "songNameEng", "JGdxVjQzts");
        setField(term4975, term4975.getClass(), "songNameReading", "jEdjRikQtN");
        setField(term4975, term4975.getClass(), "arranger", "fSNUaokVWs");
        setField(term4975, term4975.getClass(), "lyrics", "dTxnMmHoVm");
        setField(term4975, term4975.getClass(), "music", "iswxaQUQgT");
        setField(term4975, term4975.getClass(), "performerNumber", term5052);
        setField(term4975, term4975.getClass(), "difficulty", term5054);
        setField(term4973, term4973.getClass(), "pv", term4975);
        setIntField(term4973, term4973.getClass(), "edition", 1988605357);
        setField(term4973, term4973.getClass(), "level", "hHNIOlOzJc");
        setIntField(term4973, term4973.getClass(), "version", 808203320);
        setField(term4973, term4973.getClass(), "diff", "ALRSeULyWV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term4973, args);
    }

};


