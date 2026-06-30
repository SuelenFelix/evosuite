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

public class GetUserPreviewResp_getDispBP_25968201817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6366;

    public GetUserPreviewResp_getDispBP_25968201817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6366 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term6366, term6366.getClass(), "userId", -8854988339892073229L);
        setBooleanField(term6366, term6366.getClass(), "isLogin", true);
        setField(term6366, term6366.getClass(), "lastLoginDate", "PNzNzzjSXM");
        setField(term6366, term6366.getClass(), "userName", "");
        setIntField(term6366, term6366.getClass(), "reincarnationNum", -1337690242);
        setIntField(term6366, term6366.getClass(), "level", 264872152);
        setLongField(term6366, term6366.getClass(), "exp", 2769081086274438111L);
        setLongField(term6366, term6366.getClass(), "playerRating", -6339531459447942677L);
        setField(term6366, term6366.getClass(), "lastGameId", "");
        setField(term6366, term6366.getClass(), "lastRomVersion", "");
        setField(term6366, term6366.getClass(), "lastDataVersion", "");
        setField(term6366, term6366.getClass(), "lastPlayDate", "ktKcSZiuGM");
        setIntField(term6366, term6366.getClass(), "nameplateId", 1645751151);
        setIntField(term6366, term6366.getClass(), "trophyId", -2117930201);
        setIntField(term6366, term6366.getClass(), "cardId", 1839150896);
        setIntField(term6366, term6366.getClass(), "dispPlayerLv", -1487860516);
        setIntField(term6366, term6366.getClass(), "dispRating", 784631129);
        setIntField(term6366, term6366.getClass(), "dispBP", 658285959);
        setIntField(term6366, term6366.getClass(), "headphone", -89362706);
        setIntField(term6366, term6366.getClass(), "banStatus", 341388367);
        setBooleanField(term6366, term6366.getClass(), "isWarningConfirmed", true);
        setIntField(term6366, term6366.getClass(), "lastEmoneyBrand", 1078807592);
        setIntField(term6366, term6366.getClass(), "lastEmoneyCredit", 1673044047);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispBP", argTypes, term6366, args);
    }

};


