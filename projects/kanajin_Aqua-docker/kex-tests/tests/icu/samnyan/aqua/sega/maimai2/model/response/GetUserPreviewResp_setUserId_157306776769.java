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

public class GetUserPreviewResp_setUserId_157306776769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32114;
     Object term32129;

    public GetUserPreviewResp_setUserId_157306776769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32114 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term32114, term32114.getClass(), "userId", 0L);
        setField(term32114, term32114.getClass(), "userName", null);
        setBooleanField(term32114, term32114.getClass(), "isLogin", false);
        setField(term32114, term32114.getClass(), "lastGameId", null);
        setField(term32114, term32114.getClass(), "lastDataVersion", null);
        setField(term32114, term32114.getClass(), "lastRomVersion", null);
        setField(term32114, term32114.getClass(), "lastLoginDate", null);
        setField(term32114, term32114.getClass(), "lastPlayDate", null);
        setIntField(term32114, term32114.getClass(), "playerRating", 0);
        setIntField(term32114, term32114.getClass(), "nameplateId", 0);
        setIntField(term32114, term32114.getClass(), "iconId", 0);
        setIntField(term32114, term32114.getClass(), "trophyId", 0);
        setIntField(term32114, term32114.getClass(), "partnerId", 0);
        setIntField(term32114, term32114.getClass(), "frameId", 0);
        setIntField(term32114, term32114.getClass(), "dispRate", 0);
        setIntField(term32114, term32114.getClass(), "totalAwake", 0);
        setIntField(term32114, term32114.getClass(), "isNetMember", 0);
        setField(term32114, term32114.getClass(), "dailyBonusDate", null);
        setIntField(term32114, term32114.getClass(), "headPhoneVolume", 0);
        setBooleanField(term32114, term32114.getClass(), "isInherit", false);
        setIntField(term32114, term32114.getClass(), "banState", 0);
        term32129 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term32129;
        callMethod(klass, "setUserId", argTypes, term32114, args);
    }

};


