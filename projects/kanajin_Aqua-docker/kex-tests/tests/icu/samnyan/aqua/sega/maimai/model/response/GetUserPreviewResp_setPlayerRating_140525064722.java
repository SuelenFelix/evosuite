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

public class GetUserPreviewResp_setPlayerRating_140525064722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5391;
     Object term5432;

    public GetUserPreviewResp_setPlayerRating_140525064722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5392 = new Long(0L);
        term5391 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term5391, term5391.getClass(), "userId", term5392);
        setField(term5391, term5391.getClass(), "userName", "");
        setBooleanField(term5391, term5391.getClass(), "isLogin", false);
        setIntField(term5391, term5391.getClass(), "lastDataVersion", 1075321384);
        setField(term5391, term5391.getClass(), "lastLoginDate", "YsUtbngnRO");
        setField(term5391, term5391.getClass(), "lastPlayDate", "JisaWUxcNb");
        setIntField(term5391, term5391.getClass(), "playerRating", -1726073541);
        setIntField(term5391, term5391.getClass(), "nameplateId", 406945977);
        setIntField(term5391, term5391.getClass(), "frameId", 493657684);
        setIntField(term5391, term5391.getClass(), "iconId", 1882655922);
        setIntField(term5391, term5391.getClass(), "trophyId", 1314996390);
        setIntField(term5391, term5391.getClass(), "dispRate", 1);
        setIntField(term5391, term5391.getClass(), "dispRank", 1);
        setIntField(term5391, term5391.getClass(), "dispHomeRanker", 1);
        setIntField(term5391, term5391.getClass(), "dispTotalLv", 1);
        setIntField(term5391, term5391.getClass(), "totalLv", 1367703658);
        term5432 = new Integer(1120153100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5432;
        callMethod(klass, "setPlayerRating", argTypes, term5391, args);
    }

};


