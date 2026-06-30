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

public class GetUserPreviewResp_setCardId_63702342937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7914;
     Object term7964;

    public GetUserPreviewResp_setCardId_63702342937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7914 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term7914, term7914.getClass(), "userId", -6645699856048951433L);
        setBooleanField(term7914, term7914.getClass(), "isLogin", false);
        setField(term7914, term7914.getClass(), "lastLoginDate", "rnPhHoorxj");
        setField(term7914, term7914.getClass(), "userName", "");
        setIntField(term7914, term7914.getClass(), "reincarnationNum", 749289511);
        setIntField(term7914, term7914.getClass(), "level", -414437174);
        setLongField(term7914, term7914.getClass(), "exp", -1721083210597101555L);
        setLongField(term7914, term7914.getClass(), "playerRating", 937792282597213200L);
        setField(term7914, term7914.getClass(), "lastGameId", "");
        setField(term7914, term7914.getClass(), "lastRomVersion", "");
        setField(term7914, term7914.getClass(), "lastDataVersion", "");
        setField(term7914, term7914.getClass(), "lastPlayDate", "GuwJLKquuI");
        setIntField(term7914, term7914.getClass(), "nameplateId", -860227615);
        setIntField(term7914, term7914.getClass(), "trophyId", -1696192372);
        setIntField(term7914, term7914.getClass(), "cardId", 1239525687);
        setIntField(term7914, term7914.getClass(), "dispPlayerLv", 1496590861);
        setIntField(term7914, term7914.getClass(), "dispRating", 1046957508);
        setIntField(term7914, term7914.getClass(), "dispBP", -553500478);
        setIntField(term7914, term7914.getClass(), "headphone", 841910530);
        setIntField(term7914, term7914.getClass(), "banStatus", -1415371559);
        setBooleanField(term7914, term7914.getClass(), "isWarningConfirmed", true);
        setIntField(term7914, term7914.getClass(), "lastEmoneyBrand", -2083858949);
        setIntField(term7914, term7914.getClass(), "lastEmoneyCredit", -1878319299);
        term7964 = new Integer(-690862846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7964;
        callMethod(klass, "setCardId", argTypes, term7914, args);
    }

};


