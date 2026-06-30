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

public class GetUserPreviewResp_getLastPlayDate_64384353111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5946;

    public GetUserPreviewResp_getLastPlayDate_64384353111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5946 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term5946, term5946.getClass(), "userId", 2123432481270520381L);
        setBooleanField(term5946, term5946.getClass(), "isLogin", false);
        setField(term5946, term5946.getClass(), "lastLoginDate", "QVLresHoaP");
        setField(term5946, term5946.getClass(), "userName", "");
        setIntField(term5946, term5946.getClass(), "reincarnationNum", 437959151);
        setIntField(term5946, term5946.getClass(), "level", 27780241);
        setLongField(term5946, term5946.getClass(), "exp", 7205698466499430091L);
        setLongField(term5946, term5946.getClass(), "playerRating", -4868523627266698649L);
        setField(term5946, term5946.getClass(), "lastGameId", "");
        setField(term5946, term5946.getClass(), "lastRomVersion", "");
        setField(term5946, term5946.getClass(), "lastDataVersion", "");
        setField(term5946, term5946.getClass(), "lastPlayDate", "IbxeAMwLVt");
        setIntField(term5946, term5946.getClass(), "nameplateId", -683868408);
        setIntField(term5946, term5946.getClass(), "trophyId", -381130069);
        setIntField(term5946, term5946.getClass(), "cardId", 885769749);
        setIntField(term5946, term5946.getClass(), "dispPlayerLv", -1021168716);
        setIntField(term5946, term5946.getClass(), "dispRating", -1238055654);
        setIntField(term5946, term5946.getClass(), "dispBP", 1561513428);
        setIntField(term5946, term5946.getClass(), "headphone", 778959809);
        setIntField(term5946, term5946.getClass(), "banStatus", -7504064);
        setBooleanField(term5946, term5946.getClass(), "isWarningConfirmed", false);
        setIntField(term5946, term5946.getClass(), "lastEmoneyBrand", -1464364418);
        setIntField(term5946, term5946.getClass(), "lastEmoneyCredit", 1050420173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term5946, args);
    }

};


