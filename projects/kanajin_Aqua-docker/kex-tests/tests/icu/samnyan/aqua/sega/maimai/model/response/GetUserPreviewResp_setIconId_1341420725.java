package icu.samnyan.aqua.sega.maimai.model.response;

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
import static icu.samnyan.aqua.sega.maimai.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class GetUserPreviewResp_setIconId_1341420725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5580;
     Object term5621;

    public GetUserPreviewResp_setIconId_1341420725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5581 = new Long(0L);
        term5580 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term5580, term5580.getClass(), "userId", term5581);
        setField(term5580, term5580.getClass(), "userName", "");
        setBooleanField(term5580, term5580.getClass(), "isLogin", false);
        setIntField(term5580, term5580.getClass(), "lastDataVersion", 395074450);
        setField(term5580, term5580.getClass(), "lastLoginDate", "FlHzxEfFzI");
        setField(term5580, term5580.getClass(), "lastPlayDate", "aSATgQUpoe");
        setIntField(term5580, term5580.getClass(), "playerRating", -2028511200);
        setIntField(term5580, term5580.getClass(), "nameplateId", 1415605360);
        setIntField(term5580, term5580.getClass(), "frameId", 896275171);
        setIntField(term5580, term5580.getClass(), "iconId", 466010);
        setIntField(term5580, term5580.getClass(), "trophyId", -169463842);
        setIntField(term5580, term5580.getClass(), "dispRate", 1);
        setIntField(term5580, term5580.getClass(), "dispRank", 1);
        setIntField(term5580, term5580.getClass(), "dispHomeRanker", 1);
        setIntField(term5580, term5580.getClass(), "dispTotalLv", 1);
        setIntField(term5580, term5580.getClass(), "totalLv", -2106837394);
        term5621 = new Integer(-533202192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5621;
        callMethod(klass, "setIconId", argTypes, term5580, args);
    }

};


