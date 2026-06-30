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
import java.lang.Long;

public class Character_setId_7618719218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16171;
     Object term16257;

    public Character_setId_7618719218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16171 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term16171, term16171.getClass(), "id", -1616722610139554082L);
        setField(term16171, term16171.getClass(), "name", "PNoWXrsFic");
        setField(term16171, term16171.getClass(), "releaseTag", "QZBHZqZope");
        setField(term16171, term16171.getClass(), "worksName", "VBUahCvyxC");
        setField(term16171, term16171.getClass(), "illustratorName", "MlzTkzKMCX");
        setField(term16171, term16171.getClass(), "firstSkillId", "UqKUbMyPMJ");
        setField(term16171, term16171.getClass(), "skills", "QpYltHAdyY");
        setField(term16171, term16171.getClass(), "addImages", "lbmSGBwIiV");
        term16257 = new Long(7495904023107549024L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term16257;
        callMethod(klass, "setId", argTypes, term16171, args);
    }

};


