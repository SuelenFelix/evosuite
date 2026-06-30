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

public class GetUserPreviewResp_getLastDataVersion_52115462510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5876;

    public GetUserPreviewResp_getLastDataVersion_52115462510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5876 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term5876, term5876.getClass(), "userId", -7163612258041042650L);
        setBooleanField(term5876, term5876.getClass(), "isLogin", false);
        setField(term5876, term5876.getClass(), "lastLoginDate", "aJQuCOCvZs");
        setField(term5876, term5876.getClass(), "userName", "");
        setIntField(term5876, term5876.getClass(), "reincarnationNum", -985577036);
        setIntField(term5876, term5876.getClass(), "level", 802539130);
        setLongField(term5876, term5876.getClass(), "exp", -7186158121023817313L);
        setLongField(term5876, term5876.getClass(), "playerRating", -8510452367371037137L);
        setField(term5876, term5876.getClass(), "lastGameId", "");
        setField(term5876, term5876.getClass(), "lastRomVersion", "");
        setField(term5876, term5876.getClass(), "lastDataVersion", "");
        setField(term5876, term5876.getClass(), "lastPlayDate", "lHYNCJRiOv");
        setIntField(term5876, term5876.getClass(), "nameplateId", 2105146188);
        setIntField(term5876, term5876.getClass(), "trophyId", -862415480);
        setIntField(term5876, term5876.getClass(), "cardId", 312605349);
        setIntField(term5876, term5876.getClass(), "dispPlayerLv", -402072606);
        setIntField(term5876, term5876.getClass(), "dispRating", -477355193);
        setIntField(term5876, term5876.getClass(), "dispBP", 168425089);
        setIntField(term5876, term5876.getClass(), "headphone", -571931590);
        setIntField(term5876, term5876.getClass(), "banStatus", 37757400);
        setBooleanField(term5876, term5876.getClass(), "isWarningConfirmed", false);
        setIntField(term5876, term5876.getClass(), "lastEmoneyBrand", -1632221612);
        setIntField(term5876, term5876.getClass(), "lastEmoneyCredit", 1545314376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term5876, args);
    }

};


