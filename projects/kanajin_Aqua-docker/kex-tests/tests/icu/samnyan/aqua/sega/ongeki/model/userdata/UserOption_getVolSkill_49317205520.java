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

public class UserOption_getVolSkill_49317205520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317691;

    public UserOption_getVolSkill_49317205520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term317697 = new Long(4006388896509492239L);
        term317691 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term317693 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term317695 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term317711 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317716 = newInstance(Class.forName("java.time.LocalTime"));
        Object term317721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317726 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term317691, term317691.getClass(), "id", 338849815965134501L);
        setLongField(term317693, term317693.getClass(), "id", -9036568106068506380L);
        setLongField(term317695, term317695.getClass(), "id", 6436793014083108564L);
        setField(term317695, term317695.getClass(), "extId", term317697);
        setField(term317695, term317695.getClass(), "luid", "mENSnxhzMt");
        setIntField(term317712, term317712.getClass(), "year", 2010);
        setShortField(term317712, term317712.getClass(), "month", (short) 1);
        setShortField(term317712, term317712.getClass(), "day", (short) 7);
        setField(term317711, term317711.getClass(), "date", term317712);
        setByteField(term317716, term317716.getClass(), "hour", (byte) 5);
        setByteField(term317716, term317716.getClass(), "minute", (byte) 21);
        setByteField(term317716, term317716.getClass(), "second", (byte) 13);
        setIntField(term317716, term317716.getClass(), "nano", 4843701);
        setField(term317711, term317711.getClass(), "time", term317716);
        setField(term317695, term317695.getClass(), "registerTime", term317711);
        setIntField(term317722, term317722.getClass(), "year", 2022);
        setShortField(term317722, term317722.getClass(), "month", (short) 5);
        setShortField(term317722, term317722.getClass(), "day", (short) 19);
        setField(term317721, term317721.getClass(), "date", term317722);
        setByteField(term317726, term317726.getClass(), "hour", (byte) 16);
        setByteField(term317726, term317726.getClass(), "minute", (byte) 33);
        setByteField(term317726, term317726.getClass(), "second", (byte) 4);
        setIntField(term317726, term317726.getClass(), "nano", 239381370);
        setField(term317721, term317721.getClass(), "time", term317726);
        setField(term317695, term317695.getClass(), "accessTime", term317721);
        setField(term317693, term317693.getClass(), "card", term317695);
        setField(term317693, term317693.getClass(), "userName", "SbKMrZCLtu");
        setIntField(term317693, term317693.getClass(), "level", -992358587);
        setIntField(term317693, term317693.getClass(), "reincarnationNum", -1857222819);
        setLongField(term317693, term317693.getClass(), "exp", -8257296345754604673L);
        setLongField(term317693, term317693.getClass(), "point", -6509609526761906046L);
        setLongField(term317693, term317693.getClass(), "totalPoint", -2752434116124375081L);
        setIntField(term317693, term317693.getClass(), "playCount", 408246047);
        setIntField(term317693, term317693.getClass(), "jewelCount", -1463685085);
        setIntField(term317693, term317693.getClass(), "totalJewelCount", -1174727143);
        setIntField(term317693, term317693.getClass(), "medalCount", -346897949);
        setIntField(term317693, term317693.getClass(), "playerRating", 1544213370);
        setIntField(term317693, term317693.getClass(), "highestRating", -639533582);
        setIntField(term317693, term317693.getClass(), "battlePoint", -1062938954);
        setIntField(term317693, term317693.getClass(), "bestBattlePoint", 1932457353);
        setIntField(term317693, term317693.getClass(), "overDamageBattlePoint", 399973707);
        setBooleanField(term317693, term317693.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term317693, term317693.getClass(), "nameplateId", -1002465553);
        setIntField(term317693, term317693.getClass(), "trophyId", -508611347);
        setIntField(term317693, term317693.getClass(), "cardId", 391339380);
        setIntField(term317693, term317693.getClass(), "characterId", -444695734);
        setIntField(term317693, term317693.getClass(), "characterVoiceNo", 1274208211);
        setIntField(term317693, term317693.getClass(), "tabSetting", -1365124631);
        setIntField(term317693, term317693.getClass(), "tabSortSetting", -1170848518);
        setIntField(term317693, term317693.getClass(), "cardCategorySetting", -571438099);
        setIntField(term317693, term317693.getClass(), "cardSortSetting", 1764437317);
        setIntField(term317693, term317693.getClass(), "rivalScoreCategorySetting", -202316601);
        setIntField(term317693, term317693.getClass(), "playedTutorialBit", -153489748);
        setIntField(term317693, term317693.getClass(), "firstTutorialCancelNum", 1563212317);
        setLongField(term317693, term317693.getClass(), "sumTechHighScore", 7418238931423071189L);
        setLongField(term317693, term317693.getClass(), "sumTechBasicHighScore", 5842303913972342561L);
        setLongField(term317693, term317693.getClass(), "sumTechAdvancedHighScore", 6892639427588894474L);
        setLongField(term317693, term317693.getClass(), "sumTechExpertHighScore", 2625518135500969204L);
        setLongField(term317693, term317693.getClass(), "sumTechMasterHighScore", 888374224452702140L);
        setLongField(term317693, term317693.getClass(), "sumTechLunaticHighScore", -696832372452295618L);
        setLongField(term317693, term317693.getClass(), "sumBattleHighScore", 7198314567683931237L);
        setLongField(term317693, term317693.getClass(), "sumBattleBasicHighScore", -7885415185401508247L);
        setLongField(term317693, term317693.getClass(), "sumBattleAdvancedHighScore", -1291828678022606299L);
        setLongField(term317693, term317693.getClass(), "sumBattleExpertHighScore", 3374888366385524921L);
        setLongField(term317693, term317693.getClass(), "sumBattleMasterHighScore", -6909846119600956734L);
        setLongField(term317693, term317693.getClass(), "sumBattleLunaticHighScore", -2609438799231554569L);
        setField(term317693, term317693.getClass(), "eventWatchedDate", "PIekMRGUhk");
        setField(term317693, term317693.getClass(), "cmEventWatchedDate", "CKIpUfrzZF");
        setField(term317693, term317693.getClass(), "firstGameId", "mhyfrRVrzd");
        setField(term317693, term317693.getClass(), "firstRomVersion", "fhPPAPbnvz");
        setField(term317693, term317693.getClass(), "firstDataVersion", "gWhGAIVZtc");
        setField(term317693, term317693.getClass(), "firstPlayDate", "eqCORaKrpR");
        setField(term317693, term317693.getClass(), "lastGameId", "HkwwOfBiKe");
        setField(term317693, term317693.getClass(), "lastRomVersion", "NPXwoLqjky");
        setField(term317693, term317693.getClass(), "lastDataVersion", "HcItiqHkWh");
        setField(term317693, term317693.getClass(), "compatibleCmVersion", "vHUDfYoJhr");
        setField(term317693, term317693.getClass(), "lastPlayDate", "zIksyUumKB");
        setIntField(term317693, term317693.getClass(), "lastPlaceId", 2134961278);
        setField(term317693, term317693.getClass(), "lastPlaceName", "aBtZXLZaQt");
        setIntField(term317693, term317693.getClass(), "lastRegionId", 1371525227);
        setField(term317693, term317693.getClass(), "lastRegionName", "coXJZstwFU");
        setIntField(term317693, term317693.getClass(), "lastAllNetId", -38475882);
        setField(term317693, term317693.getClass(), "lastClientId", "vURcdvYeZL");
        setIntField(term317693, term317693.getClass(), "lastUsedDeckId", -2035496659);
        setIntField(term317693, term317693.getClass(), "lastPlayMusicLevel", 348123695);
        setIntField(term317693, term317693.getClass(), "lastEmoneyBrand", -1064541551);
        setField(term317691, term317691.getClass(), "user", term317693);
        setIntField(term317691, term317691.getClass(), "optionSet", 1656081092);
        setIntField(term317691, term317691.getClass(), "speed", 341289991);
        setIntField(term317691, term317691.getClass(), "mirror", -1709845599);
        setIntField(term317691, term317691.getClass(), "judgeTiming", 850458658);
        setIntField(term317691, term317691.getClass(), "judgeAdjustment", 666974472);
        setIntField(term317691, term317691.getClass(), "abort", 1533942696);
        setIntField(term317691, term317691.getClass(), "stealthField", 1550462494);
        setIntField(term317691, term317691.getClass(), "tapSound", -758201656);
        setIntField(term317691, term317691.getClass(), "volGuide", -542045958);
        setIntField(term317691, term317691.getClass(), "volAll", 872784077);
        setIntField(term317691, term317691.getClass(), "volTap", -1448509297);
        setIntField(term317691, term317691.getClass(), "volCrTap", -148517948);
        setIntField(term317691, term317691.getClass(), "volHold", -792202432);
        setIntField(term317691, term317691.getClass(), "volSide", 1472070894);
        setIntField(term317691, term317691.getClass(), "volFlick", -533628058);
        setIntField(term317691, term317691.getClass(), "volBell", -68562946);
        setIntField(term317691, term317691.getClass(), "volEnemy", 1660763919);
        setIntField(term317691, term317691.getClass(), "volSkill", -693608853);
        setIntField(term317691, term317691.getClass(), "volDamage", 571992765);
        setIntField(term317691, term317691.getClass(), "colorField", 1610631517);
        setIntField(term317691, term317691.getClass(), "colorLaneBright", -1967639823);
        setIntField(term317691, term317691.getClass(), "colorWallBright", -585749499);
        setIntField(term317691, term317691.getClass(), "colorLane", -2014077249);
        setIntField(term317691, term317691.getClass(), "colorSide", -645580455);
        setIntField(term317691, term317691.getClass(), "effectDamage", -338997816);
        setIntField(term317691, term317691.getClass(), "effectPos", 1434071951);
        setIntField(term317691, term317691.getClass(), "judgeDisp", 2074146374);
        setIntField(term317691, term317691.getClass(), "judgePos", -1757837107);
        setIntField(term317691, term317691.getClass(), "judgeBreak", 251366418);
        setIntField(term317691, term317691.getClass(), "judgeHit", 233576420);
        setIntField(term317691, term317691.getClass(), "platinumBreakDisp", -1091440698);
        setIntField(term317691, term317691.getClass(), "judgeCriticalBreak", -1831399151);
        setIntField(term317691, term317691.getClass(), "matching", -1503642258);
        setIntField(term317691, term317691.getClass(), "dispPlayerLv", 1014684187);
        setIntField(term317691, term317691.getClass(), "dispRating", 382985320);
        setIntField(term317691, term317691.getClass(), "dispBP", 326345288);
        setIntField(term317691, term317691.getClass(), "headphone", -1230229922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolSkill", argTypes, term317691, args);
    }

};


