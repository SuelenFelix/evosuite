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

public class GetUserPreviewResp_getNameplateId_70630223212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6016;

    public GetUserPreviewResp_getNameplateId_70630223212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6016 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term6016, term6016.getClass(), "userId", 3228082303360203224L);
        setBooleanField(term6016, term6016.getClass(), "isLogin", true);
        setField(term6016, term6016.getClass(), "lastLoginDate", "bShlAqoTmZ");
        setField(term6016, term6016.getClass(), "userName", "");
        setIntField(term6016, term6016.getClass(), "reincarnationNum", 994300935);
        setIntField(term6016, term6016.getClass(), "level", 433954476);
        setLongField(term6016, term6016.getClass(), "exp", 8845929725457841487L);
        setLongField(term6016, term6016.getClass(), "playerRating", 2599553846982918627L);
        setField(term6016, term6016.getClass(), "lastGameId", "");
        setField(term6016, term6016.getClass(), "lastRomVersion", "");
        setField(term6016, term6016.getClass(), "lastDataVersion", "");
        setField(term6016, term6016.getClass(), "lastPlayDate", "nOKlKlNhtU");
        setIntField(term6016, term6016.getClass(), "nameplateId", 1780958641);
        setIntField(term6016, term6016.getClass(), "trophyId", 1890582085);
        setIntField(term6016, term6016.getClass(), "cardId", 2146568808);
        setIntField(term6016, term6016.getClass(), "dispPlayerLv", 245081679);
        setIntField(term6016, term6016.getClass(), "dispRating", 1199789398);
        setIntField(term6016, term6016.getClass(), "dispBP", -1056402285);
        setIntField(term6016, term6016.getClass(), "headphone", 1881803912);
        setIntField(term6016, term6016.getClass(), "banStatus", -188535038);
        setBooleanField(term6016, term6016.getClass(), "isWarningConfirmed", true);
        setIntField(term6016, term6016.getClass(), "lastEmoneyBrand", 254650626);
        setIntField(term6016, term6016.getClass(), "lastEmoneyCredit", -1789030917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameplateId", argTypes, term6016, args);
    }

};


