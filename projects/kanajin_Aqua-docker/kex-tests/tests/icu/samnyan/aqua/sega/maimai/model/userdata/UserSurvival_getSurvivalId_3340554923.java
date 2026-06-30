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

public class UserSurvival_getSurvivalId_3340554923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102695;

    public UserSurvival_getSurvivalId_3340554923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term102701 = new Long(-5871746020807491998L);
        term102695 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term102697 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term102699 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term102715 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102716 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102720 = newInstance(Class.forName("java.time.LocalTime"));
        Object term102725 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102726 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102730 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term102695, term102695.getClass(), "id", -7136884452108210749L);
        setLongField(term102697, term102697.getClass(), "id", 9152536589169023749L);
        setLongField(term102699, term102699.getClass(), "id", 2829028216156787199L);
        setField(term102699, term102699.getClass(), "extId", term102701);
        setField(term102699, term102699.getClass(), "luid", "pgpXJLwACM");
        setIntField(term102716, term102716.getClass(), "year", 2015);
        setShortField(term102716, term102716.getClass(), "month", (short) 6);
        setShortField(term102716, term102716.getClass(), "day", (short) 1);
        setField(term102715, term102715.getClass(), "date", term102716);
        setByteField(term102720, term102720.getClass(), "hour", (byte) 5);
        setByteField(term102720, term102720.getClass(), "minute", (byte) 44);
        setByteField(term102720, term102720.getClass(), "second", (byte) 48);
        setIntField(term102720, term102720.getClass(), "nano", 654356179);
        setField(term102715, term102715.getClass(), "time", term102720);
        setField(term102699, term102699.getClass(), "registerTime", term102715);
        setIntField(term102726, term102726.getClass(), "year", 2027);
        setShortField(term102726, term102726.getClass(), "month", (short) 10);
        setShortField(term102726, term102726.getClass(), "day", (short) 12);
        setField(term102725, term102725.getClass(), "date", term102726);
        setByteField(term102730, term102730.getClass(), "hour", (byte) 16);
        setByteField(term102730, term102730.getClass(), "minute", (byte) 59);
        setByteField(term102730, term102730.getClass(), "second", (byte) 46);
        setIntField(term102730, term102730.getClass(), "nano", 525561936);
        setField(term102725, term102725.getClass(), "time", term102730);
        setField(term102699, term102699.getClass(), "accessTime", term102725);
        setField(term102697, term102697.getClass(), "card", term102699);
        setIntField(term102697, term102697.getClass(), "lastDataVersion", 1030528931);
        setField(term102697, term102697.getClass(), "userName", "JgrZdrciib");
        setIntField(term102697, term102697.getClass(), "point", 2054837350);
        setIntField(term102697, term102697.getClass(), "totalPoint", 1209247785);
        setIntField(term102697, term102697.getClass(), "iconId", 1950406971);
        setIntField(term102697, term102697.getClass(), "nameplateId", 1834357646);
        setIntField(term102697, term102697.getClass(), "frameId", -934619156);
        setIntField(term102697, term102697.getClass(), "trophyId", 751000283);
        setIntField(term102697, term102697.getClass(), "playCount", -591472707);
        setIntField(term102697, term102697.getClass(), "playVsCount", -670816490);
        setIntField(term102697, term102697.getClass(), "playSyncCount", -552668710);
        setIntField(term102697, term102697.getClass(), "winCount", -760927478);
        setIntField(term102697, term102697.getClass(), "helpCount", -619141849);
        setIntField(term102697, term102697.getClass(), "comboCount", 1930976366);
        setIntField(term102697, term102697.getClass(), "feverCount", -539700568);
        setIntField(term102697, term102697.getClass(), "totalHiScore", 1235020855);
        setIntField(term102697, term102697.getClass(), "totalEasyHighScore", 589191849);
        setIntField(term102697, term102697.getClass(), "totalBasicHighScore", -400353527);
        setIntField(term102697, term102697.getClass(), "totalAdvancedHighScore", -1536675050);
        setIntField(term102697, term102697.getClass(), "totalExpertHighScore", 483222058);
        setIntField(term102697, term102697.getClass(), "totalMasterHighScore", 2110245271);
        setIntField(term102697, term102697.getClass(), "totalReMasterHighScore", 1159718509);
        setIntField(term102697, term102697.getClass(), "totalHighSync", 1659414643);
        setIntField(term102697, term102697.getClass(), "totalEasySync", -1342228000);
        setIntField(term102697, term102697.getClass(), "totalBasicSync", 715633481);
        setIntField(term102697, term102697.getClass(), "totalAdvancedSync", 1022044748);
        setIntField(term102697, term102697.getClass(), "totalExpertSync", 1807382811);
        setIntField(term102697, term102697.getClass(), "totalMasterSync", -540402237);
        setIntField(term102697, term102697.getClass(), "totalReMasterSync", -1317004478);
        setIntField(term102697, term102697.getClass(), "playerRating", -1771740204);
        setIntField(term102697, term102697.getClass(), "highestRating", 135378240);
        setIntField(term102697, term102697.getClass(), "rankAuthTailId", -2017568485);
        setField(term102697, term102697.getClass(), "eventWatchedDate", "mjPUAINebK");
        setField(term102697, term102697.getClass(), "webLimitDate", "QdBJxwpNcu");
        setIntField(term102697, term102697.getClass(), "challengeTrackPhase", -1312352365);
        setIntField(term102697, term102697.getClass(), "firstPlayBits", -1352021947);
        setField(term102697, term102697.getClass(), "lastPlayDate", "jdwewuUtBW");
        setIntField(term102697, term102697.getClass(), "lastPlaceId", 1024432109);
        setField(term102697, term102697.getClass(), "lastPlaceName", "CXekzSdVWc");
        setIntField(term102697, term102697.getClass(), "lastRegionId", -490684732);
        setField(term102697, term102697.getClass(), "lastRegionName", "heJZxFqAJC");
        setField(term102697, term102697.getClass(), "lastClientId", "DGNjGJtXwQ");
        setField(term102697, term102697.getClass(), "lastCountryCode", "BIFQrvbqSd");
        setIntField(term102697, term102697.getClass(), "eventPoint", 1090372481);
        setIntField(term102697, term102697.getClass(), "totalLv", -1392318268);
        setIntField(term102697, term102697.getClass(), "lastLoginBonusDay", 812020808);
        setIntField(term102697, term102697.getClass(), "lastSurvivalBonusDay", 1588709153);
        setIntField(term102697, term102697.getClass(), "loginBonusLv", 1655781477);
        setField(term102695, term102695.getClass(), "user", term102697);
        setIntField(term102695, term102695.getClass(), "survivalId", -1650359441);
        setIntField(term102695, term102695.getClass(), "totalScore", 267957015);
        setIntField(term102695, term102695.getClass(), "totalAchieve", 1083447632);
        setBooleanField(term102695, term102695.getClass(), "isClear", true);
        setBooleanField(term102695, term102695.getClass(), "isNoDamage", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSurvivalId", argTypes, term102695, args);
    }

};


