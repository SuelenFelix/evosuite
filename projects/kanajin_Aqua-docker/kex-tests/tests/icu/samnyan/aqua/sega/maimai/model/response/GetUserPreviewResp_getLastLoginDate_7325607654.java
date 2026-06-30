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

public class GetUserPreviewResp_getLastLoginDate_7325607654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4221;

    public GetUserPreviewResp_getLastLoginDate_7325607654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4222 = new Long(0L);
        term4221 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4221, term4221.getClass(), "userId", term4222);
        setField(term4221, term4221.getClass(), "userName", "");
        setBooleanField(term4221, term4221.getClass(), "isLogin", false);
        setIntField(term4221, term4221.getClass(), "lastDataVersion", 37757400);
        setField(term4221, term4221.getClass(), "lastLoginDate", "OUeBWNTQDh");
        setField(term4221, term4221.getClass(), "lastPlayDate", "gltJarNuUk");
        setIntField(term4221, term4221.getClass(), "playerRating", -1632221612);
        setIntField(term4221, term4221.getClass(), "nameplateId", 1545314376);
        setIntField(term4221, term4221.getClass(), "frameId", 437959151);
        setIntField(term4221, term4221.getClass(), "iconId", 27780241);
        setIntField(term4221, term4221.getClass(), "trophyId", -683868408);
        setIntField(term4221, term4221.getClass(), "dispRate", 1);
        setIntField(term4221, term4221.getClass(), "dispRank", 1);
        setIntField(term4221, term4221.getClass(), "dispHomeRanker", 1);
        setIntField(term4221, term4221.getClass(), "dispTotalLv", 1);
        setIntField(term4221, term4221.getClass(), "totalLv", -381130069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastLoginDate", argTypes, term4221, args);
    }

};


