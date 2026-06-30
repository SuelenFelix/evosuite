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

public class GetUserPreviewResp_getUserName_21041069161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4038;

    public GetUserPreviewResp_getUserName_21041069161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4039 = new Long(0L);
        term4038 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4038, term4038.getClass(), "userId", term4039);
        setField(term4038, term4038.getClass(), "userName", "");
        setBooleanField(term4038, term4038.getClass(), "isLogin", false);
        setIntField(term4038, term4038.getClass(), "lastDataVersion", -1642688455);
        setField(term4038, term4038.getClass(), "lastLoginDate", "OzXRsFGTIp");
        setField(term4038, term4038.getClass(), "lastPlayDate", "TjWpyghUWN");
        setIntField(term4038, term4038.getClass(), "playerRating", -1184558215);
        setIntField(term4038, term4038.getClass(), "nameplateId", 2123688338);
        setIntField(term4038, term4038.getClass(), "frameId", -1051941387);
        setIntField(term4038, term4038.getClass(), "iconId", -640763660);
        setIntField(term4038, term4038.getClass(), "trophyId", -1189468129);
        setIntField(term4038, term4038.getClass(), "dispRate", 1);
        setIntField(term4038, term4038.getClass(), "dispRank", 1);
        setIntField(term4038, term4038.getClass(), "dispHomeRanker", 1);
        setIntField(term4038, term4038.getClass(), "dispTotalLv", 1);
        setIntField(term4038, term4038.getClass(), "totalLv", -1099664830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term4038, args);
    }

};


