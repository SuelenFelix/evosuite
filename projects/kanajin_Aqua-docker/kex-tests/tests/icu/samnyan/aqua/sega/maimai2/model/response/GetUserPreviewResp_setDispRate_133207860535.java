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

public class GetUserPreviewResp_setDispRate_133207860535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29722;
     Object term29821;

    public GetUserPreviewResp_setDispRate_133207860535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29722 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term29722, term29722.getClass(), "userId", 3524743556565317852L);
        setField(term29722, term29722.getClass(), "userName", "cUQuwEPzJb");
        setBooleanField(term29722, term29722.getClass(), "isLogin", false);
        setField(term29722, term29722.getClass(), "lastGameId", "sqPZeXSusM");
        setField(term29722, term29722.getClass(), "lastDataVersion", "mUCxMstoOT");
        setField(term29722, term29722.getClass(), "lastRomVersion", "LroMhmrHbv");
        setField(term29722, term29722.getClass(), "lastLoginDate", "nUWkEhozFC");
        setField(term29722, term29722.getClass(), "lastPlayDate", "cZOLUZUhxQ");
        setIntField(term29722, term29722.getClass(), "playerRating", -1750902922);
        setIntField(term29722, term29722.getClass(), "nameplateId", -1037994843);
        setIntField(term29722, term29722.getClass(), "iconId", 727200615);
        setIntField(term29722, term29722.getClass(), "trophyId", -308494890);
        setIntField(term29722, term29722.getClass(), "partnerId", -1113508392);
        setIntField(term29722, term29722.getClass(), "frameId", 31876246);
        setIntField(term29722, term29722.getClass(), "dispRate", 55952895);
        setIntField(term29722, term29722.getClass(), "totalAwake", -1961513935);
        setIntField(term29722, term29722.getClass(), "isNetMember", -22602260);
        setField(term29722, term29722.getClass(), "dailyBonusDate", "fXCybRqtsq");
        setIntField(term29722, term29722.getClass(), "headPhoneVolume", -1494996615);
        setBooleanField(term29722, term29722.getClass(), "isInherit", false);
        setIntField(term29722, term29722.getClass(), "banState", -686175319);
        term29821 = new Integer(-489193282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29821;
        callMethod(klass, "setDispRate", argTypes, term29722, args);
    }

};


