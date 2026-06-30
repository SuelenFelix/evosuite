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

public class GetUserPreviewResp_getPlayerRating_6194803658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25011;

    public GetUserPreviewResp_getPlayerRating_6194803658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25011 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term25011, term25011.getClass(), "userId", -6352136697288518051L);
        setField(term25011, term25011.getClass(), "userName", "CBnamgJrJS");
        setBooleanField(term25011, term25011.getClass(), "isLogin", false);
        setField(term25011, term25011.getClass(), "lastGameId", "uJhRRqAnDP");
        setField(term25011, term25011.getClass(), "lastDataVersion", "hJCqADrhuV");
        setField(term25011, term25011.getClass(), "lastRomVersion", "RyPUBlRpNZ");
        setField(term25011, term25011.getClass(), "lastLoginDate", "ardfVpCueq");
        setField(term25011, term25011.getClass(), "lastPlayDate", "wEYAmGJIEF");
        setIntField(term25011, term25011.getClass(), "playerRating", 1344518129);
        setIntField(term25011, term25011.getClass(), "nameplateId", -1534477902);
        setIntField(term25011, term25011.getClass(), "iconId", -1969746416);
        setIntField(term25011, term25011.getClass(), "trophyId", -1506731850);
        setIntField(term25011, term25011.getClass(), "partnerId", 19036895);
        setIntField(term25011, term25011.getClass(), "frameId", 848352999);
        setIntField(term25011, term25011.getClass(), "dispRate", 1414809033);
        setIntField(term25011, term25011.getClass(), "totalAwake", 234055254);
        setIntField(term25011, term25011.getClass(), "isNetMember", 977791910);
        setField(term25011, term25011.getClass(), "dailyBonusDate", "iXEhfXJomO");
        setIntField(term25011, term25011.getClass(), "headPhoneVolume", 1763791756);
        setBooleanField(term25011, term25011.getClass(), "isInherit", false);
        setIntField(term25011, term25011.getClass(), "banState", 1902011317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term25011, args);
    }

};


