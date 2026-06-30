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
import java.lang.Integer;

public class GetUserPreviewResp_setLevel_46319922968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25949;
     Object term25959;

    public GetUserPreviewResp_setLevel_46319922968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25949 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term25949, term25949.getClass(), "userId", null);
        setBooleanField(term25949, term25949.getClass(), "isLogin", false);
        setField(term25949, term25949.getClass(), "lastLoginDate", null);
        setField(term25949, term25949.getClass(), "userName", null);
        setIntField(term25949, term25949.getClass(), "reincarnationNum", 0);
        setIntField(term25949, term25949.getClass(), "level", 0);
        setField(term25949, term25949.getClass(), "exp", null);
        setIntField(term25949, term25949.getClass(), "playerRating", 0);
        setField(term25949, term25949.getClass(), "lastGameId", null);
        setField(term25949, term25949.getClass(), "lastRomVersion", null);
        setField(term25949, term25949.getClass(), "lastDataVersion", null);
        setField(term25949, term25949.getClass(), "lastPlayDate", null);
        setIntField(term25949, term25949.getClass(), "trophyId", 0);
        setField(term25949, term25949.getClass(), "userCharacter", null);
        setIntField(term25949, term25949.getClass(), "playerLevel", 0);
        setIntField(term25949, term25949.getClass(), "rating", 0);
        setIntField(term25949, term25949.getClass(), "headphone", 0);
        setIntField(term25949, term25949.getClass(), "chargeState", 0);
        setField(term25949, term25949.getClass(), "userNameEx", null);
        term25959 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25959;
        callMethod(klass, "setLevel", argTypes, term25949, args);
    }

};


