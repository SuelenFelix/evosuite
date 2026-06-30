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

public class GetUserPreviewResp_getIconId_983667819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4526;

    public GetUserPreviewResp_getIconId_983667819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4527 = new Long(0L);
        term4526 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4526, term4526.getClass(), "userId", term4527);
        setField(term4526, term4526.getClass(), "userName", "");
        setBooleanField(term4526, term4526.getClass(), "isLogin", false);
        setIntField(term4526, term4526.getClass(), "lastDataVersion", -353671511);
        setField(term4526, term4526.getClass(), "lastLoginDate", "vSeruUyNWX");
        setField(term4526, term4526.getClass(), "lastPlayDate", "UkKvaeJfEC");
        setIntField(term4526, term4526.getClass(), "playerRating", 1598831363);
        setIntField(term4526, term4526.getClass(), "nameplateId", -690367798);
        setIntField(term4526, term4526.getClass(), "frameId", 1863738073);
        setIntField(term4526, term4526.getClass(), "iconId", 2009028243);
        setIntField(term4526, term4526.getClass(), "trophyId", 1900131331);
        setIntField(term4526, term4526.getClass(), "dispRate", 1);
        setIntField(term4526, term4526.getClass(), "dispRank", 1);
        setIntField(term4526, term4526.getClass(), "dispHomeRanker", 1);
        setIntField(term4526, term4526.getClass(), "dispTotalLv", 1);
        setIntField(term4526, term4526.getClass(), "totalLv", -1489604464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIconId", argTypes, term4526, args);
    }

};


