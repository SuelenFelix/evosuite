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

public class GetUserPreviewResp_getNameplateId_17620256099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25180;

    public GetUserPreviewResp_getNameplateId_17620256099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25180 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term25180, term25180.getClass(), "userId", -5146908173679489755L);
        setField(term25180, term25180.getClass(), "userName", "KEoUMzNdMA");
        setBooleanField(term25180, term25180.getClass(), "isLogin", true);
        setField(term25180, term25180.getClass(), "lastGameId", "SOsGYAgpgW");
        setField(term25180, term25180.getClass(), "lastDataVersion", "ZBafuLDRDM");
        setField(term25180, term25180.getClass(), "lastRomVersion", "VDnsNuhEvG");
        setField(term25180, term25180.getClass(), "lastLoginDate", "DMrfMwXyYT");
        setField(term25180, term25180.getClass(), "lastPlayDate", "GAzZvzjuXP");
        setIntField(term25180, term25180.getClass(), "playerRating", 739273183);
        setIntField(term25180, term25180.getClass(), "nameplateId", 577671776);
        setIntField(term25180, term25180.getClass(), "iconId", -573536902);
        setIntField(term25180, term25180.getClass(), "trophyId", -1477265705);
        setIntField(term25180, term25180.getClass(), "partnerId", 560880959);
        setIntField(term25180, term25180.getClass(), "frameId", -175208201);
        setIntField(term25180, term25180.getClass(), "dispRate", -129568329);
        setIntField(term25180, term25180.getClass(), "totalAwake", -1439138016);
        setIntField(term25180, term25180.getClass(), "isNetMember", 299991969);
        setField(term25180, term25180.getClass(), "dailyBonusDate", "WoFrMqAUlT");
        setIntField(term25180, term25180.getClass(), "headPhoneVolume", -314712088);
        setBooleanField(term25180, term25180.getClass(), "isInherit", true);
        setIntField(term25180, term25180.getClass(), "banState", 673401830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameplateId", argTypes, term25180, args);
    }

};


