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

public class GetUserPreviewResp_setDispHomeRanker_41156688567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6754;
     Object term6767;

    public GetUserPreviewResp_setDispHomeRanker_41156688567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6754 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term6754, term6754.getClass(), "userId", null);
        setField(term6754, term6754.getClass(), "userName", null);
        setBooleanField(term6754, term6754.getClass(), "isLogin", false);
        setIntField(term6754, term6754.getClass(), "lastDataVersion", 0);
        setField(term6754, term6754.getClass(), "lastLoginDate", null);
        setField(term6754, term6754.getClass(), "lastPlayDate", null);
        setIntField(term6754, term6754.getClass(), "playerRating", 0);
        setIntField(term6754, term6754.getClass(), "nameplateId", 0);
        setIntField(term6754, term6754.getClass(), "frameId", 0);
        setIntField(term6754, term6754.getClass(), "iconId", 0);
        setIntField(term6754, term6754.getClass(), "trophyId", 0);
        setIntField(term6754, term6754.getClass(), "dispRate", 0);
        setIntField(term6754, term6754.getClass(), "dispRank", 0);
        setIntField(term6754, term6754.getClass(), "dispHomeRanker", 0);
        setIntField(term6754, term6754.getClass(), "dispTotalLv", 0);
        setIntField(term6754, term6754.getClass(), "totalLv", 0);
        term6767 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6767;
        callMethod(klass, "setDispHomeRanker", argTypes, term6754, args);
    }

};


