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

public class GetUserPreviewResp_setBanState_151715329941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30768;
     Object term30867;

    public GetUserPreviewResp_setBanState_151715329941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30768 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term30768, term30768.getClass(), "userId", 1454269751791376609L);
        setField(term30768, term30768.getClass(), "userName", "FgaHDSytdu");
        setBooleanField(term30768, term30768.getClass(), "isLogin", false);
        setField(term30768, term30768.getClass(), "lastGameId", "cmIDVqeLNI");
        setField(term30768, term30768.getClass(), "lastDataVersion", "XoYlWxsjIF");
        setField(term30768, term30768.getClass(), "lastRomVersion", "xkIacuRHpE");
        setField(term30768, term30768.getClass(), "lastLoginDate", "xFULXQCABK");
        setField(term30768, term30768.getClass(), "lastPlayDate", "ONotPjASxK");
        setIntField(term30768, term30768.getClass(), "playerRating", -713215300);
        setIntField(term30768, term30768.getClass(), "nameplateId", -82690767);
        setIntField(term30768, term30768.getClass(), "iconId", 1511625253);
        setIntField(term30768, term30768.getClass(), "trophyId", 2133047515);
        setIntField(term30768, term30768.getClass(), "partnerId", 1448469662);
        setIntField(term30768, term30768.getClass(), "frameId", -391447045);
        setIntField(term30768, term30768.getClass(), "dispRate", -396759931);
        setIntField(term30768, term30768.getClass(), "totalAwake", 85098350);
        setIntField(term30768, term30768.getClass(), "isNetMember", 1519270868);
        setField(term30768, term30768.getClass(), "dailyBonusDate", "LzgtTgYOFG");
        setIntField(term30768, term30768.getClass(), "headPhoneVolume", -1307675168);
        setBooleanField(term30768, term30768.getClass(), "isInherit", true);
        setIntField(term30768, term30768.getClass(), "banState", 550509363);
        term30867 = new Integer(1200406150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30867;
        callMethod(klass, "setBanState", argTypes, term30768, args);
    }

};


