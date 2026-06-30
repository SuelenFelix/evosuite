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

public class GetUserPreviewResp_hashCode_187615118748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8704;

    public GetUserPreviewResp_hashCode_187615118748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8704 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term8704, term8704.getClass(), "userId", 1186857065042697930L);
        setBooleanField(term8704, term8704.getClass(), "isLogin", false);
        setField(term8704, term8704.getClass(), "lastLoginDate", "gvjdfHNzOa");
        setField(term8704, term8704.getClass(), "userName", "");
        setIntField(term8704, term8704.getClass(), "reincarnationNum", 63595623);
        setIntField(term8704, term8704.getClass(), "level", 1764150991);
        setLongField(term8704, term8704.getClass(), "exp", 1659080369100392023L);
        setLongField(term8704, term8704.getClass(), "playerRating", 854087753192360238L);
        setField(term8704, term8704.getClass(), "lastGameId", "");
        setField(term8704, term8704.getClass(), "lastRomVersion", "");
        setField(term8704, term8704.getClass(), "lastDataVersion", "");
        setField(term8704, term8704.getClass(), "lastPlayDate", "HqitWglYWX");
        setIntField(term8704, term8704.getClass(), "nameplateId", 944653455);
        setIntField(term8704, term8704.getClass(), "trophyId", -1819474400);
        setIntField(term8704, term8704.getClass(), "cardId", 783684648);
        setIntField(term8704, term8704.getClass(), "dispPlayerLv", 553754005);
        setIntField(term8704, term8704.getClass(), "dispRating", 1986699236);
        setIntField(term8704, term8704.getClass(), "dispBP", -1729178560);
        setIntField(term8704, term8704.getClass(), "headphone", 874974171);
        setIntField(term8704, term8704.getClass(), "banStatus", -1689017763);
        setBooleanField(term8704, term8704.getClass(), "isWarningConfirmed", false);
        setIntField(term8704, term8704.getClass(), "lastEmoneyBrand", 1657387281);
        setIntField(term8704, term8704.getClass(), "lastEmoneyCredit", 1276651382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term8704, args);
    }

};


