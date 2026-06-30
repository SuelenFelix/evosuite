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

public class GameCard_getName_18646956981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1186;

    public GameCard_getName_18646956981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1186 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term1186, term1186.getClass(), "id", -872011222785455006L);
        setField(term1186, term1186.getClass(), "name", "UiUYnPrcCi");
        setField(term1186, term1186.getClass(), "nickName", "UoYtihxVaS");
        setField(term1186, term1186.getClass(), "attribute", "JDswTTCZHV");
        setIntField(term1186, term1186.getClass(), "charaId", 391863371);
        setField(term1186, term1186.getClass(), "school", "onpbIeEKoi");
        setField(term1186, term1186.getClass(), "gakunen", "YRHGsAkhxb");
        setField(term1186, term1186.getClass(), "rarity", "ffYhPOzlUs");
        setField(term1186, term1186.getClass(), "levelParam", "MLqYREekMl");
        setIntField(term1186, term1186.getClass(), "skillId", -1922583790);
        setIntField(term1186, term1186.getClass(), "choKaikaSkillId", -616727354);
        setField(term1186, term1186.getClass(), "cardNumber", "ytSBIKXogI");
        setField(term1186, term1186.getClass(), "version", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1186, args);
    }

};


