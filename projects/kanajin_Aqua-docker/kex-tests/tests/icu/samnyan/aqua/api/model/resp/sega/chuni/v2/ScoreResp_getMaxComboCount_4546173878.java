package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ScoreResp_getMaxComboCount_4546173878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52483;

    public ScoreResp_getMaxComboCount_4546173878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52483 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52483, term52483.getClass(), "musicId", -444697262);
        setIntField(term52483, term52483.getClass(), "level", -460183304);
        setIntField(term52483, term52483.getClass(), "playCount", -2123879019);
        setIntField(term52483, term52483.getClass(), "scoreMax", -745063212);
        setIntField(term52483, term52483.getClass(), "resRequestCount", 298277204);
        setIntField(term52483, term52483.getClass(), "resAcceptCount", 1536563217);
        setIntField(term52483, term52483.getClass(), "resSuccessCount", -449582867);
        setIntField(term52483, term52483.getClass(), "missCount", -650176523);
        setIntField(term52483, term52483.getClass(), "maxComboCount", 2071056240);
        setBooleanField(term52483, term52483.getClass(), "isFullCombo", false);
        setBooleanField(term52483, term52483.getClass(), "isAllJustice", true);
        setBooleanField(term52483, term52483.getClass(), "isSuccess", true);
        setIntField(term52483, term52483.getClass(), "fullChain", 1894657425);
        setIntField(term52483, term52483.getClass(), "maxChain", -263942209);
        setIntField(term52483, term52483.getClass(), "scoreRank", 820400430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxComboCount", argTypes, term52483, args);
    }

};


