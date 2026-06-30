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

public class GetUserPreviewResp_setExp_58914705784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52967;

    public GetUserPreviewResp_setExp_58914705784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52967 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term52967, term52967.getClass(), "userId", null);
        setBooleanField(term52967, term52967.getClass(), "isLogin", false);
        setField(term52967, term52967.getClass(), "lastLoginDate", null);
        setField(term52967, term52967.getClass(), "userName", null);
        setIntField(term52967, term52967.getClass(), "reincarnationNum", 0);
        setIntField(term52967, term52967.getClass(), "level", 0);
        setField(term52967, term52967.getClass(), "exp", null);
        setIntField(term52967, term52967.getClass(), "playerRating", 0);
        setField(term52967, term52967.getClass(), "lastGameId", null);
        setField(term52967, term52967.getClass(), "lastRomVersion", null);
        setField(term52967, term52967.getClass(), "lastDataVersion", null);
        setField(term52967, term52967.getClass(), "lastPlayDate", null);
        setIntField(term52967, term52967.getClass(), "emoneyBrandId", 0);
        setIntField(term52967, term52967.getClass(), "trophyId", 0);
        setField(term52967, term52967.getClass(), "userCharacter", null);
        setIntField(term52967, term52967.getClass(), "playerLevel", 0);
        setIntField(term52967, term52967.getClass(), "rating", 0);
        setIntField(term52967, term52967.getClass(), "headphone", 0);
        setIntField(term52967, term52967.getClass(), "chargeState", 0);
        setField(term52967, term52967.getClass(), "userNameEx", null);
        setIntField(term52967, term52967.getClass(), "banState", 0);
        setIntField(term52967, term52967.getClass(), "classEmblemMedal", 0);
        setIntField(term52967, term52967.getClass(), "classEmblemBase", 0);
        setIntField(term52967, term52967.getClass(), "battleRankId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExp", argTypes, term52967, args);
    }

};


