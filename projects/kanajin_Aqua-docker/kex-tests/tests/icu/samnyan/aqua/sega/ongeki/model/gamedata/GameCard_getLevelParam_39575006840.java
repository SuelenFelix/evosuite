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

public class GameCard_getLevelParam_39575006840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7527;

    public GameCard_getLevelParam_39575006840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7527 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term7527, term7527.getClass(), "id", 0L);
        setField(term7527, term7527.getClass(), "name", null);
        setField(term7527, term7527.getClass(), "nickName", null);
        setField(term7527, term7527.getClass(), "attribute", null);
        setIntField(term7527, term7527.getClass(), "charaId", 0);
        setField(term7527, term7527.getClass(), "school", null);
        setField(term7527, term7527.getClass(), "gakunen", null);
        setField(term7527, term7527.getClass(), "rarity", null);
        setField(term7527, term7527.getClass(), "levelParam", null);
        setIntField(term7527, term7527.getClass(), "skillId", 0);
        setIntField(term7527, term7527.getClass(), "choKaikaSkillId", 0);
        setField(term7527, term7527.getClass(), "cardNumber", null);
        setField(term7527, term7527.getClass(), "version", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevelParam", argTypes, term7527, args);
    }

};


