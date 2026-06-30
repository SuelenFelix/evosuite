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

public class GetUserPreviewResp_setLastGameId_136146645786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52999;

    public GetUserPreviewResp_setLastGameId_136146645786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52999 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term52999, term52999.getClass(), "userId", null);
        setBooleanField(term52999, term52999.getClass(), "isLogin", false);
        setField(term52999, term52999.getClass(), "lastLoginDate", null);
        setField(term52999, term52999.getClass(), "userName", null);
        setIntField(term52999, term52999.getClass(), "reincarnationNum", 0);
        setIntField(term52999, term52999.getClass(), "level", 0);
        setField(term52999, term52999.getClass(), "exp", null);
        setIntField(term52999, term52999.getClass(), "playerRating", 0);
        setField(term52999, term52999.getClass(), "lastGameId", null);
        setField(term52999, term52999.getClass(), "lastRomVersion", null);
        setField(term52999, term52999.getClass(), "lastDataVersion", null);
        setField(term52999, term52999.getClass(), "lastPlayDate", null);
        setIntField(term52999, term52999.getClass(), "emoneyBrandId", 0);
        setIntField(term52999, term52999.getClass(), "trophyId", 0);
        setField(term52999, term52999.getClass(), "userCharacter", null);
        setIntField(term52999, term52999.getClass(), "playerLevel", 0);
        setIntField(term52999, term52999.getClass(), "rating", 0);
        setIntField(term52999, term52999.getClass(), "headphone", 0);
        setIntField(term52999, term52999.getClass(), "chargeState", 0);
        setField(term52999, term52999.getClass(), "userNameEx", null);
        setIntField(term52999, term52999.getClass(), "banState", 0);
        setIntField(term52999, term52999.getClass(), "classEmblemMedal", 0);
        setIntField(term52999, term52999.getClass(), "classEmblemBase", 0);
        setIntField(term52999, term52999.getClass(), "battleRankId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastGameId", argTypes, term52999, args);
    }

};


