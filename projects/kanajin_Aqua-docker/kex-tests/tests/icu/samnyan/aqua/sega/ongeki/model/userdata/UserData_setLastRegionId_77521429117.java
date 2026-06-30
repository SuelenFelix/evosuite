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

public class UserData_setLastRegionId_77521429117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71823;
     Object term72086;

    public UserData_setLastRegionId_77521429117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term71827 = new Long(-948292411727204525L);
        term71823 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term71825 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term71841 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71842 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71846 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71851 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71852 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71856 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term71823, term71823.getClass(), "id", 8943359131971541399L);
        setLongField(term71825, term71825.getClass(), "id", -274302069813205157L);
        setField(term71825, term71825.getClass(), "extId", term71827);
        setField(term71825, term71825.getClass(), "luid", "YvjPnZyRnw");
        setIntField(term71842, term71842.getClass(), "year", 2019);
        setShortField(term71842, term71842.getClass(), "month", (short) 3);
        setShortField(term71842, term71842.getClass(), "day", (short) 23);
        setField(term71841, term71841.getClass(), "date", term71842);
        setByteField(term71846, term71846.getClass(), "hour", (byte) 13);
        setByteField(term71846, term71846.getClass(), "minute", (byte) 19);
        setByteField(term71846, term71846.getClass(), "second", (byte) 44);
        setIntField(term71846, term71846.getClass(), "nano", 912714703);
        setField(term71841, term71841.getClass(), "time", term71846);
        setField(term71825, term71825.getClass(), "registerTime", term71841);
        setIntField(term71852, term71852.getClass(), "year", 2027);
        setShortField(term71852, term71852.getClass(), "month", (short) 3);
        setShortField(term71852, term71852.getClass(), "day", (short) 4);
        setField(term71851, term71851.getClass(), "date", term71852);
        setByteField(term71856, term71856.getClass(), "hour", (byte) 2);
        setByteField(term71856, term71856.getClass(), "minute", (byte) 3);
        setByteField(term71856, term71856.getClass(), "second", (byte) 31);
        setIntField(term71856, term71856.getClass(), "nano", 652064220);
        setField(term71851, term71851.getClass(), "time", term71856);
        setField(term71825, term71825.getClass(), "accessTime", term71851);
        setField(term71823, term71823.getClass(), "card", term71825);
        setField(term71823, term71823.getClass(), "userName", "IKmMfqFPku");
        setIntField(term71823, term71823.getClass(), "level", 1705528966);
        setIntField(term71823, term71823.getClass(), "reincarnationNum", 988288101);
        setLongField(term71823, term71823.getClass(), "exp", -1828741393158004146L);
        setLongField(term71823, term71823.getClass(), "point", -8310891844261180284L);
        setLongField(term71823, term71823.getClass(), "totalPoint", 5125563429780203235L);
        setIntField(term71823, term71823.getClass(), "playCount", -1408161596);
        setIntField(term71823, term71823.getClass(), "jewelCount", 1726412898);
        setIntField(term71823, term71823.getClass(), "totalJewelCount", -669874944);
        setIntField(term71823, term71823.getClass(), "medalCount", -1111349476);
        setIntField(term71823, term71823.getClass(), "playerRating", 742969465);
        setIntField(term71823, term71823.getClass(), "highestRating", -1810335427);
        setIntField(term71823, term71823.getClass(), "battlePoint", 803994786);
        setIntField(term71823, term71823.getClass(), "bestBattlePoint", -1141611223);
        setIntField(term71823, term71823.getClass(), "overDamageBattlePoint", -1637961050);
        setBooleanField(term71823, term71823.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term71823, term71823.getClass(), "nameplateId", 1515109550);
        setIntField(term71823, term71823.getClass(), "trophyId", 1249494915);
        setIntField(term71823, term71823.getClass(), "cardId", 1840485574);
        setIntField(term71823, term71823.getClass(), "characterId", -1384928271);
        setIntField(term71823, term71823.getClass(), "characterVoiceNo", 1760478472);
        setIntField(term71823, term71823.getClass(), "tabSetting", 611874985);
        setIntField(term71823, term71823.getClass(), "tabSortSetting", -1490909009);
        setIntField(term71823, term71823.getClass(), "cardCategorySetting", -1045578030);
        setIntField(term71823, term71823.getClass(), "cardSortSetting", 1595269473);
        setIntField(term71823, term71823.getClass(), "rivalScoreCategorySetting", 1542667674);
        setIntField(term71823, term71823.getClass(), "playedTutorialBit", 1314061353);
        setIntField(term71823, term71823.getClass(), "firstTutorialCancelNum", 1341217092);
        setLongField(term71823, term71823.getClass(), "sumTechHighScore", 6728314318147485883L);
        setLongField(term71823, term71823.getClass(), "sumTechBasicHighScore", -9137168165760106798L);
        setLongField(term71823, term71823.getClass(), "sumTechAdvancedHighScore", 7708778616739137981L);
        setLongField(term71823, term71823.getClass(), "sumTechExpertHighScore", 8715204132761098696L);
        setLongField(term71823, term71823.getClass(), "sumTechMasterHighScore", -7560086943976921411L);
        setLongField(term71823, term71823.getClass(), "sumTechLunaticHighScore", 9199331845494156353L);
        setLongField(term71823, term71823.getClass(), "sumBattleHighScore", -5753568340370307157L);
        setLongField(term71823, term71823.getClass(), "sumBattleBasicHighScore", -7036699446832430477L);
        setLongField(term71823, term71823.getClass(), "sumBattleAdvancedHighScore", 4078914953725326519L);
        setLongField(term71823, term71823.getClass(), "sumBattleExpertHighScore", 2204505325171318122L);
        setLongField(term71823, term71823.getClass(), "sumBattleMasterHighScore", 5648572465261242904L);
        setLongField(term71823, term71823.getClass(), "sumBattleLunaticHighScore", -6565717772503302541L);
        setField(term71823, term71823.getClass(), "eventWatchedDate", "NACnGDmVPl");
        setField(term71823, term71823.getClass(), "cmEventWatchedDate", "SfWiFjkLGW");
        setField(term71823, term71823.getClass(), "firstGameId", "urBahuOkUQ");
        setField(term71823, term71823.getClass(), "firstRomVersion", "zHcZrTMdOT");
        setField(term71823, term71823.getClass(), "firstDataVersion", "zIAIXHeKXt");
        setField(term71823, term71823.getClass(), "firstPlayDate", "fVkSkOqFEO");
        setField(term71823, term71823.getClass(), "lastGameId", "DLfgyAqDDu");
        setField(term71823, term71823.getClass(), "lastRomVersion", "ryuQaXtwNj");
        setField(term71823, term71823.getClass(), "lastDataVersion", "OutjKNDSgR");
        setField(term71823, term71823.getClass(), "compatibleCmVersion", "brfLLGXcwA");
        setField(term71823, term71823.getClass(), "lastPlayDate", "zoVKwYYMOI");
        setIntField(term71823, term71823.getClass(), "lastPlaceId", -1945365712);
        setField(term71823, term71823.getClass(), "lastPlaceName", "DGCeQsmIOU");
        setIntField(term71823, term71823.getClass(), "lastRegionId", -746947278);
        setField(term71823, term71823.getClass(), "lastRegionName", "otcpSHwkzG");
        setIntField(term71823, term71823.getClass(), "lastAllNetId", 799648581);
        setField(term71823, term71823.getClass(), "lastClientId", "BixZhUjVme");
        setIntField(term71823, term71823.getClass(), "lastUsedDeckId", -1929592392);
        setIntField(term71823, term71823.getClass(), "lastPlayMusicLevel", -557536719);
        setIntField(term71823, term71823.getClass(), "lastEmoneyBrand", -1507520585);
        term72086 = new Integer(87370597);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term72086;
        callMethod(klass, "setLastRegionId", argTypes, term71823, args);
    }

};


