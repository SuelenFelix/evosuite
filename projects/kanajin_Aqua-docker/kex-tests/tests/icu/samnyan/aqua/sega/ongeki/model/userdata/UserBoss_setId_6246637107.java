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

public class UserBoss_setId_6246637107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136724;
     Object term136993;

    public UserBoss_setId_6246637107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term136730 = new Long(-6985556670871089725L);
        term136724 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        Object term136726 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term136728 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term136744 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136749 = newInstance(Class.forName("java.time.LocalTime"));
        Object term136754 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136755 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136759 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term136724, term136724.getClass(), "id", -5659356996393137436L);
        setLongField(term136726, term136726.getClass(), "id", 4977681620379216762L);
        setLongField(term136728, term136728.getClass(), "id", 6258961619418896243L);
        setField(term136728, term136728.getClass(), "extId", term136730);
        setField(term136728, term136728.getClass(), "luid", "nEgtuqAlLm");
        setIntField(term136745, term136745.getClass(), "year", 2012);
        setShortField(term136745, term136745.getClass(), "month", (short) 2);
        setShortField(term136745, term136745.getClass(), "day", (short) 24);
        setField(term136744, term136744.getClass(), "date", term136745);
        setByteField(term136749, term136749.getClass(), "hour", (byte) 7);
        setByteField(term136749, term136749.getClass(), "minute", (byte) 19);
        setByteField(term136749, term136749.getClass(), "second", (byte) 47);
        setIntField(term136749, term136749.getClass(), "nano", 173778376);
        setField(term136744, term136744.getClass(), "time", term136749);
        setField(term136728, term136728.getClass(), "registerTime", term136744);
        setIntField(term136755, term136755.getClass(), "year", 2029);
        setShortField(term136755, term136755.getClass(), "month", (short) 3);
        setShortField(term136755, term136755.getClass(), "day", (short) 28);
        setField(term136754, term136754.getClass(), "date", term136755);
        setByteField(term136759, term136759.getClass(), "hour", (byte) 6);
        setByteField(term136759, term136759.getClass(), "minute", (byte) 43);
        setByteField(term136759, term136759.getClass(), "second", (byte) 8);
        setIntField(term136759, term136759.getClass(), "nano", 873338827);
        setField(term136754, term136754.getClass(), "time", term136759);
        setField(term136728, term136728.getClass(), "accessTime", term136754);
        setField(term136726, term136726.getClass(), "card", term136728);
        setField(term136726, term136726.getClass(), "userName", "DiWPwuubfu");
        setIntField(term136726, term136726.getClass(), "level", 942819176);
        setIntField(term136726, term136726.getClass(), "reincarnationNum", 574235419);
        setLongField(term136726, term136726.getClass(), "exp", 8043776004053988427L);
        setLongField(term136726, term136726.getClass(), "point", 4621997644618424831L);
        setLongField(term136726, term136726.getClass(), "totalPoint", -1038487009975773201L);
        setIntField(term136726, term136726.getClass(), "playCount", 296302576);
        setIntField(term136726, term136726.getClass(), "jewelCount", -2007722929);
        setIntField(term136726, term136726.getClass(), "totalJewelCount", -437524378);
        setIntField(term136726, term136726.getClass(), "medalCount", 1763408351);
        setIntField(term136726, term136726.getClass(), "playerRating", -1795069152);
        setIntField(term136726, term136726.getClass(), "highestRating", 1150223319);
        setIntField(term136726, term136726.getClass(), "battlePoint", 1090258751);
        setIntField(term136726, term136726.getClass(), "bestBattlePoint", 1121387085);
        setIntField(term136726, term136726.getClass(), "overDamageBattlePoint", 239345617);
        setBooleanField(term136726, term136726.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term136726, term136726.getClass(), "nameplateId", -1703154971);
        setIntField(term136726, term136726.getClass(), "trophyId", -187409593);
        setIntField(term136726, term136726.getClass(), "cardId", 1976370886);
        setIntField(term136726, term136726.getClass(), "characterId", 55334433);
        setIntField(term136726, term136726.getClass(), "characterVoiceNo", -666821151);
        setIntField(term136726, term136726.getClass(), "tabSetting", -36525575);
        setIntField(term136726, term136726.getClass(), "tabSortSetting", -933677706);
        setIntField(term136726, term136726.getClass(), "cardCategorySetting", -1767089569);
        setIntField(term136726, term136726.getClass(), "cardSortSetting", 142490431);
        setIntField(term136726, term136726.getClass(), "rivalScoreCategorySetting", 1200937755);
        setIntField(term136726, term136726.getClass(), "playedTutorialBit", -1108898907);
        setIntField(term136726, term136726.getClass(), "firstTutorialCancelNum", -1636601903);
        setLongField(term136726, term136726.getClass(), "sumTechHighScore", -4739364628635106494L);
        setLongField(term136726, term136726.getClass(), "sumTechBasicHighScore", -6223182567760638678L);
        setLongField(term136726, term136726.getClass(), "sumTechAdvancedHighScore", 8152625071274252745L);
        setLongField(term136726, term136726.getClass(), "sumTechExpertHighScore", -9099461596997081987L);
        setLongField(term136726, term136726.getClass(), "sumTechMasterHighScore", -1234976893916828454L);
        setLongField(term136726, term136726.getClass(), "sumTechLunaticHighScore", -1346705263091023961L);
        setLongField(term136726, term136726.getClass(), "sumBattleHighScore", 7046030930687826321L);
        setLongField(term136726, term136726.getClass(), "sumBattleBasicHighScore", 3998830372996005230L);
        setLongField(term136726, term136726.getClass(), "sumBattleAdvancedHighScore", -6838037189311287732L);
        setLongField(term136726, term136726.getClass(), "sumBattleExpertHighScore", -1407515527998743137L);
        setLongField(term136726, term136726.getClass(), "sumBattleMasterHighScore", 1215808904367462472L);
        setLongField(term136726, term136726.getClass(), "sumBattleLunaticHighScore", -704693644895739566L);
        setField(term136726, term136726.getClass(), "eventWatchedDate", "vXgtAGmDaN");
        setField(term136726, term136726.getClass(), "cmEventWatchedDate", "RAzeZQXqkC");
        setField(term136726, term136726.getClass(), "firstGameId", "NxfBiMaFGb");
        setField(term136726, term136726.getClass(), "firstRomVersion", "xKDTKfQIei");
        setField(term136726, term136726.getClass(), "firstDataVersion", "QHAkxVuuIr");
        setField(term136726, term136726.getClass(), "firstPlayDate", "OhJSELmFDf");
        setField(term136726, term136726.getClass(), "lastGameId", "WjtvlnduZO");
        setField(term136726, term136726.getClass(), "lastRomVersion", "EccuEVvNyG");
        setField(term136726, term136726.getClass(), "lastDataVersion", "kqWUPOtRYQ");
        setField(term136726, term136726.getClass(), "compatibleCmVersion", "vtFFfsxqsd");
        setField(term136726, term136726.getClass(), "lastPlayDate", "OgafASdxEn");
        setIntField(term136726, term136726.getClass(), "lastPlaceId", -1601013520);
        setField(term136726, term136726.getClass(), "lastPlaceName", "SdEDpqIgHG");
        setIntField(term136726, term136726.getClass(), "lastRegionId", -1774736608);
        setField(term136726, term136726.getClass(), "lastRegionName", "KiOHPfuKbp");
        setIntField(term136726, term136726.getClass(), "lastAllNetId", 1729897037);
        setField(term136726, term136726.getClass(), "lastClientId", "faneZfiPkz");
        setIntField(term136726, term136726.getClass(), "lastUsedDeckId", -144907344);
        setIntField(term136726, term136726.getClass(), "lastPlayMusicLevel", 913134875);
        setIntField(term136726, term136726.getClass(), "lastEmoneyBrand", 1826856908);
        setField(term136724, term136724.getClass(), "user", term136726);
        setIntField(term136724, term136724.getClass(), "musicId", -288182293);
        setIntField(term136724, term136724.getClass(), "damage", -1548825481);
        setBooleanField(term136724, term136724.getClass(), "isClear", false);
        setIntField(term136724, term136724.getClass(), "eventId", 267197964);
        term136993 = new Long(-1313457120498071668L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term136993;
        callMethod(klass, "setId", argTypes, term136724, args);
    }

};


