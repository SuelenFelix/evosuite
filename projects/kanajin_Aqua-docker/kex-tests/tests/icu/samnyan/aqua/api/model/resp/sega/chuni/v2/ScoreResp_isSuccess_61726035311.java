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

public class ScoreResp_isSuccess_61726035311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52531;

    public ScoreResp_isSuccess_61726035311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52531 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52531, term52531.getClass(), "musicId", -143522206);
        setIntField(term52531, term52531.getClass(), "level", 70726858);
        setIntField(term52531, term52531.getClass(), "playCount", -1883665560);
        setIntField(term52531, term52531.getClass(), "scoreMax", -1304361419);
        setIntField(term52531, term52531.getClass(), "resRequestCount", -1253063552);
        setIntField(term52531, term52531.getClass(), "resAcceptCount", 11874750);
        setIntField(term52531, term52531.getClass(), "resSuccessCount", -920088882);
        setIntField(term52531, term52531.getClass(), "missCount", -1963888580);
        setIntField(term52531, term52531.getClass(), "maxComboCount", 885969140);
        setBooleanField(term52531, term52531.getClass(), "isFullCombo", false);
        setBooleanField(term52531, term52531.getClass(), "isAllJustice", false);
        setBooleanField(term52531, term52531.getClass(), "isSuccess", false);
        setIntField(term52531, term52531.getClass(), "fullChain", -573115224);
        setIntField(term52531, term52531.getClass(), "maxChain", 716083613);
        setIntField(term52531, term52531.getClass(), "scoreRank", 236114197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSuccess", argTypes, term52531, args);
    }

};


