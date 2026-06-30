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

public class GetUserPreviewResp_isLogin_3905012882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23997;

    public GetUserPreviewResp_isLogin_3905012882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23997 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term23997, term23997.getClass(), "userId", -3027046249023055574L);
        setField(term23997, term23997.getClass(), "userName", "UHxidCtatV");
        setBooleanField(term23997, term23997.getClass(), "isLogin", true);
        setField(term23997, term23997.getClass(), "lastGameId", "LRzADDSjVT");
        setField(term23997, term23997.getClass(), "lastDataVersion", "lpFCMaAYxj");
        setField(term23997, term23997.getClass(), "lastRomVersion", "fzHVMNSLii");
        setField(term23997, term23997.getClass(), "lastLoginDate", "TxymnVINZF");
        setField(term23997, term23997.getClass(), "lastPlayDate", "fkBfmixBEh");
        setIntField(term23997, term23997.getClass(), "playerRating", -941018916);
        setIntField(term23997, term23997.getClass(), "nameplateId", -200717429);
        setIntField(term23997, term23997.getClass(), "iconId", 1017751788);
        setIntField(term23997, term23997.getClass(), "trophyId", 452190809);
        setIntField(term23997, term23997.getClass(), "partnerId", -868819495);
        setIntField(term23997, term23997.getClass(), "frameId", -1011591867);
        setIntField(term23997, term23997.getClass(), "dispRate", 709949296);
        setIntField(term23997, term23997.getClass(), "totalAwake", 1078431447);
        setIntField(term23997, term23997.getClass(), "isNetMember", -894257039);
        setField(term23997, term23997.getClass(), "dailyBonusDate", "SWbairdDKL");
        setIntField(term23997, term23997.getClass(), "headPhoneVolume", 1586412497);
        setBooleanField(term23997, term23997.getClass(), "isInherit", false);
        setIntField(term23997, term23997.getClass(), "banState", 719020316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLogin", argTypes, term23997, args);
    }

};


