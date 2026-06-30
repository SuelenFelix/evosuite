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

public class ScoreResp_getPlayCount_129388746738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52993;

    public ScoreResp_getPlayCount_129388746738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52993 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52993, term52993.getClass(), "musicId", 0);
        setIntField(term52993, term52993.getClass(), "level", 0);
        setIntField(term52993, term52993.getClass(), "playCount", 0);
        setIntField(term52993, term52993.getClass(), "scoreMax", 0);
        setIntField(term52993, term52993.getClass(), "resRequestCount", 0);
        setIntField(term52993, term52993.getClass(), "resAcceptCount", 0);
        setIntField(term52993, term52993.getClass(), "resSuccessCount", 0);
        setIntField(term52993, term52993.getClass(), "missCount", 0);
        setIntField(term52993, term52993.getClass(), "maxComboCount", 0);
        setBooleanField(term52993, term52993.getClass(), "isFullCombo", false);
        setBooleanField(term52993, term52993.getClass(), "isAllJustice", false);
        setBooleanField(term52993, term52993.getClass(), "isSuccess", false);
        setIntField(term52993, term52993.getClass(), "fullChain", 0);
        setIntField(term52993, term52993.getClass(), "maxChain", 0);
        setIntField(term52993, term52993.getClass(), "scoreRank", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term52993, args);
    }

};


