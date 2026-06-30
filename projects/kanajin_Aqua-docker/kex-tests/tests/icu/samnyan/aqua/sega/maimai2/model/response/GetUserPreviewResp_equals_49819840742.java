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

public class GetUserPreviewResp_equals_49819840742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30939;
     Object term31038;

    public GetUserPreviewResp_equals_49819840742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30939 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term30939, term30939.getClass(), "userId", 2124910767108105788L);
        setField(term30939, term30939.getClass(), "userName", "ouCBOakoEl");
        setBooleanField(term30939, term30939.getClass(), "isLogin", false);
        setField(term30939, term30939.getClass(), "lastGameId", "wQVWUCbSgW");
        setField(term30939, term30939.getClass(), "lastDataVersion", "tHzdWkkvkE");
        setField(term30939, term30939.getClass(), "lastRomVersion", "OeOnaLqxoy");
        setField(term30939, term30939.getClass(), "lastLoginDate", "buRlIDjuAa");
        setField(term30939, term30939.getClass(), "lastPlayDate", "qDicwPaclz");
        setIntField(term30939, term30939.getClass(), "playerRating", 1009657063);
        setIntField(term30939, term30939.getClass(), "nameplateId", -104420972);
        setIntField(term30939, term30939.getClass(), "iconId", 933032980);
        setIntField(term30939, term30939.getClass(), "trophyId", -1426390464);
        setIntField(term30939, term30939.getClass(), "partnerId", -1709715410);
        setIntField(term30939, term30939.getClass(), "frameId", 1221046414);
        setIntField(term30939, term30939.getClass(), "dispRate", 1271215502);
        setIntField(term30939, term30939.getClass(), "totalAwake", 106624322);
        setIntField(term30939, term30939.getClass(), "isNetMember", 1664407428);
        setField(term30939, term30939.getClass(), "dailyBonusDate", "eZlPEKWGYm");
        setIntField(term30939, term30939.getClass(), "headPhoneVolume", 980974243);
        setBooleanField(term30939, term30939.getClass(), "isInherit", true);
        setIntField(term30939, term30939.getClass(), "banState", 1940850013);
        term31038 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term31038;
        callMethod(klass, "equals", argTypes, term30939, args);
    }

};


