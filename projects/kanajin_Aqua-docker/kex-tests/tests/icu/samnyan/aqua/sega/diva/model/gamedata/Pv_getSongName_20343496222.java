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

public class Pv_getSongName_20343496222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305;

    public Pv_getSongName_20343496222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term306 = new Integer(-203030934);
        Integer term308 = new Integer(-1179120542);
        Integer term382 = new Integer(-73683645);
        HashMap term384 = new HashMap();
        term305 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term305, term305.getClass(), "pvId", term306);
        setField(term305, term305.getClass(), "bpm", term308);
        setField(term305, term305.getClass(), "songName", "swZVeJAxjt");
        setField(term305, term305.getClass(), "songNameEng", "xOcJIiQQDu");
        setField(term305, term305.getClass(), "songNameReading", "GVizqqzXpy");
        setField(term305, term305.getClass(), "arranger", "JqXGgAhZPl");
        setField(term305, term305.getClass(), "lyrics", "jiKYgYHqIS");
        setField(term305, term305.getClass(), "music", "DfISiziTgG");
        setField(term305, term305.getClass(), "performerNumber", term382);
        setField(term305, term305.getClass(), "difficulty", term384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSongName", argTypes, term305, args);
    }

};


