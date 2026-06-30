package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ProfileResp_setFrameId_141418936543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119766;
     Object term119841;

    public ProfileResp_setFrameId_141418936543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119766 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term119809 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119810 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119814 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119819 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119820 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119824 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term119766, term119766.getClass(), "userName", "qZRVFeFetw");
        setIntField(term119766, term119766.getClass(), "level", -171079462);
        setField(term119766, term119766.getClass(), "exp", "lyrSJRdQbw");
        setLongField(term119766, term119766.getClass(), "point", -6390767292089348773L);
        setLongField(term119766, term119766.getClass(), "totalPoint", -4378898106281221428L);
        setIntField(term119766, term119766.getClass(), "playCount", 1346222218);
        setIntField(term119766, term119766.getClass(), "playerRating", -1928245559);
        setIntField(term119766, term119766.getClass(), "highestRating", 1058920889);
        setIntField(term119766, term119766.getClass(), "nameplateId", -1033159379);
        setIntField(term119766, term119766.getClass(), "frameId", -1239157550);
        setIntField(term119766, term119766.getClass(), "characterId", -1040713473);
        setIntField(term119766, term119766.getClass(), "trophyId", -1838782232);
        setIntField(term119766, term119766.getClass(), "totalMapNum", 226514678);
        setLongField(term119766, term119766.getClass(), "totalHiScore", -5745667405526113327L);
        setLongField(term119766, term119766.getClass(), "totalBasicHighScore", 4527529084032110159L);
        setLongField(term119766, term119766.getClass(), "totalAdvancedHighScore", -475536693979007543L);
        setLongField(term119766, term119766.getClass(), "totalExpertHighScore", -7296521018649452L);
        setLongField(term119766, term119766.getClass(), "totalMasterHighScore", 7033590025135417127L);
        setLongField(term119766, term119766.getClass(), "totalUltimaHighScore", -8535670338137566624L);
        setIntField(term119766, term119766.getClass(), "friendCount", -538731988);
        setIntField(term119810, term119810.getClass(), "year", 2026);
        setShortField(term119810, term119810.getClass(), "month", (short) 4);
        setShortField(term119810, term119810.getClass(), "day", (short) 7);
        setField(term119809, term119809.getClass(), "date", term119810);
        setByteField(term119814, term119814.getClass(), "hour", (byte) 3);
        setByteField(term119814, term119814.getClass(), "minute", (byte) 7);
        setByteField(term119814, term119814.getClass(), "second", (byte) 36);
        setIntField(term119814, term119814.getClass(), "nano", 804341626);
        setField(term119809, term119809.getClass(), "time", term119814);
        setField(term119766, term119766.getClass(), "firstPlayDate", term119809);
        setIntField(term119820, term119820.getClass(), "year", 2014);
        setShortField(term119820, term119820.getClass(), "month", (short) 9);
        setShortField(term119820, term119820.getClass(), "day", (short) 1);
        setField(term119819, term119819.getClass(), "date", term119820);
        setByteField(term119824, term119824.getClass(), "hour", (byte) 12);
        setByteField(term119824, term119824.getClass(), "minute", (byte) 46);
        setByteField(term119824, term119824.getClass(), "second", (byte) 10);
        setIntField(term119824, term119824.getClass(), "nano", 155659663);
        setField(term119819, term119819.getClass(), "time", term119824);
        setField(term119766, term119766.getClass(), "lastPlayDate", term119819);
        setIntField(term119766, term119766.getClass(), "courseClass", -1540377089);
        setIntField(term119766, term119766.getClass(), "overPowerPoint", 1034861910);
        setIntField(term119766, term119766.getClass(), "overPowerRate", 1478731597);
        setIntField(term119766, term119766.getClass(), "mapIconId", 835540636);
        setIntField(term119766, term119766.getClass(), "voiceId", -1081821314);
        setIntField(term119766, term119766.getClass(), "avatarWear", 745660280);
        setIntField(term119766, term119766.getClass(), "avatarHead", 59252325);
        setIntField(term119766, term119766.getClass(), "avatarFace", 1875880915);
        setIntField(term119766, term119766.getClass(), "avatarSkin", -1017448587);
        setIntField(term119766, term119766.getClass(), "avatarItem", -568103343);
        setIntField(term119766, term119766.getClass(), "avatarFront", 244087533);
        setIntField(term119766, term119766.getClass(), "avatarBack", -211258171);
        term119841 = new Integer(-185135067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term119841;
        callMethod(klass, "setFrameId", argTypes, term119766, args);
    }

};


