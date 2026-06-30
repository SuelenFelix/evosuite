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
import java.lang.Integer;

public class ScoreResp_setResSuccessCount_52928130621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52703;
     Object term52719;

    public ScoreResp_setResSuccessCount_52928130621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52703 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52703, term52703.getClass(), "musicId", -1832612963);
        setIntField(term52703, term52703.getClass(), "level", 1064073662);
        setIntField(term52703, term52703.getClass(), "playCount", 1120854991);
        setIntField(term52703, term52703.getClass(), "scoreMax", 1448504845);
        setIntField(term52703, term52703.getClass(), "resRequestCount", 451612513);
        setIntField(term52703, term52703.getClass(), "resAcceptCount", 343920197);
        setIntField(term52703, term52703.getClass(), "resSuccessCount", -521630681);
        setIntField(term52703, term52703.getClass(), "missCount", 1297681432);
        setIntField(term52703, term52703.getClass(), "maxComboCount", 820668311);
        setBooleanField(term52703, term52703.getClass(), "isFullCombo", false);
        setBooleanField(term52703, term52703.getClass(), "isAllJustice", true);
        setBooleanField(term52703, term52703.getClass(), "isSuccess", false);
        setIntField(term52703, term52703.getClass(), "fullChain", -43239204);
        setIntField(term52703, term52703.getClass(), "maxChain", -1525054580);
        setIntField(term52703, term52703.getClass(), "scoreRank", 1528804559);
        term52719 = new Integer(-706860271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52719;
        callMethod(klass, "setResSuccessCount", argTypes, term52703, args);
    }

};


