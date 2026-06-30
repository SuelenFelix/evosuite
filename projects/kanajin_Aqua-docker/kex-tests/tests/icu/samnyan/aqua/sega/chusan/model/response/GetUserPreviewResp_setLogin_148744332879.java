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
import java.lang.Boolean;

public class GetUserPreviewResp_setLogin_148744332879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52886;
     Object term52901;

    public GetUserPreviewResp_setLogin_148744332879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52886 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term52886, term52886.getClass(), "userId", null);
        setBooleanField(term52886, term52886.getClass(), "isLogin", false);
        setField(term52886, term52886.getClass(), "lastLoginDate", null);
        setField(term52886, term52886.getClass(), "userName", null);
        setIntField(term52886, term52886.getClass(), "reincarnationNum", 0);
        setIntField(term52886, term52886.getClass(), "level", 0);
        setField(term52886, term52886.getClass(), "exp", null);
        setIntField(term52886, term52886.getClass(), "playerRating", 0);
        setField(term52886, term52886.getClass(), "lastGameId", null);
        setField(term52886, term52886.getClass(), "lastRomVersion", null);
        setField(term52886, term52886.getClass(), "lastDataVersion", null);
        setField(term52886, term52886.getClass(), "lastPlayDate", null);
        setIntField(term52886, term52886.getClass(), "emoneyBrandId", 0);
        setIntField(term52886, term52886.getClass(), "trophyId", 0);
        setField(term52886, term52886.getClass(), "userCharacter", null);
        setIntField(term52886, term52886.getClass(), "playerLevel", 0);
        setIntField(term52886, term52886.getClass(), "rating", 0);
        setIntField(term52886, term52886.getClass(), "headphone", 0);
        setIntField(term52886, term52886.getClass(), "chargeState", 0);
        setField(term52886, term52886.getClass(), "userNameEx", null);
        setIntField(term52886, term52886.getClass(), "banState", 0);
        setIntField(term52886, term52886.getClass(), "classEmblemMedal", 0);
        setIntField(term52886, term52886.getClass(), "classEmblemBase", 0);
        setIntField(term52886, term52886.getClass(), "battleRankId", 0);
        term52901 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term52901;
        callMethod(klass, "setLogin", argTypes, term52886, args);
    }

};


