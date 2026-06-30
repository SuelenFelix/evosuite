package icu.samnyan.aqua.sega.maimai2.model.response;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetUserPreviewResp_getLastDataVersion_19471732164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24335;

    public GetUserPreviewResp_getLastDataVersion_19471732164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24335 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term24335, term24335.getClass(), "userId", 7357901219511867751L);
        setField(term24335, term24335.getClass(), "userName", "hXsByefZqZ");
        setBooleanField(term24335, term24335.getClass(), "isLogin", false);
        setField(term24335, term24335.getClass(), "lastGameId", "PfWKdFFgbz");
        setField(term24335, term24335.getClass(), "lastDataVersion", "rgmFLfFmTW");
        setField(term24335, term24335.getClass(), "lastRomVersion", "GHvFvelXFv");
        setField(term24335, term24335.getClass(), "lastLoginDate", "MIDoqNmCoh");
        setField(term24335, term24335.getClass(), "lastPlayDate", "yrOIMfdQSI");
        setIntField(term24335, term24335.getClass(), "playerRating", -1186533450);
        setIntField(term24335, term24335.getClass(), "nameplateId", 1385418235);
        setIntField(term24335, term24335.getClass(), "iconId", 928651112);
        setIntField(term24335, term24335.getClass(), "trophyId", -970446181);
        setIntField(term24335, term24335.getClass(), "partnerId", 484689354);
        setIntField(term24335, term24335.getClass(), "frameId", 1836490268);
        setIntField(term24335, term24335.getClass(), "dispRate", 388735696);
        setIntField(term24335, term24335.getClass(), "totalAwake", 105946838);
        setIntField(term24335, term24335.getClass(), "isNetMember", -2076570725);
        setField(term24335, term24335.getClass(), "dailyBonusDate", "PhtNZAacut");
        setIntField(term24335, term24335.getClass(), "headPhoneVolume", -976659428);
        setBooleanField(term24335, term24335.getClass(), "isInherit", true);
        setIntField(term24335, term24335.getClass(), "banState", 974582816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term24335, args);
    }

};


