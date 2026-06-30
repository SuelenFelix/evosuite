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

public class ScoreResp_getMusicId_19333266080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52355;

    public ScoreResp_getMusicId_19333266080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52355 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52355, term52355.getClass(), "musicId", 2132585005);
        setIntField(term52355, term52355.getClass(), "level", 451557051);
        setIntField(term52355, term52355.getClass(), "playCount", 71783796);
        setIntField(term52355, term52355.getClass(), "scoreMax", 2085417929);
        setIntField(term52355, term52355.getClass(), "resRequestCount", 644887242);
        setIntField(term52355, term52355.getClass(), "resAcceptCount", 1544325432);
        setIntField(term52355, term52355.getClass(), "resSuccessCount", 908157389);
        setIntField(term52355, term52355.getClass(), "missCount", 691619263);
        setIntField(term52355, term52355.getClass(), "maxComboCount", 637841150);
        setBooleanField(term52355, term52355.getClass(), "isFullCombo", false);
        setBooleanField(term52355, term52355.getClass(), "isAllJustice", true);
        setBooleanField(term52355, term52355.getClass(), "isSuccess", false);
        setIntField(term52355, term52355.getClass(), "fullChain", 1599041316);
        setIntField(term52355, term52355.getClass(), "maxChain", 1478113587);
        setIntField(term52355, term52355.getClass(), "scoreRank", 1580986308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term52355, args);
    }

};


