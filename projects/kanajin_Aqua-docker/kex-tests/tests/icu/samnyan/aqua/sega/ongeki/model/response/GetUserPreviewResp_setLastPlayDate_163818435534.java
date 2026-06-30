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

public class GetUserPreviewResp_setLastPlayDate_163818435534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7678;

    public GetUserPreviewResp_setLastPlayDate_163818435534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7678 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term7678, term7678.getClass(), "userId", 7314774835988078404L);
        setBooleanField(term7678, term7678.getClass(), "isLogin", false);
        setField(term7678, term7678.getClass(), "lastLoginDate", "LLegSTfqJt");
        setField(term7678, term7678.getClass(), "userName", "");
        setIntField(term7678, term7678.getClass(), "reincarnationNum", 261281668);
        setIntField(term7678, term7678.getClass(), "level", 1712273163);
        setLongField(term7678, term7678.getClass(), "exp", 2777168805269959396L);
        setLongField(term7678, term7678.getClass(), "playerRating", 5255768275907389358L);
        setField(term7678, term7678.getClass(), "lastGameId", "");
        setField(term7678, term7678.getClass(), "lastRomVersion", "");
        setField(term7678, term7678.getClass(), "lastDataVersion", "");
        setField(term7678, term7678.getClass(), "lastPlayDate", "XQfmqLbqHS");
        setIntField(term7678, term7678.getClass(), "nameplateId", 234306621);
        setIntField(term7678, term7678.getClass(), "trophyId", 1025525602);
        setIntField(term7678, term7678.getClass(), "cardId", 1669406334);
        setIntField(term7678, term7678.getClass(), "dispPlayerLv", -780862464);
        setIntField(term7678, term7678.getClass(), "dispRating", 2014099129);
        setIntField(term7678, term7678.getClass(), "dispBP", -1024382698);
        setIntField(term7678, term7678.getClass(), "headphone", -168406824);
        setIntField(term7678, term7678.getClass(), "banStatus", 2063577636);
        setBooleanField(term7678, term7678.getClass(), "isWarningConfirmed", true);
        setIntField(term7678, term7678.getClass(), "lastEmoneyBrand", 1680632578);
        setIntField(term7678, term7678.getClass(), "lastEmoneyCredit", 511399994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jLVLqQSjqg";
        callMethod(klass, "setLastPlayDate", argTypes, term7678, args);
    }

};


