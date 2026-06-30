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

public class GetUserPreviewResp_hashCode_191366774484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26123;

    public GetUserPreviewResp_hashCode_191366774484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26123 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term26123, term26123.getClass(), "userId", null);
        setBooleanField(term26123, term26123.getClass(), "isLogin", false);
        setField(term26123, term26123.getClass(), "lastLoginDate", null);
        setField(term26123, term26123.getClass(), "userName", null);
        setIntField(term26123, term26123.getClass(), "reincarnationNum", 0);
        setIntField(term26123, term26123.getClass(), "level", 0);
        setField(term26123, term26123.getClass(), "exp", null);
        setIntField(term26123, term26123.getClass(), "playerRating", 0);
        setField(term26123, term26123.getClass(), "lastGameId", null);
        setField(term26123, term26123.getClass(), "lastRomVersion", null);
        setField(term26123, term26123.getClass(), "lastDataVersion", null);
        setField(term26123, term26123.getClass(), "lastPlayDate", null);
        setIntField(term26123, term26123.getClass(), "trophyId", 0);
        setField(term26123, term26123.getClass(), "userCharacter", null);
        setIntField(term26123, term26123.getClass(), "playerLevel", 0);
        setIntField(term26123, term26123.getClass(), "rating", 0);
        setIntField(term26123, term26123.getClass(), "headphone", 0);
        setIntField(term26123, term26123.getClass(), "chargeState", 0);
        setField(term26123, term26123.getClass(), "userNameEx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term26123, args);
    }

};


