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

public class UserData_getPlayCount_16214232138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25302;

    public UserData_getPlayCount_16214232138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25306 = new Long(3825396310311739952L);
        term25302 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term25304 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term25320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25335 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term25302, term25302.getClass(), "id", -1884609063652624817L);
        setLongField(term25304, term25304.getClass(), "id", 4110677574531044171L);
        setField(term25304, term25304.getClass(), "extId", term25306);
        setField(term25304, term25304.getClass(), "luid", "TuLgwTZsPP");
        setIntField(term25321, term25321.getClass(), "year", 2026);
        setShortField(term25321, term25321.getClass(), "month", (short) 10);
        setShortField(term25321, term25321.getClass(), "day", (short) 19);
        setField(term25320, term25320.getClass(), "date", term25321);
        setByteField(term25325, term25325.getClass(), "hour", (byte) 7);
        setByteField(term25325, term25325.getClass(), "minute", (byte) 22);
        setByteField(term25325, term25325.getClass(), "second", (byte) 11);
        setIntField(term25325, term25325.getClass(), "nano", 17846677);
        setField(term25320, term25320.getClass(), "time", term25325);
        setField(term25304, term25304.getClass(), "registerTime", term25320);
        setIntField(term25331, term25331.getClass(), "year", 2018);
        setShortField(term25331, term25331.getClass(), "month", (short) 10);
        setShortField(term25331, term25331.getClass(), "day", (short) 17);
        setField(term25330, term25330.getClass(), "date", term25331);
        setByteField(term25335, term25335.getClass(), "hour", (byte) 5);
        setByteField(term25335, term25335.getClass(), "minute", (byte) 10);
        setByteField(term25335, term25335.getClass(), "second", (byte) 23);
        setIntField(term25335, term25335.getClass(), "nano", 571520422);
        setField(term25330, term25330.getClass(), "time", term25335);
        setField(term25304, term25304.getClass(), "accessTime", term25330);
        setField(term25302, term25302.getClass(), "card", term25304);
        setField(term25302, term25302.getClass(), "userName", "KoasxTJGpx");
        setIntField(term25302, term25302.getClass(), "level", -1667787735);
        setIntField(term25302, term25302.getClass(), "reincarnationNum", 1841765799);
        setLongField(term25302, term25302.getClass(), "exp", -7231877484121205165L);
        setLongField(term25302, term25302.getClass(), "point", 3571859690258686344L);
        setLongField(term25302, term25302.getClass(), "totalPoint", -3259323558419605103L);
        setIntField(term25302, term25302.getClass(), "playCount", 72160200);
        setIntField(term25302, term25302.getClass(), "jewelCount", -1870567623);
        setIntField(term25302, term25302.getClass(), "totalJewelCount", -1442923471);
        setIntField(term25302, term25302.getClass(), "medalCount", -434247549);
        setIntField(term25302, term25302.getClass(), "playerRating", 1246505552);
        setIntField(term25302, term25302.getClass(), "highestRating", -1456497810);
        setIntField(term25302, term25302.getClass(), "battlePoint", 61954667);
        setIntField(term25302, term25302.getClass(), "bestBattlePoint", -919022885);
        setIntField(term25302, term25302.getClass(), "overDamageBattlePoint", -1836286878);
        setBooleanField(term25302, term25302.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term25302, term25302.getClass(), "nameplateId", 276336694);
        setIntField(term25302, term25302.getClass(), "trophyId", 1627938506);
        setIntField(term25302, term25302.getClass(), "cardId", 386284750);
        setIntField(term25302, term25302.getClass(), "characterId", 906856023);
        setIntField(term25302, term25302.getClass(), "characterVoiceNo", 198857801);
        setIntField(term25302, term25302.getClass(), "tabSetting", 1342884142);
        setIntField(term25302, term25302.getClass(), "tabSortSetting", -1454325068);
        setIntField(term25302, term25302.getClass(), "cardCategorySetting", 346714653);
        setIntField(term25302, term25302.getClass(), "cardSortSetting", 2121928697);
        setIntField(term25302, term25302.getClass(), "rivalScoreCategorySetting", -1741056571);
        setIntField(term25302, term25302.getClass(), "playedTutorialBit", 522501050);
        setIntField(term25302, term25302.getClass(), "firstTutorialCancelNum", 125432890);
        setLongField(term25302, term25302.getClass(), "sumTechHighScore", 7299361469288644847L);
        setLongField(term25302, term25302.getClass(), "sumTechBasicHighScore", -5822755741902532021L);
        setLongField(term25302, term25302.getClass(), "sumTechAdvancedHighScore", 3092709067387780151L);
        setLongField(term25302, term25302.getClass(), "sumTechExpertHighScore", -5996777564331234572L);
        setLongField(term25302, term25302.getClass(), "sumTechMasterHighScore", -218745825074249415L);
        setLongField(term25302, term25302.getClass(), "sumTechLunaticHighScore", -4912367223635767530L);
        setLongField(term25302, term25302.getClass(), "sumBattleHighScore", 5307759455220911721L);
        setLongField(term25302, term25302.getClass(), "sumBattleBasicHighScore", 8447690702287486582L);
        setLongField(term25302, term25302.getClass(), "sumBattleAdvancedHighScore", 6553325891603936420L);
        setLongField(term25302, term25302.getClass(), "sumBattleExpertHighScore", -2813353909483819403L);
        setLongField(term25302, term25302.getClass(), "sumBattleMasterHighScore", -1960938531726773973L);
        setLongField(term25302, term25302.getClass(), "sumBattleLunaticHighScore", -4845114630136242760L);
        setField(term25302, term25302.getClass(), "eventWatchedDate", "ceGeARYMoa");
        setField(term25302, term25302.getClass(), "cmEventWatchedDate", "fFWllaiFvh");
        setField(term25302, term25302.getClass(), "firstGameId", "PFTdEDSbvZ");
        setField(term25302, term25302.getClass(), "firstRomVersion", "TbiwoiebNe");
        setField(term25302, term25302.getClass(), "firstDataVersion", "laTITSWZuc");
        setField(term25302, term25302.getClass(), "firstPlayDate", "fkzRpxlAqS");
        setField(term25302, term25302.getClass(), "lastGameId", "VYvbTGKslj");
        setField(term25302, term25302.getClass(), "lastRomVersion", "owLqDDnwZA");
        setField(term25302, term25302.getClass(), "lastDataVersion", "eBcTbweeYp");
        setField(term25302, term25302.getClass(), "compatibleCmVersion", "drcmjfQUDq");
        setField(term25302, term25302.getClass(), "lastPlayDate", "GjdWUoUSyA");
        setIntField(term25302, term25302.getClass(), "lastPlaceId", -197740561);
        setField(term25302, term25302.getClass(), "lastPlaceName", "YEkxWsWaUl");
        setIntField(term25302, term25302.getClass(), "lastRegionId", -1811706962);
        setField(term25302, term25302.getClass(), "lastRegionName", "RINhPkhhct");
        setIntField(term25302, term25302.getClass(), "lastAllNetId", -1242133071);
        setField(term25302, term25302.getClass(), "lastClientId", "vjNPcTSqmS");
        setIntField(term25302, term25302.getClass(), "lastUsedDeckId", -455052015);
        setIntField(term25302, term25302.getClass(), "lastPlayMusicLevel", -1322797287);
        setIntField(term25302, term25302.getClass(), "lastEmoneyBrand", -615198242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term25302, args);
    }

};


