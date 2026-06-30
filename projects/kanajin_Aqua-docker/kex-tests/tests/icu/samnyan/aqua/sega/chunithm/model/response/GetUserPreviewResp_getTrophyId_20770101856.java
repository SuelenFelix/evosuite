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

public class GetUserPreviewResp_getTrophyId_20770101856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25825;

    public GetUserPreviewResp_getTrophyId_20770101856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25825 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term25825, term25825.getClass(), "userId", null);
        setBooleanField(term25825, term25825.getClass(), "isLogin", false);
        setField(term25825, term25825.getClass(), "lastLoginDate", null);
        setField(term25825, term25825.getClass(), "userName", null);
        setIntField(term25825, term25825.getClass(), "reincarnationNum", 0);
        setIntField(term25825, term25825.getClass(), "level", 0);
        setField(term25825, term25825.getClass(), "exp", null);
        setIntField(term25825, term25825.getClass(), "playerRating", 0);
        setField(term25825, term25825.getClass(), "lastGameId", null);
        setField(term25825, term25825.getClass(), "lastRomVersion", null);
        setField(term25825, term25825.getClass(), "lastDataVersion", null);
        setField(term25825, term25825.getClass(), "lastPlayDate", null);
        setIntField(term25825, term25825.getClass(), "trophyId", 0);
        setField(term25825, term25825.getClass(), "userCharacter", null);
        setIntField(term25825, term25825.getClass(), "playerLevel", 0);
        setIntField(term25825, term25825.getClass(), "rating", 0);
        setIntField(term25825, term25825.getClass(), "headphone", 0);
        setIntField(term25825, term25825.getClass(), "chargeState", 0);
        setField(term25825, term25825.getClass(), "userNameEx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrophyId", argTypes, term25825, args);
    }

};


