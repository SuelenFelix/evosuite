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

public class UserLoginBonus_getBonusCount_1884825204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302579;

    public UserLoginBonus_getBonusCount_1884825204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term302585 = new Long(-7006877527579112761L);
        term302579 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus"));
        Object term302581 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term302583 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term302599 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term302600 = newInstance(Class.forName("java.time.LocalDate"));
        Object term302604 = newInstance(Class.forName("java.time.LocalTime"));
        Object term302609 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term302610 = newInstance(Class.forName("java.time.LocalDate"));
        Object term302614 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term302579, term302579.getClass(), "id", -7294700241550735389L);
        setLongField(term302581, term302581.getClass(), "id", 8585820644585618848L);
        setLongField(term302583, term302583.getClass(), "id", -507622671897389215L);
        setField(term302583, term302583.getClass(), "extId", term302585);
        setField(term302583, term302583.getClass(), "luid", "HklBHhsDkb");
        setIntField(term302600, term302600.getClass(), "year", 2012);
        setShortField(term302600, term302600.getClass(), "month", (short) 5);
        setShortField(term302600, term302600.getClass(), "day", (short) 22);
        setField(term302599, term302599.getClass(), "date", term302600);
        setByteField(term302604, term302604.getClass(), "hour", (byte) 7);
        setByteField(term302604, term302604.getClass(), "minute", (byte) 0);
        setByteField(term302604, term302604.getClass(), "second", (byte) 47);
        setIntField(term302604, term302604.getClass(), "nano", 842087051);
        setField(term302599, term302599.getClass(), "time", term302604);
        setField(term302583, term302583.getClass(), "registerTime", term302599);
        setIntField(term302610, term302610.getClass(), "year", 2013);
        setShortField(term302610, term302610.getClass(), "month", (short) 11);
        setShortField(term302610, term302610.getClass(), "day", (short) 22);
        setField(term302609, term302609.getClass(), "date", term302610);
        setByteField(term302614, term302614.getClass(), "hour", (byte) 6);
        setByteField(term302614, term302614.getClass(), "minute", (byte) 36);
        setByteField(term302614, term302614.getClass(), "second", (byte) 20);
        setIntField(term302614, term302614.getClass(), "nano", 27868395);
        setField(term302609, term302609.getClass(), "time", term302614);
        setField(term302583, term302583.getClass(), "accessTime", term302609);
        setField(term302581, term302581.getClass(), "card", term302583);
        setField(term302581, term302581.getClass(), "userName", "ZUfzXzppnP");
        setIntField(term302581, term302581.getClass(), "level", 1067987457);
        setIntField(term302581, term302581.getClass(), "reincarnationNum", -1210069630);
        setLongField(term302581, term302581.getClass(), "exp", 4874767579194649895L);
        setLongField(term302581, term302581.getClass(), "point", 1191413747686886007L);
        setLongField(term302581, term302581.getClass(), "totalPoint", 7391593304991204720L);
        setIntField(term302581, term302581.getClass(), "playCount", -483893136);
        setIntField(term302581, term302581.getClass(), "jewelCount", -81101921);
        setIntField(term302581, term302581.getClass(), "totalJewelCount", 437331772);
        setIntField(term302581, term302581.getClass(), "medalCount", -652439257);
        setIntField(term302581, term302581.getClass(), "playerRating", 1491052596);
        setIntField(term302581, term302581.getClass(), "highestRating", -1733785472);
        setIntField(term302581, term302581.getClass(), "battlePoint", 1662847954);
        setIntField(term302581, term302581.getClass(), "bestBattlePoint", -1470955401);
        setIntField(term302581, term302581.getClass(), "overDamageBattlePoint", -417898084);
        setBooleanField(term302581, term302581.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term302581, term302581.getClass(), "nameplateId", -1194653607);
        setIntField(term302581, term302581.getClass(), "trophyId", 73757499);
        setIntField(term302581, term302581.getClass(), "cardId", -623484638);
        setIntField(term302581, term302581.getClass(), "characterId", 1426273738);
        setIntField(term302581, term302581.getClass(), "characterVoiceNo", 480242845);
        setIntField(term302581, term302581.getClass(), "tabSetting", -1206549451);
        setIntField(term302581, term302581.getClass(), "tabSortSetting", -1921601106);
        setIntField(term302581, term302581.getClass(), "cardCategorySetting", -117113193);
        setIntField(term302581, term302581.getClass(), "cardSortSetting", -873638626);
        setIntField(term302581, term302581.getClass(), "rivalScoreCategorySetting", 1185521147);
        setIntField(term302581, term302581.getClass(), "playedTutorialBit", 561428635);
        setIntField(term302581, term302581.getClass(), "firstTutorialCancelNum", 205230316);
        setLongField(term302581, term302581.getClass(), "sumTechHighScore", -8877889962022168237L);
        setLongField(term302581, term302581.getClass(), "sumTechBasicHighScore", -5441176351917599642L);
        setLongField(term302581, term302581.getClass(), "sumTechAdvancedHighScore", -7274456636727300271L);
        setLongField(term302581, term302581.getClass(), "sumTechExpertHighScore", 2075087414447780972L);
        setLongField(term302581, term302581.getClass(), "sumTechMasterHighScore", -511397141648439395L);
        setLongField(term302581, term302581.getClass(), "sumTechLunaticHighScore", 6941455432225190821L);
        setLongField(term302581, term302581.getClass(), "sumBattleHighScore", -5866436286229647332L);
        setLongField(term302581, term302581.getClass(), "sumBattleBasicHighScore", -1305947575084422290L);
        setLongField(term302581, term302581.getClass(), "sumBattleAdvancedHighScore", 7424854401966888588L);
        setLongField(term302581, term302581.getClass(), "sumBattleExpertHighScore", 8435017036780391471L);
        setLongField(term302581, term302581.getClass(), "sumBattleMasterHighScore", -5671600515399449623L);
        setLongField(term302581, term302581.getClass(), "sumBattleLunaticHighScore", 2398053935899828563L);
        setField(term302581, term302581.getClass(), "eventWatchedDate", "JArWBUFihn");
        setField(term302581, term302581.getClass(), "cmEventWatchedDate", "mxKkHWbIdc");
        setField(term302581, term302581.getClass(), "firstGameId", "DXZXekQqdI");
        setField(term302581, term302581.getClass(), "firstRomVersion", "tShkCaETwQ");
        setField(term302581, term302581.getClass(), "firstDataVersion", "wxocsXiNGF");
        setField(term302581, term302581.getClass(), "firstPlayDate", "EAGSkuusTi");
        setField(term302581, term302581.getClass(), "lastGameId", "nLcDCcZnti");
        setField(term302581, term302581.getClass(), "lastRomVersion", "cMdtJSLDoI");
        setField(term302581, term302581.getClass(), "lastDataVersion", "OEbkXHDUoo");
        setField(term302581, term302581.getClass(), "compatibleCmVersion", "UyjyaUEUez");
        setField(term302581, term302581.getClass(), "lastPlayDate", "CXqnqOaCpS");
        setIntField(term302581, term302581.getClass(), "lastPlaceId", 1345662419);
        setField(term302581, term302581.getClass(), "lastPlaceName", "YdWKzbJowD");
        setIntField(term302581, term302581.getClass(), "lastRegionId", 1340578998);
        setField(term302581, term302581.getClass(), "lastRegionName", "CvmHBQYzyE");
        setIntField(term302581, term302581.getClass(), "lastAllNetId", -1900977720);
        setField(term302581, term302581.getClass(), "lastClientId", "xXJogHyQGl");
        setIntField(term302581, term302581.getClass(), "lastUsedDeckId", 109271119);
        setIntField(term302581, term302581.getClass(), "lastPlayMusicLevel", 825124058);
        setIntField(term302581, term302581.getClass(), "lastEmoneyBrand", 1957851443);
        setField(term302579, term302579.getClass(), "user", term302581);
        setIntField(term302579, term302579.getClass(), "bonusId", 1055723029);
        setIntField(term302579, term302579.getClass(), "bonusCount", 2108463040);
        setField(term302579, term302579.getClass(), "lastUpdateDate", "AiiSXqnafr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBonusCount", argTypes, term302579, args);
    }

};


