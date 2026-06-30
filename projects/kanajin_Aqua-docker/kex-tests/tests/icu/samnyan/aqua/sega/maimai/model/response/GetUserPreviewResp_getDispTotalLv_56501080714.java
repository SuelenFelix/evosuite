package icu.samnyan.aqua.sega.maimai.model.response;

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
import static icu.samnyan.aqua.sega.maimai.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class GetUserPreviewResp_getDispTotalLv_56501080714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4831;

    public GetUserPreviewResp_getDispTotalLv_56501080714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4832 = new Long(0L);
        term4831 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4831, term4831.getClass(), "userId", term4832);
        setField(term4831, term4831.getClass(), "userName", "");
        setBooleanField(term4831, term4831.getClass(), "isLogin", false);
        setIntField(term4831, term4831.getClass(), "lastDataVersion", 1858277277);
        setField(term4831, term4831.getClass(), "lastLoginDate", "KAORSSPSeV");
        setField(term4831, term4831.getClass(), "lastPlayDate", "UimMMORkzd");
        setIntField(term4831, term4831.getClass(), "playerRating", 2145928130);
        setIntField(term4831, term4831.getClass(), "nameplateId", -1095947031);
        setIntField(term4831, term4831.getClass(), "frameId", 1504187156);
        setIntField(term4831, term4831.getClass(), "iconId", -1713723083);
        setIntField(term4831, term4831.getClass(), "trophyId", -1337690242);
        setIntField(term4831, term4831.getClass(), "dispRate", 1);
        setIntField(term4831, term4831.getClass(), "dispRank", 1);
        setIntField(term4831, term4831.getClass(), "dispHomeRanker", 1);
        setIntField(term4831, term4831.getClass(), "dispTotalLv", 1);
        setIntField(term4831, term4831.getClass(), "totalLv", 264872152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispTotalLv", argTypes, term4831, args);
    }

};


