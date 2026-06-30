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

public class GetUserPreviewResp_setLastPlayDate_163818435586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9634;

    public GetUserPreviewResp_setLastPlayDate_163818435586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9634 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9634, term9634.getClass(), "userId", 0L);
        setBooleanField(term9634, term9634.getClass(), "isLogin", false);
        setField(term9634, term9634.getClass(), "lastLoginDate", null);
        setField(term9634, term9634.getClass(), "userName", null);
        setIntField(term9634, term9634.getClass(), "reincarnationNum", 0);
        setIntField(term9634, term9634.getClass(), "level", 0);
        setLongField(term9634, term9634.getClass(), "exp", 0L);
        setLongField(term9634, term9634.getClass(), "playerRating", 0L);
        setField(term9634, term9634.getClass(), "lastGameId", null);
        setField(term9634, term9634.getClass(), "lastRomVersion", null);
        setField(term9634, term9634.getClass(), "lastDataVersion", null);
        setField(term9634, term9634.getClass(), "lastPlayDate", null);
        setIntField(term9634, term9634.getClass(), "nameplateId", 0);
        setIntField(term9634, term9634.getClass(), "trophyId", 0);
        setIntField(term9634, term9634.getClass(), "cardId", 0);
        setIntField(term9634, term9634.getClass(), "dispPlayerLv", 0);
        setIntField(term9634, term9634.getClass(), "dispRating", 0);
        setIntField(term9634, term9634.getClass(), "dispBP", 0);
        setIntField(term9634, term9634.getClass(), "headphone", 0);
        setIntField(term9634, term9634.getClass(), "banStatus", 0);
        setBooleanField(term9634, term9634.getClass(), "isWarningConfirmed", false);
        setIntField(term9634, term9634.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9634, term9634.getClass(), "lastEmoneyCredit", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlayDate", argTypes, term9634, args);
    }

};


