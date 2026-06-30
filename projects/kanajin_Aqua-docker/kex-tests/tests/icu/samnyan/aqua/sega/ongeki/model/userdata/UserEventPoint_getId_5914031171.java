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

public class UserEventPoint_getId_5914031171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381969;

    public UserEventPoint_getId_5914031171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term381975 = new Long(-7163612258041042650L);
        term381969 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint"));
        Object term381971 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term381973 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term381989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term381990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term381994 = newInstance(Class.forName("java.time.LocalTime"));
        Object term381999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term382000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term382004 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term381969, term381969.getClass(), "id", 4025839179112449760L);
        setLongField(term381971, term381971.getClass(), "id", -5053337520207618409L);
        setLongField(term381973, term381973.getClass(), "id", -6996764937345690480L);
        setField(term381973, term381973.getClass(), "extId", term381975);
        setField(term381973, term381973.getClass(), "luid", "gMxbLZZDpB");
        setIntField(term381990, term381990.getClass(), "year", 2029);
        setShortField(term381990, term381990.getClass(), "month", (short) 4);
        setShortField(term381990, term381990.getClass(), "day", (short) 13);
        setField(term381989, term381989.getClass(), "date", term381990);
        setByteField(term381994, term381994.getClass(), "hour", (byte) 13);
        setByteField(term381994, term381994.getClass(), "minute", (byte) 52);
        setByteField(term381994, term381994.getClass(), "second", (byte) 32);
        setIntField(term381994, term381994.getClass(), "nano", 194695575);
        setField(term381989, term381989.getClass(), "time", term381994);
        setField(term381973, term381973.getClass(), "registerTime", term381989);
        setIntField(term382000, term382000.getClass(), "year", 2024);
        setShortField(term382000, term382000.getClass(), "month", (short) 4);
        setShortField(term382000, term382000.getClass(), "day", (short) 30);
        setField(term381999, term381999.getClass(), "date", term382000);
        setByteField(term382004, term382004.getClass(), "hour", (byte) 23);
        setByteField(term382004, term382004.getClass(), "minute", (byte) 23);
        setByteField(term382004, term382004.getClass(), "second", (byte) 51);
        setIntField(term382004, term382004.getClass(), "nano", 322567808);
        setField(term381999, term381999.getClass(), "time", term382004);
        setField(term381973, term381973.getClass(), "accessTime", term381999);
        setField(term381971, term381971.getClass(), "card", term381973);
        setField(term381971, term381971.getClass(), "userName", "hdvmRLhlom");
        setIntField(term381971, term381971.getClass(), "level", 72471841);
        setIntField(term381971, term381971.getClass(), "reincarnationNum", -1069719589);
        setLongField(term381971, term381971.getClass(), "exp", 6930234158311657785L);
        setLongField(term381971, term381971.getClass(), "point", 1928654995374602743L);
        setLongField(term381971, term381971.getClass(), "totalPoint", 756600262187398965L);
        setIntField(term381971, term381971.getClass(), "playCount", -765471890);
        setIntField(term381971, term381971.getClass(), "jewelCount", 1825311947);
        setIntField(term381971, term381971.getClass(), "totalJewelCount", -1105449972);
        setIntField(term381971, term381971.getClass(), "medalCount", 1908576946);
        setIntField(term381971, term381971.getClass(), "playerRating", -188889317);
        setIntField(term381971, term381971.getClass(), "highestRating", 295942465);
        setIntField(term381971, term381971.getClass(), "battlePoint", -26948309);
        setIntField(term381971, term381971.getClass(), "bestBattlePoint", 1772104963);
        setIntField(term381971, term381971.getClass(), "overDamageBattlePoint", -1171214914);
        setBooleanField(term381971, term381971.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term381971, term381971.getClass(), "nameplateId", 142978446);
        setIntField(term381971, term381971.getClass(), "trophyId", -1898586141);
        setIntField(term381971, term381971.getClass(), "cardId", 1510115325);
        setIntField(term381971, term381971.getClass(), "characterId", 1337727683);
        setIntField(term381971, term381971.getClass(), "characterVoiceNo", -1462248460);
        setIntField(term381971, term381971.getClass(), "tabSetting", 2091166986);
        setIntField(term381971, term381971.getClass(), "tabSortSetting", 21363080);
        setIntField(term381971, term381971.getClass(), "cardCategorySetting", 825935246);
        setIntField(term381971, term381971.getClass(), "cardSortSetting", 2074480834);
        setIntField(term381971, term381971.getClass(), "rivalScoreCategorySetting", 384023737);
        setIntField(term381971, term381971.getClass(), "playedTutorialBit", -1859518583);
        setIntField(term381971, term381971.getClass(), "firstTutorialCancelNum", -306770584);
        setLongField(term381971, term381971.getClass(), "sumTechHighScore", -2589449296137368695L);
        setLongField(term381971, term381971.getClass(), "sumTechBasicHighScore", 7871885925263688061L);
        setLongField(term381971, term381971.getClass(), "sumTechAdvancedHighScore", -5764401850133917185L);
        setLongField(term381971, term381971.getClass(), "sumTechExpertHighScore", 4388056194831743874L);
        setLongField(term381971, term381971.getClass(), "sumTechMasterHighScore", -931006396137266599L);
        setLongField(term381971, term381971.getClass(), "sumTechLunaticHighScore", -5178470082364175146L);
        setLongField(term381971, term381971.getClass(), "sumBattleHighScore", 8861739414938989094L);
        setLongField(term381971, term381971.getClass(), "sumBattleBasicHighScore", -5916089547632561902L);
        setLongField(term381971, term381971.getClass(), "sumBattleAdvancedHighScore", -5347990164689982461L);
        setLongField(term381971, term381971.getClass(), "sumBattleExpertHighScore", -2473614700841416199L);
        setLongField(term381971, term381971.getClass(), "sumBattleMasterHighScore", 2190363232337856608L);
        setLongField(term381971, term381971.getClass(), "sumBattleLunaticHighScore", -2848191048950026275L);
        setField(term381971, term381971.getClass(), "eventWatchedDate", "WdGxWcXBZq");
        setField(term381971, term381971.getClass(), "cmEventWatchedDate", "FlolkfSElU");
        setField(term381971, term381971.getClass(), "firstGameId", "FaAfHgzwbs");
        setField(term381971, term381971.getClass(), "firstRomVersion", "hcBFEnHicj");
        setField(term381971, term381971.getClass(), "firstDataVersion", "zGsMSWuMij");
        setField(term381971, term381971.getClass(), "firstPlayDate", "CAgIQeYnEm");
        setField(term381971, term381971.getClass(), "lastGameId", "GAgfHWVClf");
        setField(term381971, term381971.getClass(), "lastRomVersion", "ePURbxyGeJ");
        setField(term381971, term381971.getClass(), "lastDataVersion", "WwIfmxOzaH");
        setField(term381971, term381971.getClass(), "compatibleCmVersion", "qjNhqeHmFG");
        setField(term381971, term381971.getClass(), "lastPlayDate", "EmuDBitfph");
        setIntField(term381971, term381971.getClass(), "lastPlaceId", -1731241663);
        setField(term381971, term381971.getClass(), "lastPlaceName", "wbDuXsHbEA");
        setIntField(term381971, term381971.getClass(), "lastRegionId", -143098523);
        setField(term381971, term381971.getClass(), "lastRegionName", "mLaHofNBGK");
        setIntField(term381971, term381971.getClass(), "lastAllNetId", -1846191260);
        setField(term381971, term381971.getClass(), "lastClientId", "keQLvRZJoD");
        setIntField(term381971, term381971.getClass(), "lastUsedDeckId", 607340723);
        setIntField(term381971, term381971.getClass(), "lastPlayMusicLevel", 1533572308);
        setIntField(term381971, term381971.getClass(), "lastEmoneyBrand", -941897680);
        setField(term381969, term381969.getClass(), "user", term381971);
        setIntField(term381969, term381969.getClass(), "eventId", 1958863298);
        setLongField(term381969, term381969.getClass(), "point", 4661851203340840585L);
        setBooleanField(term381969, term381969.getClass(), "isRankingRewarded", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term381969, args);
    }

};


