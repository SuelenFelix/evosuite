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
import java.lang.Long;
import java.lang.Integer;
import java.util.HashMap;

public class Difficulty_init_158935061816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7517;
     Object term7519;
     Object term7611;
     Object term7625;

    public Difficulty_init_158935061816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7517 = new Long(-2986201902216133814L);
        Integer term7520 = new Integer(1460702778);
        Integer term7522 = new Integer(-1398142433);
        Integer term7596 = new Integer(-1112119058);
        HashMap term7598 = new HashMap();
        term7519 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term7519, term7519.getClass(), "pvId", term7520);
        setField(term7519, term7519.getClass(), "bpm", term7522);
        setField(term7519, term7519.getClass(), "songName", "sgVVVUpnau");
        setField(term7519, term7519.getClass(), "songNameEng", "xwVTgDhNdW");
        setField(term7519, term7519.getClass(), "songNameReading", "ruqGjVRVlD");
        setField(term7519, term7519.getClass(), "arranger", "oeoFYkQLVk");
        setField(term7519, term7519.getClass(), "lyrics", "fibZqjUmdU");
        setField(term7519, term7519.getClass(), "music", "DvLIPKnbCV");
        setField(term7519, term7519.getClass(), "performerNumber", term7596);
        setField(term7519, term7519.getClass(), "difficulty", term7598);
        term7611 = new Integer(-26316536);
        term7625 = new Integer(1716165145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = term7517;
        args[1] = term7519;
        args[2] = term7611;
        args[3] = "iwismCnYjB";
        args[4] = term7625;
        args[5] = "GerBZdiruT";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


