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

public class ScoreResp_getScoreMax_14728892023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52403;

    public ScoreResp_getScoreMax_14728892023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52403 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52403, term52403.getClass(), "musicId", 1078863472);
        setIntField(term52403, term52403.getClass(), "level", -1845619952);
        setIntField(term52403, term52403.getClass(), "playCount", -1363744441);
        setIntField(term52403, term52403.getClass(), "scoreMax", -1303828030);
        setIntField(term52403, term52403.getClass(), "resRequestCount", 1611629079);
        setIntField(term52403, term52403.getClass(), "resAcceptCount", 770171276);
        setIntField(term52403, term52403.getClass(), "resSuccessCount", -1497914215);
        setIntField(term52403, term52403.getClass(), "missCount", 254385018);
        setIntField(term52403, term52403.getClass(), "maxComboCount", 672070228);
        setBooleanField(term52403, term52403.getClass(), "isFullCombo", true);
        setBooleanField(term52403, term52403.getClass(), "isAllJustice", true);
        setBooleanField(term52403, term52403.getClass(), "isSuccess", true);
        setIntField(term52403, term52403.getClass(), "fullChain", 1014463904);
        setIntField(term52403, term52403.getClass(), "maxChain", 928673401);
        setIntField(term52403, term52403.getClass(), "scoreRank", -631739609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreMax", argTypes, term52403, args);
    }

};


