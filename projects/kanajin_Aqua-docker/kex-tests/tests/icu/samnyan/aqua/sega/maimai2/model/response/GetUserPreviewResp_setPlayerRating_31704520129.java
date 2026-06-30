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
import java.lang.Integer;

public class GetUserPreviewResp_setPlayerRating_31704520129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28696;
     Object term28795;

    public GetUserPreviewResp_setPlayerRating_31704520129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28696 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term28696, term28696.getClass(), "userId", -6952791032114194905L);
        setField(term28696, term28696.getClass(), "userName", "nDzlNeexNi");
        setBooleanField(term28696, term28696.getClass(), "isLogin", false);
        setField(term28696, term28696.getClass(), "lastGameId", "XhILAYdtGS");
        setField(term28696, term28696.getClass(), "lastDataVersion", "ZRWORAfStn");
        setField(term28696, term28696.getClass(), "lastRomVersion", "loCxNBoGfW");
        setField(term28696, term28696.getClass(), "lastLoginDate", "PGVYUjJrZh");
        setField(term28696, term28696.getClass(), "lastPlayDate", "OHliEqVque");
        setIntField(term28696, term28696.getClass(), "playerRating", 947697692);
        setIntField(term28696, term28696.getClass(), "nameplateId", -372056343);
        setIntField(term28696, term28696.getClass(), "iconId", 625501454);
        setIntField(term28696, term28696.getClass(), "trophyId", -1941817273);
        setIntField(term28696, term28696.getClass(), "partnerId", -919598814);
        setIntField(term28696, term28696.getClass(), "frameId", -1521283679);
        setIntField(term28696, term28696.getClass(), "dispRate", 1502377250);
        setIntField(term28696, term28696.getClass(), "totalAwake", 1581416400);
        setIntField(term28696, term28696.getClass(), "isNetMember", 1963777573);
        setField(term28696, term28696.getClass(), "dailyBonusDate", "kQWmmbQQqu");
        setIntField(term28696, term28696.getClass(), "headPhoneVolume", -998538950);
        setBooleanField(term28696, term28696.getClass(), "isInherit", true);
        setIntField(term28696, term28696.getClass(), "banState", 1644825964);
        term28795 = new Integer(-331554346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28795;
        callMethod(klass, "setPlayerRating", argTypes, term28696, args);
    }

};


