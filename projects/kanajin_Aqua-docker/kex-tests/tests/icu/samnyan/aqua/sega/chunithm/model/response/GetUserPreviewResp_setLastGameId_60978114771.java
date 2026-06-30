package icu.samnyan.aqua.sega.chunithm.model.response;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetUserPreviewResp_setLastGameId_60978114771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25983;

    public GetUserPreviewResp_setLastGameId_60978114771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25983 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term25983, term25983.getClass(), "userId", null);
        setBooleanField(term25983, term25983.getClass(), "isLogin", false);
        setField(term25983, term25983.getClass(), "lastLoginDate", null);
        setField(term25983, term25983.getClass(), "userName", null);
        setIntField(term25983, term25983.getClass(), "reincarnationNum", 0);
        setIntField(term25983, term25983.getClass(), "level", 0);
        setField(term25983, term25983.getClass(), "exp", null);
        setIntField(term25983, term25983.getClass(), "playerRating", 0);
        setField(term25983, term25983.getClass(), "lastGameId", null);
        setField(term25983, term25983.getClass(), "lastRomVersion", null);
        setField(term25983, term25983.getClass(), "lastDataVersion", null);
        setField(term25983, term25983.getClass(), "lastPlayDate", null);
        setIntField(term25983, term25983.getClass(), "trophyId", 0);
        setField(term25983, term25983.getClass(), "userCharacter", null);
        setIntField(term25983, term25983.getClass(), "playerLevel", 0);
        setIntField(term25983, term25983.getClass(), "rating", 0);
        setIntField(term25983, term25983.getClass(), "headphone", 0);
        setIntField(term25983, term25983.getClass(), "chargeState", 0);
        setField(term25983, term25983.getClass(), "userNameEx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastGameId", argTypes, term25983, args);
    }

};


