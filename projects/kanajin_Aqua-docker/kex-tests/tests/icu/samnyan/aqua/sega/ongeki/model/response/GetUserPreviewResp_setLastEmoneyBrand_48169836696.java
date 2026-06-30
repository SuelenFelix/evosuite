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

public class GetUserPreviewResp_setLastEmoneyBrand_48169836696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9832;
     Object term9850;

    public GetUserPreviewResp_setLastEmoneyBrand_48169836696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9832 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term9832, term9832.getClass(), "userId", 0L);
        setBooleanField(term9832, term9832.getClass(), "isLogin", false);
        setField(term9832, term9832.getClass(), "lastLoginDate", null);
        setField(term9832, term9832.getClass(), "userName", null);
        setIntField(term9832, term9832.getClass(), "reincarnationNum", 0);
        setIntField(term9832, term9832.getClass(), "level", 0);
        setLongField(term9832, term9832.getClass(), "exp", 0L);
        setLongField(term9832, term9832.getClass(), "playerRating", 0L);
        setField(term9832, term9832.getClass(), "lastGameId", null);
        setField(term9832, term9832.getClass(), "lastRomVersion", null);
        setField(term9832, term9832.getClass(), "lastDataVersion", null);
        setField(term9832, term9832.getClass(), "lastPlayDate", null);
        setIntField(term9832, term9832.getClass(), "nameplateId", 0);
        setIntField(term9832, term9832.getClass(), "trophyId", 0);
        setIntField(term9832, term9832.getClass(), "cardId", 0);
        setIntField(term9832, term9832.getClass(), "dispPlayerLv", 0);
        setIntField(term9832, term9832.getClass(), "dispRating", 0);
        setIntField(term9832, term9832.getClass(), "dispBP", 0);
        setIntField(term9832, term9832.getClass(), "headphone", 0);
        setIntField(term9832, term9832.getClass(), "banStatus", 0);
        setBooleanField(term9832, term9832.getClass(), "isWarningConfirmed", false);
        setIntField(term9832, term9832.getClass(), "lastEmoneyBrand", 0);
        setIntField(term9832, term9832.getClass(), "lastEmoneyCredit", 0);
        term9850 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9850;
        callMethod(klass, "setLastEmoneyBrand", argTypes, term9832, args);
    }

};


