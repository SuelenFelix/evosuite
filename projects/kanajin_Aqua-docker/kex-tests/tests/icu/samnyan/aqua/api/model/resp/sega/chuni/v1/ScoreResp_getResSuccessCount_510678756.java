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

public class ScoreResp_getResSuccessCount_510678756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57621;

    public ScoreResp_getResSuccessCount_510678756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57621 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57621, term57621.getClass(), "musicId", 630565003);
        setIntField(term57621, term57621.getClass(), "level", -1966988507);
        setIntField(term57621, term57621.getClass(), "playCount", -1089838622);
        setIntField(term57621, term57621.getClass(), "scoreMax", -937178869);
        setIntField(term57621, term57621.getClass(), "resRequestCount", -1952449836);
        setIntField(term57621, term57621.getClass(), "resAcceptCount", -405260008);
        setIntField(term57621, term57621.getClass(), "resSuccessCount", -468459707);
        setIntField(term57621, term57621.getClass(), "missCount", -1652639905);
        setIntField(term57621, term57621.getClass(), "maxComboCount", -1461889742);
        setBooleanField(term57621, term57621.getClass(), "isFullCombo", false);
        setBooleanField(term57621, term57621.getClass(), "isAllJustice", true);
        setBooleanField(term57621, term57621.getClass(), "isSuccess", false);
        setIntField(term57621, term57621.getClass(), "fullChain", 1948939030);
        setIntField(term57621, term57621.getClass(), "maxChain", -1707167847);
        setIntField(term57621, term57621.getClass(), "scoreRank", 1083097092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResSuccessCount", argTypes, term57621, args);
    }

};


