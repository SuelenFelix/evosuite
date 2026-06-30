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

public class GetUserPreviewResp_getPartnerId_18104778212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25687;

    public GetUserPreviewResp_getPartnerId_18104778212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25687 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term25687, term25687.getClass(), "userId", 3905078592631516923L);
        setField(term25687, term25687.getClass(), "userName", "qTiIgMQXbW");
        setBooleanField(term25687, term25687.getClass(), "isLogin", false);
        setField(term25687, term25687.getClass(), "lastGameId", "rARmHDyRHE");
        setField(term25687, term25687.getClass(), "lastDataVersion", "bvybTJUNMY");
        setField(term25687, term25687.getClass(), "lastRomVersion", "MoGyMoOkMi");
        setField(term25687, term25687.getClass(), "lastLoginDate", "qDEvNqJeGg");
        setField(term25687, term25687.getClass(), "lastPlayDate", "fUxWNxirZc");
        setIntField(term25687, term25687.getClass(), "playerRating", -1728526884);
        setIntField(term25687, term25687.getClass(), "nameplateId", 78399484);
        setIntField(term25687, term25687.getClass(), "iconId", -529573926);
        setIntField(term25687, term25687.getClass(), "trophyId", 1526559521);
        setIntField(term25687, term25687.getClass(), "partnerId", -1479591438);
        setIntField(term25687, term25687.getClass(), "frameId", -1395828554);
        setIntField(term25687, term25687.getClass(), "dispRate", -2081139415);
        setIntField(term25687, term25687.getClass(), "totalAwake", 22197373);
        setIntField(term25687, term25687.getClass(), "isNetMember", 872043914);
        setField(term25687, term25687.getClass(), "dailyBonusDate", "vHkrNjGRyv");
        setIntField(term25687, term25687.getClass(), "headPhoneVolume", -1710077493);
        setBooleanField(term25687, term25687.getClass(), "isInherit", false);
        setIntField(term25687, term25687.getClass(), "banState", -634148056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPartnerId", argTypes, term25687, args);
    }

};


