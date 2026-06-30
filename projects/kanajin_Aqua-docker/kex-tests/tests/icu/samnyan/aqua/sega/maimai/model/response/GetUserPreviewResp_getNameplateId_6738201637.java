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

public class GetUserPreviewResp_getNameplateId_6738201637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4404;

    public GetUserPreviewResp_getNameplateId_6738201637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4405 = new Long(0L);
        term4404 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4404, term4404.getClass(), "userId", term4405);
        setField(term4404, term4404.getClass(), "userName", "");
        setBooleanField(term4404, term4404.getClass(), "isLogin", true);
        setIntField(term4404, term4404.getClass(), "lastDataVersion", 1199789398);
        setField(term4404, term4404.getClass(), "lastLoginDate", "QtrylgCLiF");
        setField(term4404, term4404.getClass(), "lastPlayDate", "orEuhCStGM");
        setIntField(term4404, term4404.getClass(), "playerRating", -1056402285);
        setIntField(term4404, term4404.getClass(), "nameplateId", 1881803912);
        setIntField(term4404, term4404.getClass(), "frameId", -188535038);
        setIntField(term4404, term4404.getClass(), "iconId", 254650626);
        setIntField(term4404, term4404.getClass(), "trophyId", -1789030917);
        setIntField(term4404, term4404.getClass(), "dispRate", 1);
        setIntField(term4404, term4404.getClass(), "dispRank", 1);
        setIntField(term4404, term4404.getClass(), "dispHomeRanker", 1);
        setIntField(term4404, term4404.getClass(), "dispTotalLv", 1);
        setIntField(term4404, term4404.getClass(), "totalLv", 912208163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameplateId", argTypes, term4404, args);
    }

};


