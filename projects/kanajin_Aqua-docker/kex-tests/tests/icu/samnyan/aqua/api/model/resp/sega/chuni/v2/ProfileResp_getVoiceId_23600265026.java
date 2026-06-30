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

public class ProfileResp_getVoiceId_23600265026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118093;

    public ProfileResp_getVoiceId_23600265026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118093 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term118136 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118137 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118141 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118146 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118147 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118151 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term118093, term118093.getClass(), "userName", "KiauapEvQX");
        setIntField(term118093, term118093.getClass(), "level", -450587563);
        setField(term118093, term118093.getClass(), "exp", "JFqCltusci");
        setLongField(term118093, term118093.getClass(), "point", -6512802381597662009L);
        setLongField(term118093, term118093.getClass(), "totalPoint", -2194383482869570162L);
        setIntField(term118093, term118093.getClass(), "playCount", -856232597);
        setIntField(term118093, term118093.getClass(), "playerRating", -1195794037);
        setIntField(term118093, term118093.getClass(), "highestRating", -81281021);
        setIntField(term118093, term118093.getClass(), "nameplateId", 724197823);
        setIntField(term118093, term118093.getClass(), "frameId", 914274826);
        setIntField(term118093, term118093.getClass(), "characterId", 856950647);
        setIntField(term118093, term118093.getClass(), "trophyId", 1339861757);
        setIntField(term118093, term118093.getClass(), "totalMapNum", -220253700);
        setLongField(term118093, term118093.getClass(), "totalHiScore", 6272509896964660741L);
        setLongField(term118093, term118093.getClass(), "totalBasicHighScore", -8854434162914610061L);
        setLongField(term118093, term118093.getClass(), "totalAdvancedHighScore", -5968601817421624476L);
        setLongField(term118093, term118093.getClass(), "totalExpertHighScore", 7520988637380790424L);
        setLongField(term118093, term118093.getClass(), "totalMasterHighScore", 3026771141762351269L);
        setLongField(term118093, term118093.getClass(), "totalUltimaHighScore", -5644277598782586928L);
        setIntField(term118093, term118093.getClass(), "friendCount", -1420982934);
        setIntField(term118137, term118137.getClass(), "year", 2015);
        setShortField(term118137, term118137.getClass(), "month", (short) 4);
        setShortField(term118137, term118137.getClass(), "day", (short) 24);
        setField(term118136, term118136.getClass(), "date", term118137);
        setByteField(term118141, term118141.getClass(), "hour", (byte) 10);
        setByteField(term118141, term118141.getClass(), "minute", (byte) 40);
        setByteField(term118141, term118141.getClass(), "second", (byte) 4);
        setIntField(term118141, term118141.getClass(), "nano", 255380345);
        setField(term118136, term118136.getClass(), "time", term118141);
        setField(term118093, term118093.getClass(), "firstPlayDate", term118136);
        setIntField(term118147, term118147.getClass(), "year", 2020);
        setShortField(term118147, term118147.getClass(), "month", (short) 2);
        setShortField(term118147, term118147.getClass(), "day", (short) 9);
        setField(term118146, term118146.getClass(), "date", term118147);
        setByteField(term118151, term118151.getClass(), "hour", (byte) 21);
        setByteField(term118151, term118151.getClass(), "minute", (byte) 2);
        setByteField(term118151, term118151.getClass(), "second", (byte) 0);
        setIntField(term118151, term118151.getClass(), "nano", 913712695);
        setField(term118146, term118146.getClass(), "time", term118151);
        setField(term118093, term118093.getClass(), "lastPlayDate", term118146);
        setIntField(term118093, term118093.getClass(), "courseClass", -900511642);
        setIntField(term118093, term118093.getClass(), "overPowerPoint", 1957083902);
        setIntField(term118093, term118093.getClass(), "overPowerRate", -1881065979);
        setIntField(term118093, term118093.getClass(), "mapIconId", -428893395);
        setIntField(term118093, term118093.getClass(), "voiceId", 617789414);
        setIntField(term118093, term118093.getClass(), "avatarWear", -2103526242);
        setIntField(term118093, term118093.getClass(), "avatarHead", -1329290092);
        setIntField(term118093, term118093.getClass(), "avatarFace", -1971037765);
        setIntField(term118093, term118093.getClass(), "avatarSkin", -578317757);
        setIntField(term118093, term118093.getClass(), "avatarItem", 621019927);
        setIntField(term118093, term118093.getClass(), "avatarFront", -326251270);
        setIntField(term118093, term118093.getClass(), "avatarBack", 1058188938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVoiceId", argTypes, term118093, args);
    }

};


