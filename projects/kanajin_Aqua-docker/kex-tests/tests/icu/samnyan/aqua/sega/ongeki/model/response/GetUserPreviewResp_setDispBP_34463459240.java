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

public class GetUserPreviewResp_setDispBP_34463459240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8130;
     Object term8180;

    public GetUserPreviewResp_setDispBP_34463459240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8130 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term8130, term8130.getClass(), "userId", 7930227263182470549L);
        setBooleanField(term8130, term8130.getClass(), "isLogin", false);
        setField(term8130, term8130.getClass(), "lastLoginDate", "PNdLRrSAIY");
        setField(term8130, term8130.getClass(), "userName", "");
        setIntField(term8130, term8130.getClass(), "reincarnationNum", 2073367039);
        setIntField(term8130, term8130.getClass(), "level", -365877126);
        setLongField(term8130, term8130.getClass(), "exp", -2571841019708046378L);
        setLongField(term8130, term8130.getClass(), "playerRating", -4682102699090617454L);
        setField(term8130, term8130.getClass(), "lastGameId", "");
        setField(term8130, term8130.getClass(), "lastRomVersion", "");
        setField(term8130, term8130.getClass(), "lastDataVersion", "");
        setField(term8130, term8130.getClass(), "lastPlayDate", "nJnRIRiLZK");
        setIntField(term8130, term8130.getClass(), "nameplateId", 251018856);
        setIntField(term8130, term8130.getClass(), "trophyId", -1965331640);
        setIntField(term8130, term8130.getClass(), "cardId", -514392629);
        setIntField(term8130, term8130.getClass(), "dispPlayerLv", -166633123);
        setIntField(term8130, term8130.getClass(), "dispRating", 373110517);
        setIntField(term8130, term8130.getClass(), "dispBP", -1632703926);
        setIntField(term8130, term8130.getClass(), "headphone", -1031499401);
        setIntField(term8130, term8130.getClass(), "banStatus", 280202002);
        setBooleanField(term8130, term8130.getClass(), "isWarningConfirmed", true);
        setIntField(term8130, term8130.getClass(), "lastEmoneyBrand", -1074402599);
        setIntField(term8130, term8130.getClass(), "lastEmoneyCredit", -1867539151);
        term8180 = new Integer(-816430246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8180;
        callMethod(klass, "setDispBP", argTypes, term8130, args);
    }

};


