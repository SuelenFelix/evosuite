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

public class GetUserPreviewResp_getLastEmoneyBrand_12559778421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6646;

    public GetUserPreviewResp_getLastEmoneyBrand_12559778421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6646 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term6646, term6646.getClass(), "userId", 5817794709356277010L);
        setBooleanField(term6646, term6646.getClass(), "isLogin", false);
        setField(term6646, term6646.getClass(), "lastLoginDate", "utCuuVCKqE");
        setField(term6646, term6646.getClass(), "userName", "");
        setIntField(term6646, term6646.getClass(), "reincarnationNum", -515631808);
        setIntField(term6646, term6646.getClass(), "level", 1546701347);
        setLongField(term6646, term6646.getClass(), "exp", -205762347192500511L);
        setLongField(term6646, term6646.getClass(), "playerRating", -4987344934532917085L);
        setField(term6646, term6646.getClass(), "lastGameId", "");
        setField(term6646, term6646.getClass(), "lastRomVersion", "");
        setField(term6646, term6646.getClass(), "lastDataVersion", "");
        setField(term6646, term6646.getClass(), "lastPlayDate", "zSfoqzJbPT");
        setIntField(term6646, term6646.getClass(), "nameplateId", -111931851);
        setIntField(term6646, term6646.getClass(), "trophyId", -251696516);
        setIntField(term6646, term6646.getClass(), "cardId", 1075321384);
        setIntField(term6646, term6646.getClass(), "dispPlayerLv", -1726073541);
        setIntField(term6646, term6646.getClass(), "dispRating", 406945977);
        setIntField(term6646, term6646.getClass(), "dispBP", 493657684);
        setIntField(term6646, term6646.getClass(), "headphone", 1882655922);
        setIntField(term6646, term6646.getClass(), "banStatus", 1314996390);
        setBooleanField(term6646, term6646.getClass(), "isWarningConfirmed", true);
        setIntField(term6646, term6646.getClass(), "lastEmoneyBrand", 1367703658);
        setIntField(term6646, term6646.getClass(), "lastEmoneyCredit", 1120153100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastEmoneyBrand", argTypes, term6646, args);
    }

};


