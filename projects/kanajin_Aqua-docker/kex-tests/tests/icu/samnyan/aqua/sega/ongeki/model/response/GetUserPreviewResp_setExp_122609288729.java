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

public class GetUserPreviewResp_setExp_122609288729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7258;
     Object term7308;

    public GetUserPreviewResp_setExp_122609288729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7258 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term7258, term7258.getClass(), "userId", 7265006047025305787L);
        setBooleanField(term7258, term7258.getClass(), "isLogin", false);
        setField(term7258, term7258.getClass(), "lastLoginDate", "ReruUQRXwl");
        setField(term7258, term7258.getClass(), "userName", "");
        setIntField(term7258, term7258.getClass(), "reincarnationNum", 1258846008);
        setIntField(term7258, term7258.getClass(), "level", 702866958);
        setLongField(term7258, term7258.getClass(), "exp", -3323049156110984575L);
        setLongField(term7258, term7258.getClass(), "playerRating", -9079706905309751984L);
        setField(term7258, term7258.getClass(), "lastGameId", "");
        setField(term7258, term7258.getClass(), "lastRomVersion", "");
        setField(term7258, term7258.getClass(), "lastDataVersion", "");
        setField(term7258, term7258.getClass(), "lastPlayDate", "DWEsVQwuaE");
        setIntField(term7258, term7258.getClass(), "nameplateId", 622731276);
        setIntField(term7258, term7258.getClass(), "trophyId", -1302341502);
        setIntField(term7258, term7258.getClass(), "cardId", 1113574554);
        setIntField(term7258, term7258.getClass(), "dispPlayerLv", 1685800093);
        setIntField(term7258, term7258.getClass(), "dispRating", -318699441);
        setIntField(term7258, term7258.getClass(), "dispBP", 1381027809);
        setIntField(term7258, term7258.getClass(), "headphone", -371717995);
        setIntField(term7258, term7258.getClass(), "banStatus", 1713005479);
        setBooleanField(term7258, term7258.getClass(), "isWarningConfirmed", true);
        setIntField(term7258, term7258.getClass(), "lastEmoneyBrand", -1948910444);
        setIntField(term7258, term7258.getClass(), "lastEmoneyCredit", -1099061955);
        term7308 = new Long(-2080067238602928154L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term7308;
        callMethod(klass, "setExp", argTypes, term7258, args);
    }

};


