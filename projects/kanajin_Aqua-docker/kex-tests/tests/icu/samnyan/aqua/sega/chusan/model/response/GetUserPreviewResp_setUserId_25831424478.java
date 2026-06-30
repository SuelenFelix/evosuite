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

public class GetUserPreviewResp_setUserId_25831424478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52871;

    public GetUserPreviewResp_setUserId_25831424478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52871 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term52871, term52871.getClass(), "userId", null);
        setBooleanField(term52871, term52871.getClass(), "isLogin", false);
        setField(term52871, term52871.getClass(), "lastLoginDate", null);
        setField(term52871, term52871.getClass(), "userName", null);
        setIntField(term52871, term52871.getClass(), "reincarnationNum", 0);
        setIntField(term52871, term52871.getClass(), "level", 0);
        setField(term52871, term52871.getClass(), "exp", null);
        setIntField(term52871, term52871.getClass(), "playerRating", 0);
        setField(term52871, term52871.getClass(), "lastGameId", null);
        setField(term52871, term52871.getClass(), "lastRomVersion", null);
        setField(term52871, term52871.getClass(), "lastDataVersion", null);
        setField(term52871, term52871.getClass(), "lastPlayDate", null);
        setIntField(term52871, term52871.getClass(), "emoneyBrandId", 0);
        setIntField(term52871, term52871.getClass(), "trophyId", 0);
        setField(term52871, term52871.getClass(), "userCharacter", null);
        setIntField(term52871, term52871.getClass(), "playerLevel", 0);
        setIntField(term52871, term52871.getClass(), "rating", 0);
        setIntField(term52871, term52871.getClass(), "headphone", 0);
        setIntField(term52871, term52871.getClass(), "chargeState", 0);
        setField(term52871, term52871.getClass(), "userNameEx", null);
        setIntField(term52871, term52871.getClass(), "banState", 0);
        setIntField(term52871, term52871.getClass(), "classEmblemMedal", 0);
        setIntField(term52871, term52871.getClass(), "classEmblemBase", 0);
        setIntField(term52871, term52871.getClass(), "battleRankId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserId", argTypes, term52871, args);
    }

};


