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

public class UserData_getSumBattleAdvancedHighScore_199553652738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37992;

    public UserData_getSumBattleAdvancedHighScore_199553652738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term37996 = new Long(2848819812340321742L);
        term37992 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term37994 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term38010 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38011 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38015 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38020 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38021 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38025 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term37992, term37992.getClass(), "id", -5557521111022569289L);
        setLongField(term37994, term37994.getClass(), "id", 508795580601675574L);
        setField(term37994, term37994.getClass(), "extId", term37996);
        setField(term37994, term37994.getClass(), "luid", "TLjhFZbwKO");
        setIntField(term38011, term38011.getClass(), "year", 2022);
        setShortField(term38011, term38011.getClass(), "month", (short) 12);
        setShortField(term38011, term38011.getClass(), "day", (short) 19);
        setField(term38010, term38010.getClass(), "date", term38011);
        setByteField(term38015, term38015.getClass(), "hour", (byte) 11);
        setByteField(term38015, term38015.getClass(), "minute", (byte) 25);
        setByteField(term38015, term38015.getClass(), "second", (byte) 6);
        setIntField(term38015, term38015.getClass(), "nano", 620469872);
        setField(term38010, term38010.getClass(), "time", term38015);
        setField(term37994, term37994.getClass(), "registerTime", term38010);
        setIntField(term38021, term38021.getClass(), "year", 2013);
        setShortField(term38021, term38021.getClass(), "month", (short) 5);
        setShortField(term38021, term38021.getClass(), "day", (short) 3);
        setField(term38020, term38020.getClass(), "date", term38021);
        setByteField(term38025, term38025.getClass(), "hour", (byte) 18);
        setByteField(term38025, term38025.getClass(), "minute", (byte) 52);
        setByteField(term38025, term38025.getClass(), "second", (byte) 15);
        setIntField(term38025, term38025.getClass(), "nano", 241685081);
        setField(term38020, term38020.getClass(), "time", term38025);
        setField(term37994, term37994.getClass(), "accessTime", term38020);
        setField(term37992, term37992.getClass(), "card", term37994);
        setField(term37992, term37992.getClass(), "userName", "nxEbLIApFc");
        setIntField(term37992, term37992.getClass(), "level", -1174141307);
        setIntField(term37992, term37992.getClass(), "reincarnationNum", -1603957392);
        setLongField(term37992, term37992.getClass(), "exp", 3872000207938391416L);
        setLongField(term37992, term37992.getClass(), "point", -1383665096049300821L);
        setLongField(term37992, term37992.getClass(), "totalPoint", 3462550822198292676L);
        setIntField(term37992, term37992.getClass(), "playCount", -287005602);
        setIntField(term37992, term37992.getClass(), "jewelCount", 923353564);
        setIntField(term37992, term37992.getClass(), "totalJewelCount", 2013647768);
        setIntField(term37992, term37992.getClass(), "medalCount", 1706579212);
        setIntField(term37992, term37992.getClass(), "playerRating", -1073781147);
        setIntField(term37992, term37992.getClass(), "highestRating", 138913824);
        setIntField(term37992, term37992.getClass(), "battlePoint", -637767208);
        setIntField(term37992, term37992.getClass(), "bestBattlePoint", 844890845);
        setIntField(term37992, term37992.getClass(), "overDamageBattlePoint", -989538894);
        setBooleanField(term37992, term37992.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term37992, term37992.getClass(), "nameplateId", 1316863342);
        setIntField(term37992, term37992.getClass(), "trophyId", 735033722);
        setIntField(term37992, term37992.getClass(), "cardId", -1409886459);
        setIntField(term37992, term37992.getClass(), "characterId", 666379561);
        setIntField(term37992, term37992.getClass(), "characterVoiceNo", 1071163503);
        setIntField(term37992, term37992.getClass(), "tabSetting", -1507726422);
        setIntField(term37992, term37992.getClass(), "tabSortSetting", 171429081);
        setIntField(term37992, term37992.getClass(), "cardCategorySetting", 1552107519);
        setIntField(term37992, term37992.getClass(), "cardSortSetting", -1952294830);
        setIntField(term37992, term37992.getClass(), "rivalScoreCategorySetting", -1756012081);
        setIntField(term37992, term37992.getClass(), "playedTutorialBit", 879317718);
        setIntField(term37992, term37992.getClass(), "firstTutorialCancelNum", -1205568351);
        setLongField(term37992, term37992.getClass(), "sumTechHighScore", 4366106993552057355L);
        setLongField(term37992, term37992.getClass(), "sumTechBasicHighScore", -1403100578084357233L);
        setLongField(term37992, term37992.getClass(), "sumTechAdvancedHighScore", -5878958370799790472L);
        setLongField(term37992, term37992.getClass(), "sumTechExpertHighScore", 1801020535033823321L);
        setLongField(term37992, term37992.getClass(), "sumTechMasterHighScore", 7022012163884672746L);
        setLongField(term37992, term37992.getClass(), "sumTechLunaticHighScore", -5668489101686002218L);
        setLongField(term37992, term37992.getClass(), "sumBattleHighScore", 8713229483070783866L);
        setLongField(term37992, term37992.getClass(), "sumBattleBasicHighScore", 7598786125321910224L);
        setLongField(term37992, term37992.getClass(), "sumBattleAdvancedHighScore", 2008211696778135261L);
        setLongField(term37992, term37992.getClass(), "sumBattleExpertHighScore", 915665059113544268L);
        setLongField(term37992, term37992.getClass(), "sumBattleMasterHighScore", -3380318205328241107L);
        setLongField(term37992, term37992.getClass(), "sumBattleLunaticHighScore", -3551818295265883412L);
        setField(term37992, term37992.getClass(), "eventWatchedDate", "zzsdNZhejE");
        setField(term37992, term37992.getClass(), "cmEventWatchedDate", "ILoodMZrgR");
        setField(term37992, term37992.getClass(), "firstGameId", "XQiKmsCacK");
        setField(term37992, term37992.getClass(), "firstRomVersion", "cTCixEbHYT");
        setField(term37992, term37992.getClass(), "firstDataVersion", "bqKksqtAdT");
        setField(term37992, term37992.getClass(), "firstPlayDate", "jAIAdEmULK");
        setField(term37992, term37992.getClass(), "lastGameId", "EuAshkmbna");
        setField(term37992, term37992.getClass(), "lastRomVersion", "JwQlbBbGJR");
        setField(term37992, term37992.getClass(), "lastDataVersion", "HdWLwfVsAM");
        setField(term37992, term37992.getClass(), "compatibleCmVersion", "SxeKEdHXSl");
        setField(term37992, term37992.getClass(), "lastPlayDate", "BCAlJpNjIX");
        setIntField(term37992, term37992.getClass(), "lastPlaceId", -1038188576);
        setField(term37992, term37992.getClass(), "lastPlaceName", "PKClfBAwUr");
        setIntField(term37992, term37992.getClass(), "lastRegionId", -190354157);
        setField(term37992, term37992.getClass(), "lastRegionName", "JqbKrmVEMy");
        setIntField(term37992, term37992.getClass(), "lastAllNetId", 878906837);
        setField(term37992, term37992.getClass(), "lastClientId", "VygCEWaefB");
        setIntField(term37992, term37992.getClass(), "lastUsedDeckId", -1578163757);
        setIntField(term37992, term37992.getClass(), "lastPlayMusicLevel", -1361859122);
        setIntField(term37992, term37992.getClass(), "lastEmoneyBrand", -1130681822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleAdvancedHighScore", argTypes, term37992, args);
    }

};


