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

public class GetUserPreviewResp_getLastGameId_20219857188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5736;

    public GetUserPreviewResp_getLastGameId_20219857188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5736 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term5736, term5736.getClass(), "userId", -7966859634511305171L);
        setBooleanField(term5736, term5736.getClass(), "isLogin", false);
        setField(term5736, term5736.getClass(), "lastLoginDate", "XiNoscmYhd");
        setField(term5736, term5736.getClass(), "userName", "");
        setIntField(term5736, term5736.getClass(), "reincarnationNum", -888855662);
        setIntField(term5736, term5736.getClass(), "level", -1483966656);
        setLongField(term5736, term5736.getClass(), "exp", 5885163998873132588L);
        setLongField(term5736, term5736.getClass(), "playerRating", 2201264121669950608L);
        setField(term5736, term5736.getClass(), "lastGameId", "");
        setField(term5736, term5736.getClass(), "lastRomVersion", "");
        setField(term5736, term5736.getClass(), "lastDataVersion", "");
        setField(term5736, term5736.getClass(), "lastPlayDate", "asMqnMNrZp");
        setIntField(term5736, term5736.getClass(), "nameplateId", -334260786);
        setIntField(term5736, term5736.getClass(), "trophyId", -765890956);
        setIntField(term5736, term5736.getClass(), "cardId", -214452542);
        setIntField(term5736, term5736.getClass(), "dispPlayerLv", -21429773);
        setIntField(term5736, term5736.getClass(), "dispRating", 1774728742);
        setIntField(term5736, term5736.getClass(), "dispBP", -1822211508);
        setIntField(term5736, term5736.getClass(), "headphone", -177243872);
        setIntField(term5736, term5736.getClass(), "banStatus", 1485047282);
        setBooleanField(term5736, term5736.getClass(), "isWarningConfirmed", false);
        setIntField(term5736, term5736.getClass(), "lastEmoneyBrand", 1624190794);
        setIntField(term5736, term5736.getClass(), "lastEmoneyCredit", -773608881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastGameId", argTypes, term5736, args);
    }

};


