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

public class GetUserPreviewResp_getReincarnationNum_5071972974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5456;

    public GetUserPreviewResp_getReincarnationNum_5071972974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5456 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term5456, term5456.getClass(), "userId", 7495572757420909707L);
        setBooleanField(term5456, term5456.getClass(), "isLogin", true);
        setField(term5456, term5456.getClass(), "lastLoginDate", "XildIRoZHG");
        setField(term5456, term5456.getClass(), "userName", "");
        setIntField(term5456, term5456.getClass(), "reincarnationNum", 1609778442);
        setIntField(term5456, term5456.getClass(), "level", 524850421);
        setLongField(term5456, term5456.getClass(), "exp", -1237494311441603673L);
        setLongField(term5456, term5456.getClass(), "playerRating", 3550928874058758597L);
        setField(term5456, term5456.getClass(), "lastGameId", "");
        setField(term5456, term5456.getClass(), "lastRomVersion", "");
        setField(term5456, term5456.getClass(), "lastDataVersion", "");
        setField(term5456, term5456.getClass(), "lastPlayDate", "lEcrFlxJXH");
        setIntField(term5456, term5456.getClass(), "nameplateId", -1833121756);
        setIntField(term5456, term5456.getClass(), "trophyId", -1493632787);
        setIntField(term5456, term5456.getClass(), "cardId", -1056969264);
        setIntField(term5456, term5456.getClass(), "dispPlayerLv", -709130701);
        setIntField(term5456, term5456.getClass(), "dispRating", 86144663);
        setIntField(term5456, term5456.getClass(), "dispBP", -1480903995);
        setIntField(term5456, term5456.getClass(), "headphone", -2111772603);
        setIntField(term5456, term5456.getClass(), "banStatus", 637942911);
        setBooleanField(term5456, term5456.getClass(), "isWarningConfirmed", true);
        setIntField(term5456, term5456.getClass(), "lastEmoneyBrand", -395396657);
        setIntField(term5456, term5456.getClass(), "lastEmoneyCredit", 1677171453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReincarnationNum", argTypes, term5456, args);
    }

};


