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

public class GetUserPreviewResp_hashCode_103869371434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6145;

    public GetUserPreviewResp_hashCode_103869371434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6146 = new Long(0L);
        term6145 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term6145, term6145.getClass(), "userId", term6146);
        setField(term6145, term6145.getClass(), "userName", "");
        setBooleanField(term6145, term6145.getClass(), "isLogin", true);
        setIntField(term6145, term6145.getClass(), "lastDataVersion", 1258846008);
        setField(term6145, term6145.getClass(), "lastLoginDate", "McpzErOcYb");
        setField(term6145, term6145.getClass(), "lastPlayDate", "jqrVEUvYEz");
        setIntField(term6145, term6145.getClass(), "playerRating", 702866958);
        setIntField(term6145, term6145.getClass(), "nameplateId", 622731276);
        setIntField(term6145, term6145.getClass(), "frameId", -1302341502);
        setIntField(term6145, term6145.getClass(), "iconId", 1113574554);
        setIntField(term6145, term6145.getClass(), "trophyId", 1685800093);
        setIntField(term6145, term6145.getClass(), "dispRate", 1);
        setIntField(term6145, term6145.getClass(), "dispRank", 1);
        setIntField(term6145, term6145.getClass(), "dispHomeRanker", 1);
        setIntField(term6145, term6145.getClass(), "dispTotalLv", 1);
        setIntField(term6145, term6145.getClass(), "totalLv", -318699441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6145, args);
    }

};


