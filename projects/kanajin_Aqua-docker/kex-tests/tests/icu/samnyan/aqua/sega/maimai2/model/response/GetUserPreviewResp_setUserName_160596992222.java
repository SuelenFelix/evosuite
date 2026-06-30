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

public class GetUserPreviewResp_setUserName_160596992222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27379;

    public GetUserPreviewResp_setUserName_160596992222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27379 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term27379, term27379.getClass(), "userId", -4515956536909746513L);
        setField(term27379, term27379.getClass(), "userName", "PxscjEhxGk");
        setBooleanField(term27379, term27379.getClass(), "isLogin", true);
        setField(term27379, term27379.getClass(), "lastGameId", "ePFnljQSHU");
        setField(term27379, term27379.getClass(), "lastDataVersion", "wedLWAuOOY");
        setField(term27379, term27379.getClass(), "lastRomVersion", "oZDNpnQlCv");
        setField(term27379, term27379.getClass(), "lastLoginDate", "NdPeQAHWKN");
        setField(term27379, term27379.getClass(), "lastPlayDate", "giGQTpcQuV");
        setIntField(term27379, term27379.getClass(), "playerRating", 1875904227);
        setIntField(term27379, term27379.getClass(), "nameplateId", -273652787);
        setIntField(term27379, term27379.getClass(), "iconId", -20800272);
        setIntField(term27379, term27379.getClass(), "trophyId", -2012090266);
        setIntField(term27379, term27379.getClass(), "partnerId", 1298920245);
        setIntField(term27379, term27379.getClass(), "frameId", 1539128914);
        setIntField(term27379, term27379.getClass(), "dispRate", 627813167);
        setIntField(term27379, term27379.getClass(), "totalAwake", -2047312469);
        setIntField(term27379, term27379.getClass(), "isNetMember", 38231753);
        setField(term27379, term27379.getClass(), "dailyBonusDate", "IWCccrYFQd");
        setIntField(term27379, term27379.getClass(), "headPhoneVolume", 1404509429);
        setBooleanField(term27379, term27379.getClass(), "isInherit", true);
        setIntField(term27379, term27379.getClass(), "banState", -438218058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zpkdYKWkCa";
        callMethod(klass, "setUserName", argTypes, term27379, args);
    }

};


