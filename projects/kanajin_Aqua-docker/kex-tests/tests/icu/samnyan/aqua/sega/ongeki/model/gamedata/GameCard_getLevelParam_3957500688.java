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

public class GameCard_getLevelParam_3957500688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2607;

    public GameCard_getLevelParam_3957500688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2607 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term2607, term2607.getClass(), "id", 8059786003080744426L);
        setField(term2607, term2607.getClass(), "name", "yGtHPyvYiQ");
        setField(term2607, term2607.getClass(), "nickName", "MvRIxilFMJ");
        setField(term2607, term2607.getClass(), "attribute", "iNwOJRBEjp");
        setIntField(term2607, term2607.getClass(), "charaId", -1007160944);
        setField(term2607, term2607.getClass(), "school", "XylxrMBraH");
        setField(term2607, term2607.getClass(), "gakunen", "pORebkoRdD");
        setField(term2607, term2607.getClass(), "rarity", "mXGCWJDOqA");
        setField(term2607, term2607.getClass(), "levelParam", "dpNsDgfPso");
        setIntField(term2607, term2607.getClass(), "skillId", 1135664017);
        setIntField(term2607, term2607.getClass(), "choKaikaSkillId", 590364439);
        setField(term2607, term2607.getClass(), "cardNumber", "hCWPJQKpdc");
        setField(term2607, term2607.getClass(), "version", "WzMEhMXkKx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevelParam", argTypes, term2607, args);
    }

};


