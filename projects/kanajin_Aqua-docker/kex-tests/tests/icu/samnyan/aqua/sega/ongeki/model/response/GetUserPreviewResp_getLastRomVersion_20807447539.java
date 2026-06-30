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

public class GetUserPreviewResp_getLastRomVersion_20807447539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5806;

    public GetUserPreviewResp_getLastRomVersion_20807447539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5806 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term5806, term5806.getClass(), "userId", 4911393165710268247L);
        setBooleanField(term5806, term5806.getClass(), "isLogin", true);
        setField(term5806, term5806.getClass(), "lastLoginDate", "pqFUMTCKJd");
        setField(term5806, term5806.getClass(), "userName", "");
        setIntField(term5806, term5806.getClass(), "reincarnationNum", -1642688455);
        setIntField(term5806, term5806.getClass(), "level", -1184558215);
        setLongField(term5806, term5806.getClass(), "exp", -836309941570511418L);
        setLongField(term5806, term5806.getClass(), "playerRating", -4851193391918639512L);
        setField(term5806, term5806.getClass(), "lastGameId", "");
        setField(term5806, term5806.getClass(), "lastRomVersion", "");
        setField(term5806, term5806.getClass(), "lastDataVersion", "");
        setField(term5806, term5806.getClass(), "lastPlayDate", "PTEndmPMzk");
        setIntField(term5806, term5806.getClass(), "nameplateId", 2123688338);
        setIntField(term5806, term5806.getClass(), "trophyId", -1051941387);
        setIntField(term5806, term5806.getClass(), "cardId", -640763660);
        setIntField(term5806, term5806.getClass(), "dispPlayerLv", -1189468129);
        setIntField(term5806, term5806.getClass(), "dispRating", -1099664830);
        setIntField(term5806, term5806.getClass(), "dispBP", 873502011);
        setIntField(term5806, term5806.getClass(), "headphone", -2004575734);
        setIntField(term5806, term5806.getClass(), "banStatus", 1491468856);
        setBooleanField(term5806, term5806.getClass(), "isWarningConfirmed", true);
        setIntField(term5806, term5806.getClass(), "lastEmoneyBrand", 962385185);
        setIntField(term5806, term5806.getClass(), "lastEmoneyCredit", 2146718886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRomVersion", argTypes, term5806, args);
    }

};


