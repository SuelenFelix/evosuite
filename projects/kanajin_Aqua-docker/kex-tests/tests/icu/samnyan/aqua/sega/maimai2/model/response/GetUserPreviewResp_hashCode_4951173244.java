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

public class GetUserPreviewResp_hashCode_4951173244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31279;

    public GetUserPreviewResp_hashCode_4951173244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31279 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term31279, term31279.getClass(), "userId", -5251321271779688724L);
        setField(term31279, term31279.getClass(), "userName", "DNeKwjPiYD");
        setBooleanField(term31279, term31279.getClass(), "isLogin", true);
        setField(term31279, term31279.getClass(), "lastGameId", "jxryzEuKJL");
        setField(term31279, term31279.getClass(), "lastDataVersion", "EPCordSkfF");
        setField(term31279, term31279.getClass(), "lastRomVersion", "TdSezgsZkW");
        setField(term31279, term31279.getClass(), "lastLoginDate", "aJlxWEbXVP");
        setField(term31279, term31279.getClass(), "lastPlayDate", "pxpYGruvWy");
        setIntField(term31279, term31279.getClass(), "playerRating", 832068739);
        setIntField(term31279, term31279.getClass(), "nameplateId", -1109536397);
        setIntField(term31279, term31279.getClass(), "iconId", -356798505);
        setIntField(term31279, term31279.getClass(), "trophyId", 1298263326);
        setIntField(term31279, term31279.getClass(), "partnerId", 1534262946);
        setIntField(term31279, term31279.getClass(), "frameId", -732512836);
        setIntField(term31279, term31279.getClass(), "dispRate", -583097103);
        setIntField(term31279, term31279.getClass(), "totalAwake", 390772759);
        setIntField(term31279, term31279.getClass(), "isNetMember", 121280572);
        setField(term31279, term31279.getClass(), "dailyBonusDate", "BMskFMPoeb");
        setIntField(term31279, term31279.getClass(), "headPhoneVolume", 683645623);
        setBooleanField(term31279, term31279.getClass(), "isInherit", true);
        setIntField(term31279, term31279.getClass(), "banState", -1807588897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term31279, args);
    }

};


