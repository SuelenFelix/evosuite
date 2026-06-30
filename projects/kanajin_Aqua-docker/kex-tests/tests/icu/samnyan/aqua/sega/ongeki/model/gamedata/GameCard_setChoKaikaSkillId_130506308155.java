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

public class GameCard_setChoKaikaSkillId_130506308155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7608;
     Object term7613;

    public GameCard_setChoKaikaSkillId_130506308155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7608 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term7608, term7608.getClass(), "id", 0L);
        setField(term7608, term7608.getClass(), "name", null);
        setField(term7608, term7608.getClass(), "nickName", null);
        setField(term7608, term7608.getClass(), "attribute", null);
        setIntField(term7608, term7608.getClass(), "charaId", 0);
        setField(term7608, term7608.getClass(), "school", null);
        setField(term7608, term7608.getClass(), "gakunen", null);
        setField(term7608, term7608.getClass(), "rarity", null);
        setField(term7608, term7608.getClass(), "levelParam", null);
        setIntField(term7608, term7608.getClass(), "skillId", 0);
        setIntField(term7608, term7608.getClass(), "choKaikaSkillId", 0);
        setField(term7608, term7608.getClass(), "cardNumber", null);
        setField(term7608, term7608.getClass(), "version", null);
        term7613 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7613;
        callMethod(klass, "setChoKaikaSkillId", argTypes, term7608, args);
    }

};


