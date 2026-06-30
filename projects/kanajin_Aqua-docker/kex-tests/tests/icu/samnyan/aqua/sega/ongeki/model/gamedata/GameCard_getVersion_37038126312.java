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

public class GameCard_getVersion_37038126312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3419;

    public GameCard_getVersion_37038126312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3419 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term3419, term3419.getClass(), "id", -7672528020740371001L);
        setField(term3419, term3419.getClass(), "name", "jwsfVjMoJT");
        setField(term3419, term3419.getClass(), "nickName", "ZfdXfCCFDf");
        setField(term3419, term3419.getClass(), "attribute", "MwwjNtdOFT");
        setIntField(term3419, term3419.getClass(), "charaId", -1530420153);
        setField(term3419, term3419.getClass(), "school", "VYkqXKVlAJ");
        setField(term3419, term3419.getClass(), "gakunen", "XkIoWJRNwN");
        setField(term3419, term3419.getClass(), "rarity", "aNWLJdrZMq");
        setField(term3419, term3419.getClass(), "levelParam", "HHmNoYxIGj");
        setIntField(term3419, term3419.getClass(), "skillId", -469968304);
        setIntField(term3419, term3419.getClass(), "choKaikaSkillId", -1145578966);
        setField(term3419, term3419.getClass(), "cardNumber", "PtirvZmsGt");
        setField(term3419, term3419.getClass(), "version", "HWkpTmtlrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term3419, args);
    }

};


