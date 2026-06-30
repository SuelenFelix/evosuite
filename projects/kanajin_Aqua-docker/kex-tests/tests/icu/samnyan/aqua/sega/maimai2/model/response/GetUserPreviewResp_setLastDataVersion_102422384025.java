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

public class GetUserPreviewResp_setLastDataVersion_102422384025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27932;

    public GetUserPreviewResp_setLastDataVersion_102422384025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27932 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term27932, term27932.getClass(), "userId", 3437816211301899263L);
        setField(term27932, term27932.getClass(), "userName", "ZwcevQDgzv");
        setBooleanField(term27932, term27932.getClass(), "isLogin", false);
        setField(term27932, term27932.getClass(), "lastGameId", "rzkENrHYBI");
        setField(term27932, term27932.getClass(), "lastDataVersion", "ylJjmNVzzt");
        setField(term27932, term27932.getClass(), "lastRomVersion", "nwKTRDmHWk");
        setField(term27932, term27932.getClass(), "lastLoginDate", "UueEixdrss");
        setField(term27932, term27932.getClass(), "lastPlayDate", "ceafBXJyBB");
        setIntField(term27932, term27932.getClass(), "playerRating", -1349596098);
        setIntField(term27932, term27932.getClass(), "nameplateId", 490711502);
        setIntField(term27932, term27932.getClass(), "iconId", -1967126524);
        setIntField(term27932, term27932.getClass(), "trophyId", -803436050);
        setIntField(term27932, term27932.getClass(), "partnerId", 1382240540);
        setIntField(term27932, term27932.getClass(), "frameId", -894941864);
        setIntField(term27932, term27932.getClass(), "dispRate", -1796952360);
        setIntField(term27932, term27932.getClass(), "totalAwake", -29580694);
        setIntField(term27932, term27932.getClass(), "isNetMember", -1774385073);
        setField(term27932, term27932.getClass(), "dailyBonusDate", "VNHIbCXqhH");
        setIntField(term27932, term27932.getClass(), "headPhoneVolume", -1095327334);
        setBooleanField(term27932, term27932.getClass(), "isInherit", true);
        setIntField(term27932, term27932.getClass(), "banState", -401456020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "csnhUIxUaP";
        callMethod(klass, "setLastDataVersion", argTypes, term27932, args);
    }

};


