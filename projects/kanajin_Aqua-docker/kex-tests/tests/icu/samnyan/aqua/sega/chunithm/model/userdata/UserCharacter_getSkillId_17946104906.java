package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserCharacter_getSkillId_17946104906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110656;

    public UserCharacter_getSkillId_17946104906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term110662 = new Long(-7698746988132548371L);
        term110656 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term110658 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term110660 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term110676 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110677 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110681 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110686 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110687 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110691 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110708 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110709 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110713 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110769 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110770 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110774 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110817 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110818 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110822 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110863 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110864 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110868 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term110656, term110656.getClass(), "id", -4221717002257817742L);
        setLongField(term110658, term110658.getClass(), "id", -4465503610042466187L);
        setLongField(term110660, term110660.getClass(), "id", -4715213274903499549L);
        setField(term110660, term110660.getClass(), "extId", term110662);
        setField(term110660, term110660.getClass(), "luid", "RaVKdrEtNk");
        setIntField(term110677, term110677.getClass(), "year", 2026);
        setShortField(term110677, term110677.getClass(), "month", (short) 12);
        setShortField(term110677, term110677.getClass(), "day", (short) 5);
        setField(term110676, term110676.getClass(), "date", term110677);
        setByteField(term110681, term110681.getClass(), "hour", (byte) 12);
        setByteField(term110681, term110681.getClass(), "minute", (byte) 12);
        setByteField(term110681, term110681.getClass(), "second", (byte) 28);
        setIntField(term110681, term110681.getClass(), "nano", 184287705);
        setField(term110676, term110676.getClass(), "time", term110681);
        setField(term110660, term110660.getClass(), "registerTime", term110676);
        setIntField(term110687, term110687.getClass(), "year", 2012);
        setShortField(term110687, term110687.getClass(), "month", (short) 9);
        setShortField(term110687, term110687.getClass(), "day", (short) 12);
        setField(term110686, term110686.getClass(), "date", term110687);
        setByteField(term110691, term110691.getClass(), "hour", (byte) 13);
        setByteField(term110691, term110691.getClass(), "minute", (byte) 54);
        setByteField(term110691, term110691.getClass(), "second", (byte) 24);
        setIntField(term110691, term110691.getClass(), "nano", 949177753);
        setField(term110686, term110686.getClass(), "time", term110691);
        setField(term110660, term110660.getClass(), "accessTime", term110686);
        setField(term110658, term110658.getClass(), "card", term110660);
        setField(term110658, term110658.getClass(), "userName", "pLrycUApoJ");
        setIntField(term110709, term110709.getClass(), "year", 2011);
        setShortField(term110709, term110709.getClass(), "month", (short) 3);
        setShortField(term110709, term110709.getClass(), "day", (short) 24);
        setField(term110708, term110708.getClass(), "date", term110709);
        setByteField(term110713, term110713.getClass(), "hour", (byte) 10);
        setByteField(term110713, term110713.getClass(), "minute", (byte) 39);
        setByteField(term110713, term110713.getClass(), "second", (byte) 44);
        setIntField(term110713, term110713.getClass(), "nano", 506557889);
        setField(term110708, term110708.getClass(), "time", term110713);
        setField(term110658, term110658.getClass(), "lastLoginDate", term110708);
        setBooleanField(term110658, term110658.getClass(), "isWebJoin", true);
        setField(term110658, term110658.getClass(), "webLimitDate", "QJTDOLXoVI");
        setIntField(term110658, term110658.getClass(), "level", -1235123974);
        setIntField(term110658, term110658.getClass(), "reincarnationNum", -898215180);
        setField(term110658, term110658.getClass(), "exp", "MVXNdXioDJ");
        setLongField(term110658, term110658.getClass(), "point", -206273696983196193L);
        setLongField(term110658, term110658.getClass(), "totalPoint", -1915177024356330506L);
        setIntField(term110658, term110658.getClass(), "playCount", 537429234);
        setIntField(term110658, term110658.getClass(), "multiPlayCount", -2003655808);
        setIntField(term110658, term110658.getClass(), "multiWinCount", 483470724);
        setIntField(term110658, term110658.getClass(), "requestResCount", -2146772904);
        setIntField(term110658, term110658.getClass(), "acceptResCount", -1010615015);
        setIntField(term110658, term110658.getClass(), "successResCount", 1876974431);
        setIntField(term110658, term110658.getClass(), "playerRating", -910876771);
        setIntField(term110658, term110658.getClass(), "highestRating", 1838706925);
        setIntField(term110658, term110658.getClass(), "nameplateId", -618691801);
        setIntField(term110658, term110658.getClass(), "frameId", -1470171320);
        setIntField(term110658, term110658.getClass(), "characterId", -995528354);
        setIntField(term110658, term110658.getClass(), "trophyId", -2002926440);
        setIntField(term110658, term110658.getClass(), "playedTutorialBit", -985098142);
        setIntField(term110658, term110658.getClass(), "firstTutorialCancelNum", -889602431);
        setIntField(term110658, term110658.getClass(), "masterTutorialCancelNum", 233063229);
        setIntField(term110658, term110658.getClass(), "totalRepertoireCount", -2119606595);
        setIntField(term110658, term110658.getClass(), "totalMapNum", -11676368);
        setLongField(term110658, term110658.getClass(), "totalHiScore", -8102057067828170079L);
        setLongField(term110658, term110658.getClass(), "totalBasicHighScore", 2870545673083303918L);
        setLongField(term110658, term110658.getClass(), "totalAdvancedHighScore", -7840381460094892118L);
        setLongField(term110658, term110658.getClass(), "totalExpertHighScore", -8300306774743166010L);
        setLongField(term110658, term110658.getClass(), "totalMasterHighScore", 6114404614513911757L);
        setIntField(term110770, term110770.getClass(), "year", 2021);
        setShortField(term110770, term110770.getClass(), "month", (short) 10);
        setShortField(term110770, term110770.getClass(), "day", (short) 4);
        setField(term110769, term110769.getClass(), "date", term110770);
        setByteField(term110774, term110774.getClass(), "hour", (byte) 17);
        setByteField(term110774, term110774.getClass(), "minute", (byte) 59);
        setByteField(term110774, term110774.getClass(), "second", (byte) 4);
        setIntField(term110774, term110774.getClass(), "nano", 334540799);
        setField(term110769, term110769.getClass(), "time", term110774);
        setField(term110658, term110658.getClass(), "eventWatchedDate", term110769);
        setIntField(term110658, term110658.getClass(), "friendCount", 1176193646);
        setBooleanField(term110658, term110658.getClass(), "isMaimai", false);
        setField(term110658, term110658.getClass(), "firstGameId", "xXscNmBGLP");
        setField(term110658, term110658.getClass(), "firstRomVersion", "DOvWosNzCd");
        setField(term110658, term110658.getClass(), "firstDataVersion", "bIZNWEzBTe");
        setIntField(term110818, term110818.getClass(), "year", 2019);
        setShortField(term110818, term110818.getClass(), "month", (short) 2);
        setShortField(term110818, term110818.getClass(), "day", (short) 13);
        setField(term110817, term110817.getClass(), "date", term110818);
        setByteField(term110822, term110822.getClass(), "hour", (byte) 13);
        setByteField(term110822, term110822.getClass(), "minute", (byte) 27);
        setByteField(term110822, term110822.getClass(), "second", (byte) 27);
        setIntField(term110822, term110822.getClass(), "nano", 331387415);
        setField(term110817, term110817.getClass(), "time", term110822);
        setField(term110658, term110658.getClass(), "firstPlayDate", term110817);
        setField(term110658, term110658.getClass(), "lastGameId", "CVhsNqYDrO");
        setField(term110658, term110658.getClass(), "lastRomVersion", "dMpUbtHwly");
        setField(term110658, term110658.getClass(), "lastDataVersion", "bxEEJVIcPG");
        setIntField(term110864, term110864.getClass(), "year", 2017);
        setShortField(term110864, term110864.getClass(), "month", (short) 8);
        setShortField(term110864, term110864.getClass(), "day", (short) 7);
        setField(term110863, term110863.getClass(), "date", term110864);
        setByteField(term110868, term110868.getClass(), "hour", (byte) 23);
        setByteField(term110868, term110868.getClass(), "minute", (byte) 12);
        setByteField(term110868, term110868.getClass(), "second", (byte) 45);
        setIntField(term110868, term110868.getClass(), "nano", 36754495);
        setField(term110863, term110863.getClass(), "time", term110868);
        setField(term110658, term110658.getClass(), "lastPlayDate", term110863);
        setIntField(term110658, term110658.getClass(), "lastPlaceId", -1538768806);
        setField(term110658, term110658.getClass(), "lastPlaceName", "UttOGDGpEr");
        setField(term110658, term110658.getClass(), "lastRegionId", "aPScTdSsoS");
        setField(term110658, term110658.getClass(), "lastRegionName", "CZYngwdoHw");
        setField(term110658, term110658.getClass(), "lastAllNetId", "ZbWZNiPrBA");
        setField(term110658, term110658.getClass(), "lastClientId", "ilMWoyWLja");
        setField(term110656, term110656.getClass(), "user", term110658);
        setIntField(term110656, term110656.getClass(), "characterId", -762348027);
        setIntField(term110656, term110656.getClass(), "playCount", 174471043);
        setIntField(term110656, term110656.getClass(), "level", 1);
        setIntField(term110656, term110656.getClass(), "skillId", 90007022);
        setIntField(term110656, term110656.getClass(), "friendshipExp", -1775594472);
        setBooleanField(term110656, term110656.getClass(), "isValid", true);
        setBooleanField(term110656, term110656.getClass(), "isNewMark", true);
        setIntField(term110656, term110656.getClass(), "param1", 2043059296);
        setIntField(term110656, term110656.getClass(), "param2", 809100435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillId", argTypes, term110656, args);
    }

};


