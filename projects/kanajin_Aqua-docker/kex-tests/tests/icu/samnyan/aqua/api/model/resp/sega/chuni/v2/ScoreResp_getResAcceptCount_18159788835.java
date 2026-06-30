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

public class ScoreResp_getResAcceptCount_18159788835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52435;

    public ScoreResp_getResAcceptCount_18159788835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52435 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52435, term52435.getClass(), "musicId", 678776902);
        setIntField(term52435, term52435.getClass(), "level", -1148076813);
        setIntField(term52435, term52435.getClass(), "playCount", 1450586432);
        setIntField(term52435, term52435.getClass(), "scoreMax", 1726648633);
        setIntField(term52435, term52435.getClass(), "resRequestCount", 859999867);
        setIntField(term52435, term52435.getClass(), "resAcceptCount", 469845570);
        setIntField(term52435, term52435.getClass(), "resSuccessCount", 1192737321);
        setIntField(term52435, term52435.getClass(), "missCount", 827191651);
        setIntField(term52435, term52435.getClass(), "maxComboCount", -432140549);
        setBooleanField(term52435, term52435.getClass(), "isFullCombo", false);
        setBooleanField(term52435, term52435.getClass(), "isAllJustice", false);
        setBooleanField(term52435, term52435.getClass(), "isSuccess", true);
        setIntField(term52435, term52435.getClass(), "fullChain", -1134516117);
        setIntField(term52435, term52435.getClass(), "maxChain", 1618532335);
        setIntField(term52435, term52435.getClass(), "scoreRank", 1620043047);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResAcceptCount", argTypes, term52435, args);
    }

};


