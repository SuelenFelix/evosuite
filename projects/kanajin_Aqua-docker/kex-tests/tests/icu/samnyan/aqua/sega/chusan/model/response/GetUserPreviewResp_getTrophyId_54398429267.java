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

public class GetUserPreviewResp_getTrophyId_54398429267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52706;

    public GetUserPreviewResp_getTrophyId_54398429267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52706 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term52706, term52706.getClass(), "userId", null);
        setBooleanField(term52706, term52706.getClass(), "isLogin", false);
        setField(term52706, term52706.getClass(), "lastLoginDate", null);
        setField(term52706, term52706.getClass(), "userName", null);
        setIntField(term52706, term52706.getClass(), "reincarnationNum", 0);
        setIntField(term52706, term52706.getClass(), "level", 0);
        setField(term52706, term52706.getClass(), "exp", null);
        setIntField(term52706, term52706.getClass(), "playerRating", 0);
        setField(term52706, term52706.getClass(), "lastGameId", null);
        setField(term52706, term52706.getClass(), "lastRomVersion", null);
        setField(term52706, term52706.getClass(), "lastDataVersion", null);
        setField(term52706, term52706.getClass(), "lastPlayDate", null);
        setIntField(term52706, term52706.getClass(), "emoneyBrandId", 0);
        setIntField(term52706, term52706.getClass(), "trophyId", 0);
        setField(term52706, term52706.getClass(), "userCharacter", null);
        setIntField(term52706, term52706.getClass(), "playerLevel", 0);
        setIntField(term52706, term52706.getClass(), "rating", 0);
        setIntField(term52706, term52706.getClass(), "headphone", 0);
        setIntField(term52706, term52706.getClass(), "chargeState", 0);
        setField(term52706, term52706.getClass(), "userNameEx", null);
        setIntField(term52706, term52706.getClass(), "banState", 0);
        setIntField(term52706, term52706.getClass(), "classEmblemMedal", 0);
        setIntField(term52706, term52706.getClass(), "classEmblemBase", 0);
        setIntField(term52706, term52706.getClass(), "battleRankId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrophyId", argTypes, term52706, args);
    }

};


