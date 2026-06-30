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

public class GetUserPreviewResp_setLastDataVersion_80241561585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9616;

    public GetUserPreviewResp_setLastDataVersion_80241561585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9616 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9616, term9616.getClass(), "userId", 0L);
        setBooleanField(term9616, term9616.getClass(), "isLogin", false);
        setField(term9616, term9616.getClass(), "lastLoginDate", null);
        setField(term9616, term9616.getClass(), "userName", null);
        setIntField(term9616, term9616.getClass(), "reincarnationNum", 0);
        setIntField(term9616, term9616.getClass(), "level", 0);
        setLongField(term9616, term9616.getClass(), "exp", 0L);
        setLongField(term9616, term9616.getClass(), "playerRating", 0L);
        setField(term9616, term9616.getClass(), "lastGameId", null);
        setField(term9616, term9616.getClass(), "lastRomVersion", null);
        setField(term9616, term9616.getClass(), "lastDataVersion", null);
        setField(term9616, term9616.getClass(), "lastPlayDate", null);
        setIntField(term9616, term9616.getClass(), "nameplateId", 0);
        setIntField(term9616, term9616.getClass(), "trophyId", 0);
        setIntField(term9616, term9616.getClass(), "cardId", 0);
        setIntField(term9616, term9616.getClass(), "dispPlayerLv", 0);
        setIntField(term9616, term9616.getClass(), "dispRating", 0);
        setIntField(term9616, term9616.getClass(), "dispBP", 0);
        setIntField(term9616, term9616.getClass(), "headphone", 0);
        setIntField(term9616, term9616.getClass(), "banStatus", 0);
        setBooleanField(term9616, term9616.getClass(), "isWarningConfirmed", false);
        setIntField(term9616, term9616.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9616, term9616.getClass(), "lastEmoneyCredit", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastDataVersion", argTypes, term9616, args);
    }

};


