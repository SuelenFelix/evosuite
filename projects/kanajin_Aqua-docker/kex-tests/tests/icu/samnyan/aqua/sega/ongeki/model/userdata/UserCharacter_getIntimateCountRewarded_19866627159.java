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

public class UserCharacter_getIntimateCountRewarded_19866627159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171804;

    public UserCharacter_getIntimateCountRewarded_19866627159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term171810 = new Long(7950532649535587877L);
        term171804 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term171806 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term171808 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term171824 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171825 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171829 = newInstance(Class.forName("java.time.LocalTime"));
        Object term171834 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171835 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171839 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term171804, term171804.getClass(), "id", -8927827038296427456L);
        setLongField(term171806, term171806.getClass(), "id", -409185820590411414L);
        setLongField(term171808, term171808.getClass(), "id", -5660292101720594350L);
        setField(term171808, term171808.getClass(), "extId", term171810);
        setField(term171808, term171808.getClass(), "luid", "dLMoewuhPE");
        setIntField(term171825, term171825.getClass(), "year", 2016);
        setShortField(term171825, term171825.getClass(), "month", (short) 12);
        setShortField(term171825, term171825.getClass(), "day", (short) 23);
        setField(term171824, term171824.getClass(), "date", term171825);
        setByteField(term171829, term171829.getClass(), "hour", (byte) 13);
        setByteField(term171829, term171829.getClass(), "minute", (byte) 59);
        setByteField(term171829, term171829.getClass(), "second", (byte) 38);
        setIntField(term171829, term171829.getClass(), "nano", 70840095);
        setField(term171824, term171824.getClass(), "time", term171829);
        setField(term171808, term171808.getClass(), "registerTime", term171824);
        setIntField(term171835, term171835.getClass(), "year", 2029);
        setShortField(term171835, term171835.getClass(), "month", (short) 7);
        setShortField(term171835, term171835.getClass(), "day", (short) 14);
        setField(term171834, term171834.getClass(), "date", term171835);
        setByteField(term171839, term171839.getClass(), "hour", (byte) 23);
        setByteField(term171839, term171839.getClass(), "minute", (byte) 7);
        setByteField(term171839, term171839.getClass(), "second", (byte) 5);
        setIntField(term171839, term171839.getClass(), "nano", 909102915);
        setField(term171834, term171834.getClass(), "time", term171839);
        setField(term171808, term171808.getClass(), "accessTime", term171834);
        setField(term171806, term171806.getClass(), "card", term171808);
        setField(term171806, term171806.getClass(), "userName", "bABDSWUSVt");
        setIntField(term171806, term171806.getClass(), "level", -1529353819);
        setIntField(term171806, term171806.getClass(), "reincarnationNum", 115568532);
        setLongField(term171806, term171806.getClass(), "exp", -8001458640699468718L);
        setLongField(term171806, term171806.getClass(), "point", -2531379667934668121L);
        setLongField(term171806, term171806.getClass(), "totalPoint", -8493569200291088525L);
        setIntField(term171806, term171806.getClass(), "playCount", 1917902884);
        setIntField(term171806, term171806.getClass(), "jewelCount", 247896466);
        setIntField(term171806, term171806.getClass(), "totalJewelCount", -931397750);
        setIntField(term171806, term171806.getClass(), "medalCount", 1967564631);
        setIntField(term171806, term171806.getClass(), "playerRating", -1201113309);
        setIntField(term171806, term171806.getClass(), "highestRating", 1234432017);
        setIntField(term171806, term171806.getClass(), "battlePoint", -1323037797);
        setIntField(term171806, term171806.getClass(), "bestBattlePoint", -534003181);
        setIntField(term171806, term171806.getClass(), "overDamageBattlePoint", 656088138);
        setBooleanField(term171806, term171806.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term171806, term171806.getClass(), "nameplateId", -1756129889);
        setIntField(term171806, term171806.getClass(), "trophyId", -1649701020);
        setIntField(term171806, term171806.getClass(), "cardId", 183048798);
        setIntField(term171806, term171806.getClass(), "characterId", 50192659);
        setIntField(term171806, term171806.getClass(), "characterVoiceNo", -1586884307);
        setIntField(term171806, term171806.getClass(), "tabSetting", 761198462);
        setIntField(term171806, term171806.getClass(), "tabSortSetting", -2001015455);
        setIntField(term171806, term171806.getClass(), "cardCategorySetting", -1300443569);
        setIntField(term171806, term171806.getClass(), "cardSortSetting", 1758954430);
        setIntField(term171806, term171806.getClass(), "rivalScoreCategorySetting", 343381557);
        setIntField(term171806, term171806.getClass(), "playedTutorialBit", 1072458409);
        setIntField(term171806, term171806.getClass(), "firstTutorialCancelNum", -369157778);
        setLongField(term171806, term171806.getClass(), "sumTechHighScore", -1214297584521497035L);
        setLongField(term171806, term171806.getClass(), "sumTechBasicHighScore", -7893939569994031367L);
        setLongField(term171806, term171806.getClass(), "sumTechAdvancedHighScore", -7660606501487991809L);
        setLongField(term171806, term171806.getClass(), "sumTechExpertHighScore", -875185413198895165L);
        setLongField(term171806, term171806.getClass(), "sumTechMasterHighScore", -5708499938823947916L);
        setLongField(term171806, term171806.getClass(), "sumTechLunaticHighScore", -9187541981442771351L);
        setLongField(term171806, term171806.getClass(), "sumBattleHighScore", 378406636775614740L);
        setLongField(term171806, term171806.getClass(), "sumBattleBasicHighScore", 5961074363136430719L);
        setLongField(term171806, term171806.getClass(), "sumBattleAdvancedHighScore", -1263670869958452903L);
        setLongField(term171806, term171806.getClass(), "sumBattleExpertHighScore", -5356866490534317541L);
        setLongField(term171806, term171806.getClass(), "sumBattleMasterHighScore", 4109319711713641940L);
        setLongField(term171806, term171806.getClass(), "sumBattleLunaticHighScore", 8066632021341976980L);
        setField(term171806, term171806.getClass(), "eventWatchedDate", "dXmGaJLPKJ");
        setField(term171806, term171806.getClass(), "cmEventWatchedDate", "MgGetJAEjK");
        setField(term171806, term171806.getClass(), "firstGameId", "GrvvLwSjbJ");
        setField(term171806, term171806.getClass(), "firstRomVersion", "DNIdzoOzMV");
        setField(term171806, term171806.getClass(), "firstDataVersion", "XQuvfxSccv");
        setField(term171806, term171806.getClass(), "firstPlayDate", "RfquVEAVPR");
        setField(term171806, term171806.getClass(), "lastGameId", "fIhffQCyHs");
        setField(term171806, term171806.getClass(), "lastRomVersion", "pixJfRMTyW");
        setField(term171806, term171806.getClass(), "lastDataVersion", "XDSlztmbAH");
        setField(term171806, term171806.getClass(), "compatibleCmVersion", "lVJlzPWBAK");
        setField(term171806, term171806.getClass(), "lastPlayDate", "bejLIJbwQs");
        setIntField(term171806, term171806.getClass(), "lastPlaceId", -1406308770);
        setField(term171806, term171806.getClass(), "lastPlaceName", "rSnKEBMtyz");
        setIntField(term171806, term171806.getClass(), "lastRegionId", 1787438187);
        setField(term171806, term171806.getClass(), "lastRegionName", "ryQHIDoyML");
        setIntField(term171806, term171806.getClass(), "lastAllNetId", -1595839174);
        setField(term171806, term171806.getClass(), "lastClientId", "vmiwpXnDWD");
        setIntField(term171806, term171806.getClass(), "lastUsedDeckId", -842864130);
        setIntField(term171806, term171806.getClass(), "lastPlayMusicLevel", 1397121874);
        setIntField(term171806, term171806.getClass(), "lastEmoneyBrand", 81915067);
        setField(term171804, term171804.getClass(), "user", term171806);
        setIntField(term171804, term171804.getClass(), "characterId", 81408490);
        setIntField(term171804, term171804.getClass(), "costumeId", 242316145);
        setIntField(term171804, term171804.getClass(), "attachmentId", 1646990992);
        setIntField(term171804, term171804.getClass(), "playCount", 1908475105);
        setIntField(term171804, term171804.getClass(), "intimateLevel", -66347285);
        setIntField(term171804, term171804.getClass(), "intimateCount", 1312057122);
        setIntField(term171804, term171804.getClass(), "intimateCountRewarded", -615284367);
        setField(term171804, term171804.getClass(), "intimateCountDate", "boaaRNDJpY");
        setBooleanField(term171804, term171804.getClass(), "isNew", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntimateCountRewarded", argTypes, term171804, args);
    }

};


