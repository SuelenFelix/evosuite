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

public class Character_toString_153459153719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18045;

    public Character_toString_153459153719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18045 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term18045, term18045.getClass(), "id", 138235087558060686L);
        setField(term18045, term18045.getClass(), "name", "iUkOOQhEkw");
        setField(term18045, term18045.getClass(), "releaseTag", "wmVoFoUVmU");
        setField(term18045, term18045.getClass(), "worksName", "lLiSiPCciB");
        setField(term18045, term18045.getClass(), "illustratorName", "PsMKIIEwdR");
        setField(term18045, term18045.getClass(), "firstSkillId", "RbQmXqfXAT");
        setField(term18045, term18045.getClass(), "skills", "fcCAsvfBbe");
        setField(term18045, term18045.getClass(), "addImages", "mUNcKUxghj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term18045, args);
    }

};


