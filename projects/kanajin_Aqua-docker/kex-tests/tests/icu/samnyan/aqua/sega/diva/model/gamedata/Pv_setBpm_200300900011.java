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

public class Pv_setBpm_200300900011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1675;
     Object term1767;

    public Pv_setBpm_200300900011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1676 = new Integer(1384592638);
        Integer term1678 = new Integer(-1002370457);
        Integer term1752 = new Integer(-2014576105);
        HashMap term1754 = new HashMap();
        term1675 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term1675, term1675.getClass(), "pvId", term1676);
        setField(term1675, term1675.getClass(), "bpm", term1678);
        setField(term1675, term1675.getClass(), "songName", "XebAeSnCKZ");
        setField(term1675, term1675.getClass(), "songNameEng", "GeddnXjHGy");
        setField(term1675, term1675.getClass(), "songNameReading", "vLTbaoAxBm");
        setField(term1675, term1675.getClass(), "arranger", "BXTjEyEZxD");
        setField(term1675, term1675.getClass(), "lyrics", "oKhVzOKUFW");
        setField(term1675, term1675.getClass(), "music", "mNHyqmOAFy");
        setField(term1675, term1675.getClass(), "performerNumber", term1752);
        setField(term1675, term1675.getClass(), "difficulty", term1754);
        term1767 = new Integer(-1504890659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1767;
        callMethod(klass, "setBpm", argTypes, term1675, args);
    }

};


