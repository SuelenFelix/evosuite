package icu.samnyan.aqua.sega.chusan.model.response;

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
import static icu.samnyan.aqua.sega.chusan.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GetUserPreviewResp_setEmoneyBrandId_208349709090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53059;
     Object term53074;

    public GetUserPreviewResp_setEmoneyBrandId_208349709090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53059 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term53059, term53059.getClass(), "userId", null);
        setBooleanField(term53059, term53059.getClass(), "isLogin", false);
        setField(term53059, term53059.getClass(), "lastLoginDate", null);
        setField(term53059, term53059.getClass(), "userName", null);
        setIntField(term53059, term53059.getClass(), "reincarnationNum", 0);
        setIntField(term53059, term53059.getClass(), "level", 0);
        setField(term53059, term53059.getClass(), "exp", null);
        setIntField(term53059, term53059.getClass(), "playerRating", 0);
        setField(term53059, term53059.getClass(), "lastGameId", null);
        setField(term53059, term53059.getClass(), "lastRomVersion", null);
        setField(term53059, term53059.getClass(), "lastDataVersion", null);
        setField(term53059, term53059.getClass(), "lastPlayDate", null);
        setIntField(term53059, term53059.getClass(), "emoneyBrandId", 0);
        setIntField(term53059, term53059.getClass(), "trophyId", 0);
        setField(term53059, term53059.getClass(), "userCharacter", null);
        setIntField(term53059, term53059.getClass(), "playerLevel", 0);
        setIntField(term53059, term53059.getClass(), "rating", 0);
        setIntField(term53059, term53059.getClass(), "headphone", 0);
        setIntField(term53059, term53059.getClass(), "chargeState", 0);
        setField(term53059, term53059.getClass(), "userNameEx", null);
        setIntField(term53059, term53059.getClass(), "banState", 0);
        setIntField(term53059, term53059.getClass(), "classEmblemMedal", 0);
        setIntField(term53059, term53059.getClass(), "classEmblemBase", 0);
        setIntField(term53059, term53059.getClass(), "battleRankId", 0);
        term53074 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53074;
        callMethod(klass, "setEmoneyBrandId", argTypes, term53059, args);
    }

};


