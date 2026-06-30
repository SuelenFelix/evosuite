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

public class GetUserPreviewResp_setHeadphone_135025394641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8202;
     Object term8252;

    public GetUserPreviewResp_setHeadphone_135025394641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8202 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term8202, term8202.getClass(), "userId", 8018453258973130416L);
        setBooleanField(term8202, term8202.getClass(), "isLogin", true);
        setField(term8202, term8202.getClass(), "lastLoginDate", "eWnrMSbYbT");
        setField(term8202, term8202.getClass(), "userName", "");
        setIntField(term8202, term8202.getClass(), "reincarnationNum", 1754193865);
        setIntField(term8202, term8202.getClass(), "level", 25277058);
        setLongField(term8202, term8202.getClass(), "exp", 5592372218942533021L);
        setLongField(term8202, term8202.getClass(), "playerRating", 8423938983545919786L);
        setField(term8202, term8202.getClass(), "lastGameId", "");
        setField(term8202, term8202.getClass(), "lastRomVersion", "");
        setField(term8202, term8202.getClass(), "lastDataVersion", "");
        setField(term8202, term8202.getClass(), "lastPlayDate", "AjoFvDFyCY");
        setIntField(term8202, term8202.getClass(), "nameplateId", -949634053);
        setIntField(term8202, term8202.getClass(), "trophyId", 1495471055);
        setIntField(term8202, term8202.getClass(), "cardId", -583415628);
        setIntField(term8202, term8202.getClass(), "dispPlayerLv", -1488660931);
        setIntField(term8202, term8202.getClass(), "dispRating", 1899095931);
        setIntField(term8202, term8202.getClass(), "dispBP", 145571200);
        setIntField(term8202, term8202.getClass(), "headphone", -81919234);
        setIntField(term8202, term8202.getClass(), "banStatus", 41779745);
        setBooleanField(term8202, term8202.getClass(), "isWarningConfirmed", false);
        setIntField(term8202, term8202.getClass(), "lastEmoneyBrand", 908188015);
        setIntField(term8202, term8202.getClass(), "lastEmoneyCredit", 1448289766);
        term8252 = new Integer(1377148923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8252;
        callMethod(klass, "setHeadphone", argTypes, term8202, args);
    }

};


