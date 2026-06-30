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

public class GetUserPreviewResp_setInherit_16743196040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30597;
     Object term30696;

    public GetUserPreviewResp_setInherit_16743196040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30597 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term30597, term30597.getClass(), "userId", 6951012907724798081L);
        setField(term30597, term30597.getClass(), "userName", "QTDAUOmsVV");
        setBooleanField(term30597, term30597.getClass(), "isLogin", true);
        setField(term30597, term30597.getClass(), "lastGameId", "ODrpsXzKlX");
        setField(term30597, term30597.getClass(), "lastDataVersion", "xxswizwuwy");
        setField(term30597, term30597.getClass(), "lastRomVersion", "QbkfeBvHco");
        setField(term30597, term30597.getClass(), "lastLoginDate", "lLaCGEQqCV");
        setField(term30597, term30597.getClass(), "lastPlayDate", "bYFQVigzOV");
        setIntField(term30597, term30597.getClass(), "playerRating", -385542140);
        setIntField(term30597, term30597.getClass(), "nameplateId", -1652323059);
        setIntField(term30597, term30597.getClass(), "iconId", -1928764789);
        setIntField(term30597, term30597.getClass(), "trophyId", -673697686);
        setIntField(term30597, term30597.getClass(), "partnerId", -757914190);
        setIntField(term30597, term30597.getClass(), "frameId", 991323397);
        setIntField(term30597, term30597.getClass(), "dispRate", -791114332);
        setIntField(term30597, term30597.getClass(), "totalAwake", 350325506);
        setIntField(term30597, term30597.getClass(), "isNetMember", -283849179);
        setField(term30597, term30597.getClass(), "dailyBonusDate", "TXKwwgcTVt");
        setIntField(term30597, term30597.getClass(), "headPhoneVolume", -966646503);
        setBooleanField(term30597, term30597.getClass(), "isInherit", true);
        setIntField(term30597, term30597.getClass(), "banState", 529842485);
        term30696 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term30696;
        callMethod(klass, "setInherit", argTypes, term30597, args);
    }

};


