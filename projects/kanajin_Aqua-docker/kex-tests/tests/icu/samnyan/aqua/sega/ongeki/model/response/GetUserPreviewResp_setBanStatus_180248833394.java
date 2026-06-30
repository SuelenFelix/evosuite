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

public class GetUserPreviewResp_setBanStatus_180248833394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9792;
     Object term9810;

    public GetUserPreviewResp_setBanStatus_180248833394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9792 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9792, term9792.getClass(), "userId", 0L);
        setBooleanField(term9792, term9792.getClass(), "isLogin", false);
        setField(term9792, term9792.getClass(), "lastLoginDate", null);
        setField(term9792, term9792.getClass(), "userName", null);
        setIntField(term9792, term9792.getClass(), "reincarnationNum", 0);
        setIntField(term9792, term9792.getClass(), "level", 0);
        setLongField(term9792, term9792.getClass(), "exp", 0L);
        setLongField(term9792, term9792.getClass(), "playerRating", 0L);
        setField(term9792, term9792.getClass(), "lastGameId", null);
        setField(term9792, term9792.getClass(), "lastRomVersion", null);
        setField(term9792, term9792.getClass(), "lastDataVersion", null);
        setField(term9792, term9792.getClass(), "lastPlayDate", null);
        setIntField(term9792, term9792.getClass(), "nameplateId", 0);
        setIntField(term9792, term9792.getClass(), "trophyId", 0);
        setIntField(term9792, term9792.getClass(), "cardId", 0);
        setIntField(term9792, term9792.getClass(), "dispPlayerLv", 0);
        setIntField(term9792, term9792.getClass(), "dispRating", 0);
        setIntField(term9792, term9792.getClass(), "dispBP", 0);
        setIntField(term9792, term9792.getClass(), "headphone", 0);
        setIntField(term9792, term9792.getClass(), "banStatus", 0);
        setBooleanField(term9792, term9792.getClass(), "isWarningConfirmed", false);
        setIntField(term9792, term9792.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9792, term9792.getClass(), "lastEmoneyCredit", 0);
        term9810 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9810;
        callMethod(klass, "setBanStatus", argTypes, term9792, args);
    }

};


