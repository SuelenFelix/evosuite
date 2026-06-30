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

public class GameCard_getNickName_21228679934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7497;

    public GameCard_getNickName_21228679934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7497 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term7497, term7497.getClass(), "id", 0L);
        setField(term7497, term7497.getClass(), "name", null);
        setField(term7497, term7497.getClass(), "nickName", null);
        setField(term7497, term7497.getClass(), "attribute", null);
        setIntField(term7497, term7497.getClass(), "charaId", 0);
        setField(term7497, term7497.getClass(), "school", null);
        setField(term7497, term7497.getClass(), "gakunen", null);
        setField(term7497, term7497.getClass(), "rarity", null);
        setField(term7497, term7497.getClass(), "levelParam", null);
        setIntField(term7497, term7497.getClass(), "skillId", 0);
        setIntField(term7497, term7497.getClass(), "choKaikaSkillId", 0);
        setField(term7497, term7497.getClass(), "cardNumber", null);
        setField(term7497, term7497.getClass(), "version", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNickName", argTypes, term7497, args);
    }

};


