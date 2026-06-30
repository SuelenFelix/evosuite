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
import java.lang.Long;

public class GetUserPreviewResp_setPlayerRating_150959524630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7330;
     Object term7380;

    public GetUserPreviewResp_setPlayerRating_150959524630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7330 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term7330, term7330.getClass(), "userId", 8202413349907503373L);
        setBooleanField(term7330, term7330.getClass(), "isLogin", true);
        setField(term7330, term7330.getClass(), "lastLoginDate", "qGkNzZAeDN");
        setField(term7330, term7330.getClass(), "userName", "");
        setIntField(term7330, term7330.getClass(), "reincarnationNum", -1672904007);
        setIntField(term7330, term7330.getClass(), "level", -217232010);
        setLongField(term7330, term7330.getClass(), "exp", 4715419421865334491L);
        setLongField(term7330, term7330.getClass(), "playerRating", 6320559761926095887L);
        setField(term7330, term7330.getClass(), "lastGameId", "");
        setField(term7330, term7330.getClass(), "lastRomVersion", "");
        setField(term7330, term7330.getClass(), "lastDataVersion", "");
        setField(term7330, term7330.getClass(), "lastPlayDate", "wdtiuPgTVJ");
        setIntField(term7330, term7330.getClass(), "nameplateId", 2053372601);
        setIntField(term7330, term7330.getClass(), "trophyId", -1828855069);
        setIntField(term7330, term7330.getClass(), "cardId", -1213694931);
        setIntField(term7330, term7330.getClass(), "dispPlayerLv", -1255656944);
        setIntField(term7330, term7330.getClass(), "dispRating", -377697034);
        setIntField(term7330, term7330.getClass(), "dispBP", 1102778743);
        setIntField(term7330, term7330.getClass(), "headphone", 1300928519);
        setIntField(term7330, term7330.getClass(), "banStatus", 338172676);
        setBooleanField(term7330, term7330.getClass(), "isWarningConfirmed", false);
        setIntField(term7330, term7330.getClass(), "lastEmoneyBrand", -1896960942);
        setIntField(term7330, term7330.getClass(), "lastEmoneyCredit", -935912608);
        term7380 = new Long(5067793047038594982L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term7380;
        callMethod(klass, "setPlayerRating", argTypes, term7330, args);
    }

};


