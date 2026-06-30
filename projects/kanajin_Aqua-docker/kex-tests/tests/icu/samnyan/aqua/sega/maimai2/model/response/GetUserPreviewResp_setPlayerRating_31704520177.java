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

public class GetUserPreviewResp_setPlayerRating_31704520177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32238;
     Object term32253;

    public GetUserPreviewResp_setPlayerRating_31704520177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32238 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term32238, term32238.getClass(), "userId", 0L);
        setField(term32238, term32238.getClass(), "userName", null);
        setBooleanField(term32238, term32238.getClass(), "isLogin", false);
        setField(term32238, term32238.getClass(), "lastGameId", null);
        setField(term32238, term32238.getClass(), "lastDataVersion", null);
        setField(term32238, term32238.getClass(), "lastRomVersion", null);
        setField(term32238, term32238.getClass(), "lastLoginDate", null);
        setField(term32238, term32238.getClass(), "lastPlayDate", null);
        setIntField(term32238, term32238.getClass(), "playerRating", 0);
        setIntField(term32238, term32238.getClass(), "nameplateId", 0);
        setIntField(term32238, term32238.getClass(), "iconId", 0);
        setIntField(term32238, term32238.getClass(), "trophyId", 0);
        setIntField(term32238, term32238.getClass(), "partnerId", 0);
        setIntField(term32238, term32238.getClass(), "frameId", 0);
        setIntField(term32238, term32238.getClass(), "dispRate", 0);
        setIntField(term32238, term32238.getClass(), "totalAwake", 0);
        setIntField(term32238, term32238.getClass(), "isNetMember", 0);
        setField(term32238, term32238.getClass(), "dailyBonusDate", null);
        setIntField(term32238, term32238.getClass(), "headPhoneVolume", 0);
        setBooleanField(term32238, term32238.getClass(), "isInherit", false);
        setIntField(term32238, term32238.getClass(), "banState", 0);
        term32253 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32253;
        callMethod(klass, "setPlayerRating", argTypes, term32238, args);
    }

};


