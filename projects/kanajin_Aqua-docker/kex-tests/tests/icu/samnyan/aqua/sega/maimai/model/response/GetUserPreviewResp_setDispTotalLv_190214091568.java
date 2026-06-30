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
import java.lang.Integer;

public class GetUserPreviewResp_setDispTotalLv_190214091568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6769;
     Object term6782;

    public GetUserPreviewResp_setDispTotalLv_190214091568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6769 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term6769, term6769.getClass(), "userId", null);
        setField(term6769, term6769.getClass(), "userName", null);
        setBooleanField(term6769, term6769.getClass(), "isLogin", false);
        setIntField(term6769, term6769.getClass(), "lastDataVersion", 0);
        setField(term6769, term6769.getClass(), "lastLoginDate", null);
        setField(term6769, term6769.getClass(), "lastPlayDate", null);
        setIntField(term6769, term6769.getClass(), "playerRating", 0);
        setIntField(term6769, term6769.getClass(), "nameplateId", 0);
        setIntField(term6769, term6769.getClass(), "frameId", 0);
        setIntField(term6769, term6769.getClass(), "iconId", 0);
        setIntField(term6769, term6769.getClass(), "trophyId", 0);
        setIntField(term6769, term6769.getClass(), "dispRate", 0);
        setIntField(term6769, term6769.getClass(), "dispRank", 0);
        setIntField(term6769, term6769.getClass(), "dispHomeRanker", 0);
        setIntField(term6769, term6769.getClass(), "dispTotalLv", 0);
        setIntField(term6769, term6769.getClass(), "totalLv", 0);
        term6782 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6782;
        callMethod(klass, "setDispTotalLv", argTypes, term6769, args);
    }

};


