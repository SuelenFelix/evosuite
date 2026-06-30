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

public class GameCard_getSkillId_15564852149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2810;

    public GameCard_getSkillId_15564852149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2810 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term2810, term2810.getClass(), "id", -4365849114644724155L);
        setField(term2810, term2810.getClass(), "name", "XOiDvlDhdc");
        setField(term2810, term2810.getClass(), "nickName", "AdxvLJhNLe");
        setField(term2810, term2810.getClass(), "attribute", "lHfTrWKMPk");
        setIntField(term2810, term2810.getClass(), "charaId", 865208305);
        setField(term2810, term2810.getClass(), "school", "JDaAnsVTGV");
        setField(term2810, term2810.getClass(), "gakunen", "mLUZFTfjle");
        setField(term2810, term2810.getClass(), "rarity", "xIeFjkHkOe");
        setField(term2810, term2810.getClass(), "levelParam", "SdCKLMIYnX");
        setIntField(term2810, term2810.getClass(), "skillId", -1275173084);
        setIntField(term2810, term2810.getClass(), "choKaikaSkillId", -244121226);
        setField(term2810, term2810.getClass(), "cardNumber", "OJJtVNPyKZ");
        setField(term2810, term2810.getClass(), "version", "AKNapTAfmD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillId", argTypes, term2810, args);
    }

};


