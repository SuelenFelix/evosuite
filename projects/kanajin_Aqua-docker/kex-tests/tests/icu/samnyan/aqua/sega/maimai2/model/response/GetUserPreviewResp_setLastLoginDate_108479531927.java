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

public class GetUserPreviewResp_setLastLoginDate_108479531927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28314;

    public GetUserPreviewResp_setLastLoginDate_108479531927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28314 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term28314, term28314.getClass(), "userId", 8749770092315515620L);
        setField(term28314, term28314.getClass(), "userName", "UDKBkeWilS");
        setBooleanField(term28314, term28314.getClass(), "isLogin", false);
        setField(term28314, term28314.getClass(), "lastGameId", "bNeNAYRdqb");
        setField(term28314, term28314.getClass(), "lastDataVersion", "dcGBEVfYLI");
        setField(term28314, term28314.getClass(), "lastRomVersion", "AbYQkbUCWK");
        setField(term28314, term28314.getClass(), "lastLoginDate", "PjENVjWdrp");
        setField(term28314, term28314.getClass(), "lastPlayDate", "nNjXJbBqnD");
        setIntField(term28314, term28314.getClass(), "playerRating", 1625194278);
        setIntField(term28314, term28314.getClass(), "nameplateId", 55518559);
        setIntField(term28314, term28314.getClass(), "iconId", 1862584249);
        setIntField(term28314, term28314.getClass(), "trophyId", -1127199664);
        setIntField(term28314, term28314.getClass(), "partnerId", 1977439964);
        setIntField(term28314, term28314.getClass(), "frameId", 1379432675);
        setIntField(term28314, term28314.getClass(), "dispRate", -1018695351);
        setIntField(term28314, term28314.getClass(), "totalAwake", 1080095535);
        setIntField(term28314, term28314.getClass(), "isNetMember", 750963355);
        setField(term28314, term28314.getClass(), "dailyBonusDate", "IPIWZFytSS");
        setIntField(term28314, term28314.getClass(), "headPhoneVolume", -1939304192);
        setBooleanField(term28314, term28314.getClass(), "isInherit", true);
        setIntField(term28314, term28314.getClass(), "banState", 2062007036);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BOKRfsJbBj";
        callMethod(klass, "setLastLoginDate", argTypes, term28314, args);
    }

};


