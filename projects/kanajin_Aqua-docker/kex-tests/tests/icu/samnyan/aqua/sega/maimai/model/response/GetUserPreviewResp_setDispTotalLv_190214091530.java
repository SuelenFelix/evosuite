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

public class GetUserPreviewResp_setDispTotalLv_190214091530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5895;
     Object term5936;

    public GetUserPreviewResp_setDispTotalLv_190214091530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5896 = new Long(0L);
        term5895 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term5895, term5895.getClass(), "userId", term5896);
        setField(term5895, term5895.getClass(), "userName", "");
        setBooleanField(term5895, term5895.getClass(), "isLogin", true);
        setIntField(term5895, term5895.getClass(), "lastDataVersion", -758870402);
        setField(term5895, term5895.getClass(), "lastLoginDate", "yevIIoVYHq");
        setField(term5895, term5895.getClass(), "lastPlayDate", "UuYWMTqWTV");
        setIntField(term5895, term5895.getClass(), "playerRating", 72767889);
        setIntField(term5895, term5895.getClass(), "nameplateId", 1699515029);
        setIntField(term5895, term5895.getClass(), "frameId", 673153263);
        setIntField(term5895, term5895.getClass(), "iconId", -1355715967);
        setIntField(term5895, term5895.getClass(), "trophyId", -972516789);
        setIntField(term5895, term5895.getClass(), "dispRate", 1);
        setIntField(term5895, term5895.getClass(), "dispRank", 1);
        setIntField(term5895, term5895.getClass(), "dispHomeRanker", 1);
        setIntField(term5895, term5895.getClass(), "dispTotalLv", 1);
        setIntField(term5895, term5895.getClass(), "totalLv", 720077443);
        term5936 = new Integer(-884523977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5936;
        callMethod(klass, "setDispTotalLv", argTypes, term5895, args);
    }

};


