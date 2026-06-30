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

public class UserData_getLastPlaceId_181247376453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44337;

    public UserData_getLastPlaceId_181247376453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term44341 = new Long(-8033714905181142681L);
        term44337 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term44339 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term44355 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44356 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44360 = newInstance(Class.forName("java.time.LocalTime"));
        Object term44365 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44366 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44370 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term44337, term44337.getClass(), "id", 8577592614427713625L);
        setLongField(term44339, term44339.getClass(), "id", 6370524950953117569L);
        setField(term44339, term44339.getClass(), "extId", term44341);
        setField(term44339, term44339.getClass(), "luid", "YURcpRjwSt");
        setIntField(term44356, term44356.getClass(), "year", 2024);
        setShortField(term44356, term44356.getClass(), "month", (short) 7);
        setShortField(term44356, term44356.getClass(), "day", (short) 29);
        setField(term44355, term44355.getClass(), "date", term44356);
        setByteField(term44360, term44360.getClass(), "hour", (byte) 19);
        setByteField(term44360, term44360.getClass(), "minute", (byte) 15);
        setByteField(term44360, term44360.getClass(), "second", (byte) 16);
        setIntField(term44360, term44360.getClass(), "nano", 554834199);
        setField(term44355, term44355.getClass(), "time", term44360);
        setField(term44339, term44339.getClass(), "registerTime", term44355);
        setIntField(term44366, term44366.getClass(), "year", 2018);
        setShortField(term44366, term44366.getClass(), "month", (short) 2);
        setShortField(term44366, term44366.getClass(), "day", (short) 13);
        setField(term44365, term44365.getClass(), "date", term44366);
        setByteField(term44370, term44370.getClass(), "hour", (byte) 15);
        setByteField(term44370, term44370.getClass(), "minute", (byte) 1);
        setByteField(term44370, term44370.getClass(), "second", (byte) 45);
        setIntField(term44370, term44370.getClass(), "nano", 380020898);
        setField(term44365, term44365.getClass(), "time", term44370);
        setField(term44339, term44339.getClass(), "accessTime", term44365);
        setField(term44337, term44337.getClass(), "card", term44339);
        setField(term44337, term44337.getClass(), "userName", "SXMdNSGPog");
        setIntField(term44337, term44337.getClass(), "level", -1421272179);
        setIntField(term44337, term44337.getClass(), "reincarnationNum", -2019439660);
        setLongField(term44337, term44337.getClass(), "exp", 3987997174812419775L);
        setLongField(term44337, term44337.getClass(), "point", -313071413817626779L);
        setLongField(term44337, term44337.getClass(), "totalPoint", -460099854831988621L);
        setIntField(term44337, term44337.getClass(), "playCount", 1037621714);
        setIntField(term44337, term44337.getClass(), "jewelCount", 1072685856);
        setIntField(term44337, term44337.getClass(), "totalJewelCount", 1560132742);
        setIntField(term44337, term44337.getClass(), "medalCount", -1289646730);
        setIntField(term44337, term44337.getClass(), "playerRating", 983651082);
        setIntField(term44337, term44337.getClass(), "highestRating", 794411004);
        setIntField(term44337, term44337.getClass(), "battlePoint", 1964107266);
        setIntField(term44337, term44337.getClass(), "bestBattlePoint", -256542569);
        setIntField(term44337, term44337.getClass(), "overDamageBattlePoint", -1936597357);
        setBooleanField(term44337, term44337.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term44337, term44337.getClass(), "nameplateId", -179816637);
        setIntField(term44337, term44337.getClass(), "trophyId", -1304594615);
        setIntField(term44337, term44337.getClass(), "cardId", 1384334359);
        setIntField(term44337, term44337.getClass(), "characterId", -552245510);
        setIntField(term44337, term44337.getClass(), "characterVoiceNo", 1590263959);
        setIntField(term44337, term44337.getClass(), "tabSetting", -203971814);
        setIntField(term44337, term44337.getClass(), "tabSortSetting", -786856127);
        setIntField(term44337, term44337.getClass(), "cardCategorySetting", 891987554);
        setIntField(term44337, term44337.getClass(), "cardSortSetting", 407640701);
        setIntField(term44337, term44337.getClass(), "rivalScoreCategorySetting", -55858757);
        setIntField(term44337, term44337.getClass(), "playedTutorialBit", 1101065297);
        setIntField(term44337, term44337.getClass(), "firstTutorialCancelNum", -110542660);
        setLongField(term44337, term44337.getClass(), "sumTechHighScore", 8567604378841612757L);
        setLongField(term44337, term44337.getClass(), "sumTechBasicHighScore", 4248644875418274020L);
        setLongField(term44337, term44337.getClass(), "sumTechAdvancedHighScore", 2220195077881026021L);
        setLongField(term44337, term44337.getClass(), "sumTechExpertHighScore", -613788131903895980L);
        setLongField(term44337, term44337.getClass(), "sumTechMasterHighScore", -5544764664016667081L);
        setLongField(term44337, term44337.getClass(), "sumTechLunaticHighScore", 2228513255568046812L);
        setLongField(term44337, term44337.getClass(), "sumBattleHighScore", -640045267052655713L);
        setLongField(term44337, term44337.getClass(), "sumBattleBasicHighScore", -2692345938390249037L);
        setLongField(term44337, term44337.getClass(), "sumBattleAdvancedHighScore", -5292926065434569211L);
        setLongField(term44337, term44337.getClass(), "sumBattleExpertHighScore", 346757673772711087L);
        setLongField(term44337, term44337.getClass(), "sumBattleMasterHighScore", -1912308523656007793L);
        setLongField(term44337, term44337.getClass(), "sumBattleLunaticHighScore", 1577272117979272714L);
        setField(term44337, term44337.getClass(), "eventWatchedDate", "vsqwOLpDjj");
        setField(term44337, term44337.getClass(), "cmEventWatchedDate", "rJgXQRsPCl");
        setField(term44337, term44337.getClass(), "firstGameId", "RgqpoBknjN");
        setField(term44337, term44337.getClass(), "firstRomVersion", "nUDhadopHE");
        setField(term44337, term44337.getClass(), "firstDataVersion", "vLrTnQTIPg");
        setField(term44337, term44337.getClass(), "firstPlayDate", "GsXvLZCFtf");
        setField(term44337, term44337.getClass(), "lastGameId", "JqSCTBGSUs");
        setField(term44337, term44337.getClass(), "lastRomVersion", "bZrrPiMnsr");
        setField(term44337, term44337.getClass(), "lastDataVersion", "IeromvfDmz");
        setField(term44337, term44337.getClass(), "compatibleCmVersion", "xJLHPTRSqe");
        setField(term44337, term44337.getClass(), "lastPlayDate", "OIFZYdbUZz");
        setIntField(term44337, term44337.getClass(), "lastPlaceId", 1430629000);
        setField(term44337, term44337.getClass(), "lastPlaceName", "FPablxseTr");
        setIntField(term44337, term44337.getClass(), "lastRegionId", -1684627375);
        setField(term44337, term44337.getClass(), "lastRegionName", "wNndrIQDbr");
        setIntField(term44337, term44337.getClass(), "lastAllNetId", -74479819);
        setField(term44337, term44337.getClass(), "lastClientId", "JiSIFtJnYv");
        setIntField(term44337, term44337.getClass(), "lastUsedDeckId", -1610494666);
        setIntField(term44337, term44337.getClass(), "lastPlayMusicLevel", 564476854);
        setIntField(term44337, term44337.getClass(), "lastEmoneyBrand", 963238257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceId", argTypes, term44337, args);
    }

};


