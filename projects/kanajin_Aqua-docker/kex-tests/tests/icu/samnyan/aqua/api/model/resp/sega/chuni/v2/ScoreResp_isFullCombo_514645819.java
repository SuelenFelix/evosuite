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

public class ScoreResp_isFullCombo_514645819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52499;

    public ScoreResp_isFullCombo_514645819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52499 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52499, term52499.getClass(), "musicId", -1841078275);
        setIntField(term52499, term52499.getClass(), "level", -875421053);
        setIntField(term52499, term52499.getClass(), "playCount", 212464780);
        setIntField(term52499, term52499.getClass(), "scoreMax", -1698447008);
        setIntField(term52499, term52499.getClass(), "resRequestCount", 1429592368);
        setIntField(term52499, term52499.getClass(), "resAcceptCount", -1997064536);
        setIntField(term52499, term52499.getClass(), "resSuccessCount", 798438929);
        setIntField(term52499, term52499.getClass(), "missCount", 795184090);
        setIntField(term52499, term52499.getClass(), "maxComboCount", 1181730734);
        setBooleanField(term52499, term52499.getClass(), "isFullCombo", false);
        setBooleanField(term52499, term52499.getClass(), "isAllJustice", false);
        setBooleanField(term52499, term52499.getClass(), "isSuccess", false);
        setIntField(term52499, term52499.getClass(), "fullChain", -668958857);
        setIntField(term52499, term52499.getClass(), "maxChain", -427688960);
        setIntField(term52499, term52499.getClass(), "scoreRank", 343387902);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFullCombo", argTypes, term52499, args);
    }

};


