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

public class GetUserPreviewResp_getLastDataVersion_194717321652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31859;

    public GetUserPreviewResp_getLastDataVersion_194717321652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31859 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term31859, term31859.getClass(), "userId", 0L);
        setField(term31859, term31859.getClass(), "userName", null);
        setBooleanField(term31859, term31859.getClass(), "isLogin", false);
        setField(term31859, term31859.getClass(), "lastGameId", null);
        setField(term31859, term31859.getClass(), "lastDataVersion", null);
        setField(term31859, term31859.getClass(), "lastRomVersion", null);
        setField(term31859, term31859.getClass(), "lastLoginDate", null);
        setField(term31859, term31859.getClass(), "lastPlayDate", null);
        setIntField(term31859, term31859.getClass(), "playerRating", 0);
        setIntField(term31859, term31859.getClass(), "nameplateId", 0);
        setIntField(term31859, term31859.getClass(), "iconId", 0);
        setIntField(term31859, term31859.getClass(), "trophyId", 0);
        setIntField(term31859, term31859.getClass(), "partnerId", 0);
        setIntField(term31859, term31859.getClass(), "frameId", 0);
        setIntField(term31859, term31859.getClass(), "dispRate", 0);
        setIntField(term31859, term31859.getClass(), "totalAwake", 0);
        setIntField(term31859, term31859.getClass(), "isNetMember", 0);
        setField(term31859, term31859.getClass(), "dailyBonusDate", null);
        setIntField(term31859, term31859.getClass(), "headPhoneVolume", 0);
        setBooleanField(term31859, term31859.getClass(), "isInherit", false);
        setIntField(term31859, term31859.getClass(), "banState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term31859, args);
    }

};


