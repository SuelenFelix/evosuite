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
import java.lang.Boolean;

public class GetUserPreviewResp_setLogin_69824146124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6858;
     Object term6908;

    public GetUserPreviewResp_setLogin_69824146124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6858 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term6858, term6858.getClass(), "userId", -1234885562462779381L);
        setBooleanField(term6858, term6858.getClass(), "isLogin", false);
        setField(term6858, term6858.getClass(), "lastLoginDate", "YcTbglHiUq");
        setField(term6858, term6858.getClass(), "userName", "");
        setIntField(term6858, term6858.getClass(), "reincarnationNum", -1349617857);
        setIntField(term6858, term6858.getClass(), "level", 1346331516);
        setLongField(term6858, term6858.getClass(), "exp", 2678845111978352940L);
        setLongField(term6858, term6858.getClass(), "playerRating", 873013799050926004L);
        setField(term6858, term6858.getClass(), "lastGameId", "");
        setField(term6858, term6858.getClass(), "lastRomVersion", "");
        setField(term6858, term6858.getClass(), "lastDataVersion", "");
        setField(term6858, term6858.getClass(), "lastPlayDate", "TiUqHrjoEU");
        setIntField(term6858, term6858.getClass(), "nameplateId", 1018925421);
        setIntField(term6858, term6858.getClass(), "trophyId", -1658031378);
        setIntField(term6858, term6858.getClass(), "cardId", -863483345);
        setIntField(term6858, term6858.getClass(), "dispPlayerLv", -1722702406);
        setIntField(term6858, term6858.getClass(), "dispRating", 549278914);
        setIntField(term6858, term6858.getClass(), "dispBP", -1490125498);
        setIntField(term6858, term6858.getClass(), "headphone", -1443119347);
        setIntField(term6858, term6858.getClass(), "banStatus", 1962181481);
        setBooleanField(term6858, term6858.getClass(), "isWarningConfirmed", true);
        setIntField(term6858, term6858.getClass(), "lastEmoneyBrand", 1798831879);
        setIntField(term6858, term6858.getClass(), "lastEmoneyCredit", 1393855580);
        term6908 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6908;
        callMethod(klass, "setLogin", argTypes, term6858, args);
    }

};


