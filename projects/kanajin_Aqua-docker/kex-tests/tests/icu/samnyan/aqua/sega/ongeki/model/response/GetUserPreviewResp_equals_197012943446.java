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

public class GetUserPreviewResp_equals_197012943446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8562;
     Object term8612;

    public GetUserPreviewResp_equals_197012943446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8562 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term8562, term8562.getClass(), "userId", 165312735504471081L);
        setBooleanField(term8562, term8562.getClass(), "isLogin", true);
        setField(term8562, term8562.getClass(), "lastLoginDate", "QTefjRuiez");
        setField(term8562, term8562.getClass(), "userName", "");
        setIntField(term8562, term8562.getClass(), "reincarnationNum", -673356166);
        setIntField(term8562, term8562.getClass(), "level", 1876812694);
        setLongField(term8562, term8562.getClass(), "exp", 7910323873668469704L);
        setLongField(term8562, term8562.getClass(), "playerRating", -8034026767184380879L);
        setField(term8562, term8562.getClass(), "lastGameId", "");
        setField(term8562, term8562.getClass(), "lastRomVersion", "");
        setField(term8562, term8562.getClass(), "lastDataVersion", "");
        setField(term8562, term8562.getClass(), "lastPlayDate", "SQZVNkAVBB");
        setIntField(term8562, term8562.getClass(), "nameplateId", 461068473);
        setIntField(term8562, term8562.getClass(), "trophyId", -1833298266);
        setIntField(term8562, term8562.getClass(), "cardId", 746372422);
        setIntField(term8562, term8562.getClass(), "dispPlayerLv", 1921465988);
        setIntField(term8562, term8562.getClass(), "dispRating", -164438599);
        setIntField(term8562, term8562.getClass(), "dispBP", -444441955);
        setIntField(term8562, term8562.getClass(), "headphone", -544005591);
        setIntField(term8562, term8562.getClass(), "banStatus", -1379603462);
        setBooleanField(term8562, term8562.getClass(), "isWarningConfirmed", false);
        setIntField(term8562, term8562.getClass(), "lastEmoneyBrand", -1304965721);
        setIntField(term8562, term8562.getClass(), "lastEmoneyCredit", 1661411651);
        term8612 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8612;
        callMethod(klass, "equals", argTypes, term8562, args);
    }

};


