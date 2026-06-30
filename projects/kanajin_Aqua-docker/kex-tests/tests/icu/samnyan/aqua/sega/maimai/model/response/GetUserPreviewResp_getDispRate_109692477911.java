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

public class GetUserPreviewResp_getDispRate_109692477911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4648;

    public GetUserPreviewResp_getDispRate_109692477911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4649 = new Long(0L);
        term4648 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4648, term4648.getClass(), "userId", term4649);
        setField(term4648, term4648.getClass(), "userName", "");
        setBooleanField(term4648, term4648.getClass(), "isLogin", true);
        setIntField(term4648, term4648.getClass(), "lastDataVersion", 52739905);
        setField(term4648, term4648.getClass(), "lastLoginDate", "GsWxOwXvSu");
        setField(term4648, term4648.getClass(), "lastPlayDate", "bKBSncrMEZ");
        setIntField(term4648, term4648.getClass(), "playerRating", -2105349391);
        setIntField(term4648, term4648.getClass(), "nameplateId", -1176968921);
        setIntField(term4648, term4648.getClass(), "frameId", -1986225025);
        setIntField(term4648, term4648.getClass(), "iconId", -838689952);
        setIntField(term4648, term4648.getClass(), "trophyId", -307464652);
        setIntField(term4648, term4648.getClass(), "dispRate", 1);
        setIntField(term4648, term4648.getClass(), "dispRank", 1);
        setIntField(term4648, term4648.getClass(), "dispHomeRanker", 1);
        setIntField(term4648, term4648.getClass(), "dispTotalLv", 1);
        setIntField(term4648, term4648.getClass(), "totalLv", 460605690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispRate", argTypes, term4648, args);
    }

};


