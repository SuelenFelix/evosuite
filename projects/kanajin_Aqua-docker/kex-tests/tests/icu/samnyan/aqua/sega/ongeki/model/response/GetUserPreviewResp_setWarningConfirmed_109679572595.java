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
import java.lang.Boolean;

public class GetUserPreviewResp_setWarningConfirmed_109679572595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9812;
     Object term9830;

    public GetUserPreviewResp_setWarningConfirmed_109679572595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9812 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9812, term9812.getClass(), "userId", 0L);
        setBooleanField(term9812, term9812.getClass(), "isLogin", false);
        setField(term9812, term9812.getClass(), "lastLoginDate", null);
        setField(term9812, term9812.getClass(), "userName", null);
        setIntField(term9812, term9812.getClass(), "reincarnationNum", 0);
        setIntField(term9812, term9812.getClass(), "level", 0);
        setLongField(term9812, term9812.getClass(), "exp", 0L);
        setLongField(term9812, term9812.getClass(), "playerRating", 0L);
        setField(term9812, term9812.getClass(), "lastGameId", null);
        setField(term9812, term9812.getClass(), "lastRomVersion", null);
        setField(term9812, term9812.getClass(), "lastDataVersion", null);
        setField(term9812, term9812.getClass(), "lastPlayDate", null);
        setIntField(term9812, term9812.getClass(), "nameplateId", 0);
        setIntField(term9812, term9812.getClass(), "trophyId", 0);
        setIntField(term9812, term9812.getClass(), "cardId", 0);
        setIntField(term9812, term9812.getClass(), "dispPlayerLv", 0);
        setIntField(term9812, term9812.getClass(), "dispRating", 0);
        setIntField(term9812, term9812.getClass(), "dispBP", 0);
        setIntField(term9812, term9812.getClass(), "headphone", 0);
        setIntField(term9812, term9812.getClass(), "banStatus", 0);
        setBooleanField(term9812, term9812.getClass(), "isWarningConfirmed", false);
        setIntField(term9812, term9812.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9812, term9812.getClass(), "lastEmoneyCredit", 0);
        term9830 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9830;
        callMethod(klass, "setWarningConfirmed", argTypes, term9812, args);
    }

};


