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

public class GetUserPreviewResp_setLastDataVersion_196017424119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5162;
     Object term5203;

    public GetUserPreviewResp_setLastDataVersion_196017424119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5163 = new Long(0L);
        term5162 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term5162, term5162.getClass(), "userId", term5163);
        setField(term5162, term5162.getClass(), "userName", "");
        setBooleanField(term5162, term5162.getClass(), "isLogin", false);
        setIntField(term5162, term5162.getClass(), "lastDataVersion", 674390543);
        setField(term5162, term5162.getClass(), "lastLoginDate", "GGzwMoHZXC");
        setField(term5162, term5162.getClass(), "lastPlayDate", "IpmgwHTgnG");
        setIntField(term5162, term5162.getClass(), "playerRating", 1472100258);
        setIntField(term5162, term5162.getClass(), "nameplateId", 12681987);
        setIntField(term5162, term5162.getClass(), "frameId", -1987364934);
        setIntField(term5162, term5162.getClass(), "iconId", 1364414277);
        setIntField(term5162, term5162.getClass(), "trophyId", -961137606);
        setIntField(term5162, term5162.getClass(), "dispRate", 1);
        setIntField(term5162, term5162.getClass(), "dispRank", 1);
        setIntField(term5162, term5162.getClass(), "dispHomeRanker", 1);
        setIntField(term5162, term5162.getClass(), "dispTotalLv", 1);
        setIntField(term5162, term5162.getClass(), "totalLv", 795205527);
        term5203 = new Integer(600958607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5203;
        callMethod(klass, "setLastDataVersion", argTypes, term5162, args);
    }

};


