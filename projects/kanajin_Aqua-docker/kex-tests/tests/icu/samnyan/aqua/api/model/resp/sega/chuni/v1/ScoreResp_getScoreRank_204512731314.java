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

public class ScoreResp_getScoreRank_204512731314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57749;

    public ScoreResp_getScoreRank_204512731314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57749 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57749, term57749.getClass(), "musicId", -1516708019);
        setIntField(term57749, term57749.getClass(), "level", 1316108940);
        setIntField(term57749, term57749.getClass(), "playCount", -1092328406);
        setIntField(term57749, term57749.getClass(), "scoreMax", -1065662465);
        setIntField(term57749, term57749.getClass(), "resRequestCount", 689033534);
        setIntField(term57749, term57749.getClass(), "resAcceptCount", -1092529867);
        setIntField(term57749, term57749.getClass(), "resSuccessCount", -1788533025);
        setIntField(term57749, term57749.getClass(), "missCount", -1271339104);
        setIntField(term57749, term57749.getClass(), "maxComboCount", -815986276);
        setBooleanField(term57749, term57749.getClass(), "isFullCombo", false);
        setBooleanField(term57749, term57749.getClass(), "isAllJustice", true);
        setBooleanField(term57749, term57749.getClass(), "isSuccess", true);
        setIntField(term57749, term57749.getClass(), "fullChain", 1352632981);
        setIntField(term57749, term57749.getClass(), "maxChain", -2076492465);
        setIntField(term57749, term57749.getClass(), "scoreRank", -926106316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreRank", argTypes, term57749, args);
    }

};


