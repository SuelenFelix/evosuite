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

public class GetUserPreviewResp_getFrameId_7060858838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4465;

    public GetUserPreviewResp_getFrameId_7060858838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4466 = new Long(0L);
        term4465 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4465, term4465.getClass(), "userId", term4466);
        setField(term4465, term4465.getClass(), "userName", "");
        setBooleanField(term4465, term4465.getClass(), "isLogin", true);
        setIntField(term4465, term4465.getClass(), "lastDataVersion", 909767683);
        setField(term4465, term4465.getClass(), "lastLoginDate", "HhEaSXWvrY");
        setField(term4465, term4465.getClass(), "lastPlayDate", "CVRGEomOth");
        setIntField(term4465, term4465.getClass(), "playerRating", -639390893);
        setIntField(term4465, term4465.getClass(), "nameplateId", 1176415280);
        setIntField(term4465, term4465.getClass(), "frameId", -1272714687);
        setIntField(term4465, term4465.getClass(), "iconId", -762778853);
        setIntField(term4465, term4465.getClass(), "trophyId", 946727239);
        setIntField(term4465, term4465.getClass(), "dispRate", 1);
        setIntField(term4465, term4465.getClass(), "dispRank", 1);
        setIntField(term4465, term4465.getClass(), "dispHomeRanker", 1);
        setIntField(term4465, term4465.getClass(), "dispTotalLv", 1);
        setIntField(term4465, term4465.getClass(), "totalLv", 349182490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrameId", argTypes, term4465, args);
    }

};


