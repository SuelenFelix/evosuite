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

public class GetUserPreviewResp_getPlayerRating_4687250816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4343;

    public GetUserPreviewResp_getPlayerRating_4687250816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4344 = new Long(0L);
        term4343 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4343, term4343.getClass(), "userId", term4344);
        setField(term4343, term4343.getClass(), "userName", "");
        setBooleanField(term4343, term4343.getClass(), "isLogin", false);
        setIntField(term4343, term4343.getClass(), "lastDataVersion", 1050420173);
        setField(term4343, term4343.getClass(), "lastLoginDate", "oKwCDqywym");
        setField(term4343, term4343.getClass(), "lastPlayDate", "zjZYTddemL");
        setIntField(term4343, term4343.getClass(), "playerRating", 994300935);
        setIntField(term4343, term4343.getClass(), "nameplateId", 433954476);
        setIntField(term4343, term4343.getClass(), "frameId", 1780958641);
        setIntField(term4343, term4343.getClass(), "iconId", 1890582085);
        setIntField(term4343, term4343.getClass(), "trophyId", 2146568808);
        setIntField(term4343, term4343.getClass(), "dispRate", 1);
        setIntField(term4343, term4343.getClass(), "dispRank", 1);
        setIntField(term4343, term4343.getClass(), "dispHomeRanker", 1);
        setIntField(term4343, term4343.getClass(), "dispTotalLv", 1);
        setIntField(term4343, term4343.getClass(), "totalLv", 245081679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term4343, args);
    }

};


