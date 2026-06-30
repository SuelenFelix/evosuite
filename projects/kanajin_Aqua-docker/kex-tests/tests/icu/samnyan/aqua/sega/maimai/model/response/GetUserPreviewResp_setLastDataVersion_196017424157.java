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

public class GetUserPreviewResp_setLastDataVersion_196017424157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6608;
     Object term6621;

    public GetUserPreviewResp_setLastDataVersion_196017424157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6608 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term6608, term6608.getClass(), "userId", null);
        setField(term6608, term6608.getClass(), "userName", null);
        setBooleanField(term6608, term6608.getClass(), "isLogin", false);
        setIntField(term6608, term6608.getClass(), "lastDataVersion", 0);
        setField(term6608, term6608.getClass(), "lastLoginDate", null);
        setField(term6608, term6608.getClass(), "lastPlayDate", null);
        setIntField(term6608, term6608.getClass(), "playerRating", 0);
        setIntField(term6608, term6608.getClass(), "nameplateId", 0);
        setIntField(term6608, term6608.getClass(), "frameId", 0);
        setIntField(term6608, term6608.getClass(), "iconId", 0);
        setIntField(term6608, term6608.getClass(), "trophyId", 0);
        setIntField(term6608, term6608.getClass(), "dispRate", 0);
        setIntField(term6608, term6608.getClass(), "dispRank", 0);
        setIntField(term6608, term6608.getClass(), "dispHomeRanker", 0);
        setIntField(term6608, term6608.getClass(), "dispTotalLv", 0);
        setIntField(term6608, term6608.getClass(), "totalLv", 0);
        term6621 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6621;
        callMethod(klass, "setLastDataVersion", argTypes, term6608, args);
    }

};


