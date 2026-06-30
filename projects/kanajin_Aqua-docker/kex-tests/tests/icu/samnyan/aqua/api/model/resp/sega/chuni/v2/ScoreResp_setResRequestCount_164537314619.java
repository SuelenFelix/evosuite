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

public class ScoreResp_setResRequestCount_164537314619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52667;
     Object term52683;

    public ScoreResp_setResRequestCount_164537314619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52667 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52667, term52667.getClass(), "musicId", -68148707);
        setIntField(term52667, term52667.getClass(), "level", -487634357);
        setIntField(term52667, term52667.getClass(), "playCount", 52605389);
        setIntField(term52667, term52667.getClass(), "scoreMax", -769585004);
        setIntField(term52667, term52667.getClass(), "resRequestCount", 483184455);
        setIntField(term52667, term52667.getClass(), "resAcceptCount", -1969040570);
        setIntField(term52667, term52667.getClass(), "resSuccessCount", 1627123408);
        setIntField(term52667, term52667.getClass(), "missCount", 782600956);
        setIntField(term52667, term52667.getClass(), "maxComboCount", -1051453067);
        setBooleanField(term52667, term52667.getClass(), "isFullCombo", false);
        setBooleanField(term52667, term52667.getClass(), "isAllJustice", false);
        setBooleanField(term52667, term52667.getClass(), "isSuccess", false);
        setIntField(term52667, term52667.getClass(), "fullChain", -865849681);
        setIntField(term52667, term52667.getClass(), "maxChain", -1554795442);
        setIntField(term52667, term52667.getClass(), "scoreRank", 1486110844);
        term52683 = new Integer(1811211444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52683;
        callMethod(klass, "setResRequestCount", argTypes, term52667, args);
    }

};


