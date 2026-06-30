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

public class GameCard_getChoKaikaSkillId_191235923110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3013;

    public GameCard_getChoKaikaSkillId_191235923110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3013 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term3013, term3013.getClass(), "id", 2486810210675247493L);
        setField(term3013, term3013.getClass(), "name", "xJgPlLxpgC");
        setField(term3013, term3013.getClass(), "nickName", "EYtfuJaxiM");
        setField(term3013, term3013.getClass(), "attribute", "gCWtLVKVVe");
        setIntField(term3013, term3013.getClass(), "charaId", -203030934);
        setField(term3013, term3013.getClass(), "school", "fWKJoSoCwE");
        setField(term3013, term3013.getClass(), "gakunen", "wfaXBpWAUH");
        setField(term3013, term3013.getClass(), "rarity", "VMeAzAHwZj");
        setField(term3013, term3013.getClass(), "levelParam", "PznxWXsZME");
        setIntField(term3013, term3013.getClass(), "skillId", -1179120542);
        setIntField(term3013, term3013.getClass(), "choKaikaSkillId", -73683645);
        setField(term3013, term3013.getClass(), "cardNumber", "ZzIujlwVsw");
        setField(term3013, term3013.getClass(), "version", "LWyEaeIyAo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChoKaikaSkillId", argTypes, term3013, args);
    }

};


