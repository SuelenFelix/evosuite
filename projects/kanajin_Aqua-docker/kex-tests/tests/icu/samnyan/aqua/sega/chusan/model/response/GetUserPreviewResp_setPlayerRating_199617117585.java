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

public class GetUserPreviewResp_setPlayerRating_199617117585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52982;
     Object term52997;

    public GetUserPreviewResp_setPlayerRating_199617117585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52982 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term52982, term52982.getClass(), "userId", null);
        setBooleanField(term52982, term52982.getClass(), "isLogin", false);
        setField(term52982, term52982.getClass(), "lastLoginDate", null);
        setField(term52982, term52982.getClass(), "userName", null);
        setIntField(term52982, term52982.getClass(), "reincarnationNum", 0);
        setIntField(term52982, term52982.getClass(), "level", 0);
        setField(term52982, term52982.getClass(), "exp", null);
        setIntField(term52982, term52982.getClass(), "playerRating", 0);
        setField(term52982, term52982.getClass(), "lastGameId", null);
        setField(term52982, term52982.getClass(), "lastRomVersion", null);
        setField(term52982, term52982.getClass(), "lastDataVersion", null);
        setField(term52982, term52982.getClass(), "lastPlayDate", null);
        setIntField(term52982, term52982.getClass(), "emoneyBrandId", 0);
        setIntField(term52982, term52982.getClass(), "trophyId", 0);
        setField(term52982, term52982.getClass(), "userCharacter", null);
        setIntField(term52982, term52982.getClass(), "playerLevel", 0);
        setIntField(term52982, term52982.getClass(), "rating", 0);
        setIntField(term52982, term52982.getClass(), "headphone", 0);
        setIntField(term52982, term52982.getClass(), "chargeState", 0);
        setField(term52982, term52982.getClass(), "userNameEx", null);
        setIntField(term52982, term52982.getClass(), "banState", 0);
        setIntField(term52982, term52982.getClass(), "classEmblemMedal", 0);
        setIntField(term52982, term52982.getClass(), "classEmblemBase", 0);
        setIntField(term52982, term52982.getClass(), "battleRankId", 0);
        term52997 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52997;
        callMethod(klass, "setPlayerRating", argTypes, term52982, args);
    }

};


