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

public class GetUserPreviewResp_getIconId_118657222710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25349;

    public GetUserPreviewResp_getIconId_118657222710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25349 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term25349, term25349.getClass(), "userId", 2722397189272361522L);
        setField(term25349, term25349.getClass(), "userName", "RtHOddPkOW");
        setBooleanField(term25349, term25349.getClass(), "isLogin", true);
        setField(term25349, term25349.getClass(), "lastGameId", "LAaHVAeRPU");
        setField(term25349, term25349.getClass(), "lastDataVersion", "BLPwYfxwnm");
        setField(term25349, term25349.getClass(), "lastRomVersion", "zItHVuBBzy");
        setField(term25349, term25349.getClass(), "lastLoginDate", "pQcdIREjlp");
        setField(term25349, term25349.getClass(), "lastPlayDate", "WjUrdNMIOj");
        setIntField(term25349, term25349.getClass(), "playerRating", 274393548);
        setIntField(term25349, term25349.getClass(), "nameplateId", 2009167871);
        setIntField(term25349, term25349.getClass(), "iconId", -1001649335);
        setIntField(term25349, term25349.getClass(), "trophyId", -1983284991);
        setIntField(term25349, term25349.getClass(), "partnerId", 386592778);
        setIntField(term25349, term25349.getClass(), "frameId", 1718374650);
        setIntField(term25349, term25349.getClass(), "dispRate", -1170695156);
        setIntField(term25349, term25349.getClass(), "totalAwake", -854423228);
        setIntField(term25349, term25349.getClass(), "isNetMember", -135398430);
        setField(term25349, term25349.getClass(), "dailyBonusDate", "aQUpwHjYvS");
        setIntField(term25349, term25349.getClass(), "headPhoneVolume", 1404546541);
        setBooleanField(term25349, term25349.getClass(), "isInherit", false);
        setIntField(term25349, term25349.getClass(), "banState", 1350945157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIconId", argTypes, term25349, args);
    }

};


