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

public class GameCard_setChoKaikaSkillId_130506308123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5812;
     Object term5925;

    public GameCard_setChoKaikaSkillId_130506308123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5812 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term5812, term5812.getClass(), "id", -8708192233349544946L);
        setField(term5812, term5812.getClass(), "name", "lCyLIcSuom");
        setField(term5812, term5812.getClass(), "nickName", "CGOpQSZZwI");
        setField(term5812, term5812.getClass(), "attribute", "ypEdrstygY");
        setIntField(term5812, term5812.getClass(), "charaId", 962840079);
        setField(term5812, term5812.getClass(), "school", "sNQFlATEeQ");
        setField(term5812, term5812.getClass(), "gakunen", "ZKMLioamsY");
        setField(term5812, term5812.getClass(), "rarity", "WVbxuoDBcn");
        setField(term5812, term5812.getClass(), "levelParam", "pvDEABOxLt");
        setIntField(term5812, term5812.getClass(), "skillId", 1540719661);
        setIntField(term5812, term5812.getClass(), "choKaikaSkillId", 1265463001);
        setField(term5812, term5812.getClass(), "cardNumber", "beAMpkroCQ");
        setField(term5812, term5812.getClass(), "version", "uSUvKAyuvd");
        term5925 = new Integer(335112684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5925;
        callMethod(klass, "setChoKaikaSkillId", argTypes, term5812, args);
    }

};


