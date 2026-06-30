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
import java.lang.Long;

public class ProfileResp_setTotalBasicHighScore_52043588148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120251;
     Object term120326;

    public ProfileResp_setTotalBasicHighScore_52043588148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120251 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term120294 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120295 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120299 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120304 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120305 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120309 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term120251, term120251.getClass(), "userName", "QjEwBIXDUi");
        setIntField(term120251, term120251.getClass(), "level", -1690164978);
        setField(term120251, term120251.getClass(), "exp", "mIyJMumZKG");
        setLongField(term120251, term120251.getClass(), "point", -311687515551036519L);
        setLongField(term120251, term120251.getClass(), "totalPoint", 87551356764990866L);
        setIntField(term120251, term120251.getClass(), "playCount", -1307352938);
        setIntField(term120251, term120251.getClass(), "playerRating", 1190527921);
        setIntField(term120251, term120251.getClass(), "highestRating", -2128692871);
        setIntField(term120251, term120251.getClass(), "nameplateId", 1326905669);
        setIntField(term120251, term120251.getClass(), "frameId", -958220057);
        setIntField(term120251, term120251.getClass(), "characterId", -263477133);
        setIntField(term120251, term120251.getClass(), "trophyId", -468889616);
        setIntField(term120251, term120251.getClass(), "totalMapNum", 1404178107);
        setLongField(term120251, term120251.getClass(), "totalHiScore", 8849213552795917680L);
        setLongField(term120251, term120251.getClass(), "totalBasicHighScore", 8129767110064217080L);
        setLongField(term120251, term120251.getClass(), "totalAdvancedHighScore", -7275485705677278587L);
        setLongField(term120251, term120251.getClass(), "totalExpertHighScore", -211018543573261035L);
        setLongField(term120251, term120251.getClass(), "totalMasterHighScore", 7578564556666028187L);
        setLongField(term120251, term120251.getClass(), "totalUltimaHighScore", 652539985166333609L);
        setIntField(term120251, term120251.getClass(), "friendCount", 1286027745);
        setIntField(term120295, term120295.getClass(), "year", 2025);
        setShortField(term120295, term120295.getClass(), "month", (short) 5);
        setShortField(term120295, term120295.getClass(), "day", (short) 12);
        setField(term120294, term120294.getClass(), "date", term120295);
        setByteField(term120299, term120299.getClass(), "hour", (byte) 8);
        setByteField(term120299, term120299.getClass(), "minute", (byte) 59);
        setByteField(term120299, term120299.getClass(), "second", (byte) 15);
        setIntField(term120299, term120299.getClass(), "nano", 21856773);
        setField(term120294, term120294.getClass(), "time", term120299);
        setField(term120251, term120251.getClass(), "firstPlayDate", term120294);
        setIntField(term120305, term120305.getClass(), "year", 2013);
        setShortField(term120305, term120305.getClass(), "month", (short) 1);
        setShortField(term120305, term120305.getClass(), "day", (short) 7);
        setField(term120304, term120304.getClass(), "date", term120305);
        setByteField(term120309, term120309.getClass(), "hour", (byte) 19);
        setByteField(term120309, term120309.getClass(), "minute", (byte) 19);
        setByteField(term120309, term120309.getClass(), "second", (byte) 3);
        setIntField(term120309, term120309.getClass(), "nano", 704350132);
        setField(term120304, term120304.getClass(), "time", term120309);
        setField(term120251, term120251.getClass(), "lastPlayDate", term120304);
        setIntField(term120251, term120251.getClass(), "courseClass", 1551925018);
        setIntField(term120251, term120251.getClass(), "overPowerPoint", 859826668);
        setIntField(term120251, term120251.getClass(), "overPowerRate", -560144508);
        setIntField(term120251, term120251.getClass(), "mapIconId", 1353108076);
        setIntField(term120251, term120251.getClass(), "voiceId", 1611104462);
        setIntField(term120251, term120251.getClass(), "avatarWear", 1118487623);
        setIntField(term120251, term120251.getClass(), "avatarHead", 1836628200);
        setIntField(term120251, term120251.getClass(), "avatarFace", -1977713618);
        setIntField(term120251, term120251.getClass(), "avatarSkin", -1077432921);
        setIntField(term120251, term120251.getClass(), "avatarItem", -989455152);
        setIntField(term120251, term120251.getClass(), "avatarFront", -1004859801);
        setIntField(term120251, term120251.getClass(), "avatarBack", -1305399231);
        term120326 = new Long(6734275631255863271L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term120326;
        callMethod(klass, "setTotalBasicHighScore", argTypes, term120251, args);
    }

};


