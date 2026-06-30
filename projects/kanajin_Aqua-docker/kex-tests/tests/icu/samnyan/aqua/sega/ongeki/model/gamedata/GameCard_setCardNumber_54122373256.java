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

public class GameCard_setCardNumber_54122373256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7615;

    public GameCard_setCardNumber_54122373256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7615 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term7615, term7615.getClass(), "id", 0L);
        setField(term7615, term7615.getClass(), "name", null);
        setField(term7615, term7615.getClass(), "nickName", null);
        setField(term7615, term7615.getClass(), "attribute", null);
        setIntField(term7615, term7615.getClass(), "charaId", 0);
        setField(term7615, term7615.getClass(), "school", null);
        setField(term7615, term7615.getClass(), "gakunen", null);
        setField(term7615, term7615.getClass(), "rarity", null);
        setField(term7615, term7615.getClass(), "levelParam", null);
        setIntField(term7615, term7615.getClass(), "skillId", 0);
        setIntField(term7615, term7615.getClass(), "choKaikaSkillId", 0);
        setField(term7615, term7615.getClass(), "cardNumber", null);
        setField(term7615, term7615.getClass(), "version", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCardNumber", argTypes, term7615, args);
    }

};


