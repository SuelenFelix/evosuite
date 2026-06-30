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

public class UserSurvival_isClear_20269919926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103508;

    public UserSurvival_isClear_20269919926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term103514 = new Long(6636235983121346803L);
        term103508 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term103510 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term103512 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term103528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103529 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103533 = newInstance(Class.forName("java.time.LocalTime"));
        Object term103538 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103539 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103543 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term103508, term103508.getClass(), "id", 7534205281044116098L);
        setLongField(term103510, term103510.getClass(), "id", -4078647199307459633L);
        setLongField(term103512, term103512.getClass(), "id", -2505751043723962819L);
        setField(term103512, term103512.getClass(), "extId", term103514);
        setField(term103512, term103512.getClass(), "luid", "kvBRGWtVMY");
        setIntField(term103529, term103529.getClass(), "year", 2024);
        setShortField(term103529, term103529.getClass(), "month", (short) 10);
        setShortField(term103529, term103529.getClass(), "day", (short) 29);
        setField(term103528, term103528.getClass(), "date", term103529);
        setByteField(term103533, term103533.getClass(), "hour", (byte) 8);
        setByteField(term103533, term103533.getClass(), "minute", (byte) 39);
        setByteField(term103533, term103533.getClass(), "second", (byte) 36);
        setIntField(term103533, term103533.getClass(), "nano", 718768967);
        setField(term103528, term103528.getClass(), "time", term103533);
        setField(term103512, term103512.getClass(), "registerTime", term103528);
        setIntField(term103539, term103539.getClass(), "year", 2010);
        setShortField(term103539, term103539.getClass(), "month", (short) 4);
        setShortField(term103539, term103539.getClass(), "day", (short) 5);
        setField(term103538, term103538.getClass(), "date", term103539);
        setByteField(term103543, term103543.getClass(), "hour", (byte) 6);
        setByteField(term103543, term103543.getClass(), "minute", (byte) 31);
        setByteField(term103543, term103543.getClass(), "second", (byte) 49);
        setIntField(term103543, term103543.getClass(), "nano", 665880484);
        setField(term103538, term103538.getClass(), "time", term103543);
        setField(term103512, term103512.getClass(), "accessTime", term103538);
        setField(term103510, term103510.getClass(), "card", term103512);
        setIntField(term103510, term103510.getClass(), "lastDataVersion", -523133922);
        setField(term103510, term103510.getClass(), "userName", "nnkddhphsi");
        setIntField(term103510, term103510.getClass(), "point", -1190413422);
        setIntField(term103510, term103510.getClass(), "totalPoint", -1614665116);
        setIntField(term103510, term103510.getClass(), "iconId", 1721635852);
        setIntField(term103510, term103510.getClass(), "nameplateId", 560457275);
        setIntField(term103510, term103510.getClass(), "frameId", -1981813317);
        setIntField(term103510, term103510.getClass(), "trophyId", 501970469);
        setIntField(term103510, term103510.getClass(), "playCount", -106034021);
        setIntField(term103510, term103510.getClass(), "playVsCount", 364258643);
        setIntField(term103510, term103510.getClass(), "playSyncCount", -161354342);
        setIntField(term103510, term103510.getClass(), "winCount", 165488822);
        setIntField(term103510, term103510.getClass(), "helpCount", 1722923000);
        setIntField(term103510, term103510.getClass(), "comboCount", 858754727);
        setIntField(term103510, term103510.getClass(), "feverCount", -1742452774);
        setIntField(term103510, term103510.getClass(), "totalHiScore", 302391633);
        setIntField(term103510, term103510.getClass(), "totalEasyHighScore", 840891134);
        setIntField(term103510, term103510.getClass(), "totalBasicHighScore", 897279041);
        setIntField(term103510, term103510.getClass(), "totalAdvancedHighScore", 1618600938);
        setIntField(term103510, term103510.getClass(), "totalExpertHighScore", 1355173839);
        setIntField(term103510, term103510.getClass(), "totalMasterHighScore", -1273719525);
        setIntField(term103510, term103510.getClass(), "totalReMasterHighScore", -627109579);
        setIntField(term103510, term103510.getClass(), "totalHighSync", -1837554447);
        setIntField(term103510, term103510.getClass(), "totalEasySync", -2008091503);
        setIntField(term103510, term103510.getClass(), "totalBasicSync", -1368642453);
        setIntField(term103510, term103510.getClass(), "totalAdvancedSync", 2046248490);
        setIntField(term103510, term103510.getClass(), "totalExpertSync", -1671715330);
        setIntField(term103510, term103510.getClass(), "totalMasterSync", 1265400484);
        setIntField(term103510, term103510.getClass(), "totalReMasterSync", 1440253698);
        setIntField(term103510, term103510.getClass(), "playerRating", -1090004456);
        setIntField(term103510, term103510.getClass(), "highestRating", -1834941052);
        setIntField(term103510, term103510.getClass(), "rankAuthTailId", -720285664);
        setField(term103510, term103510.getClass(), "eventWatchedDate", "VPJfuXpuzc");
        setField(term103510, term103510.getClass(), "webLimitDate", "zdrDwRmBqL");
        setIntField(term103510, term103510.getClass(), "challengeTrackPhase", 178095497);
        setIntField(term103510, term103510.getClass(), "firstPlayBits", -211651758);
        setField(term103510, term103510.getClass(), "lastPlayDate", "DhSRNlYOFL");
        setIntField(term103510, term103510.getClass(), "lastPlaceId", 718173188);
        setField(term103510, term103510.getClass(), "lastPlaceName", "mrmNORhOYE");
        setIntField(term103510, term103510.getClass(), "lastRegionId", -1945411376);
        setField(term103510, term103510.getClass(), "lastRegionName", "IAlXRzFnsw");
        setField(term103510, term103510.getClass(), "lastClientId", "QGWHwsqzqh");
        setField(term103510, term103510.getClass(), "lastCountryCode", "HToXzWGnjh");
        setIntField(term103510, term103510.getClass(), "eventPoint", -1070288117);
        setIntField(term103510, term103510.getClass(), "totalLv", 1751137479);
        setIntField(term103510, term103510.getClass(), "lastLoginBonusDay", -1425278453);
        setIntField(term103510, term103510.getClass(), "lastSurvivalBonusDay", 1791235863);
        setIntField(term103510, term103510.getClass(), "loginBonusLv", 889880081);
        setField(term103508, term103508.getClass(), "user", term103510);
        setIntField(term103508, term103508.getClass(), "survivalId", 711666564);
        setIntField(term103508, term103508.getClass(), "totalScore", -1568954017);
        setIntField(term103508, term103508.getClass(), "totalAchieve", 1183123217);
        setBooleanField(term103508, term103508.getClass(), "isClear", false);
        setBooleanField(term103508, term103508.getClass(), "isNoDamage", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClear", argTypes, term103508, args);
    }

};


