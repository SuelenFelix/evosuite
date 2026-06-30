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

public class ScoreResp_setAllJustice_169231446725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57945;
     Object term57961;

    public ScoreResp_setAllJustice_169231446725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57945 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57945, term57945.getClass(), "musicId", 92455948);
        setIntField(term57945, term57945.getClass(), "level", -1557991371);
        setIntField(term57945, term57945.getClass(), "playCount", -951318891);
        setIntField(term57945, term57945.getClass(), "scoreMax", 718233611);
        setIntField(term57945, term57945.getClass(), "resRequestCount", -2015648096);
        setIntField(term57945, term57945.getClass(), "resAcceptCount", -818525120);
        setIntField(term57945, term57945.getClass(), "resSuccessCount", 2119335779);
        setIntField(term57945, term57945.getClass(), "missCount", -808109817);
        setIntField(term57945, term57945.getClass(), "maxComboCount", 33486504);
        setBooleanField(term57945, term57945.getClass(), "isFullCombo", true);
        setBooleanField(term57945, term57945.getClass(), "isAllJustice", false);
        setBooleanField(term57945, term57945.getClass(), "isSuccess", false);
        setIntField(term57945, term57945.getClass(), "fullChain", -2112546178);
        setIntField(term57945, term57945.getClass(), "maxChain", 2088023767);
        setIntField(term57945, term57945.getClass(), "scoreRank", -1750178936);
        term57961 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term57961;
        callMethod(klass, "setAllJustice", argTypes, term57945, args);
    }

};


