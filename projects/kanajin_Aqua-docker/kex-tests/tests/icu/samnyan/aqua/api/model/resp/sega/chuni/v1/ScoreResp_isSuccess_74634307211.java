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

public class ScoreResp_isSuccess_74634307211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57701;

    public ScoreResp_isSuccess_74634307211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57701 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57701, term57701.getClass(), "musicId", -507386961);
        setIntField(term57701, term57701.getClass(), "level", -476320083);
        setIntField(term57701, term57701.getClass(), "playCount", -2100928588);
        setIntField(term57701, term57701.getClass(), "scoreMax", -81621107);
        setIntField(term57701, term57701.getClass(), "resRequestCount", -1617104329);
        setIntField(term57701, term57701.getClass(), "resAcceptCount", -34705122);
        setIntField(term57701, term57701.getClass(), "resSuccessCount", 1705528966);
        setIntField(term57701, term57701.getClass(), "missCount", 988288101);
        setIntField(term57701, term57701.getClass(), "maxComboCount", -1408161596);
        setBooleanField(term57701, term57701.getClass(), "isFullCombo", false);
        setBooleanField(term57701, term57701.getClass(), "isAllJustice", false);
        setBooleanField(term57701, term57701.getClass(), "isSuccess", false);
        setIntField(term57701, term57701.getClass(), "fullChain", 1726412898);
        setIntField(term57701, term57701.getClass(), "maxChain", -669874944);
        setIntField(term57701, term57701.getClass(), "scoreRank", -1111349476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSuccess", argTypes, term57701, args);
    }

};


