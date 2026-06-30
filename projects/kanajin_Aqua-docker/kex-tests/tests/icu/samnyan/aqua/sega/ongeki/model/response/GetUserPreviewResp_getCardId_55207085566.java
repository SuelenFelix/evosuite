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

public class GetUserPreviewResp_getCardId_55207085566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9262;

    public GetUserPreviewResp_getCardId_55207085566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9262 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9262, term9262.getClass(), "userId", 0L);
        setBooleanField(term9262, term9262.getClass(), "isLogin", false);
        setField(term9262, term9262.getClass(), "lastLoginDate", null);
        setField(term9262, term9262.getClass(), "userName", null);
        setIntField(term9262, term9262.getClass(), "reincarnationNum", 0);
        setIntField(term9262, term9262.getClass(), "level", 0);
        setLongField(term9262, term9262.getClass(), "exp", 0L);
        setLongField(term9262, term9262.getClass(), "playerRating", 0L);
        setField(term9262, term9262.getClass(), "lastGameId", null);
        setField(term9262, term9262.getClass(), "lastRomVersion", null);
        setField(term9262, term9262.getClass(), "lastDataVersion", null);
        setField(term9262, term9262.getClass(), "lastPlayDate", null);
        setIntField(term9262, term9262.getClass(), "nameplateId", 0);
        setIntField(term9262, term9262.getClass(), "trophyId", 0);
        setIntField(term9262, term9262.getClass(), "cardId", 0);
        setIntField(term9262, term9262.getClass(), "dispPlayerLv", 0);
        setIntField(term9262, term9262.getClass(), "dispRating", 0);
        setIntField(term9262, term9262.getClass(), "dispBP", 0);
        setIntField(term9262, term9262.getClass(), "headphone", 0);
        setIntField(term9262, term9262.getClass(), "banStatus", 0);
        setBooleanField(term9262, term9262.getClass(), "isWarningConfirmed", false);
        setIntField(term9262, term9262.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9262, term9262.getClass(), "lastEmoneyCredit", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardId", argTypes, term9262, args);
    }

};


