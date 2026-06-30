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

public class Pv_getPerformerNumber_12425739788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1217;

    public Pv_getPerformerNumber_12425739788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1218 = new Integer(1386130016);
        Integer term1220 = new Integer(1072005683);
        Integer term1294 = new Integer(1861318859);
        HashMap term1296 = new HashMap();
        term1217 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term1217, term1217.getClass(), "pvId", term1218);
        setField(term1217, term1217.getClass(), "bpm", term1220);
        setField(term1217, term1217.getClass(), "songName", "AWYyZiNfsm");
        setField(term1217, term1217.getClass(), "songNameEng", "ITRRYiuDwH");
        setField(term1217, term1217.getClass(), "songNameReading", "llRfwANcVF");
        setField(term1217, term1217.getClass(), "arranger", "sUEeHQTWkA");
        setField(term1217, term1217.getClass(), "lyrics", "BDIRCxAWLA");
        setField(term1217, term1217.getClass(), "music", "eOJfbiZLnb");
        setField(term1217, term1217.getClass(), "performerNumber", term1294);
        setField(term1217, term1217.getClass(), "difficulty", term1296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerformerNumber", argTypes, term1217, args);
    }

};


