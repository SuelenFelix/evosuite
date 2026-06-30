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

public class UserData_getHelpCount_180568979314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3697;

    public UserData_getHelpCount_180568979314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3701 = new Long(-5476826692763582090L);
        term3697 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3699 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3715 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3716 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3720 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3725 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3726 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3730 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3697, term3697.getClass(), "id", 1967728129628047933L);
        setLongField(term3699, term3699.getClass(), "id", 2120084523938730454L);
        setField(term3699, term3699.getClass(), "extId", term3701);
        setField(term3699, term3699.getClass(), "luid", "JDaAnsVTGV");
        setIntField(term3716, term3716.getClass(), "year", 2021);
        setShortField(term3716, term3716.getClass(), "month", (short) 8);
        setShortField(term3716, term3716.getClass(), "day", (short) 12);
        setField(term3715, term3715.getClass(), "date", term3716);
        setByteField(term3720, term3720.getClass(), "hour", (byte) 2);
        setByteField(term3720, term3720.getClass(), "minute", (byte) 17);
        setByteField(term3720, term3720.getClass(), "second", (byte) 51);
        setIntField(term3720, term3720.getClass(), "nano", 207375141);
        setField(term3715, term3715.getClass(), "time", term3720);
        setField(term3699, term3699.getClass(), "registerTime", term3715);
        setIntField(term3726, term3726.getClass(), "year", 2025);
        setShortField(term3726, term3726.getClass(), "month", (short) 11);
        setShortField(term3726, term3726.getClass(), "day", (short) 3);
        setField(term3725, term3725.getClass(), "date", term3726);
        setByteField(term3730, term3730.getClass(), "hour", (byte) 21);
        setByteField(term3730, term3730.getClass(), "minute", (byte) 24);
        setByteField(term3730, term3730.getClass(), "second", (byte) 23);
        setIntField(term3730, term3730.getClass(), "nano", 210986721);
        setField(term3725, term3725.getClass(), "time", term3730);
        setField(term3699, term3699.getClass(), "accessTime", term3725);
        setField(term3697, term3697.getClass(), "card", term3699);
        setIntField(term3697, term3697.getClass(), "lastDataVersion", -138239905);
        setField(term3697, term3697.getClass(), "userName", "mLUZFTfjle");
        setIntField(term3697, term3697.getClass(), "point", 1709474063);
        setIntField(term3697, term3697.getClass(), "totalPoint", 1406617209);
        setIntField(term3697, term3697.getClass(), "iconId", 1706047059);
        setIntField(term3697, term3697.getClass(), "nameplateId", 590451710);
        setIntField(term3697, term3697.getClass(), "frameId", -1999787419);
        setIntField(term3697, term3697.getClass(), "trophyId", -1224443634);
        setIntField(term3697, term3697.getClass(), "playCount", 1048451946);
        setIntField(term3697, term3697.getClass(), "playVsCount", 5603560);
        setIntField(term3697, term3697.getClass(), "playSyncCount", -1079020032);
        setIntField(term3697, term3697.getClass(), "winCount", -1973791064);
        setIntField(term3697, term3697.getClass(), "helpCount", -2072158633);
        setIntField(term3697, term3697.getClass(), "comboCount", -355469363);
        setIntField(term3697, term3697.getClass(), "feverCount", 1465188553);
        setIntField(term3697, term3697.getClass(), "totalHiScore", 1633913667);
        setIntField(term3697, term3697.getClass(), "totalEasyHighScore", 1292332296);
        setIntField(term3697, term3697.getClass(), "totalBasicHighScore", -1415256843);
        setIntField(term3697, term3697.getClass(), "totalAdvancedHighScore", 612177768);
        setIntField(term3697, term3697.getClass(), "totalExpertHighScore", -1626451656);
        setIntField(term3697, term3697.getClass(), "totalMasterHighScore", 173952451);
        setIntField(term3697, term3697.getClass(), "totalReMasterHighScore", -1972033388);
        setIntField(term3697, term3697.getClass(), "totalHighSync", -1005024758);
        setIntField(term3697, term3697.getClass(), "totalEasySync", 2634669);
        setIntField(term3697, term3697.getClass(), "totalBasicSync", -1912429941);
        setIntField(term3697, term3697.getClass(), "totalAdvancedSync", 1801052257);
        setIntField(term3697, term3697.getClass(), "totalExpertSync", -2110556060);
        setIntField(term3697, term3697.getClass(), "totalMasterSync", 313459791);
        setIntField(term3697, term3697.getClass(), "totalReMasterSync", 752615112);
        setIntField(term3697, term3697.getClass(), "playerRating", -1674430871);
        setIntField(term3697, term3697.getClass(), "highestRating", 794352120);
        setIntField(term3697, term3697.getClass(), "rankAuthTailId", 340719678);
        setField(term3697, term3697.getClass(), "eventWatchedDate", "xIeFjkHkOe");
        setField(term3697, term3697.getClass(), "webLimitDate", "SdCKLMIYnX");
        setIntField(term3697, term3697.getClass(), "challengeTrackPhase", 299791142);
        setIntField(term3697, term3697.getClass(), "firstPlayBits", 1862191391);
        setField(term3697, term3697.getClass(), "lastPlayDate", "OJJtVNPyKZ");
        setIntField(term3697, term3697.getClass(), "lastPlaceId", 1131398807);
        setField(term3697, term3697.getClass(), "lastPlaceName", "AKNapTAfmD");
        setIntField(term3697, term3697.getClass(), "lastRegionId", -344907703);
        setField(term3697, term3697.getClass(), "lastRegionName", "xJgPlLxpgC");
        setField(term3697, term3697.getClass(), "lastClientId", "EYtfuJaxiM");
        setField(term3697, term3697.getClass(), "lastCountryCode", "gCWtLVKVVe");
        setIntField(term3697, term3697.getClass(), "eventPoint", 824341437);
        setIntField(term3697, term3697.getClass(), "totalLv", -1794965320);
        setIntField(term3697, term3697.getClass(), "lastLoginBonusDay", 520504102);
        setIntField(term3697, term3697.getClass(), "lastSurvivalBonusDay", -457396133);
        setIntField(term3697, term3697.getClass(), "loginBonusLv", -1793950607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHelpCount", argTypes, term3697, args);
    }

};


