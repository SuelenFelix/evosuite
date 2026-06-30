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

public class GetUserPreviewResp_getLevel_72554795159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52586;

    public GetUserPreviewResp_getLevel_72554795159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52586 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term52586, term52586.getClass(), "userId", null);
        setBooleanField(term52586, term52586.getClass(), "isLogin", false);
        setField(term52586, term52586.getClass(), "lastLoginDate", null);
        setField(term52586, term52586.getClass(), "userName", null);
        setIntField(term52586, term52586.getClass(), "reincarnationNum", 0);
        setIntField(term52586, term52586.getClass(), "level", 0);
        setField(term52586, term52586.getClass(), "exp", null);
        setIntField(term52586, term52586.getClass(), "playerRating", 0);
        setField(term52586, term52586.getClass(), "lastGameId", null);
        setField(term52586, term52586.getClass(), "lastRomVersion", null);
        setField(term52586, term52586.getClass(), "lastDataVersion", null);
        setField(term52586, term52586.getClass(), "lastPlayDate", null);
        setIntField(term52586, term52586.getClass(), "emoneyBrandId", 0);
        setIntField(term52586, term52586.getClass(), "trophyId", 0);
        setField(term52586, term52586.getClass(), "userCharacter", null);
        setIntField(term52586, term52586.getClass(), "playerLevel", 0);
        setIntField(term52586, term52586.getClass(), "rating", 0);
        setIntField(term52586, term52586.getClass(), "headphone", 0);
        setIntField(term52586, term52586.getClass(), "chargeState", 0);
        setField(term52586, term52586.getClass(), "userNameEx", null);
        setIntField(term52586, term52586.getClass(), "banState", 0);
        setIntField(term52586, term52586.getClass(), "classEmblemMedal", 0);
        setIntField(term52586, term52586.getClass(), "classEmblemBase", 0);
        setIntField(term52586, term52586.getClass(), "battleRankId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term52586, args);
    }

};


