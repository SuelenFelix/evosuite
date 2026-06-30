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
import java.lang.Integer;

public class GetUserPreviewResp_setTotalLv_27576615531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5958;
     Object term5999;

    public GetUserPreviewResp_setTotalLv_27576615531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5959 = new Long(0L);
        term5958 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term5958, term5958.getClass(), "userId", term5959);
        setField(term5958, term5958.getClass(), "userName", "");
        setBooleanField(term5958, term5958.getClass(), "isLogin", false);
        setIntField(term5958, term5958.getClass(), "lastDataVersion", -1396233580);
        setField(term5958, term5958.getClass(), "lastLoginDate", "DSFGlcaXUb");
        setField(term5958, term5958.getClass(), "lastPlayDate", "sHMXNUzNeM");
        setIntField(term5958, term5958.getClass(), "playerRating", -654234892);
        setIntField(term5958, term5958.getClass(), "nameplateId", -50930731);
        setIntField(term5958, term5958.getClass(), "frameId", -1067876039);
        setIntField(term5958, term5958.getClass(), "iconId", -1143749623);
        setIntField(term5958, term5958.getClass(), "trophyId", 1961561878);
        setIntField(term5958, term5958.getClass(), "dispRate", 1);
        setIntField(term5958, term5958.getClass(), "dispRank", 1);
        setIntField(term5958, term5958.getClass(), "dispHomeRanker", 1);
        setIntField(term5958, term5958.getClass(), "dispTotalLv", 1);
        setIntField(term5958, term5958.getClass(), "totalLv", 1235809050);
        term5999 = new Integer(1370082921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5999;
        callMethod(klass, "setTotalLv", argTypes, term5958, args);
    }

};


