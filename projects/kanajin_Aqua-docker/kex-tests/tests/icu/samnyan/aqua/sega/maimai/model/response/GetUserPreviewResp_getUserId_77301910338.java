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

public class GetUserPreviewResp_getUserId_77301910338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6359;

    public GetUserPreviewResp_getUserId_77301910338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6359 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term6359, term6359.getClass(), "userId", null);
        setField(term6359, term6359.getClass(), "userName", null);
        setBooleanField(term6359, term6359.getClass(), "isLogin", false);
        setIntField(term6359, term6359.getClass(), "lastDataVersion", 0);
        setField(term6359, term6359.getClass(), "lastLoginDate", null);
        setField(term6359, term6359.getClass(), "lastPlayDate", null);
        setIntField(term6359, term6359.getClass(), "playerRating", 0);
        setIntField(term6359, term6359.getClass(), "nameplateId", 0);
        setIntField(term6359, term6359.getClass(), "frameId", 0);
        setIntField(term6359, term6359.getClass(), "iconId", 0);
        setIntField(term6359, term6359.getClass(), "trophyId", 0);
        setIntField(term6359, term6359.getClass(), "dispRate", 0);
        setIntField(term6359, term6359.getClass(), "dispRank", 0);
        setIntField(term6359, term6359.getClass(), "dispHomeRanker", 0);
        setIntField(term6359, term6359.getClass(), "dispTotalLv", 0);
        setIntField(term6359, term6359.getClass(), "totalLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term6359, args);
    }

};


