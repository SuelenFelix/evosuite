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

public class GetUserPreviewResp_getFrameId_38211956313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25856;

    public GetUserPreviewResp_getFrameId_38211956313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25856 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term25856, term25856.getClass(), "userId", -5051305828138891800L);
        setField(term25856, term25856.getClass(), "userName", "PxGAOnzJzj");
        setBooleanField(term25856, term25856.getClass(), "isLogin", false);
        setField(term25856, term25856.getClass(), "lastGameId", "fQVSHtJlDS");
        setField(term25856, term25856.getClass(), "lastDataVersion", "CGdXCWNTxp");
        setField(term25856, term25856.getClass(), "lastRomVersion", "TUBgEnrcjn");
        setField(term25856, term25856.getClass(), "lastLoginDate", "eUhEGNLBOk");
        setField(term25856, term25856.getClass(), "lastPlayDate", "UrLisdyvVs");
        setIntField(term25856, term25856.getClass(), "playerRating", -1791932674);
        setIntField(term25856, term25856.getClass(), "nameplateId", -2069953525);
        setIntField(term25856, term25856.getClass(), "iconId", -1911653858);
        setIntField(term25856, term25856.getClass(), "trophyId", 1817540520);
        setIntField(term25856, term25856.getClass(), "partnerId", 83060289);
        setIntField(term25856, term25856.getClass(), "frameId", -2109132583);
        setIntField(term25856, term25856.getClass(), "dispRate", -1992824713);
        setIntField(term25856, term25856.getClass(), "totalAwake", 1482207601);
        setIntField(term25856, term25856.getClass(), "isNetMember", 1943923769);
        setField(term25856, term25856.getClass(), "dailyBonusDate", "VckRXyiShh");
        setIntField(term25856, term25856.getClass(), "headPhoneVolume", 125133530);
        setBooleanField(term25856, term25856.getClass(), "isInherit", false);
        setIntField(term25856, term25856.getClass(), "banState", -1931017542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrameId", argTypes, term25856, args);
    }

};


