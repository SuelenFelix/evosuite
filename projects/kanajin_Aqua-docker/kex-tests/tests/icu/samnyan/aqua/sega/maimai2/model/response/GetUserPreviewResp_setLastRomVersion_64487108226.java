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

public class GetUserPreviewResp_setLastRomVersion_64487108226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28123;

    public GetUserPreviewResp_setLastRomVersion_64487108226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28123 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term28123, term28123.getClass(), "userId", 5390474329543871819L);
        setField(term28123, term28123.getClass(), "userName", "fmWYICGnwt");
        setBooleanField(term28123, term28123.getClass(), "isLogin", true);
        setField(term28123, term28123.getClass(), "lastGameId", "FlZbOFNISk");
        setField(term28123, term28123.getClass(), "lastDataVersion", "zDtePZrZQH");
        setField(term28123, term28123.getClass(), "lastRomVersion", "YPVZjrbvVl");
        setField(term28123, term28123.getClass(), "lastLoginDate", "TWsXTUTREq");
        setField(term28123, term28123.getClass(), "lastPlayDate", "tVsPWASlsh");
        setIntField(term28123, term28123.getClass(), "playerRating", 333219682);
        setIntField(term28123, term28123.getClass(), "nameplateId", -1691293662);
        setIntField(term28123, term28123.getClass(), "iconId", 347540813);
        setIntField(term28123, term28123.getClass(), "trophyId", -897042657);
        setIntField(term28123, term28123.getClass(), "partnerId", 1519205600);
        setIntField(term28123, term28123.getClass(), "frameId", 631662709);
        setIntField(term28123, term28123.getClass(), "dispRate", 580524853);
        setIntField(term28123, term28123.getClass(), "totalAwake", -1436225528);
        setIntField(term28123, term28123.getClass(), "isNetMember", -1249891722);
        setField(term28123, term28123.getClass(), "dailyBonusDate", "PjZoebHrvq");
        setIntField(term28123, term28123.getClass(), "headPhoneVolume", -402850097);
        setBooleanField(term28123, term28123.getClass(), "isInherit", false);
        setIntField(term28123, term28123.getClass(), "banState", 1012166312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VwpicfUdWr";
        callMethod(klass, "setLastRomVersion", argTypes, term28123, args);
    }

};


