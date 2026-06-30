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
import java.lang.Boolean;

public class ScoreResp_setSuccess_25266592326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52793;
     Object term52809;

    public ScoreResp_setSuccess_25266592326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52793 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52793, term52793.getClass(), "musicId", 2120314865);
        setIntField(term52793, term52793.getClass(), "level", -1783088801);
        setIntField(term52793, term52793.getClass(), "playCount", 353452001);
        setIntField(term52793, term52793.getClass(), "scoreMax", -1160759211);
        setIntField(term52793, term52793.getClass(), "resRequestCount", 118302577);
        setIntField(term52793, term52793.getClass(), "resAcceptCount", -1192086944);
        setIntField(term52793, term52793.getClass(), "resSuccessCount", 1689097670);
        setIntField(term52793, term52793.getClass(), "missCount", -229058840);
        setIntField(term52793, term52793.getClass(), "maxComboCount", -445086770);
        setBooleanField(term52793, term52793.getClass(), "isFullCombo", true);
        setBooleanField(term52793, term52793.getClass(), "isAllJustice", false);
        setBooleanField(term52793, term52793.getClass(), "isSuccess", true);
        setIntField(term52793, term52793.getClass(), "fullChain", 1555977804);
        setIntField(term52793, term52793.getClass(), "maxChain", -1039875364);
        setIntField(term52793, term52793.getClass(), "scoreRank", -908724029);
        term52809 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term52809;
        callMethod(klass, "setSuccess", argTypes, term52793, args);
    }

};


