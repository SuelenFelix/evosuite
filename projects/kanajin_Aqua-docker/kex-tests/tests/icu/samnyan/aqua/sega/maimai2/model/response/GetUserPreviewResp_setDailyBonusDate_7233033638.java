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

public class GetUserPreviewResp_setDailyBonusDate_7233033638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30235;

    public GetUserPreviewResp_setDailyBonusDate_7233033638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30235 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term30235, term30235.getClass(), "userId", 4511007950410890732L);
        setField(term30235, term30235.getClass(), "userName", "VkjCLLOwvZ");
        setBooleanField(term30235, term30235.getClass(), "isLogin", false);
        setField(term30235, term30235.getClass(), "lastGameId", "YQaoPDOhWH");
        setField(term30235, term30235.getClass(), "lastDataVersion", "SJPzCePrEj");
        setField(term30235, term30235.getClass(), "lastRomVersion", "tYasEQgFbL");
        setField(term30235, term30235.getClass(), "lastLoginDate", "hqURWIdULb");
        setField(term30235, term30235.getClass(), "lastPlayDate", "kWDcKMrObe");
        setIntField(term30235, term30235.getClass(), "playerRating", 1417577834);
        setIntField(term30235, term30235.getClass(), "nameplateId", -1641288466);
        setIntField(term30235, term30235.getClass(), "iconId", 1755218175);
        setIntField(term30235, term30235.getClass(), "trophyId", 647511055);
        setIntField(term30235, term30235.getClass(), "partnerId", -1949921728);
        setIntField(term30235, term30235.getClass(), "frameId", 932437963);
        setIntField(term30235, term30235.getClass(), "dispRate", -194822585);
        setIntField(term30235, term30235.getClass(), "totalAwake", 1420387294);
        setIntField(term30235, term30235.getClass(), "isNetMember", 1088015655);
        setField(term30235, term30235.getClass(), "dailyBonusDate", "yQIuIaxdRt");
        setIntField(term30235, term30235.getClass(), "headPhoneVolume", -1328130039);
        setBooleanField(term30235, term30235.getClass(), "isInherit", true);
        setIntField(term30235, term30235.getClass(), "banState", 716362214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mppqyavbHE";
        callMethod(klass, "setDailyBonusDate", argTypes, term30235, args);
    }

};


