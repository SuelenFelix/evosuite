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

public class GetUserPreviewResp_setLastRomVersion_182345675932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7494;

    public GetUserPreviewResp_setLastRomVersion_182345675932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7494 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term7494, term7494.getClass(), "userId", 6174523862926526279L);
        setBooleanField(term7494, term7494.getClass(), "isLogin", false);
        setField(term7494, term7494.getClass(), "lastLoginDate", "bIqaKgXgPm");
        setField(term7494, term7494.getClass(), "userName", "");
        setIntField(term7494, term7494.getClass(), "reincarnationNum", 1843465187);
        setIntField(term7494, term7494.getClass(), "level", 529595969);
        setLongField(term7494, term7494.getClass(), "exp", 4977537501907213732L);
        setLongField(term7494, term7494.getClass(), "playerRating", -2341942457089205755L);
        setField(term7494, term7494.getClass(), "lastGameId", "");
        setField(term7494, term7494.getClass(), "lastRomVersion", "");
        setField(term7494, term7494.getClass(), "lastDataVersion", "");
        setField(term7494, term7494.getClass(), "lastPlayDate", "uOJFOUcNvv");
        setIntField(term7494, term7494.getClass(), "nameplateId", -1548733886);
        setIntField(term7494, term7494.getClass(), "trophyId", 1543539715);
        setIntField(term7494, term7494.getClass(), "cardId", 1744599521);
        setIntField(term7494, term7494.getClass(), "dispPlayerLv", -985141153);
        setIntField(term7494, term7494.getClass(), "dispRating", -1983740361);
        setIntField(term7494, term7494.getClass(), "dispBP", -1494716341);
        setIntField(term7494, term7494.getClass(), "headphone", 816237851);
        setIntField(term7494, term7494.getClass(), "banStatus", -604114341);
        setBooleanField(term7494, term7494.getClass(), "isWarningConfirmed", false);
        setIntField(term7494, term7494.getClass(), "lastEmoneyBrand", 1146236760);
        setIntField(term7494, term7494.getClass(), "lastEmoneyCredit", 985801789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tkmmGweDwJ";
        callMethod(klass, "setLastRomVersion", argTypes, term7494, args);
    }

};


