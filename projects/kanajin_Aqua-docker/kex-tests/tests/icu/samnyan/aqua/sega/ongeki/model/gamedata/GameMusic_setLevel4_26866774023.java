package icu.samnyan.aqua.sega.ongeki.model.gamedata;

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
import static icu.samnyan.aqua.sega.ongeki.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameMusic_setLevel4_26866774023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16511;

    public GameMusic_setLevel4_26866774023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16511 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term16511, term16511.getClass(), "id", 6689117472719450333L);
        setField(term16511, term16511.getClass(), "name", "zHvfKaOstO");
        setField(term16511, term16511.getClass(), "sortName", "tOszriqETr");
        setField(term16511, term16511.getClass(), "artistName", "ncSPTkhKjO");
        setField(term16511, term16511.getClass(), "genre", "jcWKHRWhyj");
        setIntField(term16511, term16511.getClass(), "bossCardId", 11724947);
        setIntField(term16511, term16511.getClass(), "bossLevel", 1953277050);
        setField(term16511, term16511.getClass(), "level0", "nrQjODRMLD");
        setField(term16511, term16511.getClass(), "level1", "PNoWXrsFic");
        setField(term16511, term16511.getClass(), "level2", "QZBHZqZope");
        setField(term16511, term16511.getClass(), "level3", "VBUahCvyxC");
        setField(term16511, term16511.getClass(), "level4", "MlzTkzKMCX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UqKUbMyPMJ";
        callMethod(klass, "setLevel4", argTypes, term16511, args);
    }

};


