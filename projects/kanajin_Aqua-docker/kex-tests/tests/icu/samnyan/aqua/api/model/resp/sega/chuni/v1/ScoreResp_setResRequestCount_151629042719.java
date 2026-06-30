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
import java.lang.Integer;

public class ScoreResp_setResRequestCount_151629042719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57837;
     Object term57853;

    public ScoreResp_setResRequestCount_151629042719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57837 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57837, term57837.getClass(), "musicId", -982945087);
        setIntField(term57837, term57837.getClass(), "level", 171057010);
        setIntField(term57837, term57837.getClass(), "playCount", -1039706080);
        setIntField(term57837, term57837.getClass(), "scoreMax", 1009893493);
        setIntField(term57837, term57837.getClass(), "resRequestCount", -1097846142);
        setIntField(term57837, term57837.getClass(), "resAcceptCount", 1026272483);
        setIntField(term57837, term57837.getClass(), "resSuccessCount", -48026838);
        setIntField(term57837, term57837.getClass(), "missCount", 1557093855);
        setIntField(term57837, term57837.getClass(), "maxComboCount", -445911899);
        setBooleanField(term57837, term57837.getClass(), "isFullCombo", false);
        setBooleanField(term57837, term57837.getClass(), "isAllJustice", false);
        setBooleanField(term57837, term57837.getClass(), "isSuccess", false);
        setIntField(term57837, term57837.getClass(), "fullChain", -1254075402);
        setIntField(term57837, term57837.getClass(), "maxChain", -1886407162);
        setIntField(term57837, term57837.getClass(), "scoreRank", -97996127);
        term57853 = new Integer(668350997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57853;
        callMethod(klass, "setResRequestCount", argTypes, term57837, args);
    }

};


