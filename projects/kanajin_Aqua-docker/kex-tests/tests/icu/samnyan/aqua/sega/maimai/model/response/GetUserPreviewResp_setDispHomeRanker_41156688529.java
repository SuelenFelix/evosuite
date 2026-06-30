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

public class GetUserPreviewResp_setDispHomeRanker_41156688529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5832;
     Object term5873;

    public GetUserPreviewResp_setDispHomeRanker_41156688529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5833 = new Long(0L);
        term5832 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term5832, term5832.getClass(), "userId", term5833);
        setField(term5832, term5832.getClass(), "userName", "");
        setBooleanField(term5832, term5832.getClass(), "isLogin", false);
        setIntField(term5832, term5832.getClass(), "lastDataVersion", -438794741);
        setField(term5832, term5832.getClass(), "lastLoginDate", "mKaHyMybrK");
        setField(term5832, term5832.getClass(), "lastPlayDate", "AyrEXuGrEj");
        setIntField(term5832, term5832.getClass(), "playerRating", -1400834481);
        setIntField(term5832, term5832.getClass(), "nameplateId", 957091706);
        setIntField(term5832, term5832.getClass(), "frameId", -2011802805);
        setIntField(term5832, term5832.getClass(), "iconId", -1683802689);
        setIntField(term5832, term5832.getClass(), "trophyId", -1949346221);
        setIntField(term5832, term5832.getClass(), "dispRate", 1);
        setIntField(term5832, term5832.getClass(), "dispRank", 1);
        setIntField(term5832, term5832.getClass(), "dispHomeRanker", 1);
        setIntField(term5832, term5832.getClass(), "dispTotalLv", 1);
        setIntField(term5832, term5832.getClass(), "totalLv", 831638391);
        term5873 = new Integer(-1184374392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5873;
        callMethod(klass, "setDispHomeRanker", argTypes, term5832, args);
    }

};


