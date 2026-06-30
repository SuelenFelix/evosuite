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

public class Pv_hashCode_154287845448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4191;

    public Pv_hashCode_154287845448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4191 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term4191, term4191.getClass(), "pvId", null);
        setField(term4191, term4191.getClass(), "bpm", null);
        setField(term4191, term4191.getClass(), "songName", null);
        setField(term4191, term4191.getClass(), "songNameEng", null);
        setField(term4191, term4191.getClass(), "songNameReading", null);
        setField(term4191, term4191.getClass(), "arranger", null);
        setField(term4191, term4191.getClass(), "lyrics", null);
        setField(term4191, term4191.getClass(), "music", null);
        setField(term4191, term4191.getClass(), "performerNumber", null);
        setField(term4191, term4191.getClass(), "difficulty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4191, args);
    }

};


