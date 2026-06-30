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
import java.lang.Long;

public class GetUserPreviewResp_setExp_122609288781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9540;
     Object term9558;

    public GetUserPreviewResp_setExp_122609288781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9540 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9540, term9540.getClass(), "userId", 0L);
        setBooleanField(term9540, term9540.getClass(), "isLogin", false);
        setField(term9540, term9540.getClass(), "lastLoginDate", null);
        setField(term9540, term9540.getClass(), "userName", null);
        setIntField(term9540, term9540.getClass(), "reincarnationNum", 0);
        setIntField(term9540, term9540.getClass(), "level", 0);
        setLongField(term9540, term9540.getClass(), "exp", 0L);
        setLongField(term9540, term9540.getClass(), "playerRating", 0L);
        setField(term9540, term9540.getClass(), "lastGameId", null);
        setField(term9540, term9540.getClass(), "lastRomVersion", null);
        setField(term9540, term9540.getClass(), "lastDataVersion", null);
        setField(term9540, term9540.getClass(), "lastPlayDate", null);
        setIntField(term9540, term9540.getClass(), "nameplateId", 0);
        setIntField(term9540, term9540.getClass(), "trophyId", 0);
        setIntField(term9540, term9540.getClass(), "cardId", 0);
        setIntField(term9540, term9540.getClass(), "dispPlayerLv", 0);
        setIntField(term9540, term9540.getClass(), "dispRating", 0);
        setIntField(term9540, term9540.getClass(), "dispBP", 0);
        setIntField(term9540, term9540.getClass(), "headphone", 0);
        setIntField(term9540, term9540.getClass(), "banStatus", 0);
        setBooleanField(term9540, term9540.getClass(), "isWarningConfirmed", false);
        setIntField(term9540, term9540.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9540, term9540.getClass(), "lastEmoneyCredit", 0);
        term9558 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term9558;
        callMethod(klass, "setExp", argTypes, term9540, args);
    }

};


