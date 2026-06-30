package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Character_setWorksName_139119411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16685;

    public Character_setWorksName_139119411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16685 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term16685, term16685.getClass(), "id", -7115418542247301000L);
        setField(term16685, term16685.getClass(), "name", "bucTnYicnp");
        setField(term16685, term16685.getClass(), "releaseTag", "EkgprvqZlM");
        setField(term16685, term16685.getClass(), "worksName", "fbnKvthhOz");
        setField(term16685, term16685.getClass(), "illustratorName", "PGfCDJTBek");
        setField(term16685, term16685.getClass(), "firstSkillId", "ZwjARhAtHC");
        setField(term16685, term16685.getClass(), "skills", "XXvscsYBWv");
        setField(term16685, term16685.getClass(), "addImages", "uePedtiAfL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AdSHvysxQB";
        callMethod(klass, "setWorksName", argTypes, term16685, args);
    }

};


