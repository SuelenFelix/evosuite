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

public class GetUserPreviewResp_getBanStatus_72437001319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6506;

    public GetUserPreviewResp_getBanStatus_72437001319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6506 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term6506, term6506.getClass(), "userId", 7429946509853918683L);
        setBooleanField(term6506, term6506.getClass(), "isLogin", true);
        setField(term6506, term6506.getClass(), "lastLoginDate", "BMMonTIZgJ");
        setField(term6506, term6506.getClass(), "userName", "");
        setIntField(term6506, term6506.getClass(), "reincarnationNum", 1359973218);
        setIntField(term6506, term6506.getClass(), "level", -218759803);
        setLongField(term6506, term6506.getClass(), "exp", -7148236042086608592L);
        setLongField(term6506, term6506.getClass(), "playerRating", 7716258711075652753L);
        setField(term6506, term6506.getClass(), "lastGameId", "");
        setField(term6506, term6506.getClass(), "lastRomVersion", "");
        setField(term6506, term6506.getClass(), "lastDataVersion", "");
        setField(term6506, term6506.getClass(), "lastPlayDate", "QXyFXBjFde");
        setIntField(term6506, term6506.getClass(), "nameplateId", 1288936083);
        setIntField(term6506, term6506.getClass(), "trophyId", 4086209);
        setIntField(term6506, term6506.getClass(), "cardId", 300964556);
        setIntField(term6506, term6506.getClass(), "dispPlayerLv", -958207893);
        setIntField(term6506, term6506.getClass(), "dispRating", 674390543);
        setIntField(term6506, term6506.getClass(), "dispBP", 1472100258);
        setIntField(term6506, term6506.getClass(), "headphone", 12681987);
        setIntField(term6506, term6506.getClass(), "banStatus", -1987364934);
        setBooleanField(term6506, term6506.getClass(), "isWarningConfirmed", false);
        setIntField(term6506, term6506.getClass(), "lastEmoneyBrand", 1364414277);
        setIntField(term6506, term6506.getClass(), "lastEmoneyCredit", -961137606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBanStatus", argTypes, term6506, args);
    }

};


