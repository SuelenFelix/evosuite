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

public class ScoreResp_setMissCount_116983642922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52721;
     Object term52737;

    public ScoreResp_setMissCount_116983642922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52721 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52721, term52721.getClass(), "musicId", -1268460209);
        setIntField(term52721, term52721.getClass(), "level", 1050300885);
        setIntField(term52721, term52721.getClass(), "playCount", -1623966228);
        setIntField(term52721, term52721.getClass(), "scoreMax", 1085534206);
        setIntField(term52721, term52721.getClass(), "resRequestCount", -825946504);
        setIntField(term52721, term52721.getClass(), "resAcceptCount", 1618408809);
        setIntField(term52721, term52721.getClass(), "resSuccessCount", 1511487617);
        setIntField(term52721, term52721.getClass(), "missCount", 338598562);
        setIntField(term52721, term52721.getClass(), "maxComboCount", 1528748257);
        setBooleanField(term52721, term52721.getClass(), "isFullCombo", false);
        setBooleanField(term52721, term52721.getClass(), "isAllJustice", false);
        setBooleanField(term52721, term52721.getClass(), "isSuccess", false);
        setIntField(term52721, term52721.getClass(), "fullChain", 494744342);
        setIntField(term52721, term52721.getClass(), "maxChain", -1662933444);
        setIntField(term52721, term52721.getClass(), "scoreRank", 1648583497);
        term52737 = new Integer(-132156499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52737;
        callMethod(klass, "setMissCount", argTypes, term52721, args);
    }

};


