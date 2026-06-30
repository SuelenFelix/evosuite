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

public class UserMusicDetail_getMusicId_888495993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180745;

    public UserMusicDetail_getMusicId_888495993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term180751 = new Long(-8705953038984862378L);
        term180745 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term180747 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term180749 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term180765 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term180766 = newInstance(Class.forName("java.time.LocalDate"));
        Object term180770 = newInstance(Class.forName("java.time.LocalTime"));
        Object term180775 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term180776 = newInstance(Class.forName("java.time.LocalDate"));
        Object term180780 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term180745, term180745.getClass(), "id", 2769769615541963064L);
        setLongField(term180747, term180747.getClass(), "id", 3900506286067369407L);
        setLongField(term180749, term180749.getClass(), "id", 2739506880892071716L);
        setField(term180749, term180749.getClass(), "extId", term180751);
        setField(term180749, term180749.getClass(), "luid", "heuePoxaMW");
        setIntField(term180766, term180766.getClass(), "year", 2026);
        setShortField(term180766, term180766.getClass(), "month", (short) 3);
        setShortField(term180766, term180766.getClass(), "day", (short) 11);
        setField(term180765, term180765.getClass(), "date", term180766);
        setByteField(term180770, term180770.getClass(), "hour", (byte) 5);
        setByteField(term180770, term180770.getClass(), "minute", (byte) 28);
        setByteField(term180770, term180770.getClass(), "second", (byte) 38);
        setIntField(term180770, term180770.getClass(), "nano", 951846633);
        setField(term180765, term180765.getClass(), "time", term180770);
        setField(term180749, term180749.getClass(), "registerTime", term180765);
        setIntField(term180776, term180776.getClass(), "year", 2025);
        setShortField(term180776, term180776.getClass(), "month", (short) 3);
        setShortField(term180776, term180776.getClass(), "day", (short) 12);
        setField(term180775, term180775.getClass(), "date", term180776);
        setByteField(term180780, term180780.getClass(), "hour", (byte) 2);
        setByteField(term180780, term180780.getClass(), "minute", (byte) 17);
        setByteField(term180780, term180780.getClass(), "second", (byte) 13);
        setIntField(term180780, term180780.getClass(), "nano", 667967879);
        setField(term180775, term180775.getClass(), "time", term180780);
        setField(term180749, term180749.getClass(), "accessTime", term180775);
        setField(term180747, term180747.getClass(), "card", term180749);
        setIntField(term180747, term180747.getClass(), "lastDataVersion", -1494924053);
        setField(term180747, term180747.getClass(), "userName", "MxqYtTLyvM");
        setIntField(term180747, term180747.getClass(), "point", -524245009);
        setIntField(term180747, term180747.getClass(), "totalPoint", -1778012618);
        setIntField(term180747, term180747.getClass(), "iconId", 1108936390);
        setIntField(term180747, term180747.getClass(), "nameplateId", -442895243);
        setIntField(term180747, term180747.getClass(), "frameId", 94999093);
        setIntField(term180747, term180747.getClass(), "trophyId", -1221543090);
        setIntField(term180747, term180747.getClass(), "playCount", 544643367);
        setIntField(term180747, term180747.getClass(), "playVsCount", 47400504);
        setIntField(term180747, term180747.getClass(), "playSyncCount", -1783921433);
        setIntField(term180747, term180747.getClass(), "winCount", -965472872);
        setIntField(term180747, term180747.getClass(), "helpCount", 976152502);
        setIntField(term180747, term180747.getClass(), "comboCount", -437709477);
        setIntField(term180747, term180747.getClass(), "feverCount", -120964201);
        setIntField(term180747, term180747.getClass(), "totalHiScore", 1554481629);
        setIntField(term180747, term180747.getClass(), "totalEasyHighScore", -1054399872);
        setIntField(term180747, term180747.getClass(), "totalBasicHighScore", 1645242637);
        setIntField(term180747, term180747.getClass(), "totalAdvancedHighScore", -1748205238);
        setIntField(term180747, term180747.getClass(), "totalExpertHighScore", 2022334774);
        setIntField(term180747, term180747.getClass(), "totalMasterHighScore", -1929891554);
        setIntField(term180747, term180747.getClass(), "totalReMasterHighScore", -1512266789);
        setIntField(term180747, term180747.getClass(), "totalHighSync", -533541066);
        setIntField(term180747, term180747.getClass(), "totalEasySync", 370741881);
        setIntField(term180747, term180747.getClass(), "totalBasicSync", -1228310247);
        setIntField(term180747, term180747.getClass(), "totalAdvancedSync", -1043082176);
        setIntField(term180747, term180747.getClass(), "totalExpertSync", 1915917260);
        setIntField(term180747, term180747.getClass(), "totalMasterSync", 1946676976);
        setIntField(term180747, term180747.getClass(), "totalReMasterSync", -1213782391);
        setIntField(term180747, term180747.getClass(), "playerRating", 1201601154);
        setIntField(term180747, term180747.getClass(), "highestRating", 2121295352);
        setIntField(term180747, term180747.getClass(), "rankAuthTailId", -2134233524);
        setField(term180747, term180747.getClass(), "eventWatchedDate", "FuAWIrUgQq");
        setField(term180747, term180747.getClass(), "webLimitDate", "GMuFrECYuC");
        setIntField(term180747, term180747.getClass(), "challengeTrackPhase", 694278911);
        setIntField(term180747, term180747.getClass(), "firstPlayBits", 1385715643);
        setField(term180747, term180747.getClass(), "lastPlayDate", "sgrKLUdnej");
        setIntField(term180747, term180747.getClass(), "lastPlaceId", -2079086426);
        setField(term180747, term180747.getClass(), "lastPlaceName", "COSohDlJwZ");
        setIntField(term180747, term180747.getClass(), "lastRegionId", -1551426087);
        setField(term180747, term180747.getClass(), "lastRegionName", "mnrQVzZjuq");
        setField(term180747, term180747.getClass(), "lastClientId", "SwynsBLJcI");
        setField(term180747, term180747.getClass(), "lastCountryCode", "yXgTitaDXW");
        setIntField(term180747, term180747.getClass(), "eventPoint", -1568676188);
        setIntField(term180747, term180747.getClass(), "totalLv", -871949771);
        setIntField(term180747, term180747.getClass(), "lastLoginBonusDay", -1334680952);
        setIntField(term180747, term180747.getClass(), "lastSurvivalBonusDay", -1127278862);
        setIntField(term180747, term180747.getClass(), "loginBonusLv", 1671851938);
        setField(term180745, term180745.getClass(), "user", term180747);
        setIntField(term180745, term180745.getClass(), "musicId", -1032258821);
        setIntField(term180745, term180745.getClass(), "level", 809258518);
        setIntField(term180745, term180745.getClass(), "playCount", -1576736586);
        setIntField(term180745, term180745.getClass(), "scoreMax", 576924610);
        setIntField(term180745, term180745.getClass(), "syncRateMax", 1503633580);
        setBooleanField(term180745, term180745.getClass(), "isAllPerfect", true);
        setIntField(term180745, term180745.getClass(), "isAllPerfectPlus", 720922070);
        setIntField(term180745, term180745.getClass(), "fullCombo", 1149741307);
        setIntField(term180745, term180745.getClass(), "maxFever", -2136633259);
        setIntField(term180745, term180745.getClass(), "achievement", 1746983826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term180745, args);
    }

};


