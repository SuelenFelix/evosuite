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

public class GetUserPreviewResp_getHeadphone_38740253371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52766;

    public GetUserPreviewResp_getHeadphone_38740253371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52766 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term52766, term52766.getClass(), "userId", null);
        setBooleanField(term52766, term52766.getClass(), "isLogin", false);
        setField(term52766, term52766.getClass(), "lastLoginDate", null);
        setField(term52766, term52766.getClass(), "userName", null);
        setIntField(term52766, term52766.getClass(), "reincarnationNum", 0);
        setIntField(term52766, term52766.getClass(), "level", 0);
        setField(term52766, term52766.getClass(), "exp", null);
        setIntField(term52766, term52766.getClass(), "playerRating", 0);
        setField(term52766, term52766.getClass(), "lastGameId", null);
        setField(term52766, term52766.getClass(), "lastRomVersion", null);
        setField(term52766, term52766.getClass(), "lastDataVersion", null);
        setField(term52766, term52766.getClass(), "lastPlayDate", null);
        setIntField(term52766, term52766.getClass(), "emoneyBrandId", 0);
        setIntField(term52766, term52766.getClass(), "trophyId", 0);
        setField(term52766, term52766.getClass(), "userCharacter", null);
        setIntField(term52766, term52766.getClass(), "playerLevel", 0);
        setIntField(term52766, term52766.getClass(), "rating", 0);
        setIntField(term52766, term52766.getClass(), "headphone", 0);
        setIntField(term52766, term52766.getClass(), "chargeState", 0);
        setField(term52766, term52766.getClass(), "userNameEx", null);
        setIntField(term52766, term52766.getClass(), "banState", 0);
        setIntField(term52766, term52766.getClass(), "classEmblemMedal", 0);
        setIntField(term52766, term52766.getClass(), "classEmblemBase", 0);
        setIntField(term52766, term52766.getClass(), "battleRankId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeadphone", argTypes, term52766, args);
    }

};


