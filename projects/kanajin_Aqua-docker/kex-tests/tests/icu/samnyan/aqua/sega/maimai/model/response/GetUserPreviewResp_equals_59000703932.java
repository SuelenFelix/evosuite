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

public class GetUserPreviewResp_equals_59000703932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6021;
     Object term6062;

    public GetUserPreviewResp_equals_59000703932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6022 = new Long(0L);
        term6021 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term6021, term6021.getClass(), "userId", term6022);
        setField(term6021, term6021.getClass(), "userName", "");
        setBooleanField(term6021, term6021.getClass(), "isLogin", false);
        setIntField(term6021, term6021.getClass(), "lastDataVersion", 1966881264);
        setField(term6021, term6021.getClass(), "lastLoginDate", "gPzGDOEPPw");
        setField(term6021, term6021.getClass(), "lastPlayDate", "rwKoAngzCu");
        setIntField(term6021, term6021.getClass(), "playerRating", -1707655562);
        setIntField(term6021, term6021.getClass(), "nameplateId", 1525815085);
        setIntField(term6021, term6021.getClass(), "frameId", 1785476260);
        setIntField(term6021, term6021.getClass(), "iconId", -655035002);
        setIntField(term6021, term6021.getClass(), "trophyId", 1841475189);
        setIntField(term6021, term6021.getClass(), "dispRate", 1);
        setIntField(term6021, term6021.getClass(), "dispRank", 1);
        setIntField(term6021, term6021.getClass(), "dispHomeRanker", 1);
        setIntField(term6021, term6021.getClass(), "dispTotalLv", 1);
        setIntField(term6021, term6021.getClass(), "totalLv", -456566581);
        term6062 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6062;
        callMethod(klass, "equals", argTypes, term6021, args);
    }

};


