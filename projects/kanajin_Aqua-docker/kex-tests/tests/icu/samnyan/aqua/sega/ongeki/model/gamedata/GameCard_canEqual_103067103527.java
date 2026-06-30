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

public class GameCard_canEqual_103067103527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6671;
     Object term6784;

    public GameCard_canEqual_103067103527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6671 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term6671, term6671.getClass(), "id", -6292278961887936280L);
        setField(term6671, term6671.getClass(), "name", "DIbeDHICho");
        setField(term6671, term6671.getClass(), "nickName", "dJGPlmSRnz");
        setField(term6671, term6671.getClass(), "attribute", "DPskuFUobI");
        setIntField(term6671, term6671.getClass(), "charaId", -1465035361);
        setField(term6671, term6671.getClass(), "school", "wBGfLpNNiZ");
        setField(term6671, term6671.getClass(), "gakunen", "yUGCjlqgJE");
        setField(term6671, term6671.getClass(), "rarity", "PXdVZyoJyC");
        setField(term6671, term6671.getClass(), "levelParam", "vLerpqavFM");
        setIntField(term6671, term6671.getClass(), "skillId", 1090617576);
        setIntField(term6671, term6671.getClass(), "choKaikaSkillId", -1547384488);
        setField(term6671, term6671.getClass(), "cardNumber", "qnvxzwuGKX");
        setField(term6671, term6671.getClass(), "version", "EdPAvpluZg");
        term6784 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6784;
        callMethod(klass, "canEqual", argTypes, term6671, args);
    }

};


