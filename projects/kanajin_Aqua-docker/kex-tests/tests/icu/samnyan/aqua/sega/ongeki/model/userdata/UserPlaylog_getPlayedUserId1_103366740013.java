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

public class UserPlaylog_getPlayedUserId1_103366740013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189434;

    public UserPlaylog_getPlayedUserId1_103366740013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term189440 = new Long(-769824408235898287L);
        term189434 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term189436 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term189438 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term189454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term189455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term189459 = newInstance(Class.forName("java.time.LocalTime"));
        Object term189464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term189465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term189469 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term189434, term189434.getClass(), "id", 5993031302576036949L);
        setLongField(term189436, term189436.getClass(), "id", -5011107037416422675L);
        setLongField(term189438, term189438.getClass(), "id", -8958846949993717340L);
        setField(term189438, term189438.getClass(), "extId", term189440);
        setField(term189438, term189438.getClass(), "luid", "xFPxQbDlQc");
        setIntField(term189455, term189455.getClass(), "year", 2018);
        setShortField(term189455, term189455.getClass(), "month", (short) 1);
        setShortField(term189455, term189455.getClass(), "day", (short) 8);
        setField(term189454, term189454.getClass(), "date", term189455);
        setByteField(term189459, term189459.getClass(), "hour", (byte) 23);
        setByteField(term189459, term189459.getClass(), "minute", (byte) 58);
        setByteField(term189459, term189459.getClass(), "second", (byte) 55);
        setIntField(term189459, term189459.getClass(), "nano", 748244349);
        setField(term189454, term189454.getClass(), "time", term189459);
        setField(term189438, term189438.getClass(), "registerTime", term189454);
        setIntField(term189465, term189465.getClass(), "year", 2012);
        setShortField(term189465, term189465.getClass(), "month", (short) 12);
        setShortField(term189465, term189465.getClass(), "day", (short) 21);
        setField(term189464, term189464.getClass(), "date", term189465);
        setByteField(term189469, term189469.getClass(), "hour", (byte) 3);
        setByteField(term189469, term189469.getClass(), "minute", (byte) 1);
        setByteField(term189469, term189469.getClass(), "second", (byte) 47);
        setIntField(term189469, term189469.getClass(), "nano", 592405787);
        setField(term189464, term189464.getClass(), "time", term189469);
        setField(term189438, term189438.getClass(), "accessTime", term189464);
        setField(term189436, term189436.getClass(), "card", term189438);
        setField(term189436, term189436.getClass(), "userName", "YPDHBTLaVR");
        setIntField(term189436, term189436.getClass(), "level", 1250324874);
        setIntField(term189436, term189436.getClass(), "reincarnationNum", 1178706689);
        setLongField(term189436, term189436.getClass(), "exp", 8754835613868455656L);
        setLongField(term189436, term189436.getClass(), "point", -5172868456632523478L);
        setLongField(term189436, term189436.getClass(), "totalPoint", -4738020182896727772L);
        setIntField(term189436, term189436.getClass(), "playCount", -1020078059);
        setIntField(term189436, term189436.getClass(), "jewelCount", 16810905);
        setIntField(term189436, term189436.getClass(), "totalJewelCount", 1606121980);
        setIntField(term189436, term189436.getClass(), "medalCount", -1026229128);
        setIntField(term189436, term189436.getClass(), "playerRating", 477082448);
        setIntField(term189436, term189436.getClass(), "highestRating", 679699744);
        setIntField(term189436, term189436.getClass(), "battlePoint", -1103337770);
        setIntField(term189436, term189436.getClass(), "bestBattlePoint", -2088151020);
        setIntField(term189436, term189436.getClass(), "overDamageBattlePoint", 1163080603);
        setBooleanField(term189436, term189436.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term189436, term189436.getClass(), "nameplateId", 1295420131);
        setIntField(term189436, term189436.getClass(), "trophyId", 336805159);
        setIntField(term189436, term189436.getClass(), "cardId", 232372924);
        setIntField(term189436, term189436.getClass(), "characterId", -990813762);
        setIntField(term189436, term189436.getClass(), "characterVoiceNo", -2116581159);
        setIntField(term189436, term189436.getClass(), "tabSetting", 1490086994);
        setIntField(term189436, term189436.getClass(), "tabSortSetting", -84736186);
        setIntField(term189436, term189436.getClass(), "cardCategorySetting", -424416249);
        setIntField(term189436, term189436.getClass(), "cardSortSetting", -373604918);
        setIntField(term189436, term189436.getClass(), "rivalScoreCategorySetting", 1916170622);
        setIntField(term189436, term189436.getClass(), "playedTutorialBit", 1639180296);
        setIntField(term189436, term189436.getClass(), "firstTutorialCancelNum", 1956352585);
        setLongField(term189436, term189436.getClass(), "sumTechHighScore", -3991476732027265263L);
        setLongField(term189436, term189436.getClass(), "sumTechBasicHighScore", -8337971790150085955L);
        setLongField(term189436, term189436.getClass(), "sumTechAdvancedHighScore", 8803656305740741780L);
        setLongField(term189436, term189436.getClass(), "sumTechExpertHighScore", 6508795630556315171L);
        setLongField(term189436, term189436.getClass(), "sumTechMasterHighScore", -2254422363064059234L);
        setLongField(term189436, term189436.getClass(), "sumTechLunaticHighScore", -6360645794639848346L);
        setLongField(term189436, term189436.getClass(), "sumBattleHighScore", -409755716386126160L);
        setLongField(term189436, term189436.getClass(), "sumBattleBasicHighScore", -2762250715796493645L);
        setLongField(term189436, term189436.getClass(), "sumBattleAdvancedHighScore", 9187657468194834951L);
        setLongField(term189436, term189436.getClass(), "sumBattleExpertHighScore", 1002083751724182558L);
        setLongField(term189436, term189436.getClass(), "sumBattleMasterHighScore", -9203915944121138435L);
        setLongField(term189436, term189436.getClass(), "sumBattleLunaticHighScore", 7415866669809957793L);
        setField(term189436, term189436.getClass(), "eventWatchedDate", "mLQxMcHGBW");
        setField(term189436, term189436.getClass(), "cmEventWatchedDate", "bRjKFxPvcV");
        setField(term189436, term189436.getClass(), "firstGameId", "KVGSqTwbwl");
        setField(term189436, term189436.getClass(), "firstRomVersion", "KUxkASzarE");
        setField(term189436, term189436.getClass(), "firstDataVersion", "uzLvnPKgLL");
        setField(term189436, term189436.getClass(), "firstPlayDate", "aQPqpljoGP");
        setField(term189436, term189436.getClass(), "lastGameId", "wEvLiMyHnX");
        setField(term189436, term189436.getClass(), "lastRomVersion", "hcggLiqWYZ");
        setField(term189436, term189436.getClass(), "lastDataVersion", "cLJRzvSbSN");
        setField(term189436, term189436.getClass(), "compatibleCmVersion", "tXtxReOADl");
        setField(term189436, term189436.getClass(), "lastPlayDate", "NBwtdrTbSF");
        setIntField(term189436, term189436.getClass(), "lastPlaceId", -647730942);
        setField(term189436, term189436.getClass(), "lastPlaceName", "OkpqNhKEro");
        setIntField(term189436, term189436.getClass(), "lastRegionId", 2025999664);
        setField(term189436, term189436.getClass(), "lastRegionName", "PufiDnTOVH");
        setIntField(term189436, term189436.getClass(), "lastAllNetId", -909558354);
        setField(term189436, term189436.getClass(), "lastClientId", "LQfKYwOczS");
        setIntField(term189436, term189436.getClass(), "lastUsedDeckId", -916599257);
        setIntField(term189436, term189436.getClass(), "lastPlayMusicLevel", 1224828737);
        setIntField(term189436, term189436.getClass(), "lastEmoneyBrand", 938290997);
        setField(term189434, term189434.getClass(), "user", term189436);
        setIntField(term189434, term189434.getClass(), "sortNumber", 1981949773);
        setIntField(term189434, term189434.getClass(), "placeId", -1921107054);
        setField(term189434, term189434.getClass(), "placeName", "pbZJqYGAhZ");
        setField(term189434, term189434.getClass(), "playDate", "YEdoqWcZFW");
        setField(term189434, term189434.getClass(), "userPlayDate", "XaSQbgxPqk");
        setIntField(term189434, term189434.getClass(), "musicId", -36418827);
        setIntField(term189434, term189434.getClass(), "level", -1121256252);
        setIntField(term189434, term189434.getClass(), "playKind", 353630136);
        setIntField(term189434, term189434.getClass(), "eventId", 108496271);
        setField(term189434, term189434.getClass(), "eventName", "XXOrMpBKkm");
        setIntField(term189434, term189434.getClass(), "eventPoint", 1074250666);
        setIntField(term189434, term189434.getClass(), "playedUserId1", 41129188);
        setIntField(term189434, term189434.getClass(), "playedUserId2", 20425746);
        setIntField(term189434, term189434.getClass(), "playedUserId3", 1442831165);
        setField(term189434, term189434.getClass(), "playedUserName1", "eyQAgPDleR");
        setField(term189434, term189434.getClass(), "playedUserName2", "MebQINvRJc");
        setField(term189434, term189434.getClass(), "playedUserName3", "eySJlHMbkA");
        setIntField(term189434, term189434.getClass(), "playedMusicLevel1", -1549367103);
        setIntField(term189434, term189434.getClass(), "playedMusicLevel2", 1063843595);
        setIntField(term189434, term189434.getClass(), "playedMusicLevel3", -326125660);
        setIntField(term189434, term189434.getClass(), "cardId1", 229716246);
        setIntField(term189434, term189434.getClass(), "cardId2", 881998687);
        setIntField(term189434, term189434.getClass(), "cardId3", 1432793095);
        setIntField(term189434, term189434.getClass(), "cardLevel1", -652330768);
        setIntField(term189434, term189434.getClass(), "cardLevel2", 1092473461);
        setIntField(term189434, term189434.getClass(), "cardLevel3", 1102181288);
        setIntField(term189434, term189434.getClass(), "cardAttack1", 1763750177);
        setIntField(term189434, term189434.getClass(), "cardAttack2", -1006572538);
        setIntField(term189434, term189434.getClass(), "cardAttack3", -1176631465);
        setIntField(term189434, term189434.getClass(), "bossCharaId", -1839207123);
        setIntField(term189434, term189434.getClass(), "bossLevel", -1103760001);
        setIntField(term189434, term189434.getClass(), "bossAttribute", 329870869);
        setIntField(term189434, term189434.getClass(), "clearStatus", 380359269);
        setIntField(term189434, term189434.getClass(), "techScore", 899745442);
        setIntField(term189434, term189434.getClass(), "techScoreRank", -1602381366);
        setIntField(term189434, term189434.getClass(), "battleScore", 874358340);
        setIntField(term189434, term189434.getClass(), "battleScoreRank", -1402074319);
        setIntField(term189434, term189434.getClass(), "platinumScore", 2082998484);
        setIntField(term189434, term189434.getClass(), "maxCombo", -904181232);
        setIntField(term189434, term189434.getClass(), "judgeMiss", 1855285186);
        setIntField(term189434, term189434.getClass(), "judgeHit", -1234937664);
        setIntField(term189434, term189434.getClass(), "judgeBreak", 1741809881);
        setIntField(term189434, term189434.getClass(), "judgeCriticalBreak", -1630393878);
        setIntField(term189434, term189434.getClass(), "rateTap", -511205093);
        setIntField(term189434, term189434.getClass(), "rateHold", 1169805384);
        setIntField(term189434, term189434.getClass(), "rateFlick", -1134069368);
        setIntField(term189434, term189434.getClass(), "rateSideTap", -2099537183);
        setIntField(term189434, term189434.getClass(), "rateSideHold", 210414797);
        setIntField(term189434, term189434.getClass(), "bellCount", -119784391);
        setIntField(term189434, term189434.getClass(), "totalBellCount", 1766080555);
        setIntField(term189434, term189434.getClass(), "damageCount", -403077875);
        setIntField(term189434, term189434.getClass(), "overDamage", -40855781);
        setBooleanField(term189434, term189434.getClass(), "isTechNewRecord", false);
        setBooleanField(term189434, term189434.getClass(), "isBattleNewRecord", false);
        setBooleanField(term189434, term189434.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term189434, term189434.getClass(), "isFullCombo", true);
        setBooleanField(term189434, term189434.getClass(), "isFullBell", true);
        setBooleanField(term189434, term189434.getClass(), "isAllBreak", true);
        setIntField(term189434, term189434.getClass(), "playerRating", -1672327295);
        setIntField(term189434, term189434.getClass(), "battlePoint", -1320591245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserId1", argTypes, term189434, args);
    }

};


