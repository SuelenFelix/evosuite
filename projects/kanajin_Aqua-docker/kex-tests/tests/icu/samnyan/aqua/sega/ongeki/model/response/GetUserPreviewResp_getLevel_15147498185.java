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

public class GetUserPreviewResp_getLevel_15147498185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5526;

    public GetUserPreviewResp_getLevel_15147498185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5526 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term5526, term5526.getClass(), "userId", 987797117310260031L);
        setBooleanField(term5526, term5526.getClass(), "isLogin", true);
        setField(term5526, term5526.getClass(), "lastLoginDate", "VNdDwXMYxR");
        setField(term5526, term5526.getClass(), "userName", "");
        setIntField(term5526, term5526.getClass(), "reincarnationNum", -2108979704);
        setIntField(term5526, term5526.getClass(), "level", 1629835601);
        setLongField(term5526, term5526.getClass(), "exp", -4703513086610650698L);
        setLongField(term5526, term5526.getClass(), "playerRating", -8123300791906968552L);
        setField(term5526, term5526.getClass(), "lastGameId", "");
        setField(term5526, term5526.getClass(), "lastRomVersion", "");
        setField(term5526, term5526.getClass(), "lastDataVersion", "");
        setField(term5526, term5526.getClass(), "lastPlayDate", "bVbexZPmwW");
        setIntField(term5526, term5526.getClass(), "nameplateId", 1866184476);
        setIntField(term5526, term5526.getClass(), "trophyId", -17998574);
        setIntField(term5526, term5526.getClass(), "cardId", 145080354);
        setIntField(term5526, term5526.getClass(), "dispPlayerLv", -2087321012);
        setIntField(term5526, term5526.getClass(), "dispRating", -1613074612);
        setIntField(term5526, term5526.getClass(), "dispBP", 1054908502);
        setIntField(term5526, term5526.getClass(), "headphone", -1226802566);
        setIntField(term5526, term5526.getClass(), "banStatus", 1162813858);
        setBooleanField(term5526, term5526.getClass(), "isWarningConfirmed", true);
        setIntField(term5526, term5526.getClass(), "lastEmoneyBrand", 494596414);
        setIntField(term5526, term5526.getClass(), "lastEmoneyCredit", 1226377461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term5526, args);
    }

};


