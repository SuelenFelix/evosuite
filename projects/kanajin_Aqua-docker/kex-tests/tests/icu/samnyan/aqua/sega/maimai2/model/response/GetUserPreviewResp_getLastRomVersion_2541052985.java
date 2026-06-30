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

public class GetUserPreviewResp_getLastRomVersion_2541052985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24504;

    public GetUserPreviewResp_getLastRomVersion_2541052985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24504 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term24504, term24504.getClass(), "userId", -5944574827460812990L);
        setField(term24504, term24504.getClass(), "userName", "xbPAqsSBBS");
        setBooleanField(term24504, term24504.getClass(), "isLogin", false);
        setField(term24504, term24504.getClass(), "lastGameId", "ivxMfASKCB");
        setField(term24504, term24504.getClass(), "lastDataVersion", "JbksMMXXzT");
        setField(term24504, term24504.getClass(), "lastRomVersion", "WHpoLWpffz");
        setField(term24504, term24504.getClass(), "lastLoginDate", "axiXBkomuw");
        setField(term24504, term24504.getClass(), "lastPlayDate", "nhByIXwUpO");
        setIntField(term24504, term24504.getClass(), "playerRating", 1915101054);
        setIntField(term24504, term24504.getClass(), "nameplateId", -956240810);
        setIntField(term24504, term24504.getClass(), "iconId", 2125391204);
        setIntField(term24504, term24504.getClass(), "trophyId", -1473375595);
        setIntField(term24504, term24504.getClass(), "partnerId", 847182213);
        setIntField(term24504, term24504.getClass(), "frameId", 1757624590);
        setIntField(term24504, term24504.getClass(), "dispRate", 694012679);
        setIntField(term24504, term24504.getClass(), "totalAwake", -630916471);
        setIntField(term24504, term24504.getClass(), "isNetMember", -167574207);
        setField(term24504, term24504.getClass(), "dailyBonusDate", "vVySvQZVok");
        setIntField(term24504, term24504.getClass(), "headPhoneVolume", 1034189504);
        setBooleanField(term24504, term24504.getClass(), "isInherit", false);
        setIntField(term24504, term24504.getClass(), "banState", 250123647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRomVersion", argTypes, term24504, args);
    }

};


