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

public class GetUserPreviewResp_getUserName_110265493449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31814;

    public GetUserPreviewResp_getUserName_110265493449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31814 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term31814, term31814.getClass(), "userId", 0L);
        setField(term31814, term31814.getClass(), "userName", null);
        setBooleanField(term31814, term31814.getClass(), "isLogin", false);
        setField(term31814, term31814.getClass(), "lastGameId", null);
        setField(term31814, term31814.getClass(), "lastDataVersion", null);
        setField(term31814, term31814.getClass(), "lastRomVersion", null);
        setField(term31814, term31814.getClass(), "lastLoginDate", null);
        setField(term31814, term31814.getClass(), "lastPlayDate", null);
        setIntField(term31814, term31814.getClass(), "playerRating", 0);
        setIntField(term31814, term31814.getClass(), "nameplateId", 0);
        setIntField(term31814, term31814.getClass(), "iconId", 0);
        setIntField(term31814, term31814.getClass(), "trophyId", 0);
        setIntField(term31814, term31814.getClass(), "partnerId", 0);
        setIntField(term31814, term31814.getClass(), "frameId", 0);
        setIntField(term31814, term31814.getClass(), "dispRate", 0);
        setIntField(term31814, term31814.getClass(), "totalAwake", 0);
        setIntField(term31814, term31814.getClass(), "isNetMember", 0);
        setField(term31814, term31814.getClass(), "dailyBonusDate", null);
        setIntField(term31814, term31814.getClass(), "headPhoneVolume", 0);
        setBooleanField(term31814, term31814.getClass(), "isInherit", false);
        setIntField(term31814, term31814.getClass(), "banState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term31814, args);
    }

};


