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

public class GetUserPreviewResp_getLastPlayDate_11827959247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24842;

    public GetUserPreviewResp_getLastPlayDate_11827959247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24842 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term24842, term24842.getClass(), "userId", 505687838503487032L);
        setField(term24842, term24842.getClass(), "userName", "JANJXHGMsv");
        setBooleanField(term24842, term24842.getClass(), "isLogin", true);
        setField(term24842, term24842.getClass(), "lastGameId", "WVQqsFGJMw");
        setField(term24842, term24842.getClass(), "lastDataVersion", "TIPSlmidwP");
        setField(term24842, term24842.getClass(), "lastRomVersion", "SRYeqWJJkR");
        setField(term24842, term24842.getClass(), "lastLoginDate", "vUVScKcyFY");
        setField(term24842, term24842.getClass(), "lastPlayDate", "DCSMbuGiaM");
        setIntField(term24842, term24842.getClass(), "playerRating", 131358254);
        setIntField(term24842, term24842.getClass(), "nameplateId", -1411314076);
        setIntField(term24842, term24842.getClass(), "iconId", -1465382016);
        setIntField(term24842, term24842.getClass(), "trophyId", 2111238518);
        setIntField(term24842, term24842.getClass(), "partnerId", -477500403);
        setIntField(term24842, term24842.getClass(), "frameId", 425471770);
        setIntField(term24842, term24842.getClass(), "dispRate", -2070314247);
        setIntField(term24842, term24842.getClass(), "totalAwake", -2128262129);
        setIntField(term24842, term24842.getClass(), "isNetMember", -1404754679);
        setField(term24842, term24842.getClass(), "dailyBonusDate", "wtOVzMPrFU");
        setIntField(term24842, term24842.getClass(), "headPhoneVolume", 995795018);
        setBooleanField(term24842, term24842.getClass(), "isInherit", true);
        setIntField(term24842, term24842.getClass(), "banState", 21168892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term24842, args);
    }

};


