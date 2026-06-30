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

public class UserData_getTotalHiScore_45716325217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4489;

    public UserData_getTotalHiScore_45716325217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4493 = new Long(5127676408959197577L);
        term4489 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term4491 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4507 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4508 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4512 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4522 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4489, term4489.getClass(), "id", -484994522244390100L);
        setLongField(term4491, term4491.getClass(), "id", 1233889271256172047L);
        setField(term4491, term4491.getClass(), "extId", term4493);
        setField(term4491, term4491.getClass(), "luid", "VYkqXKVlAJ");
        setIntField(term4508, term4508.getClass(), "year", 2010);
        setShortField(term4508, term4508.getClass(), "month", (short) 5);
        setShortField(term4508, term4508.getClass(), "day", (short) 2);
        setField(term4507, term4507.getClass(), "date", term4508);
        setByteField(term4512, term4512.getClass(), "hour", (byte) 2);
        setByteField(term4512, term4512.getClass(), "minute", (byte) 22);
        setByteField(term4512, term4512.getClass(), "second", (byte) 33);
        setIntField(term4512, term4512.getClass(), "nano", 530835039);
        setField(term4507, term4507.getClass(), "time", term4512);
        setField(term4491, term4491.getClass(), "registerTime", term4507);
        setIntField(term4518, term4518.getClass(), "year", 2024);
        setShortField(term4518, term4518.getClass(), "month", (short) 4);
        setShortField(term4518, term4518.getClass(), "day", (short) 24);
        setField(term4517, term4517.getClass(), "date", term4518);
        setByteField(term4522, term4522.getClass(), "hour", (byte) 7);
        setByteField(term4522, term4522.getClass(), "minute", (byte) 2);
        setByteField(term4522, term4522.getClass(), "second", (byte) 51);
        setIntField(term4522, term4522.getClass(), "nano", 635502964);
        setField(term4517, term4517.getClass(), "time", term4522);
        setField(term4491, term4491.getClass(), "accessTime", term4517);
        setField(term4489, term4489.getClass(), "card", term4491);
        setIntField(term4489, term4489.getClass(), "lastDataVersion", -2129828854);
        setField(term4489, term4489.getClass(), "userName", "XkIoWJRNwN");
        setIntField(term4489, term4489.getClass(), "point", -47438786);
        setIntField(term4489, term4489.getClass(), "totalPoint", -1955400589);
        setIntField(term4489, term4489.getClass(), "iconId", 626179200);
        setIntField(term4489, term4489.getClass(), "nameplateId", -511077684);
        setIntField(term4489, term4489.getClass(), "frameId", -711507760);
        setIntField(term4489, term4489.getClass(), "trophyId", 1053773809);
        setIntField(term4489, term4489.getClass(), "playCount", 924127883);
        setIntField(term4489, term4489.getClass(), "playVsCount", -751079123);
        setIntField(term4489, term4489.getClass(), "playSyncCount", -110837188);
        setIntField(term4489, term4489.getClass(), "winCount", -271094506);
        setIntField(term4489, term4489.getClass(), "helpCount", 455632030);
        setIntField(term4489, term4489.getClass(), "comboCount", -1632929393);
        setIntField(term4489, term4489.getClass(), "feverCount", -431440129);
        setIntField(term4489, term4489.getClass(), "totalHiScore", -763576148);
        setIntField(term4489, term4489.getClass(), "totalEasyHighScore", 1568948514);
        setIntField(term4489, term4489.getClass(), "totalBasicHighScore", -1511130237);
        setIntField(term4489, term4489.getClass(), "totalAdvancedHighScore", 452088587);
        setIntField(term4489, term4489.getClass(), "totalExpertHighScore", -1630069454);
        setIntField(term4489, term4489.getClass(), "totalMasterHighScore", 1499735894);
        setIntField(term4489, term4489.getClass(), "totalReMasterHighScore", 716486048);
        setIntField(term4489, term4489.getClass(), "totalHighSync", -466708718);
        setIntField(term4489, term4489.getClass(), "totalEasySync", 1038029515);
        setIntField(term4489, term4489.getClass(), "totalBasicSync", 1137154606);
        setIntField(term4489, term4489.getClass(), "totalAdvancedSync", -100681578);
        setIntField(term4489, term4489.getClass(), "totalExpertSync", 296568835);
        setIntField(term4489, term4489.getClass(), "totalMasterSync", 1431951992);
        setIntField(term4489, term4489.getClass(), "totalReMasterSync", -1608123016);
        setIntField(term4489, term4489.getClass(), "playerRating", -896473214);
        setIntField(term4489, term4489.getClass(), "highestRating", 401203924);
        setIntField(term4489, term4489.getClass(), "rankAuthTailId", -1212399479);
        setField(term4489, term4489.getClass(), "eventWatchedDate", "aNWLJdrZMq");
        setField(term4489, term4489.getClass(), "webLimitDate", "HHmNoYxIGj");
        setIntField(term4489, term4489.getClass(), "challengeTrackPhase", 2107679041);
        setIntField(term4489, term4489.getClass(), "firstPlayBits", 2040965507);
        setField(term4489, term4489.getClass(), "lastPlayDate", "PtirvZmsGt");
        setIntField(term4489, term4489.getClass(), "lastPlaceId", -1281083262);
        setField(term4489, term4489.getClass(), "lastPlaceName", "HWkpTmtlrc");
        setIntField(term4489, term4489.getClass(), "lastRegionId", 1059930704);
        setField(term4489, term4489.getClass(), "lastRegionName", "hMmaoREuCK");
        setField(term4489, term4489.getClass(), "lastClientId", "VeDtgDzGAN");
        setField(term4489, term4489.getClass(), "lastCountryCode", "aWYOWZFyaX");
        setIntField(term4489, term4489.getClass(), "eventPoint", -1967153290);
        setIntField(term4489, term4489.getClass(), "totalLv", -1397251956);
        setIntField(term4489, term4489.getClass(), "lastLoginBonusDay", -796934571);
        setIntField(term4489, term4489.getClass(), "lastSurvivalBonusDay", 405295896);
        setIntField(term4489, term4489.getClass(), "loginBonusLv", -814977075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHiScore", argTypes, term4489, args);
    }

};


