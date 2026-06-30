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

public class UserData_setFirstRomVersion_937343349107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67393;

    public UserData_setFirstRomVersion_937343349107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term67397 = new Long(-7278883608542636188L);
        term67393 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term67395 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term67411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67416 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67426 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term67393, term67393.getClass(), "id", -1616865027789487667L);
        setLongField(term67395, term67395.getClass(), "id", 2204129642286303189L);
        setField(term67395, term67395.getClass(), "extId", term67397);
        setField(term67395, term67395.getClass(), "luid", "ADhlvQDtuh");
        setIntField(term67412, term67412.getClass(), "year", 2016);
        setShortField(term67412, term67412.getClass(), "month", (short) 10);
        setShortField(term67412, term67412.getClass(), "day", (short) 12);
        setField(term67411, term67411.getClass(), "date", term67412);
        setByteField(term67416, term67416.getClass(), "hour", (byte) 11);
        setByteField(term67416, term67416.getClass(), "minute", (byte) 25);
        setByteField(term67416, term67416.getClass(), "second", (byte) 37);
        setIntField(term67416, term67416.getClass(), "nano", 215113477);
        setField(term67411, term67411.getClass(), "time", term67416);
        setField(term67395, term67395.getClass(), "registerTime", term67411);
        setIntField(term67422, term67422.getClass(), "year", 2012);
        setShortField(term67422, term67422.getClass(), "month", (short) 12);
        setShortField(term67422, term67422.getClass(), "day", (short) 10);
        setField(term67421, term67421.getClass(), "date", term67422);
        setByteField(term67426, term67426.getClass(), "hour", (byte) 6);
        setByteField(term67426, term67426.getClass(), "minute", (byte) 26);
        setByteField(term67426, term67426.getClass(), "second", (byte) 38);
        setIntField(term67426, term67426.getClass(), "nano", 934336730);
        setField(term67421, term67421.getClass(), "time", term67426);
        setField(term67395, term67395.getClass(), "accessTime", term67421);
        setField(term67393, term67393.getClass(), "card", term67395);
        setField(term67393, term67393.getClass(), "userName", "rvUfMhtNrD");
        setIntField(term67393, term67393.getClass(), "level", 1691425223);
        setIntField(term67393, term67393.getClass(), "reincarnationNum", 2086385537);
        setLongField(term67393, term67393.getClass(), "exp", -7650346959035604834L);
        setLongField(term67393, term67393.getClass(), "point", 8872844183222227244L);
        setLongField(term67393, term67393.getClass(), "totalPoint", 870803540234717320L);
        setIntField(term67393, term67393.getClass(), "playCount", -898458301);
        setIntField(term67393, term67393.getClass(), "jewelCount", -1752896);
        setIntField(term67393, term67393.getClass(), "totalJewelCount", -1202458563);
        setIntField(term67393, term67393.getClass(), "medalCount", -974221589);
        setIntField(term67393, term67393.getClass(), "playerRating", -167704667);
        setIntField(term67393, term67393.getClass(), "highestRating", -820617926);
        setIntField(term67393, term67393.getClass(), "battlePoint", -1871142929);
        setIntField(term67393, term67393.getClass(), "bestBattlePoint", -1594964553);
        setIntField(term67393, term67393.getClass(), "overDamageBattlePoint", -1839071263);
        setBooleanField(term67393, term67393.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term67393, term67393.getClass(), "nameplateId", 1247519674);
        setIntField(term67393, term67393.getClass(), "trophyId", -460205484);
        setIntField(term67393, term67393.getClass(), "cardId", -1144163240);
        setIntField(term67393, term67393.getClass(), "characterId", 2135238175);
        setIntField(term67393, term67393.getClass(), "characterVoiceNo", -407365393);
        setIntField(term67393, term67393.getClass(), "tabSetting", 1408195458);
        setIntField(term67393, term67393.getClass(), "tabSortSetting", 1129173756);
        setIntField(term67393, term67393.getClass(), "cardCategorySetting", 267573446);
        setIntField(term67393, term67393.getClass(), "cardSortSetting", -1319954987);
        setIntField(term67393, term67393.getClass(), "rivalScoreCategorySetting", 701324276);
        setIntField(term67393, term67393.getClass(), "playedTutorialBit", -2141408767);
        setIntField(term67393, term67393.getClass(), "firstTutorialCancelNum", 2033366485);
        setLongField(term67393, term67393.getClass(), "sumTechHighScore", -5928376730962730330L);
        setLongField(term67393, term67393.getClass(), "sumTechBasicHighScore", 3459456097754089065L);
        setLongField(term67393, term67393.getClass(), "sumTechAdvancedHighScore", -2286727398190518737L);
        setLongField(term67393, term67393.getClass(), "sumTechExpertHighScore", 7624135425106525336L);
        setLongField(term67393, term67393.getClass(), "sumTechMasterHighScore", -1462575889150559403L);
        setLongField(term67393, term67393.getClass(), "sumTechLunaticHighScore", -5162356149587830708L);
        setLongField(term67393, term67393.getClass(), "sumBattleHighScore", -6151803779994618544L);
        setLongField(term67393, term67393.getClass(), "sumBattleBasicHighScore", -3845020763922073283L);
        setLongField(term67393, term67393.getClass(), "sumBattleAdvancedHighScore", -1090914825205410494L);
        setLongField(term67393, term67393.getClass(), "sumBattleExpertHighScore", -886880864570970229L);
        setLongField(term67393, term67393.getClass(), "sumBattleMasterHighScore", -8630203052292608833L);
        setLongField(term67393, term67393.getClass(), "sumBattleLunaticHighScore", 6568177377240200159L);
        setField(term67393, term67393.getClass(), "eventWatchedDate", "tVJNKfGPYg");
        setField(term67393, term67393.getClass(), "cmEventWatchedDate", "AlAUNSOTmH");
        setField(term67393, term67393.getClass(), "firstGameId", "IeuSZGvhvH");
        setField(term67393, term67393.getClass(), "firstRomVersion", "zCejWZdaIc");
        setField(term67393, term67393.getClass(), "firstDataVersion", "aCfzlsgXhB");
        setField(term67393, term67393.getClass(), "firstPlayDate", "HmhoMiUgEv");
        setField(term67393, term67393.getClass(), "lastGameId", "MuJvYyPzjX");
        setField(term67393, term67393.getClass(), "lastRomVersion", "pEZeQhLjKN");
        setField(term67393, term67393.getClass(), "lastDataVersion", "saKRDpPnGD");
        setField(term67393, term67393.getClass(), "compatibleCmVersion", "UesGweYSco");
        setField(term67393, term67393.getClass(), "lastPlayDate", "uVnPUUZHSY");
        setIntField(term67393, term67393.getClass(), "lastPlaceId", 688731975);
        setField(term67393, term67393.getClass(), "lastPlaceName", "LaWPqdDqyl");
        setIntField(term67393, term67393.getClass(), "lastRegionId", 1198340749);
        setField(term67393, term67393.getClass(), "lastRegionName", "BGDjrSZTJY");
        setIntField(term67393, term67393.getClass(), "lastAllNetId", -385710681);
        setField(term67393, term67393.getClass(), "lastClientId", "VUVCEVItic");
        setIntField(term67393, term67393.getClass(), "lastUsedDeckId", 1624133267);
        setIntField(term67393, term67393.getClass(), "lastPlayMusicLevel", -1547947305);
        setIntField(term67393, term67393.getClass(), "lastEmoneyBrand", -919225635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tloEDDASGy";
        callMethod(klass, "setFirstRomVersion", argTypes, term67393, args);
    }

};


