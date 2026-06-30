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
import java.lang.Integer;

public class GetUserPreviewResp_setLevel_121488453983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52950;
     Object term52965;

    public GetUserPreviewResp_setLevel_121488453983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52950 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term52950, term52950.getClass(), "userId", null);
        setBooleanField(term52950, term52950.getClass(), "isLogin", false);
        setField(term52950, term52950.getClass(), "lastLoginDate", null);
        setField(term52950, term52950.getClass(), "userName", null);
        setIntField(term52950, term52950.getClass(), "reincarnationNum", 0);
        setIntField(term52950, term52950.getClass(), "level", 0);
        setField(term52950, term52950.getClass(), "exp", null);
        setIntField(term52950, term52950.getClass(), "playerRating", 0);
        setField(term52950, term52950.getClass(), "lastGameId", null);
        setField(term52950, term52950.getClass(), "lastRomVersion", null);
        setField(term52950, term52950.getClass(), "lastDataVersion", null);
        setField(term52950, term52950.getClass(), "lastPlayDate", null);
        setIntField(term52950, term52950.getClass(), "emoneyBrandId", 0);
        setIntField(term52950, term52950.getClass(), "trophyId", 0);
        setField(term52950, term52950.getClass(), "userCharacter", null);
        setIntField(term52950, term52950.getClass(), "playerLevel", 0);
        setIntField(term52950, term52950.getClass(), "rating", 0);
        setIntField(term52950, term52950.getClass(), "headphone", 0);
        setIntField(term52950, term52950.getClass(), "chargeState", 0);
        setField(term52950, term52950.getClass(), "userNameEx", null);
        setIntField(term52950, term52950.getClass(), "banState", 0);
        setIntField(term52950, term52950.getClass(), "classEmblemMedal", 0);
        setIntField(term52950, term52950.getClass(), "classEmblemBase", 0);
        setIntField(term52950, term52950.getClass(), "battleRankId", 0);
        term52965 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52965;
        callMethod(klass, "setLevel", argTypes, term52950, args);
    }

};


