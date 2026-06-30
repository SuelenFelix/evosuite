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

public class GetUserPreviewResp_canEqual_116596680599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9890;

    public GetUserPreviewResp_canEqual_116596680599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9890 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9890, term9890.getClass(), "userId", 0L);
        setBooleanField(term9890, term9890.getClass(), "isLogin", false);
        setField(term9890, term9890.getClass(), "lastLoginDate", null);
        setField(term9890, term9890.getClass(), "userName", null);
        setIntField(term9890, term9890.getClass(), "reincarnationNum", 0);
        setIntField(term9890, term9890.getClass(), "level", 0);
        setLongField(term9890, term9890.getClass(), "exp", 0L);
        setLongField(term9890, term9890.getClass(), "playerRating", 0L);
        setField(term9890, term9890.getClass(), "lastGameId", null);
        setField(term9890, term9890.getClass(), "lastRomVersion", null);
        setField(term9890, term9890.getClass(), "lastDataVersion", null);
        setField(term9890, term9890.getClass(), "lastPlayDate", null);
        setIntField(term9890, term9890.getClass(), "nameplateId", 0);
        setIntField(term9890, term9890.getClass(), "trophyId", 0);
        setIntField(term9890, term9890.getClass(), "cardId", 0);
        setIntField(term9890, term9890.getClass(), "dispPlayerLv", 0);
        setIntField(term9890, term9890.getClass(), "dispRating", 0);
        setIntField(term9890, term9890.getClass(), "dispBP", 0);
        setIntField(term9890, term9890.getClass(), "headphone", 0);
        setIntField(term9890, term9890.getClass(), "banStatus", 0);
        setBooleanField(term9890, term9890.getClass(), "isWarningConfirmed", false);
        setIntField(term9890, term9890.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9890, term9890.getClass(), "lastEmoneyCredit", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term9890, args);
    }

};


