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

public class GameCard_getCharaId_11290431604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1795;

    public GameCard_getCharaId_11290431604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1795 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term1795, term1795.getClass(), "id", -6573104506744284592L);
        setField(term1795, term1795.getClass(), "name", "OWKQODBLzb");
        setField(term1795, term1795.getClass(), "nickName", "wGmYcqUkgE");
        setField(term1795, term1795.getClass(), "attribute", "idgaQsnJpQ");
        setIntField(term1795, term1795.getClass(), "charaId", 1134449235);
        setField(term1795, term1795.getClass(), "school", "VgZnGoIFwQ");
        setField(term1795, term1795.getClass(), "gakunen", "jUbSRrkrYZ");
        setField(term1795, term1795.getClass(), "rarity", "bWWfajKbEX");
        setField(term1795, term1795.getClass(), "levelParam", "cAPeiZHKGJ");
        setIntField(term1795, term1795.getClass(), "skillId", -883034806);
        setIntField(term1795, term1795.getClass(), "choKaikaSkillId", 1585847225);
        setField(term1795, term1795.getClass(), "cardNumber", "LvJFtLBaxj");
        setField(term1795, term1795.getClass(), "version", "PHvxnGHptP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharaId", argTypes, term1795, args);
    }

};


