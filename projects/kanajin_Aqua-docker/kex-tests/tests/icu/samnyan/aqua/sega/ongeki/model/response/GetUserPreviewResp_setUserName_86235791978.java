package icu.samnyan.aqua.sega.ongeki.model.response;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetUserPreviewResp_setUserName_86235791978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9482;

    public GetUserPreviewResp_setUserName_86235791978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9482 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9482, term9482.getClass(), "userId", 0L);
        setBooleanField(term9482, term9482.getClass(), "isLogin", false);
        setField(term9482, term9482.getClass(), "lastLoginDate", null);
        setField(term9482, term9482.getClass(), "userName", null);
        setIntField(term9482, term9482.getClass(), "reincarnationNum", 0);
        setIntField(term9482, term9482.getClass(), "level", 0);
        setLongField(term9482, term9482.getClass(), "exp", 0L);
        setLongField(term9482, term9482.getClass(), "playerRating", 0L);
        setField(term9482, term9482.getClass(), "lastGameId", null);
        setField(term9482, term9482.getClass(), "lastRomVersion", null);
        setField(term9482, term9482.getClass(), "lastDataVersion", null);
        setField(term9482, term9482.getClass(), "lastPlayDate", null);
        setIntField(term9482, term9482.getClass(), "nameplateId", 0);
        setIntField(term9482, term9482.getClass(), "trophyId", 0);
        setIntField(term9482, term9482.getClass(), "cardId", 0);
        setIntField(term9482, term9482.getClass(), "dispPlayerLv", 0);
        setIntField(term9482, term9482.getClass(), "dispRating", 0);
        setIntField(term9482, term9482.getClass(), "dispBP", 0);
        setIntField(term9482, term9482.getClass(), "headphone", 0);
        setIntField(term9482, term9482.getClass(), "banStatus", 0);
        setBooleanField(term9482, term9482.getClass(), "isWarningConfirmed", false);
        setIntField(term9482, term9482.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9482, term9482.getClass(), "lastEmoneyCredit", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term9482, args);
    }

};


