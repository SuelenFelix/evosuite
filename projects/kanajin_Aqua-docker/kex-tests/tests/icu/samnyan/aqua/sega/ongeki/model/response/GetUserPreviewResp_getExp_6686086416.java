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

public class GetUserPreviewResp_getExp_6686086416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5596;

    public GetUserPreviewResp_getExp_6686086416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5596 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term5596, term5596.getClass(), "userId", 7654605795400256601L);
        setBooleanField(term5596, term5596.getClass(), "isLogin", true);
        setField(term5596, term5596.getClass(), "lastLoginDate", "tvxYdqiyGc");
        setField(term5596, term5596.getClass(), "userName", "");
        setIntField(term5596, term5596.getClass(), "reincarnationNum", -1540486514);
        setIntField(term5596, term5596.getClass(), "level", 1471031478);
        setLongField(term5596, term5596.getClass(), "exp", 3610800451815944213L);
        setLongField(term5596, term5596.getClass(), "playerRating", -3548672426577893003L);
        setField(term5596, term5596.getClass(), "lastGameId", "");
        setField(term5596, term5596.getClass(), "lastRomVersion", "");
        setField(term5596, term5596.getClass(), "lastDataVersion", "");
        setField(term5596, term5596.getClass(), "lastPlayDate", "ZEXFoMSKeG");
        setIntField(term5596, term5596.getClass(), "nameplateId", -334716487);
        setIntField(term5596, term5596.getClass(), "trophyId", -1739012814);
        setIntField(term5596, term5596.getClass(), "cardId", 1989014880);
        setIntField(term5596, term5596.getClass(), "dispPlayerLv", -330280702);
        setIntField(term5596, term5596.getClass(), "dispRating", -1858425735);
        setIntField(term5596, term5596.getClass(), "dispBP", 1818274550);
        setIntField(term5596, term5596.getClass(), "headphone", 1044519085);
        setIntField(term5596, term5596.getClass(), "banStatus", 2095699770);
        setBooleanField(term5596, term5596.getClass(), "isWarningConfirmed", true);
        setIntField(term5596, term5596.getClass(), "lastEmoneyBrand", -1365904757);
        setIntField(term5596, term5596.getClass(), "lastEmoneyCredit", -1487263349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExp", argTypes, term5596, args);
    }

};


