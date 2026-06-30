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

public class GetUserPreviewResp_setUserName_86235791926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7022;

    public GetUserPreviewResp_setUserName_86235791926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7022 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term7022, term7022.getClass(), "userId", -2097210721190032076L);
        setBooleanField(term7022, term7022.getClass(), "isLogin", true);
        setField(term7022, term7022.getClass(), "lastLoginDate", "mxVLTgCwki");
        setField(term7022, term7022.getClass(), "userName", "");
        setIntField(term7022, term7022.getClass(), "reincarnationNum", -438794741);
        setIntField(term7022, term7022.getClass(), "level", -1400834481);
        setLongField(term7022, term7022.getClass(), "exp", -3022442322233520981L);
        setLongField(term7022, term7022.getClass(), "playerRating", -8735757853649335051L);
        setField(term7022, term7022.getClass(), "lastGameId", "");
        setField(term7022, term7022.getClass(), "lastRomVersion", "");
        setField(term7022, term7022.getClass(), "lastDataVersion", "");
        setField(term7022, term7022.getClass(), "lastPlayDate", "wCurppnDSA");
        setIntField(term7022, term7022.getClass(), "nameplateId", 957091706);
        setIntField(term7022, term7022.getClass(), "trophyId", -2011802805);
        setIntField(term7022, term7022.getClass(), "cardId", -1683802689);
        setIntField(term7022, term7022.getClass(), "dispPlayerLv", -1949346221);
        setIntField(term7022, term7022.getClass(), "dispRating", 831638391);
        setIntField(term7022, term7022.getClass(), "dispBP", -1184374392);
        setIntField(term7022, term7022.getClass(), "headphone", -758870402);
        setIntField(term7022, term7022.getClass(), "banStatus", 72767889);
        setBooleanField(term7022, term7022.getClass(), "isWarningConfirmed", false);
        setIntField(term7022, term7022.getClass(), "lastEmoneyBrand", 1699515029);
        setIntField(term7022, term7022.getClass(), "lastEmoneyCredit", 673153263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JydxSNTMYt";
        callMethod(klass, "setUserName", argTypes, term7022, args);
    }

};


