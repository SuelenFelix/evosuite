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

public class GetUserPreviewResp_setTrophyId_129409856432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29209;
     Object term29308;

    public GetUserPreviewResp_setTrophyId_129409856432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29209 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term29209, term29209.getClass(), "userId", 4814035531351879181L);
        setField(term29209, term29209.getClass(), "userName", "iVXUeGctUB");
        setBooleanField(term29209, term29209.getClass(), "isLogin", false);
        setField(term29209, term29209.getClass(), "lastGameId", "bmLiVLNmZC");
        setField(term29209, term29209.getClass(), "lastDataVersion", "ORExcUfatr");
        setField(term29209, term29209.getClass(), "lastRomVersion", "cUonKmQWCB");
        setField(term29209, term29209.getClass(), "lastLoginDate", "CvbqWuRute");
        setField(term29209, term29209.getClass(), "lastPlayDate", "yuvBFZQJBJ");
        setIntField(term29209, term29209.getClass(), "playerRating", 1155538873);
        setIntField(term29209, term29209.getClass(), "nameplateId", 868120753);
        setIntField(term29209, term29209.getClass(), "iconId", 691240568);
        setIntField(term29209, term29209.getClass(), "trophyId", 1689565461);
        setIntField(term29209, term29209.getClass(), "partnerId", 1105348026);
        setIntField(term29209, term29209.getClass(), "frameId", -35374943);
        setIntField(term29209, term29209.getClass(), "dispRate", -561318198);
        setIntField(term29209, term29209.getClass(), "totalAwake", -1196585904);
        setIntField(term29209, term29209.getClass(), "isNetMember", 123352569);
        setField(term29209, term29209.getClass(), "dailyBonusDate", "prymoiXBsv");
        setIntField(term29209, term29209.getClass(), "headPhoneVolume", 2027326435);
        setBooleanField(term29209, term29209.getClass(), "isInherit", false);
        setIntField(term29209, term29209.getClass(), "banState", 1185859348);
        term29308 = new Integer(-1963285488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29308;
        callMethod(klass, "setTrophyId", argTypes, term29209, args);
    }

};


