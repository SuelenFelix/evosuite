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

public class GameCard_setVersion_44109976157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7620;

    public GameCard_setVersion_44109976157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7620 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term7620, term7620.getClass(), "id", 0L);
        setField(term7620, term7620.getClass(), "name", null);
        setField(term7620, term7620.getClass(), "nickName", null);
        setField(term7620, term7620.getClass(), "attribute", null);
        setIntField(term7620, term7620.getClass(), "charaId", 0);
        setField(term7620, term7620.getClass(), "school", null);
        setField(term7620, term7620.getClass(), "gakunen", null);
        setField(term7620, term7620.getClass(), "rarity", null);
        setField(term7620, term7620.getClass(), "levelParam", null);
        setIntField(term7620, term7620.getClass(), "skillId", 0);
        setIntField(term7620, term7620.getClass(), "choKaikaSkillId", 0);
        setField(term7620, term7620.getClass(), "cardNumber", null);
        setField(term7620, term7620.getClass(), "version", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVersion", argTypes, term7620, args);
    }

};


