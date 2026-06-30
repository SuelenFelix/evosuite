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

public class ScoreResp_getMissCount_14861046367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57637;

    public ScoreResp_getMissCount_14861046367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57637 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57637, term57637.getClass(), "musicId", -352580386);
        setIntField(term57637, term57637.getClass(), "level", 1000158617);
        setIntField(term57637, term57637.getClass(), "playCount", 776700097);
        setIntField(term57637, term57637.getClass(), "scoreMax", -147634418);
        setIntField(term57637, term57637.getClass(), "resRequestCount", 1734729002);
        setIntField(term57637, term57637.getClass(), "resAcceptCount", 356178482);
        setIntField(term57637, term57637.getClass(), "resSuccessCount", 2114777679);
        setIntField(term57637, term57637.getClass(), "missCount", 877149909);
        setIntField(term57637, term57637.getClass(), "maxComboCount", -649501188);
        setBooleanField(term57637, term57637.getClass(), "isFullCombo", false);
        setBooleanField(term57637, term57637.getClass(), "isAllJustice", true);
        setBooleanField(term57637, term57637.getClass(), "isSuccess", true);
        setIntField(term57637, term57637.getClass(), "fullChain", 2143993585);
        setIntField(term57637, term57637.getClass(), "maxChain", -2067989740);
        setIntField(term57637, term57637.getClass(), "scoreRank", 229990395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMissCount", argTypes, term57637, args);
    }

};


