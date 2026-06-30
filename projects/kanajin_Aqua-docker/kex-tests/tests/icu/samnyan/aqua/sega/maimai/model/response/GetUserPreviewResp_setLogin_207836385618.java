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
import java.lang.Boolean;

public class GetUserPreviewResp_setLogin_207836385618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5099;
     Object term5140;

    public GetUserPreviewResp_setLogin_207836385618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5100 = new Long(0L);
        term5099 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term5099, term5099.getClass(), "userId", term5100);
        setField(term5099, term5099.getClass(), "userName", "");
        setBooleanField(term5099, term5099.getClass(), "isLogin", false);
        setIntField(term5099, term5099.getClass(), "lastDataVersion", -40613160);
        setField(term5099, term5099.getClass(), "lastLoginDate", "tJzmOfcUnY");
        setField(term5099, term5099.getClass(), "lastPlayDate", "TKlccZUpjz");
        setIntField(term5099, term5099.getClass(), "playerRating", 1359973218);
        setIntField(term5099, term5099.getClass(), "nameplateId", -218759803);
        setIntField(term5099, term5099.getClass(), "frameId", 1288936083);
        setIntField(term5099, term5099.getClass(), "iconId", 4086209);
        setIntField(term5099, term5099.getClass(), "trophyId", 300964556);
        setIntField(term5099, term5099.getClass(), "dispRate", 1);
        setIntField(term5099, term5099.getClass(), "dispRank", 1);
        setIntField(term5099, term5099.getClass(), "dispHomeRanker", 1);
        setIntField(term5099, term5099.getClass(), "dispTotalLv", 1);
        setIntField(term5099, term5099.getClass(), "totalLv", -958207893);
        term5140 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5140;
        callMethod(klass, "setLogin", argTypes, term5099, args);
    }

};


