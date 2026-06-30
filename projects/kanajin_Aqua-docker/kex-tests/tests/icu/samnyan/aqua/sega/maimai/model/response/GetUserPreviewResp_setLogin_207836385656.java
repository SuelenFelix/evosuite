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
import java.lang.Boolean;

public class GetUserPreviewResp_setLogin_207836385656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6593;
     Object term6606;

    public GetUserPreviewResp_setLogin_207836385656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6593 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term6593, term6593.getClass(), "userId", null);
        setField(term6593, term6593.getClass(), "userName", null);
        setBooleanField(term6593, term6593.getClass(), "isLogin", false);
        setIntField(term6593, term6593.getClass(), "lastDataVersion", 0);
        setField(term6593, term6593.getClass(), "lastLoginDate", null);
        setField(term6593, term6593.getClass(), "lastPlayDate", null);
        setIntField(term6593, term6593.getClass(), "playerRating", 0);
        setIntField(term6593, term6593.getClass(), "nameplateId", 0);
        setIntField(term6593, term6593.getClass(), "frameId", 0);
        setIntField(term6593, term6593.getClass(), "iconId", 0);
        setIntField(term6593, term6593.getClass(), "trophyId", 0);
        setIntField(term6593, term6593.getClass(), "dispRate", 0);
        setIntField(term6593, term6593.getClass(), "dispRank", 0);
        setIntField(term6593, term6593.getClass(), "dispHomeRanker", 0);
        setIntField(term6593, term6593.getClass(), "dispTotalLv", 0);
        setIntField(term6593, term6593.getClass(), "totalLv", 0);
        term6606 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6606;
        callMethod(klass, "setLogin", argTypes, term6593, args);
    }

};


