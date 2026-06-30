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
import java.lang.Integer;

public class GetUserPreviewResp_setNameplateId_115399541161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6664;
     Object term6677;

    public GetUserPreviewResp_setNameplateId_115399541161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6664 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term6664, term6664.getClass(), "userId", null);
        setField(term6664, term6664.getClass(), "userName", null);
        setBooleanField(term6664, term6664.getClass(), "isLogin", false);
        setIntField(term6664, term6664.getClass(), "lastDataVersion", 0);
        setField(term6664, term6664.getClass(), "lastLoginDate", null);
        setField(term6664, term6664.getClass(), "lastPlayDate", null);
        setIntField(term6664, term6664.getClass(), "playerRating", 0);
        setIntField(term6664, term6664.getClass(), "nameplateId", 0);
        setIntField(term6664, term6664.getClass(), "frameId", 0);
        setIntField(term6664, term6664.getClass(), "iconId", 0);
        setIntField(term6664, term6664.getClass(), "trophyId", 0);
        setIntField(term6664, term6664.getClass(), "dispRate", 0);
        setIntField(term6664, term6664.getClass(), "dispRank", 0);
        setIntField(term6664, term6664.getClass(), "dispHomeRanker", 0);
        setIntField(term6664, term6664.getClass(), "dispTotalLv", 0);
        setIntField(term6664, term6664.getClass(), "totalLv", 0);
        term6677 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6677;
        callMethod(klass, "setNameplateId", argTypes, term6664, args);
    }

};


