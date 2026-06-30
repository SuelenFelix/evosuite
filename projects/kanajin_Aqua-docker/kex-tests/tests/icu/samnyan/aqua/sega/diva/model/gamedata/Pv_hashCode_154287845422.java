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

public class Pv_hashCode_154287845422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3590;

    public Pv_hashCode_154287845422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3591 = new Integer(833762980);
        Integer term3593 = new Integer(320711637);
        Integer term3667 = new Integer(1241164745);
        HashMap term3669 = new HashMap();
        term3590 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term3590, term3590.getClass(), "pvId", term3591);
        setField(term3590, term3590.getClass(), "bpm", term3593);
        setField(term3590, term3590.getClass(), "songName", "IyOhWYyaDV");
        setField(term3590, term3590.getClass(), "songNameEng", "omWrkCSFzy");
        setField(term3590, term3590.getClass(), "songNameReading", "VFYvUTgYFB");
        setField(term3590, term3590.getClass(), "arranger", "BrWqhEIUUj");
        setField(term3590, term3590.getClass(), "lyrics", "WfUmxdiHcU");
        setField(term3590, term3590.getClass(), "music", "BRrftvRvmF");
        setField(term3590, term3590.getClass(), "performerNumber", term3667);
        setField(term3590, term3590.getClass(), "difficulty", term3669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3590, args);
    }

};


