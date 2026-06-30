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

public class UserSurvival_toString_144181283818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107038;

    public UserSurvival_toString_144181283818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term107044 = new Long(-6490254947459640565L);
        term107038 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term107040 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term107042 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term107058 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107059 = newInstance(Class.forName("java.time.LocalDate"));
        Object term107063 = newInstance(Class.forName("java.time.LocalTime"));
        Object term107068 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107069 = newInstance(Class.forName("java.time.LocalDate"));
        Object term107073 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term107038, term107038.getClass(), "id", -2035876674935124725L);
        setLongField(term107040, term107040.getClass(), "id", 4961271045442602009L);
        setLongField(term107042, term107042.getClass(), "id", 8143748492411850558L);
        setField(term107042, term107042.getClass(), "extId", term107044);
        setField(term107042, term107042.getClass(), "luid", "YxcYXGDyZx");
        setIntField(term107059, term107059.getClass(), "year", 2014);
        setShortField(term107059, term107059.getClass(), "month", (short) 1);
        setShortField(term107059, term107059.getClass(), "day", (short) 6);
        setField(term107058, term107058.getClass(), "date", term107059);
        setByteField(term107063, term107063.getClass(), "hour", (byte) 13);
        setByteField(term107063, term107063.getClass(), "minute", (byte) 4);
        setByteField(term107063, term107063.getClass(), "second", (byte) 34);
        setIntField(term107063, term107063.getClass(), "nano", 465558975);
        setField(term107058, term107058.getClass(), "time", term107063);
        setField(term107042, term107042.getClass(), "registerTime", term107058);
        setIntField(term107069, term107069.getClass(), "year", 2016);
        setShortField(term107069, term107069.getClass(), "month", (short) 8);
        setShortField(term107069, term107069.getClass(), "day", (short) 23);
        setField(term107068, term107068.getClass(), "date", term107069);
        setByteField(term107073, term107073.getClass(), "hour", (byte) 15);
        setByteField(term107073, term107073.getClass(), "minute", (byte) 21);
        setByteField(term107073, term107073.getClass(), "second", (byte) 10);
        setIntField(term107073, term107073.getClass(), "nano", 549669034);
        setField(term107068, term107068.getClass(), "time", term107073);
        setField(term107042, term107042.getClass(), "accessTime", term107068);
        setField(term107040, term107040.getClass(), "card", term107042);
        setIntField(term107040, term107040.getClass(), "lastDataVersion", -602134389);
        setField(term107040, term107040.getClass(), "userName", "dubNMHmdjy");
        setIntField(term107040, term107040.getClass(), "point", 298623505);
        setIntField(term107040, term107040.getClass(), "totalPoint", -45942937);
        setIntField(term107040, term107040.getClass(), "iconId", 1476229754);
        setIntField(term107040, term107040.getClass(), "nameplateId", 286501564);
        setIntField(term107040, term107040.getClass(), "frameId", -1175270067);
        setIntField(term107040, term107040.getClass(), "trophyId", 157082130);
        setIntField(term107040, term107040.getClass(), "playCount", -772180404);
        setIntField(term107040, term107040.getClass(), "playVsCount", -1972172179);
        setIntField(term107040, term107040.getClass(), "playSyncCount", 2021461040);
        setIntField(term107040, term107040.getClass(), "winCount", -253613650);
        setIntField(term107040, term107040.getClass(), "helpCount", 598417977);
        setIntField(term107040, term107040.getClass(), "comboCount", -594010352);
        setIntField(term107040, term107040.getClass(), "feverCount", 1901360390);
        setIntField(term107040, term107040.getClass(), "totalHiScore", 2112491155);
        setIntField(term107040, term107040.getClass(), "totalEasyHighScore", 1153767678);
        setIntField(term107040, term107040.getClass(), "totalBasicHighScore", 252401222);
        setIntField(term107040, term107040.getClass(), "totalAdvancedHighScore", 2136690836);
        setIntField(term107040, term107040.getClass(), "totalExpertHighScore", 1415141329);
        setIntField(term107040, term107040.getClass(), "totalMasterHighScore", 1866488615);
        setIntField(term107040, term107040.getClass(), "totalReMasterHighScore", 303848886);
        setIntField(term107040, term107040.getClass(), "totalHighSync", 1881530712);
        setIntField(term107040, term107040.getClass(), "totalEasySync", 222708508);
        setIntField(term107040, term107040.getClass(), "totalBasicSync", 1601090042);
        setIntField(term107040, term107040.getClass(), "totalAdvancedSync", 1841239584);
        setIntField(term107040, term107040.getClass(), "totalExpertSync", 1759632148);
        setIntField(term107040, term107040.getClass(), "totalMasterSync", -929628156);
        setIntField(term107040, term107040.getClass(), "totalReMasterSync", 1662377107);
        setIntField(term107040, term107040.getClass(), "playerRating", -270785615);
        setIntField(term107040, term107040.getClass(), "highestRating", 1707036301);
        setIntField(term107040, term107040.getClass(), "rankAuthTailId", 19933800);
        setField(term107040, term107040.getClass(), "eventWatchedDate", "vYzdCPfleW");
        setField(term107040, term107040.getClass(), "webLimitDate", "AXVMtieJQT");
        setIntField(term107040, term107040.getClass(), "challengeTrackPhase", -298980528);
        setIntField(term107040, term107040.getClass(), "firstPlayBits", -5656680);
        setField(term107040, term107040.getClass(), "lastPlayDate", "BKaXfQaGqm");
        setIntField(term107040, term107040.getClass(), "lastPlaceId", 1091964304);
        setField(term107040, term107040.getClass(), "lastPlaceName", "OpadJlQqJc");
        setIntField(term107040, term107040.getClass(), "lastRegionId", -613681108);
        setField(term107040, term107040.getClass(), "lastRegionName", "ZXdFbwHLvQ");
        setField(term107040, term107040.getClass(), "lastClientId", "VEastYHDbF");
        setField(term107040, term107040.getClass(), "lastCountryCode", "CVrxrIRbBP");
        setIntField(term107040, term107040.getClass(), "eventPoint", 1352625518);
        setIntField(term107040, term107040.getClass(), "totalLv", 668348121);
        setIntField(term107040, term107040.getClass(), "lastLoginBonusDay", 430885685);
        setIntField(term107040, term107040.getClass(), "lastSurvivalBonusDay", 468323881);
        setIntField(term107040, term107040.getClass(), "loginBonusLv", 1862554868);
        setField(term107038, term107038.getClass(), "user", term107040);
        setIntField(term107038, term107038.getClass(), "survivalId", -610778528);
        setIntField(term107038, term107038.getClass(), "totalScore", 1749515367);
        setIntField(term107038, term107038.getClass(), "totalAchieve", -1319948187);
        setBooleanField(term107038, term107038.getClass(), "isClear", true);
        setBooleanField(term107038, term107038.getClass(), "isNoDamage", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term107038, args);
    }

};


