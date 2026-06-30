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

public class Difficulty_getId_3621981330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4193;

    public Difficulty_getId_3621981330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4196 = new Integer(1467356494);
        Integer term4198 = new Integer(-26316536);
        Integer term4272 = new Integer(1716165145);
        HashMap term4274 = new HashMap();
        term4193 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term4195 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term4193, term4193.getClass(), "id", -5724112525188606013L);
        setField(term4195, term4195.getClass(), "pvId", term4196);
        setField(term4195, term4195.getClass(), "bpm", term4198);
        setField(term4195, term4195.getClass(), "songName", "wwSknqIBIO");
        setField(term4195, term4195.getClass(), "songNameEng", "zQPAxUFaeX");
        setField(term4195, term4195.getClass(), "songNameReading", "cKNHUkrYfK");
        setField(term4195, term4195.getClass(), "arranger", "crMeWqJOCQ");
        setField(term4195, term4195.getClass(), "lyrics", "VUVgiQvSYa");
        setField(term4195, term4195.getClass(), "music", "sEGgJJplmE");
        setField(term4195, term4195.getClass(), "performerNumber", term4272);
        setField(term4195, term4195.getClass(), "difficulty", term4274);
        setField(term4193, term4193.getClass(), "pv", term4195);
        setIntField(term4193, term4193.getClass(), "edition", -18216811);
        setField(term4193, term4193.getClass(), "level", "GeVOqtDiGv");
        setIntField(term4193, term4193.getClass(), "version", -1813280137);
        setField(term4193, term4193.getClass(), "diff", "vbRAJCwftU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4193, args);
    }

};


