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

public class Difficulty_setDiff_28591588611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6518;

    public Difficulty_setDiff_28591588611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6521 = new Integer(2107679041);
        Integer term6523 = new Integer(2040965507);
        Integer term6597 = new Integer(-1281083262);
        HashMap term6599 = new HashMap();
        term6518 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term6520 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term6518, term6518.getClass(), "id", -4867941246533901410L);
        setField(term6520, term6520.getClass(), "pvId", term6521);
        setField(term6520, term6520.getClass(), "bpm", term6523);
        setField(term6520, term6520.getClass(), "songName", "DInvDrzBtt");
        setField(term6520, term6520.getClass(), "songNameEng", "igZJubDPuK");
        setField(term6520, term6520.getClass(), "songNameReading", "qxBdFhLbAN");
        setField(term6520, term6520.getClass(), "arranger", "KyUmXHRrED");
        setField(term6520, term6520.getClass(), "lyrics", "eOMBFVrNcf");
        setField(term6520, term6520.getClass(), "music", "gOwOIsocMB");
        setField(term6520, term6520.getClass(), "performerNumber", term6597);
        setField(term6520, term6520.getClass(), "difficulty", term6599);
        setField(term6518, term6518.getClass(), "pv", term6520);
        setIntField(term6518, term6518.getClass(), "edition", -763166094);
        setField(term6518, term6518.getClass(), "level", "tcaaotqgDF");
        setIntField(term6518, term6518.getClass(), "version", -222941705);
        setField(term6518, term6518.getClass(), "diff", "bXInWdOeyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HdwopulXkf";
        callMethod(klass, "setDiff", argTypes, term6518, args);
    }

};


