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

public class GetUserPreviewResp_setReincarnationNum_121041523267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25937;
     Object term25947;

    public GetUserPreviewResp_setReincarnationNum_121041523267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25937 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term25937, term25937.getClass(), "userId", null);
        setBooleanField(term25937, term25937.getClass(), "isLogin", false);
        setField(term25937, term25937.getClass(), "lastLoginDate", null);
        setField(term25937, term25937.getClass(), "userName", null);
        setIntField(term25937, term25937.getClass(), "reincarnationNum", 0);
        setIntField(term25937, term25937.getClass(), "level", 0);
        setField(term25937, term25937.getClass(), "exp", null);
        setIntField(term25937, term25937.getClass(), "playerRating", 0);
        setField(term25937, term25937.getClass(), "lastGameId", null);
        setField(term25937, term25937.getClass(), "lastRomVersion", null);
        setField(term25937, term25937.getClass(), "lastDataVersion", null);
        setField(term25937, term25937.getClass(), "lastPlayDate", null);
        setIntField(term25937, term25937.getClass(), "trophyId", 0);
        setField(term25937, term25937.getClass(), "userCharacter", null);
        setIntField(term25937, term25937.getClass(), "playerLevel", 0);
        setIntField(term25937, term25937.getClass(), "rating", 0);
        setIntField(term25937, term25937.getClass(), "headphone", 0);
        setIntField(term25937, term25937.getClass(), "chargeState", 0);
        setField(term25937, term25937.getClass(), "userNameEx", null);
        term25947 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25947;
        callMethod(klass, "setReincarnationNum", argTypes, term25937, args);
    }

};


