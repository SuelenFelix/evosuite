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
import java.lang.Boolean;

public class GetUserPreviewResp_setLogin_112839799423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27570;
     Object term27669;

    public GetUserPreviewResp_setLogin_112839799423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27570 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term27570, term27570.getClass(), "userId", -6677795573873753988L);
        setField(term27570, term27570.getClass(), "userName", "mvOJAtEcWR");
        setBooleanField(term27570, term27570.getClass(), "isLogin", false);
        setField(term27570, term27570.getClass(), "lastGameId", "QybezBkmJu");
        setField(term27570, term27570.getClass(), "lastDataVersion", "uWIrREgpjs");
        setField(term27570, term27570.getClass(), "lastRomVersion", "TmEdDFXkTZ");
        setField(term27570, term27570.getClass(), "lastLoginDate", "DjjdYbIhNY");
        setField(term27570, term27570.getClass(), "lastPlayDate", "AGaeaoutjJ");
        setIntField(term27570, term27570.getClass(), "playerRating", -1026369377);
        setIntField(term27570, term27570.getClass(), "nameplateId", 1373311750);
        setIntField(term27570, term27570.getClass(), "iconId", 1699366);
        setIntField(term27570, term27570.getClass(), "trophyId", 692170348);
        setIntField(term27570, term27570.getClass(), "partnerId", -1022512329);
        setIntField(term27570, term27570.getClass(), "frameId", 201236178);
        setIntField(term27570, term27570.getClass(), "dispRate", 985775690);
        setIntField(term27570, term27570.getClass(), "totalAwake", 1159262757);
        setIntField(term27570, term27570.getClass(), "isNetMember", 967155072);
        setField(term27570, term27570.getClass(), "dailyBonusDate", "oHWSUbpGiK");
        setIntField(term27570, term27570.getClass(), "headPhoneVolume", 1011025023);
        setBooleanField(term27570, term27570.getClass(), "isInherit", false);
        setIntField(term27570, term27570.getClass(), "banState", 921803217);
        term27669 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term27669;
        callMethod(klass, "setLogin", argTypes, term27570, args);
    }

};


