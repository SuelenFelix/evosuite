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

public class GetUserPreviewResp_setUserName_160596992270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32131;

    public GetUserPreviewResp_setUserName_160596992270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32131 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term32131, term32131.getClass(), "userId", 0L);
        setField(term32131, term32131.getClass(), "userName", null);
        setBooleanField(term32131, term32131.getClass(), "isLogin", false);
        setField(term32131, term32131.getClass(), "lastGameId", null);
        setField(term32131, term32131.getClass(), "lastDataVersion", null);
        setField(term32131, term32131.getClass(), "lastRomVersion", null);
        setField(term32131, term32131.getClass(), "lastLoginDate", null);
        setField(term32131, term32131.getClass(), "lastPlayDate", null);
        setIntField(term32131, term32131.getClass(), "playerRating", 0);
        setIntField(term32131, term32131.getClass(), "nameplateId", 0);
        setIntField(term32131, term32131.getClass(), "iconId", 0);
        setIntField(term32131, term32131.getClass(), "trophyId", 0);
        setIntField(term32131, term32131.getClass(), "partnerId", 0);
        setIntField(term32131, term32131.getClass(), "frameId", 0);
        setIntField(term32131, term32131.getClass(), "dispRate", 0);
        setIntField(term32131, term32131.getClass(), "totalAwake", 0);
        setIntField(term32131, term32131.getClass(), "isNetMember", 0);
        setField(term32131, term32131.getClass(), "dailyBonusDate", null);
        setIntField(term32131, term32131.getClass(), "headPhoneVolume", 0);
        setBooleanField(term32131, term32131.getClass(), "isInherit", false);
        setIntField(term32131, term32131.getClass(), "banState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term32131, args);
    }

};


