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

public class GetUserPreviewResp_isInherit_53202639019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26870;

    public GetUserPreviewResp_isInherit_53202639019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26870 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term26870, term26870.getClass(), "userId", -292696468317320629L);
        setField(term26870, term26870.getClass(), "userName", "hpvoFaAyIu");
        setBooleanField(term26870, term26870.getClass(), "isLogin", true);
        setField(term26870, term26870.getClass(), "lastGameId", "dyqukIBJxC");
        setField(term26870, term26870.getClass(), "lastDataVersion", "MVMiGQdgnX");
        setField(term26870, term26870.getClass(), "lastRomVersion", "cQnJIENJHe");
        setField(term26870, term26870.getClass(), "lastLoginDate", "ExjdCvAxlG");
        setField(term26870, term26870.getClass(), "lastPlayDate", "moMySSiBuB");
        setIntField(term26870, term26870.getClass(), "playerRating", -1998048906);
        setIntField(term26870, term26870.getClass(), "nameplateId", -1915332852);
        setIntField(term26870, term26870.getClass(), "iconId", 1603272771);
        setIntField(term26870, term26870.getClass(), "trophyId", -1169796605);
        setIntField(term26870, term26870.getClass(), "partnerId", 1294129760);
        setIntField(term26870, term26870.getClass(), "frameId", -1042003821);
        setIntField(term26870, term26870.getClass(), "dispRate", 1800189572);
        setIntField(term26870, term26870.getClass(), "totalAwake", -555300889);
        setIntField(term26870, term26870.getClass(), "isNetMember", -319938895);
        setField(term26870, term26870.getClass(), "dailyBonusDate", "iuuazALDWB");
        setIntField(term26870, term26870.getClass(), "headPhoneVolume", -529078248);
        setBooleanField(term26870, term26870.getClass(), "isInherit", false);
        setIntField(term26870, term26870.getClass(), "banState", 2125754107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInherit", argTypes, term26870, args);
    }

};


