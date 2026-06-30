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

public class UserPlaylog_getCardLevel1_197953634325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197018;

    public UserPlaylog_getCardLevel1_197953634325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term197024 = new Long(3104349415269466587L);
        term197018 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term197020 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term197022 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term197038 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term197039 = newInstance(Class.forName("java.time.LocalDate"));
        Object term197043 = newInstance(Class.forName("java.time.LocalTime"));
        Object term197048 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term197049 = newInstance(Class.forName("java.time.LocalDate"));
        Object term197053 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term197018, term197018.getClass(), "id", -2073927328205299283L);
        setLongField(term197020, term197020.getClass(), "id", -2828858984131180284L);
        setLongField(term197022, term197022.getClass(), "id", -3396355268779460071L);
        setField(term197022, term197022.getClass(), "extId", term197024);
        setField(term197022, term197022.getClass(), "luid", "WQQiwAqGaC");
        setIntField(term197039, term197039.getClass(), "year", 2011);
        setShortField(term197039, term197039.getClass(), "month", (short) 4);
        setShortField(term197039, term197039.getClass(), "day", (short) 14);
        setField(term197038, term197038.getClass(), "date", term197039);
        setByteField(term197043, term197043.getClass(), "hour", (byte) 4);
        setByteField(term197043, term197043.getClass(), "minute", (byte) 35);
        setByteField(term197043, term197043.getClass(), "second", (byte) 21);
        setIntField(term197043, term197043.getClass(), "nano", 578174822);
        setField(term197038, term197038.getClass(), "time", term197043);
        setField(term197022, term197022.getClass(), "registerTime", term197038);
        setIntField(term197049, term197049.getClass(), "year", 2028);
        setShortField(term197049, term197049.getClass(), "month", (short) 2);
        setShortField(term197049, term197049.getClass(), "day", (short) 8);
        setField(term197048, term197048.getClass(), "date", term197049);
        setByteField(term197053, term197053.getClass(), "hour", (byte) 9);
        setByteField(term197053, term197053.getClass(), "minute", (byte) 51);
        setByteField(term197053, term197053.getClass(), "second", (byte) 30);
        setIntField(term197053, term197053.getClass(), "nano", 433905289);
        setField(term197048, term197048.getClass(), "time", term197053);
        setField(term197022, term197022.getClass(), "accessTime", term197048);
        setField(term197020, term197020.getClass(), "card", term197022);
        setField(term197020, term197020.getClass(), "userName", "KLymDDZdBx");
        setIntField(term197020, term197020.getClass(), "level", 154798354);
        setIntField(term197020, term197020.getClass(), "reincarnationNum", -161324707);
        setLongField(term197020, term197020.getClass(), "exp", -1596923983195220727L);
        setLongField(term197020, term197020.getClass(), "point", 4119542005949505984L);
        setLongField(term197020, term197020.getClass(), "totalPoint", 2433252635898707635L);
        setIntField(term197020, term197020.getClass(), "playCount", -458456066);
        setIntField(term197020, term197020.getClass(), "jewelCount", 519712744);
        setIntField(term197020, term197020.getClass(), "totalJewelCount", 1517894350);
        setIntField(term197020, term197020.getClass(), "medalCount", -211882537);
        setIntField(term197020, term197020.getClass(), "playerRating", -116485225);
        setIntField(term197020, term197020.getClass(), "highestRating", -1432160265);
        setIntField(term197020, term197020.getClass(), "battlePoint", -128667429);
        setIntField(term197020, term197020.getClass(), "bestBattlePoint", -1155202085);
        setIntField(term197020, term197020.getClass(), "overDamageBattlePoint", -649874365);
        setBooleanField(term197020, term197020.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term197020, term197020.getClass(), "nameplateId", 102990319);
        setIntField(term197020, term197020.getClass(), "trophyId", 1616673856);
        setIntField(term197020, term197020.getClass(), "cardId", -1785694379);
        setIntField(term197020, term197020.getClass(), "characterId", -130903572);
        setIntField(term197020, term197020.getClass(), "characterVoiceNo", -337347370);
        setIntField(term197020, term197020.getClass(), "tabSetting", -565854486);
        setIntField(term197020, term197020.getClass(), "tabSortSetting", -655702672);
        setIntField(term197020, term197020.getClass(), "cardCategorySetting", -713625841);
        setIntField(term197020, term197020.getClass(), "cardSortSetting", -774019505);
        setIntField(term197020, term197020.getClass(), "rivalScoreCategorySetting", -1148868584);
        setIntField(term197020, term197020.getClass(), "playedTutorialBit", -774216920);
        setIntField(term197020, term197020.getClass(), "firstTutorialCancelNum", -2024861246);
        setLongField(term197020, term197020.getClass(), "sumTechHighScore", 8324625588726021975L);
        setLongField(term197020, term197020.getClass(), "sumTechBasicHighScore", 628147125708063776L);
        setLongField(term197020, term197020.getClass(), "sumTechAdvancedHighScore", -1431983127218148270L);
        setLongField(term197020, term197020.getClass(), "sumTechExpertHighScore", -4488790513338654221L);
        setLongField(term197020, term197020.getClass(), "sumTechMasterHighScore", -465346656741950839L);
        setLongField(term197020, term197020.getClass(), "sumTechLunaticHighScore", 4651579706861308831L);
        setLongField(term197020, term197020.getClass(), "sumBattleHighScore", 5310141360469061657L);
        setLongField(term197020, term197020.getClass(), "sumBattleBasicHighScore", 1140037959282484196L);
        setLongField(term197020, term197020.getClass(), "sumBattleAdvancedHighScore", -8519575547874927224L);
        setLongField(term197020, term197020.getClass(), "sumBattleExpertHighScore", -135249980433565287L);
        setLongField(term197020, term197020.getClass(), "sumBattleMasterHighScore", -5321005129201389012L);
        setLongField(term197020, term197020.getClass(), "sumBattleLunaticHighScore", -6346531281189712724L);
        setField(term197020, term197020.getClass(), "eventWatchedDate", "slKJAyLDtj");
        setField(term197020, term197020.getClass(), "cmEventWatchedDate", "eIPocPyauP");
        setField(term197020, term197020.getClass(), "firstGameId", "gyWKlHUHri");
        setField(term197020, term197020.getClass(), "firstRomVersion", "SWgUCUOPSy");
        setField(term197020, term197020.getClass(), "firstDataVersion", "lLSeswvwBo");
        setField(term197020, term197020.getClass(), "firstPlayDate", "zYzKyKDGUI");
        setField(term197020, term197020.getClass(), "lastGameId", "zBZEgeegCX");
        setField(term197020, term197020.getClass(), "lastRomVersion", "cvqmTiHbGR");
        setField(term197020, term197020.getClass(), "lastDataVersion", "OrrVtTDhcj");
        setField(term197020, term197020.getClass(), "compatibleCmVersion", "ThgOsDrDtq");
        setField(term197020, term197020.getClass(), "lastPlayDate", "YmtenhNFen");
        setIntField(term197020, term197020.getClass(), "lastPlaceId", -347239085);
        setField(term197020, term197020.getClass(), "lastPlaceName", "kopyQNUhIV");
        setIntField(term197020, term197020.getClass(), "lastRegionId", -915057928);
        setField(term197020, term197020.getClass(), "lastRegionName", "jNxTZuasym");
        setIntField(term197020, term197020.getClass(), "lastAllNetId", 1172300062);
        setField(term197020, term197020.getClass(), "lastClientId", "pqQZPnGjAE");
        setIntField(term197020, term197020.getClass(), "lastUsedDeckId", -1752924937);
        setIntField(term197020, term197020.getClass(), "lastPlayMusicLevel", 284560417);
        setIntField(term197020, term197020.getClass(), "lastEmoneyBrand", 1568828306);
        setField(term197018, term197018.getClass(), "user", term197020);
        setIntField(term197018, term197018.getClass(), "sortNumber", 1113651370);
        setIntField(term197018, term197018.getClass(), "placeId", 2135980546);
        setField(term197018, term197018.getClass(), "placeName", "wLFHiajqXh");
        setField(term197018, term197018.getClass(), "playDate", "xNZcqGsPAa");
        setField(term197018, term197018.getClass(), "userPlayDate", "JTJcXWkPMd");
        setIntField(term197018, term197018.getClass(), "musicId", 312798579);
        setIntField(term197018, term197018.getClass(), "level", 1892335077);
        setIntField(term197018, term197018.getClass(), "playKind", -2119248330);
        setIntField(term197018, term197018.getClass(), "eventId", -1354680744);
        setField(term197018, term197018.getClass(), "eventName", "AAJiiNgWUi");
        setIntField(term197018, term197018.getClass(), "eventPoint", 1429270769);
        setIntField(term197018, term197018.getClass(), "playedUserId1", -910224561);
        setIntField(term197018, term197018.getClass(), "playedUserId2", 1215706313);
        setIntField(term197018, term197018.getClass(), "playedUserId3", 1428978073);
        setField(term197018, term197018.getClass(), "playedUserName1", "OpDmORpuEC");
        setField(term197018, term197018.getClass(), "playedUserName2", "ARwHgcTrUV");
        setField(term197018, term197018.getClass(), "playedUserName3", "cuVIpSGqvb");
        setIntField(term197018, term197018.getClass(), "playedMusicLevel1", 1846059754);
        setIntField(term197018, term197018.getClass(), "playedMusicLevel2", -1186201039);
        setIntField(term197018, term197018.getClass(), "playedMusicLevel3", 1037901538);
        setIntField(term197018, term197018.getClass(), "cardId1", -1215744049);
        setIntField(term197018, term197018.getClass(), "cardId2", 1349434177);
        setIntField(term197018, term197018.getClass(), "cardId3", -1144155182);
        setIntField(term197018, term197018.getClass(), "cardLevel1", -2139395961);
        setIntField(term197018, term197018.getClass(), "cardLevel2", 1129939960);
        setIntField(term197018, term197018.getClass(), "cardLevel3", 1940453285);
        setIntField(term197018, term197018.getClass(), "cardAttack1", 318563460);
        setIntField(term197018, term197018.getClass(), "cardAttack2", -2020067684);
        setIntField(term197018, term197018.getClass(), "cardAttack3", 1415751361);
        setIntField(term197018, term197018.getClass(), "bossCharaId", 1812325636);
        setIntField(term197018, term197018.getClass(), "bossLevel", 1867850244);
        setIntField(term197018, term197018.getClass(), "bossAttribute", 1005070200);
        setIntField(term197018, term197018.getClass(), "clearStatus", 1460231572);
        setIntField(term197018, term197018.getClass(), "techScore", -974042047);
        setIntField(term197018, term197018.getClass(), "techScoreRank", -547386330);
        setIntField(term197018, term197018.getClass(), "battleScore", -223547211);
        setIntField(term197018, term197018.getClass(), "battleScoreRank", 1946453460);
        setIntField(term197018, term197018.getClass(), "platinumScore", -2120862173);
        setIntField(term197018, term197018.getClass(), "maxCombo", 1076648881);
        setIntField(term197018, term197018.getClass(), "judgeMiss", -2100263353);
        setIntField(term197018, term197018.getClass(), "judgeHit", 1350088807);
        setIntField(term197018, term197018.getClass(), "judgeBreak", -2113357167);
        setIntField(term197018, term197018.getClass(), "judgeCriticalBreak", 1043903367);
        setIntField(term197018, term197018.getClass(), "rateTap", -1029497137);
        setIntField(term197018, term197018.getClass(), "rateHold", 624138612);
        setIntField(term197018, term197018.getClass(), "rateFlick", 1004605180);
        setIntField(term197018, term197018.getClass(), "rateSideTap", -413138935);
        setIntField(term197018, term197018.getClass(), "rateSideHold", 797223217);
        setIntField(term197018, term197018.getClass(), "bellCount", 501604461);
        setIntField(term197018, term197018.getClass(), "totalBellCount", 1070893083);
        setIntField(term197018, term197018.getClass(), "damageCount", -814126919);
        setIntField(term197018, term197018.getClass(), "overDamage", -197687453);
        setBooleanField(term197018, term197018.getClass(), "isTechNewRecord", true);
        setBooleanField(term197018, term197018.getClass(), "isBattleNewRecord", true);
        setBooleanField(term197018, term197018.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term197018, term197018.getClass(), "isFullCombo", true);
        setBooleanField(term197018, term197018.getClass(), "isFullBell", true);
        setBooleanField(term197018, term197018.getClass(), "isAllBreak", true);
        setIntField(term197018, term197018.getClass(), "playerRating", 1906793551);
        setIntField(term197018, term197018.getClass(), "battlePoint", 762348254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardLevel1", argTypes, term197018, args);
    }

};


