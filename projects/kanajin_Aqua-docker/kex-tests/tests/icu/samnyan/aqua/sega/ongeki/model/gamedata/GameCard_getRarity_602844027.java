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

public class GameCard_getRarity_602844027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2404;

    public GameCard_getRarity_602844027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2404 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term2404, term2404.getClass(), "id", -2585684163342970173L);
        setField(term2404, term2404.getClass(), "name", "qxSDVejjiY");
        setField(term2404, term2404.getClass(), "nickName", "xBsXSDjXYK");
        setField(term2404, term2404.getClass(), "attribute", "sEnIVFtZuQ");
        setIntField(term2404, term2404.getClass(), "charaId", -6029667);
        setField(term2404, term2404.getClass(), "school", "ZVecLZMLHF");
        setField(term2404, term2404.getClass(), "gakunen", "fztQhjqwdP");
        setField(term2404, term2404.getClass(), "rarity", "eVpkWxjuki");
        setField(term2404, term2404.getClass(), "levelParam", "SJiQaLvSKv");
        setIntField(term2404, term2404.getClass(), "skillId", -2068769794);
        setIntField(term2404, term2404.getClass(), "choKaikaSkillId", -117576464);
        setField(term2404, term2404.getClass(), "cardNumber", "OEXDRUKcFl");
        setField(term2404, term2404.getClass(), "version", "RYdKCNNMBR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRarity", argTypes, term2404, args);
    }

};


