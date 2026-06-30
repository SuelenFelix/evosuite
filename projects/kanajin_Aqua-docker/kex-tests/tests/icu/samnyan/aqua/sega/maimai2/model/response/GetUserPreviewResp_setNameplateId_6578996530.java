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

public class GetUserPreviewResp_setNameplateId_6578996530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28867;
     Object term28966;

    public GetUserPreviewResp_setNameplateId_6578996530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28867 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term28867, term28867.getClass(), "userId", -2341380687381948599L);
        setField(term28867, term28867.getClass(), "userName", "bLKLlXYEeh");
        setBooleanField(term28867, term28867.getClass(), "isLogin", true);
        setField(term28867, term28867.getClass(), "lastGameId", "amltyOnIBK");
        setField(term28867, term28867.getClass(), "lastDataVersion", "hjGlJibBAS");
        setField(term28867, term28867.getClass(), "lastRomVersion", "vinKDMUJMl");
        setField(term28867, term28867.getClass(), "lastLoginDate", "MgjVPQNbcu");
        setField(term28867, term28867.getClass(), "lastPlayDate", "QNYLGZGxNy");
        setIntField(term28867, term28867.getClass(), "playerRating", -774907545);
        setIntField(term28867, term28867.getClass(), "nameplateId", -2104980850);
        setIntField(term28867, term28867.getClass(), "iconId", -1700414059);
        setIntField(term28867, term28867.getClass(), "trophyId", 894475811);
        setIntField(term28867, term28867.getClass(), "partnerId", -1219489703);
        setIntField(term28867, term28867.getClass(), "frameId", 710854131);
        setIntField(term28867, term28867.getClass(), "dispRate", 1477787899);
        setIntField(term28867, term28867.getClass(), "totalAwake", 296655703);
        setIntField(term28867, term28867.getClass(), "isNetMember", -1558411918);
        setField(term28867, term28867.getClass(), "dailyBonusDate", "BrECRdedgj");
        setIntField(term28867, term28867.getClass(), "headPhoneVolume", 595358328);
        setBooleanField(term28867, term28867.getClass(), "isInherit", true);
        setIntField(term28867, term28867.getClass(), "banState", -1447510365);
        term28966 = new Integer(2021579205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28966;
        callMethod(klass, "setNameplateId", argTypes, term28867, args);
    }

};


