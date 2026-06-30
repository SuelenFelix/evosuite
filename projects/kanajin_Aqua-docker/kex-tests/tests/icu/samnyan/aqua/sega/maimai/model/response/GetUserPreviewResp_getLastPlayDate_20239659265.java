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

public class GetUserPreviewResp_getLastPlayDate_20239659265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4282;

    public GetUserPreviewResp_getLastPlayDate_20239659265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4283 = new Long(0L);
        term4282 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4282, term4282.getClass(), "userId", term4283);
        setField(term4282, term4282.getClass(), "userName", "");
        setBooleanField(term4282, term4282.getClass(), "isLogin", false);
        setIntField(term4282, term4282.getClass(), "lastDataVersion", 885769749);
        setField(term4282, term4282.getClass(), "lastLoginDate", "ZwZIDwYcSW");
        setField(term4282, term4282.getClass(), "lastPlayDate", "sOdkipUKRu");
        setIntField(term4282, term4282.getClass(), "playerRating", -1021168716);
        setIntField(term4282, term4282.getClass(), "nameplateId", -1238055654);
        setIntField(term4282, term4282.getClass(), "frameId", 1561513428);
        setIntField(term4282, term4282.getClass(), "iconId", 778959809);
        setIntField(term4282, term4282.getClass(), "trophyId", -7504064);
        setIntField(term4282, term4282.getClass(), "dispRate", 1);
        setIntField(term4282, term4282.getClass(), "dispRank", 1);
        setIntField(term4282, term4282.getClass(), "dispHomeRanker", 1);
        setIntField(term4282, term4282.getClass(), "dispTotalLv", 1);
        setIntField(term4282, term4282.getClass(), "totalLv", -1464364418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term4282, args);
    }

};


