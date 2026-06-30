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

public class ScoreResp_getLevel_17642827311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57541;

    public ScoreResp_getLevel_17642827311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57541 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57541, term57541.getClass(), "musicId", -215108807);
        setIntField(term57541, term57541.getClass(), "level", 427775680);
        setIntField(term57541, term57541.getClass(), "playCount", -1797721552);
        setIntField(term57541, term57541.getClass(), "scoreMax", 1112300927);
        setIntField(term57541, term57541.getClass(), "resRequestCount", -840496589);
        setIntField(term57541, term57541.getClass(), "resAcceptCount", -491716923);
        setIntField(term57541, term57541.getClass(), "resSuccessCount", -465766326);
        setIntField(term57541, term57541.getClass(), "missCount", 369314367);
        setIntField(term57541, term57541.getClass(), "maxComboCount", 256576657);
        setBooleanField(term57541, term57541.getClass(), "isFullCombo", false);
        setBooleanField(term57541, term57541.getClass(), "isAllJustice", true);
        setBooleanField(term57541, term57541.getClass(), "isSuccess", false);
        setIntField(term57541, term57541.getClass(), "fullChain", 1029365631);
        setIntField(term57541, term57541.getClass(), "maxChain", 833153549);
        setIntField(term57541, term57541.getClass(), "scoreRank", 2031081082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term57541, args);
    }

};


