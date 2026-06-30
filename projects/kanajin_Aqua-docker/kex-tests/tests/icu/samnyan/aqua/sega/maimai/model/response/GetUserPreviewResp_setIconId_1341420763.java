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

public class GetUserPreviewResp_setIconId_1341420763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6694;
     Object term6707;

    public GetUserPreviewResp_setIconId_1341420763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6694 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term6694, term6694.getClass(), "userId", null);
        setField(term6694, term6694.getClass(), "userName", null);
        setBooleanField(term6694, term6694.getClass(), "isLogin", false);
        setIntField(term6694, term6694.getClass(), "lastDataVersion", 0);
        setField(term6694, term6694.getClass(), "lastLoginDate", null);
        setField(term6694, term6694.getClass(), "lastPlayDate", null);
        setIntField(term6694, term6694.getClass(), "playerRating", 0);
        setIntField(term6694, term6694.getClass(), "nameplateId", 0);
        setIntField(term6694, term6694.getClass(), "frameId", 0);
        setIntField(term6694, term6694.getClass(), "iconId", 0);
        setIntField(term6694, term6694.getClass(), "trophyId", 0);
        setIntField(term6694, term6694.getClass(), "dispRate", 0);
        setIntField(term6694, term6694.getClass(), "dispRank", 0);
        setIntField(term6694, term6694.getClass(), "dispHomeRanker", 0);
        setIntField(term6694, term6694.getClass(), "dispTotalLv", 0);
        setIntField(term6694, term6694.getClass(), "totalLv", 0);
        term6707 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6707;
        callMethod(klass, "setIconId", argTypes, term6694, args);
    }

};


