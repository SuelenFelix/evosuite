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

public class GetUserPreviewResp_getDispPlayerLv_31360000515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6226;

    public GetUserPreviewResp_getDispPlayerLv_31360000515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6226 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term6226, term6226.getClass(), "userId", -5133307284441518726L);
        setBooleanField(term6226, term6226.getClass(), "isLogin", false);
        setField(term6226, term6226.getClass(), "lastLoginDate", "AdYzLPMcwe");
        setField(term6226, term6226.getClass(), "userName", "");
        setIntField(term6226, term6226.getClass(), "reincarnationNum", -1176968921);
        setIntField(term6226, term6226.getClass(), "level", -1986225025);
        setLongField(term6226, term6226.getClass(), "exp", 7921404547326630089L);
        setLongField(term6226, term6226.getClass(), "playerRating", 2155219577693802424L);
        setField(term6226, term6226.getClass(), "lastGameId", "");
        setField(term6226, term6226.getClass(), "lastRomVersion", "");
        setField(term6226, term6226.getClass(), "lastDataVersion", "");
        setField(term6226, term6226.getClass(), "lastPlayDate", "FrTZLybkKk");
        setIntField(term6226, term6226.getClass(), "nameplateId", -838689952);
        setIntField(term6226, term6226.getClass(), "trophyId", -307464652);
        setIntField(term6226, term6226.getClass(), "cardId", 460605690);
        setIntField(term6226, term6226.getClass(), "dispPlayerLv", 2119231643);
        setIntField(term6226, term6226.getClass(), "dispRating", 688546450);
        setIntField(term6226, term6226.getClass(), "dispBP", 115635779);
        setIntField(term6226, term6226.getClass(), "headphone", -1081685171);
        setIntField(term6226, term6226.getClass(), "banStatus", 1511699134);
        setBooleanField(term6226, term6226.getClass(), "isWarningConfirmed", false);
        setIntField(term6226, term6226.getClass(), "lastEmoneyBrand", 185647247);
        setIntField(term6226, term6226.getClass(), "lastEmoneyCredit", 720814309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispPlayerLv", argTypes, term6226, args);
    }

};


