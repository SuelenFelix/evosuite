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

public class GetUserPreviewResp_setUserName_51776447617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5016;

    public GetUserPreviewResp_setUserName_51776447617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5017 = new Long(0L);
        term5016 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term5016, term5016.getClass(), "userId", term5017);
        setField(term5016, term5016.getClass(), "userName", "");
        setBooleanField(term5016, term5016.getClass(), "isLogin", false);
        setIntField(term5016, term5016.getClass(), "lastDataVersion", -1604942135);
        setField(term5016, term5016.getClass(), "lastLoginDate", "SScVQYSvWH");
        setField(term5016, term5016.getClass(), "lastPlayDate", "MnovcqFhCl");
        setIntField(term5016, term5016.getClass(), "playerRating", 2000275611);
        setIntField(term5016, term5016.getClass(), "nameplateId", 2060369122);
        setIntField(term5016, term5016.getClass(), "frameId", -1275204506);
        setIntField(term5016, term5016.getClass(), "iconId", 507439888);
        setIntField(term5016, term5016.getClass(), "trophyId", 1936798149);
        setIntField(term5016, term5016.getClass(), "dispRate", 1);
        setIntField(term5016, term5016.getClass(), "dispRank", 1);
        setIntField(term5016, term5016.getClass(), "dispHomeRanker", 1);
        setIntField(term5016, term5016.getClass(), "dispTotalLv", 1);
        setIntField(term5016, term5016.getClass(), "totalLv", 188304401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qYtAeLzOhW";
        callMethod(klass, "setUserName", argTypes, term5016, args);
    }

};


