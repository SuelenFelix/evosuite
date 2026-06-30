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

public class GetUserPreviewResp_getLastLoginDate_3556446816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24673;

    public GetUserPreviewResp_getLastLoginDate_3556446816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24673 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term24673, term24673.getClass(), "userId", -7455884456909857061L);
        setField(term24673, term24673.getClass(), "userName", "fDVzkGiHev");
        setBooleanField(term24673, term24673.getClass(), "isLogin", false);
        setField(term24673, term24673.getClass(), "lastGameId", "CanAbWJNgt");
        setField(term24673, term24673.getClass(), "lastDataVersion", "tFRLUuSeUt");
        setField(term24673, term24673.getClass(), "lastRomVersion", "KcKxvbBAHa");
        setField(term24673, term24673.getClass(), "lastLoginDate", "NbFVXCPmxn");
        setField(term24673, term24673.getClass(), "lastPlayDate", "ovYlGvhKKO");
        setIntField(term24673, term24673.getClass(), "playerRating", -1818613479);
        setIntField(term24673, term24673.getClass(), "nameplateId", -93031622);
        setIntField(term24673, term24673.getClass(), "iconId", 1909891216);
        setIntField(term24673, term24673.getClass(), "trophyId", -1231417445);
        setIntField(term24673, term24673.getClass(), "partnerId", -1305887225);
        setIntField(term24673, term24673.getClass(), "frameId", 1861751365);
        setIntField(term24673, term24673.getClass(), "dispRate", 1137036889);
        setIntField(term24673, term24673.getClass(), "totalAwake", 1607912632);
        setIntField(term24673, term24673.getClass(), "isNetMember", -2089396254);
        setField(term24673, term24673.getClass(), "dailyBonusDate", "JvoSiMCDAb");
        setIntField(term24673, term24673.getClass(), "headPhoneVolume", 609444561);
        setBooleanField(term24673, term24673.getClass(), "isInherit", false);
        setIntField(term24673, term24673.getClass(), "banState", 2102660964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastLoginDate", argTypes, term24673, args);
    }

};


