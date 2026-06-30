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

public class GameCard_getCardNumber_199094486043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7542;

    public GameCard_getCardNumber_199094486043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7542 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term7542, term7542.getClass(), "id", 0L);
        setField(term7542, term7542.getClass(), "name", null);
        setField(term7542, term7542.getClass(), "nickName", null);
        setField(term7542, term7542.getClass(), "attribute", null);
        setIntField(term7542, term7542.getClass(), "charaId", 0);
        setField(term7542, term7542.getClass(), "school", null);
        setField(term7542, term7542.getClass(), "gakunen", null);
        setField(term7542, term7542.getClass(), "rarity", null);
        setField(term7542, term7542.getClass(), "levelParam", null);
        setIntField(term7542, term7542.getClass(), "skillId", 0);
        setIntField(term7542, term7542.getClass(), "choKaikaSkillId", 0);
        setField(term7542, term7542.getClass(), "cardNumber", null);
        setField(term7542, term7542.getClass(), "version", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardNumber", argTypes, term7542, args);
    }

};


