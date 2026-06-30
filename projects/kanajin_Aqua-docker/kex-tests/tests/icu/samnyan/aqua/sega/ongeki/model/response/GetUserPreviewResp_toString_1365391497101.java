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

public class GetUserPreviewResp_toString_1365391497101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9926;

    public GetUserPreviewResp_toString_1365391497101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9926 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9926, term9926.getClass(), "userId", 0L);
        setBooleanField(term9926, term9926.getClass(), "isLogin", false);
        setField(term9926, term9926.getClass(), "lastLoginDate", null);
        setField(term9926, term9926.getClass(), "userName", null);
        setIntField(term9926, term9926.getClass(), "reincarnationNum", 0);
        setIntField(term9926, term9926.getClass(), "level", 0);
        setLongField(term9926, term9926.getClass(), "exp", 0L);
        setLongField(term9926, term9926.getClass(), "playerRating", 0L);
        setField(term9926, term9926.getClass(), "lastGameId", null);
        setField(term9926, term9926.getClass(), "lastRomVersion", null);
        setField(term9926, term9926.getClass(), "lastDataVersion", null);
        setField(term9926, term9926.getClass(), "lastPlayDate", null);
        setIntField(term9926, term9926.getClass(), "nameplateId", 0);
        setIntField(term9926, term9926.getClass(), "trophyId", 0);
        setIntField(term9926, term9926.getClass(), "cardId", 0);
        setIntField(term9926, term9926.getClass(), "dispPlayerLv", 0);
        setIntField(term9926, term9926.getClass(), "dispRating", 0);
        setIntField(term9926, term9926.getClass(), "dispBP", 0);
        setIntField(term9926, term9926.getClass(), "headphone", 0);
        setIntField(term9926, term9926.getClass(), "banStatus", 0);
        setBooleanField(term9926, term9926.getClass(), "isWarningConfirmed", false);
        setIntField(term9926, term9926.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9926, term9926.getClass(), "lastEmoneyCredit", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term9926, args);
    }

};


