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

public class Pv_setArranger_135682231241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4184;

    public Pv_setArranger_135682231241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4184 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term4184, term4184.getClass(), "pvId", null);
        setField(term4184, term4184.getClass(), "bpm", null);
        setField(term4184, term4184.getClass(), "songName", null);
        setField(term4184, term4184.getClass(), "songNameEng", null);
        setField(term4184, term4184.getClass(), "songNameReading", null);
        setField(term4184, term4184.getClass(), "arranger", null);
        setField(term4184, term4184.getClass(), "lyrics", null);
        setField(term4184, term4184.getClass(), "music", null);
        setField(term4184, term4184.getClass(), "performerNumber", null);
        setField(term4184, term4184.getClass(), "difficulty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setArranger", argTypes, term4184, args);
    }

};


