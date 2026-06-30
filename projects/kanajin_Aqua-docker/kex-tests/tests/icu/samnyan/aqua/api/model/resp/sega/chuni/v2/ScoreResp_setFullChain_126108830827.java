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

public class ScoreResp_setFullChain_126108830827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52811;
     Object term52827;

    public ScoreResp_setFullChain_126108830827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52811 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52811, term52811.getClass(), "musicId", 1122198417);
        setIntField(term52811, term52811.getClass(), "level", 1853596233);
        setIntField(term52811, term52811.getClass(), "playCount", 995880114);
        setIntField(term52811, term52811.getClass(), "scoreMax", -375101902);
        setIntField(term52811, term52811.getClass(), "resRequestCount", -400603688);
        setIntField(term52811, term52811.getClass(), "resAcceptCount", 2063246363);
        setIntField(term52811, term52811.getClass(), "resSuccessCount", 1989206053);
        setIntField(term52811, term52811.getClass(), "missCount", 68383055);
        setIntField(term52811, term52811.getClass(), "maxComboCount", -2072291494);
        setBooleanField(term52811, term52811.getClass(), "isFullCombo", true);
        setBooleanField(term52811, term52811.getClass(), "isAllJustice", true);
        setBooleanField(term52811, term52811.getClass(), "isSuccess", false);
        setIntField(term52811, term52811.getClass(), "fullChain", 1818270937);
        setIntField(term52811, term52811.getClass(), "maxChain", -1309831162);
        setIntField(term52811, term52811.getClass(), "scoreRank", 711539163);
        term52827 = new Integer(351652776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52827;
        callMethod(klass, "setFullChain", argTypes, term52811, args);
    }

};


