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

public class GetUserPreviewResp_setIconId_110161965331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29038;
     Object term29137;

    public GetUserPreviewResp_setIconId_110161965331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29038 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term29038, term29038.getClass(), "userId", -7871012741246584386L);
        setField(term29038, term29038.getClass(), "userName", "lktYSRAAkX");
        setBooleanField(term29038, term29038.getClass(), "isLogin", false);
        setField(term29038, term29038.getClass(), "lastGameId", "KmbCndAIRO");
        setField(term29038, term29038.getClass(), "lastDataVersion", "LfLWkWgTGE");
        setField(term29038, term29038.getClass(), "lastRomVersion", "uleoYrEbgk");
        setField(term29038, term29038.getClass(), "lastLoginDate", "JINAWGBEol");
        setField(term29038, term29038.getClass(), "lastPlayDate", "HZRzxVDGhV");
        setIntField(term29038, term29038.getClass(), "playerRating", 1117186881);
        setIntField(term29038, term29038.getClass(), "nameplateId", -116229778);
        setIntField(term29038, term29038.getClass(), "iconId", 1102287982);
        setIntField(term29038, term29038.getClass(), "trophyId", 82817178);
        setIntField(term29038, term29038.getClass(), "partnerId", 1619985605);
        setIntField(term29038, term29038.getClass(), "frameId", -1020794327);
        setIntField(term29038, term29038.getClass(), "dispRate", 719987081);
        setIntField(term29038, term29038.getClass(), "totalAwake", -1306969788);
        setIntField(term29038, term29038.getClass(), "isNetMember", -272419076);
        setField(term29038, term29038.getClass(), "dailyBonusDate", "wOWOSBOjln");
        setIntField(term29038, term29038.getClass(), "headPhoneVolume", -1366102520);
        setBooleanField(term29038, term29038.getClass(), "isInherit", true);
        setIntField(term29038, term29038.getClass(), "banState", -991083478);
        term29137 = new Integer(-1423864560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29137;
        callMethod(klass, "setIconId", argTypes, term29038, args);
    }

};


