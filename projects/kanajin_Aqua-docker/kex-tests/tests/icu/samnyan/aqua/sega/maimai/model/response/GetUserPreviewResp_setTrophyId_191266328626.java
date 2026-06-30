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

public class GetUserPreviewResp_setTrophyId_191266328626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5643;
     Object term5684;

    public GetUserPreviewResp_setTrophyId_191266328626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5644 = new Long(0L);
        term5643 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term5643, term5643.getClass(), "userId", term5644);
        setField(term5643, term5643.getClass(), "userName", "");
        setBooleanField(term5643, term5643.getClass(), "isLogin", true);
        setIntField(term5643, term5643.getClass(), "lastDataVersion", -1349617857);
        setField(term5643, term5643.getClass(), "lastLoginDate", "VkPSXewZfB");
        setField(term5643, term5643.getClass(), "lastPlayDate", "ubodzJoMGW");
        setIntField(term5643, term5643.getClass(), "playerRating", 1346331516);
        setIntField(term5643, term5643.getClass(), "nameplateId", 1018925421);
        setIntField(term5643, term5643.getClass(), "frameId", -1658031378);
        setIntField(term5643, term5643.getClass(), "iconId", -863483345);
        setIntField(term5643, term5643.getClass(), "trophyId", -1722702406);
        setIntField(term5643, term5643.getClass(), "dispRate", 1);
        setIntField(term5643, term5643.getClass(), "dispRank", 1);
        setIntField(term5643, term5643.getClass(), "dispHomeRanker", 1);
        setIntField(term5643, term5643.getClass(), "dispTotalLv", 1);
        setIntField(term5643, term5643.getClass(), "totalLv", 549278914);
        term5684 = new Integer(-1490125498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5684;
        callMethod(klass, "setTrophyId", argTypes, term5643, args);
    }

};


