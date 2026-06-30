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

public class Pv_setMusic_180269196517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2699;

    public Pv_setMusic_180269196517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2700 = new Integer(267763294);
        Integer term2702 = new Integer(-1497710478);
        Integer term2776 = new Integer(49950830);
        HashMap term2778 = new HashMap();
        term2699 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term2699, term2699.getClass(), "pvId", term2700);
        setField(term2699, term2699.getClass(), "bpm", term2702);
        setField(term2699, term2699.getClass(), "songName", "pMfTuAFXxg");
        setField(term2699, term2699.getClass(), "songNameEng", "XCZmhkblRc");
        setField(term2699, term2699.getClass(), "songNameReading", "gFUWMydGCU");
        setField(term2699, term2699.getClass(), "arranger", "LLegSTfqJt");
        setField(term2699, term2699.getClass(), "lyrics", "XQfmqLbqHS");
        setField(term2699, term2699.getClass(), "music", "jLVLqQSjqg");
        setField(term2699, term2699.getClass(), "performerNumber", term2776);
        setField(term2699, term2699.getClass(), "difficulty", term2778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AbonCTtbef";
        callMethod(klass, "setMusic", argTypes, term2699, args);
    }

};


