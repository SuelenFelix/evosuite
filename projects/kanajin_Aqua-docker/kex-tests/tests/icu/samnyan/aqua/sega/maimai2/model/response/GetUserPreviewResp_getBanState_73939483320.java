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

public class GetUserPreviewResp_getBanState_73939483320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27039;

    public GetUserPreviewResp_getBanState_73939483320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27039 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term27039, term27039.getClass(), "userId", 225938424578773140L);
        setField(term27039, term27039.getClass(), "userName", "GqehccUels");
        setBooleanField(term27039, term27039.getClass(), "isLogin", false);
        setField(term27039, term27039.getClass(), "lastGameId", "llbDGujrPe");
        setField(term27039, term27039.getClass(), "lastDataVersion", "QEoeITwBfz");
        setField(term27039, term27039.getClass(), "lastRomVersion", "rWOKjAUIvS");
        setField(term27039, term27039.getClass(), "lastLoginDate", "IcpfsIGlDf");
        setField(term27039, term27039.getClass(), "lastPlayDate", "xCfGcRdHTK");
        setIntField(term27039, term27039.getClass(), "playerRating", 1094413748);
        setIntField(term27039, term27039.getClass(), "nameplateId", 1697340530);
        setIntField(term27039, term27039.getClass(), "iconId", 2037702914);
        setIntField(term27039, term27039.getClass(), "trophyId", 540968254);
        setIntField(term27039, term27039.getClass(), "partnerId", 1166539646);
        setIntField(term27039, term27039.getClass(), "frameId", 1055557164);
        setIntField(term27039, term27039.getClass(), "dispRate", -1601763818);
        setIntField(term27039, term27039.getClass(), "totalAwake", 562192186);
        setIntField(term27039, term27039.getClass(), "isNetMember", -904648920);
        setField(term27039, term27039.getClass(), "dailyBonusDate", "KKHQCvKTvF");
        setIntField(term27039, term27039.getClass(), "headPhoneVolume", -457236509);
        setBooleanField(term27039, term27039.getClass(), "isInherit", true);
        setIntField(term27039, term27039.getClass(), "banState", 1719352674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBanState", argTypes, term27039, args);
    }

};


