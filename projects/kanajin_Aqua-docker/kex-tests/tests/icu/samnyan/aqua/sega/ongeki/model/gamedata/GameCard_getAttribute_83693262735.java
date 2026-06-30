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

public class GameCard_getAttribute_83693262735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7502;

    public GameCard_getAttribute_83693262735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7502 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term7502, term7502.getClass(), "id", 0L);
        setField(term7502, term7502.getClass(), "name", null);
        setField(term7502, term7502.getClass(), "nickName", null);
        setField(term7502, term7502.getClass(), "attribute", null);
        setIntField(term7502, term7502.getClass(), "charaId", 0);
        setField(term7502, term7502.getClass(), "school", null);
        setField(term7502, term7502.getClass(), "gakunen", null);
        setField(term7502, term7502.getClass(), "rarity", null);
        setField(term7502, term7502.getClass(), "levelParam", null);
        setIntField(term7502, term7502.getClass(), "skillId", 0);
        setIntField(term7502, term7502.getClass(), "choKaikaSkillId", 0);
        setField(term7502, term7502.getClass(), "cardNumber", null);
        setField(term7502, term7502.getClass(), "version", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttribute", argTypes, term7502, args);
    }

};


