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

public class ScoreResp_setScoreMax_69513073618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52649;
     Object term52665;

    public ScoreResp_setScoreMax_69513073618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52649 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52649, term52649.getClass(), "musicId", 1036562171);
        setIntField(term52649, term52649.getClass(), "level", -1176098787);
        setIntField(term52649, term52649.getClass(), "playCount", -1108621848);
        setIntField(term52649, term52649.getClass(), "scoreMax", 1868049133);
        setIntField(term52649, term52649.getClass(), "resRequestCount", -2041713971);
        setIntField(term52649, term52649.getClass(), "resAcceptCount", 752002755);
        setIntField(term52649, term52649.getClass(), "resSuccessCount", -975157064);
        setIntField(term52649, term52649.getClass(), "missCount", -378255267);
        setIntField(term52649, term52649.getClass(), "maxComboCount", -1205835103);
        setBooleanField(term52649, term52649.getClass(), "isFullCombo", true);
        setBooleanField(term52649, term52649.getClass(), "isAllJustice", false);
        setBooleanField(term52649, term52649.getClass(), "isSuccess", false);
        setIntField(term52649, term52649.getClass(), "fullChain", -2022370596);
        setIntField(term52649, term52649.getClass(), "maxChain", 856428856);
        setIntField(term52649, term52649.getClass(), "scoreRank", 1295040350);
        term52665 = new Integer(1744402926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52665;
        callMethod(klass, "setScoreMax", argTypes, term52649, args);
    }

};


