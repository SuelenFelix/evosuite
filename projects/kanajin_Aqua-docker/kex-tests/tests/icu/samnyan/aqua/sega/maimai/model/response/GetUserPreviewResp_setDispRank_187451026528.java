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

public class GetUserPreviewResp_setDispRank_187451026528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5769;
     Object term5810;

    public GetUserPreviewResp_setDispRank_187451026528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5770 = new Long(0L);
        term5769 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term5769, term5769.getClass(), "userId", term5770);
        setField(term5769, term5769.getClass(), "userName", "");
        setBooleanField(term5769, term5769.getClass(), "isLogin", true);
        setIntField(term5769, term5769.getClass(), "lastDataVersion", 974951631);
        setField(term5769, term5769.getClass(), "lastLoginDate", "WdCiTDUKqn");
        setField(term5769, term5769.getClass(), "lastPlayDate", "PSizQDoxxe");
        setIntField(term5769, term5769.getClass(), "playerRating", -942202284);
        setIntField(term5769, term5769.getClass(), "nameplateId", -2083254556);
        setIntField(term5769, term5769.getClass(), "frameId", 1452346261);
        setIntField(term5769, term5769.getClass(), "iconId", -548776693);
        setIntField(term5769, term5769.getClass(), "trophyId", 99032275);
        setIntField(term5769, term5769.getClass(), "dispRate", 1);
        setIntField(term5769, term5769.getClass(), "dispRank", 1);
        setIntField(term5769, term5769.getClass(), "dispHomeRanker", 1);
        setIntField(term5769, term5769.getClass(), "dispTotalLv", 1);
        setIntField(term5769, term5769.getClass(), "totalLv", 794098686);
        term5810 = new Integer(-1671524013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5810;
        callMethod(klass, "setDispRank", argTypes, term5769, args);
    }

};


