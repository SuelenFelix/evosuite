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

public class ScoreResp_getResRequestCount_21235865774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57589;

    public ScoreResp_getResRequestCount_21235865774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57589 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57589, term57589.getClass(), "musicId", 1157850302);
        setIntField(term57589, term57589.getClass(), "level", -1748801993);
        setIntField(term57589, term57589.getClass(), "playCount", -1351089042);
        setIntField(term57589, term57589.getClass(), "scoreMax", -368642982);
        setIntField(term57589, term57589.getClass(), "resRequestCount", 1100435548);
        setIntField(term57589, term57589.getClass(), "resAcceptCount", 1930975280);
        setIntField(term57589, term57589.getClass(), "resSuccessCount", 1639113177);
        setIntField(term57589, term57589.getClass(), "missCount", -1469393277);
        setIntField(term57589, term57589.getClass(), "maxComboCount", 1311573269);
        setBooleanField(term57589, term57589.getClass(), "isFullCombo", false);
        setBooleanField(term57589, term57589.getClass(), "isAllJustice", true);
        setBooleanField(term57589, term57589.getClass(), "isSuccess", true);
        setIntField(term57589, term57589.getClass(), "fullChain", 1393744942);
        setIntField(term57589, term57589.getClass(), "maxChain", 528056114);
        setIntField(term57589, term57589.getClass(), "scoreRank", 1730452667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResRequestCount", argTypes, term57589, args);
    }

};


