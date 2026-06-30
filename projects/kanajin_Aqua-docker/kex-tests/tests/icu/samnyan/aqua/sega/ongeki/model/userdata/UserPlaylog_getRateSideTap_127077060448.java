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

public class UserPlaylog_getRateSideTap_127077060448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211554;

    public UserPlaylog_getRateSideTap_127077060448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term211560 = new Long(185544001230120339L);
        term211554 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term211556 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term211558 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term211574 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term211575 = newInstance(Class.forName("java.time.LocalDate"));
        Object term211579 = newInstance(Class.forName("java.time.LocalTime"));
        Object term211584 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term211585 = newInstance(Class.forName("java.time.LocalDate"));
        Object term211589 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term211554, term211554.getClass(), "id", 5799864894847820625L);
        setLongField(term211556, term211556.getClass(), "id", -4049351845977809755L);
        setLongField(term211558, term211558.getClass(), "id", 5556350288489551656L);
        setField(term211558, term211558.getClass(), "extId", term211560);
        setField(term211558, term211558.getClass(), "luid", "nxQyJsNYLI");
        setIntField(term211575, term211575.getClass(), "year", 2025);
        setShortField(term211575, term211575.getClass(), "month", (short) 2);
        setShortField(term211575, term211575.getClass(), "day", (short) 6);
        setField(term211574, term211574.getClass(), "date", term211575);
        setByteField(term211579, term211579.getClass(), "hour", (byte) 14);
        setByteField(term211579, term211579.getClass(), "minute", (byte) 28);
        setByteField(term211579, term211579.getClass(), "second", (byte) 25);
        setIntField(term211579, term211579.getClass(), "nano", 103816032);
        setField(term211574, term211574.getClass(), "time", term211579);
        setField(term211558, term211558.getClass(), "registerTime", term211574);
        setIntField(term211585, term211585.getClass(), "year", 2024);
        setShortField(term211585, term211585.getClass(), "month", (short) 7);
        setShortField(term211585, term211585.getClass(), "day", (short) 11);
        setField(term211584, term211584.getClass(), "date", term211585);
        setByteField(term211589, term211589.getClass(), "hour", (byte) 0);
        setByteField(term211589, term211589.getClass(), "minute", (byte) 35);
        setByteField(term211589, term211589.getClass(), "second", (byte) 43);
        setIntField(term211589, term211589.getClass(), "nano", 994892189);
        setField(term211584, term211584.getClass(), "time", term211589);
        setField(term211558, term211558.getClass(), "accessTime", term211584);
        setField(term211556, term211556.getClass(), "card", term211558);
        setField(term211556, term211556.getClass(), "userName", "KakFFgXFTt");
        setIntField(term211556, term211556.getClass(), "level", 498177640);
        setIntField(term211556, term211556.getClass(), "reincarnationNum", 987790925);
        setLongField(term211556, term211556.getClass(), "exp", -4284673412269868116L);
        setLongField(term211556, term211556.getClass(), "point", -4431594244474371652L);
        setLongField(term211556, term211556.getClass(), "totalPoint", 7061998293449035472L);
        setIntField(term211556, term211556.getClass(), "playCount", 1502837369);
        setIntField(term211556, term211556.getClass(), "jewelCount", 980943695);
        setIntField(term211556, term211556.getClass(), "totalJewelCount", 1100165285);
        setIntField(term211556, term211556.getClass(), "medalCount", -686406135);
        setIntField(term211556, term211556.getClass(), "playerRating", -287429580);
        setIntField(term211556, term211556.getClass(), "highestRating", -1517877256);
        setIntField(term211556, term211556.getClass(), "battlePoint", 1926230705);
        setIntField(term211556, term211556.getClass(), "bestBattlePoint", 230249356);
        setIntField(term211556, term211556.getClass(), "overDamageBattlePoint", 81634969);
        setBooleanField(term211556, term211556.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term211556, term211556.getClass(), "nameplateId", -564270021);
        setIntField(term211556, term211556.getClass(), "trophyId", -711410886);
        setIntField(term211556, term211556.getClass(), "cardId", 1905282682);
        setIntField(term211556, term211556.getClass(), "characterId", 1714255787);
        setIntField(term211556, term211556.getClass(), "characterVoiceNo", 257119068);
        setIntField(term211556, term211556.getClass(), "tabSetting", 1243637000);
        setIntField(term211556, term211556.getClass(), "tabSortSetting", 1377854679);
        setIntField(term211556, term211556.getClass(), "cardCategorySetting", -563428268);
        setIntField(term211556, term211556.getClass(), "cardSortSetting", 60476165);
        setIntField(term211556, term211556.getClass(), "rivalScoreCategorySetting", 238928554);
        setIntField(term211556, term211556.getClass(), "playedTutorialBit", 1223346141);
        setIntField(term211556, term211556.getClass(), "firstTutorialCancelNum", -2030508372);
        setLongField(term211556, term211556.getClass(), "sumTechHighScore", -710516859478126305L);
        setLongField(term211556, term211556.getClass(), "sumTechBasicHighScore", 3439220637284129151L);
        setLongField(term211556, term211556.getClass(), "sumTechAdvancedHighScore", -7062832304045233672L);
        setLongField(term211556, term211556.getClass(), "sumTechExpertHighScore", -2970231946983830807L);
        setLongField(term211556, term211556.getClass(), "sumTechMasterHighScore", 2308033960283885298L);
        setLongField(term211556, term211556.getClass(), "sumTechLunaticHighScore", -1485620458269241848L);
        setLongField(term211556, term211556.getClass(), "sumBattleHighScore", -3746020777641223593L);
        setLongField(term211556, term211556.getClass(), "sumBattleBasicHighScore", -6290696433519340064L);
        setLongField(term211556, term211556.getClass(), "sumBattleAdvancedHighScore", -3549201925417898505L);
        setLongField(term211556, term211556.getClass(), "sumBattleExpertHighScore", 2212942126645094920L);
        setLongField(term211556, term211556.getClass(), "sumBattleMasterHighScore", 8571899324184902990L);
        setLongField(term211556, term211556.getClass(), "sumBattleLunaticHighScore", 108856595308836712L);
        setField(term211556, term211556.getClass(), "eventWatchedDate", "kxiSxKVnlu");
        setField(term211556, term211556.getClass(), "cmEventWatchedDate", "hyyalUiFyc");
        setField(term211556, term211556.getClass(), "firstGameId", "QoVvZmTKns");
        setField(term211556, term211556.getClass(), "firstRomVersion", "gvmWnnucqV");
        setField(term211556, term211556.getClass(), "firstDataVersion", "dntcVoGXVz");
        setField(term211556, term211556.getClass(), "firstPlayDate", "wKCqUyakHO");
        setField(term211556, term211556.getClass(), "lastGameId", "eWNhkJwQyq");
        setField(term211556, term211556.getClass(), "lastRomVersion", "MbGkSEBSBU");
        setField(term211556, term211556.getClass(), "lastDataVersion", "EpMzqYTtmB");
        setField(term211556, term211556.getClass(), "compatibleCmVersion", "gaodnCYLnY");
        setField(term211556, term211556.getClass(), "lastPlayDate", "uyIeisqgps");
        setIntField(term211556, term211556.getClass(), "lastPlaceId", 1541228086);
        setField(term211556, term211556.getClass(), "lastPlaceName", "yfdkQxPcSN");
        setIntField(term211556, term211556.getClass(), "lastRegionId", 297742417);
        setField(term211556, term211556.getClass(), "lastRegionName", "mzRIvDFPYs");
        setIntField(term211556, term211556.getClass(), "lastAllNetId", 1816437264);
        setField(term211556, term211556.getClass(), "lastClientId", "edezuOwgXC");
        setIntField(term211556, term211556.getClass(), "lastUsedDeckId", -1501877126);
        setIntField(term211556, term211556.getClass(), "lastPlayMusicLevel", 803853178);
        setIntField(term211556, term211556.getClass(), "lastEmoneyBrand", -1572151301);
        setField(term211554, term211554.getClass(), "user", term211556);
        setIntField(term211554, term211554.getClass(), "sortNumber", 1802492559);
        setIntField(term211554, term211554.getClass(), "placeId", -800228870);
        setField(term211554, term211554.getClass(), "placeName", "djqrCkWlSO");
        setField(term211554, term211554.getClass(), "playDate", "IMmqTqRbMQ");
        setField(term211554, term211554.getClass(), "userPlayDate", "RwUWxedusR");
        setIntField(term211554, term211554.getClass(), "musicId", -604044709);
        setIntField(term211554, term211554.getClass(), "level", -474659885);
        setIntField(term211554, term211554.getClass(), "playKind", 992754091);
        setIntField(term211554, term211554.getClass(), "eventId", -711076640);
        setField(term211554, term211554.getClass(), "eventName", "vkaqRBBRBQ");
        setIntField(term211554, term211554.getClass(), "eventPoint", 994094102);
        setIntField(term211554, term211554.getClass(), "playedUserId1", -1536607529);
        setIntField(term211554, term211554.getClass(), "playedUserId2", 2103296701);
        setIntField(term211554, term211554.getClass(), "playedUserId3", 56957852);
        setField(term211554, term211554.getClass(), "playedUserName1", "igRyvonSOa");
        setField(term211554, term211554.getClass(), "playedUserName2", "UcbrVDXNGS");
        setField(term211554, term211554.getClass(), "playedUserName3", "hAEsjlbkLq");
        setIntField(term211554, term211554.getClass(), "playedMusicLevel1", 1777669010);
        setIntField(term211554, term211554.getClass(), "playedMusicLevel2", 152298427);
        setIntField(term211554, term211554.getClass(), "playedMusicLevel3", 450778931);
        setIntField(term211554, term211554.getClass(), "cardId1", -1482855200);
        setIntField(term211554, term211554.getClass(), "cardId2", 1147113614);
        setIntField(term211554, term211554.getClass(), "cardId3", -243254772);
        setIntField(term211554, term211554.getClass(), "cardLevel1", -1721895188);
        setIntField(term211554, term211554.getClass(), "cardLevel2", 1090061150);
        setIntField(term211554, term211554.getClass(), "cardLevel3", -1849804262);
        setIntField(term211554, term211554.getClass(), "cardAttack1", -391323239);
        setIntField(term211554, term211554.getClass(), "cardAttack2", 563491270);
        setIntField(term211554, term211554.getClass(), "cardAttack3", 1732544982);
        setIntField(term211554, term211554.getClass(), "bossCharaId", 961758280);
        setIntField(term211554, term211554.getClass(), "bossLevel", -1645689842);
        setIntField(term211554, term211554.getClass(), "bossAttribute", 1363844724);
        setIntField(term211554, term211554.getClass(), "clearStatus", 63712079);
        setIntField(term211554, term211554.getClass(), "techScore", 146408738);
        setIntField(term211554, term211554.getClass(), "techScoreRank", -496409376);
        setIntField(term211554, term211554.getClass(), "battleScore", 1373203092);
        setIntField(term211554, term211554.getClass(), "battleScoreRank", -120921180);
        setIntField(term211554, term211554.getClass(), "platinumScore", -1303194402);
        setIntField(term211554, term211554.getClass(), "maxCombo", -1332211856);
        setIntField(term211554, term211554.getClass(), "judgeMiss", 213669888);
        setIntField(term211554, term211554.getClass(), "judgeHit", -1050684350);
        setIntField(term211554, term211554.getClass(), "judgeBreak", 1871723856);
        setIntField(term211554, term211554.getClass(), "judgeCriticalBreak", -159300758);
        setIntField(term211554, term211554.getClass(), "rateTap", 478919523);
        setIntField(term211554, term211554.getClass(), "rateHold", -922902226);
        setIntField(term211554, term211554.getClass(), "rateFlick", -2136789857);
        setIntField(term211554, term211554.getClass(), "rateSideTap", 2107900783);
        setIntField(term211554, term211554.getClass(), "rateSideHold", 2014990351);
        setIntField(term211554, term211554.getClass(), "bellCount", 1711544909);
        setIntField(term211554, term211554.getClass(), "totalBellCount", -257220805);
        setIntField(term211554, term211554.getClass(), "damageCount", -32183821);
        setIntField(term211554, term211554.getClass(), "overDamage", 391771406);
        setBooleanField(term211554, term211554.getClass(), "isTechNewRecord", true);
        setBooleanField(term211554, term211554.getClass(), "isBattleNewRecord", false);
        setBooleanField(term211554, term211554.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term211554, term211554.getClass(), "isFullCombo", true);
        setBooleanField(term211554, term211554.getClass(), "isFullBell", true);
        setBooleanField(term211554, term211554.getClass(), "isAllBreak", false);
        setIntField(term211554, term211554.getClass(), "playerRating", 930395359);
        setIntField(term211554, term211554.getClass(), "battlePoint", 510293262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateSideTap", argTypes, term211554, args);
    }

};


