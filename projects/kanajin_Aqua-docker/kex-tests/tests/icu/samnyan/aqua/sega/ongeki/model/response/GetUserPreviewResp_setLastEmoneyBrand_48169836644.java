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
import java.lang.Integer;

public class GetUserPreviewResp_setLastEmoneyBrand_48169836644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8418;
     Object term8468;

    public GetUserPreviewResp_setLastEmoneyBrand_48169836644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8418 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term8418, term8418.getClass(), "userId", -6344058468200613078L);
        setBooleanField(term8418, term8418.getClass(), "isLogin", true);
        setField(term8418, term8418.getClass(), "lastLoginDate", "MGorMVGauT");
        setField(term8418, term8418.getClass(), "userName", "");
        setIntField(term8418, term8418.getClass(), "reincarnationNum", -1683274691);
        setIntField(term8418, term8418.getClass(), "level", -935900044);
        setLongField(term8418, term8418.getClass(), "exp", 9069301103965727560L);
        setLongField(term8418, term8418.getClass(), "playerRating", 1078204819466025938L);
        setField(term8418, term8418.getClass(), "lastGameId", "");
        setField(term8418, term8418.getClass(), "lastRomVersion", "");
        setField(term8418, term8418.getClass(), "lastDataVersion", "");
        setField(term8418, term8418.getClass(), "lastPlayDate", "jXKxUGTuEF");
        setIntField(term8418, term8418.getClass(), "nameplateId", 1747876558);
        setIntField(term8418, term8418.getClass(), "trophyId", 833477776);
        setIntField(term8418, term8418.getClass(), "cardId", 2043960707);
        setIntField(term8418, term8418.getClass(), "dispPlayerLv", 272179554);
        setIntField(term8418, term8418.getClass(), "dispRating", 1717711536);
        setIntField(term8418, term8418.getClass(), "dispBP", -606339607);
        setIntField(term8418, term8418.getClass(), "headphone", 800440712);
        setIntField(term8418, term8418.getClass(), "banStatus", -1976407622);
        setBooleanField(term8418, term8418.getClass(), "isWarningConfirmed", false);
        setIntField(term8418, term8418.getClass(), "lastEmoneyBrand", -552996061);
        setIntField(term8418, term8418.getClass(), "lastEmoneyCredit", -153013117);
        term8468 = new Integer(712181359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8468;
        callMethod(klass, "setLastEmoneyBrand", argTypes, term8418, args);
    }

};


