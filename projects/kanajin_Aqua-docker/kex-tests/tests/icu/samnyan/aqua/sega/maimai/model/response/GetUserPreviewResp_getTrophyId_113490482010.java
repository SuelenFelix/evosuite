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

public class GetUserPreviewResp_getTrophyId_113490482010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4587;

    public GetUserPreviewResp_getTrophyId_113490482010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4588 = new Long(0L);
        term4587 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4587, term4587.getClass(), "userId", term4588);
        setField(term4587, term4587.getClass(), "userName", "");
        setBooleanField(term4587, term4587.getClass(), "isLogin", false);
        setIntField(term4587, term4587.getClass(), "lastDataVersion", 601642248);
        setField(term4587, term4587.getClass(), "lastLoginDate", "WPxXsahPRq");
        setField(term4587, term4587.getClass(), "lastPlayDate", "IENRuqmwUU");
        setIntField(term4587, term4587.getClass(), "playerRating", -1186936928);
        setIntField(term4587, term4587.getClass(), "nameplateId", -315380004);
        setIntField(term4587, term4587.getClass(), "frameId", -1945754843);
        setIntField(term4587, term4587.getClass(), "iconId", -1512221115);
        setIntField(term4587, term4587.getClass(), "trophyId", -515486706);
        setIntField(term4587, term4587.getClass(), "dispRate", 1);
        setIntField(term4587, term4587.getClass(), "dispRank", 1);
        setIntField(term4587, term4587.getClass(), "dispHomeRanker", 1);
        setIntField(term4587, term4587.getClass(), "dispTotalLv", 1);
        setIntField(term4587, term4587.getClass(), "totalLv", -612862488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrophyId", argTypes, term4587, args);
    }

};


