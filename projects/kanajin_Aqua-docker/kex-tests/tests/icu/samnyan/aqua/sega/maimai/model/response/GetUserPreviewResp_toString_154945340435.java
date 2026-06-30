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

public class GetUserPreviewResp_toString_154945340435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6206;

    public GetUserPreviewResp_toString_154945340435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6207 = new Long(0L);
        term6206 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term6206, term6206.getClass(), "userId", term6207);
        setField(term6206, term6206.getClass(), "userName", "");
        setBooleanField(term6206, term6206.getClass(), "isLogin", true);
        setIntField(term6206, term6206.getClass(), "lastDataVersion", 1381027809);
        setField(term6206, term6206.getClass(), "lastLoginDate", "QITgiBrmfj");
        setField(term6206, term6206.getClass(), "lastPlayDate", "pXxkiXgQnq");
        setIntField(term6206, term6206.getClass(), "playerRating", -371717995);
        setIntField(term6206, term6206.getClass(), "nameplateId", 1713005479);
        setIntField(term6206, term6206.getClass(), "frameId", -1948910444);
        setIntField(term6206, term6206.getClass(), "iconId", -1099061955);
        setIntField(term6206, term6206.getClass(), "trophyId", -1672904007);
        setIntField(term6206, term6206.getClass(), "dispRate", 1);
        setIntField(term6206, term6206.getClass(), "dispRank", 1);
        setIntField(term6206, term6206.getClass(), "dispHomeRanker", 1);
        setIntField(term6206, term6206.getClass(), "dispTotalLv", 1);
        setIntField(term6206, term6206.getClass(), "totalLv", -217232010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6206, args);
    }

};


