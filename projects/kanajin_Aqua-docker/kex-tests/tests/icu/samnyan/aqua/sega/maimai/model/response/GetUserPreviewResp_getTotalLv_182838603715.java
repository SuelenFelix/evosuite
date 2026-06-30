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

public class GetUserPreviewResp_getTotalLv_182838603715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4892;

    public GetUserPreviewResp_getTotalLv_182838603715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4893 = new Long(0L);
        term4892 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4892, term4892.getClass(), "userId", term4893);
        setField(term4892, term4892.getClass(), "userName", "");
        setBooleanField(term4892, term4892.getClass(), "isLogin", false);
        setIntField(term4892, term4892.getClass(), "lastDataVersion", 1645751151);
        setField(term4892, term4892.getClass(), "lastLoginDate", "huVIXUWLtI");
        setField(term4892, term4892.getClass(), "lastPlayDate", "vhKzFyKPOT");
        setIntField(term4892, term4892.getClass(), "playerRating", -2117930201);
        setIntField(term4892, term4892.getClass(), "nameplateId", 1839150896);
        setIntField(term4892, term4892.getClass(), "frameId", -1487860516);
        setIntField(term4892, term4892.getClass(), "iconId", 784631129);
        setIntField(term4892, term4892.getClass(), "trophyId", 658285959);
        setIntField(term4892, term4892.getClass(), "dispRate", 1);
        setIntField(term4892, term4892.getClass(), "dispRank", 1);
        setIntField(term4892, term4892.getClass(), "dispHomeRanker", 1);
        setIntField(term4892, term4892.getClass(), "dispTotalLv", 1);
        setIntField(term4892, term4892.getClass(), "totalLv", -89362706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalLv", argTypes, term4892, args);
    }

};


