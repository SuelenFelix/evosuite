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

public class ScoreResp_setPlayCount_47422148317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52631;
     Object term52647;

    public ScoreResp_setPlayCount_47422148317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52631 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52631, term52631.getClass(), "musicId", -1735958377);
        setIntField(term52631, term52631.getClass(), "level", -477618469);
        setIntField(term52631, term52631.getClass(), "playCount", 117739625);
        setIntField(term52631, term52631.getClass(), "scoreMax", -314816968);
        setIntField(term52631, term52631.getClass(), "resRequestCount", -1478972076);
        setIntField(term52631, term52631.getClass(), "resAcceptCount", 828708445);
        setIntField(term52631, term52631.getClass(), "resSuccessCount", -1198357943);
        setIntField(term52631, term52631.getClass(), "missCount", 407342373);
        setIntField(term52631, term52631.getClass(), "maxComboCount", 633857490);
        setBooleanField(term52631, term52631.getClass(), "isFullCombo", false);
        setBooleanField(term52631, term52631.getClass(), "isAllJustice", true);
        setBooleanField(term52631, term52631.getClass(), "isSuccess", true);
        setIntField(term52631, term52631.getClass(), "fullChain", -602285518);
        setIntField(term52631, term52631.getClass(), "maxChain", 95548457);
        setIntField(term52631, term52631.getClass(), "scoreRank", -652818479);
        term52647 = new Integer(909221962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52647;
        callMethod(klass, "setPlayCount", argTypes, term52631, args);
    }

};


