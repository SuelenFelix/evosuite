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

public class GetUserPreviewResp_getUserId_16580193810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23659;

    public GetUserPreviewResp_getUserId_16580193810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23659 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term23659, term23659.getClass(), "userId", 4942278370983962653L);
        setField(term23659, term23659.getClass(), "userName", "yXrHDHEipD");
        setBooleanField(term23659, term23659.getClass(), "isLogin", false);
        setField(term23659, term23659.getClass(), "lastGameId", "pbqIeikQzp");
        setField(term23659, term23659.getClass(), "lastDataVersion", "baLJgqNNUx");
        setField(term23659, term23659.getClass(), "lastRomVersion", "GlPSGqVaBj");
        setField(term23659, term23659.getClass(), "lastLoginDate", "jieMNXAAbL");
        setField(term23659, term23659.getClass(), "lastPlayDate", "NbmTxmqOjh");
        setIntField(term23659, term23659.getClass(), "playerRating", 1569649652);
        setIntField(term23659, term23659.getClass(), "nameplateId", 1224092165);
        setIntField(term23659, term23659.getClass(), "iconId", 286266173);
        setIntField(term23659, term23659.getClass(), "trophyId", 524985992);
        setIntField(term23659, term23659.getClass(), "partnerId", 1329035477);
        setIntField(term23659, term23659.getClass(), "frameId", 479749926);
        setIntField(term23659, term23659.getClass(), "dispRate", -23214369);
        setIntField(term23659, term23659.getClass(), "totalAwake", 1687480678);
        setIntField(term23659, term23659.getClass(), "isNetMember", 722649363);
        setField(term23659, term23659.getClass(), "dailyBonusDate", "rLDmBbcLaC");
        setIntField(term23659, term23659.getClass(), "headPhoneVolume", 76618777);
        setBooleanField(term23659, term23659.getClass(), "isInherit", true);
        setIntField(term23659, term23659.getClass(), "banState", 1705792936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term23659, args);
    }

};


