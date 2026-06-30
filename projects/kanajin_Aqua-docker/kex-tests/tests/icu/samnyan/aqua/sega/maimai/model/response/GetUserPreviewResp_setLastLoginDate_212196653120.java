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

public class GetUserPreviewResp_setLastLoginDate_212196653120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5225;

    public GetUserPreviewResp_setLastLoginDate_212196653120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5226 = new Long(0L);
        term5225 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term5225, term5225.getClass(), "userId", term5226);
        setField(term5225, term5225.getClass(), "userName", "");
        setBooleanField(term5225, term5225.getClass(), "isLogin", true);
        setIntField(term5225, term5225.getClass(), "lastDataVersion", 897159778);
        setField(term5225, term5225.getClass(), "lastLoginDate", "tIpkeYIezR");
        setField(term5225, term5225.getClass(), "lastPlayDate", "YkZtEtthvz");
        setIntField(term5225, term5225.getClass(), "playerRating", -1934934961);
        setIntField(term5225, term5225.getClass(), "nameplateId", 2120054887);
        setIntField(term5225, term5225.getClass(), "frameId", 2145648967);
        setIntField(term5225, term5225.getClass(), "iconId", 2060624021);
        setIntField(term5225, term5225.getClass(), "trophyId", -1853309523);
        setIntField(term5225, term5225.getClass(), "dispRate", 1);
        setIntField(term5225, term5225.getClass(), "dispRank", 1);
        setIntField(term5225, term5225.getClass(), "dispHomeRanker", 1);
        setIntField(term5225, term5225.getClass(), "dispTotalLv", 1);
        setIntField(term5225, term5225.getClass(), "totalLv", 241741655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dwlZSxlXOo";
        callMethod(klass, "setLastLoginDate", argTypes, term5225, args);
    }

};


