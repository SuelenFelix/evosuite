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

public class Difficulty_toString_59492379715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7322;

    public Difficulty_toString_59492379715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7325 = new Integer(-1541981599);
        Integer term7327 = new Integer(1605456363);
        Integer term7401 = new Integer(2059896693);
        HashMap term7403 = new HashMap();
        term7322 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term7324 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term7322, term7322.getClass(), "id", 4069264186851023313L);
        setField(term7324, term7324.getClass(), "pvId", term7325);
        setField(term7324, term7324.getClass(), "bpm", term7327);
        setField(term7324, term7324.getClass(), "songName", "vNObzQvzxo");
        setField(term7324, term7324.getClass(), "songNameEng", "uyuWzXeJvn");
        setField(term7324, term7324.getClass(), "songNameReading", "jvQHxWAYDO");
        setField(term7324, term7324.getClass(), "arranger", "mntnLPfhte");
        setField(term7324, term7324.getClass(), "lyrics", "rIKLUjcdnZ");
        setField(term7324, term7324.getClass(), "music", "MQaKKukkYD");
        setField(term7324, term7324.getClass(), "performerNumber", term7401);
        setField(term7324, term7324.getClass(), "difficulty", term7403);
        setField(term7322, term7322.getClass(), "pv", term7324);
        setIntField(term7322, term7322.getClass(), "edition", 2027686272);
        setField(term7322, term7322.getClass(), "level", "VbIydgisyZ");
        setIntField(term7322, term7322.getClass(), "version", -1494356104);
        setField(term7322, term7322.getClass(), "diff", "vigaMWRpCA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7322, args);
    }

};


