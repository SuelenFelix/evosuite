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

public class GetUserPreviewResp_setUserId_89526007423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6786;
     Object term6836;

    public GetUserPreviewResp_setUserId_89526007423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6786 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term6786, term6786.getClass(), "userId", 3233502115953753827L);
        setBooleanField(term6786, term6786.getClass(), "isLogin", true);
        setField(term6786, term6786.getClass(), "lastLoginDate", "JptuwlirlS");
        setField(term6786, term6786.getClass(), "userName", "");
        setIntField(term6786, term6786.getClass(), "reincarnationNum", -400280008);
        setIntField(term6786, term6786.getClass(), "level", -1191957775);
        setLongField(term6786, term6786.getClass(), "exp", -308461294344616496L);
        setLongField(term6786, term6786.getClass(), "playerRating", -6325201865655646423L);
        setField(term6786, term6786.getClass(), "lastGameId", "");
        setField(term6786, term6786.getClass(), "lastRomVersion", "");
        setField(term6786, term6786.getClass(), "lastDataVersion", "");
        setField(term6786, term6786.getClass(), "lastPlayDate", "TKOMaGswbU");
        setIntField(term6786, term6786.getClass(), "nameplateId", 14181775);
        setIntField(term6786, term6786.getClass(), "trophyId", 667778327);
        setIntField(term6786, term6786.getClass(), "cardId", 395074450);
        setIntField(term6786, term6786.getClass(), "dispPlayerLv", -2028511200);
        setIntField(term6786, term6786.getClass(), "dispRating", 1415605360);
        setIntField(term6786, term6786.getClass(), "dispBP", 896275171);
        setIntField(term6786, term6786.getClass(), "headphone", 466010);
        setIntField(term6786, term6786.getClass(), "banStatus", -169463842);
        setBooleanField(term6786, term6786.getClass(), "isWarningConfirmed", false);
        setIntField(term6786, term6786.getClass(), "lastEmoneyBrand", -2106837394);
        setIntField(term6786, term6786.getClass(), "lastEmoneyCredit", -533202192);
        term6836 = new Long(-9093996849713569099L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6836;
        callMethod(klass, "setUserId", argTypes, term6786, args);
    }

};


