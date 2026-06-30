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

public class GetUserPreviewResp_toString_136539149749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8774;

    public GetUserPreviewResp_toString_136539149749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8774 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term8774, term8774.getClass(), "userId", -6246278604466261475L);
        setBooleanField(term8774, term8774.getClass(), "isLogin", true);
        setField(term8774, term8774.getClass(), "lastLoginDate", "pOuFRlHmbK");
        setField(term8774, term8774.getClass(), "userName", "");
        setIntField(term8774, term8774.getClass(), "reincarnationNum", 266716659);
        setIntField(term8774, term8774.getClass(), "level", 1249390809);
        setLongField(term8774, term8774.getClass(), "exp", 9113614356317836741L);
        setLongField(term8774, term8774.getClass(), "playerRating", 2244124922001093690L);
        setField(term8774, term8774.getClass(), "lastGameId", "");
        setField(term8774, term8774.getClass(), "lastRomVersion", "");
        setField(term8774, term8774.getClass(), "lastDataVersion", "");
        setField(term8774, term8774.getClass(), "lastPlayDate", "WrzdBkinqV");
        setIntField(term8774, term8774.getClass(), "nameplateId", -1069437097);
        setIntField(term8774, term8774.getClass(), "trophyId", 215016257);
        setIntField(term8774, term8774.getClass(), "cardId", -1967315273);
        setIntField(term8774, term8774.getClass(), "dispPlayerLv", -1848110874);
        setIntField(term8774, term8774.getClass(), "dispRating", -1988070462);
        setIntField(term8774, term8774.getClass(), "dispBP", 323423569);
        setIntField(term8774, term8774.getClass(), "headphone", -274269573);
        setIntField(term8774, term8774.getClass(), "banStatus", 1395520168);
        setBooleanField(term8774, term8774.getClass(), "isWarningConfirmed", true);
        setIntField(term8774, term8774.getClass(), "lastEmoneyBrand", -524708742);
        setIntField(term8774, term8774.getClass(), "lastEmoneyCredit", -349448118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8774, args);
    }

};


