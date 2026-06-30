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

public class GetUserPreviewResp_setDispBP_34463459292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9752;
     Object term9770;

    public GetUserPreviewResp_setDispBP_34463459292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9752 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9752, term9752.getClass(), "userId", 0L);
        setBooleanField(term9752, term9752.getClass(), "isLogin", false);
        setField(term9752, term9752.getClass(), "lastLoginDate", null);
        setField(term9752, term9752.getClass(), "userName", null);
        setIntField(term9752, term9752.getClass(), "reincarnationNum", 0);
        setIntField(term9752, term9752.getClass(), "level", 0);
        setLongField(term9752, term9752.getClass(), "exp", 0L);
        setLongField(term9752, term9752.getClass(), "playerRating", 0L);
        setField(term9752, term9752.getClass(), "lastGameId", null);
        setField(term9752, term9752.getClass(), "lastRomVersion", null);
        setField(term9752, term9752.getClass(), "lastDataVersion", null);
        setField(term9752, term9752.getClass(), "lastPlayDate", null);
        setIntField(term9752, term9752.getClass(), "nameplateId", 0);
        setIntField(term9752, term9752.getClass(), "trophyId", 0);
        setIntField(term9752, term9752.getClass(), "cardId", 0);
        setIntField(term9752, term9752.getClass(), "dispPlayerLv", 0);
        setIntField(term9752, term9752.getClass(), "dispRating", 0);
        setIntField(term9752, term9752.getClass(), "dispBP", 0);
        setIntField(term9752, term9752.getClass(), "headphone", 0);
        setIntField(term9752, term9752.getClass(), "banStatus", 0);
        setBooleanField(term9752, term9752.getClass(), "isWarningConfirmed", false);
        setIntField(term9752, term9752.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9752, term9752.getClass(), "lastEmoneyCredit", 0);
        term9770 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9770;
        callMethod(klass, "setDispBP", argTypes, term9752, args);
    }

};


