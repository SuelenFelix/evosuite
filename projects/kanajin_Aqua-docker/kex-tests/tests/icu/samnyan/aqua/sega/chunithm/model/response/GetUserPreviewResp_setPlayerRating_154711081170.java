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
import java.lang.Integer;

public class GetUserPreviewResp_setPlayerRating_154711081170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25971;
     Object term25981;

    public GetUserPreviewResp_setPlayerRating_154711081170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25971 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term25971, term25971.getClass(), "userId", null);
        setBooleanField(term25971, term25971.getClass(), "isLogin", false);
        setField(term25971, term25971.getClass(), "lastLoginDate", null);
        setField(term25971, term25971.getClass(), "userName", null);
        setIntField(term25971, term25971.getClass(), "reincarnationNum", 0);
        setIntField(term25971, term25971.getClass(), "level", 0);
        setField(term25971, term25971.getClass(), "exp", null);
        setIntField(term25971, term25971.getClass(), "playerRating", 0);
        setField(term25971, term25971.getClass(), "lastGameId", null);
        setField(term25971, term25971.getClass(), "lastRomVersion", null);
        setField(term25971, term25971.getClass(), "lastDataVersion", null);
        setField(term25971, term25971.getClass(), "lastPlayDate", null);
        setIntField(term25971, term25971.getClass(), "trophyId", 0);
        setField(term25971, term25971.getClass(), "userCharacter", null);
        setIntField(term25971, term25971.getClass(), "playerLevel", 0);
        setIntField(term25971, term25971.getClass(), "rating", 0);
        setIntField(term25971, term25971.getClass(), "headphone", 0);
        setIntField(term25971, term25971.getClass(), "chargeState", 0);
        setField(term25971, term25971.getClass(), "userNameEx", null);
        term25981 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25981;
        callMethod(klass, "setPlayerRating", argTypes, term25971, args);
    }

};


