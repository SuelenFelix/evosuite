package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Boolean;

public class UserSurvival_setClear_128909528613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105677;
     Object term105858;

    public UserSurvival_setClear_128909528613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term105683 = new Long(4525924047960478347L);
        term105677 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term105679 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term105681 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term105697 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105698 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105702 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105707 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105708 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105712 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term105677, term105677.getClass(), "id", -2375099996964834173L);
        setLongField(term105679, term105679.getClass(), "id", 3058795643782579829L);
        setLongField(term105681, term105681.getClass(), "id", 3729905560436815423L);
        setField(term105681, term105681.getClass(), "extId", term105683);
        setField(term105681, term105681.getClass(), "luid", "qwrZBRPuHr");
        setIntField(term105698, term105698.getClass(), "year", 2029);
        setShortField(term105698, term105698.getClass(), "month", (short) 11);
        setShortField(term105698, term105698.getClass(), "day", (short) 25);
        setField(term105697, term105697.getClass(), "date", term105698);
        setByteField(term105702, term105702.getClass(), "hour", (byte) 14);
        setByteField(term105702, term105702.getClass(), "minute", (byte) 49);
        setByteField(term105702, term105702.getClass(), "second", (byte) 17);
        setIntField(term105702, term105702.getClass(), "nano", 699722589);
        setField(term105697, term105697.getClass(), "time", term105702);
        setField(term105681, term105681.getClass(), "registerTime", term105697);
        setIntField(term105708, term105708.getClass(), "year", 2026);
        setShortField(term105708, term105708.getClass(), "month", (short) 10);
        setShortField(term105708, term105708.getClass(), "day", (short) 4);
        setField(term105707, term105707.getClass(), "date", term105708);
        setByteField(term105712, term105712.getClass(), "hour", (byte) 6);
        setByteField(term105712, term105712.getClass(), "minute", (byte) 41);
        setByteField(term105712, term105712.getClass(), "second", (byte) 50);
        setIntField(term105712, term105712.getClass(), "nano", 414376807);
        setField(term105707, term105707.getClass(), "time", term105712);
        setField(term105681, term105681.getClass(), "accessTime", term105707);
        setField(term105679, term105679.getClass(), "card", term105681);
        setIntField(term105679, term105679.getClass(), "lastDataVersion", 1288816449);
        setField(term105679, term105679.getClass(), "userName", "ZlmkgzeZIu");
        setIntField(term105679, term105679.getClass(), "point", 1261399430);
        setIntField(term105679, term105679.getClass(), "totalPoint", 1575653315);
        setIntField(term105679, term105679.getClass(), "iconId", 2116845908);
        setIntField(term105679, term105679.getClass(), "nameplateId", 936161131);
        setIntField(term105679, term105679.getClass(), "frameId", -691701814);
        setIntField(term105679, term105679.getClass(), "trophyId", 1510066525);
        setIntField(term105679, term105679.getClass(), "playCount", 1469611278);
        setIntField(term105679, term105679.getClass(), "playVsCount", -1162670035);
        setIntField(term105679, term105679.getClass(), "playSyncCount", -1451867244);
        setIntField(term105679, term105679.getClass(), "winCount", 559904906);
        setIntField(term105679, term105679.getClass(), "helpCount", 393431288);
        setIntField(term105679, term105679.getClass(), "comboCount", 644691432);
        setIntField(term105679, term105679.getClass(), "feverCount", -531017774);
        setIntField(term105679, term105679.getClass(), "totalHiScore", 854607935);
        setIntField(term105679, term105679.getClass(), "totalEasyHighScore", -1266627939);
        setIntField(term105679, term105679.getClass(), "totalBasicHighScore", 1228954206);
        setIntField(term105679, term105679.getClass(), "totalAdvancedHighScore", 43427568);
        setIntField(term105679, term105679.getClass(), "totalExpertHighScore", -887356821);
        setIntField(term105679, term105679.getClass(), "totalMasterHighScore", 1123610004);
        setIntField(term105679, term105679.getClass(), "totalReMasterHighScore", 184496760);
        setIntField(term105679, term105679.getClass(), "totalHighSync", -903785659);
        setIntField(term105679, term105679.getClass(), "totalEasySync", -759603874);
        setIntField(term105679, term105679.getClass(), "totalBasicSync", -854724842);
        setIntField(term105679, term105679.getClass(), "totalAdvancedSync", 1250890819);
        setIntField(term105679, term105679.getClass(), "totalExpertSync", -1723849008);
        setIntField(term105679, term105679.getClass(), "totalMasterSync", -5850264);
        setIntField(term105679, term105679.getClass(), "totalReMasterSync", 1397968591);
        setIntField(term105679, term105679.getClass(), "playerRating", 1636497723);
        setIntField(term105679, term105679.getClass(), "highestRating", 162449955);
        setIntField(term105679, term105679.getClass(), "rankAuthTailId", -633552703);
        setField(term105679, term105679.getClass(), "eventWatchedDate", "SFuBQQfwki");
        setField(term105679, term105679.getClass(), "webLimitDate", "ryTUTfVgWx");
        setIntField(term105679, term105679.getClass(), "challengeTrackPhase", -144541448);
        setIntField(term105679, term105679.getClass(), "firstPlayBits", 1604182220);
        setField(term105679, term105679.getClass(), "lastPlayDate", "ImdGsYOHJc");
        setIntField(term105679, term105679.getClass(), "lastPlaceId", -1337178466);
        setField(term105679, term105679.getClass(), "lastPlaceName", "MBkxidzets");
        setIntField(term105679, term105679.getClass(), "lastRegionId", 1589240744);
        setField(term105679, term105679.getClass(), "lastRegionName", "PbMQbuzByL");
        setField(term105679, term105679.getClass(), "lastClientId", "ILplPJhYrB");
        setField(term105679, term105679.getClass(), "lastCountryCode", "ZLOixiOrLS");
        setIntField(term105679, term105679.getClass(), "eventPoint", 1935113637);
        setIntField(term105679, term105679.getClass(), "totalLv", -792570091);
        setIntField(term105679, term105679.getClass(), "lastLoginBonusDay", -840204320);
        setIntField(term105679, term105679.getClass(), "lastSurvivalBonusDay", 571759309);
        setIntField(term105679, term105679.getClass(), "loginBonusLv", -544118437);
        setField(term105677, term105677.getClass(), "user", term105679);
        setIntField(term105677, term105677.getClass(), "survivalId", -1070783506);
        setIntField(term105677, term105677.getClass(), "totalScore", 908939387);
        setIntField(term105677, term105677.getClass(), "totalAchieve", 546442739);
        setBooleanField(term105677, term105677.getClass(), "isClear", false);
        setBooleanField(term105677, term105677.getClass(), "isNoDamage", false);
        term105858 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term105858;
        callMethod(klass, "setClear", argTypes, term105677, args);
    }

};


