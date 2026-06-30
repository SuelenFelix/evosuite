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

public class GetUserPreviewResp_getTrophyId_207185703011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25518;

    public GetUserPreviewResp_getTrophyId_207185703011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25518 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term25518, term25518.getClass(), "userId", 410377497345443793L);
        setField(term25518, term25518.getClass(), "userName", "lvcTLkVhAN");
        setBooleanField(term25518, term25518.getClass(), "isLogin", false);
        setField(term25518, term25518.getClass(), "lastGameId", "BJJuVqxXjT");
        setField(term25518, term25518.getClass(), "lastDataVersion", "IvxbsFCczM");
        setField(term25518, term25518.getClass(), "lastRomVersion", "GkAaLUoaoL");
        setField(term25518, term25518.getClass(), "lastLoginDate", "VSmPzUiFzd");
        setField(term25518, term25518.getClass(), "lastPlayDate", "bLpZNCaWDB");
        setIntField(term25518, term25518.getClass(), "playerRating", 917364076);
        setIntField(term25518, term25518.getClass(), "nameplateId", 727152467);
        setIntField(term25518, term25518.getClass(), "iconId", -138608321);
        setIntField(term25518, term25518.getClass(), "trophyId", 2095812393);
        setIntField(term25518, term25518.getClass(), "partnerId", 1431497505);
        setIntField(term25518, term25518.getClass(), "frameId", -135681605);
        setIntField(term25518, term25518.getClass(), "dispRate", -881873928);
        setIntField(term25518, term25518.getClass(), "totalAwake", 813195927);
        setIntField(term25518, term25518.getClass(), "isNetMember", 837178544);
        setField(term25518, term25518.getClass(), "dailyBonusDate", "knmwCEeMTY");
        setIntField(term25518, term25518.getClass(), "headPhoneVolume", 933005179);
        setBooleanField(term25518, term25518.getClass(), "isInherit", false);
        setIntField(term25518, term25518.getClass(), "banState", -1371488618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrophyId", argTypes, term25518, args);
    }

};


