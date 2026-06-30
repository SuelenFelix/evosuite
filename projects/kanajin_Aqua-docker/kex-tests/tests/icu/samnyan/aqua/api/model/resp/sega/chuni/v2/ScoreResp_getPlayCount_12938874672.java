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

public class ScoreResp_getPlayCount_12938874672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52387;

    public ScoreResp_getPlayCount_12938874672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52387 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52387, term52387.getClass(), "musicId", -561801733);
        setIntField(term52387, term52387.getClass(), "level", 2134609936);
        setIntField(term52387, term52387.getClass(), "playCount", -409989519);
        setIntField(term52387, term52387.getClass(), "scoreMax", -1293074430);
        setIntField(term52387, term52387.getClass(), "resRequestCount", 608662433);
        setIntField(term52387, term52387.getClass(), "resAcceptCount", -2015476493);
        setIntField(term52387, term52387.getClass(), "resSuccessCount", 41528103);
        setIntField(term52387, term52387.getClass(), "missCount", -1732381818);
        setIntField(term52387, term52387.getClass(), "maxComboCount", 1960614460);
        setBooleanField(term52387, term52387.getClass(), "isFullCombo", true);
        setBooleanField(term52387, term52387.getClass(), "isAllJustice", false);
        setBooleanField(term52387, term52387.getClass(), "isSuccess", false);
        setIntField(term52387, term52387.getClass(), "fullChain", -1488501179);
        setIntField(term52387, term52387.getClass(), "maxChain", 2086648406);
        setIntField(term52387, term52387.getClass(), "scoreRank", 805890273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term52387, args);
    }

};


