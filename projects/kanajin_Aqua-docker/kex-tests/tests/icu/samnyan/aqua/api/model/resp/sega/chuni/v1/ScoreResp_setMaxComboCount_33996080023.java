package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ScoreResp_setMaxComboCount_33996080023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57909;
     Object term57925;

    public ScoreResp_setMaxComboCount_33996080023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57909 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57909, term57909.getClass(), "musicId", -1151473049);
        setIntField(term57909, term57909.getClass(), "level", 1472205129);
        setIntField(term57909, term57909.getClass(), "playCount", -289676027);
        setIntField(term57909, term57909.getClass(), "scoreMax", 1248845256);
        setIntField(term57909, term57909.getClass(), "resRequestCount", 229418911);
        setIntField(term57909, term57909.getClass(), "resAcceptCount", -1130854864);
        setIntField(term57909, term57909.getClass(), "resSuccessCount", 1114579008);
        setIntField(term57909, term57909.getClass(), "missCount", 1460012868);
        setIntField(term57909, term57909.getClass(), "maxComboCount", -2073192308);
        setBooleanField(term57909, term57909.getClass(), "isFullCombo", true);
        setBooleanField(term57909, term57909.getClass(), "isAllJustice", true);
        setBooleanField(term57909, term57909.getClass(), "isSuccess", false);
        setIntField(term57909, term57909.getClass(), "fullChain", -2085811126);
        setIntField(term57909, term57909.getClass(), "maxChain", -2129502819);
        setIntField(term57909, term57909.getClass(), "scoreRank", -1063218440);
        term57925 = new Integer(-688177933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57925;
        callMethod(klass, "setMaxComboCount", argTypes, term57909, args);
    }

};


