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

public class GetUserPreviewResp_isLogin_14361381671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5246;

    public GetUserPreviewResp_isLogin_14361381671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5246 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term5246, term5246.getClass(), "userId", 2823262561274956150L);
        setBooleanField(term5246, term5246.getClass(), "isLogin", false);
        setField(term5246, term5246.getClass(), "lastLoginDate", "ANHjlWPmZG");
        setField(term5246, term5246.getClass(), "userName", "");
        setIntField(term5246, term5246.getClass(), "reincarnationNum", -1322797287);
        setIntField(term5246, term5246.getClass(), "level", -615198242);
        setLongField(term5246, term5246.getClass(), "exp", 8039153062846287600L);
        setLongField(term5246, term5246.getClass(), "playerRating", -7087265016767824631L);
        setField(term5246, term5246.getClass(), "lastGameId", "");
        setField(term5246, term5246.getClass(), "lastRomVersion", "");
        setField(term5246, term5246.getClass(), "lastDataVersion", "");
        setField(term5246, term5246.getClass(), "lastPlayDate", "SibzENsyyy");
        setIntField(term5246, term5246.getClass(), "nameplateId", -491132382);
        setIntField(term5246, term5246.getClass(), "trophyId", 918882916);
        setIntField(term5246, term5246.getClass(), "cardId", 1544012770);
        setIntField(term5246, term5246.getClass(), "dispPlayerLv", 1922068039);
        setIntField(term5246, term5246.getClass(), "dispRating", -410564443);
        setIntField(term5246, term5246.getClass(), "dispBP", 996017434);
        setIntField(term5246, term5246.getClass(), "headphone", -983870300);
        setIntField(term5246, term5246.getClass(), "banStatus", 360715062);
        setBooleanField(term5246, term5246.getClass(), "isWarningConfirmed", false);
        setIntField(term5246, term5246.getClass(), "lastEmoneyBrand", 1047409266);
        setIntField(term5246, term5246.getClass(), "lastEmoneyCredit", 1427248961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLogin", argTypes, term5246, args);
    }

};


