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

public class GetUserPreviewResp_setDispRate_187468324565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6724;
     Object term6737;

    public GetUserPreviewResp_setDispRate_187468324565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6724 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term6724, term6724.getClass(), "userId", null);
        setField(term6724, term6724.getClass(), "userName", null);
        setBooleanField(term6724, term6724.getClass(), "isLogin", false);
        setIntField(term6724, term6724.getClass(), "lastDataVersion", 0);
        setField(term6724, term6724.getClass(), "lastLoginDate", null);
        setField(term6724, term6724.getClass(), "lastPlayDate", null);
        setIntField(term6724, term6724.getClass(), "playerRating", 0);
        setIntField(term6724, term6724.getClass(), "nameplateId", 0);
        setIntField(term6724, term6724.getClass(), "frameId", 0);
        setIntField(term6724, term6724.getClass(), "iconId", 0);
        setIntField(term6724, term6724.getClass(), "trophyId", 0);
        setIntField(term6724, term6724.getClass(), "dispRate", 0);
        setIntField(term6724, term6724.getClass(), "dispRank", 0);
        setIntField(term6724, term6724.getClass(), "dispHomeRanker", 0);
        setIntField(term6724, term6724.getClass(), "dispTotalLv", 0);
        setIntField(term6724, term6724.getClass(), "totalLv", 0);
        term6737 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6737;
        callMethod(klass, "setDispRate", argTypes, term6724, args);
    }

};


