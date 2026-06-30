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

public class GetUserPreviewResp_setNameplateId_6578996578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32255;
     Object term32270;

    public GetUserPreviewResp_setNameplateId_6578996578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32255 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term32255, term32255.getClass(), "userId", 0L);
        setField(term32255, term32255.getClass(), "userName", null);
        setBooleanField(term32255, term32255.getClass(), "isLogin", false);
        setField(term32255, term32255.getClass(), "lastGameId", null);
        setField(term32255, term32255.getClass(), "lastDataVersion", null);
        setField(term32255, term32255.getClass(), "lastRomVersion", null);
        setField(term32255, term32255.getClass(), "lastLoginDate", null);
        setField(term32255, term32255.getClass(), "lastPlayDate", null);
        setIntField(term32255, term32255.getClass(), "playerRating", 0);
        setIntField(term32255, term32255.getClass(), "nameplateId", 0);
        setIntField(term32255, term32255.getClass(), "iconId", 0);
        setIntField(term32255, term32255.getClass(), "trophyId", 0);
        setIntField(term32255, term32255.getClass(), "partnerId", 0);
        setIntField(term32255, term32255.getClass(), "frameId", 0);
        setIntField(term32255, term32255.getClass(), "dispRate", 0);
        setIntField(term32255, term32255.getClass(), "totalAwake", 0);
        setIntField(term32255, term32255.getClass(), "isNetMember", 0);
        setField(term32255, term32255.getClass(), "dailyBonusDate", null);
        setIntField(term32255, term32255.getClass(), "headPhoneVolume", 0);
        setBooleanField(term32255, term32255.getClass(), "isInherit", false);
        setIntField(term32255, term32255.getClass(), "banState", 0);
        term32270 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32270;
        callMethod(klass, "setNameplateId", argTypes, term32255, args);
    }

};


