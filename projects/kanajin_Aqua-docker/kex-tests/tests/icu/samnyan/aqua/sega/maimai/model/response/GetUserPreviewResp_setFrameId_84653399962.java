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

public class GetUserPreviewResp_setFrameId_84653399962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6679;
     Object term6692;

    public GetUserPreviewResp_setFrameId_84653399962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6679 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term6679, term6679.getClass(), "userId", null);
        setField(term6679, term6679.getClass(), "userName", null);
        setBooleanField(term6679, term6679.getClass(), "isLogin", false);
        setIntField(term6679, term6679.getClass(), "lastDataVersion", 0);
        setField(term6679, term6679.getClass(), "lastLoginDate", null);
        setField(term6679, term6679.getClass(), "lastPlayDate", null);
        setIntField(term6679, term6679.getClass(), "playerRating", 0);
        setIntField(term6679, term6679.getClass(), "nameplateId", 0);
        setIntField(term6679, term6679.getClass(), "frameId", 0);
        setIntField(term6679, term6679.getClass(), "iconId", 0);
        setIntField(term6679, term6679.getClass(), "trophyId", 0);
        setIntField(term6679, term6679.getClass(), "dispRate", 0);
        setIntField(term6679, term6679.getClass(), "dispRank", 0);
        setIntField(term6679, term6679.getClass(), "dispHomeRanker", 0);
        setIntField(term6679, term6679.getClass(), "dispTotalLv", 0);
        setIntField(term6679, term6679.getClass(), "totalLv", 0);
        term6692 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6692;
        callMethod(klass, "setFrameId", argTypes, term6679, args);
    }

};


