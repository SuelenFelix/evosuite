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

public class Pv_getLyrics_8717949426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term913;

    public Pv_getLyrics_8717949426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term914 = new Integer(-1772434990);
        Integer term916 = new Integer(-1845499264);
        Integer term990 = new Integer(-505439934);
        HashMap term992 = new HashMap();
        term913 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term913, term913.getClass(), "pvId", term914);
        setField(term913, term913.getClass(), "bpm", term916);
        setField(term913, term913.getClass(), "songName", "SPtPatHeOm");
        setField(term913, term913.getClass(), "songNameEng", "ywmcuThdfL");
        setField(term913, term913.getClass(), "songNameReading", "GBOEuByOfr");
        setField(term913, term913.getClass(), "arranger", "NHbOFFjyVK");
        setField(term913, term913.getClass(), "lyrics", "zaloBqlrSo");
        setField(term913, term913.getClass(), "music", "vvoLrMGCoN");
        setField(term913, term913.getClass(), "performerNumber", term990);
        setField(term913, term913.getClass(), "difficulty", term992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLyrics", argTypes, term913, args);
    }

};


