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

public class GetUserPreviewResp_canEqual_21415559071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6812;

    public GetUserPreviewResp_canEqual_21415559071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6812 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term6812, term6812.getClass(), "userId", null);
        setField(term6812, term6812.getClass(), "userName", null);
        setBooleanField(term6812, term6812.getClass(), "isLogin", false);
        setIntField(term6812, term6812.getClass(), "lastDataVersion", 0);
        setField(term6812, term6812.getClass(), "lastLoginDate", null);
        setField(term6812, term6812.getClass(), "lastPlayDate", null);
        setIntField(term6812, term6812.getClass(), "playerRating", 0);
        setIntField(term6812, term6812.getClass(), "nameplateId", 0);
        setIntField(term6812, term6812.getClass(), "frameId", 0);
        setIntField(term6812, term6812.getClass(), "iconId", 0);
        setIntField(term6812, term6812.getClass(), "trophyId", 0);
        setIntField(term6812, term6812.getClass(), "dispRate", 0);
        setIntField(term6812, term6812.getClass(), "dispRank", 0);
        setIntField(term6812, term6812.getClass(), "dispHomeRanker", 0);
        setIntField(term6812, term6812.getClass(), "dispTotalLv", 0);
        setIntField(term6812, term6812.getClass(), "totalLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term6812, args);
    }

};


