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

public class GameCard_equals_22650840626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6467;
     Object term6580;

    public GameCard_equals_22650840626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6467 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term6467, term6467.getClass(), "id", -2068172595987555756L);
        setField(term6467, term6467.getClass(), "name", "tsTGdgQYUL");
        setField(term6467, term6467.getClass(), "nickName", "TtGbVmKcnX");
        setField(term6467, term6467.getClass(), "attribute", "GJVkUrCVdD");
        setIntField(term6467, term6467.getClass(), "charaId", 1655935355);
        setField(term6467, term6467.getClass(), "school", "zNdorvdUgu");
        setField(term6467, term6467.getClass(), "gakunen", "oPxuZbkYio");
        setField(term6467, term6467.getClass(), "rarity", "vKitydDVnM");
        setField(term6467, term6467.getClass(), "levelParam", "urCiQnUFBM");
        setIntField(term6467, term6467.getClass(), "skillId", -481533957);
        setIntField(term6467, term6467.getClass(), "choKaikaSkillId", 1240914516);
        setField(term6467, term6467.getClass(), "cardNumber", "EKjQdtKxAM");
        setField(term6467, term6467.getClass(), "version", "TXZAIPQJHt");
        term6580 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6580;
        callMethod(klass, "equals", argTypes, term6467, args);
    }

};


