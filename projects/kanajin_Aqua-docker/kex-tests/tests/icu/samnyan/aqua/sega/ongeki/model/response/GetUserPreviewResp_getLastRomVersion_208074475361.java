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

public class GetUserPreviewResp_getLastRomVersion_208074475361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9172;

    public GetUserPreviewResp_getLastRomVersion_208074475361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9172 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9172, term9172.getClass(), "userId", 0L);
        setBooleanField(term9172, term9172.getClass(), "isLogin", false);
        setField(term9172, term9172.getClass(), "lastLoginDate", null);
        setField(term9172, term9172.getClass(), "userName", null);
        setIntField(term9172, term9172.getClass(), "reincarnationNum", 0);
        setIntField(term9172, term9172.getClass(), "level", 0);
        setLongField(term9172, term9172.getClass(), "exp", 0L);
        setLongField(term9172, term9172.getClass(), "playerRating", 0L);
        setField(term9172, term9172.getClass(), "lastGameId", null);
        setField(term9172, term9172.getClass(), "lastRomVersion", null);
        setField(term9172, term9172.getClass(), "lastDataVersion", null);
        setField(term9172, term9172.getClass(), "lastPlayDate", null);
        setIntField(term9172, term9172.getClass(), "nameplateId", 0);
        setIntField(term9172, term9172.getClass(), "trophyId", 0);
        setIntField(term9172, term9172.getClass(), "cardId", 0);
        setIntField(term9172, term9172.getClass(), "dispPlayerLv", 0);
        setIntField(term9172, term9172.getClass(), "dispRating", 0);
        setIntField(term9172, term9172.getClass(), "dispBP", 0);
        setIntField(term9172, term9172.getClass(), "headphone", 0);
        setIntField(term9172, term9172.getClass(), "banStatus", 0);
        setBooleanField(term9172, term9172.getClass(), "isWarningConfirmed", false);
        setIntField(term9172, term9172.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9172, term9172.getClass(), "lastEmoneyCredit", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRomVersion", argTypes, term9172, args);
    }

};


