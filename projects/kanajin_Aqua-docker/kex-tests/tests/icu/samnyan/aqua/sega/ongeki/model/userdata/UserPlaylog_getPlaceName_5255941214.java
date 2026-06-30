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

public class UserPlaylog_getPlaceName_5255941214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183746;

    public UserPlaylog_getPlaceName_5255941214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term183752 = new Long(6273670659288205855L);
        term183746 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term183748 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term183750 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term183766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term183767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term183771 = newInstance(Class.forName("java.time.LocalTime"));
        Object term183776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term183777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term183781 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term183746, term183746.getClass(), "id", -8730986987759901938L);
        setLongField(term183748, term183748.getClass(), "id", -8140269607962363771L);
        setLongField(term183750, term183750.getClass(), "id", -8951873110592455526L);
        setField(term183750, term183750.getClass(), "extId", term183752);
        setField(term183750, term183750.getClass(), "luid", "PiMqofRFQi");
        setIntField(term183767, term183767.getClass(), "year", 2019);
        setShortField(term183767, term183767.getClass(), "month", (short) 7);
        setShortField(term183767, term183767.getClass(), "day", (short) 7);
        setField(term183766, term183766.getClass(), "date", term183767);
        setByteField(term183771, term183771.getClass(), "hour", (byte) 22);
        setByteField(term183771, term183771.getClass(), "minute", (byte) 43);
        setByteField(term183771, term183771.getClass(), "second", (byte) 9);
        setIntField(term183771, term183771.getClass(), "nano", 17138447);
        setField(term183766, term183766.getClass(), "time", term183771);
        setField(term183750, term183750.getClass(), "registerTime", term183766);
        setIntField(term183777, term183777.getClass(), "year", 2026);
        setShortField(term183777, term183777.getClass(), "month", (short) 5);
        setShortField(term183777, term183777.getClass(), "day", (short) 13);
        setField(term183776, term183776.getClass(), "date", term183777);
        setByteField(term183781, term183781.getClass(), "hour", (byte) 21);
        setByteField(term183781, term183781.getClass(), "minute", (byte) 41);
        setByteField(term183781, term183781.getClass(), "second", (byte) 14);
        setIntField(term183781, term183781.getClass(), "nano", 302456774);
        setField(term183776, term183776.getClass(), "time", term183781);
        setField(term183750, term183750.getClass(), "accessTime", term183776);
        setField(term183748, term183748.getClass(), "card", term183750);
        setField(term183748, term183748.getClass(), "userName", "pwXMPDqzoA");
        setIntField(term183748, term183748.getClass(), "level", -390659422);
        setIntField(term183748, term183748.getClass(), "reincarnationNum", -191520335);
        setLongField(term183748, term183748.getClass(), "exp", 593453002234887028L);
        setLongField(term183748, term183748.getClass(), "point", 4453491050716159630L);
        setLongField(term183748, term183748.getClass(), "totalPoint", -3941556871134552655L);
        setIntField(term183748, term183748.getClass(), "playCount", 1800240350);
        setIntField(term183748, term183748.getClass(), "jewelCount", -1577729748);
        setIntField(term183748, term183748.getClass(), "totalJewelCount", -313193141);
        setIntField(term183748, term183748.getClass(), "medalCount", -742825342);
        setIntField(term183748, term183748.getClass(), "playerRating", -2112740645);
        setIntField(term183748, term183748.getClass(), "highestRating", -1077024916);
        setIntField(term183748, term183748.getClass(), "battlePoint", -1813631452);
        setIntField(term183748, term183748.getClass(), "bestBattlePoint", -1818017791);
        setIntField(term183748, term183748.getClass(), "overDamageBattlePoint", -2008670044);
        setBooleanField(term183748, term183748.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term183748, term183748.getClass(), "nameplateId", 1851068303);
        setIntField(term183748, term183748.getClass(), "trophyId", 63529722);
        setIntField(term183748, term183748.getClass(), "cardId", 608631812);
        setIntField(term183748, term183748.getClass(), "characterId", -616104461);
        setIntField(term183748, term183748.getClass(), "characterVoiceNo", -2121819706);
        setIntField(term183748, term183748.getClass(), "tabSetting", 857872548);
        setIntField(term183748, term183748.getClass(), "tabSortSetting", -140153101);
        setIntField(term183748, term183748.getClass(), "cardCategorySetting", -38642214);
        setIntField(term183748, term183748.getClass(), "cardSortSetting", 1058657365);
        setIntField(term183748, term183748.getClass(), "rivalScoreCategorySetting", 780690863);
        setIntField(term183748, term183748.getClass(), "playedTutorialBit", 599054233);
        setIntField(term183748, term183748.getClass(), "firstTutorialCancelNum", 779645960);
        setLongField(term183748, term183748.getClass(), "sumTechHighScore", -1261353123094055721L);
        setLongField(term183748, term183748.getClass(), "sumTechBasicHighScore", 6162444134699410509L);
        setLongField(term183748, term183748.getClass(), "sumTechAdvancedHighScore", -9202887711706840371L);
        setLongField(term183748, term183748.getClass(), "sumTechExpertHighScore", -762055079462169234L);
        setLongField(term183748, term183748.getClass(), "sumTechMasterHighScore", 4628565500635907989L);
        setLongField(term183748, term183748.getClass(), "sumTechLunaticHighScore", 3937878496290704721L);
        setLongField(term183748, term183748.getClass(), "sumBattleHighScore", -5148590456264489786L);
        setLongField(term183748, term183748.getClass(), "sumBattleBasicHighScore", 6690184392200642449L);
        setLongField(term183748, term183748.getClass(), "sumBattleAdvancedHighScore", 8386363903106304846L);
        setLongField(term183748, term183748.getClass(), "sumBattleExpertHighScore", 1755271321964447912L);
        setLongField(term183748, term183748.getClass(), "sumBattleMasterHighScore", -4338604278922562922L);
        setLongField(term183748, term183748.getClass(), "sumBattleLunaticHighScore", -3212157865782021194L);
        setField(term183748, term183748.getClass(), "eventWatchedDate", "HQLQWUnXEf");
        setField(term183748, term183748.getClass(), "cmEventWatchedDate", "YyEhHzEtEI");
        setField(term183748, term183748.getClass(), "firstGameId", "HGPHBeXqrv");
        setField(term183748, term183748.getClass(), "firstRomVersion", "IZRGLXWScu");
        setField(term183748, term183748.getClass(), "firstDataVersion", "IBINtqJpGT");
        setField(term183748, term183748.getClass(), "firstPlayDate", "LVOzoKuJQC");
        setField(term183748, term183748.getClass(), "lastGameId", "lPMBTtVKIO");
        setField(term183748, term183748.getClass(), "lastRomVersion", "KYsGHYFHYQ");
        setField(term183748, term183748.getClass(), "lastDataVersion", "dFFyFkwrnE");
        setField(term183748, term183748.getClass(), "compatibleCmVersion", "ikItDbRHqP");
        setField(term183748, term183748.getClass(), "lastPlayDate", "tZkRhthzVL");
        setIntField(term183748, term183748.getClass(), "lastPlaceId", 1499398534);
        setField(term183748, term183748.getClass(), "lastPlaceName", "gbvDNdYmGm");
        setIntField(term183748, term183748.getClass(), "lastRegionId", -1850750147);
        setField(term183748, term183748.getClass(), "lastRegionName", "uNZFhgKAbW");
        setIntField(term183748, term183748.getClass(), "lastAllNetId", 484299838);
        setField(term183748, term183748.getClass(), "lastClientId", "YIdiDKXHaS");
        setIntField(term183748, term183748.getClass(), "lastUsedDeckId", 239733321);
        setIntField(term183748, term183748.getClass(), "lastPlayMusicLevel", -976860961);
        setIntField(term183748, term183748.getClass(), "lastEmoneyBrand", -1891721175);
        setField(term183746, term183746.getClass(), "user", term183748);
        setIntField(term183746, term183746.getClass(), "sortNumber", -1809426188);
        setIntField(term183746, term183746.getClass(), "placeId", -1096623533);
        setField(term183746, term183746.getClass(), "placeName", "oyvSGEURIT");
        setField(term183746, term183746.getClass(), "playDate", "rzYOCnTVlX");
        setField(term183746, term183746.getClass(), "userPlayDate", "NjVoiqLfus");
        setIntField(term183746, term183746.getClass(), "musicId", -107411562);
        setIntField(term183746, term183746.getClass(), "level", -1928426897);
        setIntField(term183746, term183746.getClass(), "playKind", -1947912399);
        setIntField(term183746, term183746.getClass(), "eventId", 1383677886);
        setField(term183746, term183746.getClass(), "eventName", "eJqUXvnJbF");
        setIntField(term183746, term183746.getClass(), "eventPoint", 1382626372);
        setIntField(term183746, term183746.getClass(), "playedUserId1", -894391605);
        setIntField(term183746, term183746.getClass(), "playedUserId2", 1886259870);
        setIntField(term183746, term183746.getClass(), "playedUserId3", -240613804);
        setField(term183746, term183746.getClass(), "playedUserName1", "VpXwMHTEPK");
        setField(term183746, term183746.getClass(), "playedUserName2", "zZfVQCDLcL");
        setField(term183746, term183746.getClass(), "playedUserName3", "qwucImMziW");
        setIntField(term183746, term183746.getClass(), "playedMusicLevel1", -883570215);
        setIntField(term183746, term183746.getClass(), "playedMusicLevel2", 949378719);
        setIntField(term183746, term183746.getClass(), "playedMusicLevel3", -925982931);
        setIntField(term183746, term183746.getClass(), "cardId1", -1246013301);
        setIntField(term183746, term183746.getClass(), "cardId2", 943091152);
        setIntField(term183746, term183746.getClass(), "cardId3", 820624409);
        setIntField(term183746, term183746.getClass(), "cardLevel1", 330572913);
        setIntField(term183746, term183746.getClass(), "cardLevel2", -854584753);
        setIntField(term183746, term183746.getClass(), "cardLevel3", 589219235);
        setIntField(term183746, term183746.getClass(), "cardAttack1", 640625812);
        setIntField(term183746, term183746.getClass(), "cardAttack2", 1595916841);
        setIntField(term183746, term183746.getClass(), "cardAttack3", -1599538173);
        setIntField(term183746, term183746.getClass(), "bossCharaId", -625135745);
        setIntField(term183746, term183746.getClass(), "bossLevel", 964413759);
        setIntField(term183746, term183746.getClass(), "bossAttribute", -1275633123);
        setIntField(term183746, term183746.getClass(), "clearStatus", -1651068471);
        setIntField(term183746, term183746.getClass(), "techScore", -132132293);
        setIntField(term183746, term183746.getClass(), "techScoreRank", -2002625028);
        setIntField(term183746, term183746.getClass(), "battleScore", 838386477);
        setIntField(term183746, term183746.getClass(), "battleScoreRank", 1829452545);
        setIntField(term183746, term183746.getClass(), "platinumScore", -1952040826);
        setIntField(term183746, term183746.getClass(), "maxCombo", -1905052022);
        setIntField(term183746, term183746.getClass(), "judgeMiss", -1302189658);
        setIntField(term183746, term183746.getClass(), "judgeHit", 705205776);
        setIntField(term183746, term183746.getClass(), "judgeBreak", -1701516448);
        setIntField(term183746, term183746.getClass(), "judgeCriticalBreak", 843651557);
        setIntField(term183746, term183746.getClass(), "rateTap", -1996144425);
        setIntField(term183746, term183746.getClass(), "rateHold", -645546910);
        setIntField(term183746, term183746.getClass(), "rateFlick", -1272725557);
        setIntField(term183746, term183746.getClass(), "rateSideTap", -757065748);
        setIntField(term183746, term183746.getClass(), "rateSideHold", -374472220);
        setIntField(term183746, term183746.getClass(), "bellCount", -1374592335);
        setIntField(term183746, term183746.getClass(), "totalBellCount", 758565825);
        setIntField(term183746, term183746.getClass(), "damageCount", 1226378564);
        setIntField(term183746, term183746.getClass(), "overDamage", 202421209);
        setBooleanField(term183746, term183746.getClass(), "isTechNewRecord", true);
        setBooleanField(term183746, term183746.getClass(), "isBattleNewRecord", false);
        setBooleanField(term183746, term183746.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term183746, term183746.getClass(), "isFullCombo", true);
        setBooleanField(term183746, term183746.getClass(), "isFullBell", true);
        setBooleanField(term183746, term183746.getClass(), "isAllBreak", false);
        setIntField(term183746, term183746.getClass(), "playerRating", -1834354298);
        setIntField(term183746, term183746.getClass(), "battlePoint", 1081947752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceName", argTypes, term183746, args);
    }

};


