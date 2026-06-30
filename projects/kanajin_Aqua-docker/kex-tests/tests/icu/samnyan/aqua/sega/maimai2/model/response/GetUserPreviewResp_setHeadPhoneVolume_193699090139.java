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

public class GetUserPreviewResp_setHeadPhoneVolume_193699090139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30426;
     Object term30525;

    public GetUserPreviewResp_setHeadPhoneVolume_193699090139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30426 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term30426, term30426.getClass(), "userId", 4662333912633380472L);
        setField(term30426, term30426.getClass(), "userName", "XRhNVGJlMP");
        setBooleanField(term30426, term30426.getClass(), "isLogin", false);
        setField(term30426, term30426.getClass(), "lastGameId", "OGvydrXtac");
        setField(term30426, term30426.getClass(), "lastDataVersion", "SaPfgULGFp");
        setField(term30426, term30426.getClass(), "lastRomVersion", "olLmzJWshP");
        setField(term30426, term30426.getClass(), "lastLoginDate", "VbgHjUqRYR");
        setField(term30426, term30426.getClass(), "lastPlayDate", "qZzSujRYqy");
        setIntField(term30426, term30426.getClass(), "playerRating", -699487881);
        setIntField(term30426, term30426.getClass(), "nameplateId", 562568318);
        setIntField(term30426, term30426.getClass(), "iconId", 297158063);
        setIntField(term30426, term30426.getClass(), "trophyId", -38995653);
        setIntField(term30426, term30426.getClass(), "partnerId", -1893842770);
        setIntField(term30426, term30426.getClass(), "frameId", 2048873968);
        setIntField(term30426, term30426.getClass(), "dispRate", -1447906264);
        setIntField(term30426, term30426.getClass(), "totalAwake", 1527786708);
        setIntField(term30426, term30426.getClass(), "isNetMember", -360741897);
        setField(term30426, term30426.getClass(), "dailyBonusDate", "IJXeeXjhgd");
        setIntField(term30426, term30426.getClass(), "headPhoneVolume", 1762652682);
        setBooleanField(term30426, term30426.getClass(), "isInherit", false);
        setIntField(term30426, term30426.getClass(), "banState", 1760408647);
        term30525 = new Integer(-1334125536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30525;
        callMethod(klass, "setHeadPhoneVolume", argTypes, term30426, args);
    }

};


