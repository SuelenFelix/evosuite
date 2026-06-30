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

public class Difficulty_setVersion_15083055410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6321;
     Object term6436;

    public Difficulty_setVersion_15083055410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6324 = new Integer(-1511130237);
        Integer term6326 = new Integer(452088587);
        Integer term6400 = new Integer(-1630069454);
        HashMap term6402 = new HashMap();
        term6321 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term6323 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term6321, term6321.getClass(), "id", -7904053112604879960L);
        setField(term6323, term6323.getClass(), "pvId", term6324);
        setField(term6323, term6323.getClass(), "bpm", term6326);
        setField(term6323, term6323.getClass(), "songName", "LSrqDVjzEP");
        setField(term6323, term6323.getClass(), "songNameEng", "CPZCLJxTuA");
        setField(term6323, term6323.getClass(), "songNameReading", "ivAOXnVjmg");
        setField(term6323, term6323.getClass(), "arranger", "FivesaUeHG");
        setField(term6323, term6323.getClass(), "lyrics", "TnpXhZmCRY");
        setField(term6323, term6323.getClass(), "music", "ECVAXFhrTP");
        setField(term6323, term6323.getClass(), "performerNumber", term6400);
        setField(term6323, term6323.getClass(), "difficulty", term6402);
        setField(term6321, term6321.getClass(), "pv", term6323);
        setIntField(term6321, term6321.getClass(), "edition", 812570053);
        setField(term6321, term6321.getClass(), "level", "CnNmpSyiBE");
        setIntField(term6321, term6321.getClass(), "version", -1488938905);
        setField(term6321, term6321.getClass(), "diff", "JvKKIGdUWh");
        term6436 = new Integer(1916544127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6436;
        callMethod(klass, "setVersion", argTypes, term6321, args);
    }

};


