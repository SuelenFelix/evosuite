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

public class GetUserPreviewResp_getHeadphone_117660440018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6436;

    public GetUserPreviewResp_getHeadphone_117660440018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6436 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term6436, term6436.getClass(), "userId", 2014229530618878786L);
        setBooleanField(term6436, term6436.getClass(), "isLogin", true);
        setField(term6436, term6436.getClass(), "lastLoginDate", "PSOttyUeqv");
        setField(term6436, term6436.getClass(), "userName", "");
        setIntField(term6436, term6436.getClass(), "reincarnationNum", -1835617743);
        setIntField(term6436, term6436.getClass(), "level", -337695922);
        setLongField(term6436, term6436.getClass(), "exp", -3684549603148553700L);
        setLongField(term6436, term6436.getClass(), "playerRating", 4665980239039735158L);
        setField(term6436, term6436.getClass(), "lastGameId", "");
        setField(term6436, term6436.getClass(), "lastRomVersion", "");
        setField(term6436, term6436.getClass(), "lastDataVersion", "");
        setField(term6436, term6436.getClass(), "lastPlayDate", "HmEvTlmzXo");
        setIntField(term6436, term6436.getClass(), "nameplateId", 817836900);
        setIntField(term6436, term6436.getClass(), "trophyId", 1691654567);
        setIntField(term6436, term6436.getClass(), "cardId", -1604942135);
        setIntField(term6436, term6436.getClass(), "dispPlayerLv", 2000275611);
        setIntField(term6436, term6436.getClass(), "dispRating", 2060369122);
        setIntField(term6436, term6436.getClass(), "dispBP", -1275204506);
        setIntField(term6436, term6436.getClass(), "headphone", 507439888);
        setIntField(term6436, term6436.getClass(), "banStatus", 1936798149);
        setBooleanField(term6436, term6436.getClass(), "isWarningConfirmed", false);
        setIntField(term6436, term6436.getClass(), "lastEmoneyBrand", 188304401);
        setIntField(term6436, term6436.getClass(), "lastEmoneyCredit", -40613160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeadphone", argTypes, term6436, args);
    }

};


