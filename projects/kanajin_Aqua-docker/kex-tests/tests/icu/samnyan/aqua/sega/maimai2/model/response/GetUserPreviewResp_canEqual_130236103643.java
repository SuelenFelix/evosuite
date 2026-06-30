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

public class GetUserPreviewResp_canEqual_130236103643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31109;
     Object term31208;

    public GetUserPreviewResp_canEqual_130236103643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31109 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term31109, term31109.getClass(), "userId", 7080612204208157613L);
        setField(term31109, term31109.getClass(), "userName", "KuunqhygWm");
        setBooleanField(term31109, term31109.getClass(), "isLogin", false);
        setField(term31109, term31109.getClass(), "lastGameId", "wKOfSnwiZS");
        setField(term31109, term31109.getClass(), "lastDataVersion", "oIlPhWewqE");
        setField(term31109, term31109.getClass(), "lastRomVersion", "IfOJiWUkHp");
        setField(term31109, term31109.getClass(), "lastLoginDate", "YQNWnfnWil");
        setField(term31109, term31109.getClass(), "lastPlayDate", "ChmRdUmCnQ");
        setIntField(term31109, term31109.getClass(), "playerRating", 2014370043);
        setIntField(term31109, term31109.getClass(), "nameplateId", 2086898490);
        setIntField(term31109, term31109.getClass(), "iconId", -556807183);
        setIntField(term31109, term31109.getClass(), "trophyId", 2079852711);
        setIntField(term31109, term31109.getClass(), "partnerId", -1960722897);
        setIntField(term31109, term31109.getClass(), "frameId", 2058852943);
        setIntField(term31109, term31109.getClass(), "dispRate", 1189778174);
        setIntField(term31109, term31109.getClass(), "totalAwake", 1980524877);
        setIntField(term31109, term31109.getClass(), "isNetMember", 1572487602);
        setField(term31109, term31109.getClass(), "dailyBonusDate", "WbDSdFiKLp");
        setIntField(term31109, term31109.getClass(), "headPhoneVolume", 354453982);
        setBooleanField(term31109, term31109.getClass(), "isInherit", false);
        setIntField(term31109, term31109.getClass(), "banState", 791608608);
        term31208 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term31208;
        callMethod(klass, "canEqual", argTypes, term31109, args);
    }

};


