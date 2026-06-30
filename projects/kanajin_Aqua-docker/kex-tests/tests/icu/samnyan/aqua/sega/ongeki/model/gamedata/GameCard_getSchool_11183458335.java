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

public class GameCard_getSchool_11183458335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1998;

    public GameCard_getSchool_11183458335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1998 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term1998, term1998.getClass(), "id", -4920224193275732920L);
        setField(term1998, term1998.getClass(), "name", "TimdotUuNC");
        setField(term1998, term1998.getClass(), "nickName", "PkWMRdJcBb");
        setField(term1998, term1998.getClass(), "attribute", "jSpAteRute");
        setIntField(term1998, term1998.getClass(), "charaId", 597278769);
        setField(term1998, term1998.getClass(), "school", "swZVeJAxjt");
        setField(term1998, term1998.getClass(), "gakunen", "xOcJIiQQDu");
        setField(term1998, term1998.getClass(), "rarity", "GVizqqzXpy");
        setField(term1998, term1998.getClass(), "levelParam", "JqXGgAhZPl");
        setIntField(term1998, term1998.getClass(), "skillId", -1685132342);
        setIntField(term1998, term1998.getClass(), "choKaikaSkillId", -1456670397);
        setField(term1998, term1998.getClass(), "cardNumber", "jiKYgYHqIS");
        setField(term1998, term1998.getClass(), "version", "DfISiziTgG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSchool", argTypes, term1998, args);
    }

};


