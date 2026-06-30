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

public class UserCharacter_getCharacterId_17838663153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169074;

    public UserCharacter_getCharacterId_17838663153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term169080 = new Long(3662777917800385964L);
        term169074 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term169076 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term169078 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term169094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169099 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169104 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169105 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169109 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term169074, term169074.getClass(), "id", 5961711205558912307L);
        setLongField(term169076, term169076.getClass(), "id", -422916641348511945L);
        setLongField(term169078, term169078.getClass(), "id", 3012829681646545710L);
        setField(term169078, term169078.getClass(), "extId", term169080);
        setField(term169078, term169078.getClass(), "luid", "LxkkwJYmre");
        setIntField(term169095, term169095.getClass(), "year", 2018);
        setShortField(term169095, term169095.getClass(), "month", (short) 7);
        setShortField(term169095, term169095.getClass(), "day", (short) 9);
        setField(term169094, term169094.getClass(), "date", term169095);
        setByteField(term169099, term169099.getClass(), "hour", (byte) 23);
        setByteField(term169099, term169099.getClass(), "minute", (byte) 14);
        setByteField(term169099, term169099.getClass(), "second", (byte) 46);
        setIntField(term169099, term169099.getClass(), "nano", 735911690);
        setField(term169094, term169094.getClass(), "time", term169099);
        setField(term169078, term169078.getClass(), "registerTime", term169094);
        setIntField(term169105, term169105.getClass(), "year", 2013);
        setShortField(term169105, term169105.getClass(), "month", (short) 3);
        setShortField(term169105, term169105.getClass(), "day", (short) 22);
        setField(term169104, term169104.getClass(), "date", term169105);
        setByteField(term169109, term169109.getClass(), "hour", (byte) 5);
        setByteField(term169109, term169109.getClass(), "minute", (byte) 34);
        setByteField(term169109, term169109.getClass(), "second", (byte) 39);
        setIntField(term169109, term169109.getClass(), "nano", 3203168);
        setField(term169104, term169104.getClass(), "time", term169109);
        setField(term169078, term169078.getClass(), "accessTime", term169104);
        setField(term169076, term169076.getClass(), "card", term169078);
        setField(term169076, term169076.getClass(), "userName", "wpmpEfMgmx");
        setIntField(term169076, term169076.getClass(), "level", 1380376071);
        setIntField(term169076, term169076.getClass(), "reincarnationNum", 1236068241);
        setLongField(term169076, term169076.getClass(), "exp", 4377245184623049180L);
        setLongField(term169076, term169076.getClass(), "point", 6534893758959343917L);
        setLongField(term169076, term169076.getClass(), "totalPoint", -1038048723599808380L);
        setIntField(term169076, term169076.getClass(), "playCount", -1800680295);
        setIntField(term169076, term169076.getClass(), "jewelCount", 2033032621);
        setIntField(term169076, term169076.getClass(), "totalJewelCount", -415169558);
        setIntField(term169076, term169076.getClass(), "medalCount", 415633287);
        setIntField(term169076, term169076.getClass(), "playerRating", 859754541);
        setIntField(term169076, term169076.getClass(), "highestRating", 1970843205);
        setIntField(term169076, term169076.getClass(), "battlePoint", -741942103);
        setIntField(term169076, term169076.getClass(), "bestBattlePoint", -917429711);
        setIntField(term169076, term169076.getClass(), "overDamageBattlePoint", -1518919035);
        setBooleanField(term169076, term169076.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term169076, term169076.getClass(), "nameplateId", -653688131);
        setIntField(term169076, term169076.getClass(), "trophyId", 729662498);
        setIntField(term169076, term169076.getClass(), "cardId", 1640664646);
        setIntField(term169076, term169076.getClass(), "characterId", 975935985);
        setIntField(term169076, term169076.getClass(), "characterVoiceNo", -1159976869);
        setIntField(term169076, term169076.getClass(), "tabSetting", -154385431);
        setIntField(term169076, term169076.getClass(), "tabSortSetting", 495187606);
        setIntField(term169076, term169076.getClass(), "cardCategorySetting", 2022697730);
        setIntField(term169076, term169076.getClass(), "cardSortSetting", 2078279488);
        setIntField(term169076, term169076.getClass(), "rivalScoreCategorySetting", -2114547605);
        setIntField(term169076, term169076.getClass(), "playedTutorialBit", 1231278686);
        setIntField(term169076, term169076.getClass(), "firstTutorialCancelNum", -314088371);
        setLongField(term169076, term169076.getClass(), "sumTechHighScore", -6108873462314179567L);
        setLongField(term169076, term169076.getClass(), "sumTechBasicHighScore", -5335397754732723832L);
        setLongField(term169076, term169076.getClass(), "sumTechAdvancedHighScore", 5998977952560464623L);
        setLongField(term169076, term169076.getClass(), "sumTechExpertHighScore", -7766913315400720289L);
        setLongField(term169076, term169076.getClass(), "sumTechMasterHighScore", 5173208621189388272L);
        setLongField(term169076, term169076.getClass(), "sumTechLunaticHighScore", 7541782583121013535L);
        setLongField(term169076, term169076.getClass(), "sumBattleHighScore", 5693574275981501304L);
        setLongField(term169076, term169076.getClass(), "sumBattleBasicHighScore", 2300641371993155L);
        setLongField(term169076, term169076.getClass(), "sumBattleAdvancedHighScore", -1089622132321417847L);
        setLongField(term169076, term169076.getClass(), "sumBattleExpertHighScore", -3177997931491887954L);
        setLongField(term169076, term169076.getClass(), "sumBattleMasterHighScore", -180416108590927510L);
        setLongField(term169076, term169076.getClass(), "sumBattleLunaticHighScore", -5591666700101099024L);
        setField(term169076, term169076.getClass(), "eventWatchedDate", "JNOsqfXWyI");
        setField(term169076, term169076.getClass(), "cmEventWatchedDate", "iTxvNsKnDY");
        setField(term169076, term169076.getClass(), "firstGameId", "MxewnGKZeY");
        setField(term169076, term169076.getClass(), "firstRomVersion", "OGHGtNyNss");
        setField(term169076, term169076.getClass(), "firstDataVersion", "WuLgcuFENx");
        setField(term169076, term169076.getClass(), "firstPlayDate", "EgAGyGbdTa");
        setField(term169076, term169076.getClass(), "lastGameId", "kGgCoOSFHh");
        setField(term169076, term169076.getClass(), "lastRomVersion", "MiFzlqVhmh");
        setField(term169076, term169076.getClass(), "lastDataVersion", "dnUqfTzVzI");
        setField(term169076, term169076.getClass(), "compatibleCmVersion", "gqqCNmfcKd");
        setField(term169076, term169076.getClass(), "lastPlayDate", "IUHDEPZYAP");
        setIntField(term169076, term169076.getClass(), "lastPlaceId", -44831526);
        setField(term169076, term169076.getClass(), "lastPlaceName", "LsthnVpsJm");
        setIntField(term169076, term169076.getClass(), "lastRegionId", 1856189526);
        setField(term169076, term169076.getClass(), "lastRegionName", "dWMQzoXYsQ");
        setIntField(term169076, term169076.getClass(), "lastAllNetId", -1550958883);
        setField(term169076, term169076.getClass(), "lastClientId", "gEvlBxOmbD");
        setIntField(term169076, term169076.getClass(), "lastUsedDeckId", 503390830);
        setIntField(term169076, term169076.getClass(), "lastPlayMusicLevel", 481544604);
        setIntField(term169076, term169076.getClass(), "lastEmoneyBrand", 175410744);
        setField(term169074, term169074.getClass(), "user", term169076);
        setIntField(term169074, term169074.getClass(), "characterId", 751883814);
        setIntField(term169074, term169074.getClass(), "costumeId", 2060779599);
        setIntField(term169074, term169074.getClass(), "attachmentId", 1859655153);
        setIntField(term169074, term169074.getClass(), "playCount", -653654938);
        setIntField(term169074, term169074.getClass(), "intimateLevel", -1913348296);
        setIntField(term169074, term169074.getClass(), "intimateCount", -901199958);
        setIntField(term169074, term169074.getClass(), "intimateCountRewarded", 426906221);
        setField(term169074, term169074.getClass(), "intimateCountDate", "RVEPBAUthD");
        setBooleanField(term169074, term169074.getClass(), "isNew", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term169074, args);
    }

};


