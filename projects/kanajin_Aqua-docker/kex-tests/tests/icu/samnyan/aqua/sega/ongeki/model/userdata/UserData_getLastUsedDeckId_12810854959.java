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

public class UserData_getLastUsedDeckId_12810854959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46875;

    public UserData_getLastUsedDeckId_12810854959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term46879 = new Long(-3936701866695933852L);
        term46875 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term46877 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term46893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46898 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46903 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46904 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46908 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term46875, term46875.getClass(), "id", -1789728735275535628L);
        setLongField(term46877, term46877.getClass(), "id", 9165671796313176705L);
        setField(term46877, term46877.getClass(), "extId", term46879);
        setField(term46877, term46877.getClass(), "luid", "EhuyRKrUJu");
        setIntField(term46894, term46894.getClass(), "year", 2010);
        setShortField(term46894, term46894.getClass(), "month", (short) 9);
        setShortField(term46894, term46894.getClass(), "day", (short) 20);
        setField(term46893, term46893.getClass(), "date", term46894);
        setByteField(term46898, term46898.getClass(), "hour", (byte) 3);
        setByteField(term46898, term46898.getClass(), "minute", (byte) 41);
        setByteField(term46898, term46898.getClass(), "second", (byte) 7);
        setIntField(term46898, term46898.getClass(), "nano", 796515800);
        setField(term46893, term46893.getClass(), "time", term46898);
        setField(term46877, term46877.getClass(), "registerTime", term46893);
        setIntField(term46904, term46904.getClass(), "year", 2015);
        setShortField(term46904, term46904.getClass(), "month", (short) 10);
        setShortField(term46904, term46904.getClass(), "day", (short) 2);
        setField(term46903, term46903.getClass(), "date", term46904);
        setByteField(term46908, term46908.getClass(), "hour", (byte) 21);
        setByteField(term46908, term46908.getClass(), "minute", (byte) 18);
        setByteField(term46908, term46908.getClass(), "second", (byte) 42);
        setIntField(term46908, term46908.getClass(), "nano", 185569616);
        setField(term46903, term46903.getClass(), "time", term46908);
        setField(term46877, term46877.getClass(), "accessTime", term46903);
        setField(term46875, term46875.getClass(), "card", term46877);
        setField(term46875, term46875.getClass(), "userName", "UlBxuoBXcJ");
        setIntField(term46875, term46875.getClass(), "level", 891165187);
        setIntField(term46875, term46875.getClass(), "reincarnationNum", 1608737678);
        setLongField(term46875, term46875.getClass(), "exp", 8104096721239680583L);
        setLongField(term46875, term46875.getClass(), "point", 1132566737750531256L);
        setLongField(term46875, term46875.getClass(), "totalPoint", -3777136467668448199L);
        setIntField(term46875, term46875.getClass(), "playCount", -1605443550);
        setIntField(term46875, term46875.getClass(), "jewelCount", -735690372);
        setIntField(term46875, term46875.getClass(), "totalJewelCount", 110644904);
        setIntField(term46875, term46875.getClass(), "medalCount", -1457905205);
        setIntField(term46875, term46875.getClass(), "playerRating", 1722454323);
        setIntField(term46875, term46875.getClass(), "highestRating", 630174216);
        setIntField(term46875, term46875.getClass(), "battlePoint", -1081282297);
        setIntField(term46875, term46875.getClass(), "bestBattlePoint", 1331103887);
        setIntField(term46875, term46875.getClass(), "overDamageBattlePoint", 637911543);
        setBooleanField(term46875, term46875.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term46875, term46875.getClass(), "nameplateId", -779100899);
        setIntField(term46875, term46875.getClass(), "trophyId", -1750603840);
        setIntField(term46875, term46875.getClass(), "cardId", 2088919651);
        setIntField(term46875, term46875.getClass(), "characterId", 949997254);
        setIntField(term46875, term46875.getClass(), "characterVoiceNo", 690762493);
        setIntField(term46875, term46875.getClass(), "tabSetting", -1050083704);
        setIntField(term46875, term46875.getClass(), "tabSortSetting", -1513402749);
        setIntField(term46875, term46875.getClass(), "cardCategorySetting", -1865692837);
        setIntField(term46875, term46875.getClass(), "cardSortSetting", 966678407);
        setIntField(term46875, term46875.getClass(), "rivalScoreCategorySetting", -881632231);
        setIntField(term46875, term46875.getClass(), "playedTutorialBit", -1285148224);
        setIntField(term46875, term46875.getClass(), "firstTutorialCancelNum", -2002558482);
        setLongField(term46875, term46875.getClass(), "sumTechHighScore", 6995079656219021769L);
        setLongField(term46875, term46875.getClass(), "sumTechBasicHighScore", 9105367613914646956L);
        setLongField(term46875, term46875.getClass(), "sumTechAdvancedHighScore", -2619427369277959894L);
        setLongField(term46875, term46875.getClass(), "sumTechExpertHighScore", -6961214062026278685L);
        setLongField(term46875, term46875.getClass(), "sumTechMasterHighScore", 3881903610132068684L);
        setLongField(term46875, term46875.getClass(), "sumTechLunaticHighScore", -1517313114689915067L);
        setLongField(term46875, term46875.getClass(), "sumBattleHighScore", -8963879630647796485L);
        setLongField(term46875, term46875.getClass(), "sumBattleBasicHighScore", -4359906070460003487L);
        setLongField(term46875, term46875.getClass(), "sumBattleAdvancedHighScore", 3290224539925725962L);
        setLongField(term46875, term46875.getClass(), "sumBattleExpertHighScore", -4048501682703538382L);
        setLongField(term46875, term46875.getClass(), "sumBattleMasterHighScore", -8292962776344200146L);
        setLongField(term46875, term46875.getClass(), "sumBattleLunaticHighScore", 3705697676400134819L);
        setField(term46875, term46875.getClass(), "eventWatchedDate", "PqduvNFXXw");
        setField(term46875, term46875.getClass(), "cmEventWatchedDate", "bMQrxvaBAI");
        setField(term46875, term46875.getClass(), "firstGameId", "StFtysZlWm");
        setField(term46875, term46875.getClass(), "firstRomVersion", "CoqUcmjnkF");
        setField(term46875, term46875.getClass(), "firstDataVersion", "oOrXvGaFwa");
        setField(term46875, term46875.getClass(), "firstPlayDate", "KJSTLGsSvO");
        setField(term46875, term46875.getClass(), "lastGameId", "kSkiIpaepq");
        setField(term46875, term46875.getClass(), "lastRomVersion", "FzJhDecyvI");
        setField(term46875, term46875.getClass(), "lastDataVersion", "zOxseYMSdY");
        setField(term46875, term46875.getClass(), "compatibleCmVersion", "jEKlkqpHMQ");
        setField(term46875, term46875.getClass(), "lastPlayDate", "QpEVWispEh");
        setIntField(term46875, term46875.getClass(), "lastPlaceId", 794384312);
        setField(term46875, term46875.getClass(), "lastPlaceName", "STofGrqXqL");
        setIntField(term46875, term46875.getClass(), "lastRegionId", 1166664554);
        setField(term46875, term46875.getClass(), "lastRegionName", "IoRhBfdSuN");
        setIntField(term46875, term46875.getClass(), "lastAllNetId", -1287204441);
        setField(term46875, term46875.getClass(), "lastClientId", "JGdxVjQzts");
        setIntField(term46875, term46875.getClass(), "lastUsedDeckId", 1826016641);
        setIntField(term46875, term46875.getClass(), "lastPlayMusicLevel", 1726886771);
        setIntField(term46875, term46875.getClass(), "lastEmoneyBrand", 1045689376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastUsedDeckId", argTypes, term46875, args);
    }

};


