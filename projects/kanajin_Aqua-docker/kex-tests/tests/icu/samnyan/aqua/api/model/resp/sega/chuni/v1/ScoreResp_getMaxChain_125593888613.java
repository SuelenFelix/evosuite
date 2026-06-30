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

public class ScoreResp_getMaxChain_125593888613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57733;

    public ScoreResp_getMaxChain_125593888613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57733 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57733, term57733.getClass(), "musicId", -1045578030);
        setIntField(term57733, term57733.getClass(), "level", 1595269473);
        setIntField(term57733, term57733.getClass(), "playCount", 1542667674);
        setIntField(term57733, term57733.getClass(), "scoreMax", 1314061353);
        setIntField(term57733, term57733.getClass(), "resRequestCount", 1341217092);
        setIntField(term57733, term57733.getClass(), "resAcceptCount", -1945365712);
        setIntField(term57733, term57733.getClass(), "resSuccessCount", -746947278);
        setIntField(term57733, term57733.getClass(), "missCount", 799648581);
        setIntField(term57733, term57733.getClass(), "maxComboCount", -1929592392);
        setBooleanField(term57733, term57733.getClass(), "isFullCombo", true);
        setBooleanField(term57733, term57733.getClass(), "isAllJustice", true);
        setBooleanField(term57733, term57733.getClass(), "isSuccess", false);
        setIntField(term57733, term57733.getClass(), "fullChain", -557536719);
        setIntField(term57733, term57733.getClass(), "maxChain", -1507520585);
        setIntField(term57733, term57733.getClass(), "scoreRank", 87370597);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxChain", argTypes, term57733, args);
    }

};


