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

public class GetUserPreviewResp_setLastPlayDate_18845510028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28505;

    public GetUserPreviewResp_setLastPlayDate_18845510028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28505 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term28505, term28505.getClass(), "userId", 1347723683044734453L);
        setField(term28505, term28505.getClass(), "userName", "AbIDnsFOzO");
        setBooleanField(term28505, term28505.getClass(), "isLogin", true);
        setField(term28505, term28505.getClass(), "lastGameId", "ekTUXbqVGx");
        setField(term28505, term28505.getClass(), "lastDataVersion", "ECPFDcnHIT");
        setField(term28505, term28505.getClass(), "lastRomVersion", "cgHejOgcDW");
        setField(term28505, term28505.getClass(), "lastLoginDate", "QYNTEJcWIQ");
        setField(term28505, term28505.getClass(), "lastPlayDate", "SbdSVclvuX");
        setIntField(term28505, term28505.getClass(), "playerRating", 2099511779);
        setIntField(term28505, term28505.getClass(), "nameplateId", 2039235808);
        setIntField(term28505, term28505.getClass(), "iconId", -815715514);
        setIntField(term28505, term28505.getClass(), "trophyId", 1890131657);
        setIntField(term28505, term28505.getClass(), "partnerId", -910332885);
        setIntField(term28505, term28505.getClass(), "frameId", 186607713);
        setIntField(term28505, term28505.getClass(), "dispRate", -400018942);
        setIntField(term28505, term28505.getClass(), "totalAwake", -101025934);
        setIntField(term28505, term28505.getClass(), "isNetMember", 1587463337);
        setField(term28505, term28505.getClass(), "dailyBonusDate", "QpoSxHFuJh");
        setIntField(term28505, term28505.getClass(), "headPhoneVolume", 463114370);
        setBooleanField(term28505, term28505.getClass(), "isInherit", true);
        setIntField(term28505, term28505.getClass(), "banState", 1541842334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GLAJgnHQMo";
        callMethod(klass, "setLastPlayDate", argTypes, term28505, args);
    }

};


