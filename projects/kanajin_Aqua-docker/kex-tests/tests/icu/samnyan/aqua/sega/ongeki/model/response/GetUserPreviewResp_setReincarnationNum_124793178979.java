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
import java.lang.Integer;

public class GetUserPreviewResp_setReincarnationNum_124793178979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9500;
     Object term9518;

    public GetUserPreviewResp_setReincarnationNum_124793178979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9500 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9500, term9500.getClass(), "userId", 0L);
        setBooleanField(term9500, term9500.getClass(), "isLogin", false);
        setField(term9500, term9500.getClass(), "lastLoginDate", null);
        setField(term9500, term9500.getClass(), "userName", null);
        setIntField(term9500, term9500.getClass(), "reincarnationNum", 0);
        setIntField(term9500, term9500.getClass(), "level", 0);
        setLongField(term9500, term9500.getClass(), "exp", 0L);
        setLongField(term9500, term9500.getClass(), "playerRating", 0L);
        setField(term9500, term9500.getClass(), "lastGameId", null);
        setField(term9500, term9500.getClass(), "lastRomVersion", null);
        setField(term9500, term9500.getClass(), "lastDataVersion", null);
        setField(term9500, term9500.getClass(), "lastPlayDate", null);
        setIntField(term9500, term9500.getClass(), "nameplateId", 0);
        setIntField(term9500, term9500.getClass(), "trophyId", 0);
        setIntField(term9500, term9500.getClass(), "cardId", 0);
        setIntField(term9500, term9500.getClass(), "dispPlayerLv", 0);
        setIntField(term9500, term9500.getClass(), "dispRating", 0);
        setIntField(term9500, term9500.getClass(), "dispBP", 0);
        setIntField(term9500, term9500.getClass(), "headphone", 0);
        setIntField(term9500, term9500.getClass(), "banStatus", 0);
        setBooleanField(term9500, term9500.getClass(), "isWarningConfirmed", false);
        setIntField(term9500, term9500.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9500, term9500.getClass(), "lastEmoneyCredit", 0);
        term9518 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9518;
        callMethod(klass, "setReincarnationNum", argTypes, term9500, args);
    }

};


