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

public class GameCard_setNickName_179862923915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4052;

    public GameCard_setNickName_179862923915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4052 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term4052, term4052.getClass(), "id", 6855071767938501807L);
        setField(term4052, term4052.getClass(), "name", "jXzmYyrnnT");
        setField(term4052, term4052.getClass(), "nickName", "igCAtimmYB");
        setField(term4052, term4052.getClass(), "attribute", "DyiXbeYIaN");
        setIntField(term4052, term4052.getClass(), "charaId", -817164822);
        setField(term4052, term4052.getClass(), "school", "VGizxZnyHX");
        setField(term4052, term4052.getClass(), "gakunen", "kVEZMHmRtR");
        setField(term4052, term4052.getClass(), "rarity", "ekxGuOYIwi");
        setField(term4052, term4052.getClass(), "levelParam", "RbVQXSpxXy");
        setIntField(term4052, term4052.getClass(), "skillId", -1016503459);
        setIntField(term4052, term4052.getClass(), "choKaikaSkillId", -1968847291);
        setField(term4052, term4052.getClass(), "cardNumber", "YpJbIgJWWv");
        setField(term4052, term4052.getClass(), "version", "JppkknKVOw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iljANwuEjk";
        callMethod(klass, "setNickName", argTypes, term4052, args);
    }

};


