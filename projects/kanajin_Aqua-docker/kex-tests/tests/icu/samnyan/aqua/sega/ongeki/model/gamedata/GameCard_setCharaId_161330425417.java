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

public class GameCard_setCharaId_161330425417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4502;
     Object term4615;

    public GameCard_setCharaId_161330425417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4502 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term4502, term4502.getClass(), "id", 5262507301787091109L);
        setField(term4502, term4502.getClass(), "name", "XJJNClzHRf");
        setField(term4502, term4502.getClass(), "nickName", "HDaezxQfQR");
        setField(term4502, term4502.getClass(), "attribute", "iikZEapDlu");
        setIntField(term4502, term4502.getClass(), "charaId", 454281060);
        setField(term4502, term4502.getClass(), "school", "nhoHrZfnIN");
        setField(term4502, term4502.getClass(), "gakunen", "ZkMALXpEAZ");
        setField(term4502, term4502.getClass(), "rarity", "tXfQjSqDzN");
        setField(term4502, term4502.getClass(), "levelParam", "BjugTaMcxJ");
        setIntField(term4502, term4502.getClass(), "skillId", -1786399638);
        setIntField(term4502, term4502.getClass(), "choKaikaSkillId", 2055867847);
        setField(term4502, term4502.getClass(), "cardNumber", "vGiuZVPJNH");
        setField(term4502, term4502.getClass(), "version", "tlzpzIjMib");
        term4615 = new Integer(-1048298087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4615;
        callMethod(klass, "setCharaId", argTypes, term4502, args);
    }

};


