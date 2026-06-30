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

public class Pv_getSongNameEng_14667358363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term457;

    public Pv_getSongNameEng_14667358363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term458 = new Integer(-817164822);
        Integer term460 = new Integer(-1016503459);
        Integer term534 = new Integer(-1968847291);
        HashMap term536 = new HashMap();
        term457 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term457, term457.getClass(), "pvId", term458);
        setField(term457, term457.getClass(), "bpm", term460);
        setField(term457, term457.getClass(), "songName", "fWKJoSoCwE");
        setField(term457, term457.getClass(), "songNameEng", "wfaXBpWAUH");
        setField(term457, term457.getClass(), "songNameReading", "VMeAzAHwZj");
        setField(term457, term457.getClass(), "arranger", "PznxWXsZME");
        setField(term457, term457.getClass(), "lyrics", "ZzIujlwVsw");
        setField(term457, term457.getClass(), "music", "LWyEaeIyAo");
        setField(term457, term457.getClass(), "performerNumber", term534);
        setField(term457, term457.getClass(), "difficulty", term536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSongNameEng", argTypes, term457, args);
    }

};


