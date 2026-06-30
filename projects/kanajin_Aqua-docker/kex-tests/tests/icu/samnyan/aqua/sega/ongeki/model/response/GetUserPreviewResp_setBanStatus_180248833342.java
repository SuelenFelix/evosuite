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
import java.lang.Integer;

public class GetUserPreviewResp_setBanStatus_180248833342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8274;
     Object term8324;

    public GetUserPreviewResp_setBanStatus_180248833342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8274 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term8274, term8274.getClass(), "userId", -6523933176535405885L);
        setBooleanField(term8274, term8274.getClass(), "isLogin", true);
        setField(term8274, term8274.getClass(), "lastLoginDate", "OFTJwdPiTG");
        setField(term8274, term8274.getClass(), "userName", "");
        setIntField(term8274, term8274.getClass(), "reincarnationNum", 540775467);
        setIntField(term8274, term8274.getClass(), "level", -2083028527);
        setLongField(term8274, term8274.getClass(), "exp", 6558561920118298074L);
        setLongField(term8274, term8274.getClass(), "playerRating", -6261257793045898313L);
        setField(term8274, term8274.getClass(), "lastGameId", "");
        setField(term8274, term8274.getClass(), "lastRomVersion", "");
        setField(term8274, term8274.getClass(), "lastDataVersion", "");
        setField(term8274, term8274.getClass(), "lastPlayDate", "QiUprSEluR");
        setIntField(term8274, term8274.getClass(), "nameplateId", 1631605263);
        setIntField(term8274, term8274.getClass(), "trophyId", -1378134881);
        setIntField(term8274, term8274.getClass(), "cardId", -1887131478);
        setIntField(term8274, term8274.getClass(), "dispPlayerLv", 1916020077);
        setIntField(term8274, term8274.getClass(), "dispRating", -1842191454);
        setIntField(term8274, term8274.getClass(), "dispBP", 384551988);
        setIntField(term8274, term8274.getClass(), "headphone", -2021521187);
        setIntField(term8274, term8274.getClass(), "banStatus", -2139205197);
        setBooleanField(term8274, term8274.getClass(), "isWarningConfirmed", true);
        setIntField(term8274, term8274.getClass(), "lastEmoneyBrand", -584949216);
        setIntField(term8274, term8274.getClass(), "lastEmoneyCredit", 1646064199);
        term8324 = new Integer(-1135845415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8324;
        callMethod(klass, "setBanStatus", argTypes, term8274, args);
    }

};


