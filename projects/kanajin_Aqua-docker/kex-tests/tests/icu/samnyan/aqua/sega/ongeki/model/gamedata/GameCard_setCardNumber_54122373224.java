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

public class GameCard_setCardNumber_54122373224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6017;

    public GameCard_setCardNumber_54122373224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6017 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term6017, term6017.getClass(), "id", 5907001541142728739L);
        setField(term6017, term6017.getClass(), "name", "onQLVONGuf");
        setField(term6017, term6017.getClass(), "nickName", "SOrEHbcbmn");
        setField(term6017, term6017.getClass(), "attribute", "bnsyeQXFdu");
        setIntField(term6017, term6017.getClass(), "charaId", 1551099402);
        setField(term6017, term6017.getClass(), "school", "BwtdjiefJn");
        setField(term6017, term6017.getClass(), "gakunen", "jDmhBrIoDa");
        setField(term6017, term6017.getClass(), "rarity", "SPtPatHeOm");
        setField(term6017, term6017.getClass(), "levelParam", "ywmcuThdfL");
        setIntField(term6017, term6017.getClass(), "skillId", -2027534003);
        setIntField(term6017, term6017.getClass(), "choKaikaSkillId", 1063420942);
        setField(term6017, term6017.getClass(), "cardNumber", "GBOEuByOfr");
        setField(term6017, term6017.getClass(), "version", "NHbOFFjyVK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zaloBqlrSo";
        callMethod(klass, "setCardNumber", argTypes, term6017, args);
    }

};


