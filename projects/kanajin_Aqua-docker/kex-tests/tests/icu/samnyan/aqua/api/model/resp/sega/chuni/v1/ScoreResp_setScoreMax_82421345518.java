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

public class ScoreResp_setScoreMax_82421345518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57819;
     Object term57835;

    public ScoreResp_setScoreMax_82421345518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57819 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57819, term57819.getClass(), "musicId", -1351747599);
        setIntField(term57819, term57819.getClass(), "level", 376811147);
        setIntField(term57819, term57819.getClass(), "playCount", 1230466580);
        setIntField(term57819, term57819.getClass(), "scoreMax", -367049771);
        setIntField(term57819, term57819.getClass(), "resRequestCount", 469812226);
        setIntField(term57819, term57819.getClass(), "resAcceptCount", 1798598374);
        setIntField(term57819, term57819.getClass(), "resSuccessCount", -1689820547);
        setIntField(term57819, term57819.getClass(), "missCount", 100902964);
        setIntField(term57819, term57819.getClass(), "maxComboCount", -619984116);
        setBooleanField(term57819, term57819.getClass(), "isFullCombo", true);
        setBooleanField(term57819, term57819.getClass(), "isAllJustice", false);
        setBooleanField(term57819, term57819.getClass(), "isSuccess", false);
        setIntField(term57819, term57819.getClass(), "fullChain", -468766084);
        setIntField(term57819, term57819.getClass(), "maxChain", -1511205639);
        setIntField(term57819, term57819.getClass(), "scoreRank", 488730747);
        term57835 = new Integer(1410439573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57835;
        callMethod(klass, "setScoreMax", argTypes, term57819, args);
    }

};


