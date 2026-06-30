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

public class GetUserPreviewResp_getIsNetMember_94619611216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26363;

    public GetUserPreviewResp_getIsNetMember_94619611216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26363 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term26363, term26363.getClass(), "userId", -1624594002510583135L);
        setField(term26363, term26363.getClass(), "userName", "ryuQaXtwNj");
        setBooleanField(term26363, term26363.getClass(), "isLogin", false);
        setField(term26363, term26363.getClass(), "lastGameId", "OutjKNDSgR");
        setField(term26363, term26363.getClass(), "lastDataVersion", "brfLLGXcwA");
        setField(term26363, term26363.getClass(), "lastRomVersion", "zoVKwYYMOI");
        setField(term26363, term26363.getClass(), "lastLoginDate", "DGCeQsmIOU");
        setField(term26363, term26363.getClass(), "lastPlayDate", "otcpSHwkzG");
        setIntField(term26363, term26363.getClass(), "playerRating", 1763430532);
        setIntField(term26363, term26363.getClass(), "nameplateId", -923019123);
        setIntField(term26363, term26363.getClass(), "iconId", 1425210363);
        setIntField(term26363, term26363.getClass(), "trophyId", 656143415);
        setIntField(term26363, term26363.getClass(), "partnerId", 1654162366);
        setIntField(term26363, term26363.getClass(), "frameId", 1659672136);
        setIntField(term26363, term26363.getClass(), "dispRate", 1379028862);
        setIntField(term26363, term26363.getClass(), "totalAwake", 1923849673);
        setIntField(term26363, term26363.getClass(), "isNetMember", 783108536);
        setField(term26363, term26363.getClass(), "dailyBonusDate", "BixZhUjVme");
        setIntField(term26363, term26363.getClass(), "headPhoneVolume", 1305284548);
        setBooleanField(term26363, term26363.getClass(), "isInherit", false);
        setIntField(term26363, term26363.getClass(), "banState", -567549105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsNetMember", argTypes, term26363, args);
    }

};


