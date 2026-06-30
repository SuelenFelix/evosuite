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

public class Pv_canEqual_29002915021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3437;
     Object term3529;

    public Pv_canEqual_29002915021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3438 = new Integer(1658391716);
        Integer term3440 = new Integer(2143282300);
        Integer term3514 = new Integer(1137624258);
        HashMap term3516 = new HashMap();
        term3437 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term3437, term3437.getClass(), "pvId", term3438);
        setField(term3437, term3437.getClass(), "bpm", term3440);
        setField(term3437, term3437.getClass(), "songName", "HAkxFBZZzz");
        setField(term3437, term3437.getClass(), "songNameEng", "yejonZnVuy");
        setField(term3437, term3437.getClass(), "songNameReading", "ouesGIsvuG");
        setField(term3437, term3437.getClass(), "arranger", "pHBHlmLIZQ");
        setField(term3437, term3437.getClass(), "lyrics", "ZWRAbOuktl");
        setField(term3437, term3437.getClass(), "music", "iqFRvFmVID");
        setField(term3437, term3437.getClass(), "performerNumber", term3514);
        setField(term3437, term3437.getClass(), "difficulty", term3516);
        term3529 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3529;
        callMethod(klass, "canEqual", argTypes, term3437, args);
    }

};


