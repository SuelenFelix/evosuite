package icu.samnyan.aqua.sega.maimai2.model.response;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class GetUserPreviewResp_setInherit_16743196088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32423;
     Object term32438;

    public GetUserPreviewResp_setInherit_16743196088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32423 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term32423, term32423.getClass(), "userId", 0L);
        setField(term32423, term32423.getClass(), "userName", null);
        setBooleanField(term32423, term32423.getClass(), "isLogin", false);
        setField(term32423, term32423.getClass(), "lastGameId", null);
        setField(term32423, term32423.getClass(), "lastDataVersion", null);
        setField(term32423, term32423.getClass(), "lastRomVersion", null);
        setField(term32423, term32423.getClass(), "lastLoginDate", null);
        setField(term32423, term32423.getClass(), "lastPlayDate", null);
        setIntField(term32423, term32423.getClass(), "playerRating", 0);
        setIntField(term32423, term32423.getClass(), "nameplateId", 0);
        setIntField(term32423, term32423.getClass(), "iconId", 0);
        setIntField(term32423, term32423.getClass(), "trophyId", 0);
        setIntField(term32423, term32423.getClass(), "partnerId", 0);
        setIntField(term32423, term32423.getClass(), "frameId", 0);
        setIntField(term32423, term32423.getClass(), "dispRate", 0);
        setIntField(term32423, term32423.getClass(), "totalAwake", 0);
        setIntField(term32423, term32423.getClass(), "isNetMember", 0);
        setField(term32423, term32423.getClass(), "dailyBonusDate", null);
        setIntField(term32423, term32423.getClass(), "headPhoneVolume", 0);
        setBooleanField(term32423, term32423.getClass(), "isInherit", false);
        setIntField(term32423, term32423.getClass(), "banState", 0);
        term32438 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term32438;
        callMethod(klass, "setInherit", argTypes, term32423, args);
    }

};


