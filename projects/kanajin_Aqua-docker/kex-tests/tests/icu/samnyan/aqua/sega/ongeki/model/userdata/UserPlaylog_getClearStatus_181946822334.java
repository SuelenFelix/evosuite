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

public class UserPlaylog_getClearStatus_181946822334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202706;

    public UserPlaylog_getClearStatus_181946822334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term202712 = new Long(5845993504299821981L);
        term202706 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term202708 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term202710 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term202726 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term202727 = newInstance(Class.forName("java.time.LocalDate"));
        Object term202731 = newInstance(Class.forName("java.time.LocalTime"));
        Object term202736 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term202737 = newInstance(Class.forName("java.time.LocalDate"));
        Object term202741 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term202706, term202706.getClass(), "id", -5313330886385614279L);
        setLongField(term202708, term202708.getClass(), "id", 4377184190248737508L);
        setLongField(term202710, term202710.getClass(), "id", -4743830380585824129L);
        setField(term202710, term202710.getClass(), "extId", term202712);
        setField(term202710, term202710.getClass(), "luid", "HAoImTYIbE");
        setIntField(term202727, term202727.getClass(), "year", 2023);
        setShortField(term202727, term202727.getClass(), "month", (short) 4);
        setShortField(term202727, term202727.getClass(), "day", (short) 2);
        setField(term202726, term202726.getClass(), "date", term202727);
        setByteField(term202731, term202731.getClass(), "hour", (byte) 1);
        setByteField(term202731, term202731.getClass(), "minute", (byte) 39);
        setByteField(term202731, term202731.getClass(), "second", (byte) 47);
        setIntField(term202731, term202731.getClass(), "nano", 89556491);
        setField(term202726, term202726.getClass(), "time", term202731);
        setField(term202710, term202710.getClass(), "registerTime", term202726);
        setIntField(term202737, term202737.getClass(), "year", 2015);
        setShortField(term202737, term202737.getClass(), "month", (short) 1);
        setShortField(term202737, term202737.getClass(), "day", (short) 20);
        setField(term202736, term202736.getClass(), "date", term202737);
        setByteField(term202741, term202741.getClass(), "hour", (byte) 6);
        setByteField(term202741, term202741.getClass(), "minute", (byte) 8);
        setByteField(term202741, term202741.getClass(), "second", (byte) 2);
        setIntField(term202741, term202741.getClass(), "nano", 595295831);
        setField(term202736, term202736.getClass(), "time", term202741);
        setField(term202710, term202710.getClass(), "accessTime", term202736);
        setField(term202708, term202708.getClass(), "card", term202710);
        setField(term202708, term202708.getClass(), "userName", "qXdrzsJrNt");
        setIntField(term202708, term202708.getClass(), "level", 1121878754);
        setIntField(term202708, term202708.getClass(), "reincarnationNum", -821475895);
        setLongField(term202708, term202708.getClass(), "exp", 9068898375463638986L);
        setLongField(term202708, term202708.getClass(), "point", -1325957388046326118L);
        setLongField(term202708, term202708.getClass(), "totalPoint", -4103900596755497991L);
        setIntField(term202708, term202708.getClass(), "playCount", -203874219);
        setIntField(term202708, term202708.getClass(), "jewelCount", 1988198474);
        setIntField(term202708, term202708.getClass(), "totalJewelCount", -1202186337);
        setIntField(term202708, term202708.getClass(), "medalCount", -1823054395);
        setIntField(term202708, term202708.getClass(), "playerRating", 243245174);
        setIntField(term202708, term202708.getClass(), "highestRating", -1191836025);
        setIntField(term202708, term202708.getClass(), "battlePoint", -67629762);
        setIntField(term202708, term202708.getClass(), "bestBattlePoint", -619203736);
        setIntField(term202708, term202708.getClass(), "overDamageBattlePoint", -97449673);
        setBooleanField(term202708, term202708.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term202708, term202708.getClass(), "nameplateId", -1237106250);
        setIntField(term202708, term202708.getClass(), "trophyId", -958414279);
        setIntField(term202708, term202708.getClass(), "cardId", 1019142612);
        setIntField(term202708, term202708.getClass(), "characterId", 1748720356);
        setIntField(term202708, term202708.getClass(), "characterVoiceNo", -1104509081);
        setIntField(term202708, term202708.getClass(), "tabSetting", 444190847);
        setIntField(term202708, term202708.getClass(), "tabSortSetting", 2111517446);
        setIntField(term202708, term202708.getClass(), "cardCategorySetting", -39807030);
        setIntField(term202708, term202708.getClass(), "cardSortSetting", -308723512);
        setIntField(term202708, term202708.getClass(), "rivalScoreCategorySetting", -500062566);
        setIntField(term202708, term202708.getClass(), "playedTutorialBit", -955513817);
        setIntField(term202708, term202708.getClass(), "firstTutorialCancelNum", -1864369159);
        setLongField(term202708, term202708.getClass(), "sumTechHighScore", -6476245452312735980L);
        setLongField(term202708, term202708.getClass(), "sumTechBasicHighScore", 4872695929657126219L);
        setLongField(term202708, term202708.getClass(), "sumTechAdvancedHighScore", 6798904122821331479L);
        setLongField(term202708, term202708.getClass(), "sumTechExpertHighScore", -1359566511307790428L);
        setLongField(term202708, term202708.getClass(), "sumTechMasterHighScore", -2145376871585702573L);
        setLongField(term202708, term202708.getClass(), "sumTechLunaticHighScore", -6831828368646215302L);
        setLongField(term202708, term202708.getClass(), "sumBattleHighScore", 603470447927590435L);
        setLongField(term202708, term202708.getClass(), "sumBattleBasicHighScore", 5563689140460528791L);
        setLongField(term202708, term202708.getClass(), "sumBattleAdvancedHighScore", -6807100124632008206L);
        setLongField(term202708, term202708.getClass(), "sumBattleExpertHighScore", 1852487610612905757L);
        setLongField(term202708, term202708.getClass(), "sumBattleMasterHighScore", 1975113384225423579L);
        setLongField(term202708, term202708.getClass(), "sumBattleLunaticHighScore", 179641543976710347L);
        setField(term202708, term202708.getClass(), "eventWatchedDate", "GfNuZYjqJr");
        setField(term202708, term202708.getClass(), "cmEventWatchedDate", "PnRdYQjTym");
        setField(term202708, term202708.getClass(), "firstGameId", "tLANbCdEgG");
        setField(term202708, term202708.getClass(), "firstRomVersion", "CMQEFWPbMc");
        setField(term202708, term202708.getClass(), "firstDataVersion", "JTofLzeGzC");
        setField(term202708, term202708.getClass(), "firstPlayDate", "BvkOSPnZkI");
        setField(term202708, term202708.getClass(), "lastGameId", "alCPzWIVkG");
        setField(term202708, term202708.getClass(), "lastRomVersion", "DrvoGNtgiv");
        setField(term202708, term202708.getClass(), "lastDataVersion", "WbdownfsPi");
        setField(term202708, term202708.getClass(), "compatibleCmVersion", "lWVEPzuExV");
        setField(term202708, term202708.getClass(), "lastPlayDate", "cajUyLjOLa");
        setIntField(term202708, term202708.getClass(), "lastPlaceId", -1507868397);
        setField(term202708, term202708.getClass(), "lastPlaceName", "gQmndIJPOK");
        setIntField(term202708, term202708.getClass(), "lastRegionId", -525791468);
        setField(term202708, term202708.getClass(), "lastRegionName", "nbznuCsBRK");
        setIntField(term202708, term202708.getClass(), "lastAllNetId", 1134512930);
        setField(term202708, term202708.getClass(), "lastClientId", "pirTsTzzIi");
        setIntField(term202708, term202708.getClass(), "lastUsedDeckId", -1582011061);
        setIntField(term202708, term202708.getClass(), "lastPlayMusicLevel", 1582993223);
        setIntField(term202708, term202708.getClass(), "lastEmoneyBrand", 246696471);
        setField(term202706, term202706.getClass(), "user", term202708);
        setIntField(term202706, term202706.getClass(), "sortNumber", -316548746);
        setIntField(term202706, term202706.getClass(), "placeId", 352020388);
        setField(term202706, term202706.getClass(), "placeName", "NqQTZhuwCm");
        setField(term202706, term202706.getClass(), "playDate", "VMFTHaFgBn");
        setField(term202706, term202706.getClass(), "userPlayDate", "VIMBdFewRg");
        setIntField(term202706, term202706.getClass(), "musicId", -499509478);
        setIntField(term202706, term202706.getClass(), "level", 466328915);
        setIntField(term202706, term202706.getClass(), "playKind", -1590658996);
        setIntField(term202706, term202706.getClass(), "eventId", -1738020486);
        setField(term202706, term202706.getClass(), "eventName", "EIeXfBvljb");
        setIntField(term202706, term202706.getClass(), "eventPoint", 140506413);
        setIntField(term202706, term202706.getClass(), "playedUserId1", -785678813);
        setIntField(term202706, term202706.getClass(), "playedUserId2", 1295397324);
        setIntField(term202706, term202706.getClass(), "playedUserId3", -1445387113);
        setField(term202706, term202706.getClass(), "playedUserName1", "FsYaveBhOG");
        setField(term202706, term202706.getClass(), "playedUserName2", "yrxLVWpMhI");
        setField(term202706, term202706.getClass(), "playedUserName3", "IaEEQvEjDH");
        setIntField(term202706, term202706.getClass(), "playedMusicLevel1", -1584901503);
        setIntField(term202706, term202706.getClass(), "playedMusicLevel2", -1865762318);
        setIntField(term202706, term202706.getClass(), "playedMusicLevel3", 431315883);
        setIntField(term202706, term202706.getClass(), "cardId1", -1117456611);
        setIntField(term202706, term202706.getClass(), "cardId2", 459866921);
        setIntField(term202706, term202706.getClass(), "cardId3", -1981792037);
        setIntField(term202706, term202706.getClass(), "cardLevel1", 41826056);
        setIntField(term202706, term202706.getClass(), "cardLevel2", 1336045771);
        setIntField(term202706, term202706.getClass(), "cardLevel3", 282549313);
        setIntField(term202706, term202706.getClass(), "cardAttack1", -332892529);
        setIntField(term202706, term202706.getClass(), "cardAttack2", 1007630712);
        setIntField(term202706, term202706.getClass(), "cardAttack3", 1203824766);
        setIntField(term202706, term202706.getClass(), "bossCharaId", 413201694);
        setIntField(term202706, term202706.getClass(), "bossLevel", -340513413);
        setIntField(term202706, term202706.getClass(), "bossAttribute", -2054663329);
        setIntField(term202706, term202706.getClass(), "clearStatus", 448554489);
        setIntField(term202706, term202706.getClass(), "techScore", 1385351110);
        setIntField(term202706, term202706.getClass(), "techScoreRank", -1224101846);
        setIntField(term202706, term202706.getClass(), "battleScore", 56346497);
        setIntField(term202706, term202706.getClass(), "battleScoreRank", -557292568);
        setIntField(term202706, term202706.getClass(), "platinumScore", -370318174);
        setIntField(term202706, term202706.getClass(), "maxCombo", 721583335);
        setIntField(term202706, term202706.getClass(), "judgeMiss", 1048340440);
        setIntField(term202706, term202706.getClass(), "judgeHit", 1746284065);
        setIntField(term202706, term202706.getClass(), "judgeBreak", 1832660337);
        setIntField(term202706, term202706.getClass(), "judgeCriticalBreak", -1990813786);
        setIntField(term202706, term202706.getClass(), "rateTap", 1064455079);
        setIntField(term202706, term202706.getClass(), "rateHold", -1632870355);
        setIntField(term202706, term202706.getClass(), "rateFlick", 275827584);
        setIntField(term202706, term202706.getClass(), "rateSideTap", 1517327907);
        setIntField(term202706, term202706.getClass(), "rateSideHold", -1581493553);
        setIntField(term202706, term202706.getClass(), "bellCount", 1146701831);
        setIntField(term202706, term202706.getClass(), "totalBellCount", -1098689257);
        setIntField(term202706, term202706.getClass(), "damageCount", -281818549);
        setIntField(term202706, term202706.getClass(), "overDamage", -1418327456);
        setBooleanField(term202706, term202706.getClass(), "isTechNewRecord", true);
        setBooleanField(term202706, term202706.getClass(), "isBattleNewRecord", false);
        setBooleanField(term202706, term202706.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term202706, term202706.getClass(), "isFullCombo", false);
        setBooleanField(term202706, term202706.getClass(), "isFullBell", true);
        setBooleanField(term202706, term202706.getClass(), "isAllBreak", false);
        setIntField(term202706, term202706.getClass(), "playerRating", 572666147);
        setIntField(term202706, term202706.getClass(), "battlePoint", 250271286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClearStatus", argTypes, term202706, args);
    }

};


