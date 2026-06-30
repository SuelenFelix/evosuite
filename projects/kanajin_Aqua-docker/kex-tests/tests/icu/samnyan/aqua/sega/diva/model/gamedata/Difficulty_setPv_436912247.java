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

public class Difficulty_setPv_436912247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5560;
     Object term5675;

    public Difficulty_setPv_436912247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5563 = new Integer(-124088550);
        Integer term5565 = new Integer(777492093);
        Integer term5639 = new Integer(1414025609);
        HashMap term5641 = new HashMap();
        term5560 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term5562 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term5560, term5560.getClass(), "id", 185793058502220865L);
        setField(term5562, term5562.getClass(), "pvId", term5563);
        setField(term5562, term5562.getClass(), "bpm", term5565);
        setField(term5562, term5562.getClass(), "songName", "PxGDfPOAFS");
        setField(term5562, term5562.getClass(), "songNameEng", "dZVxzYEeZe");
        setField(term5562, term5562.getClass(), "songNameReading", "TnCQRmzwPf");
        setField(term5562, term5562.getClass(), "arranger", "ZGnUKGTWCn");
        setField(term5562, term5562.getClass(), "lyrics", "cHRLXsgRzr");
        setField(term5562, term5562.getClass(), "music", "QpqQKmCtoC");
        setField(term5562, term5562.getClass(), "performerNumber", term5639);
        setField(term5562, term5562.getClass(), "difficulty", term5641);
        setField(term5560, term5560.getClass(), "pv", term5562);
        setIntField(term5560, term5560.getClass(), "edition", 510162332);
        setField(term5560, term5560.getClass(), "level", "pvjlKAnxzJ");
        setIntField(term5560, term5560.getClass(), "version", 888506903);
        setField(term5560, term5560.getClass(), "diff", "ejxUBDQQKB");
        Integer term5676 = new Integer(2128383340);
        Integer term5678 = new Integer(1238598518);
        Integer term5752 = new Integer(-558146961);
        HashMap term5754 = new HashMap();
        term5675 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term5675, term5675.getClass(), "pvId", term5676);
        setField(term5675, term5675.getClass(), "bpm", term5678);
        setField(term5675, term5675.getClass(), "songName", "IbOvZLmtSE");
        setField(term5675, term5675.getClass(), "songNameEng", "AOsIglRFcp");
        setField(term5675, term5675.getClass(), "songNameReading", "bdONLhBZoA");
        setField(term5675, term5675.getClass(), "arranger", "qPVeRcolUe");
        setField(term5675, term5675.getClass(), "lyrics", "AscZyfQFkU");
        setField(term5675, term5675.getClass(), "music", "nPfruizWey");
        setField(term5675, term5675.getClass(), "performerNumber", term5752);
        setField(term5675, term5675.getClass(), "difficulty", term5754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Object[] args = new Object[1];
        args[0] = term5675;
        callMethod(klass, "setPv", argTypes, term5560, args);
    }

};


