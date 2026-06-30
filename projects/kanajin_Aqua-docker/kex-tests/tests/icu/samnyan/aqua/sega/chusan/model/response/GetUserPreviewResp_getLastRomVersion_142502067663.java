package icu.samnyan.aqua.sega.chusan.model.response;

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
import static icu.samnyan.aqua.sega.chusan.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetUserPreviewResp_getLastRomVersion_142502067663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52646;

    public GetUserPreviewResp_getLastRomVersion_142502067663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52646 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term52646, term52646.getClass(), "userId", null);
        setBooleanField(term52646, term52646.getClass(), "isLogin", false);
        setField(term52646, term52646.getClass(), "lastLoginDate", null);
        setField(term52646, term52646.getClass(), "userName", null);
        setIntField(term52646, term52646.getClass(), "reincarnationNum", 0);
        setIntField(term52646, term52646.getClass(), "level", 0);
        setField(term52646, term52646.getClass(), "exp", null);
        setIntField(term52646, term52646.getClass(), "playerRating", 0);
        setField(term52646, term52646.getClass(), "lastGameId", null);
        setField(term52646, term52646.getClass(), "lastRomVersion", null);
        setField(term52646, term52646.getClass(), "lastDataVersion", null);
        setField(term52646, term52646.getClass(), "lastPlayDate", null);
        setIntField(term52646, term52646.getClass(), "emoneyBrandId", 0);
        setIntField(term52646, term52646.getClass(), "trophyId", 0);
        setField(term52646, term52646.getClass(), "userCharacter", null);
        setIntField(term52646, term52646.getClass(), "playerLevel", 0);
        setIntField(term52646, term52646.getClass(), "rating", 0);
        setIntField(term52646, term52646.getClass(), "headphone", 0);
        setIntField(term52646, term52646.getClass(), "chargeState", 0);
        setField(term52646, term52646.getClass(), "userNameEx", null);
        setIntField(term52646, term52646.getClass(), "banState", 0);
        setIntField(term52646, term52646.getClass(), "classEmblemMedal", 0);
        setIntField(term52646, term52646.getClass(), "classEmblemBase", 0);
        setIntField(term52646, term52646.getClass(), "battleRankId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRomVersion", argTypes, term52646, args);
    }

};


