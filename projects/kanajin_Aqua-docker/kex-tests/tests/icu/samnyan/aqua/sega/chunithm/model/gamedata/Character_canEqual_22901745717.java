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

public class Character_canEqual_22901745717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17732;
     Object term17818;

    public Character_canEqual_22901745717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17732 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term17732, term17732.getClass(), "id", 8166095254618543564L);
        setField(term17732, term17732.getClass(), "name", "JmnWRJUxGr");
        setField(term17732, term17732.getClass(), "releaseTag", "wgRGBNrTGP");
        setField(term17732, term17732.getClass(), "worksName", "FIdNVptZpW");
        setField(term17732, term17732.getClass(), "illustratorName", "rQjxAhisjm");
        setField(term17732, term17732.getClass(), "firstSkillId", "ZDhASPHjDG");
        setField(term17732, term17732.getClass(), "skills", "HNVOAXYNEZ");
        setField(term17732, term17732.getClass(), "addImages", "gbbYBYyfvr");
        term17818 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17818;
        callMethod(klass, "canEqual", argTypes, term17732, args);
    }

};


