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

public class UserData_getFirstPlayDate_170699399947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41799;

    public UserData_getFirstPlayDate_170699399947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term41803 = new Long(2135754395358000892L);
        term41799 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term41801 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term41817 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41818 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41822 = newInstance(Class.forName("java.time.LocalTime"));
        Object term41827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41832 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term41799, term41799.getClass(), "id", -6228694154790578964L);
        setLongField(term41801, term41801.getClass(), "id", 1652025727169242768L);
        setField(term41801, term41801.getClass(), "extId", term41803);
        setField(term41801, term41801.getClass(), "luid", "ucTcadpUdW");
        setIntField(term41818, term41818.getClass(), "year", 2017);
        setShortField(term41818, term41818.getClass(), "month", (short) 6);
        setShortField(term41818, term41818.getClass(), "day", (short) 7);
        setField(term41817, term41817.getClass(), "date", term41818);
        setByteField(term41822, term41822.getClass(), "hour", (byte) 13);
        setByteField(term41822, term41822.getClass(), "minute", (byte) 52);
        setByteField(term41822, term41822.getClass(), "second", (byte) 17);
        setIntField(term41822, term41822.getClass(), "nano", 78180039);
        setField(term41817, term41817.getClass(), "time", term41822);
        setField(term41801, term41801.getClass(), "registerTime", term41817);
        setIntField(term41828, term41828.getClass(), "year", 2017);
        setShortField(term41828, term41828.getClass(), "month", (short) 6);
        setShortField(term41828, term41828.getClass(), "day", (short) 23);
        setField(term41827, term41827.getClass(), "date", term41828);
        setByteField(term41832, term41832.getClass(), "hour", (byte) 23);
        setByteField(term41832, term41832.getClass(), "minute", (byte) 29);
        setByteField(term41832, term41832.getClass(), "second", (byte) 17);
        setIntField(term41832, term41832.getClass(), "nano", 491252353);
        setField(term41827, term41827.getClass(), "time", term41832);
        setField(term41801, term41801.getClass(), "accessTime", term41827);
        setField(term41799, term41799.getClass(), "card", term41801);
        setField(term41799, term41799.getClass(), "userName", "AscVKZhCwm");
        setIntField(term41799, term41799.getClass(), "level", -986002923);
        setIntField(term41799, term41799.getClass(), "reincarnationNum", 724930183);
        setLongField(term41799, term41799.getClass(), "exp", 4659041496243630964L);
        setLongField(term41799, term41799.getClass(), "point", -7465474190642854260L);
        setLongField(term41799, term41799.getClass(), "totalPoint", -8372788044669645675L);
        setIntField(term41799, term41799.getClass(), "playCount", 1053680722);
        setIntField(term41799, term41799.getClass(), "jewelCount", -1920949340);
        setIntField(term41799, term41799.getClass(), "totalJewelCount", 1211730228);
        setIntField(term41799, term41799.getClass(), "medalCount", 892506528);
        setIntField(term41799, term41799.getClass(), "playerRating", -1203169418);
        setIntField(term41799, term41799.getClass(), "highestRating", -938772433);
        setIntField(term41799, term41799.getClass(), "battlePoint", 46527533);
        setIntField(term41799, term41799.getClass(), "bestBattlePoint", 1199950979);
        setIntField(term41799, term41799.getClass(), "overDamageBattlePoint", 733812186);
        setBooleanField(term41799, term41799.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term41799, term41799.getClass(), "nameplateId", -840076719);
        setIntField(term41799, term41799.getClass(), "trophyId", 2002762153);
        setIntField(term41799, term41799.getClass(), "cardId", -531666058);
        setIntField(term41799, term41799.getClass(), "characterId", -1659995523);
        setIntField(term41799, term41799.getClass(), "characterVoiceNo", -1384058110);
        setIntField(term41799, term41799.getClass(), "tabSetting", -109584269);
        setIntField(term41799, term41799.getClass(), "tabSortSetting", -682334474);
        setIntField(term41799, term41799.getClass(), "cardCategorySetting", -666332937);
        setIntField(term41799, term41799.getClass(), "cardSortSetting", 1661615099);
        setIntField(term41799, term41799.getClass(), "rivalScoreCategorySetting", 1908136627);
        setIntField(term41799, term41799.getClass(), "playedTutorialBit", 824600792);
        setIntField(term41799, term41799.getClass(), "firstTutorialCancelNum", -1498923569);
        setLongField(term41799, term41799.getClass(), "sumTechHighScore", -1591356946285738868L);
        setLongField(term41799, term41799.getClass(), "sumTechBasicHighScore", 8225112290225174957L);
        setLongField(term41799, term41799.getClass(), "sumTechAdvancedHighScore", 2016254485611358021L);
        setLongField(term41799, term41799.getClass(), "sumTechExpertHighScore", 7087994518559082143L);
        setLongField(term41799, term41799.getClass(), "sumTechMasterHighScore", -4261531885468581427L);
        setLongField(term41799, term41799.getClass(), "sumTechLunaticHighScore", -5071622903555986914L);
        setLongField(term41799, term41799.getClass(), "sumBattleHighScore", 3882122150290927490L);
        setLongField(term41799, term41799.getClass(), "sumBattleBasicHighScore", -1606772867931980245L);
        setLongField(term41799, term41799.getClass(), "sumBattleAdvancedHighScore", -681588793216734678L);
        setLongField(term41799, term41799.getClass(), "sumBattleExpertHighScore", -1863876892925084453L);
        setLongField(term41799, term41799.getClass(), "sumBattleMasterHighScore", 4384548833934581339L);
        setLongField(term41799, term41799.getClass(), "sumBattleLunaticHighScore", -4507015763084556962L);
        setField(term41799, term41799.getClass(), "eventWatchedDate", "HCvSsQWjLn");
        setField(term41799, term41799.getClass(), "cmEventWatchedDate", "FTuOcSieav");
        setField(term41799, term41799.getClass(), "firstGameId", "qSnwPXRuzC");
        setField(term41799, term41799.getClass(), "firstRomVersion", "gqhqalMaKC");
        setField(term41799, term41799.getClass(), "firstDataVersion", "qkMduZHBXR");
        setField(term41799, term41799.getClass(), "firstPlayDate", "jMQsCLYfKd");
        setField(term41799, term41799.getClass(), "lastGameId", "dpcpGqEQLd");
        setField(term41799, term41799.getClass(), "lastRomVersion", "pButgbcWlR");
        setField(term41799, term41799.getClass(), "lastDataVersion", "tPiZMhJIXj");
        setField(term41799, term41799.getClass(), "compatibleCmVersion", "lrEkNimddJ");
        setField(term41799, term41799.getClass(), "lastPlayDate", "fkeYGEUxMA");
        setIntField(term41799, term41799.getClass(), "lastPlaceId", 1082643319);
        setField(term41799, term41799.getClass(), "lastPlaceName", "aJUGPodUIW");
        setIntField(term41799, term41799.getClass(), "lastRegionId", -1138616222);
        setField(term41799, term41799.getClass(), "lastRegionName", "NpjPDfnDRd");
        setIntField(term41799, term41799.getClass(), "lastAllNetId", 285368240);
        setField(term41799, term41799.getClass(), "lastClientId", "SWMYovqYdk");
        setIntField(term41799, term41799.getClass(), "lastUsedDeckId", 1526503433);
        setIntField(term41799, term41799.getClass(), "lastPlayMusicLevel", 1765728316);
        setIntField(term41799, term41799.getClass(), "lastEmoneyBrand", -1459041031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstPlayDate", argTypes, term41799, args);
    }

};


