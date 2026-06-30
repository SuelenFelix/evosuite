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

public class GetUserPreviewResp_isLogin_143613816753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9028;

    public GetUserPreviewResp_isLogin_143613816753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9028 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9028, term9028.getClass(), "userId", 0L);
        setBooleanField(term9028, term9028.getClass(), "isLogin", false);
        setField(term9028, term9028.getClass(), "lastLoginDate", null);
        setField(term9028, term9028.getClass(), "userName", null);
        setIntField(term9028, term9028.getClass(), "reincarnationNum", 0);
        setIntField(term9028, term9028.getClass(), "level", 0);
        setLongField(term9028, term9028.getClass(), "exp", 0L);
        setLongField(term9028, term9028.getClass(), "playerRating", 0L);
        setField(term9028, term9028.getClass(), "lastGameId", null);
        setField(term9028, term9028.getClass(), "lastRomVersion", null);
        setField(term9028, term9028.getClass(), "lastDataVersion", null);
        setField(term9028, term9028.getClass(), "lastPlayDate", null);
        setIntField(term9028, term9028.getClass(), "nameplateId", 0);
        setIntField(term9028, term9028.getClass(), "trophyId", 0);
        setIntField(term9028, term9028.getClass(), "cardId", 0);
        setIntField(term9028, term9028.getClass(), "dispPlayerLv", 0);
        setIntField(term9028, term9028.getClass(), "dispRating", 0);
        setIntField(term9028, term9028.getClass(), "dispBP", 0);
        setIntField(term9028, term9028.getClass(), "headphone", 0);
        setIntField(term9028, term9028.getClass(), "banStatus", 0);
        setBooleanField(term9028, term9028.getClass(), "isWarningConfirmed", false);
        setIntField(term9028, term9028.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9028, term9028.getClass(), "lastEmoneyCredit", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLogin", argTypes, term9028, args);
    }

};


