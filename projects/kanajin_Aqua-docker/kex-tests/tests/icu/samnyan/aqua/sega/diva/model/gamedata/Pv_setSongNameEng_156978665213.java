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

public class Pv_setSongNameEng_156978665213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2003;

    public Pv_setSongNameEng_156978665213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2004 = new Integer(-1945706126);
        Integer term2006 = new Integer(1152356969);
        Integer term2080 = new Integer(-1667990367);
        HashMap term2082 = new HashMap();
        term2003 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term2003, term2003.getClass(), "pvId", term2004);
        setField(term2003, term2003.getClass(), "bpm", term2006);
        setField(term2003, term2003.getClass(), "songName", "EMiMtYgfvr");
        setField(term2003, term2003.getClass(), "songNameEng", "OyYyYYnJuF");
        setField(term2003, term2003.getClass(), "songNameReading", "aYLvcxZohT");
        setField(term2003, term2003.getClass(), "arranger", "mnHyQbMyld");
        setField(term2003, term2003.getClass(), "lyrics", "KHtaDOIcJZ");
        setField(term2003, term2003.getClass(), "music", "vgdwrCZczl");
        setField(term2003, term2003.getClass(), "performerNumber", term2080);
        setField(term2003, term2003.getClass(), "difficulty", term2082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pDqgDbJoFw";
        callMethod(klass, "setSongNameEng", argTypes, term2003, args);
    }

};


