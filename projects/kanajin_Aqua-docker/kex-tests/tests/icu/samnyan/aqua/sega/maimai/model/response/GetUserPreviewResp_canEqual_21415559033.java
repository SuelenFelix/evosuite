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

public class GetUserPreviewResp_canEqual_21415559033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6083;
     Object term6124;

    public GetUserPreviewResp_canEqual_21415559033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6084 = new Long(0L);
        term6083 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term6083, term6083.getClass(), "userId", term6084);
        setField(term6083, term6083.getClass(), "userName", "");
        setBooleanField(term6083, term6083.getClass(), "isLogin", true);
        setIntField(term6083, term6083.getClass(), "lastDataVersion", 2114761003);
        setField(term6083, term6083.getClass(), "lastLoginDate", "VUkRVwROTl");
        setField(term6083, term6083.getClass(), "lastPlayDate", "UDlkdccCRn");
        setIntField(term6083, term6083.getClass(), "playerRating", -1128091158);
        setIntField(term6083, term6083.getClass(), "nameplateId", 380526008);
        setIntField(term6083, term6083.getClass(), "frameId", -285065370);
        setIntField(term6083, term6083.getClass(), "iconId", -1542216721);
        setIntField(term6083, term6083.getClass(), "trophyId", -311300330);
        setIntField(term6083, term6083.getClass(), "dispRate", 1);
        setIntField(term6083, term6083.getClass(), "dispRank", 1);
        setIntField(term6083, term6083.getClass(), "dispHomeRanker", 1);
        setIntField(term6083, term6083.getClass(), "dispTotalLv", 1);
        setIntField(term6083, term6083.getClass(), "totalLv", 1160936971);
        term6124 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6124;
        callMethod(klass, "canEqual", argTypes, term6083, args);
    }

};


