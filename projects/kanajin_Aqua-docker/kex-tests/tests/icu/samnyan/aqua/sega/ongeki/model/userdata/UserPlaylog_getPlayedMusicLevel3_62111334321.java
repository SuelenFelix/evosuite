package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserPlaylog_getPlayedMusicLevel3_62111334321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194490;

    public UserPlaylog_getPlayedMusicLevel3_62111334321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term194496 = new Long(7487838449539103993L);
        term194490 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term194492 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term194494 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term194510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term194511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term194515 = newInstance(Class.forName("java.time.LocalTime"));
        Object term194520 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term194521 = newInstance(Class.forName("java.time.LocalDate"));
        Object term194525 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term194490, term194490.getClass(), "id", 755596703777616531L);
        setLongField(term194492, term194492.getClass(), "id", 4064024558032123978L);
        setLongField(term194494, term194494.getClass(), "id", 7145794412304624733L);
        setField(term194494, term194494.getClass(), "extId", term194496);
        setField(term194494, term194494.getClass(), "luid", "jBvdIocvss");
        setIntField(term194511, term194511.getClass(), "year", 2024);
        setShortField(term194511, term194511.getClass(), "month", (short) 5);
        setShortField(term194511, term194511.getClass(), "day", (short) 2);
        setField(term194510, term194510.getClass(), "date", term194511);
        setByteField(term194515, term194515.getClass(), "hour", (byte) 16);
        setByteField(term194515, term194515.getClass(), "minute", (byte) 41);
        setByteField(term194515, term194515.getClass(), "second", (byte) 21);
        setIntField(term194515, term194515.getClass(), "nano", 463370731);
        setField(term194510, term194510.getClass(), "time", term194515);
        setField(term194494, term194494.getClass(), "registerTime", term194510);
        setIntField(term194521, term194521.getClass(), "year", 2027);
        setShortField(term194521, term194521.getClass(), "month", (short) 10);
        setShortField(term194521, term194521.getClass(), "day", (short) 4);
        setField(term194520, term194520.getClass(), "date", term194521);
        setByteField(term194525, term194525.getClass(), "hour", (byte) 23);
        setByteField(term194525, term194525.getClass(), "minute", (byte) 48);
        setByteField(term194525, term194525.getClass(), "second", (byte) 10);
        setIntField(term194525, term194525.getClass(), "nano", 256586329);
        setField(term194520, term194520.getClass(), "time", term194525);
        setField(term194494, term194494.getClass(), "accessTime", term194520);
        setField(term194492, term194492.getClass(), "card", term194494);
        setField(term194492, term194492.getClass(), "userName", "hpCfQefAiV");
        setIntField(term194492, term194492.getClass(), "level", -1892289922);
        setIntField(term194492, term194492.getClass(), "reincarnationNum", 987795798);
        setLongField(term194492, term194492.getClass(), "exp", 2829552823682090996L);
        setLongField(term194492, term194492.getClass(), "point", -5015750737482175704L);
        setLongField(term194492, term194492.getClass(), "totalPoint", -1437774821727356513L);
        setIntField(term194492, term194492.getClass(), "playCount", -219879129);
        setIntField(term194492, term194492.getClass(), "jewelCount", 676947608);
        setIntField(term194492, term194492.getClass(), "totalJewelCount", -777621571);
        setIntField(term194492, term194492.getClass(), "medalCount", -1228407222);
        setIntField(term194492, term194492.getClass(), "playerRating", -138743806);
        setIntField(term194492, term194492.getClass(), "highestRating", 1701079619);
        setIntField(term194492, term194492.getClass(), "battlePoint", -1822505135);
        setIntField(term194492, term194492.getClass(), "bestBattlePoint", 1664287048);
        setIntField(term194492, term194492.getClass(), "overDamageBattlePoint", 877573537);
        setBooleanField(term194492, term194492.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term194492, term194492.getClass(), "nameplateId", -785822775);
        setIntField(term194492, term194492.getClass(), "trophyId", -1481927507);
        setIntField(term194492, term194492.getClass(), "cardId", -1877062491);
        setIntField(term194492, term194492.getClass(), "characterId", 807661218);
        setIntField(term194492, term194492.getClass(), "characterVoiceNo", -6550207);
        setIntField(term194492, term194492.getClass(), "tabSetting", 2028051965);
        setIntField(term194492, term194492.getClass(), "tabSortSetting", 1503074692);
        setIntField(term194492, term194492.getClass(), "cardCategorySetting", -1315234681);
        setIntField(term194492, term194492.getClass(), "cardSortSetting", -1162608784);
        setIntField(term194492, term194492.getClass(), "rivalScoreCategorySetting", 746495371);
        setIntField(term194492, term194492.getClass(), "playedTutorialBit", -556744853);
        setIntField(term194492, term194492.getClass(), "firstTutorialCancelNum", -1396568132);
        setLongField(term194492, term194492.getClass(), "sumTechHighScore", -7595484344988141936L);
        setLongField(term194492, term194492.getClass(), "sumTechBasicHighScore", 6589159223353954342L);
        setLongField(term194492, term194492.getClass(), "sumTechAdvancedHighScore", -7368973459338784672L);
        setLongField(term194492, term194492.getClass(), "sumTechExpertHighScore", -7976516290695169572L);
        setLongField(term194492, term194492.getClass(), "sumTechMasterHighScore", -3472611771220786891L);
        setLongField(term194492, term194492.getClass(), "sumTechLunaticHighScore", -5245156700761266221L);
        setLongField(term194492, term194492.getClass(), "sumBattleHighScore", -3660699514135311515L);
        setLongField(term194492, term194492.getClass(), "sumBattleBasicHighScore", -1788657828389907109L);
        setLongField(term194492, term194492.getClass(), "sumBattleAdvancedHighScore", -1012039825774548964L);
        setLongField(term194492, term194492.getClass(), "sumBattleExpertHighScore", 2413946911910708169L);
        setLongField(term194492, term194492.getClass(), "sumBattleMasterHighScore", -4354064902026120504L);
        setLongField(term194492, term194492.getClass(), "sumBattleLunaticHighScore", 7572847841780625017L);
        setField(term194492, term194492.getClass(), "eventWatchedDate", "BNsTwwSVdm");
        setField(term194492, term194492.getClass(), "cmEventWatchedDate", "AwwvvQGxpM");
        setField(term194492, term194492.getClass(), "firstGameId", "ROJQMhSlSp");
        setField(term194492, term194492.getClass(), "firstRomVersion", "kCavCQhLaT");
        setField(term194492, term194492.getClass(), "firstDataVersion", "VByICFrnXL");
        setField(term194492, term194492.getClass(), "firstPlayDate", "tynLvlOaxC");
        setField(term194492, term194492.getClass(), "lastGameId", "kWIhwDlMNe");
        setField(term194492, term194492.getClass(), "lastRomVersion", "SQCgWvooUP");
        setField(term194492, term194492.getClass(), "lastDataVersion", "TrYZClWzDl");
        setField(term194492, term194492.getClass(), "compatibleCmVersion", "wojFGuqsty");
        setField(term194492, term194492.getClass(), "lastPlayDate", "URJQtMoail");
        setIntField(term194492, term194492.getClass(), "lastPlaceId", 1504884095);
        setField(term194492, term194492.getClass(), "lastPlaceName", "JqZttEKFir");
        setIntField(term194492, term194492.getClass(), "lastRegionId", 1296219492);
        setField(term194492, term194492.getClass(), "lastRegionName", "gWWBhcbddH");
        setIntField(term194492, term194492.getClass(), "lastAllNetId", -951865069);
        setField(term194492, term194492.getClass(), "lastClientId", "VYWHwcBEgR");
        setIntField(term194492, term194492.getClass(), "lastUsedDeckId", -1273231913);
        setIntField(term194492, term194492.getClass(), "lastPlayMusicLevel", 1882849261);
        setIntField(term194492, term194492.getClass(), "lastEmoneyBrand", 133409083);
        setField(term194490, term194490.getClass(), "user", term194492);
        setIntField(term194490, term194490.getClass(), "sortNumber", -1711345026);
        setIntField(term194490, term194490.getClass(), "placeId", -1999181791);
        setField(term194490, term194490.getClass(), "placeName", "NiLWicWdLg");
        setField(term194490, term194490.getClass(), "playDate", "ArFHobFNWr");
        setField(term194490, term194490.getClass(), "userPlayDate", "drPIYSWWXx");
        setIntField(term194490, term194490.getClass(), "musicId", 617751238);
        setIntField(term194490, term194490.getClass(), "level", -1490789748);
        setIntField(term194490, term194490.getClass(), "playKind", 1548901455);
        setIntField(term194490, term194490.getClass(), "eventId", -1959301548);
        setField(term194490, term194490.getClass(), "eventName", "WzLxpLKFtm");
        setIntField(term194490, term194490.getClass(), "eventPoint", 987806484);
        setIntField(term194490, term194490.getClass(), "playedUserId1", -1033174268);
        setIntField(term194490, term194490.getClass(), "playedUserId2", -393658283);
        setIntField(term194490, term194490.getClass(), "playedUserId3", 1751001510);
        setField(term194490, term194490.getClass(), "playedUserName1", "msvJdZPPTe");
        setField(term194490, term194490.getClass(), "playedUserName2", "wbmmtLxBzZ");
        setField(term194490, term194490.getClass(), "playedUserName3", "vrKiCEvbcr");
        setIntField(term194490, term194490.getClass(), "playedMusicLevel1", -1222375530);
        setIntField(term194490, term194490.getClass(), "playedMusicLevel2", 673233183);
        setIntField(term194490, term194490.getClass(), "playedMusicLevel3", 147997544);
        setIntField(term194490, term194490.getClass(), "cardId1", -2078032890);
        setIntField(term194490, term194490.getClass(), "cardId2", -1228044113);
        setIntField(term194490, term194490.getClass(), "cardId3", 1818020627);
        setIntField(term194490, term194490.getClass(), "cardLevel1", 1189773432);
        setIntField(term194490, term194490.getClass(), "cardLevel2", -722813020);
        setIntField(term194490, term194490.getClass(), "cardLevel3", -2087572575);
        setIntField(term194490, term194490.getClass(), "cardAttack1", -426255380);
        setIntField(term194490, term194490.getClass(), "cardAttack2", -1947252510);
        setIntField(term194490, term194490.getClass(), "cardAttack3", -2010504521);
        setIntField(term194490, term194490.getClass(), "bossCharaId", -2118814470);
        setIntField(term194490, term194490.getClass(), "bossLevel", -813617417);
        setIntField(term194490, term194490.getClass(), "bossAttribute", -1373956603);
        setIntField(term194490, term194490.getClass(), "clearStatus", 693828474);
        setIntField(term194490, term194490.getClass(), "techScore", 1534615118);
        setIntField(term194490, term194490.getClass(), "techScoreRank", -732773020);
        setIntField(term194490, term194490.getClass(), "battleScore", 1231519765);
        setIntField(term194490, term194490.getClass(), "battleScoreRank", -970909578);
        setIntField(term194490, term194490.getClass(), "platinumScore", -827598043);
        setIntField(term194490, term194490.getClass(), "maxCombo", 1788293670);
        setIntField(term194490, term194490.getClass(), "judgeMiss", 894914094);
        setIntField(term194490, term194490.getClass(), "judgeHit", -902442746);
        setIntField(term194490, term194490.getClass(), "judgeBreak", -122537673);
        setIntField(term194490, term194490.getClass(), "judgeCriticalBreak", 824068126);
        setIntField(term194490, term194490.getClass(), "rateTap", 1657336748);
        setIntField(term194490, term194490.getClass(), "rateHold", -267331048);
        setIntField(term194490, term194490.getClass(), "rateFlick", -1707487274);
        setIntField(term194490, term194490.getClass(), "rateSideTap", -687077769);
        setIntField(term194490, term194490.getClass(), "rateSideHold", 1239617209);
        setIntField(term194490, term194490.getClass(), "bellCount", -1866259664);
        setIntField(term194490, term194490.getClass(), "totalBellCount", -240209237);
        setIntField(term194490, term194490.getClass(), "damageCount", 448751443);
        setIntField(term194490, term194490.getClass(), "overDamage", -2026783706);
        setBooleanField(term194490, term194490.getClass(), "isTechNewRecord", false);
        setBooleanField(term194490, term194490.getClass(), "isBattleNewRecord", false);
        setBooleanField(term194490, term194490.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term194490, term194490.getClass(), "isFullCombo", true);
        setBooleanField(term194490, term194490.getClass(), "isFullBell", true);
        setBooleanField(term194490, term194490.getClass(), "isAllBreak", false);
        setIntField(term194490, term194490.getClass(), "playerRating", 36962226);
        setIntField(term194490, term194490.getClass(), "battlePoint", -787981404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedMusicLevel3", argTypes, term194490, args);
    }

};


