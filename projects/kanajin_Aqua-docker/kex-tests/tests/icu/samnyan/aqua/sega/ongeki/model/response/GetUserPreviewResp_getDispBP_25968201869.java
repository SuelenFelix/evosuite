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

public class GetUserPreviewResp_getDispBP_25968201869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9316;

    public GetUserPreviewResp_getDispBP_25968201869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9316 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9316, term9316.getClass(), "userId", 0L);
        setBooleanField(term9316, term9316.getClass(), "isLogin", false);
        setField(term9316, term9316.getClass(), "lastLoginDate", null);
        setField(term9316, term9316.getClass(), "userName", null);
        setIntField(term9316, term9316.getClass(), "reincarnationNum", 0);
        setIntField(term9316, term9316.getClass(), "level", 0);
        setLongField(term9316, term9316.getClass(), "exp", 0L);
        setLongField(term9316, term9316.getClass(), "playerRating", 0L);
        setField(term9316, term9316.getClass(), "lastGameId", null);
        setField(term9316, term9316.getClass(), "lastRomVersion", null);
        setField(term9316, term9316.getClass(), "lastDataVersion", null);
        setField(term9316, term9316.getClass(), "lastPlayDate", null);
        setIntField(term9316, term9316.getClass(), "nameplateId", 0);
        setIntField(term9316, term9316.getClass(), "trophyId", 0);
        setIntField(term9316, term9316.getClass(), "cardId", 0);
        setIntField(term9316, term9316.getClass(), "dispPlayerLv", 0);
        setIntField(term9316, term9316.getClass(), "dispRating", 0);
        setIntField(term9316, term9316.getClass(), "dispBP", 0);
        setIntField(term9316, term9316.getClass(), "headphone", 0);
        setIntField(term9316, term9316.getClass(), "banStatus", 0);
        setBooleanField(term9316, term9316.getClass(), "isWarningConfirmed", false);
        setIntField(term9316, term9316.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9316, term9316.getClass(), "lastEmoneyCredit", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispBP", argTypes, term9316, args);
    }

};


