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

public class Difficulty_getLevel_12632192513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4778;

    public Difficulty_getLevel_12632192513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4781 = new Integer(-1415256843);
        Integer term4783 = new Integer(612177768);
        Integer term4857 = new Integer(-1626451656);
        HashMap term4859 = new HashMap();
        term4778 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term4780 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term4778, term4778.getClass(), "id", -1505191021111100819L);
        setField(term4780, term4780.getClass(), "pvId", term4781);
        setField(term4780, term4780.getClass(), "bpm", term4783);
        setField(term4780, term4780.getClass(), "songName", "ipoyEHBfoG");
        setField(term4780, term4780.getClass(), "songNameEng", "iSBTpbiteU");
        setField(term4780, term4780.getClass(), "songNameReading", "MTwFbEoMZj");
        setField(term4780, term4780.getClass(), "arranger", "uEQbnHbyAn");
        setField(term4780, term4780.getClass(), "lyrics", "JpFIuyNEKW");
        setField(term4780, term4780.getClass(), "music", "NksHsgcqDx");
        setField(term4780, term4780.getClass(), "performerNumber", term4857);
        setField(term4780, term4780.getClass(), "difficulty", term4859);
        setField(term4778, term4778.getClass(), "pv", term4780);
        setIntField(term4778, term4778.getClass(), "edition", 1023209512);
        setField(term4778, term4778.getClass(), "level", "QpEVWispEh");
        setIntField(term4778, term4778.getClass(), "version", 1084849225);
        setField(term4778, term4778.getClass(), "diff", "STofGrqXqL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term4778, args);
    }

};


