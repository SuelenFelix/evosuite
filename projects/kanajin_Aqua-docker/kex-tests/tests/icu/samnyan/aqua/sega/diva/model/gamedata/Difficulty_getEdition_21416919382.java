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

public class Difficulty_getEdition_21416919382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4583;

    public Difficulty_getEdition_21416919382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4586 = new Integer(1709474063);
        Integer term4588 = new Integer(1406617209);
        Integer term4662 = new Integer(1706047059);
        HashMap term4664 = new HashMap();
        term4583 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term4585 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term4583, term4583.getClass(), "id", -6673920710396545553L);
        setField(term4585, term4585.getClass(), "pvId", term4586);
        setField(term4585, term4585.getClass(), "bpm", term4588);
        setField(term4585, term4585.getClass(), "songName", "LQTIjJLkXH");
        setField(term4585, term4585.getClass(), "songNameEng", "RvkBwedFKx");
        setField(term4585, term4585.getClass(), "songNameReading", "DYzWJljbaE");
        setField(term4585, term4585.getClass(), "arranger", "idwbHVHUcz");
        setField(term4585, term4585.getClass(), "lyrics", "sWJHIWZMuX");
        setField(term4585, term4585.getClass(), "music", "PwMdJRwzDW");
        setField(term4585, term4585.getClass(), "performerNumber", term4662);
        setField(term4585, term4585.getClass(), "difficulty", term4664);
        setField(term4583, term4583.getClass(), "pv", term4585);
        setIntField(term4583, term4583.getClass(), "edition", -100825168);
        setField(term4583, term4583.getClass(), "level", "cvbvwpPlNk");
        setIntField(term4583, term4583.getClass(), "version", 768407648);
        setField(term4583, term4583.getClass(), "diff", "uCdLbhvYeG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEdition", argTypes, term4583, args);
    }

};


