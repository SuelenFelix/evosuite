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

public class GetUserPreviewResp_getLastPlayDate_23541174855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25815;

    public GetUserPreviewResp_getLastPlayDate_23541174855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25815 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term25815, term25815.getClass(), "userId", null);
        setBooleanField(term25815, term25815.getClass(), "isLogin", false);
        setField(term25815, term25815.getClass(), "lastLoginDate", null);
        setField(term25815, term25815.getClass(), "userName", null);
        setIntField(term25815, term25815.getClass(), "reincarnationNum", 0);
        setIntField(term25815, term25815.getClass(), "level", 0);
        setField(term25815, term25815.getClass(), "exp", null);
        setIntField(term25815, term25815.getClass(), "playerRating", 0);
        setField(term25815, term25815.getClass(), "lastGameId", null);
        setField(term25815, term25815.getClass(), "lastRomVersion", null);
        setField(term25815, term25815.getClass(), "lastDataVersion", null);
        setField(term25815, term25815.getClass(), "lastPlayDate", null);
        setIntField(term25815, term25815.getClass(), "trophyId", 0);
        setField(term25815, term25815.getClass(), "userCharacter", null);
        setIntField(term25815, term25815.getClass(), "playerLevel", 0);
        setIntField(term25815, term25815.getClass(), "rating", 0);
        setIntField(term25815, term25815.getClass(), "headphone", 0);
        setIntField(term25815, term25815.getClass(), "chargeState", 0);
        setField(term25815, term25815.getClass(), "userNameEx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term25815, args);
    }

};


