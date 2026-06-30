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

public class GetUserPreviewResp_canEqual_116596680547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8633;
     Object term8683;

    public GetUserPreviewResp_canEqual_116596680547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8633 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term8633, term8633.getClass(), "userId", -1865079020076651952L);
        setBooleanField(term8633, term8633.getClass(), "isLogin", false);
        setField(term8633, term8633.getClass(), "lastLoginDate", "mrSAYJlddZ");
        setField(term8633, term8633.getClass(), "userName", "");
        setIntField(term8633, term8633.getClass(), "reincarnationNum", 175517901);
        setIntField(term8633, term8633.getClass(), "level", 335030203);
        setLongField(term8633, term8633.getClass(), "exp", -6255610460583667093L);
        setLongField(term8633, term8633.getClass(), "playerRating", -3947173237186855838L);
        setField(term8633, term8633.getClass(), "lastGameId", "");
        setField(term8633, term8633.getClass(), "lastRomVersion", "");
        setField(term8633, term8633.getClass(), "lastDataVersion", "");
        setField(term8633, term8633.getClass(), "lastPlayDate", "KbwxawvYsw");
        setIntField(term8633, term8633.getClass(), "nameplateId", -474014477);
        setIntField(term8633, term8633.getClass(), "trophyId", 1610419467);
        setIntField(term8633, term8633.getClass(), "cardId", 1155135931);
        setIntField(term8633, term8633.getClass(), "dispPlayerLv", -636910567);
        setIntField(term8633, term8633.getClass(), "dispRating", 1896114203);
        setIntField(term8633, term8633.getClass(), "dispBP", 1045745470);
        setIntField(term8633, term8633.getClass(), "headphone", 892741901);
        setIntField(term8633, term8633.getClass(), "banStatus", -1724900201);
        setBooleanField(term8633, term8633.getClass(), "isWarningConfirmed", true);
        setIntField(term8633, term8633.getClass(), "lastEmoneyBrand", -758523003);
        setIntField(term8633, term8633.getClass(), "lastEmoneyCredit", 1567184195);
        term8683 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8683;
        callMethod(klass, "canEqual", argTypes, term8633, args);
    }

};


