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

public class GetUserPreviewResp_toString_46124795845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31448;

    public GetUserPreviewResp_toString_46124795845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31448 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term31448, term31448.getClass(), "userId", -2563454768051334217L);
        setField(term31448, term31448.getClass(), "userName", "LdfzgJfEqK");
        setBooleanField(term31448, term31448.getClass(), "isLogin", true);
        setField(term31448, term31448.getClass(), "lastGameId", "YdzBhsGATX");
        setField(term31448, term31448.getClass(), "lastDataVersion", "IxrOGCWNvM");
        setField(term31448, term31448.getClass(), "lastRomVersion", "ixwssTuJbB");
        setField(term31448, term31448.getClass(), "lastLoginDate", "IXdiuaFyFC");
        setField(term31448, term31448.getClass(), "lastPlayDate", "CLVzSrhOjS");
        setIntField(term31448, term31448.getClass(), "playerRating", 702237858);
        setIntField(term31448, term31448.getClass(), "nameplateId", -70803343);
        setIntField(term31448, term31448.getClass(), "iconId", -2147305933);
        setIntField(term31448, term31448.getClass(), "trophyId", 1174830017);
        setIntField(term31448, term31448.getClass(), "partnerId", 2140219446);
        setIntField(term31448, term31448.getClass(), "frameId", -417525632);
        setIntField(term31448, term31448.getClass(), "dispRate", 1228187048);
        setIntField(term31448, term31448.getClass(), "totalAwake", -809028643);
        setIntField(term31448, term31448.getClass(), "isNetMember", -1322926388);
        setField(term31448, term31448.getClass(), "dailyBonusDate", "OrrgHDCMip");
        setIntField(term31448, term31448.getClass(), "headPhoneVolume", 701619360);
        setBooleanField(term31448, term31448.getClass(), "isInherit", false);
        setIntField(term31448, term31448.getClass(), "banState", 930820216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term31448, args);
    }

};


