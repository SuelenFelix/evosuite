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

public class Character_setFirstSkillId_63648734113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17041;

    public Character_setFirstSkillId_63648734113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17041 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term17041, term17041.getClass(), "id", -2924531382671518368L);
        setField(term17041, term17041.getClass(), "name", "mnHyQbMyld");
        setField(term17041, term17041.getClass(), "releaseTag", "KHtaDOIcJZ");
        setField(term17041, term17041.getClass(), "worksName", "vgdwrCZczl");
        setField(term17041, term17041.getClass(), "illustratorName", "gKMNrpKBpu");
        setField(term17041, term17041.getClass(), "firstSkillId", "ZbHJVEqcoa");
        setField(term17041, term17041.getClass(), "skills", "awDQVEVIKi");
        setField(term17041, term17041.getClass(), "addImages", "HJwNgUzZZR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FvUCZgTXhq";
        callMethod(klass, "setFirstSkillId", argTypes, term17041, args);
    }

};


