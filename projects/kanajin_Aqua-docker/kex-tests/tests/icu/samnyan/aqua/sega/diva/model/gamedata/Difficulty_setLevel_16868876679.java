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

public class Difficulty_setLevel_16868876679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6104;

    public Difficulty_setLevel_16868876679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6107 = new Integer(-47438786);
        Integer term6109 = new Integer(-1955400589);
        Integer term6183 = new Integer(626179200);
        HashMap term6185 = new HashMap();
        term6104 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term6106 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term6104, term6104.getClass(), "id", -8019730974733786399L);
        setField(term6106, term6106.getClass(), "pvId", term6107);
        setField(term6106, term6106.getClass(), "bpm", term6109);
        setField(term6106, term6106.getClass(), "songName", "sgpUSVSuVZ");
        setField(term6106, term6106.getClass(), "songNameEng", "ZOYhOzwINI");
        setField(term6106, term6106.getClass(), "songNameReading", "sPqjQQfymN");
        setField(term6106, term6106.getClass(), "arranger", "tNKFzflLBd");
        setField(term6106, term6106.getClass(), "lyrics", "xHLlctEoGh");
        setField(term6106, term6106.getClass(), "music", "aqgUzcnqpE");
        setField(term6106, term6106.getClass(), "performerNumber", term6183);
        setField(term6106, term6106.getClass(), "difficulty", term6185);
        setField(term6104, term6104.getClass(), "pv", term6106);
        setIntField(term6104, term6104.getClass(), "edition", 1003743923);
        setField(term6104, term6104.getClass(), "level", "vjNETNMDhQ");
        setIntField(term6104, term6104.getClass(), "version", 1887772522);
        setField(term6104, term6104.getClass(), "diff", "pexqQqwSNj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "myfXkIEBSV";
        callMethod(klass, "setLevel", argTypes, term6104, args);
    }

};


