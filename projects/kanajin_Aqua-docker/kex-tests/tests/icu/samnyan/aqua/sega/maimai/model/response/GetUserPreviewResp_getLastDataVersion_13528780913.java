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

public class GetUserPreviewResp_getLastDataVersion_13528780913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4160;

    public GetUserPreviewResp_getLastDataVersion_13528780913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4161 = new Long(0L);
        term4160 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4160, term4160.getClass(), "userId", term4161);
        setField(term4160, term4160.getClass(), "userName", "");
        setBooleanField(term4160, term4160.getClass(), "isLogin", false);
        setIntField(term4160, term4160.getClass(), "lastDataVersion", 2105146188);
        setField(term4160, term4160.getClass(), "lastLoginDate", "IkpjUOuWQU");
        setField(term4160, term4160.getClass(), "lastPlayDate", "boSSpezHeU");
        setIntField(term4160, term4160.getClass(), "playerRating", -862415480);
        setIntField(term4160, term4160.getClass(), "nameplateId", 312605349);
        setIntField(term4160, term4160.getClass(), "frameId", -402072606);
        setIntField(term4160, term4160.getClass(), "iconId", -477355193);
        setIntField(term4160, term4160.getClass(), "trophyId", 168425089);
        setIntField(term4160, term4160.getClass(), "dispRate", 1);
        setIntField(term4160, term4160.getClass(), "dispRank", 1);
        setIntField(term4160, term4160.getClass(), "dispHomeRanker", 1);
        setIntField(term4160, term4160.getClass(), "dispTotalLv", 1);
        setIntField(term4160, term4160.getClass(), "totalLv", -571931590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term4160, args);
    }

};


