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

public class GetUserPreviewResp_setDispRate_187468324527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5706;
     Object term5747;

    public GetUserPreviewResp_setDispRate_187468324527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5707 = new Long(0L);
        term5706 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term5706, term5706.getClass(), "userId", term5707);
        setField(term5706, term5706.getClass(), "userName", "");
        setBooleanField(term5706, term5706.getClass(), "isLogin", false);
        setIntField(term5706, term5706.getClass(), "lastDataVersion", -1443119347);
        setField(term5706, term5706.getClass(), "lastLoginDate", "weddIktxOA");
        setField(term5706, term5706.getClass(), "lastPlayDate", "uSlMeISsDD");
        setIntField(term5706, term5706.getClass(), "playerRating", 1962181481);
        setIntField(term5706, term5706.getClass(), "nameplateId", 1798831879);
        setIntField(term5706, term5706.getClass(), "frameId", 1393855580);
        setIntField(term5706, term5706.getClass(), "iconId", -849064032);
        setIntField(term5706, term5706.getClass(), "trophyId", -184659375);
        setIntField(term5706, term5706.getClass(), "dispRate", 1);
        setIntField(term5706, term5706.getClass(), "dispRank", 1);
        setIntField(term5706, term5706.getClass(), "dispHomeRanker", 1);
        setIntField(term5706, term5706.getClass(), "dispTotalLv", 1);
        setIntField(term5706, term5706.getClass(), "totalLv", 629005618);
        term5747 = new Integer(-2006508013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5747;
        callMethod(klass, "setDispRate", argTypes, term5706, args);
    }

};


