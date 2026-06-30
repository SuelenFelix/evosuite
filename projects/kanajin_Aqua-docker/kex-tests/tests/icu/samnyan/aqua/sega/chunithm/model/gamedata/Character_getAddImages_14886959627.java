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

public class Character_getAddImages_14886959627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16015;

    public Character_getAddImages_14886959627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16015 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term16015, term16015.getClass(), "id", 855932984568615096L);
        setField(term16015, term16015.getClass(), "name", "coJPjrBZNe");
        setField(term16015, term16015.getClass(), "releaseTag", "vMsWjuPTnO");
        setField(term16015, term16015.getClass(), "worksName", "zHvfKaOstO");
        setField(term16015, term16015.getClass(), "illustratorName", "tOszriqETr");
        setField(term16015, term16015.getClass(), "firstSkillId", "ncSPTkhKjO");
        setField(term16015, term16015.getClass(), "skills", "jcWKHRWhyj");
        setField(term16015, term16015.getClass(), "addImages", "nrQjODRMLD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddImages", argTypes, term16015, args);
    }

};


