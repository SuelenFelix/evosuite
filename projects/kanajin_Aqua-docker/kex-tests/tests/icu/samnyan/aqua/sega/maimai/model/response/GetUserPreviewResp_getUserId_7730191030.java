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

public class GetUserPreviewResp_getUserId_7730191030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3977;

    public GetUserPreviewResp_getUserId_7730191030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3978 = new Long(0L);
        term3977 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term3977, term3977.getClass(), "userId", term3978);
        setField(term3977, term3977.getClass(), "userName", "");
        setBooleanField(term3977, term3977.getClass(), "isLogin", false);
        setIntField(term3977, term3977.getClass(), "lastDataVersion", -21429773);
        setField(term3977, term3977.getClass(), "lastLoginDate", "zLMTXDQHYH");
        setField(term3977, term3977.getClass(), "lastPlayDate", "PqywFWJlpE");
        setIntField(term3977, term3977.getClass(), "playerRating", 1774728742);
        setIntField(term3977, term3977.getClass(), "nameplateId", -1822211508);
        setIntField(term3977, term3977.getClass(), "frameId", -177243872);
        setIntField(term3977, term3977.getClass(), "iconId", 1485047282);
        setIntField(term3977, term3977.getClass(), "trophyId", 1624190794);
        setIntField(term3977, term3977.getClass(), "dispRate", 1);
        setIntField(term3977, term3977.getClass(), "dispRank", 1);
        setIntField(term3977, term3977.getClass(), "dispHomeRanker", 1);
        setIntField(term3977, term3977.getClass(), "dispTotalLv", 1);
        setIntField(term3977, term3977.getClass(), "totalLv", -773608881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term3977, args);
    }

};


