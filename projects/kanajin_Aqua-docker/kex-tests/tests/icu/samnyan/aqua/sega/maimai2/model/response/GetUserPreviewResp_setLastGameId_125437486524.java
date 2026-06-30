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

public class GetUserPreviewResp_setLastGameId_125437486524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27741;

    public GetUserPreviewResp_setLastGameId_125437486524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27741 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term27741, term27741.getClass(), "userId", 7779093916932577607L);
        setField(term27741, term27741.getClass(), "userName", "RreVzKmtxf");
        setBooleanField(term27741, term27741.getClass(), "isLogin", true);
        setField(term27741, term27741.getClass(), "lastGameId", "xHBCsghEAi");
        setField(term27741, term27741.getClass(), "lastDataVersion", "BVlqqUSYbB");
        setField(term27741, term27741.getClass(), "lastRomVersion", "hhGHcwcBqB");
        setField(term27741, term27741.getClass(), "lastLoginDate", "WIVENkFxNU");
        setField(term27741, term27741.getClass(), "lastPlayDate", "MFSosHURtm");
        setIntField(term27741, term27741.getClass(), "playerRating", 2011014435);
        setIntField(term27741, term27741.getClass(), "nameplateId", 256804816);
        setIntField(term27741, term27741.getClass(), "iconId", -726670877);
        setIntField(term27741, term27741.getClass(), "trophyId", 1595800712);
        setIntField(term27741, term27741.getClass(), "partnerId", -1315471137);
        setIntField(term27741, term27741.getClass(), "frameId", 307541055);
        setIntField(term27741, term27741.getClass(), "dispRate", -664242488);
        setIntField(term27741, term27741.getClass(), "totalAwake", 1562272299);
        setIntField(term27741, term27741.getClass(), "isNetMember", 961476617);
        setField(term27741, term27741.getClass(), "dailyBonusDate", "hIBYlJpYye");
        setIntField(term27741, term27741.getClass(), "headPhoneVolume", -1978217643);
        setBooleanField(term27741, term27741.getClass(), "isInherit", true);
        setIntField(term27741, term27741.getClass(), "banState", 53489031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LNendOzJhj";
        callMethod(klass, "setLastGameId", argTypes, term27741, args);
    }

};


