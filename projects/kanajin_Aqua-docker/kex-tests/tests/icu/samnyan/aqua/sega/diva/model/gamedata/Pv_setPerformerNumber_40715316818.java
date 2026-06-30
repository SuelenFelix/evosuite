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

public class Pv_setPerformerNumber_40715316818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2873;
     Object term2965;

    public Pv_setPerformerNumber_40715316818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2874 = new Integer(-376422566);
        Integer term2876 = new Integer(306847454);
        Integer term2950 = new Integer(1745276158);
        HashMap term2952 = new HashMap();
        term2873 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term2873, term2873.getClass(), "pvId", term2874);
        setField(term2873, term2873.getClass(), "bpm", term2876);
        setField(term2873, term2873.getClass(), "songName", "maXrGOGoKA");
        setField(term2873, term2873.getClass(), "songNameEng", "zAkgWQVCpM");
        setField(term2873, term2873.getClass(), "songNameReading", "yQUDyOroXU");
        setField(term2873, term2873.getClass(), "arranger", "xweqkPdyJH");
        setField(term2873, term2873.getClass(), "lyrics", "kwteHWzwcc");
        setField(term2873, term2873.getClass(), "music", "uMsWXqNhln");
        setField(term2873, term2873.getClass(), "performerNumber", term2950);
        setField(term2873, term2873.getClass(), "difficulty", term2952);
        term2965 = new Integer(-43417861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2965;
        callMethod(klass, "setPerformerNumber", argTypes, term2873, args);
    }

};


