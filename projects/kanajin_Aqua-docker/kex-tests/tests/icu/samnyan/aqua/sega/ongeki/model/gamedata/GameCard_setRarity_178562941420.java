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

public class GameCard_setRarity_178562941420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5157;

    public GameCard_setRarity_178562941420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5157 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term5157, term5157.getClass(), "id", 1233889271256172047L);
        setField(term5157, term5157.getClass(), "name", "TwfWVQGiIj");
        setField(term5157, term5157.getClass(), "nickName", "gUvcueTURF");
        setField(term5157, term5157.getClass(), "attribute", "EwQBhZjCIT");
        setIntField(term5157, term5157.getClass(), "charaId", 97029295);
        setField(term5157, term5157.getClass(), "school", "aSkmSwTnEw");
        setField(term5157, term5157.getClass(), "gakunen", "xvkbvaEGYd");
        setField(term5157, term5157.getClass(), "rarity", "HBGNxdNURv");
        setField(term5157, term5157.getClass(), "levelParam", "mfCpTPPQQm");
        setIntField(term5157, term5157.getClass(), "skillId", -1371869594);
        setIntField(term5157, term5157.getClass(), "choKaikaSkillId", -2095575670);
        setField(term5157, term5157.getClass(), "cardNumber", "OcJCIDNIXA");
        setField(term5157, term5157.getClass(), "version", "XfRABIFVEp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MHGKyEnwKc";
        callMethod(klass, "setRarity", argTypes, term5157, args);
    }

};


