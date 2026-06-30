package icu.samnyan.aqua.sega.maimai2.model.response;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GetUserPreviewResp_setTotalAwake_195882017436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29893;
     Object term29992;

    public GetUserPreviewResp_setTotalAwake_195882017436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29893 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term29893, term29893.getClass(), "userId", -6550059544186211121L);
        setField(term29893, term29893.getClass(), "userName", "gPhmseJiob");
        setBooleanField(term29893, term29893.getClass(), "isLogin", false);
        setField(term29893, term29893.getClass(), "lastGameId", "dgpHJUBySN");
        setField(term29893, term29893.getClass(), "lastDataVersion", "jCEXysSVZf");
        setField(term29893, term29893.getClass(), "lastRomVersion", "jWrmcNnNoB");
        setField(term29893, term29893.getClass(), "lastLoginDate", "MoncgugUfo");
        setField(term29893, term29893.getClass(), "lastPlayDate", "OdbuOWCJTS");
        setIntField(term29893, term29893.getClass(), "playerRating", 1790125855);
        setIntField(term29893, term29893.getClass(), "nameplateId", 665331267);
        setIntField(term29893, term29893.getClass(), "iconId", -2014999682);
        setIntField(term29893, term29893.getClass(), "trophyId", 1982258261);
        setIntField(term29893, term29893.getClass(), "partnerId", -1489112012);
        setIntField(term29893, term29893.getClass(), "frameId", -723107224);
        setIntField(term29893, term29893.getClass(), "dispRate", 304541875);
        setIntField(term29893, term29893.getClass(), "totalAwake", -1638286616);
        setIntField(term29893, term29893.getClass(), "isNetMember", -256866404);
        setField(term29893, term29893.getClass(), "dailyBonusDate", "ksvfEdmpqg");
        setIntField(term29893, term29893.getClass(), "headPhoneVolume", -354956895);
        setBooleanField(term29893, term29893.getClass(), "isInherit", false);
        setIntField(term29893, term29893.getClass(), "banState", 1889003786);
        term29992 = new Integer(452911848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29992;
        callMethod(klass, "setTotalAwake", argTypes, term29893, args);
    }

};


