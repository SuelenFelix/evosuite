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

public class GetUserPreviewResp_canEqual_130236103691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32472;

    public GetUserPreviewResp_canEqual_130236103691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32472 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term32472, term32472.getClass(), "userId", 0L);
        setField(term32472, term32472.getClass(), "userName", null);
        setBooleanField(term32472, term32472.getClass(), "isLogin", false);
        setField(term32472, term32472.getClass(), "lastGameId", null);
        setField(term32472, term32472.getClass(), "lastDataVersion", null);
        setField(term32472, term32472.getClass(), "lastRomVersion", null);
        setField(term32472, term32472.getClass(), "lastLoginDate", null);
        setField(term32472, term32472.getClass(), "lastPlayDate", null);
        setIntField(term32472, term32472.getClass(), "playerRating", 0);
        setIntField(term32472, term32472.getClass(), "nameplateId", 0);
        setIntField(term32472, term32472.getClass(), "iconId", 0);
        setIntField(term32472, term32472.getClass(), "trophyId", 0);
        setIntField(term32472, term32472.getClass(), "partnerId", 0);
        setIntField(term32472, term32472.getClass(), "frameId", 0);
        setIntField(term32472, term32472.getClass(), "dispRate", 0);
        setIntField(term32472, term32472.getClass(), "totalAwake", 0);
        setIntField(term32472, term32472.getClass(), "isNetMember", 0);
        setField(term32472, term32472.getClass(), "dailyBonusDate", null);
        setIntField(term32472, term32472.getClass(), "headPhoneVolume", 0);
        setBooleanField(term32472, term32472.getClass(), "isInherit", false);
        setIntField(term32472, term32472.getClass(), "banState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term32472, args);
    }

};


