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

public class GetUserPreviewResp_getDispRank_109675179912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4709;

    public GetUserPreviewResp_getDispRank_109675179912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4710 = new Long(0L);
        term4709 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4709, term4709.getClass(), "userId", term4710);
        setField(term4709, term4709.getClass(), "userName", "");
        setBooleanField(term4709, term4709.getClass(), "isLogin", true);
        setIntField(term4709, term4709.getClass(), "lastDataVersion", 2119231643);
        setField(term4709, term4709.getClass(), "lastLoginDate", "yeSXGqQExb");
        setField(term4709, term4709.getClass(), "lastPlayDate", "uXYcXVYJZM");
        setIntField(term4709, term4709.getClass(), "playerRating", 688546450);
        setIntField(term4709, term4709.getClass(), "nameplateId", 115635779);
        setIntField(term4709, term4709.getClass(), "frameId", -1081685171);
        setIntField(term4709, term4709.getClass(), "iconId", 1511699134);
        setIntField(term4709, term4709.getClass(), "trophyId", 185647247);
        setIntField(term4709, term4709.getClass(), "dispRate", 1);
        setIntField(term4709, term4709.getClass(), "dispRank", 1);
        setIntField(term4709, term4709.getClass(), "dispHomeRanker", 1);
        setIntField(term4709, term4709.getClass(), "dispTotalLv", 1);
        setIntField(term4709, term4709.getClass(), "totalLv", 720814309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispRank", argTypes, term4709, args);
    }

};


