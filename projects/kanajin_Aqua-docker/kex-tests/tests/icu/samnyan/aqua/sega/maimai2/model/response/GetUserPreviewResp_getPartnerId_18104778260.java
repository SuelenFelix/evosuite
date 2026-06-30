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

public class GetUserPreviewResp_getPartnerId_18104778260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31979;

    public GetUserPreviewResp_getPartnerId_18104778260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31979 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term31979, term31979.getClass(), "userId", 0L);
        setField(term31979, term31979.getClass(), "userName", null);
        setBooleanField(term31979, term31979.getClass(), "isLogin", false);
        setField(term31979, term31979.getClass(), "lastGameId", null);
        setField(term31979, term31979.getClass(), "lastDataVersion", null);
        setField(term31979, term31979.getClass(), "lastRomVersion", null);
        setField(term31979, term31979.getClass(), "lastLoginDate", null);
        setField(term31979, term31979.getClass(), "lastPlayDate", null);
        setIntField(term31979, term31979.getClass(), "playerRating", 0);
        setIntField(term31979, term31979.getClass(), "nameplateId", 0);
        setIntField(term31979, term31979.getClass(), "iconId", 0);
        setIntField(term31979, term31979.getClass(), "trophyId", 0);
        setIntField(term31979, term31979.getClass(), "partnerId", 0);
        setIntField(term31979, term31979.getClass(), "frameId", 0);
        setIntField(term31979, term31979.getClass(), "dispRate", 0);
        setIntField(term31979, term31979.getClass(), "totalAwake", 0);
        setIntField(term31979, term31979.getClass(), "isNetMember", 0);
        setField(term31979, term31979.getClass(), "dailyBonusDate", null);
        setIntField(term31979, term31979.getClass(), "headPhoneVolume", 0);
        setBooleanField(term31979, term31979.getClass(), "isInherit", false);
        setIntField(term31979, term31979.getClass(), "banState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPartnerId", argTypes, term31979, args);
    }

};


