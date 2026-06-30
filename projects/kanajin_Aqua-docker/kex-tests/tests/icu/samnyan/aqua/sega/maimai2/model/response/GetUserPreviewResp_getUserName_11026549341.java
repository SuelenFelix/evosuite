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

public class GetUserPreviewResp_getUserName_11026549341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23828;

    public GetUserPreviewResp_getUserName_11026549341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23828 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term23828, term23828.getClass(), "userId", 4497530590028813461L);
        setField(term23828, term23828.getClass(), "userName", "tUKcXglBlG");
        setBooleanField(term23828, term23828.getClass(), "isLogin", false);
        setField(term23828, term23828.getClass(), "lastGameId", "ZGptycjjRq");
        setField(term23828, term23828.getClass(), "lastDataVersion", "kXJaxapFer");
        setField(term23828, term23828.getClass(), "lastRomVersion", "OEeAVwVwuj");
        setField(term23828, term23828.getClass(), "lastLoginDate", "WEgFuDZsxi");
        setField(term23828, term23828.getClass(), "lastPlayDate", "kvcaSGNTHd");
        setIntField(term23828, term23828.getClass(), "playerRating", -1909996617);
        setIntField(term23828, term23828.getClass(), "nameplateId", -190426986);
        setIntField(term23828, term23828.getClass(), "iconId", -555983707);
        setIntField(term23828, term23828.getClass(), "trophyId", -606116015);
        setIntField(term23828, term23828.getClass(), "partnerId", -181890457);
        setIntField(term23828, term23828.getClass(), "frameId", -944465027);
        setIntField(term23828, term23828.getClass(), "dispRate", 378932740);
        setIntField(term23828, term23828.getClass(), "totalAwake", -346858205);
        setIntField(term23828, term23828.getClass(), "isNetMember", -1490019542);
        setField(term23828, term23828.getClass(), "dailyBonusDate", "opXkGeBDoI");
        setIntField(term23828, term23828.getClass(), "headPhoneVolume", 681306470);
        setBooleanField(term23828, term23828.getClass(), "isInherit", false);
        setIntField(term23828, term23828.getClass(), "banState", -1757429033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term23828, args);
    }

};


