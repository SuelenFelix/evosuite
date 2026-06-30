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

public class UserPlaylog_getPlayedUserId3_103366547815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190698;

    public UserPlaylog_getPlayedUserId3_103366547815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term190704 = new Long(2809748481176687920L);
        term190698 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term190700 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term190702 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term190718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term190719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term190723 = newInstance(Class.forName("java.time.LocalTime"));
        Object term190728 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term190729 = newInstance(Class.forName("java.time.LocalDate"));
        Object term190733 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term190698, term190698.getClass(), "id", 442340053526281280L);
        setLongField(term190700, term190700.getClass(), "id", -7669498958586932756L);
        setLongField(term190702, term190702.getClass(), "id", -1448895922107466006L);
        setField(term190702, term190702.getClass(), "extId", term190704);
        setField(term190702, term190702.getClass(), "luid", "ZnpJnglqki");
        setIntField(term190719, term190719.getClass(), "year", 2020);
        setShortField(term190719, term190719.getClass(), "month", (short) 9);
        setShortField(term190719, term190719.getClass(), "day", (short) 4);
        setField(term190718, term190718.getClass(), "date", term190719);
        setByteField(term190723, term190723.getClass(), "hour", (byte) 12);
        setByteField(term190723, term190723.getClass(), "minute", (byte) 38);
        setByteField(term190723, term190723.getClass(), "second", (byte) 4);
        setIntField(term190723, term190723.getClass(), "nano", 271635259);
        setField(term190718, term190718.getClass(), "time", term190723);
        setField(term190702, term190702.getClass(), "registerTime", term190718);
        setIntField(term190729, term190729.getClass(), "year", 2018);
        setShortField(term190729, term190729.getClass(), "month", (short) 7);
        setShortField(term190729, term190729.getClass(), "day", (short) 4);
        setField(term190728, term190728.getClass(), "date", term190729);
        setByteField(term190733, term190733.getClass(), "hour", (byte) 3);
        setByteField(term190733, term190733.getClass(), "minute", (byte) 57);
        setByteField(term190733, term190733.getClass(), "second", (byte) 49);
        setIntField(term190733, term190733.getClass(), "nano", 243468525);
        setField(term190728, term190728.getClass(), "time", term190733);
        setField(term190702, term190702.getClass(), "accessTime", term190728);
        setField(term190700, term190700.getClass(), "card", term190702);
        setField(term190700, term190700.getClass(), "userName", "fKqDEStgcU");
        setIntField(term190700, term190700.getClass(), "level", -646361694);
        setIntField(term190700, term190700.getClass(), "reincarnationNum", 923305541);
        setLongField(term190700, term190700.getClass(), "exp", -2816221532853440753L);
        setLongField(term190700, term190700.getClass(), "point", -3324388461589977064L);
        setLongField(term190700, term190700.getClass(), "totalPoint", -3325236353434709566L);
        setIntField(term190700, term190700.getClass(), "playCount", -1904959000);
        setIntField(term190700, term190700.getClass(), "jewelCount", -1824028754);
        setIntField(term190700, term190700.getClass(), "totalJewelCount", 666780640);
        setIntField(term190700, term190700.getClass(), "medalCount", -2127910563);
        setIntField(term190700, term190700.getClass(), "playerRating", -1206610681);
        setIntField(term190700, term190700.getClass(), "highestRating", 304656853);
        setIntField(term190700, term190700.getClass(), "battlePoint", 800977713);
        setIntField(term190700, term190700.getClass(), "bestBattlePoint", -1747527329);
        setIntField(term190700, term190700.getClass(), "overDamageBattlePoint", 563611317);
        setBooleanField(term190700, term190700.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term190700, term190700.getClass(), "nameplateId", -1421851521);
        setIntField(term190700, term190700.getClass(), "trophyId", -1305953629);
        setIntField(term190700, term190700.getClass(), "cardId", 748406486);
        setIntField(term190700, term190700.getClass(), "characterId", 1180825945);
        setIntField(term190700, term190700.getClass(), "characterVoiceNo", -1654547274);
        setIntField(term190700, term190700.getClass(), "tabSetting", 1237586484);
        setIntField(term190700, term190700.getClass(), "tabSortSetting", 322987764);
        setIntField(term190700, term190700.getClass(), "cardCategorySetting", -1756487373);
        setIntField(term190700, term190700.getClass(), "cardSortSetting", 1377481670);
        setIntField(term190700, term190700.getClass(), "rivalScoreCategorySetting", -2040463428);
        setIntField(term190700, term190700.getClass(), "playedTutorialBit", -1545039709);
        setIntField(term190700, term190700.getClass(), "firstTutorialCancelNum", 1339538920);
        setLongField(term190700, term190700.getClass(), "sumTechHighScore", -1491380514883022088L);
        setLongField(term190700, term190700.getClass(), "sumTechBasicHighScore", 5034990425635847415L);
        setLongField(term190700, term190700.getClass(), "sumTechAdvancedHighScore", 1222177686319950738L);
        setLongField(term190700, term190700.getClass(), "sumTechExpertHighScore", 4783096215431576066L);
        setLongField(term190700, term190700.getClass(), "sumTechMasterHighScore", 1343459668932607461L);
        setLongField(term190700, term190700.getClass(), "sumTechLunaticHighScore", -9102102270807296424L);
        setLongField(term190700, term190700.getClass(), "sumBattleHighScore", 6138671209073546063L);
        setLongField(term190700, term190700.getClass(), "sumBattleBasicHighScore", 5221418857304717721L);
        setLongField(term190700, term190700.getClass(), "sumBattleAdvancedHighScore", 7928766268705604145L);
        setLongField(term190700, term190700.getClass(), "sumBattleExpertHighScore", 4457753160962357199L);
        setLongField(term190700, term190700.getClass(), "sumBattleMasterHighScore", 5795775657175520210L);
        setLongField(term190700, term190700.getClass(), "sumBattleLunaticHighScore", -9188635684559551496L);
        setField(term190700, term190700.getClass(), "eventWatchedDate", "ciTsscpufN");
        setField(term190700, term190700.getClass(), "cmEventWatchedDate", "kGYGMmKJEx");
        setField(term190700, term190700.getClass(), "firstGameId", "YFKtymjreZ");
        setField(term190700, term190700.getClass(), "firstRomVersion", "vnWFBfVdIg");
        setField(term190700, term190700.getClass(), "firstDataVersion", "AiFTACwPhj");
        setField(term190700, term190700.getClass(), "firstPlayDate", "OArCBGiKUA");
        setField(term190700, term190700.getClass(), "lastGameId", "TtyfHrKviO");
        setField(term190700, term190700.getClass(), "lastRomVersion", "EUVfrPCqms");
        setField(term190700, term190700.getClass(), "lastDataVersion", "RCugJMrPXR");
        setField(term190700, term190700.getClass(), "compatibleCmVersion", "TDXHshmgFm");
        setField(term190700, term190700.getClass(), "lastPlayDate", "JDtnEpsyRr");
        setIntField(term190700, term190700.getClass(), "lastPlaceId", 73094268);
        setField(term190700, term190700.getClass(), "lastPlaceName", "GQgehHZwkd");
        setIntField(term190700, term190700.getClass(), "lastRegionId", 1070233097);
        setField(term190700, term190700.getClass(), "lastRegionName", "SGjcnoPxHY");
        setIntField(term190700, term190700.getClass(), "lastAllNetId", 557700825);
        setField(term190700, term190700.getClass(), "lastClientId", "qwnbmJbmgl");
        setIntField(term190700, term190700.getClass(), "lastUsedDeckId", -954857411);
        setIntField(term190700, term190700.getClass(), "lastPlayMusicLevel", 792588176);
        setIntField(term190700, term190700.getClass(), "lastEmoneyBrand", -1558707637);
        setField(term190698, term190698.getClass(), "user", term190700);
        setIntField(term190698, term190698.getClass(), "sortNumber", 1016804400);
        setIntField(term190698, term190698.getClass(), "placeId", 1995126818);
        setField(term190698, term190698.getClass(), "placeName", "TxkYIXyPTN");
        setField(term190698, term190698.getClass(), "playDate", "rQdFYJTLhu");
        setField(term190698, term190698.getClass(), "userPlayDate", "WrebDmBdlU");
        setIntField(term190698, term190698.getClass(), "musicId", -534461601);
        setIntField(term190698, term190698.getClass(), "level", 213085106);
        setIntField(term190698, term190698.getClass(), "playKind", 1527733173);
        setIntField(term190698, term190698.getClass(), "eventId", -837851405);
        setField(term190698, term190698.getClass(), "eventName", "PixrEkjduz");
        setIntField(term190698, term190698.getClass(), "eventPoint", 2069187292);
        setIntField(term190698, term190698.getClass(), "playedUserId1", 1160128853);
        setIntField(term190698, term190698.getClass(), "playedUserId2", 1995621119);
        setIntField(term190698, term190698.getClass(), "playedUserId3", -1401892359);
        setField(term190698, term190698.getClass(), "playedUserName1", "lIOzyKLgmt");
        setField(term190698, term190698.getClass(), "playedUserName2", "TGXNQpXBIh");
        setField(term190698, term190698.getClass(), "playedUserName3", "VdKTKyKcnc");
        setIntField(term190698, term190698.getClass(), "playedMusicLevel1", -161011768);
        setIntField(term190698, term190698.getClass(), "playedMusicLevel2", 145609301);
        setIntField(term190698, term190698.getClass(), "playedMusicLevel3", -804537981);
        setIntField(term190698, term190698.getClass(), "cardId1", 687292726);
        setIntField(term190698, term190698.getClass(), "cardId2", 1333460001);
        setIntField(term190698, term190698.getClass(), "cardId3", 535096386);
        setIntField(term190698, term190698.getClass(), "cardLevel1", 286007591);
        setIntField(term190698, term190698.getClass(), "cardLevel2", -61827487);
        setIntField(term190698, term190698.getClass(), "cardLevel3", 511764183);
        setIntField(term190698, term190698.getClass(), "cardAttack1", -1665156164);
        setIntField(term190698, term190698.getClass(), "cardAttack2", -103179244);
        setIntField(term190698, term190698.getClass(), "cardAttack3", -230111185);
        setIntField(term190698, term190698.getClass(), "bossCharaId", 2115868613);
        setIntField(term190698, term190698.getClass(), "bossLevel", -789382307);
        setIntField(term190698, term190698.getClass(), "bossAttribute", -473283632);
        setIntField(term190698, term190698.getClass(), "clearStatus", -493892140);
        setIntField(term190698, term190698.getClass(), "techScore", 1597517534);
        setIntField(term190698, term190698.getClass(), "techScoreRank", 869571798);
        setIntField(term190698, term190698.getClass(), "battleScore", -720552565);
        setIntField(term190698, term190698.getClass(), "battleScoreRank", 2129936072);
        setIntField(term190698, term190698.getClass(), "platinumScore", 1143626407);
        setIntField(term190698, term190698.getClass(), "maxCombo", -64685993);
        setIntField(term190698, term190698.getClass(), "judgeMiss", 605536184);
        setIntField(term190698, term190698.getClass(), "judgeHit", 1480698574);
        setIntField(term190698, term190698.getClass(), "judgeBreak", -1305515548);
        setIntField(term190698, term190698.getClass(), "judgeCriticalBreak", -1607397836);
        setIntField(term190698, term190698.getClass(), "rateTap", -2006688545);
        setIntField(term190698, term190698.getClass(), "rateHold", -1336021455);
        setIntField(term190698, term190698.getClass(), "rateFlick", -1471789930);
        setIntField(term190698, term190698.getClass(), "rateSideTap", -1834697019);
        setIntField(term190698, term190698.getClass(), "rateSideHold", -1671714895);
        setIntField(term190698, term190698.getClass(), "bellCount", 1748043344);
        setIntField(term190698, term190698.getClass(), "totalBellCount", -1786413020);
        setIntField(term190698, term190698.getClass(), "damageCount", 1718492301);
        setIntField(term190698, term190698.getClass(), "overDamage", 1377469532);
        setBooleanField(term190698, term190698.getClass(), "isTechNewRecord", false);
        setBooleanField(term190698, term190698.getClass(), "isBattleNewRecord", true);
        setBooleanField(term190698, term190698.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term190698, term190698.getClass(), "isFullCombo", true);
        setBooleanField(term190698, term190698.getClass(), "isFullBell", false);
        setBooleanField(term190698, term190698.getClass(), "isAllBreak", true);
        setIntField(term190698, term190698.getClass(), "playerRating", -1231607203);
        setIntField(term190698, term190698.getClass(), "battlePoint", -1927281961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserId3", argTypes, term190698, args);
    }

};


