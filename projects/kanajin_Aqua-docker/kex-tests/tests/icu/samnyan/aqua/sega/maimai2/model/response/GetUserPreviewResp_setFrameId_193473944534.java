package icu.samnyan.aqua.sega.maimai2.model.response;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GetUserPreviewResp_setFrameId_193473944534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29551;
     Object term29650;

    public GetUserPreviewResp_setFrameId_193473944534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29551 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term29551, term29551.getClass(), "userId", -2240386714187527144L);
        setField(term29551, term29551.getClass(), "userName", "BXJdQmJvFh");
        setBooleanField(term29551, term29551.getClass(), "isLogin", true);
        setField(term29551, term29551.getClass(), "lastGameId", "bsPTRsievL");
        setField(term29551, term29551.getClass(), "lastDataVersion", "LPLRACmzWM");
        setField(term29551, term29551.getClass(), "lastRomVersion", "DfdUvykRzo");
        setField(term29551, term29551.getClass(), "lastLoginDate", "TWPJmzPTXg");
        setField(term29551, term29551.getClass(), "lastPlayDate", "frPgAZBkug");
        setIntField(term29551, term29551.getClass(), "playerRating", -171991376);
        setIntField(term29551, term29551.getClass(), "nameplateId", 1966933092);
        setIntField(term29551, term29551.getClass(), "iconId", 1108791337);
        setIntField(term29551, term29551.getClass(), "trophyId", -414682663);
        setIntField(term29551, term29551.getClass(), "partnerId", 259051944);
        setIntField(term29551, term29551.getClass(), "frameId", -958789263);
        setIntField(term29551, term29551.getClass(), "dispRate", 120623003);
        setIntField(term29551, term29551.getClass(), "totalAwake", -1236935869);
        setIntField(term29551, term29551.getClass(), "isNetMember", -1707868253);
        setField(term29551, term29551.getClass(), "dailyBonusDate", "AAzuYrqTRq");
        setIntField(term29551, term29551.getClass(), "headPhoneVolume", 487083950);
        setBooleanField(term29551, term29551.getClass(), "isInherit", false);
        setIntField(term29551, term29551.getClass(), "banState", 33771952);
        term29650 = new Integer(-732008756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29650;
        callMethod(klass, "setFrameId", argTypes, term29551, args);
    }

};


