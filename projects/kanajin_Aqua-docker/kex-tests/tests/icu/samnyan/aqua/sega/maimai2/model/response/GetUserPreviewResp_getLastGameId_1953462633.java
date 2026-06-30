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

public class GetUserPreviewResp_getLastGameId_1953462633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24166;

    public GetUserPreviewResp_getLastGameId_1953462633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24166 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term24166, term24166.getClass(), "userId", 2253264840516591315L);
        setField(term24166, term24166.getClass(), "userName", "AibUFEALwF");
        setBooleanField(term24166, term24166.getClass(), "isLogin", true);
        setField(term24166, term24166.getClass(), "lastGameId", "eXOUrXTrdW");
        setField(term24166, term24166.getClass(), "lastDataVersion", "aomDEETHep");
        setField(term24166, term24166.getClass(), "lastRomVersion", "GTMrlIYfIM");
        setField(term24166, term24166.getClass(), "lastLoginDate", "eiDqCOWbLE");
        setField(term24166, term24166.getClass(), "lastPlayDate", "OBbbsrFNxC");
        setIntField(term24166, term24166.getClass(), "playerRating", 1522532191);
        setIntField(term24166, term24166.getClass(), "nameplateId", 137516958);
        setIntField(term24166, term24166.getClass(), "iconId", -1233770688);
        setIntField(term24166, term24166.getClass(), "trophyId", 722935077);
        setIntField(term24166, term24166.getClass(), "partnerId", -304660297);
        setIntField(term24166, term24166.getClass(), "frameId", 1530655970);
        setIntField(term24166, term24166.getClass(), "dispRate", -154857398);
        setIntField(term24166, term24166.getClass(), "totalAwake", 385239631);
        setIntField(term24166, term24166.getClass(), "isNetMember", 836211088);
        setField(term24166, term24166.getClass(), "dailyBonusDate", "mvdZyohjrq");
        setIntField(term24166, term24166.getClass(), "headPhoneVolume", -365730201);
        setBooleanField(term24166, term24166.getClass(), "isInherit", false);
        setIntField(term24166, term24166.getClass(), "banState", -1218078298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastGameId", argTypes, term24166, args);
    }

};


