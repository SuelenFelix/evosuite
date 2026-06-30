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

public class GameCard_setCharaId_161330425449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7574;
     Object term7579;

    public GameCard_setCharaId_161330425449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7574 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term7574, term7574.getClass(), "id", 0L);
        setField(term7574, term7574.getClass(), "name", null);
        setField(term7574, term7574.getClass(), "nickName", null);
        setField(term7574, term7574.getClass(), "attribute", null);
        setIntField(term7574, term7574.getClass(), "charaId", 0);
        setField(term7574, term7574.getClass(), "school", null);
        setField(term7574, term7574.getClass(), "gakunen", null);
        setField(term7574, term7574.getClass(), "rarity", null);
        setField(term7574, term7574.getClass(), "levelParam", null);
        setIntField(term7574, term7574.getClass(), "skillId", 0);
        setIntField(term7574, term7574.getClass(), "choKaikaSkillId", 0);
        setField(term7574, term7574.getClass(), "cardNumber", null);
        setField(term7574, term7574.getClass(), "version", null);
        term7579 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7579;
        callMethod(klass, "setCharaId", argTypes, term7574, args);
    }

};


