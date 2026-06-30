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

public class GetUserPreviewResp_setUserId_180571206316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4953;
     Object term4994;

    public GetUserPreviewResp_setUserId_180571206316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4954 = new Long(0L);
        term4953 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4953, term4953.getClass(), "userId", term4954);
        setField(term4953, term4953.getClass(), "userName", "");
        setBooleanField(term4953, term4953.getClass(), "isLogin", false);
        setIntField(term4953, term4953.getClass(), "lastDataVersion", 341388367);
        setField(term4953, term4953.getClass(), "lastLoginDate", "nQhIgWXdRc");
        setField(term4953, term4953.getClass(), "lastPlayDate", "EusenEbIoF");
        setIntField(term4953, term4953.getClass(), "playerRating", 1078807592);
        setIntField(term4953, term4953.getClass(), "nameplateId", 1673044047);
        setIntField(term4953, term4953.getClass(), "frameId", -1835617743);
        setIntField(term4953, term4953.getClass(), "iconId", -337695922);
        setIntField(term4953, term4953.getClass(), "trophyId", 817836900);
        setIntField(term4953, term4953.getClass(), "dispRate", 1);
        setIntField(term4953, term4953.getClass(), "dispRank", 1);
        setIntField(term4953, term4953.getClass(), "dispHomeRanker", 1);
        setIntField(term4953, term4953.getClass(), "dispTotalLv", 1);
        setIntField(term4953, term4953.getClass(), "totalLv", 1691654567);
        term4994 = new Long(1233889271256172047L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4994;
        callMethod(klass, "setUserId", argTypes, term4953, args);
    }

};


