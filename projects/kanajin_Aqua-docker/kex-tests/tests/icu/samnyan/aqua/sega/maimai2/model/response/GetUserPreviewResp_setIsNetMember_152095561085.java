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

public class GetUserPreviewResp_setIsNetMember_152095561085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32374;
     Object term32389;

    public GetUserPreviewResp_setIsNetMember_152095561085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32374 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term32374, term32374.getClass(), "userId", 0L);
        setField(term32374, term32374.getClass(), "userName", null);
        setBooleanField(term32374, term32374.getClass(), "isLogin", false);
        setField(term32374, term32374.getClass(), "lastGameId", null);
        setField(term32374, term32374.getClass(), "lastDataVersion", null);
        setField(term32374, term32374.getClass(), "lastRomVersion", null);
        setField(term32374, term32374.getClass(), "lastLoginDate", null);
        setField(term32374, term32374.getClass(), "lastPlayDate", null);
        setIntField(term32374, term32374.getClass(), "playerRating", 0);
        setIntField(term32374, term32374.getClass(), "nameplateId", 0);
        setIntField(term32374, term32374.getClass(), "iconId", 0);
        setIntField(term32374, term32374.getClass(), "trophyId", 0);
        setIntField(term32374, term32374.getClass(), "partnerId", 0);
        setIntField(term32374, term32374.getClass(), "frameId", 0);
        setIntField(term32374, term32374.getClass(), "dispRate", 0);
        setIntField(term32374, term32374.getClass(), "totalAwake", 0);
        setIntField(term32374, term32374.getClass(), "isNetMember", 0);
        setField(term32374, term32374.getClass(), "dailyBonusDate", null);
        setIntField(term32374, term32374.getClass(), "headPhoneVolume", 0);
        setBooleanField(term32374, term32374.getClass(), "isInherit", false);
        setIntField(term32374, term32374.getClass(), "banState", 0);
        term32389 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32389;
        callMethod(klass, "setIsNetMember", argTypes, term32374, args);
    }

};


