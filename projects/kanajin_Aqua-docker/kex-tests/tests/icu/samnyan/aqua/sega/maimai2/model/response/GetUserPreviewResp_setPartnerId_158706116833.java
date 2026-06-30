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

public class GetUserPreviewResp_setPartnerId_158706116833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29380;
     Object term29479;

    public GetUserPreviewResp_setPartnerId_158706116833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29380 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term29380, term29380.getClass(), "userId", 1939660974143295045L);
        setField(term29380, term29380.getClass(), "userName", "XVkgypnsVx");
        setBooleanField(term29380, term29380.getClass(), "isLogin", false);
        setField(term29380, term29380.getClass(), "lastGameId", "TwXzbEYFtG");
        setField(term29380, term29380.getClass(), "lastDataVersion", "mRdoimcRwz");
        setField(term29380, term29380.getClass(), "lastRomVersion", "dxJDKuPPPM");
        setField(term29380, term29380.getClass(), "lastLoginDate", "rXBuuDWXsm");
        setField(term29380, term29380.getClass(), "lastPlayDate", "VSvKttZYSC");
        setIntField(term29380, term29380.getClass(), "playerRating", 390373954);
        setIntField(term29380, term29380.getClass(), "nameplateId", 1525579039);
        setIntField(term29380, term29380.getClass(), "iconId", -509784163);
        setIntField(term29380, term29380.getClass(), "trophyId", 1503484564);
        setIntField(term29380, term29380.getClass(), "partnerId", -433236731);
        setIntField(term29380, term29380.getClass(), "frameId", 2003700950);
        setIntField(term29380, term29380.getClass(), "dispRate", -1309376267);
        setIntField(term29380, term29380.getClass(), "totalAwake", -1487504399);
        setIntField(term29380, term29380.getClass(), "isNetMember", -345174419);
        setField(term29380, term29380.getClass(), "dailyBonusDate", "bbwxScASWL");
        setIntField(term29380, term29380.getClass(), "headPhoneVolume", 1676102379);
        setBooleanField(term29380, term29380.getClass(), "isInherit", true);
        setIntField(term29380, term29380.getClass(), "banState", 1215582502);
        term29479 = new Integer(997123385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29479;
        callMethod(klass, "setPartnerId", argTypes, term29380, args);
    }

};


