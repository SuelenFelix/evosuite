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
import java.lang.Long;

public class Difficulty_setId_17015396616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5363;
     Object term5478;

    public Difficulty_setId_17015396616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5366 = new Integer(-752870423);
        Integer term5368 = new Integer(-1698809299);
        Integer term5442 = new Integer(401512128);
        HashMap term5444 = new HashMap();
        term5363 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term5365 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term5363, term5363.getClass(), "id", 5330761990446327930L);
        setField(term5365, term5365.getClass(), "pvId", term5366);
        setField(term5365, term5365.getClass(), "bpm", term5368);
        setField(term5365, term5365.getClass(), "songName", "NTSNSiYeUu");
        setField(term5365, term5365.getClass(), "songNameEng", "SBTEFDmQVY");
        setField(term5365, term5365.getClass(), "songNameReading", "ohZpRiNDZM");
        setField(term5365, term5365.getClass(), "arranger", "qEXIxhmUwz");
        setField(term5365, term5365.getClass(), "lyrics", "RlyxtfCqKY");
        setField(term5365, term5365.getClass(), "music", "kyTUkLCRYm");
        setField(term5365, term5365.getClass(), "performerNumber", term5442);
        setField(term5365, term5365.getClass(), "difficulty", term5444);
        setField(term5363, term5363.getClass(), "pv", term5365);
        setIntField(term5363, term5363.getClass(), "edition", -1941343035);
        setField(term5363, term5363.getClass(), "level", "jGxArBjtep");
        setIntField(term5363, term5363.getClass(), "version", 947897214);
        setField(term5363, term5363.getClass(), "diff", "dUXsPNSUez");
        term5478 = new Long(6426732259596412988L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term5478;
        callMethod(klass, "setId", argTypes, term5363, args);
    }

};


