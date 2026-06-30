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

public class Pv_setLyrics_157725853816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2525;

    public Pv_setLyrics_157725853816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2526 = new Integer(534834644);
        Integer term2528 = new Integer(1959097203);
        Integer term2602 = new Integer(-209654048);
        HashMap term2604 = new HashMap();
        term2525 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term2525, term2525.getClass(), "pvId", term2526);
        setField(term2525, term2525.getClass(), "bpm", term2528);
        setField(term2525, term2525.getClass(), "songName", "bShlAqoTmZ");
        setField(term2525, term2525.getClass(), "songNameEng", "nOKlKlNhtU");
        setField(term2525, term2525.getClass(), "songNameReading", "gXFNBHJSey");
        setField(term2525, term2525.getClass(), "arranger", "wUcSfItZgv");
        setField(term2525, term2525.getClass(), "lyrics", "rOfPCPHmtJ");
        setField(term2525, term2525.getClass(), "music", "EnmiAvfpJv");
        setField(term2525, term2525.getClass(), "performerNumber", term2602);
        setField(term2525, term2525.getClass(), "difficulty", term2604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tkmmGweDwJ";
        callMethod(klass, "setLyrics", argTypes, term2525, args);
    }

};


