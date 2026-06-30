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

public class UserData_setSumBattleExpertHighScore_72091383101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64783;
     Object term65046;

    public UserData_setSumBattleExpertHighScore_72091383101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term64787 = new Long(-4360569253593381888L);
        term64783 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term64785 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term64801 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64802 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64806 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64811 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64812 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64816 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term64783, term64783.getClass(), "id", -330187935331339969L);
        setLongField(term64785, term64785.getClass(), "id", 7423170877012730750L);
        setField(term64785, term64785.getClass(), "extId", term64787);
        setField(term64785, term64785.getClass(), "luid", "MwiFLgdSDA");
        setIntField(term64802, term64802.getClass(), "year", 2017);
        setShortField(term64802, term64802.getClass(), "month", (short) 1);
        setShortField(term64802, term64802.getClass(), "day", (short) 3);
        setField(term64801, term64801.getClass(), "date", term64802);
        setByteField(term64806, term64806.getClass(), "hour", (byte) 14);
        setByteField(term64806, term64806.getClass(), "minute", (byte) 1);
        setByteField(term64806, term64806.getClass(), "second", (byte) 1);
        setIntField(term64806, term64806.getClass(), "nano", 827128674);
        setField(term64801, term64801.getClass(), "time", term64806);
        setField(term64785, term64785.getClass(), "registerTime", term64801);
        setIntField(term64812, term64812.getClass(), "year", 2022);
        setShortField(term64812, term64812.getClass(), "month", (short) 9);
        setShortField(term64812, term64812.getClass(), "day", (short) 3);
        setField(term64811, term64811.getClass(), "date", term64812);
        setByteField(term64816, term64816.getClass(), "hour", (byte) 22);
        setByteField(term64816, term64816.getClass(), "minute", (byte) 31);
        setByteField(term64816, term64816.getClass(), "second", (byte) 44);
        setIntField(term64816, term64816.getClass(), "nano", 798112760);
        setField(term64811, term64811.getClass(), "time", term64816);
        setField(term64785, term64785.getClass(), "accessTime", term64811);
        setField(term64783, term64783.getClass(), "card", term64785);
        setField(term64783, term64783.getClass(), "userName", "VhnistEcCA");
        setIntField(term64783, term64783.getClass(), "level", -2041713971);
        setIntField(term64783, term64783.getClass(), "reincarnationNum", 752002755);
        setLongField(term64783, term64783.getClass(), "exp", 7803973570843908106L);
        setLongField(term64783, term64783.getClass(), "point", -8551144578264531851L);
        setLongField(term64783, term64783.getClass(), "totalPoint", -6175399542762744541L);
        setIntField(term64783, term64783.getClass(), "playCount", -975157064);
        setIntField(term64783, term64783.getClass(), "jewelCount", -378255267);
        setIntField(term64783, term64783.getClass(), "totalJewelCount", -1205835103);
        setIntField(term64783, term64783.getClass(), "medalCount", -2022370596);
        setIntField(term64783, term64783.getClass(), "playerRating", 856428856);
        setIntField(term64783, term64783.getClass(), "highestRating", 1295040350);
        setIntField(term64783, term64783.getClass(), "battlePoint", 1744402926);
        setIntField(term64783, term64783.getClass(), "bestBattlePoint", -68148707);
        setIntField(term64783, term64783.getClass(), "overDamageBattlePoint", -487634357);
        setBooleanField(term64783, term64783.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term64783, term64783.getClass(), "nameplateId", 52605389);
        setIntField(term64783, term64783.getClass(), "trophyId", -769585004);
        setIntField(term64783, term64783.getClass(), "cardId", 483184455);
        setIntField(term64783, term64783.getClass(), "characterId", -1969040570);
        setIntField(term64783, term64783.getClass(), "characterVoiceNo", 1627123408);
        setIntField(term64783, term64783.getClass(), "tabSetting", 782600956);
        setIntField(term64783, term64783.getClass(), "tabSortSetting", -1051453067);
        setIntField(term64783, term64783.getClass(), "cardCategorySetting", -865849681);
        setIntField(term64783, term64783.getClass(), "cardSortSetting", -1554795442);
        setIntField(term64783, term64783.getClass(), "rivalScoreCategorySetting", 1486110844);
        setIntField(term64783, term64783.getClass(), "playedTutorialBit", 1811211444);
        setIntField(term64783, term64783.getClass(), "firstTutorialCancelNum", -1188357817);
        setLongField(term64783, term64783.getClass(), "sumTechHighScore", 29485421867077167L);
        setLongField(term64783, term64783.getClass(), "sumTechBasicHighScore", -7381251249931678452L);
        setLongField(term64783, term64783.getClass(), "sumTechAdvancedHighScore", 775304117546862589L);
        setLongField(term64783, term64783.getClass(), "sumTechExpertHighScore", -4520444483838062371L);
        setLongField(term64783, term64783.getClass(), "sumTechMasterHighScore", -8893605933191232807L);
        setLongField(term64783, term64783.getClass(), "sumTechLunaticHighScore", -3893597296102674689L);
        setLongField(term64783, term64783.getClass(), "sumBattleHighScore", 1968564047271987662L);
        setLongField(term64783, term64783.getClass(), "sumBattleBasicHighScore", 3358595188795083828L);
        setLongField(term64783, term64783.getClass(), "sumBattleAdvancedHighScore", -2657370804250344298L);
        setLongField(term64783, term64783.getClass(), "sumBattleExpertHighScore", 7829010818183645401L);
        setLongField(term64783, term64783.getClass(), "sumBattleMasterHighScore", 1440127173650606212L);
        setLongField(term64783, term64783.getClass(), "sumBattleLunaticHighScore", -4277660344437377425L);
        setField(term64783, term64783.getClass(), "eventWatchedDate", "hlPKLObFBU");
        setField(term64783, term64783.getClass(), "cmEventWatchedDate", "oNGVAyjCob");
        setField(term64783, term64783.getClass(), "firstGameId", "lzqPLDonds");
        setField(term64783, term64783.getClass(), "firstRomVersion", "gCFzBxPZKw");
        setField(term64783, term64783.getClass(), "firstDataVersion", "YNVbzJpOdk");
        setField(term64783, term64783.getClass(), "firstPlayDate", "CjPfMVeNPm");
        setField(term64783, term64783.getClass(), "lastGameId", "TeqSJDWXQD");
        setField(term64783, term64783.getClass(), "lastRomVersion", "XNgNLbjmim");
        setField(term64783, term64783.getClass(), "lastDataVersion", "InNyZMCrst");
        setField(term64783, term64783.getClass(), "compatibleCmVersion", "llSJDzNeEq");
        setField(term64783, term64783.getClass(), "lastPlayDate", "YIDNFdhfGO");
        setIntField(term64783, term64783.getClass(), "lastPlaceId", 800428961);
        setField(term64783, term64783.getClass(), "lastPlaceName", "adNbqunmox");
        setIntField(term64783, term64783.getClass(), "lastRegionId", 1035639807);
        setField(term64783, term64783.getClass(), "lastRegionName", "ImSBmTIdsP");
        setIntField(term64783, term64783.getClass(), "lastAllNetId", 1255067608);
        setField(term64783, term64783.getClass(), "lastClientId", "KDKQhbiclt");
        setIntField(term64783, term64783.getClass(), "lastUsedDeckId", -1085076149);
        setIntField(term64783, term64783.getClass(), "lastPlayMusicLevel", 2037214602);
        setIntField(term64783, term64783.getClass(), "lastEmoneyBrand", 1791859428);
        term65046 = new Long(-3580500087222234204L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term65046;
        callMethod(klass, "setSumBattleExpertHighScore", argTypes, term64783, args);
    }

};


