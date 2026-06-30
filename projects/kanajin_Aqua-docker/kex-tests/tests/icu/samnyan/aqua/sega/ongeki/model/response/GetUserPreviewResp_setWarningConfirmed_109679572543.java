package icu.samnyan.aqua.sega.ongeki.model.response;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class GetUserPreviewResp_setWarningConfirmed_109679572543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8346;
     Object term8396;

    public GetUserPreviewResp_setWarningConfirmed_109679572543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8346 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term8346, term8346.getClass(), "userId", 6383832776430121737L);
        setBooleanField(term8346, term8346.getClass(), "isLogin", true);
        setField(term8346, term8346.getClass(), "lastLoginDate", "cDOXXottZh");
        setField(term8346, term8346.getClass(), "userName", "");
        setIntField(term8346, term8346.getClass(), "reincarnationNum", -1361921586);
        setIntField(term8346, term8346.getClass(), "level", 593679468);
        setLongField(term8346, term8346.getClass(), "exp", 3853743792832767733L);
        setLongField(term8346, term8346.getClass(), "playerRating", -6064923943154213519L);
        setField(term8346, term8346.getClass(), "lastGameId", "");
        setField(term8346, term8346.getClass(), "lastRomVersion", "");
        setField(term8346, term8346.getClass(), "lastDataVersion", "");
        setField(term8346, term8346.getClass(), "lastPlayDate", "rfqJDkDppz");
        setIntField(term8346, term8346.getClass(), "nameplateId", 747491);
        setIntField(term8346, term8346.getClass(), "trophyId", 734222768);
        setIntField(term8346, term8346.getClass(), "cardId", 1545425140);
        setIntField(term8346, term8346.getClass(), "dispPlayerLv", -1580765555);
        setIntField(term8346, term8346.getClass(), "dispRating", -1295149055);
        setIntField(term8346, term8346.getClass(), "dispBP", -769814321);
        setIntField(term8346, term8346.getClass(), "headphone", 114898432);
        setIntField(term8346, term8346.getClass(), "banStatus", -193767503);
        setBooleanField(term8346, term8346.getClass(), "isWarningConfirmed", false);
        setIntField(term8346, term8346.getClass(), "lastEmoneyBrand", -2090918082);
        setIntField(term8346, term8346.getClass(), "lastEmoneyCredit", 1505717672);
        term8396 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term8396;
        callMethod(klass, "setWarningConfirmed", argTypes, term8346, args);
    }

};


