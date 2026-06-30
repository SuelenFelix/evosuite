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

public class GetUserPreviewResp_getDailyBonusDate_31843544817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26532;

    public GetUserPreviewResp_getDailyBonusDate_31843544817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26532 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term26532, term26532.getClass(), "userId", -8686015569355599560L);
        setField(term26532, term26532.getClass(), "userName", "BmnUezUoWz");
        setBooleanField(term26532, term26532.getClass(), "isLogin", true);
        setField(term26532, term26532.getClass(), "lastGameId", "QqeCgeRpIS");
        setField(term26532, term26532.getClass(), "lastDataVersion", "xVwossmLda");
        setField(term26532, term26532.getClass(), "lastRomVersion", "EvSQeALexj");
        setField(term26532, term26532.getClass(), "lastLoginDate", "VuprBjhWdI");
        setField(term26532, term26532.getClass(), "lastPlayDate", "CFGOXMbAUn");
        setIntField(term26532, term26532.getClass(), "playerRating", -1707996167);
        setIntField(term26532, term26532.getClass(), "nameplateId", 1222265931);
        setIntField(term26532, term26532.getClass(), "iconId", 1684951870);
        setIntField(term26532, term26532.getClass(), "trophyId", -1511199281);
        setIntField(term26532, term26532.getClass(), "partnerId", -1801978748);
        setIntField(term26532, term26532.getClass(), "frameId", 1121989052);
        setIntField(term26532, term26532.getClass(), "dispRate", 1115099352);
        setIntField(term26532, term26532.getClass(), "totalAwake", -269893980);
        setIntField(term26532, term26532.getClass(), "isNetMember", 1190163419);
        setField(term26532, term26532.getClass(), "dailyBonusDate", "OxlZVhvedR");
        setIntField(term26532, term26532.getClass(), "headPhoneVolume", -1365404936);
        setBooleanField(term26532, term26532.getClass(), "isInherit", false);
        setIntField(term26532, term26532.getClass(), "banState", -828371576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDailyBonusDate", argTypes, term26532, args);
    }

};


