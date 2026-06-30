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

public class GetUserPreviewResp_getHeadPhoneVolume_175068024518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26701;

    public GetUserPreviewResp_getHeadPhoneVolume_175068024518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26701 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term26701, term26701.getClass(), "userId", 5562155951994796526L);
        setField(term26701, term26701.getClass(), "userName", "eoDtSQyUsr");
        setBooleanField(term26701, term26701.getClass(), "isLogin", true);
        setField(term26701, term26701.getClass(), "lastGameId", "RMTgBohsAX");
        setField(term26701, term26701.getClass(), "lastDataVersion", "kdYeXJnJGG");
        setField(term26701, term26701.getClass(), "lastRomVersion", "XEdoshuvxD");
        setField(term26701, term26701.getClass(), "lastLoginDate", "ljtopXMcRl");
        setField(term26701, term26701.getClass(), "lastPlayDate", "HHtcAGkfuz");
        setIntField(term26701, term26701.getClass(), "playerRating", 1475471511);
        setIntField(term26701, term26701.getClass(), "nameplateId", 1061251899);
        setIntField(term26701, term26701.getClass(), "iconId", -1000926687);
        setIntField(term26701, term26701.getClass(), "trophyId", 89149779);
        setIntField(term26701, term26701.getClass(), "partnerId", 354592191);
        setIntField(term26701, term26701.getClass(), "frameId", -874460167);
        setIntField(term26701, term26701.getClass(), "dispRate", 1753994569);
        setIntField(term26701, term26701.getClass(), "totalAwake", 2131854523);
        setIntField(term26701, term26701.getClass(), "isNetMember", -2074551841);
        setField(term26701, term26701.getClass(), "dailyBonusDate", "QZCuYHcIBC");
        setIntField(term26701, term26701.getClass(), "headPhoneVolume", 1213549602);
        setBooleanField(term26701, term26701.getClass(), "isInherit", false);
        setIntField(term26701, term26701.getClass(), "banState", -1638897284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeadPhoneVolume", argTypes, term26701, args);
    }

};


