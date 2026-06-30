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

public class GetUserPreviewResp_isInherit_53202639067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32084;

    public GetUserPreviewResp_isInherit_53202639067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32084 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term32084, term32084.getClass(), "userId", 0L);
        setField(term32084, term32084.getClass(), "userName", null);
        setBooleanField(term32084, term32084.getClass(), "isLogin", false);
        setField(term32084, term32084.getClass(), "lastGameId", null);
        setField(term32084, term32084.getClass(), "lastDataVersion", null);
        setField(term32084, term32084.getClass(), "lastRomVersion", null);
        setField(term32084, term32084.getClass(), "lastLoginDate", null);
        setField(term32084, term32084.getClass(), "lastPlayDate", null);
        setIntField(term32084, term32084.getClass(), "playerRating", 0);
        setIntField(term32084, term32084.getClass(), "nameplateId", 0);
        setIntField(term32084, term32084.getClass(), "iconId", 0);
        setIntField(term32084, term32084.getClass(), "trophyId", 0);
        setIntField(term32084, term32084.getClass(), "partnerId", 0);
        setIntField(term32084, term32084.getClass(), "frameId", 0);
        setIntField(term32084, term32084.getClass(), "dispRate", 0);
        setIntField(term32084, term32084.getClass(), "totalAwake", 0);
        setIntField(term32084, term32084.getClass(), "isNetMember", 0);
        setField(term32084, term32084.getClass(), "dailyBonusDate", null);
        setIntField(term32084, term32084.getClass(), "headPhoneVolume", 0);
        setBooleanField(term32084, term32084.getClass(), "isInherit", false);
        setIntField(term32084, term32084.getClass(), "banState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInherit", argTypes, term32084, args);
    }

};


