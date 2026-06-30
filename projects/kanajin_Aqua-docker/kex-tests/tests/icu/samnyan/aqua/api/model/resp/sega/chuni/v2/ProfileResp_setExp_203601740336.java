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

public class ProfileResp_setExp_203601740336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119067;

    public ProfileResp_setExp_203601740336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119067 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term119110 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119111 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119115 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119120 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119121 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119125 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term119067, term119067.getClass(), "userName", "eGQdWVhZFd");
        setIntField(term119067, term119067.getClass(), "level", 1721447838);
        setField(term119067, term119067.getClass(), "exp", "rJCWXHswOA");
        setLongField(term119067, term119067.getClass(), "point", -1861554319067695362L);
        setLongField(term119067, term119067.getClass(), "totalPoint", -8812663182485143537L);
        setIntField(term119067, term119067.getClass(), "playCount", 2047883278);
        setIntField(term119067, term119067.getClass(), "playerRating", -2084150613);
        setIntField(term119067, term119067.getClass(), "highestRating", 509497705);
        setIntField(term119067, term119067.getClass(), "nameplateId", -51966953);
        setIntField(term119067, term119067.getClass(), "frameId", 2052112989);
        setIntField(term119067, term119067.getClass(), "characterId", 400785633);
        setIntField(term119067, term119067.getClass(), "trophyId", 1223980584);
        setIntField(term119067, term119067.getClass(), "totalMapNum", -1196616478);
        setLongField(term119067, term119067.getClass(), "totalHiScore", 7890865761493819305L);
        setLongField(term119067, term119067.getClass(), "totalBasicHighScore", 5591213151956322219L);
        setLongField(term119067, term119067.getClass(), "totalAdvancedHighScore", 822587833802979777L);
        setLongField(term119067, term119067.getClass(), "totalExpertHighScore", -492887364617117085L);
        setLongField(term119067, term119067.getClass(), "totalMasterHighScore", -266916873843810546L);
        setLongField(term119067, term119067.getClass(), "totalUltimaHighScore", 1051431076691020835L);
        setIntField(term119067, term119067.getClass(), "friendCount", 593528124);
        setIntField(term119111, term119111.getClass(), "year", 2024);
        setShortField(term119111, term119111.getClass(), "month", (short) 9);
        setShortField(term119111, term119111.getClass(), "day", (short) 21);
        setField(term119110, term119110.getClass(), "date", term119111);
        setByteField(term119115, term119115.getClass(), "hour", (byte) 7);
        setByteField(term119115, term119115.getClass(), "minute", (byte) 53);
        setByteField(term119115, term119115.getClass(), "second", (byte) 54);
        setIntField(term119115, term119115.getClass(), "nano", 233983628);
        setField(term119110, term119110.getClass(), "time", term119115);
        setField(term119067, term119067.getClass(), "firstPlayDate", term119110);
        setIntField(term119121, term119121.getClass(), "year", 2024);
        setShortField(term119121, term119121.getClass(), "month", (short) 3);
        setShortField(term119121, term119121.getClass(), "day", (short) 14);
        setField(term119120, term119120.getClass(), "date", term119121);
        setByteField(term119125, term119125.getClass(), "hour", (byte) 18);
        setByteField(term119125, term119125.getClass(), "minute", (byte) 27);
        setByteField(term119125, term119125.getClass(), "second", (byte) 39);
        setIntField(term119125, term119125.getClass(), "nano", 3742487);
        setField(term119120, term119120.getClass(), "time", term119125);
        setField(term119067, term119067.getClass(), "lastPlayDate", term119120);
        setIntField(term119067, term119067.getClass(), "courseClass", 1179392084);
        setIntField(term119067, term119067.getClass(), "overPowerPoint", -148887832);
        setIntField(term119067, term119067.getClass(), "overPowerRate", -619735589);
        setIntField(term119067, term119067.getClass(), "mapIconId", 1937981774);
        setIntField(term119067, term119067.getClass(), "voiceId", 1938479308);
        setIntField(term119067, term119067.getClass(), "avatarWear", -510313414);
        setIntField(term119067, term119067.getClass(), "avatarHead", 808188288);
        setIntField(term119067, term119067.getClass(), "avatarFace", -1346248029);
        setIntField(term119067, term119067.getClass(), "avatarSkin", 254993393);
        setIntField(term119067, term119067.getClass(), "avatarItem", -28264498);
        setIntField(term119067, term119067.getClass(), "avatarFront", 1465978105);
        setIntField(term119067, term119067.getClass(), "avatarBack", -382041999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wCsHrkJTEg";
        callMethod(klass, "setExp", argTypes, term119067, args);
    }

};


