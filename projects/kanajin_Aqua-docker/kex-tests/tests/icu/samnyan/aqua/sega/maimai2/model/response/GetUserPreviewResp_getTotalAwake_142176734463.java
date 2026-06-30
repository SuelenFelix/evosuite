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

public class GetUserPreviewResp_getTotalAwake_142176734463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32024;

    public GetUserPreviewResp_getTotalAwake_142176734463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32024 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term32024, term32024.getClass(), "userId", 0L);
        setField(term32024, term32024.getClass(), "userName", null);
        setBooleanField(term32024, term32024.getClass(), "isLogin", false);
        setField(term32024, term32024.getClass(), "lastGameId", null);
        setField(term32024, term32024.getClass(), "lastDataVersion", null);
        setField(term32024, term32024.getClass(), "lastRomVersion", null);
        setField(term32024, term32024.getClass(), "lastLoginDate", null);
        setField(term32024, term32024.getClass(), "lastPlayDate", null);
        setIntField(term32024, term32024.getClass(), "playerRating", 0);
        setIntField(term32024, term32024.getClass(), "nameplateId", 0);
        setIntField(term32024, term32024.getClass(), "iconId", 0);
        setIntField(term32024, term32024.getClass(), "trophyId", 0);
        setIntField(term32024, term32024.getClass(), "partnerId", 0);
        setIntField(term32024, term32024.getClass(), "frameId", 0);
        setIntField(term32024, term32024.getClass(), "dispRate", 0);
        setIntField(term32024, term32024.getClass(), "totalAwake", 0);
        setIntField(term32024, term32024.getClass(), "isNetMember", 0);
        setField(term32024, term32024.getClass(), "dailyBonusDate", null);
        setIntField(term32024, term32024.getClass(), "headPhoneVolume", 0);
        setBooleanField(term32024, term32024.getClass(), "isInherit", false);
        setIntField(term32024, term32024.getClass(), "banState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAwake", argTypes, term32024, args);
    }

};


