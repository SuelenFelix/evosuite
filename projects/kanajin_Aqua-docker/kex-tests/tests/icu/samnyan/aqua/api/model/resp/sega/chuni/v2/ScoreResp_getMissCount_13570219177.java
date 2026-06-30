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

public class ScoreResp_getMissCount_13570219177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52467;

    public ScoreResp_getMissCount_13570219177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52467 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52467, term52467.getClass(), "musicId", -1963566761);
        setIntField(term52467, term52467.getClass(), "level", -1043400736);
        setIntField(term52467, term52467.getClass(), "playCount", 497106793);
        setIntField(term52467, term52467.getClass(), "scoreMax", -1904196296);
        setIntField(term52467, term52467.getClass(), "resRequestCount", -1857445668);
        setIntField(term52467, term52467.getClass(), "resAcceptCount", -1481132293);
        setIntField(term52467, term52467.getClass(), "resSuccessCount", -1458633954);
        setIntField(term52467, term52467.getClass(), "missCount", 1334294885);
        setIntField(term52467, term52467.getClass(), "maxComboCount", -711784035);
        setBooleanField(term52467, term52467.getClass(), "isFullCombo", false);
        setBooleanField(term52467, term52467.getClass(), "isAllJustice", true);
        setBooleanField(term52467, term52467.getClass(), "isSuccess", true);
        setIntField(term52467, term52467.getClass(), "fullChain", -497219797);
        setIntField(term52467, term52467.getClass(), "maxChain", 720453125);
        setIntField(term52467, term52467.getClass(), "scoreRank", -860314891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMissCount", argTypes, term52467, args);
    }

};


