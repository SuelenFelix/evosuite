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

public class GetUserPreviewResp_isWarningConfirmed_42679826720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6576;

    public GetUserPreviewResp_isWarningConfirmed_42679826720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6576 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term6576, term6576.getClass(), "userId", -3988042285731673145L);
        setBooleanField(term6576, term6576.getClass(), "isLogin", true);
        setField(term6576, term6576.getClass(), "lastLoginDate", "xVFgeyYxZS");
        setField(term6576, term6576.getClass(), "userName", "");
        setIntField(term6576, term6576.getClass(), "reincarnationNum", 795205527);
        setIntField(term6576, term6576.getClass(), "level", 600958607);
        setLongField(term6576, term6576.getClass(), "exp", 1729206737148270563L);
        setLongField(term6576, term6576.getClass(), "playerRating", -932981811228171529L);
        setField(term6576, term6576.getClass(), "lastGameId", "");
        setField(term6576, term6576.getClass(), "lastRomVersion", "");
        setField(term6576, term6576.getClass(), "lastDataVersion", "");
        setField(term6576, term6576.getClass(), "lastPlayDate", "iQiGTulJiH");
        setIntField(term6576, term6576.getClass(), "nameplateId", 897159778);
        setIntField(term6576, term6576.getClass(), "trophyId", -1934934961);
        setIntField(term6576, term6576.getClass(), "cardId", 2120054887);
        setIntField(term6576, term6576.getClass(), "dispPlayerLv", 2145648967);
        setIntField(term6576, term6576.getClass(), "dispRating", 2060624021);
        setIntField(term6576, term6576.getClass(), "dispBP", -1853309523);
        setIntField(term6576, term6576.getClass(), "headphone", 241741655);
        setIntField(term6576, term6576.getClass(), "banStatus", -1062022366);
        setBooleanField(term6576, term6576.getClass(), "isWarningConfirmed", false);
        setIntField(term6576, term6576.getClass(), "lastEmoneyBrand", -1347618079);
        setIntField(term6576, term6576.getClass(), "lastEmoneyCredit", 1510246255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isWarningConfirmed", argTypes, term6576, args);
    }

};


