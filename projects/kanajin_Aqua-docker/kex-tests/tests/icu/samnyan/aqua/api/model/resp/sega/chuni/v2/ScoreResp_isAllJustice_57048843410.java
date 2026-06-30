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

public class ScoreResp_isAllJustice_57048843410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52515;

    public ScoreResp_isAllJustice_57048843410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52515 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52515, term52515.getClass(), "musicId", 1492345954);
        setIntField(term52515, term52515.getClass(), "level", 1891017572);
        setIntField(term52515, term52515.getClass(), "playCount", -391361805);
        setIntField(term52515, term52515.getClass(), "scoreMax", 1171290917);
        setIntField(term52515, term52515.getClass(), "resRequestCount", 267258768);
        setIntField(term52515, term52515.getClass(), "resAcceptCount", 1779008869);
        setIntField(term52515, term52515.getClass(), "resSuccessCount", -1058856035);
        setIntField(term52515, term52515.getClass(), "missCount", -91024448);
        setIntField(term52515, term52515.getClass(), "maxComboCount", -744517334);
        setBooleanField(term52515, term52515.getClass(), "isFullCombo", false);
        setBooleanField(term52515, term52515.getClass(), "isAllJustice", true);
        setBooleanField(term52515, term52515.getClass(), "isSuccess", false);
        setIntField(term52515, term52515.getClass(), "fullChain", -855464783);
        setIntField(term52515, term52515.getClass(), "maxChain", 1496015170);
        setIntField(term52515, term52515.getClass(), "scoreRank", 412507839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllJustice", argTypes, term52515, args);
    }

};


