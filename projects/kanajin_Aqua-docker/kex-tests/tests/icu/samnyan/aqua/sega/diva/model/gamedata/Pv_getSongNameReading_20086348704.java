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

public class Pv_getSongNameReading_20086348704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609;

    public Pv_getSongNameReading_20086348704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term610 = new Integer(1596070772);
        Integer term612 = new Integer(97029295);
        Integer term686 = new Integer(-1371869594);
        HashMap term688 = new HashMap();
        term609 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term609, term609.getClass(), "pvId", term610);
        setField(term609, term609.getClass(), "bpm", term612);
        setField(term609, term609.getClass(), "songName", "DyiXbeYIaN");
        setField(term609, term609.getClass(), "songNameEng", "VGizxZnyHX");
        setField(term609, term609.getClass(), "songNameReading", "kVEZMHmRtR");
        setField(term609, term609.getClass(), "arranger", "ekxGuOYIwi");
        setField(term609, term609.getClass(), "lyrics", "RbVQXSpxXy");
        setField(term609, term609.getClass(), "music", "YpJbIgJWWv");
        setField(term609, term609.getClass(), "performerNumber", term686);
        setField(term609, term609.getClass(), "difficulty", term688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSongNameReading", argTypes, term609, args);
    }

};


