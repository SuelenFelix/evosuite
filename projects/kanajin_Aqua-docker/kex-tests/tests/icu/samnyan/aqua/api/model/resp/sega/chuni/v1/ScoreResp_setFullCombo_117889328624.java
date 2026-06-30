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
import java.lang.Boolean;

public class ScoreResp_setFullCombo_117889328624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57927;
     Object term57943;

    public ScoreResp_setFullCombo_117889328624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57927 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57927, term57927.getClass(), "musicId", -566941881);
        setIntField(term57927, term57927.getClass(), "level", 2051356935);
        setIntField(term57927, term57927.getClass(), "playCount", -383329501);
        setIntField(term57927, term57927.getClass(), "scoreMax", 617819961);
        setIntField(term57927, term57927.getClass(), "resRequestCount", -1030437854);
        setIntField(term57927, term57927.getClass(), "resAcceptCount", 131035705);
        setIntField(term57927, term57927.getClass(), "resSuccessCount", 1345091994);
        setIntField(term57927, term57927.getClass(), "missCount", -657987818);
        setIntField(term57927, term57927.getClass(), "maxComboCount", -211167283);
        setBooleanField(term57927, term57927.getClass(), "isFullCombo", false);
        setBooleanField(term57927, term57927.getClass(), "isAllJustice", true);
        setBooleanField(term57927, term57927.getClass(), "isSuccess", true);
        setIntField(term57927, term57927.getClass(), "fullChain", -1037774699);
        setIntField(term57927, term57927.getClass(), "maxChain", -851853041);
        setIntField(term57927, term57927.getClass(), "scoreRank", 1501524873);
        term57943 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term57943;
        callMethod(klass, "setFullCombo", argTypes, term57927, args);
    }

};


