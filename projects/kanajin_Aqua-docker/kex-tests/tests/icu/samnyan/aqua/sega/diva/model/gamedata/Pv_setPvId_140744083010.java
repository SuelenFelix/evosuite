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

public class Pv_setPvId_140744083010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1521;
     Object term1613;

    public Pv_setPvId_140744083010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1522 = new Integer(-1697741339);
        Integer term1524 = new Integer(98922530);
        Integer term1598 = new Integer(-1388471422);
        HashMap term1600 = new HashMap();
        term1521 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term1521, term1521.getClass(), "pvId", term1522);
        setField(term1521, term1521.getClass(), "bpm", term1524);
        setField(term1521, term1521.getClass(), "songName", "yevIIoVYHq");
        setField(term1521, term1521.getClass(), "songNameEng", "UuYWMTqWTV");
        setField(term1521, term1521.getClass(), "songNameReading", "DSFGlcaXUb");
        setField(term1521, term1521.getClass(), "arranger", "sHMXNUzNeM");
        setField(term1521, term1521.getClass(), "lyrics", "gPzGDOEPPw");
        setField(term1521, term1521.getClass(), "music", "rwKoAngzCu");
        setField(term1521, term1521.getClass(), "performerNumber", term1598);
        setField(term1521, term1521.getClass(), "difficulty", term1600);
        term1613 = new Integer(-243422082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1613;
        callMethod(klass, "setPvId", argTypes, term1521, args);
    }

};


