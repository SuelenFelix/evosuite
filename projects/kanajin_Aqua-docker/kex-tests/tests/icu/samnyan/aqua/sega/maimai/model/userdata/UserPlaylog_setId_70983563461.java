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

public class UserPlaylog_setId_70983563461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141183;
     Object term141495;

    public UserPlaylog_setId_70983563461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term141189 = new Long(-412186147449928821L);
        term141183 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term141185 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term141187 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term141203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141204 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141208 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141218 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term141183, term141183.getClass(), "id", 2830531040991289470L);
        setLongField(term141185, term141185.getClass(), "id", -5227262300045722571L);
        setLongField(term141187, term141187.getClass(), "id", 8547681246636788948L);
        setField(term141187, term141187.getClass(), "extId", term141189);
        setField(term141187, term141187.getClass(), "luid", "yzFbLpPTrq");
        setIntField(term141204, term141204.getClass(), "year", 2028);
        setShortField(term141204, term141204.getClass(), "month", (short) 4);
        setShortField(term141204, term141204.getClass(), "day", (short) 5);
        setField(term141203, term141203.getClass(), "date", term141204);
        setByteField(term141208, term141208.getClass(), "hour", (byte) 14);
        setByteField(term141208, term141208.getClass(), "minute", (byte) 57);
        setByteField(term141208, term141208.getClass(), "second", (byte) 16);
        setIntField(term141208, term141208.getClass(), "nano", 963050998);
        setField(term141203, term141203.getClass(), "time", term141208);
        setField(term141187, term141187.getClass(), "registerTime", term141203);
        setIntField(term141214, term141214.getClass(), "year", 2027);
        setShortField(term141214, term141214.getClass(), "month", (short) 12);
        setShortField(term141214, term141214.getClass(), "day", (short) 25);
        setField(term141213, term141213.getClass(), "date", term141214);
        setByteField(term141218, term141218.getClass(), "hour", (byte) 19);
        setByteField(term141218, term141218.getClass(), "minute", (byte) 4);
        setByteField(term141218, term141218.getClass(), "second", (byte) 19);
        setIntField(term141218, term141218.getClass(), "nano", 237686859);
        setField(term141213, term141213.getClass(), "time", term141218);
        setField(term141187, term141187.getClass(), "accessTime", term141213);
        setField(term141185, term141185.getClass(), "card", term141187);
        setIntField(term141185, term141185.getClass(), "lastDataVersion", 1985662415);
        setField(term141185, term141185.getClass(), "userName", "iYRIEjEhxB");
        setIntField(term141185, term141185.getClass(), "point", 2060719232);
        setIntField(term141185, term141185.getClass(), "totalPoint", 106926990);
        setIntField(term141185, term141185.getClass(), "iconId", 803199278);
        setIntField(term141185, term141185.getClass(), "nameplateId", -589755209);
        setIntField(term141185, term141185.getClass(), "frameId", -651125720);
        setIntField(term141185, term141185.getClass(), "trophyId", -1348920499);
        setIntField(term141185, term141185.getClass(), "playCount", -1211511267);
        setIntField(term141185, term141185.getClass(), "playVsCount", -1968411696);
        setIntField(term141185, term141185.getClass(), "playSyncCount", 419141804);
        setIntField(term141185, term141185.getClass(), "winCount", -4764095);
        setIntField(term141185, term141185.getClass(), "helpCount", -1967454603);
        setIntField(term141185, term141185.getClass(), "comboCount", 362837180);
        setIntField(term141185, term141185.getClass(), "feverCount", 860277262);
        setIntField(term141185, term141185.getClass(), "totalHiScore", 377978480);
        setIntField(term141185, term141185.getClass(), "totalEasyHighScore", -2125543033);
        setIntField(term141185, term141185.getClass(), "totalBasicHighScore", 321747402);
        setIntField(term141185, term141185.getClass(), "totalAdvancedHighScore", -666164444);
        setIntField(term141185, term141185.getClass(), "totalExpertHighScore", 254019332);
        setIntField(term141185, term141185.getClass(), "totalMasterHighScore", -2065129105);
        setIntField(term141185, term141185.getClass(), "totalReMasterHighScore", -2129130374);
        setIntField(term141185, term141185.getClass(), "totalHighSync", -109520941);
        setIntField(term141185, term141185.getClass(), "totalEasySync", 1702695026);
        setIntField(term141185, term141185.getClass(), "totalBasicSync", -1269287323);
        setIntField(term141185, term141185.getClass(), "totalAdvancedSync", -1615669185);
        setIntField(term141185, term141185.getClass(), "totalExpertSync", -2034394499);
        setIntField(term141185, term141185.getClass(), "totalMasterSync", -412683553);
        setIntField(term141185, term141185.getClass(), "totalReMasterSync", 1603210066);
        setIntField(term141185, term141185.getClass(), "playerRating", -1776491130);
        setIntField(term141185, term141185.getClass(), "highestRating", -1930642248);
        setIntField(term141185, term141185.getClass(), "rankAuthTailId", 1916918462);
        setField(term141185, term141185.getClass(), "eventWatchedDate", "EyLarnQiro");
        setField(term141185, term141185.getClass(), "webLimitDate", "xPXCillnkF");
        setIntField(term141185, term141185.getClass(), "challengeTrackPhase", 1696395174);
        setIntField(term141185, term141185.getClass(), "firstPlayBits", -705525513);
        setField(term141185, term141185.getClass(), "lastPlayDate", "UQdNECYgYF");
        setIntField(term141185, term141185.getClass(), "lastPlaceId", 700196671);
        setField(term141185, term141185.getClass(), "lastPlaceName", "tWKRqEdXvq");
        setIntField(term141185, term141185.getClass(), "lastRegionId", 1231328189);
        setField(term141185, term141185.getClass(), "lastRegionName", "IzICHEiRZJ");
        setField(term141185, term141185.getClass(), "lastClientId", "OVdPWRdMle");
        setField(term141185, term141185.getClass(), "lastCountryCode", "oimCfCnzdd");
        setIntField(term141185, term141185.getClass(), "eventPoint", -1306445208);
        setIntField(term141185, term141185.getClass(), "totalLv", 512197370);
        setIntField(term141185, term141185.getClass(), "lastLoginBonusDay", -1450943187);
        setIntField(term141185, term141185.getClass(), "lastSurvivalBonusDay", 1336843745);
        setIntField(term141185, term141185.getClass(), "loginBonusLv", -1179901298);
        setField(term141183, term141183.getClass(), "user", term141185);
        setIntField(term141183, term141183.getClass(), "orderId", 203756412);
        setLongField(term141183, term141183.getClass(), "sortNumber", -2070418897756378076L);
        setIntField(term141183, term141183.getClass(), "placeId", 2065759847);
        setField(term141183, term141183.getClass(), "placeName", "kDhZwzBdJr");
        setField(term141183, term141183.getClass(), "country", "lGNwldURrK");
        setIntField(term141183, term141183.getClass(), "regionId", 1849946351);
        setField(term141183, term141183.getClass(), "playDate", "AfRMrnPQsz");
        setField(term141183, term141183.getClass(), "userPlayDate", "ilHCxxLSlR");
        setIntField(term141183, term141183.getClass(), "musicId", -1133721458);
        setIntField(term141183, term141183.getClass(), "level", 640615922);
        setIntField(term141183, term141183.getClass(), "gameMode", 171081050);
        setIntField(term141183, term141183.getClass(), "rivalNum", 632754702);
        setIntField(term141183, term141183.getClass(), "track", -1841445580);
        setIntField(term141183, term141183.getClass(), "eventId", 2076113309);
        setBooleanField(term141183, term141183.getClass(), "isFreeToPlay", true);
        setIntField(term141183, term141183.getClass(), "playerRating", -2032600090);
        setLongField(term141183, term141183.getClass(), "playedUserId1", 4733182453235379235L);
        setField(term141183, term141183.getClass(), "playedUserName1", "KINWoNPskz");
        setIntField(term141183, term141183.getClass(), "playedMusicLevel1", -1005822039);
        setLongField(term141183, term141183.getClass(), "playedUserId2", -5161762055522201695L);
        setField(term141183, term141183.getClass(), "playedUserName2", "ThcARbQtxE");
        setIntField(term141183, term141183.getClass(), "playedMusicLevel2", 1307267509);
        setLongField(term141183, term141183.getClass(), "playedUserId3", -6455995631591797782L);
        setField(term141183, term141183.getClass(), "playedUserName3", "zPIvKiioyO");
        setIntField(term141183, term141183.getClass(), "playedMusicLevel3", -1317705200);
        setIntField(term141183, term141183.getClass(), "achievement", -418675815);
        setIntField(term141183, term141183.getClass(), "score", 994817946);
        setIntField(term141183, term141183.getClass(), "tapScore", -710189819);
        setIntField(term141183, term141183.getClass(), "holdScore", 1362377711);
        setIntField(term141183, term141183.getClass(), "slideScore", 808324383);
        setIntField(term141183, term141183.getClass(), "breakScore", -1207706748);
        setIntField(term141183, term141183.getClass(), "syncRate", 1232151141);
        setIntField(term141183, term141183.getClass(), "vsWin", -1653681672);
        setBooleanField(term141183, term141183.getClass(), "isAllPerfect", true);
        setIntField(term141183, term141183.getClass(), "fullCombo", 985402105);
        setIntField(term141183, term141183.getClass(), "maxFever", 527775615);
        setIntField(term141183, term141183.getClass(), "maxCombo", -2134174401);
        setIntField(term141183, term141183.getClass(), "tapPerfect", -906498489);
        setIntField(term141183, term141183.getClass(), "tapGreat", 2097441645);
        setIntField(term141183, term141183.getClass(), "tapGood", -1336938758);
        setIntField(term141183, term141183.getClass(), "tapBad", -711772619);
        setIntField(term141183, term141183.getClass(), "holdPerfect", 2079712213);
        setIntField(term141183, term141183.getClass(), "holdGreat", 139412925);
        setIntField(term141183, term141183.getClass(), "holdGood", 1766544349);
        setIntField(term141183, term141183.getClass(), "holdBad", -190372489);
        setIntField(term141183, term141183.getClass(), "slidePerfect", -970335167);
        setIntField(term141183, term141183.getClass(), "slideGreat", 1150592667);
        setIntField(term141183, term141183.getClass(), "slideGood", 1151020014);
        setIntField(term141183, term141183.getClass(), "slideBad", 996050516);
        setIntField(term141183, term141183.getClass(), "breakPerfect", 1983854034);
        setIntField(term141183, term141183.getClass(), "breakGreat", 1299132379);
        setIntField(term141183, term141183.getClass(), "breakGood", 413755509);
        setIntField(term141183, term141183.getClass(), "breakBad", -993294317);
        setBooleanField(term141183, term141183.getClass(), "isTrackSkip", false);
        setBooleanField(term141183, term141183.getClass(), "isHighScore", true);
        setBooleanField(term141183, term141183.getClass(), "isChallengeTrack", false);
        setIntField(term141183, term141183.getClass(), "challengeLife", -1348190788);
        setIntField(term141183, term141183.getClass(), "challengeRemain", 1181515626);
        setIntField(term141183, term141183.getClass(), "isAllPerfectPlus", 1002517537);
        term141495 = new Long(-992220562260824979L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term141495;
        callMethod(klass, "setId", argTypes, term141183, args);
    }

};


