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

public class Pv_setSongName_67427523412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1829;

    public Pv_setSongName_67427523412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1830 = new Integer(1358829571);
        Integer term1832 = new Integer(991356662);
        Integer term1906 = new Integer(-506958186);
        HashMap term1908 = new HashMap();
        term1829 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term1829, term1829.getClass(), "pvId", term1830);
        setField(term1829, term1829.getClass(), "bpm", term1832);
        setField(term1829, term1829.getClass(), "songName", "zMsSLTfGhl");
        setField(term1829, term1829.getClass(), "songNameEng", "bEmHScVZaQ");
        setField(term1829, term1829.getClass(), "songNameReading", "TcuXODkzBV");
        setField(term1829, term1829.getClass(), "arranger", "coJPjrBZNe");
        setField(term1829, term1829.getClass(), "lyrics", "vMsWjuPTnO");
        setField(term1829, term1829.getClass(), "music", "zHvfKaOstO");
        setField(term1829, term1829.getClass(), "performerNumber", term1906);
        setField(term1829, term1829.getClass(), "difficulty", term1908);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EWFbEDAVrE";
        callMethod(klass, "setSongName", argTypes, term1829, args);
    }

};


