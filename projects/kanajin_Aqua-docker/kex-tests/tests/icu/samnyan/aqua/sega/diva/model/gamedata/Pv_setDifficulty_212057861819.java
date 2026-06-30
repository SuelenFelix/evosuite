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
import java.util.LinkedHashMap;

public class Pv_setDifficulty_212057861819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3027;
     Object term3119;

    public Pv_setDifficulty_212057861819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3028 = new Integer(-1533843432);
        Integer term3030 = new Integer(-123338791);
        Integer term3104 = new Integer(-1467089634);
        HashMap term3106 = new HashMap();
        term3027 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term3027, term3027.getClass(), "pvId", term3028);
        setField(term3027, term3027.getClass(), "bpm", term3030);
        setField(term3027, term3027.getClass(), "songName", "uUgJfKAzDM");
        setField(term3027, term3027.getClass(), "songNameEng", "gZPZNkweEp");
        setField(term3027, term3027.getClass(), "songNameReading", "vfennwtmqe");
        setField(term3027, term3027.getClass(), "arranger", "zZxoNkohbw");
        setField(term3027, term3027.getClass(), "lyrics", "DQrjPcLysX");
        setField(term3027, term3027.getClass(), "music", "VWPFyrpmmb");
        setField(term3027, term3027.getClass(), "performerNumber", term3104);
        setField(term3027, term3027.getClass(), "difficulty", term3106);
        term3119 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term3119;
        callMethod(klass, "setDifficulty", argTypes, term3027, args);
    }

};


