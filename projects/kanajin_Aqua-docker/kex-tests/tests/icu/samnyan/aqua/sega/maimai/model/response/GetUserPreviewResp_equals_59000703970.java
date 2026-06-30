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

public class GetUserPreviewResp_equals_59000703970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6799;

    public GetUserPreviewResp_equals_59000703970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6799 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term6799, term6799.getClass(), "userId", null);
        setField(term6799, term6799.getClass(), "userName", null);
        setBooleanField(term6799, term6799.getClass(), "isLogin", false);
        setIntField(term6799, term6799.getClass(), "lastDataVersion", 0);
        setField(term6799, term6799.getClass(), "lastLoginDate", null);
        setField(term6799, term6799.getClass(), "lastPlayDate", null);
        setIntField(term6799, term6799.getClass(), "playerRating", 0);
        setIntField(term6799, term6799.getClass(), "nameplateId", 0);
        setIntField(term6799, term6799.getClass(), "frameId", 0);
        setIntField(term6799, term6799.getClass(), "iconId", 0);
        setIntField(term6799, term6799.getClass(), "trophyId", 0);
        setIntField(term6799, term6799.getClass(), "dispRate", 0);
        setIntField(term6799, term6799.getClass(), "dispRank", 0);
        setIntField(term6799, term6799.getClass(), "dispHomeRanker", 0);
        setIntField(term6799, term6799.getClass(), "dispTotalLv", 0);
        setIntField(term6799, term6799.getClass(), "totalLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term6799, args);
    }

};


