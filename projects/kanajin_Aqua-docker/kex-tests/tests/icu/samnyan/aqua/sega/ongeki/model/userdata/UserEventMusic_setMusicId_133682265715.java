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

public class UserEventMusic_setMusicId_133682265715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376263;
     Object term376547;

    public UserEventMusic_setMusicId_133682265715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term376269 = new Long(7654605795400256601L);
        term376263 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term376265 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term376267 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term376283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term376284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term376288 = newInstance(Class.forName("java.time.LocalTime"));
        Object term376293 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term376294 = newInstance(Class.forName("java.time.LocalDate"));
        Object term376298 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term376263, term376263.getClass(), "id", 735620881134269060L);
        setLongField(term376265, term376265.getClass(), "id", 2132036496252149690L);
        setLongField(term376267, term376267.getClass(), "id", -7416961070977395924L);
        setField(term376267, term376267.getClass(), "extId", term376269);
        setField(term376267, term376267.getClass(), "luid", "xEVXQOoFCD");
        setIntField(term376284, term376284.getClass(), "year", 2016);
        setShortField(term376284, term376284.getClass(), "month", (short) 10);
        setShortField(term376284, term376284.getClass(), "day", (short) 5);
        setField(term376283, term376283.getClass(), "date", term376284);
        setByteField(term376288, term376288.getClass(), "hour", (byte) 14);
        setByteField(term376288, term376288.getClass(), "minute", (byte) 46);
        setByteField(term376288, term376288.getClass(), "second", (byte) 15);
        setIntField(term376288, term376288.getClass(), "nano", 906066268);
        setField(term376283, term376283.getClass(), "time", term376288);
        setField(term376267, term376267.getClass(), "registerTime", term376283);
        setIntField(term376294, term376294.getClass(), "year", 2010);
        setShortField(term376294, term376294.getClass(), "month", (short) 5);
        setShortField(term376294, term376294.getClass(), "day", (short) 30);
        setField(term376293, term376293.getClass(), "date", term376294);
        setByteField(term376298, term376298.getClass(), "hour", (byte) 3);
        setByteField(term376298, term376298.getClass(), "minute", (byte) 54);
        setByteField(term376298, term376298.getClass(), "second", (byte) 30);
        setIntField(term376298, term376298.getClass(), "nano", 431489936);
        setField(term376293, term376293.getClass(), "time", term376298);
        setField(term376267, term376267.getClass(), "accessTime", term376293);
        setField(term376265, term376265.getClass(), "card", term376267);
        setField(term376265, term376265.getClass(), "userName", "CwIhrSJtCq");
        setIntField(term376265, term376265.getClass(), "level", 1979269544);
        setIntField(term376265, term376265.getClass(), "reincarnationNum", -1290263757);
        setLongField(term376265, term376265.getClass(), "exp", 4260446475880284785L);
        setLongField(term376265, term376265.getClass(), "point", -1007884636208994981L);
        setLongField(term376265, term376265.getClass(), "totalPoint", -6044866680498942816L);
        setIntField(term376265, term376265.getClass(), "playCount", -1166220209);
        setIntField(term376265, term376265.getClass(), "jewelCount", 1798982947);
        setIntField(term376265, term376265.getClass(), "totalJewelCount", 1828679684);
        setIntField(term376265, term376265.getClass(), "medalCount", 621490292);
        setIntField(term376265, term376265.getClass(), "playerRating", 306444144);
        setIntField(term376265, term376265.getClass(), "highestRating", -1287950656);
        setIntField(term376265, term376265.getClass(), "battlePoint", 171305626);
        setIntField(term376265, term376265.getClass(), "bestBattlePoint", 39307857);
        setIntField(term376265, term376265.getClass(), "overDamageBattlePoint", 1419266059);
        setBooleanField(term376265, term376265.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term376265, term376265.getClass(), "nameplateId", 1713027653);
        setIntField(term376265, term376265.getClass(), "trophyId", -97000200);
        setIntField(term376265, term376265.getClass(), "cardId", 916959396);
        setIntField(term376265, term376265.getClass(), "characterId", 2057895700);
        setIntField(term376265, term376265.getClass(), "characterVoiceNo", -2081175978);
        setIntField(term376265, term376265.getClass(), "tabSetting", -2031738424);
        setIntField(term376265, term376265.getClass(), "tabSortSetting", 1831315216);
        setIntField(term376265, term376265.getClass(), "cardCategorySetting", 1534865870);
        setIntField(term376265, term376265.getClass(), "cardSortSetting", 706529201);
        setIntField(term376265, term376265.getClass(), "rivalScoreCategorySetting", 469466508);
        setIntField(term376265, term376265.getClass(), "playedTutorialBit", -296469586);
        setIntField(term376265, term376265.getClass(), "firstTutorialCancelNum", 1841745315);
        setLongField(term376265, term376265.getClass(), "sumTechHighScore", -3408908438251213194L);
        setLongField(term376265, term376265.getClass(), "sumTechBasicHighScore", -589496547646817026L);
        setLongField(term376265, term376265.getClass(), "sumTechAdvancedHighScore", 5732492339862585525L);
        setLongField(term376265, term376265.getClass(), "sumTechExpertHighScore", 177162949824848214L);
        setLongField(term376265, term376265.getClass(), "sumTechMasterHighScore", -7537753314482826818L);
        setLongField(term376265, term376265.getClass(), "sumTechLunaticHighScore", 2073733651057051605L);
        setLongField(term376265, term376265.getClass(), "sumBattleHighScore", -2287007726301751408L);
        setLongField(term376265, term376265.getClass(), "sumBattleBasicHighScore", -2587912863662243708L);
        setLongField(term376265, term376265.getClass(), "sumBattleAdvancedHighScore", 2804491714516078498L);
        setLongField(term376265, term376265.getClass(), "sumBattleExpertHighScore", 8659851263700480786L);
        setLongField(term376265, term376265.getClass(), "sumBattleMasterHighScore", 559864834614023243L);
        setLongField(term376265, term376265.getClass(), "sumBattleLunaticHighScore", 3404483869486763223L);
        setField(term376265, term376265.getClass(), "eventWatchedDate", "EhTSgDVPvf");
        setField(term376265, term376265.getClass(), "cmEventWatchedDate", "gUWfbjtftQ");
        setField(term376265, term376265.getClass(), "firstGameId", "mElshzHjgS");
        setField(term376265, term376265.getClass(), "firstRomVersion", "luoDUbItJH");
        setField(term376265, term376265.getClass(), "firstDataVersion", "pLouvmQoQM");
        setField(term376265, term376265.getClass(), "firstPlayDate", "LDXexoFiSf");
        setField(term376265, term376265.getClass(), "lastGameId", "bRekjMRiCb");
        setField(term376265, term376265.getClass(), "lastRomVersion", "KFffcLjyYP");
        setField(term376265, term376265.getClass(), "lastDataVersion", "tJLyYVmtXr");
        setField(term376265, term376265.getClass(), "compatibleCmVersion", "ARtqDamfiW");
        setField(term376265, term376265.getClass(), "lastPlayDate", "TYvtOPkOKB");
        setIntField(term376265, term376265.getClass(), "lastPlaceId", 1499886194);
        setField(term376265, term376265.getClass(), "lastPlaceName", "QyXPOZhljS");
        setIntField(term376265, term376265.getClass(), "lastRegionId", -1219301238);
        setField(term376265, term376265.getClass(), "lastRegionName", "PScfXNamhZ");
        setIntField(term376265, term376265.getClass(), "lastAllNetId", -1199975445);
        setField(term376265, term376265.getClass(), "lastClientId", "aIZQFkeqSV");
        setIntField(term376265, term376265.getClass(), "lastUsedDeckId", -600380109);
        setIntField(term376265, term376265.getClass(), "lastPlayMusicLevel", 681716626);
        setIntField(term376265, term376265.getClass(), "lastEmoneyBrand", 439827460);
        setField(term376263, term376263.getClass(), "user", term376265);
        setIntField(term376263, term376263.getClass(), "eventId", -668064849);
        setIntField(term376263, term376263.getClass(), "type", 1600514734);
        setIntField(term376263, term376263.getClass(), "musicId", -895791440);
        setIntField(term376263, term376263.getClass(), "level", -1847347540);
        setIntField(term376263, term376263.getClass(), "techScoreMax", -1849199934);
        setIntField(term376263, term376263.getClass(), "platinumScoreMax", -1104624794);
        setField(term376263, term376263.getClass(), "techRecordDate", "xxIbflesWW");
        setBooleanField(term376263, term376263.getClass(), "isTechNewRecord", true);
        term376547 = new Integer(-1908896748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term376547;
        callMethod(klass, "setMusicId", argTypes, term376263, args);
    }

};


