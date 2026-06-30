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

public class GameCard_hashCode_22217826928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6875;

    public GameCard_hashCode_22217826928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6875 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term6875, term6875.getClass(), "id", -6645965768855543712L);
        setField(term6875, term6875.getClass(), "name", "DzHVBMqWtE");
        setField(term6875, term6875.getClass(), "nickName", "THZSpzBRYP");
        setField(term6875, term6875.getClass(), "attribute", "ZfBIVGBQOE");
        setIntField(term6875, term6875.getClass(), "charaId", 1442160736);
        setField(term6875, term6875.getClass(), "school", "QSrDQfEsTR");
        setField(term6875, term6875.getClass(), "gakunen", "PsqusYmejD");
        setField(term6875, term6875.getClass(), "rarity", "NTWMiBEaDF");
        setField(term6875, term6875.getClass(), "levelParam", "SPBstwKFVr");
        setIntField(term6875, term6875.getClass(), "skillId", 1114000454);
        setIntField(term6875, term6875.getClass(), "choKaikaSkillId", -556405712);
        setField(term6875, term6875.getClass(), "cardNumber", "WxYUTuqmIq");
        setField(term6875, term6875.getClass(), "version", "OeQLvhVERT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6875, args);
    }

};


