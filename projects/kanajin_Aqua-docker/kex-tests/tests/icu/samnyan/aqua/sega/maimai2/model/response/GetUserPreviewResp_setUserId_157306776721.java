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
import java.lang.Long;

public class GetUserPreviewResp_setUserId_157306776721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27208;
     Object term27307;

    public GetUserPreviewResp_setUserId_157306776721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27208 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term27208, term27208.getClass(), "userId", 2075261430191543110L);
        setField(term27208, term27208.getClass(), "userName", "XBhNIIxiNP");
        setBooleanField(term27208, term27208.getClass(), "isLogin", true);
        setField(term27208, term27208.getClass(), "lastGameId", "JljyXnwkuC");
        setField(term27208, term27208.getClass(), "lastDataVersion", "XLOxkLyvMY");
        setField(term27208, term27208.getClass(), "lastRomVersion", "pjUyKHjjKH");
        setField(term27208, term27208.getClass(), "lastLoginDate", "JApuaiAykc");
        setField(term27208, term27208.getClass(), "lastPlayDate", "NJWFosJfXl");
        setIntField(term27208, term27208.getClass(), "playerRating", 1551152450);
        setIntField(term27208, term27208.getClass(), "nameplateId", -1821029149);
        setIntField(term27208, term27208.getClass(), "iconId", -1120692414);
        setIntField(term27208, term27208.getClass(), "trophyId", 630179419);
        setIntField(term27208, term27208.getClass(), "partnerId", -1314338966);
        setIntField(term27208, term27208.getClass(), "frameId", 632003573);
        setIntField(term27208, term27208.getClass(), "dispRate", 253586199);
        setIntField(term27208, term27208.getClass(), "totalAwake", 1269448265);
        setIntField(term27208, term27208.getClass(), "isNetMember", 1407128598);
        setField(term27208, term27208.getClass(), "dailyBonusDate", "JraVClZLWB");
        setIntField(term27208, term27208.getClass(), "headPhoneVolume", -799093829);
        setBooleanField(term27208, term27208.getClass(), "isInherit", true);
        setIntField(term27208, term27208.getClass(), "banState", 432526848);
        term27307 = new Long(6988441824698665724L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term27307;
        callMethod(klass, "setUserId", argTypes, term27208, args);
    }

};


