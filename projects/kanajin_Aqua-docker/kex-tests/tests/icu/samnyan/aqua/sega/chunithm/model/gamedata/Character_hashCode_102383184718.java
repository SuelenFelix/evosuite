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

public class Character_hashCode_102383184718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17889;

    public Character_hashCode_102383184718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17889 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term17889, term17889.getClass(), "id", -4598158870068953328L);
        setField(term17889, term17889.getClass(), "name", "SrWMUlbtWV");
        setField(term17889, term17889.getClass(), "releaseTag", "VePIumgrrU");
        setField(term17889, term17889.getClass(), "worksName", "DPwIqlszZo");
        setField(term17889, term17889.getClass(), "illustratorName", "mNgDshwZNc");
        setField(term17889, term17889.getClass(), "firstSkillId", "pDqgDbJoFw");
        setField(term17889, term17889.getClass(), "skills", "iVOvTzOxwt");
        setField(term17889, term17889.getClass(), "addImages", "BjZQdecXvB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term17889, args);
    }

};


