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

public class Difficulty_canEqual_116868519713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6931;
     Object term7046;

    public Difficulty_canEqual_116868519713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6934 = new Integer(1105016932);
        Integer term6936 = new Integer(-365784998);
        Integer term7010 = new Integer(-1893236300);
        HashMap term7012 = new HashMap();
        term6931 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term6933 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term6931, term6931.getClass(), "id", -7456852906235966771L);
        setField(term6933, term6933.getClass(), "pvId", term6934);
        setField(term6933, term6933.getClass(), "bpm", term6936);
        setField(term6933, term6933.getClass(), "songName", "FDzNpfjYDI");
        setField(term6933, term6933.getClass(), "songNameEng", "vSbbcByIuA");
        setField(term6933, term6933.getClass(), "songNameReading", "QSvdWzkkPx");
        setField(term6933, term6933.getClass(), "arranger", "vStdEtWvae");
        setField(term6933, term6933.getClass(), "lyrics", "iApJWgnQkP");
        setField(term6933, term6933.getClass(), "music", "kHKzzYJxiP");
        setField(term6933, term6933.getClass(), "performerNumber", term7010);
        setField(term6933, term6933.getClass(), "difficulty", term7012);
        setField(term6931, term6931.getClass(), "pv", term6933);
        setIntField(term6931, term6931.getClass(), "edition", -380787857);
        setField(term6931, term6931.getClass(), "level", "juEYcOCxLW");
        setIntField(term6931, term6931.getClass(), "version", 319853052);
        setField(term6931, term6931.getClass(), "diff", "YsWgGEhEmC");
        term7046 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7046;
        callMethod(klass, "canEqual", argTypes, term6931, args);
    }

};


