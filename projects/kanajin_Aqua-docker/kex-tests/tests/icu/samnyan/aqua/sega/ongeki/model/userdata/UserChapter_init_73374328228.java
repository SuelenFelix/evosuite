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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class UserChapter_init_73374328228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95352;
     Object term95354;
     Object term95617;
     Object term95619;
     Object term95621;
     Object term95623;
     Object term95625;
     Object term95627;
     Object term95629;
     Object term95631;
     Object term95633;

    public UserChapter_init_73374328228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95352 = new Long(-6411181823365531813L);
        Long term95358 = new Long(3288791194263207397L);
        term95354 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term95356 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term95372 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95373 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95377 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95382 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95383 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95387 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term95354, term95354.getClass(), "id", 7276586941776899290L);
        setLongField(term95356, term95356.getClass(), "id", -189747828072599611L);
        setField(term95356, term95356.getClass(), "extId", term95358);
        setField(term95356, term95356.getClass(), "luid", "ozlrFdNXle");
        setIntField(term95373, term95373.getClass(), "year", 2015);
        setShortField(term95373, term95373.getClass(), "month", (short) 11);
        setShortField(term95373, term95373.getClass(), "day", (short) 6);
        setField(term95372, term95372.getClass(), "date", term95373);
        setByteField(term95377, term95377.getClass(), "hour", (byte) 5);
        setByteField(term95377, term95377.getClass(), "minute", (byte) 30);
        setByteField(term95377, term95377.getClass(), "second", (byte) 37);
        setIntField(term95377, term95377.getClass(), "nano", 396534729);
        setField(term95372, term95372.getClass(), "time", term95377);
        setField(term95356, term95356.getClass(), "registerTime", term95372);
        setIntField(term95383, term95383.getClass(), "year", 2013);
        setShortField(term95383, term95383.getClass(), "month", (short) 1);
        setShortField(term95383, term95383.getClass(), "day", (short) 4);
        setField(term95382, term95382.getClass(), "date", term95383);
        setByteField(term95387, term95387.getClass(), "hour", (byte) 22);
        setByteField(term95387, term95387.getClass(), "minute", (byte) 8);
        setByteField(term95387, term95387.getClass(), "second", (byte) 55);
        setIntField(term95387, term95387.getClass(), "nano", 284915768);
        setField(term95382, term95382.getClass(), "time", term95387);
        setField(term95356, term95356.getClass(), "accessTime", term95382);
        setField(term95354, term95354.getClass(), "card", term95356);
        setField(term95354, term95354.getClass(), "userName", "vjUObaeMjo");
        setIntField(term95354, term95354.getClass(), "level", -1967126524);
        setIntField(term95354, term95354.getClass(), "reincarnationNum", -803436050);
        setLongField(term95354, term95354.getClass(), "exp", -1842662994637603666L);
        setLongField(term95354, term95354.getClass(), "point", -5123487854241278445L);
        setLongField(term95354, term95354.getClass(), "totalPoint", -2607843712049587713L);
        setIntField(term95354, term95354.getClass(), "playCount", 1382240540);
        setIntField(term95354, term95354.getClass(), "jewelCount", -894941864);
        setIntField(term95354, term95354.getClass(), "totalJewelCount", -1796952360);
        setIntField(term95354, term95354.getClass(), "medalCount", -29580694);
        setIntField(term95354, term95354.getClass(), "playerRating", -1774385073);
        setIntField(term95354, term95354.getClass(), "highestRating", -1095327334);
        setIntField(term95354, term95354.getClass(), "battlePoint", -401456020);
        setIntField(term95354, term95354.getClass(), "bestBattlePoint", 333219682);
        setIntField(term95354, term95354.getClass(), "overDamageBattlePoint", -1691293662);
        setBooleanField(term95354, term95354.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term95354, term95354.getClass(), "nameplateId", 347540813);
        setIntField(term95354, term95354.getClass(), "trophyId", -897042657);
        setIntField(term95354, term95354.getClass(), "cardId", 1519205600);
        setIntField(term95354, term95354.getClass(), "characterId", 631662709);
        setIntField(term95354, term95354.getClass(), "characterVoiceNo", 580524853);
        setIntField(term95354, term95354.getClass(), "tabSetting", -1436225528);
        setIntField(term95354, term95354.getClass(), "tabSortSetting", -1249891722);
        setIntField(term95354, term95354.getClass(), "cardCategorySetting", -402850097);
        setIntField(term95354, term95354.getClass(), "cardSortSetting", 1012166312);
        setIntField(term95354, term95354.getClass(), "rivalScoreCategorySetting", 1625194278);
        setIntField(term95354, term95354.getClass(), "playedTutorialBit", 55518559);
        setIntField(term95354, term95354.getClass(), "firstTutorialCancelNum", 1862584249);
        setLongField(term95354, term95354.getClass(), "sumTechHighScore", 8783385027474010513L);
        setLongField(term95354, term95354.getClass(), "sumTechBasicHighScore", 8798081825245510432L);
        setLongField(term95354, term95354.getClass(), "sumTechAdvancedHighScore", -7961081262439193657L);
        setLongField(term95354, term95354.getClass(), "sumTechExpertHighScore", 179552899106698143L);
        setLongField(term95354, term95354.getClass(), "sumTechMasterHighScore", 2000871719067281404L);
        setLongField(term95354, term95354.getClass(), "sumTechLunaticHighScore", 2513828001019390305L);
        setLongField(term95354, term95354.getClass(), "sumBattleHighScore", 1343365543075006207L);
        setLongField(term95354, term95354.getClass(), "sumBattleBasicHighScore", -6723803215469447157L);
        setLongField(term95354, term95354.getClass(), "sumBattleAdvancedHighScore", -3908796315764473052L);
        setLongField(term95354, term95354.getClass(), "sumBattleExpertHighScore", -2767466084205664605L);
        setLongField(term95354, term95354.getClass(), "sumBattleMasterHighScore", 2329525670158942349L);
        setLongField(term95354, term95354.getClass(), "sumBattleLunaticHighScore", -2680678097190186121L);
        setField(term95354, term95354.getClass(), "eventWatchedDate", "JsIgccyWag");
        setField(term95354, term95354.getClass(), "cmEventWatchedDate", "qSfmbHSpyF");
        setField(term95354, term95354.getClass(), "firstGameId", "nfLAMGBNLz");
        setField(term95354, term95354.getClass(), "firstRomVersion", "uMLxdkYOdc");
        setField(term95354, term95354.getClass(), "firstDataVersion", "oRXjZDPrtE");
        setField(term95354, term95354.getClass(), "firstPlayDate", "UYdKOLuJyq");
        setField(term95354, term95354.getClass(), "lastGameId", "WzRmLCtUaL");
        setField(term95354, term95354.getClass(), "lastRomVersion", "dqznIFBmKx");
        setField(term95354, term95354.getClass(), "lastDataVersion", "MhTJfnBVaz");
        setField(term95354, term95354.getClass(), "compatibleCmVersion", "tWJuxHLcBL");
        setField(term95354, term95354.getClass(), "lastPlayDate", "ZOcslmWgQG");
        setIntField(term95354, term95354.getClass(), "lastPlaceId", -1127199664);
        setField(term95354, term95354.getClass(), "lastPlaceName", "YzxEEHlDUj");
        setIntField(term95354, term95354.getClass(), "lastRegionId", 1977439964);
        setField(term95354, term95354.getClass(), "lastRegionName", "UcCUEwaHWp");
        setIntField(term95354, term95354.getClass(), "lastAllNetId", 1379432675);
        setField(term95354, term95354.getClass(), "lastClientId", "IZewAlURAW");
        setIntField(term95354, term95354.getClass(), "lastUsedDeckId", -1018695351);
        setIntField(term95354, term95354.getClass(), "lastPlayMusicLevel", 1080095535);
        setIntField(term95354, term95354.getClass(), "lastEmoneyBrand", 750963355);
        term95617 = new Integer(-1939304192);
        term95619 = new Integer(2062007036);
        term95621 = new Integer(2099511779);
        term95623 = new Integer(2039235808);
        term95625 = new Integer(-815715514);
        term95627 = new Boolean(false);
        term95629 = new Boolean(false);
        term95631 = new Integer(1890131657);
        term95633 = new Integer(-910332885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = boolean.class;
        argTypes[8] = boolean.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        Object[] args = new Object[11];
        args[0] = term95352;
        args[1] = term95354;
        args[2] = term95617;
        args[3] = term95619;
        args[4] = term95621;
        args[5] = term95623;
        args[6] = term95625;
        args[7] = term95627;
        args[8] = term95629;
        args[9] = term95631;
        args[10] = term95633;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


