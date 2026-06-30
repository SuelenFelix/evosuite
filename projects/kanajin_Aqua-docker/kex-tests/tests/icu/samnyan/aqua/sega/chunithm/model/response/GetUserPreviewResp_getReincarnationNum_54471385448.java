package icu.samnyan.aqua.sega.chunithm.model.response;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetUserPreviewResp_getReincarnationNum_54471385448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25745;

    public GetUserPreviewResp_getReincarnationNum_54471385448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25745 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term25745, term25745.getClass(), "userId", null);
        setBooleanField(term25745, term25745.getClass(), "isLogin", false);
        setField(term25745, term25745.getClass(), "lastLoginDate", null);
        setField(term25745, term25745.getClass(), "userName", null);
        setIntField(term25745, term25745.getClass(), "reincarnationNum", 0);
        setIntField(term25745, term25745.getClass(), "level", 0);
        setField(term25745, term25745.getClass(), "exp", null);
        setIntField(term25745, term25745.getClass(), "playerRating", 0);
        setField(term25745, term25745.getClass(), "lastGameId", null);
        setField(term25745, term25745.getClass(), "lastRomVersion", null);
        setField(term25745, term25745.getClass(), "lastDataVersion", null);
        setField(term25745, term25745.getClass(), "lastPlayDate", null);
        setIntField(term25745, term25745.getClass(), "trophyId", 0);
        setField(term25745, term25745.getClass(), "userCharacter", null);
        setIntField(term25745, term25745.getClass(), "playerLevel", 0);
        setIntField(term25745, term25745.getClass(), "rating", 0);
        setIntField(term25745, term25745.getClass(), "headphone", 0);
        setIntField(term25745, term25745.getClass(), "chargeState", 0);
        setField(term25745, term25745.getClass(), "userNameEx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReincarnationNum", argTypes, term25745, args);
    }

};


