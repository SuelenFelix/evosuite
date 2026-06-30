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

public class GetUserPreviewResp_setUserCharacter_26369143276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26035;

    public GetUserPreviewResp_setUserCharacter_26369143276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26035 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term26035, term26035.getClass(), "userId", null);
        setBooleanField(term26035, term26035.getClass(), "isLogin", false);
        setField(term26035, term26035.getClass(), "lastLoginDate", null);
        setField(term26035, term26035.getClass(), "userName", null);
        setIntField(term26035, term26035.getClass(), "reincarnationNum", 0);
        setIntField(term26035, term26035.getClass(), "level", 0);
        setField(term26035, term26035.getClass(), "exp", null);
        setIntField(term26035, term26035.getClass(), "playerRating", 0);
        setField(term26035, term26035.getClass(), "lastGameId", null);
        setField(term26035, term26035.getClass(), "lastRomVersion", null);
        setField(term26035, term26035.getClass(), "lastDataVersion", null);
        setField(term26035, term26035.getClass(), "lastPlayDate", null);
        setIntField(term26035, term26035.getClass(), "trophyId", 0);
        setField(term26035, term26035.getClass(), "userCharacter", null);
        setIntField(term26035, term26035.getClass(), "playerLevel", 0);
        setIntField(term26035, term26035.getClass(), "rating", 0);
        setIntField(term26035, term26035.getClass(), "headphone", 0);
        setIntField(term26035, term26035.getClass(), "chargeState", 0);
        setField(term26035, term26035.getClass(), "userNameEx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserCharacter", argTypes, term26035, args);
    }

};


