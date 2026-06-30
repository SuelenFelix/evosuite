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

public class Pv_setSongNameReading_68506463014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2177;

    public Pv_setSongNameReading_68506463014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2178 = new Integer(548228925);
        Integer term2180 = new Integer(-749861210);
        Integer term2254 = new Integer(1694224101);
        HashMap term2256 = new HashMap();
        term2177 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term2177, term2177.getClass(), "pvId", term2178);
        setField(term2177, term2177.getClass(), "bpm", term2180);
        setField(term2177, term2177.getClass(), "songName", "iVOvTzOxwt");
        setField(term2177, term2177.getClass(), "songNameEng", "BjZQdecXvB");
        setField(term2177, term2177.getClass(), "songNameReading", "iUkOOQhEkw");
        setField(term2177, term2177.getClass(), "arranger", "wmVoFoUVmU");
        setField(term2177, term2177.getClass(), "lyrics", "lLiSiPCciB");
        setField(term2177, term2177.getClass(), "music", "PsMKIIEwdR");
        setField(term2177, term2177.getClass(), "performerNumber", term2254);
        setField(term2177, term2177.getClass(), "difficulty", term2256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VuLLXpvPpZ";
        callMethod(klass, "setSongNameReading", argTypes, term2177, args);
    }

};


