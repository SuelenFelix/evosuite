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

public class GameCard_getNickName_2122867992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1389;

    public GameCard_getNickName_2122867992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1389 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term1389, term1389.getClass(), "id", -316468845751588286L);
        setField(term1389, term1389.getClass(), "name", "ieCtQFdkii");
        setField(term1389, term1389.getClass(), "nickName", "dEnhdmILtU");
        setField(term1389, term1389.getClass(), "attribute", "hoicvmsovO");
        setIntField(term1389, term1389.getClass(), "charaId", -1955890973);
        setField(term1389, term1389.getClass(), "school", "eqJfYWRaEL");
        setField(term1389, term1389.getClass(), "gakunen", "fhkbdRViHi");
        setField(term1389, term1389.getClass(), "rarity", "uWHnvSvaPl");
        setField(term1389, term1389.getClass(), "levelParam", "kBdSllIBVz");
        setIntField(term1389, term1389.getClass(), "skillId", -2038273078);
        setIntField(term1389, term1389.getClass(), "choKaikaSkillId", 1227103734);
        setField(term1389, term1389.getClass(), "cardNumber", "TJmVBGfTML");
        setField(term1389, term1389.getClass(), "version", "tPlsykYBqO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNickName", argTypes, term1389, args);
    }

};


