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
import java.lang.Integer;

public class GetUserPreviewResp_setFrameId_193473944582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32323;
     Object term32338;

    public GetUserPreviewResp_setFrameId_193473944582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32323 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term32323, term32323.getClass(), "userId", 0L);
        setField(term32323, term32323.getClass(), "userName", null);
        setBooleanField(term32323, term32323.getClass(), "isLogin", false);
        setField(term32323, term32323.getClass(), "lastGameId", null);
        setField(term32323, term32323.getClass(), "lastDataVersion", null);
        setField(term32323, term32323.getClass(), "lastRomVersion", null);
        setField(term32323, term32323.getClass(), "lastLoginDate", null);
        setField(term32323, term32323.getClass(), "lastPlayDate", null);
        setIntField(term32323, term32323.getClass(), "playerRating", 0);
        setIntField(term32323, term32323.getClass(), "nameplateId", 0);
        setIntField(term32323, term32323.getClass(), "iconId", 0);
        setIntField(term32323, term32323.getClass(), "trophyId", 0);
        setIntField(term32323, term32323.getClass(), "partnerId", 0);
        setIntField(term32323, term32323.getClass(), "frameId", 0);
        setIntField(term32323, term32323.getClass(), "dispRate", 0);
        setIntField(term32323, term32323.getClass(), "totalAwake", 0);
        setIntField(term32323, term32323.getClass(), "isNetMember", 0);
        setField(term32323, term32323.getClass(), "dailyBonusDate", null);
        setIntField(term32323, term32323.getClass(), "headPhoneVolume", 0);
        setBooleanField(term32323, term32323.getClass(), "isInherit", false);
        setIntField(term32323, term32323.getClass(), "banState", 0);
        term32338 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32338;
        callMethod(klass, "setFrameId", argTypes, term32323, args);
    }

};


