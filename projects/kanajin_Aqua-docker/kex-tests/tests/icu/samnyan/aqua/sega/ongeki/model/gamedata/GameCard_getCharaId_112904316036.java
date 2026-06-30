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

public class GameCard_getCharaId_112904316036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7507;

    public GameCard_getCharaId_112904316036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7507 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term7507, term7507.getClass(), "id", 0L);
        setField(term7507, term7507.getClass(), "name", null);
        setField(term7507, term7507.getClass(), "nickName", null);
        setField(term7507, term7507.getClass(), "attribute", null);
        setIntField(term7507, term7507.getClass(), "charaId", 0);
        setField(term7507, term7507.getClass(), "school", null);
        setField(term7507, term7507.getClass(), "gakunen", null);
        setField(term7507, term7507.getClass(), "rarity", null);
        setField(term7507, term7507.getClass(), "levelParam", null);
        setIntField(term7507, term7507.getClass(), "skillId", 0);
        setIntField(term7507, term7507.getClass(), "choKaikaSkillId", 0);
        setField(term7507, term7507.getClass(), "cardNumber", null);
        setField(term7507, term7507.getClass(), "version", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharaId", argTypes, term7507, args);
    }

};


