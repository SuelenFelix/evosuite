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
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;

public class Difficulty_getDiff_20057924545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5168;

    public Difficulty_getDiff_20057924545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5171 = new Integer(1470349147);
        Integer term5173 = new Integer(-255317272);
        Integer term5247 = new Integer(-706253892);
        HashMap term5249 = new HashMap();
        term5168 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term5170 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term5168, term5168.getClass(), "id", -2338103433822116635L);
        setField(term5170, term5170.getClass(), "pvId", term5171);
        setField(term5170, term5170.getClass(), "bpm", term5173);
        setField(term5170, term5170.getClass(), "songName", "WVhzXHdyFF");
        setField(term5170, term5170.getClass(), "songNameEng", "GLAWYoxkyw");
        setField(term5170, term5170.getClass(), "songNameReading", "cfpPTNNVnW");
        setField(term5170, term5170.getClass(), "arranger", "VPkEFShMUB");
        setField(term5170, term5170.getClass(), "lyrics", "ZIgHysIFcL");
        setField(term5170, term5170.getClass(), "music", "ofSfQtWBjp");
        setField(term5170, term5170.getClass(), "performerNumber", term5247);
        setField(term5170, term5170.getClass(), "difficulty", term5249);
        setField(term5168, term5168.getClass(), "pv", term5170);
        setIntField(term5168, term5168.getClass(), "edition", 833762980);
        setField(term5168, term5168.getClass(), "level", "qJtkJJhOSV");
        setIntField(term5168, term5168.getClass(), "version", 320711637);
        setField(term5168, term5168.getClass(), "diff", "vQbiGKncal");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiff", argTypes, term5168, args);
    }

};


