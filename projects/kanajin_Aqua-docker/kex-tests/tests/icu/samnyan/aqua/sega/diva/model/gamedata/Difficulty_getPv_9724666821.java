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

public class Difficulty_getPv_9724666821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4388;

    public Difficulty_getPv_9724666821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4391 = new Integer(-1271375703);
        Integer term4393 = new Integer(1136208236);
        Integer term4467 = new Integer(-1220630391);
        HashMap term4469 = new HashMap();
        term4388 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term4390 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term4388, term4388.getClass(), "id", 3090901538358721367L);
        setField(term4390, term4390.getClass(), "pvId", term4391);
        setField(term4390, term4390.getClass(), "bpm", term4393);
        setField(term4390, term4390.getClass(), "songName", "baJbjUImxp");
        setField(term4390, term4390.getClass(), "songNameEng", "lPERFqPpGz");
        setField(term4390, term4390.getClass(), "songNameReading", "jleFBTYSNb");
        setField(term4390, term4390.getClass(), "arranger", "WmSSWHEELj");
        setField(term4390, term4390.getClass(), "lyrics", "ggFhMyQvdw");
        setField(term4390, term4390.getClass(), "music", "vZpMxQNHKu");
        setField(term4390, term4390.getClass(), "performerNumber", term4467);
        setField(term4390, term4390.getClass(), "difficulty", term4469);
        setField(term4388, term4388.getClass(), "pv", term4390);
        setIntField(term4388, term4388.getClass(), "edition", -1865023308);
        setField(term4388, term4388.getClass(), "level", "IwvwrQylib");
        setIntField(term4388, term4388.getClass(), "version", 1698510819);
        setField(term4388, term4388.getClass(), "diff", "ZWJgSttNjg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPv", argTypes, term4388, args);
    }

};


