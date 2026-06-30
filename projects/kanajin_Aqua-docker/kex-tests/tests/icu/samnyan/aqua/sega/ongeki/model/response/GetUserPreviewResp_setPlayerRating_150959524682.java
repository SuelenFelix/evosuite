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
import java.lang.Long;

public class GetUserPreviewResp_setPlayerRating_150959524682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9560;
     Object term9578;

    public GetUserPreviewResp_setPlayerRating_150959524682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9560 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9560, term9560.getClass(), "userId", 0L);
        setBooleanField(term9560, term9560.getClass(), "isLogin", false);
        setField(term9560, term9560.getClass(), "lastLoginDate", null);
        setField(term9560, term9560.getClass(), "userName", null);
        setIntField(term9560, term9560.getClass(), "reincarnationNum", 0);
        setIntField(term9560, term9560.getClass(), "level", 0);
        setLongField(term9560, term9560.getClass(), "exp", 0L);
        setLongField(term9560, term9560.getClass(), "playerRating", 0L);
        setField(term9560, term9560.getClass(), "lastGameId", null);
        setField(term9560, term9560.getClass(), "lastRomVersion", null);
        setField(term9560, term9560.getClass(), "lastDataVersion", null);
        setField(term9560, term9560.getClass(), "lastPlayDate", null);
        setIntField(term9560, term9560.getClass(), "nameplateId", 0);
        setIntField(term9560, term9560.getClass(), "trophyId", 0);
        setIntField(term9560, term9560.getClass(), "cardId", 0);
        setIntField(term9560, term9560.getClass(), "dispPlayerLv", 0);
        setIntField(term9560, term9560.getClass(), "dispRating", 0);
        setIntField(term9560, term9560.getClass(), "dispBP", 0);
        setIntField(term9560, term9560.getClass(), "headphone", 0);
        setIntField(term9560, term9560.getClass(), "banStatus", 0);
        setBooleanField(term9560, term9560.getClass(), "isWarningConfirmed", false);
        setIntField(term9560, term9560.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9560, term9560.getClass(), "lastEmoneyCredit", 0);
        term9578 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term9578;
        callMethod(klass, "setPlayerRating", argTypes, term9560, args);
    }

};


