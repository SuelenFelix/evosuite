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

public class GetUserPreviewResp_getTrophyId_24521757513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6086;

    public GetUserPreviewResp_getTrophyId_24521757513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6086 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term6086, term6086.getClass(), "userId", -4821516944173509228L);
        setBooleanField(term6086, term6086.getClass(), "isLogin", true);
        setField(term6086, term6086.getClass(), "lastLoginDate", "gXFNBHJSey");
        setField(term6086, term6086.getClass(), "userName", "");
        setIntField(term6086, term6086.getClass(), "reincarnationNum", 912208163);
        setIntField(term6086, term6086.getClass(), "level", 909767683);
        setLongField(term6086, term6086.getClass(), "exp", 2315395988604904502L);
        setLongField(term6086, term6086.getClass(), "playerRating", 4337555582321907177L);
        setField(term6086, term6086.getClass(), "lastGameId", "");
        setField(term6086, term6086.getClass(), "lastRomVersion", "");
        setField(term6086, term6086.getClass(), "lastDataVersion", "");
        setField(term6086, term6086.getClass(), "lastPlayDate", "wUcSfItZgv");
        setIntField(term6086, term6086.getClass(), "nameplateId", -639390893);
        setIntField(term6086, term6086.getClass(), "trophyId", 1176415280);
        setIntField(term6086, term6086.getClass(), "cardId", -1272714687);
        setIntField(term6086, term6086.getClass(), "dispPlayerLv", -762778853);
        setIntField(term6086, term6086.getClass(), "dispRating", 946727239);
        setIntField(term6086, term6086.getClass(), "dispBP", 349182490);
        setIntField(term6086, term6086.getClass(), "headphone", -353671511);
        setIntField(term6086, term6086.getClass(), "banStatus", 1598831363);
        setBooleanField(term6086, term6086.getClass(), "isWarningConfirmed", true);
        setIntField(term6086, term6086.getClass(), "lastEmoneyBrand", -690367798);
        setIntField(term6086, term6086.getClass(), "lastEmoneyCredit", 1863738073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrophyId", argTypes, term6086, args);
    }

};


