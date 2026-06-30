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

public class GetUserPreviewResp_getPlayerRating_18488474447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5666;

    public GetUserPreviewResp_getPlayerRating_18488474447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5666 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term5666, term5666.getClass(), "userId", 1592020674405941254L);
        setBooleanField(term5666, term5666.getClass(), "isLogin", true);
        setField(term5666, term5666.getClass(), "lastLoginDate", "HvxahUfZcJ");
        setField(term5666, term5666.getClass(), "userName", "");
        setIntField(term5666, term5666.getClass(), "reincarnationNum", -1009732764);
        setIntField(term5666, term5666.getClass(), "level", 950783153);
        setLongField(term5666, term5666.getClass(), "exp", 4098407345651793258L);
        setLongField(term5666, term5666.getClass(), "playerRating", 3128610259359668233L);
        setField(term5666, term5666.getClass(), "lastGameId", "");
        setField(term5666, term5666.getClass(), "lastRomVersion", "");
        setField(term5666, term5666.getClass(), "lastDataVersion", "");
        setField(term5666, term5666.getClass(), "lastPlayDate", "WkLpmqoQxy");
        setIntField(term5666, term5666.getClass(), "nameplateId", -801175078);
        setIntField(term5666, term5666.getClass(), "trophyId", 2085098404);
        setIntField(term5666, term5666.getClass(), "cardId", -684064427);
        setIntField(term5666, term5666.getClass(), "dispPlayerLv", -1981080836);
        setIntField(term5666, term5666.getClass(), "dispRating", -176676344);
        setIntField(term5666, term5666.getClass(), "dispBP", 1949009312);
        setIntField(term5666, term5666.getClass(), "headphone", -432054743);
        setIntField(term5666, term5666.getClass(), "banStatus", -859726380);
        setBooleanField(term5666, term5666.getClass(), "isWarningConfirmed", false);
        setIntField(term5666, term5666.getClass(), "lastEmoneyBrand", -1498422654);
        setIntField(term5666, term5666.getClass(), "lastEmoneyCredit", -1499829233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term5666, args);
    }

};


