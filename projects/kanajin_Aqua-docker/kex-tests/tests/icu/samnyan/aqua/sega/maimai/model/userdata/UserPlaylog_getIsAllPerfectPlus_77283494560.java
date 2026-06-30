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

public class UserPlaylog_getIsAllPerfectPlus_77283494560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140711;

    public UserPlaylog_getIsAllPerfectPlus_77283494560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term140717 = new Long(-1526328443223793465L);
        term140711 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term140713 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term140715 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term140731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140736 = newInstance(Class.forName("java.time.LocalTime"));
        Object term140741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140746 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term140711, term140711.getClass(), "id", -9079056015194933995L);
        setLongField(term140713, term140713.getClass(), "id", -8867721217716506903L);
        setLongField(term140715, term140715.getClass(), "id", -1244148850479968082L);
        setField(term140715, term140715.getClass(), "extId", term140717);
        setField(term140715, term140715.getClass(), "luid", "WdJpcVlXsy");
        setIntField(term140732, term140732.getClass(), "year", 2017);
        setShortField(term140732, term140732.getClass(), "month", (short) 9);
        setShortField(term140732, term140732.getClass(), "day", (short) 8);
        setField(term140731, term140731.getClass(), "date", term140732);
        setByteField(term140736, term140736.getClass(), "hour", (byte) 6);
        setByteField(term140736, term140736.getClass(), "minute", (byte) 20);
        setByteField(term140736, term140736.getClass(), "second", (byte) 45);
        setIntField(term140736, term140736.getClass(), "nano", 768981890);
        setField(term140731, term140731.getClass(), "time", term140736);
        setField(term140715, term140715.getClass(), "registerTime", term140731);
        setIntField(term140742, term140742.getClass(), "year", 2024);
        setShortField(term140742, term140742.getClass(), "month", (short) 7);
        setShortField(term140742, term140742.getClass(), "day", (short) 3);
        setField(term140741, term140741.getClass(), "date", term140742);
        setByteField(term140746, term140746.getClass(), "hour", (byte) 8);
        setByteField(term140746, term140746.getClass(), "minute", (byte) 6);
        setByteField(term140746, term140746.getClass(), "second", (byte) 33);
        setIntField(term140746, term140746.getClass(), "nano", 210450276);
        setField(term140741, term140741.getClass(), "time", term140746);
        setField(term140715, term140715.getClass(), "accessTime", term140741);
        setField(term140713, term140713.getClass(), "card", term140715);
        setIntField(term140713, term140713.getClass(), "lastDataVersion", -1087471651);
        setField(term140713, term140713.getClass(), "userName", "uYQVtgtMJM");
        setIntField(term140713, term140713.getClass(), "point", 1869899776);
        setIntField(term140713, term140713.getClass(), "totalPoint", 2034369438);
        setIntField(term140713, term140713.getClass(), "iconId", -1784707255);
        setIntField(term140713, term140713.getClass(), "nameplateId", -1007991583);
        setIntField(term140713, term140713.getClass(), "frameId", 509641395);
        setIntField(term140713, term140713.getClass(), "trophyId", -1784404553);
        setIntField(term140713, term140713.getClass(), "playCount", -1943012393);
        setIntField(term140713, term140713.getClass(), "playVsCount", -1950346318);
        setIntField(term140713, term140713.getClass(), "playSyncCount", 989437746);
        setIntField(term140713, term140713.getClass(), "winCount", 1117487487);
        setIntField(term140713, term140713.getClass(), "helpCount", 1631255765);
        setIntField(term140713, term140713.getClass(), "comboCount", -1811916333);
        setIntField(term140713, term140713.getClass(), "feverCount", 752701210);
        setIntField(term140713, term140713.getClass(), "totalHiScore", -589123886);
        setIntField(term140713, term140713.getClass(), "totalEasyHighScore", -2123961926);
        setIntField(term140713, term140713.getClass(), "totalBasicHighScore", 92959773);
        setIntField(term140713, term140713.getClass(), "totalAdvancedHighScore", 1259656699);
        setIntField(term140713, term140713.getClass(), "totalExpertHighScore", -759058640);
        setIntField(term140713, term140713.getClass(), "totalMasterHighScore", -783182633);
        setIntField(term140713, term140713.getClass(), "totalReMasterHighScore", -1856665425);
        setIntField(term140713, term140713.getClass(), "totalHighSync", -1153683909);
        setIntField(term140713, term140713.getClass(), "totalEasySync", -264250668);
        setIntField(term140713, term140713.getClass(), "totalBasicSync", -532534050);
        setIntField(term140713, term140713.getClass(), "totalAdvancedSync", -1683059678);
        setIntField(term140713, term140713.getClass(), "totalExpertSync", -1860569030);
        setIntField(term140713, term140713.getClass(), "totalMasterSync", 14617348);
        setIntField(term140713, term140713.getClass(), "totalReMasterSync", -900613464);
        setIntField(term140713, term140713.getClass(), "playerRating", -786176511);
        setIntField(term140713, term140713.getClass(), "highestRating", 530888631);
        setIntField(term140713, term140713.getClass(), "rankAuthTailId", 1412339114);
        setField(term140713, term140713.getClass(), "eventWatchedDate", "AxhrYuHpMZ");
        setField(term140713, term140713.getClass(), "webLimitDate", "ZLdlevjZxO");
        setIntField(term140713, term140713.getClass(), "challengeTrackPhase", -42518734);
        setIntField(term140713, term140713.getClass(), "firstPlayBits", -1407031176);
        setField(term140713, term140713.getClass(), "lastPlayDate", "xFTRWovmcb");
        setIntField(term140713, term140713.getClass(), "lastPlaceId", 1431569265);
        setField(term140713, term140713.getClass(), "lastPlaceName", "fDNpBZJcEK");
        setIntField(term140713, term140713.getClass(), "lastRegionId", 542764580);
        setField(term140713, term140713.getClass(), "lastRegionName", "jURNSwGUrp");
        setField(term140713, term140713.getClass(), "lastClientId", "nIWnIRXTGB");
        setField(term140713, term140713.getClass(), "lastCountryCode", "cjGGcykErb");
        setIntField(term140713, term140713.getClass(), "eventPoint", 1882226152);
        setIntField(term140713, term140713.getClass(), "totalLv", -750940342);
        setIntField(term140713, term140713.getClass(), "lastLoginBonusDay", 1784843025);
        setIntField(term140713, term140713.getClass(), "lastSurvivalBonusDay", 734003031);
        setIntField(term140713, term140713.getClass(), "loginBonusLv", 877764390);
        setField(term140711, term140711.getClass(), "user", term140713);
        setIntField(term140711, term140711.getClass(), "orderId", 1766341128);
        setLongField(term140711, term140711.getClass(), "sortNumber", 8346326079558512850L);
        setIntField(term140711, term140711.getClass(), "placeId", -225437881);
        setField(term140711, term140711.getClass(), "placeName", "ahJJxxxyVu");
        setField(term140711, term140711.getClass(), "country", "IABlyhoUtz");
        setIntField(term140711, term140711.getClass(), "regionId", 31298314);
        setField(term140711, term140711.getClass(), "playDate", "QDgkRKDgSY");
        setField(term140711, term140711.getClass(), "userPlayDate", "SptxbRhzuT");
        setIntField(term140711, term140711.getClass(), "musicId", -1323804933);
        setIntField(term140711, term140711.getClass(), "level", -1191029377);
        setIntField(term140711, term140711.getClass(), "gameMode", -884938702);
        setIntField(term140711, term140711.getClass(), "rivalNum", 1101421168);
        setIntField(term140711, term140711.getClass(), "track", 1027189807);
        setIntField(term140711, term140711.getClass(), "eventId", 426977394);
        setBooleanField(term140711, term140711.getClass(), "isFreeToPlay", false);
        setIntField(term140711, term140711.getClass(), "playerRating", 1154094596);
        setLongField(term140711, term140711.getClass(), "playedUserId1", 4554910377138538493L);
        setField(term140711, term140711.getClass(), "playedUserName1", "mIFDQhdALu");
        setIntField(term140711, term140711.getClass(), "playedMusicLevel1", 554527750);
        setLongField(term140711, term140711.getClass(), "playedUserId2", -2306787824604312942L);
        setField(term140711, term140711.getClass(), "playedUserName2", "IfjNTGtdwY");
        setIntField(term140711, term140711.getClass(), "playedMusicLevel2", -1736705145);
        setLongField(term140711, term140711.getClass(), "playedUserId3", 5604034478428783596L);
        setField(term140711, term140711.getClass(), "playedUserName3", "ToupqTNDBq");
        setIntField(term140711, term140711.getClass(), "playedMusicLevel3", 1968125832);
        setIntField(term140711, term140711.getClass(), "achievement", 277927909);
        setIntField(term140711, term140711.getClass(), "score", -63485281);
        setIntField(term140711, term140711.getClass(), "tapScore", -1261440186);
        setIntField(term140711, term140711.getClass(), "holdScore", -1304169337);
        setIntField(term140711, term140711.getClass(), "slideScore", -677587688);
        setIntField(term140711, term140711.getClass(), "breakScore", -337851972);
        setIntField(term140711, term140711.getClass(), "syncRate", -318815497);
        setIntField(term140711, term140711.getClass(), "vsWin", -336417598);
        setBooleanField(term140711, term140711.getClass(), "isAllPerfect", true);
        setIntField(term140711, term140711.getClass(), "fullCombo", 882631772);
        setIntField(term140711, term140711.getClass(), "maxFever", -1090034911);
        setIntField(term140711, term140711.getClass(), "maxCombo", -886045847);
        setIntField(term140711, term140711.getClass(), "tapPerfect", 1694984912);
        setIntField(term140711, term140711.getClass(), "tapGreat", 324525460);
        setIntField(term140711, term140711.getClass(), "tapGood", -171650652);
        setIntField(term140711, term140711.getClass(), "tapBad", -1209525509);
        setIntField(term140711, term140711.getClass(), "holdPerfect", 2121252734);
        setIntField(term140711, term140711.getClass(), "holdGreat", 75850153);
        setIntField(term140711, term140711.getClass(), "holdGood", 905512263);
        setIntField(term140711, term140711.getClass(), "holdBad", -1288953319);
        setIntField(term140711, term140711.getClass(), "slidePerfect", 1820370438);
        setIntField(term140711, term140711.getClass(), "slideGreat", -505627473);
        setIntField(term140711, term140711.getClass(), "slideGood", 911393929);
        setIntField(term140711, term140711.getClass(), "slideBad", -1190556666);
        setIntField(term140711, term140711.getClass(), "breakPerfect", -1290143872);
        setIntField(term140711, term140711.getClass(), "breakGreat", -1982052794);
        setIntField(term140711, term140711.getClass(), "breakGood", -422015239);
        setIntField(term140711, term140711.getClass(), "breakBad", -778823717);
        setBooleanField(term140711, term140711.getClass(), "isTrackSkip", true);
        setBooleanField(term140711, term140711.getClass(), "isHighScore", false);
        setBooleanField(term140711, term140711.getClass(), "isChallengeTrack", true);
        setIntField(term140711, term140711.getClass(), "challengeLife", 1338581400);
        setIntField(term140711, term140711.getClass(), "challengeRemain", -2035948478);
        setIntField(term140711, term140711.getClass(), "isAllPerfectPlus", 667456779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsAllPerfectPlus", argTypes, term140711, args);
    }

};


