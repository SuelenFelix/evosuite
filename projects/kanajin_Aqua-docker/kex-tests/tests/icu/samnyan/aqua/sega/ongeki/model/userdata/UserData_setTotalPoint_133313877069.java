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

public class UserData_setTotalPoint_133313877069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51183;
     Object term51446;

    public UserData_setTotalPoint_133313877069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term51187 = new Long(-7268507582722666254L);
        term51183 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term51185 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term51201 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51202 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51206 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51216 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term51183, term51183.getClass(), "id", -4647988450998060301L);
        setLongField(term51185, term51185.getClass(), "id", -6799265768469176623L);
        setField(term51185, term51185.getClass(), "extId", term51187);
        setField(term51185, term51185.getClass(), "luid", "iQCLduwSPi");
        setIntField(term51202, term51202.getClass(), "year", 2024);
        setShortField(term51202, term51202.getClass(), "month", (short) 12);
        setShortField(term51202, term51202.getClass(), "day", (short) 11);
        setField(term51201, term51201.getClass(), "date", term51202);
        setByteField(term51206, term51206.getClass(), "hour", (byte) 19);
        setByteField(term51206, term51206.getClass(), "minute", (byte) 38);
        setByteField(term51206, term51206.getClass(), "second", (byte) 23);
        setIntField(term51206, term51206.getClass(), "nano", 207336939);
        setField(term51201, term51201.getClass(), "time", term51206);
        setField(term51185, term51185.getClass(), "registerTime", term51201);
        setIntField(term51212, term51212.getClass(), "year", 2023);
        setShortField(term51212, term51212.getClass(), "month", (short) 3);
        setShortField(term51212, term51212.getClass(), "day", (short) 29);
        setField(term51211, term51211.getClass(), "date", term51212);
        setByteField(term51216, term51216.getClass(), "hour", (byte) 12);
        setByteField(term51216, term51216.getClass(), "minute", (byte) 11);
        setByteField(term51216, term51216.getClass(), "second", (byte) 3);
        setIntField(term51216, term51216.getClass(), "nano", 876063258);
        setField(term51211, term51211.getClass(), "time", term51216);
        setField(term51185, term51185.getClass(), "accessTime", term51211);
        setField(term51183, term51183.getClass(), "card", term51185);
        setField(term51183, term51183.getClass(), "userName", "ZcODLNhxqg");
        setIntField(term51183, term51183.getClass(), "level", -21937920);
        setIntField(term51183, term51183.getClass(), "reincarnationNum", -1136589460);
        setLongField(term51183, term51183.getClass(), "exp", -6960323426014178409L);
        setLongField(term51183, term51183.getClass(), "point", 5254427735699890849L);
        setLongField(term51183, term51183.getClass(), "totalPoint", -2981899957757551501L);
        setIntField(term51183, term51183.getClass(), "playCount", -503938545);
        setIntField(term51183, term51183.getClass(), "jewelCount", 2025866025);
        setIntField(term51183, term51183.getClass(), "totalJewelCount", 1509936407);
        setIntField(term51183, term51183.getClass(), "medalCount", 480159064);
        setIntField(term51183, term51183.getClass(), "playerRating", 1447658561);
        setIntField(term51183, term51183.getClass(), "highestRating", -2004177132);
        setIntField(term51183, term51183.getClass(), "battlePoint", 1111078487);
        setIntField(term51183, term51183.getClass(), "bestBattlePoint", 1426568609);
        setIntField(term51183, term51183.getClass(), "overDamageBattlePoint", -1214249196);
        setBooleanField(term51183, term51183.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term51183, term51183.getClass(), "nameplateId", -500814419);
        setIntField(term51183, term51183.getClass(), "trophyId", -584375380);
        setIntField(term51183, term51183.getClass(), "cardId", 1906067765);
        setIntField(term51183, term51183.getClass(), "characterId", -1141978353);
        setIntField(term51183, term51183.getClass(), "characterVoiceNo", 1877297875);
        setIntField(term51183, term51183.getClass(), "tabSetting", -614739795);
        setIntField(term51183, term51183.getClass(), "tabSortSetting", 1805124024);
        setIntField(term51183, term51183.getClass(), "cardCategorySetting", -1415507503);
        setIntField(term51183, term51183.getClass(), "cardSortSetting", 424884647);
        setIntField(term51183, term51183.getClass(), "rivalScoreCategorySetting", -881760055);
        setIntField(term51183, term51183.getClass(), "playedTutorialBit", 873700519);
        setIntField(term51183, term51183.getClass(), "firstTutorialCancelNum", 805310057);
        setLongField(term51183, term51183.getClass(), "sumTechHighScore", -3796499281571450784L);
        setLongField(term51183, term51183.getClass(), "sumTechBasicHighScore", 2856654200900890130L);
        setLongField(term51183, term51183.getClass(), "sumTechAdvancedHighScore", 2362710323589009829L);
        setLongField(term51183, term51183.getClass(), "sumTechExpertHighScore", -1353104097704898755L);
        setLongField(term51183, term51183.getClass(), "sumTechMasterHighScore", 1331926449821360443L);
        setLongField(term51183, term51183.getClass(), "sumTechLunaticHighScore", 38842281830560892L);
        setLongField(term51183, term51183.getClass(), "sumBattleHighScore", 2485168218246856776L);
        setLongField(term51183, term51183.getClass(), "sumBattleBasicHighScore", 7984812876118160348L);
        setLongField(term51183, term51183.getClass(), "sumBattleAdvancedHighScore", -234963564219631183L);
        setLongField(term51183, term51183.getClass(), "sumBattleExpertHighScore", 3148960129338863858L);
        setLongField(term51183, term51183.getClass(), "sumBattleMasterHighScore", 8567007307199068093L);
        setLongField(term51183, term51183.getClass(), "sumBattleLunaticHighScore", 8125394137486820640L);
        setField(term51183, term51183.getClass(), "eventWatchedDate", "iNtHOROBMq");
        setField(term51183, term51183.getClass(), "cmEventWatchedDate", "GbvfbbsrOl");
        setField(term51183, term51183.getClass(), "firstGameId", "IIZlqzOmtY");
        setField(term51183, term51183.getClass(), "firstRomVersion", "iRFRSxtnkr");
        setField(term51183, term51183.getClass(), "firstDataVersion", "iGWkLjLGBY");
        setField(term51183, term51183.getClass(), "firstPlayDate", "jUkXaNkoAg");
        setField(term51183, term51183.getClass(), "lastGameId", "mZsPsRzyhQ");
        setField(term51183, term51183.getClass(), "lastRomVersion", "IExlbTemvJ");
        setField(term51183, term51183.getClass(), "lastDataVersion", "zaljyXXCoy");
        setField(term51183, term51183.getClass(), "compatibleCmVersion", "dKoYnXLGEI");
        setField(term51183, term51183.getClass(), "lastPlayDate", "MQvSpklpkB");
        setIntField(term51183, term51183.getClass(), "lastPlaceId", -107339699);
        setField(term51183, term51183.getClass(), "lastPlaceName", "SbTxRdDQQc");
        setIntField(term51183, term51183.getClass(), "lastRegionId", -58728001);
        setField(term51183, term51183.getClass(), "lastRegionName", "MrVdoUYAdO");
        setIntField(term51183, term51183.getClass(), "lastAllNetId", 1013952192);
        setField(term51183, term51183.getClass(), "lastClientId", "schPUnVfDW");
        setIntField(term51183, term51183.getClass(), "lastUsedDeckId", -986675483);
        setIntField(term51183, term51183.getClass(), "lastPlayMusicLevel", 337370099);
        setIntField(term51183, term51183.getClass(), "lastEmoneyBrand", -824145581);
        term51446 = new Long(-3034337124103524360L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term51446;
        callMethod(klass, "setTotalPoint", argTypes, term51183, args);
    }

};


