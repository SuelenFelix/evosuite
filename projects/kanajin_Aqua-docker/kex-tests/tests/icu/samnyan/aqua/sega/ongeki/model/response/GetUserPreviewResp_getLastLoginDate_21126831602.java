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

public class GetUserPreviewResp_getLastLoginDate_21126831602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5316;

    public GetUserPreviewResp_getLastLoginDate_21126831602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5316 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term5316, term5316.getClass(), "userId", -8121348431673567857L);
        setBooleanField(term5316, term5316.getClass(), "isLogin", true);
        setField(term5316, term5316.getClass(), "lastLoginDate", "mrqGHotaef");
        setField(term5316, term5316.getClass(), "userName", "");
        setIntField(term5316, term5316.getClass(), "reincarnationNum", 1445291866);
        setIntField(term5316, term5316.getClass(), "level", -139927812);
        setLongField(term5316, term5316.getClass(), "exp", 7594342965038171122L);
        setLongField(term5316, term5316.getClass(), "playerRating", -4475453924678388077L);
        setField(term5316, term5316.getClass(), "lastGameId", "");
        setField(term5316, term5316.getClass(), "lastRomVersion", "");
        setField(term5316, term5316.getClass(), "lastDataVersion", "");
        setField(term5316, term5316.getClass(), "lastPlayDate", "UbZGBpQZQW");
        setIntField(term5316, term5316.getClass(), "nameplateId", -2065157320);
        setIntField(term5316, term5316.getClass(), "trophyId", 1782011477);
        setIntField(term5316, term5316.getClass(), "cardId", 2129957018);
        setIntField(term5316, term5316.getClass(), "dispPlayerLv", 691663312);
        setIntField(term5316, term5316.getClass(), "dispRating", -1236696275);
        setIntField(term5316, term5316.getClass(), "dispBP", 575249858);
        setIntField(term5316, term5316.getClass(), "headphone", -297957951);
        setIntField(term5316, term5316.getClass(), "banStatus", -1816920588);
        setBooleanField(term5316, term5316.getClass(), "isWarningConfirmed", true);
        setIntField(term5316, term5316.getClass(), "lastEmoneyBrand", 1674165862);
        setIntField(term5316, term5316.getClass(), "lastEmoneyCredit", 1875252647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastLoginDate", argTypes, term5316, args);
    }

};


