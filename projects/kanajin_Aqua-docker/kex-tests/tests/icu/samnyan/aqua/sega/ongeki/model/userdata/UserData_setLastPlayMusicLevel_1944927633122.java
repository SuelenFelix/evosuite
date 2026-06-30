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
import java.lang.Integer;

public class UserData_setLastPlayMusicLevel_1944927633122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73988;
     Object term74251;

    public UserData_setLastPlayMusicLevel_1944927633122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term73992 = new Long(-3730936709704460408L);
        term73988 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term73990 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term74006 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74007 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74011 = newInstance(Class.forName("java.time.LocalTime"));
        Object term74016 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74017 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74021 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term73988, term73988.getClass(), "id", 9052872633177963228L);
        setLongField(term73990, term73990.getClass(), "id", 3498870473976116381L);
        setField(term73990, term73990.getClass(), "extId", term73992);
        setField(term73990, term73990.getClass(), "luid", "fmWYICGnwt");
        setIntField(term74007, term74007.getClass(), "year", 2028);
        setShortField(term74007, term74007.getClass(), "month", (short) 7);
        setShortField(term74007, term74007.getClass(), "day", (short) 4);
        setField(term74006, term74006.getClass(), "date", term74007);
        setByteField(term74011, term74011.getClass(), "hour", (byte) 13);
        setByteField(term74011, term74011.getClass(), "minute", (byte) 43);
        setByteField(term74011, term74011.getClass(), "second", (byte) 17);
        setIntField(term74011, term74011.getClass(), "nano", 949713407);
        setField(term74006, term74006.getClass(), "time", term74011);
        setField(term73990, term73990.getClass(), "registerTime", term74006);
        setIntField(term74017, term74017.getClass(), "year", 2013);
        setShortField(term74017, term74017.getClass(), "month", (short) 3);
        setShortField(term74017, term74017.getClass(), "day", (short) 25);
        setField(term74016, term74016.getClass(), "date", term74017);
        setByteField(term74021, term74021.getClass(), "hour", (byte) 16);
        setByteField(term74021, term74021.getClass(), "minute", (byte) 28);
        setByteField(term74021, term74021.getClass(), "second", (byte) 0);
        setIntField(term74021, term74021.getClass(), "nano", 265797826);
        setField(term74016, term74016.getClass(), "time", term74021);
        setField(term73990, term73990.getClass(), "accessTime", term74016);
        setField(term73988, term73988.getClass(), "card", term73990);
        setField(term73988, term73988.getClass(), "userName", "FlZbOFNISk");
        setIntField(term73988, term73988.getClass(), "level", -289676027);
        setIntField(term73988, term73988.getClass(), "reincarnationNum", 1248845256);
        setLongField(term73988, term73988.getClass(), "exp", 4125808103563576764L);
        setLongField(term73988, term73988.getClass(), "point", 5326420816295740567L);
        setLongField(term73988, term73988.getClass(), "totalPoint", -515217973613983289L);
        setIntField(term73988, term73988.getClass(), "playCount", 229418911);
        setIntField(term73988, term73988.getClass(), "jewelCount", -1130854864);
        setIntField(term73988, term73988.getClass(), "totalJewelCount", 1114579008);
        setIntField(term73988, term73988.getClass(), "medalCount", 1460012868);
        setIntField(term73988, term73988.getClass(), "playerRating", -2073192308);
        setIntField(term73988, term73988.getClass(), "highestRating", -2085811126);
        setIntField(term73988, term73988.getClass(), "battlePoint", -2129502819);
        setIntField(term73988, term73988.getClass(), "bestBattlePoint", -1063218440);
        setIntField(term73988, term73988.getClass(), "overDamageBattlePoint", -688177933);
        setBooleanField(term73988, term73988.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term73988, term73988.getClass(), "nameplateId", -566941881);
        setIntField(term73988, term73988.getClass(), "trophyId", 2051356935);
        setIntField(term73988, term73988.getClass(), "cardId", -383329501);
        setIntField(term73988, term73988.getClass(), "characterId", 617819961);
        setIntField(term73988, term73988.getClass(), "characterVoiceNo", -1030437854);
        setIntField(term73988, term73988.getClass(), "tabSetting", 131035705);
        setIntField(term73988, term73988.getClass(), "tabSortSetting", 1345091994);
        setIntField(term73988, term73988.getClass(), "cardCategorySetting", -657987818);
        setIntField(term73988, term73988.getClass(), "cardSortSetting", -211167283);
        setIntField(term73988, term73988.getClass(), "rivalScoreCategorySetting", -1037774699);
        setIntField(term73988, term73988.getClass(), "playedTutorialBit", -851853041);
        setIntField(term73988, term73988.getClass(), "firstTutorialCancelNum", 1501524873);
        setLongField(term73988, term73988.getClass(), "sumTechHighScore", 1865737772535583755L);
        setLongField(term73988, term73988.getClass(), "sumTechBasicHighScore", 7180218348598736937L);
        setLongField(term73988, term73988.getClass(), "sumTechAdvancedHighScore", -4078605882460245000L);
        setLongField(term73988, term73988.getClass(), "sumTechExpertHighScore", 5979904252027515883L);
        setLongField(term73988, term73988.getClass(), "sumTechMasterHighScore", 4082344193051454677L);
        setLongField(term73988, term73988.getClass(), "sumTechLunaticHighScore", -777942352389232708L);
        setLongField(term73988, term73988.getClass(), "sumBattleHighScore", 730530576174994425L);
        setLongField(term73988, term73988.getClass(), "sumBattleBasicHighScore", -694309572389702668L);
        setLongField(term73988, term73988.getClass(), "sumBattleAdvancedHighScore", 5257435816251102013L);
        setLongField(term73988, term73988.getClass(), "sumBattleExpertHighScore", 2254797667827153109L);
        setLongField(term73988, term73988.getClass(), "sumBattleMasterHighScore", 2060510242405205727L);
        setLongField(term73988, term73988.getClass(), "sumBattleLunaticHighScore", 7247674325364556051L);
        setField(term73988, term73988.getClass(), "eventWatchedDate", "zDtePZrZQH");
        setField(term73988, term73988.getClass(), "cmEventWatchedDate", "YPVZjrbvVl");
        setField(term73988, term73988.getClass(), "firstGameId", "TWsXTUTREq");
        setField(term73988, term73988.getClass(), "firstRomVersion", "tVsPWASlsh");
        setField(term73988, term73988.getClass(), "firstDataVersion", "PjZoebHrvq");
        setField(term73988, term73988.getClass(), "firstPlayDate", "VwpicfUdWr");
        setField(term73988, term73988.getClass(), "lastGameId", "UDKBkeWilS");
        setField(term73988, term73988.getClass(), "lastRomVersion", "bNeNAYRdqb");
        setField(term73988, term73988.getClass(), "lastDataVersion", "dcGBEVfYLI");
        setField(term73988, term73988.getClass(), "compatibleCmVersion", "AbYQkbUCWK");
        setField(term73988, term73988.getClass(), "lastPlayDate", "PjENVjWdrp");
        setIntField(term73988, term73988.getClass(), "lastPlaceId", 92455948);
        setField(term73988, term73988.getClass(), "lastPlaceName", "nNjXJbBqnD");
        setIntField(term73988, term73988.getClass(), "lastRegionId", -1557991371);
        setField(term73988, term73988.getClass(), "lastRegionName", "IPIWZFytSS");
        setIntField(term73988, term73988.getClass(), "lastAllNetId", -951318891);
        setField(term73988, term73988.getClass(), "lastClientId", "BOKRfsJbBj");
        setIntField(term73988, term73988.getClass(), "lastUsedDeckId", 718233611);
        setIntField(term73988, term73988.getClass(), "lastPlayMusicLevel", -2015648096);
        setIntField(term73988, term73988.getClass(), "lastEmoneyBrand", -818525120);
        term74251 = new Integer(2119335779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term74251;
        callMethod(klass, "setLastPlayMusicLevel", argTypes, term73988, args);
    }

};


