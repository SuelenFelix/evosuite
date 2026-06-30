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

public class GetUserPreviewResp_getUserName_7239845213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5386;

    public GetUserPreviewResp_getUserName_7239845213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5386 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term5386, term5386.getClass(), "userId", 3831842879355381917L);
        setBooleanField(term5386, term5386.getClass(), "isLogin", false);
        setField(term5386, term5386.getClass(), "lastLoginDate", "SvGTualQPa");
        setField(term5386, term5386.getClass(), "userName", "");
        setIntField(term5386, term5386.getClass(), "reincarnationNum", -1298688401);
        setIntField(term5386, term5386.getClass(), "level", 1907832341);
        setLongField(term5386, term5386.getClass(), "exp", -2196447813514870436L);
        setLongField(term5386, term5386.getClass(), "playerRating", 2984955721798941743L);
        setField(term5386, term5386.getClass(), "lastGameId", "");
        setField(term5386, term5386.getClass(), "lastRomVersion", "");
        setField(term5386, term5386.getClass(), "lastDataVersion", "");
        setField(term5386, term5386.getClass(), "lastPlayDate", "mdxcgZwsaP");
        setIntField(term5386, term5386.getClass(), "nameplateId", 932199784);
        setIntField(term5386, term5386.getClass(), "trophyId", 1953620444);
        setIntField(term5386, term5386.getClass(), "cardId", -1111307978);
        setIntField(term5386, term5386.getClass(), "dispPlayerLv", 609697271);
        setIntField(term5386, term5386.getClass(), "dispRating", 1121247998);
        setIntField(term5386, term5386.getClass(), "dispBP", -710001354);
        setIntField(term5386, term5386.getClass(), "headphone", 2007404429);
        setIntField(term5386, term5386.getClass(), "banStatus", 472580433);
        setBooleanField(term5386, term5386.getClass(), "isWarningConfirmed", true);
        setIntField(term5386, term5386.getClass(), "lastEmoneyBrand", 1189049164);
        setIntField(term5386, term5386.getClass(), "lastEmoneyCredit", -673413879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term5386, args);
    }

};


