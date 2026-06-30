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

public class GameCard_setAttribute_99969006716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4277;

    public GameCard_setAttribute_99969006716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4277 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term4277, term4277.getClass(), "id", -5892135042702373494L);
        setField(term4277, term4277.getClass(), "name", "kNqaJKIATy");
        setField(term4277, term4277.getClass(), "nickName", "vKQukfbJUd");
        setField(term4277, term4277.getClass(), "attribute", "lFRJFUMVbx");
        setIntField(term4277, term4277.getClass(), "charaId", 579005622);
        setField(term4277, term4277.getClass(), "school", "sZdUNdggUW");
        setField(term4277, term4277.getClass(), "gakunen", "OqbwYQfvAe");
        setField(term4277, term4277.getClass(), "rarity", "tRxZafjqIx");
        setField(term4277, term4277.getClass(), "levelParam", "DhjNLmRMCu");
        setIntField(term4277, term4277.getClass(), "skillId", -14890619);
        setIntField(term4277, term4277.getClass(), "choKaikaSkillId", 1632125673);
        setField(term4277, term4277.getClass(), "cardNumber", "PgPzMSEjjX");
        setField(term4277, term4277.getClass(), "version", "wzsPSPcRdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kGMQdqJYyB";
        callMethod(klass, "setAttribute", argTypes, term4277, args);
    }

};


