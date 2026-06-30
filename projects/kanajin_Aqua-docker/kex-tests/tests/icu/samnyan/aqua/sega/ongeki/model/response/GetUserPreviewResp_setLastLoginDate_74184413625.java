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

public class GetUserPreviewResp_setLastLoginDate_74184413625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6930;

    public GetUserPreviewResp_setLastLoginDate_74184413625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6930 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term6930, term6930.getClass(), "userId", 132446939133186077L);
        setBooleanField(term6930, term6930.getClass(), "isLogin", false);
        setField(term6930, term6930.getClass(), "lastLoginDate", "eoEvZbdLjL");
        setField(term6930, term6930.getClass(), "userName", "");
        setIntField(term6930, term6930.getClass(), "reincarnationNum", -849064032);
        setIntField(term6930, term6930.getClass(), "level", -184659375);
        setLongField(term6930, term6930.getClass(), "exp", 4369503082568083627L);
        setLongField(term6930, term6930.getClass(), "playerRating", -1148001666040486410L);
        setField(term6930, term6930.getClass(), "lastGameId", "");
        setField(term6930, term6930.getClass(), "lastRomVersion", "");
        setField(term6930, term6930.getClass(), "lastDataVersion", "");
        setField(term6930, term6930.getClass(), "lastPlayDate", "BkIxsyPkGy");
        setIntField(term6930, term6930.getClass(), "nameplateId", 629005618);
        setIntField(term6930, term6930.getClass(), "trophyId", -2006508013);
        setIntField(term6930, term6930.getClass(), "cardId", 974951631);
        setIntField(term6930, term6930.getClass(), "dispPlayerLv", -942202284);
        setIntField(term6930, term6930.getClass(), "dispRating", -2083254556);
        setIntField(term6930, term6930.getClass(), "dispBP", 1452346261);
        setIntField(term6930, term6930.getClass(), "headphone", -548776693);
        setIntField(term6930, term6930.getClass(), "banStatus", 99032275);
        setBooleanField(term6930, term6930.getClass(), "isWarningConfirmed", true);
        setIntField(term6930, term6930.getClass(), "lastEmoneyBrand", 794098686);
        setIntField(term6930, term6930.getClass(), "lastEmoneyCredit", -1671524013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mrMGwoRgVY";
        callMethod(klass, "setLastLoginDate", argTypes, term6930, args);
    }

};


