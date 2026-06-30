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

public class GetUserPreviewResp_setLastLoginDate_74184413677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9464;

    public GetUserPreviewResp_setLastLoginDate_74184413677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9464 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9464, term9464.getClass(), "userId", 0L);
        setBooleanField(term9464, term9464.getClass(), "isLogin", false);
        setField(term9464, term9464.getClass(), "lastLoginDate", null);
        setField(term9464, term9464.getClass(), "userName", null);
        setIntField(term9464, term9464.getClass(), "reincarnationNum", 0);
        setIntField(term9464, term9464.getClass(), "level", 0);
        setLongField(term9464, term9464.getClass(), "exp", 0L);
        setLongField(term9464, term9464.getClass(), "playerRating", 0L);
        setField(term9464, term9464.getClass(), "lastGameId", null);
        setField(term9464, term9464.getClass(), "lastRomVersion", null);
        setField(term9464, term9464.getClass(), "lastDataVersion", null);
        setField(term9464, term9464.getClass(), "lastPlayDate", null);
        setIntField(term9464, term9464.getClass(), "nameplateId", 0);
        setIntField(term9464, term9464.getClass(), "trophyId", 0);
        setIntField(term9464, term9464.getClass(), "cardId", 0);
        setIntField(term9464, term9464.getClass(), "dispPlayerLv", 0);
        setIntField(term9464, term9464.getClass(), "dispRating", 0);
        setIntField(term9464, term9464.getClass(), "dispBP", 0);
        setIntField(term9464, term9464.getClass(), "headphone", 0);
        setIntField(term9464, term9464.getClass(), "banStatus", 0);
        setBooleanField(term9464, term9464.getClass(), "isWarningConfirmed", false);
        setIntField(term9464, term9464.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9464, term9464.getClass(), "lastEmoneyCredit", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastLoginDate", argTypes, term9464, args);
    }

};


