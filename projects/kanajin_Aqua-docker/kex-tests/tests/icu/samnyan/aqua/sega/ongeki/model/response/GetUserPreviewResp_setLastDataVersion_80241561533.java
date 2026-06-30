package icu.samnyan.aqua.sega.ongeki.model.response;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetUserPreviewResp_setLastDataVersion_80241561533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7586;

    public GetUserPreviewResp_setLastDataVersion_80241561533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7586 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term7586, term7586.getClass(), "userId", -7503147844796296300L);
        setBooleanField(term7586, term7586.getClass(), "isLogin", true);
        setField(term7586, term7586.getClass(), "lastLoginDate", "pMfTuAFXxg");
        setField(term7586, term7586.getClass(), "userName", "");
        setIntField(term7586, term7586.getClass(), "reincarnationNum", -1628536749);
        setIntField(term7586, term7586.getClass(), "level", -748022064);
        setLongField(term7586, term7586.getClass(), "exp", 1099634235456795888L);
        setLongField(term7586, term7586.getClass(), "playerRating", 5391189846186870864L);
        setField(term7586, term7586.getClass(), "lastGameId", "");
        setField(term7586, term7586.getClass(), "lastRomVersion", "");
        setField(term7586, term7586.getClass(), "lastDataVersion", "");
        setField(term7586, term7586.getClass(), "lastPlayDate", "XCZmhkblRc");
        setIntField(term7586, term7586.getClass(), "nameplateId", -1745708025);
        setIntField(term7586, term7586.getClass(), "trophyId", 790614624);
        setIntField(term7586, term7586.getClass(), "cardId", 117387225);
        setIntField(term7586, term7586.getClass(), "dispPlayerLv", 948347134);
        setIntField(term7586, term7586.getClass(), "dispRating", -1552842218);
        setIntField(term7586, term7586.getClass(), "dispBP", -157220068);
        setIntField(term7586, term7586.getClass(), "headphone", 141434141);
        setIntField(term7586, term7586.getClass(), "banStatus", -288619829);
        setBooleanField(term7586, term7586.getClass(), "isWarningConfirmed", true);
        setIntField(term7586, term7586.getClass(), "lastEmoneyBrand", -505635206);
        setIntField(term7586, term7586.getClass(), "lastEmoneyCredit", 932246615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gFUWMydGCU";
        callMethod(klass, "setLastDataVersion", argTypes, term7586, args);
    }

};


