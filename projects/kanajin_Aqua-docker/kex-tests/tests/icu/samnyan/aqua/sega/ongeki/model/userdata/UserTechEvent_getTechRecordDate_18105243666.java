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

public class UserTechEvent_getTechRecordDate_18105243666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353830;

    public UserTechEvent_getTechRecordDate_18105243666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term353836 = new Long(3410093279424884335L);
        term353830 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term353832 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term353834 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term353850 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term353851 = newInstance(Class.forName("java.time.LocalDate"));
        Object term353855 = newInstance(Class.forName("java.time.LocalTime"));
        Object term353860 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term353861 = newInstance(Class.forName("java.time.LocalDate"));
        Object term353865 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term353830, term353830.getClass(), "id", 2510926098365191021L);
        setLongField(term353832, term353832.getClass(), "id", -6059331873553841334L);
        setLongField(term353834, term353834.getClass(), "id", -561198968956512293L);
        setField(term353834, term353834.getClass(), "extId", term353836);
        setField(term353834, term353834.getClass(), "luid", "vDXjCfjJur");
        setIntField(term353851, term353851.getClass(), "year", 2021);
        setShortField(term353851, term353851.getClass(), "month", (short) 8);
        setShortField(term353851, term353851.getClass(), "day", (short) 30);
        setField(term353850, term353850.getClass(), "date", term353851);
        setByteField(term353855, term353855.getClass(), "hour", (byte) 7);
        setByteField(term353855, term353855.getClass(), "minute", (byte) 30);
        setByteField(term353855, term353855.getClass(), "second", (byte) 24);
        setIntField(term353855, term353855.getClass(), "nano", 135975029);
        setField(term353850, term353850.getClass(), "time", term353855);
        setField(term353834, term353834.getClass(), "registerTime", term353850);
        setIntField(term353861, term353861.getClass(), "year", 2029);
        setShortField(term353861, term353861.getClass(), "month", (short) 6);
        setShortField(term353861, term353861.getClass(), "day", (short) 29);
        setField(term353860, term353860.getClass(), "date", term353861);
        setByteField(term353865, term353865.getClass(), "hour", (byte) 9);
        setByteField(term353865, term353865.getClass(), "minute", (byte) 30);
        setByteField(term353865, term353865.getClass(), "second", (byte) 16);
        setIntField(term353865, term353865.getClass(), "nano", 591727533);
        setField(term353860, term353860.getClass(), "time", term353865);
        setField(term353834, term353834.getClass(), "accessTime", term353860);
        setField(term353832, term353832.getClass(), "card", term353834);
        setField(term353832, term353832.getClass(), "userName", "MEzfZKAgqc");
        setIntField(term353832, term353832.getClass(), "level", 1025506057);
        setIntField(term353832, term353832.getClass(), "reincarnationNum", 601059365);
        setLongField(term353832, term353832.getClass(), "exp", -6921339446404515987L);
        setLongField(term353832, term353832.getClass(), "point", 7828233532282022972L);
        setLongField(term353832, term353832.getClass(), "totalPoint", 1364712731298088567L);
        setIntField(term353832, term353832.getClass(), "playCount", 1026733238);
        setIntField(term353832, term353832.getClass(), "jewelCount", 921660563);
        setIntField(term353832, term353832.getClass(), "totalJewelCount", 420714103);
        setIntField(term353832, term353832.getClass(), "medalCount", 232994413);
        setIntField(term353832, term353832.getClass(), "playerRating", -1475487845);
        setIntField(term353832, term353832.getClass(), "highestRating", 268873567);
        setIntField(term353832, term353832.getClass(), "battlePoint", 1530898333);
        setIntField(term353832, term353832.getClass(), "bestBattlePoint", -1199255687);
        setIntField(term353832, term353832.getClass(), "overDamageBattlePoint", -830059594);
        setBooleanField(term353832, term353832.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term353832, term353832.getClass(), "nameplateId", -1110175286);
        setIntField(term353832, term353832.getClass(), "trophyId", 1740225475);
        setIntField(term353832, term353832.getClass(), "cardId", 1222984530);
        setIntField(term353832, term353832.getClass(), "characterId", -404928510);
        setIntField(term353832, term353832.getClass(), "characterVoiceNo", -1093163646);
        setIntField(term353832, term353832.getClass(), "tabSetting", 1804120888);
        setIntField(term353832, term353832.getClass(), "tabSortSetting", -192927013);
        setIntField(term353832, term353832.getClass(), "cardCategorySetting", 1550154031);
        setIntField(term353832, term353832.getClass(), "cardSortSetting", 929794933);
        setIntField(term353832, term353832.getClass(), "rivalScoreCategorySetting", 1124974525);
        setIntField(term353832, term353832.getClass(), "playedTutorialBit", -1399728021);
        setIntField(term353832, term353832.getClass(), "firstTutorialCancelNum", 369311910);
        setLongField(term353832, term353832.getClass(), "sumTechHighScore", 8498386750016957212L);
        setLongField(term353832, term353832.getClass(), "sumTechBasicHighScore", -4087814619289053925L);
        setLongField(term353832, term353832.getClass(), "sumTechAdvancedHighScore", 550735577844387954L);
        setLongField(term353832, term353832.getClass(), "sumTechExpertHighScore", -4098087857487650019L);
        setLongField(term353832, term353832.getClass(), "sumTechMasterHighScore", -8540357260081267195L);
        setLongField(term353832, term353832.getClass(), "sumTechLunaticHighScore", 2511277422277312604L);
        setLongField(term353832, term353832.getClass(), "sumBattleHighScore", -1326283108444134902L);
        setLongField(term353832, term353832.getClass(), "sumBattleBasicHighScore", -2482590133168222703L);
        setLongField(term353832, term353832.getClass(), "sumBattleAdvancedHighScore", 7215726096333267986L);
        setLongField(term353832, term353832.getClass(), "sumBattleExpertHighScore", -5845367970160504743L);
        setLongField(term353832, term353832.getClass(), "sumBattleMasterHighScore", -5608317949885121502L);
        setLongField(term353832, term353832.getClass(), "sumBattleLunaticHighScore", 4529705821322662896L);
        setField(term353832, term353832.getClass(), "eventWatchedDate", "oVZdqQrCbw");
        setField(term353832, term353832.getClass(), "cmEventWatchedDate", "dXZfZXigZR");
        setField(term353832, term353832.getClass(), "firstGameId", "wOpAEpIMxP");
        setField(term353832, term353832.getClass(), "firstRomVersion", "lrzEdUaLrx");
        setField(term353832, term353832.getClass(), "firstDataVersion", "tghVfWigyu");
        setField(term353832, term353832.getClass(), "firstPlayDate", "JEyeFaBBGe");
        setField(term353832, term353832.getClass(), "lastGameId", "pglIMewjpJ");
        setField(term353832, term353832.getClass(), "lastRomVersion", "FkakRUeGZD");
        setField(term353832, term353832.getClass(), "lastDataVersion", "QUxtjUWjeq");
        setField(term353832, term353832.getClass(), "compatibleCmVersion", "CDEnFGJOHK");
        setField(term353832, term353832.getClass(), "lastPlayDate", "jLRoRnygxm");
        setIntField(term353832, term353832.getClass(), "lastPlaceId", 11296902);
        setField(term353832, term353832.getClass(), "lastPlaceName", "LIxbjEAGWf");
        setIntField(term353832, term353832.getClass(), "lastRegionId", -225155806);
        setField(term353832, term353832.getClass(), "lastRegionName", "AJsbxxuvPZ");
        setIntField(term353832, term353832.getClass(), "lastAllNetId", -1557465700);
        setField(term353832, term353832.getClass(), "lastClientId", "IqtrSAxvSx");
        setIntField(term353832, term353832.getClass(), "lastUsedDeckId", 549674955);
        setIntField(term353832, term353832.getClass(), "lastPlayMusicLevel", 1093615997);
        setIntField(term353832, term353832.getClass(), "lastEmoneyBrand", 1884250161);
        setField(term353830, term353830.getClass(), "user", term353832);
        setIntField(term353830, term353830.getClass(), "eventId", 360688226);
        setIntField(term353830, term353830.getClass(), "totalTechScore", 1243255681);
        setIntField(term353830, term353830.getClass(), "totalPlatinumScore", 914332222);
        setField(term353830, term353830.getClass(), "techRecordDate", "pmUWlvScDm");
        setBooleanField(term353830, term353830.getClass(), "isRankingRewarded", true);
        setBooleanField(term353830, term353830.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTechRecordDate", argTypes, term353830, args);
    }

};


