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

public class GetUserPreviewResp_setIsNetMember_152095561037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30064;
     Object term30163;

    public GetUserPreviewResp_setIsNetMember_152095561037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30064 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term30064, term30064.getClass(), "userId", -3035941748055157425L);
        setField(term30064, term30064.getClass(), "userName", "mNzFmmNjDi");
        setBooleanField(term30064, term30064.getClass(), "isLogin", false);
        setField(term30064, term30064.getClass(), "lastGameId", "UxkbStdccR");
        setField(term30064, term30064.getClass(), "lastDataVersion", "kizVhsjIpC");
        setField(term30064, term30064.getClass(), "lastRomVersion", "uDuPkYdemJ");
        setField(term30064, term30064.getClass(), "lastLoginDate", "FfynoMXicS");
        setField(term30064, term30064.getClass(), "lastPlayDate", "mbofhtwtHb");
        setIntField(term30064, term30064.getClass(), "playerRating", 2003994890);
        setIntField(term30064, term30064.getClass(), "nameplateId", 2135032815);
        setIntField(term30064, term30064.getClass(), "iconId", 2102441611);
        setIntField(term30064, term30064.getClass(), "trophyId", -972921113);
        setIntField(term30064, term30064.getClass(), "partnerId", -1692479417);
        setIntField(term30064, term30064.getClass(), "frameId", -1090532898);
        setIntField(term30064, term30064.getClass(), "dispRate", 1732323444);
        setIntField(term30064, term30064.getClass(), "totalAwake", -1704583810);
        setIntField(term30064, term30064.getClass(), "isNetMember", -1057666750);
        setField(term30064, term30064.getClass(), "dailyBonusDate", "goCKhChLTQ");
        setIntField(term30064, term30064.getClass(), "headPhoneVolume", 702126350);
        setBooleanField(term30064, term30064.getClass(), "isInherit", false);
        setIntField(term30064, term30064.getClass(), "banState", -1320161427);
        term30163 = new Integer(841954160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30163;
        callMethod(klass, "setIsNetMember", argTypes, term30064, args);
    }

};


