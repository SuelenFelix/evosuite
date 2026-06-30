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

public class UserCharacter_getIntimateLevel_14931442447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170894;

    public UserCharacter_getIntimateLevel_14931442447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term170900 = new Long(-5552123402871285352L);
        term170894 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term170896 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term170898 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term170914 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170915 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170919 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170929 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term170894, term170894.getClass(), "id", 3807292775507608584L);
        setLongField(term170896, term170896.getClass(), "id", -2774036194156152136L);
        setLongField(term170898, term170898.getClass(), "id", -2474492075184927477L);
        setField(term170898, term170898.getClass(), "extId", term170900);
        setField(term170898, term170898.getClass(), "luid", "vOizGhjCwb");
        setIntField(term170915, term170915.getClass(), "year", 2012);
        setShortField(term170915, term170915.getClass(), "month", (short) 2);
        setShortField(term170915, term170915.getClass(), "day", (short) 16);
        setField(term170914, term170914.getClass(), "date", term170915);
        setByteField(term170919, term170919.getClass(), "hour", (byte) 5);
        setByteField(term170919, term170919.getClass(), "minute", (byte) 12);
        setByteField(term170919, term170919.getClass(), "second", (byte) 33);
        setIntField(term170919, term170919.getClass(), "nano", 551526646);
        setField(term170914, term170914.getClass(), "time", term170919);
        setField(term170898, term170898.getClass(), "registerTime", term170914);
        setIntField(term170925, term170925.getClass(), "year", 2028);
        setShortField(term170925, term170925.getClass(), "month", (short) 5);
        setShortField(term170925, term170925.getClass(), "day", (short) 29);
        setField(term170924, term170924.getClass(), "date", term170925);
        setByteField(term170929, term170929.getClass(), "hour", (byte) 0);
        setByteField(term170929, term170929.getClass(), "minute", (byte) 20);
        setByteField(term170929, term170929.getClass(), "second", (byte) 4);
        setIntField(term170929, term170929.getClass(), "nano", 186776026);
        setField(term170924, term170924.getClass(), "time", term170929);
        setField(term170898, term170898.getClass(), "accessTime", term170924);
        setField(term170896, term170896.getClass(), "card", term170898);
        setField(term170896, term170896.getClass(), "userName", "gRxfRNHbpA");
        setIntField(term170896, term170896.getClass(), "level", 1640135788);
        setIntField(term170896, term170896.getClass(), "reincarnationNum", -1798099248);
        setLongField(term170896, term170896.getClass(), "exp", 2518230246615070982L);
        setLongField(term170896, term170896.getClass(), "point", 5853330021331831999L);
        setLongField(term170896, term170896.getClass(), "totalPoint", 831091054418959189L);
        setIntField(term170896, term170896.getClass(), "playCount", -751016254);
        setIntField(term170896, term170896.getClass(), "jewelCount", -675885759);
        setIntField(term170896, term170896.getClass(), "totalJewelCount", 210273358);
        setIntField(term170896, term170896.getClass(), "medalCount", 1549469301);
        setIntField(term170896, term170896.getClass(), "playerRating", -1013418612);
        setIntField(term170896, term170896.getClass(), "highestRating", -2032230010);
        setIntField(term170896, term170896.getClass(), "battlePoint", 1371041033);
        setIntField(term170896, term170896.getClass(), "bestBattlePoint", 1425278647);
        setIntField(term170896, term170896.getClass(), "overDamageBattlePoint", 1987874128);
        setBooleanField(term170896, term170896.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term170896, term170896.getClass(), "nameplateId", -1044006018);
        setIntField(term170896, term170896.getClass(), "trophyId", 1682172851);
        setIntField(term170896, term170896.getClass(), "cardId", 525455763);
        setIntField(term170896, term170896.getClass(), "characterId", -1779673407);
        setIntField(term170896, term170896.getClass(), "characterVoiceNo", -974331461);
        setIntField(term170896, term170896.getClass(), "tabSetting", -1970561622);
        setIntField(term170896, term170896.getClass(), "tabSortSetting", -1823273876);
        setIntField(term170896, term170896.getClass(), "cardCategorySetting", -1730970144);
        setIntField(term170896, term170896.getClass(), "cardSortSetting", 1746099578);
        setIntField(term170896, term170896.getClass(), "rivalScoreCategorySetting", -783114572);
        setIntField(term170896, term170896.getClass(), "playedTutorialBit", 1808573799);
        setIntField(term170896, term170896.getClass(), "firstTutorialCancelNum", 1246473923);
        setLongField(term170896, term170896.getClass(), "sumTechHighScore", 8674771096382942509L);
        setLongField(term170896, term170896.getClass(), "sumTechBasicHighScore", -7851097320913123376L);
        setLongField(term170896, term170896.getClass(), "sumTechAdvancedHighScore", 7086059537366156321L);
        setLongField(term170896, term170896.getClass(), "sumTechExpertHighScore", 7965921666937548237L);
        setLongField(term170896, term170896.getClass(), "sumTechMasterHighScore", 9152085923000902928L);
        setLongField(term170896, term170896.getClass(), "sumTechLunaticHighScore", -1155570685161585580L);
        setLongField(term170896, term170896.getClass(), "sumBattleHighScore", 9077525443390876981L);
        setLongField(term170896, term170896.getClass(), "sumBattleBasicHighScore", -4324028422138106655L);
        setLongField(term170896, term170896.getClass(), "sumBattleAdvancedHighScore", 343175520811675132L);
        setLongField(term170896, term170896.getClass(), "sumBattleExpertHighScore", 6625317914216873577L);
        setLongField(term170896, term170896.getClass(), "sumBattleMasterHighScore", -695735546007856732L);
        setLongField(term170896, term170896.getClass(), "sumBattleLunaticHighScore", 19203646627691674L);
        setField(term170896, term170896.getClass(), "eventWatchedDate", "RousChzHaG");
        setField(term170896, term170896.getClass(), "cmEventWatchedDate", "VttmtsKyxG");
        setField(term170896, term170896.getClass(), "firstGameId", "khWWCkfcej");
        setField(term170896, term170896.getClass(), "firstRomVersion", "oLcqGUafTJ");
        setField(term170896, term170896.getClass(), "firstDataVersion", "tpCyOHBwCr");
        setField(term170896, term170896.getClass(), "firstPlayDate", "bYzsBKdrQG");
        setField(term170896, term170896.getClass(), "lastGameId", "mpbJPoDJrt");
        setField(term170896, term170896.getClass(), "lastRomVersion", "zgNKRTasbS");
        setField(term170896, term170896.getClass(), "lastDataVersion", "MWoRTqbNjN");
        setField(term170896, term170896.getClass(), "compatibleCmVersion", "vkfjosBNuv");
        setField(term170896, term170896.getClass(), "lastPlayDate", "iLDMxuomcS");
        setIntField(term170896, term170896.getClass(), "lastPlaceId", -1966362089);
        setField(term170896, term170896.getClass(), "lastPlaceName", "ZKAeSUzlfH");
        setIntField(term170896, term170896.getClass(), "lastRegionId", -590160537);
        setField(term170896, term170896.getClass(), "lastRegionName", "DhaSZfoyDB");
        setIntField(term170896, term170896.getClass(), "lastAllNetId", 338926069);
        setField(term170896, term170896.getClass(), "lastClientId", "ilrkwpiztX");
        setIntField(term170896, term170896.getClass(), "lastUsedDeckId", 1270815383);
        setIntField(term170896, term170896.getClass(), "lastPlayMusicLevel", -1570777149);
        setIntField(term170896, term170896.getClass(), "lastEmoneyBrand", 1402458571);
        setField(term170894, term170894.getClass(), "user", term170896);
        setIntField(term170894, term170894.getClass(), "characterId", 1057231536);
        setIntField(term170894, term170894.getClass(), "costumeId", 1094699239);
        setIntField(term170894, term170894.getClass(), "attachmentId", -340660877);
        setIntField(term170894, term170894.getClass(), "playCount", -1057260995);
        setIntField(term170894, term170894.getClass(), "intimateLevel", 2052974699);
        setIntField(term170894, term170894.getClass(), "intimateCount", -1104398051);
        setIntField(term170894, term170894.getClass(), "intimateCountRewarded", 1965135387);
        setField(term170894, term170894.getClass(), "intimateCountDate", "GJNAZXvWWN");
        setBooleanField(term170894, term170894.getClass(), "isNew", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntimateLevel", argTypes, term170894, args);
    }

};


