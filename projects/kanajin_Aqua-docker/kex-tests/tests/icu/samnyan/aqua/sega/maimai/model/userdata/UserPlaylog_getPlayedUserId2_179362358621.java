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

public class UserPlaylog_getPlayedUserId2_179362358621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122303;

    public UserPlaylog_getPlayedUserId2_179362358621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term122309 = new Long(6895382576300001141L);
        term122303 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term122305 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term122307 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term122323 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122324 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122328 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122333 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122334 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122338 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term122303, term122303.getClass(), "id", -2143540634259970953L);
        setLongField(term122305, term122305.getClass(), "id", -6779665610828821838L);
        setLongField(term122307, term122307.getClass(), "id", 7026184159827656720L);
        setField(term122307, term122307.getClass(), "extId", term122309);
        setField(term122307, term122307.getClass(), "luid", "QJTDOLXoVI");
        setIntField(term122324, term122324.getClass(), "year", 2014);
        setShortField(term122324, term122324.getClass(), "month", (short) 9);
        setShortField(term122324, term122324.getClass(), "day", (short) 26);
        setField(term122323, term122323.getClass(), "date", term122324);
        setByteField(term122328, term122328.getClass(), "hour", (byte) 5);
        setByteField(term122328, term122328.getClass(), "minute", (byte) 40);
        setByteField(term122328, term122328.getClass(), "second", (byte) 6);
        setIntField(term122328, term122328.getClass(), "nano", 923937756);
        setField(term122323, term122323.getClass(), "time", term122328);
        setField(term122307, term122307.getClass(), "registerTime", term122323);
        setIntField(term122334, term122334.getClass(), "year", 2023);
        setShortField(term122334, term122334.getClass(), "month", (short) 8);
        setShortField(term122334, term122334.getClass(), "day", (short) 18);
        setField(term122333, term122333.getClass(), "date", term122334);
        setByteField(term122338, term122338.getClass(), "hour", (byte) 14);
        setByteField(term122338, term122338.getClass(), "minute", (byte) 2);
        setByteField(term122338, term122338.getClass(), "second", (byte) 54);
        setIntField(term122338, term122338.getClass(), "nano", 97633516);
        setField(term122333, term122333.getClass(), "time", term122338);
        setField(term122307, term122307.getClass(), "accessTime", term122333);
        setField(term122305, term122305.getClass(), "card", term122307);
        setIntField(term122305, term122305.getClass(), "lastDataVersion", -1286614190);
        setField(term122305, term122305.getClass(), "userName", "MVXNdXioDJ");
        setIntField(term122305, term122305.getClass(), "point", -2077410887);
        setIntField(term122305, term122305.getClass(), "totalPoint", -1955203822);
        setIntField(term122305, term122305.getClass(), "iconId", 1396977392);
        setIntField(term122305, term122305.getClass(), "nameplateId", -1677580127);
        setIntField(term122305, term122305.getClass(), "frameId", -256255169);
        setIntField(term122305, term122305.getClass(), "trophyId", -1928244069);
        setIntField(term122305, term122305.getClass(), "playCount", -1683332471);
        setIntField(term122305, term122305.getClass(), "playVsCount", 38870924);
        setIntField(term122305, term122305.getClass(), "playSyncCount", 379427802);
        setIntField(term122305, term122305.getClass(), "winCount", -1550927364);
        setIntField(term122305, term122305.getClass(), "helpCount", -886384913);
        setIntField(term122305, term122305.getClass(), "comboCount", -1933031867);
        setIntField(term122305, term122305.getClass(), "feverCount", 491284060);
        setIntField(term122305, term122305.getClass(), "totalHiScore", -866463269);
        setIntField(term122305, term122305.getClass(), "totalEasyHighScore", 2107415753);
        setIntField(term122305, term122305.getClass(), "totalBasicHighScore", -956932114);
        setIntField(term122305, term122305.getClass(), "totalAdvancedHighScore", 1892033303);
        setIntField(term122305, term122305.getClass(), "totalExpertHighScore", -1411609718);
        setIntField(term122305, term122305.getClass(), "totalMasterHighScore", 326153842);
        setIntField(term122305, term122305.getClass(), "totalReMasterHighScore", 100816803);
        setIntField(term122305, term122305.getClass(), "totalHighSync", 1731184786);
        setIntField(term122305, term122305.getClass(), "totalEasySync", 294317488);
        setIntField(term122305, term122305.getClass(), "totalBasicSync", -885458488);
        setIntField(term122305, term122305.getClass(), "totalAdvancedSync", 2104352702);
        setIntField(term122305, term122305.getClass(), "totalExpertSync", -1118813318);
        setIntField(term122305, term122305.getClass(), "totalMasterSync", -1619455704);
        setIntField(term122305, term122305.getClass(), "totalReMasterSync", -572867773);
        setIntField(term122305, term122305.getClass(), "playerRating", -724811435);
        setIntField(term122305, term122305.getClass(), "highestRating", 1503357399);
        setIntField(term122305, term122305.getClass(), "rankAuthTailId", -135502296);
        setField(term122305, term122305.getClass(), "eventWatchedDate", "xXscNmBGLP");
        setField(term122305, term122305.getClass(), "webLimitDate", "DOvWosNzCd");
        setIntField(term122305, term122305.getClass(), "challengeTrackPhase", -556231095);
        setIntField(term122305, term122305.getClass(), "firstPlayBits", -157802489);
        setField(term122305, term122305.getClass(), "lastPlayDate", "bIZNWEzBTe");
        setIntField(term122305, term122305.getClass(), "lastPlaceId", -607883905);
        setField(term122305, term122305.getClass(), "lastPlaceName", "CVhsNqYDrO");
        setIntField(term122305, term122305.getClass(), "lastRegionId", 640657317);
        setField(term122305, term122305.getClass(), "lastRegionName", "dMpUbtHwly");
        setField(term122305, term122305.getClass(), "lastClientId", "bxEEJVIcPG");
        setField(term122305, term122305.getClass(), "lastCountryCode", "UttOGDGpEr");
        setIntField(term122305, term122305.getClass(), "eventPoint", -50338111);
        setIntField(term122305, term122305.getClass(), "totalLv", -507824648);
        setIntField(term122305, term122305.getClass(), "lastLoginBonusDay", -1843101234);
        setIntField(term122305, term122305.getClass(), "lastSurvivalBonusDay", 773267702);
        setIntField(term122305, term122305.getClass(), "loginBonusLv", 1601947622);
        setField(term122303, term122303.getClass(), "user", term122305);
        setIntField(term122303, term122303.getClass(), "orderId", 520571929);
        setLongField(term122303, term122303.getClass(), "sortNumber", 432186805820232994L);
        setIntField(term122303, term122303.getClass(), "placeId", 66693270);
        setField(term122303, term122303.getClass(), "placeName", "aPScTdSsoS");
        setField(term122303, term122303.getClass(), "country", "CZYngwdoHw");
        setIntField(term122303, term122303.getClass(), "regionId", -573494857);
        setField(term122303, term122303.getClass(), "playDate", "ZbWZNiPrBA");
        setField(term122303, term122303.getClass(), "userPlayDate", "ilMWoyWLja");
        setIntField(term122303, term122303.getClass(), "musicId", -1189565347);
        setIntField(term122303, term122303.getClass(), "level", -1173359956);
        setIntField(term122303, term122303.getClass(), "gameMode", 328260180);
        setIntField(term122303, term122303.getClass(), "rivalNum", 1642593264);
        setIntField(term122303, term122303.getClass(), "track", -1801395320);
        setIntField(term122303, term122303.getClass(), "eventId", -1513570809);
        setBooleanField(term122303, term122303.getClass(), "isFreeToPlay", false);
        setIntField(term122303, term122303.getClass(), "playerRating", -51511899);
        setLongField(term122303, term122303.getClass(), "playedUserId1", -2991029806121048772L);
        setField(term122303, term122303.getClass(), "playedUserName1", "DejzaVMRwf");
        setIntField(term122303, term122303.getClass(), "playedMusicLevel1", 1376274549);
        setLongField(term122303, term122303.getClass(), "playedUserId2", -1146200229133968810L);
        setField(term122303, term122303.getClass(), "playedUserName2", "vpcvPRFXOI");
        setIntField(term122303, term122303.getClass(), "playedMusicLevel2", -1293180900);
        setLongField(term122303, term122303.getClass(), "playedUserId3", -7968999170526273722L);
        setField(term122303, term122303.getClass(), "playedUserName3", "LpBQSpICQX");
        setIntField(term122303, term122303.getClass(), "playedMusicLevel3", -1320940649);
        setIntField(term122303, term122303.getClass(), "achievement", 129458680);
        setIntField(term122303, term122303.getClass(), "score", 947006863);
        setIntField(term122303, term122303.getClass(), "tapScore", -893561872);
        setIntField(term122303, term122303.getClass(), "holdScore", 1277858599);
        setIntField(term122303, term122303.getClass(), "slideScore", 2102505859);
        setIntField(term122303, term122303.getClass(), "breakScore", 472937435);
        setIntField(term122303, term122303.getClass(), "syncRate", -583961320);
        setIntField(term122303, term122303.getClass(), "vsWin", -2059122590);
        setBooleanField(term122303, term122303.getClass(), "isAllPerfect", false);
        setIntField(term122303, term122303.getClass(), "fullCombo", 1635028602);
        setIntField(term122303, term122303.getClass(), "maxFever", -1584646798);
        setIntField(term122303, term122303.getClass(), "maxCombo", 1012072498);
        setIntField(term122303, term122303.getClass(), "tapPerfect", -605073258);
        setIntField(term122303, term122303.getClass(), "tapGreat", 189747070);
        setIntField(term122303, term122303.getClass(), "tapGood", -1829678263);
        setIntField(term122303, term122303.getClass(), "tapBad", 101338111);
        setIntField(term122303, term122303.getClass(), "holdPerfect", -1477832518);
        setIntField(term122303, term122303.getClass(), "holdGreat", 1121488723);
        setIntField(term122303, term122303.getClass(), "holdGood", 1759141083);
        setIntField(term122303, term122303.getClass(), "holdBad", -1193541067);
        setIntField(term122303, term122303.getClass(), "slidePerfect", 1034000306);
        setIntField(term122303, term122303.getClass(), "slideGreat", 408585174);
        setIntField(term122303, term122303.getClass(), "slideGood", -408891900);
        setIntField(term122303, term122303.getClass(), "slideBad", 1130254738);
        setIntField(term122303, term122303.getClass(), "breakPerfect", 1350953168);
        setIntField(term122303, term122303.getClass(), "breakGreat", -1493610451);
        setIntField(term122303, term122303.getClass(), "breakGood", -2139568336);
        setIntField(term122303, term122303.getClass(), "breakBad", 1879485748);
        setBooleanField(term122303, term122303.getClass(), "isTrackSkip", true);
        setBooleanField(term122303, term122303.getClass(), "isHighScore", true);
        setBooleanField(term122303, term122303.getClass(), "isChallengeTrack", false);
        setIntField(term122303, term122303.getClass(), "challengeLife", -319165794);
        setIntField(term122303, term122303.getClass(), "challengeRemain", 621790784);
        setIntField(term122303, term122303.getClass(), "isAllPerfectPlus", -1918000204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserId2", argTypes, term122303, args);
    }

};


