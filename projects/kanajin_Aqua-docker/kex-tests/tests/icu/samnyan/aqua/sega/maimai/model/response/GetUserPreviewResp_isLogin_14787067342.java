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

public class GetUserPreviewResp_isLogin_14787067342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4099;

    public GetUserPreviewResp_isLogin_14787067342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4100 = new Long(0L);
        term4099 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4099, term4099.getClass(), "userId", term4100);
        setField(term4099, term4099.getClass(), "userName", "");
        setBooleanField(term4099, term4099.getClass(), "isLogin", true);
        setIntField(term4099, term4099.getClass(), "lastDataVersion", 873502011);
        setField(term4099, term4099.getClass(), "lastLoginDate", "dkZFDZxcde");
        setField(term4099, term4099.getClass(), "lastPlayDate", "WXcZEtUKlI");
        setIntField(term4099, term4099.getClass(), "playerRating", -2004575734);
        setIntField(term4099, term4099.getClass(), "nameplateId", 1491468856);
        setIntField(term4099, term4099.getClass(), "frameId", 962385185);
        setIntField(term4099, term4099.getClass(), "iconId", 2146718886);
        setIntField(term4099, term4099.getClass(), "trophyId", -985577036);
        setIntField(term4099, term4099.getClass(), "dispRate", 1);
        setIntField(term4099, term4099.getClass(), "dispRank", 1);
        setIntField(term4099, term4099.getClass(), "dispHomeRanker", 1);
        setIntField(term4099, term4099.getClass(), "dispTotalLv", 1);
        setIntField(term4099, term4099.getClass(), "totalLv", 802539130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLogin", argTypes, term4099, args);
    }

};


