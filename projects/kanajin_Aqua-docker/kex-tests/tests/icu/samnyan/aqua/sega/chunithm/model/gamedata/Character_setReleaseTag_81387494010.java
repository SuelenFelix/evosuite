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

public class Character_setReleaseTag_81387494010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16507;

    public Character_setReleaseTag_81387494010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16507 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term16507, term16507.getClass(), "id", 4513004407927379358L);
        setField(term16507, term16507.getClass(), "name", "AobDaplFLl");
        setField(term16507, term16507.getClass(), "releaseTag", "pDkMNnAGgv");
        setField(term16507, term16507.getClass(), "worksName", "PaCpFXGzdX");
        setField(term16507, term16507.getClass(), "illustratorName", "FftYCNbnks");
        setField(term16507, term16507.getClass(), "firstSkillId", "lJoltmsadS");
        setField(term16507, term16507.getClass(), "skills", "mvfDtZNEHr");
        setField(term16507, term16507.getClass(), "addImages", "bvSgmFUDOU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XMHwbfiHRl";
        callMethod(klass, "setReleaseTag", argTypes, term16507, args);
    }

};


