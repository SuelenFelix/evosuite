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

public class ScoreResp_getResAcceptCount_16868961645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57605;

    public ScoreResp_getResAcceptCount_16868961645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57605 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57605, term57605.getClass(), "musicId", 760722690);
        setIntField(term57605, term57605.getClass(), "level", -714009282);
        setIntField(term57605, term57605.getClass(), "playCount", -1506023567);
        setIntField(term57605, term57605.getClass(), "scoreMax", 172275665);
        setIntField(term57605, term57605.getClass(), "resRequestCount", 1472271840);
        setIntField(term57605, term57605.getClass(), "resAcceptCount", -2050302351);
        setIntField(term57605, term57605.getClass(), "resSuccessCount", 1778549764);
        setIntField(term57605, term57605.getClass(), "missCount", 456140800);
        setIntField(term57605, term57605.getClass(), "maxComboCount", -80072701);
        setBooleanField(term57605, term57605.getClass(), "isFullCombo", false);
        setBooleanField(term57605, term57605.getClass(), "isAllJustice", false);
        setBooleanField(term57605, term57605.getClass(), "isSuccess", true);
        setIntField(term57605, term57605.getClass(), "fullChain", -224845635);
        setIntField(term57605, term57605.getClass(), "maxChain", 115902179);
        setIntField(term57605, term57605.getClass(), "scoreRank", 930979700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResAcceptCount", argTypes, term57605, args);
    }

};


