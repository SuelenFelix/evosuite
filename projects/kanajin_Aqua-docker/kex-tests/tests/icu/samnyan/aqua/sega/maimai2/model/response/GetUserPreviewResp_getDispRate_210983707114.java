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

public class GetUserPreviewResp_getDispRate_210983707114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26025;

    public GetUserPreviewResp_getDispRate_210983707114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26025 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term26025, term26025.getClass(), "userId", 8023209931514440397L);
        setField(term26025, term26025.getClass(), "userName", "ZKwDTklKHb");
        setBooleanField(term26025, term26025.getClass(), "isLogin", true);
        setField(term26025, term26025.getClass(), "lastGameId", "tQMlnMStsQ");
        setField(term26025, term26025.getClass(), "lastDataVersion", "OYJvKAMFEk");
        setField(term26025, term26025.getClass(), "lastRomVersion", "puNAveVBkA");
        setField(term26025, term26025.getClass(), "lastLoginDate", "BcZKUIbuQL");
        setField(term26025, term26025.getClass(), "lastPlayDate", "YvjPnZyRnw");
        setIntField(term26025, term26025.getClass(), "playerRating", -619243163);
        setIntField(term26025, term26025.getClass(), "nameplateId", 228873608);
        setIntField(term26025, term26025.getClass(), "iconId", 1629097013);
        setIntField(term26025, term26025.getClass(), "trophyId", 875017307);
        setIntField(term26025, term26025.getClass(), "partnerId", 523540965);
        setIntField(term26025, term26025.getClass(), "frameId", -633850097);
        setIntField(term26025, term26025.getClass(), "dispRate", -1643146660);
        setIntField(term26025, term26025.getClass(), "totalAwake", -706189295);
        setIntField(term26025, term26025.getClass(), "isNetMember", -1332037518);
        setField(term26025, term26025.getClass(), "dailyBonusDate", "IKmMfqFPku");
        setIntField(term26025, term26025.getClass(), "headPhoneVolume", -861800248);
        setBooleanField(term26025, term26025.getClass(), "isInherit", false);
        setIntField(term26025, term26025.getClass(), "banState", -1398648244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispRate", argTypes, term26025, args);
    }

};


