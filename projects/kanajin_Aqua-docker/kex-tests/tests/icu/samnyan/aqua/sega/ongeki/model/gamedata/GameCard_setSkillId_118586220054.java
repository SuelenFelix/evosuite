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
import java.lang.Integer;

public class GameCard_setSkillId_118586220054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7601;
     Object term7606;

    public GameCard_setSkillId_118586220054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7601 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term7601, term7601.getClass(), "id", 0L);
        setField(term7601, term7601.getClass(), "name", null);
        setField(term7601, term7601.getClass(), "nickName", null);
        setField(term7601, term7601.getClass(), "attribute", null);
        setIntField(term7601, term7601.getClass(), "charaId", 0);
        setField(term7601, term7601.getClass(), "school", null);
        setField(term7601, term7601.getClass(), "gakunen", null);
        setField(term7601, term7601.getClass(), "rarity", null);
        setField(term7601, term7601.getClass(), "levelParam", null);
        setIntField(term7601, term7601.getClass(), "skillId", 0);
        setIntField(term7601, term7601.getClass(), "choKaikaSkillId", 0);
        setField(term7601, term7601.getClass(), "cardNumber", null);
        setField(term7601, term7601.getClass(), "version", null);
        term7606 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7606;
        callMethod(klass, "setSkillId", argTypes, term7601, args);
    }

};


