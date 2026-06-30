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

public class GetUserPreviewResp_setLastPlayDate_127666054621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5308;

    public GetUserPreviewResp_setLastPlayDate_127666054621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5309 = new Long(0L);
        term5308 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term5308, term5308.getClass(), "userId", term5309);
        setField(term5308, term5308.getClass(), "userName", "");
        setBooleanField(term5308, term5308.getClass(), "isLogin", false);
        setIntField(term5308, term5308.getClass(), "lastDataVersion", -1062022366);
        setField(term5308, term5308.getClass(), "lastLoginDate", "lKrEAkypza");
        setField(term5308, term5308.getClass(), "lastPlayDate", "KtuuNAqGCQ");
        setIntField(term5308, term5308.getClass(), "playerRating", -1347618079);
        setIntField(term5308, term5308.getClass(), "nameplateId", 1510246255);
        setIntField(term5308, term5308.getClass(), "frameId", -515631808);
        setIntField(term5308, term5308.getClass(), "iconId", 1546701347);
        setIntField(term5308, term5308.getClass(), "trophyId", -111931851);
        setIntField(term5308, term5308.getClass(), "dispRate", 1);
        setIntField(term5308, term5308.getClass(), "dispRank", 1);
        setIntField(term5308, term5308.getClass(), "dispHomeRanker", 1);
        setIntField(term5308, term5308.getClass(), "dispTotalLv", 1);
        setIntField(term5308, term5308.getClass(), "totalLv", -251696516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OGQsfjmReM";
        callMethod(klass, "setLastPlayDate", argTypes, term5308, args);
    }

};


