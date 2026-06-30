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

public class GetUserPreviewResp_getDispHomeRanker_195166749113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4770;

    public GetUserPreviewResp_getDispHomeRanker_195166749113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4771 = new Long(0L);
        term4770 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term4770, term4770.getClass(), "userId", term4771);
        setField(term4770, term4770.getClass(), "userName", "");
        setBooleanField(term4770, term4770.getClass(), "isLogin", true);
        setIntField(term4770, term4770.getClass(), "lastDataVersion", 964137425);
        setField(term4770, term4770.getClass(), "lastLoginDate", "BJhjdJUhkz");
        setField(term4770, term4770.getClass(), "lastPlayDate", "cdHYQDgUZR");
        setIntField(term4770, term4770.getClass(), "playerRating", -1378885614);
        setIntField(term4770, term4770.getClass(), "nameplateId", -1408615666);
        setIntField(term4770, term4770.getClass(), "frameId", -502299598);
        setIntField(term4770, term4770.getClass(), "iconId", -516287593);
        setIntField(term4770, term4770.getClass(), "trophyId", -187311406);
        setIntField(term4770, term4770.getClass(), "dispRate", 1);
        setIntField(term4770, term4770.getClass(), "dispRank", 1);
        setIntField(term4770, term4770.getClass(), "dispHomeRanker", 1);
        setIntField(term4770, term4770.getClass(), "dispTotalLv", 1);
        setIntField(term4770, term4770.getClass(), "totalLv", 1496632406);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispHomeRanker", argTypes, term4770, args);
    }

};


