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
import java.lang.Long;

public class GameCard_setId_156352549945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7552;
     Object term7557;

    public GameCard_setId_156352549945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7552 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term7552, term7552.getClass(), "id", 0L);
        setField(term7552, term7552.getClass(), "name", null);
        setField(term7552, term7552.getClass(), "nickName", null);
        setField(term7552, term7552.getClass(), "attribute", null);
        setIntField(term7552, term7552.getClass(), "charaId", 0);
        setField(term7552, term7552.getClass(), "school", null);
        setField(term7552, term7552.getClass(), "gakunen", null);
        setField(term7552, term7552.getClass(), "rarity", null);
        setField(term7552, term7552.getClass(), "levelParam", null);
        setIntField(term7552, term7552.getClass(), "skillId", 0);
        setIntField(term7552, term7552.getClass(), "choKaikaSkillId", 0);
        setField(term7552, term7552.getClass(), "cardNumber", null);
        setField(term7552, term7552.getClass(), "version", null);
        term7557 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term7557;
        callMethod(klass, "setId", argTypes, term7552, args);
    }

};


