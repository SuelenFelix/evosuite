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

public class UserData_getSumBattleExpertHighScore_19699463139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38415;

    public UserData_getSumBattleExpertHighScore_19699463139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term38419 = new Long(-8876856890348836498L);
        term38415 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term38417 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term38433 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38434 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38438 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38443 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38444 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38448 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term38415, term38415.getClass(), "id", -8031780876521881873L);
        setLongField(term38417, term38417.getClass(), "id", -8015150842907349869L);
        setField(term38417, term38417.getClass(), "extId", term38419);
        setField(term38417, term38417.getClass(), "luid", "PqhYfEyDDA");
        setIntField(term38434, term38434.getClass(), "year", 2029);
        setShortField(term38434, term38434.getClass(), "month", (short) 7);
        setShortField(term38434, term38434.getClass(), "day", (short) 14);
        setField(term38433, term38433.getClass(), "date", term38434);
        setByteField(term38438, term38438.getClass(), "hour", (byte) 17);
        setByteField(term38438, term38438.getClass(), "minute", (byte) 37);
        setByteField(term38438, term38438.getClass(), "second", (byte) 39);
        setIntField(term38438, term38438.getClass(), "nano", 333402299);
        setField(term38433, term38433.getClass(), "time", term38438);
        setField(term38417, term38417.getClass(), "registerTime", term38433);
        setIntField(term38444, term38444.getClass(), "year", 2025);
        setShortField(term38444, term38444.getClass(), "month", (short) 10);
        setShortField(term38444, term38444.getClass(), "day", (short) 30);
        setField(term38443, term38443.getClass(), "date", term38444);
        setByteField(term38448, term38448.getClass(), "hour", (byte) 1);
        setByteField(term38448, term38448.getClass(), "minute", (byte) 4);
        setByteField(term38448, term38448.getClass(), "second", (byte) 18);
        setIntField(term38448, term38448.getClass(), "nano", 717716253);
        setField(term38443, term38443.getClass(), "time", term38448);
        setField(term38417, term38417.getClass(), "accessTime", term38443);
        setField(term38415, term38415.getClass(), "card", term38417);
        setField(term38415, term38415.getClass(), "userName", "fSLHLeuNoa");
        setIntField(term38415, term38415.getClass(), "level", 1224219518);
        setIntField(term38415, term38415.getClass(), "reincarnationNum", 1466055196);
        setLongField(term38415, term38415.getClass(), "exp", 9132190239280924497L);
        setLongField(term38415, term38415.getClass(), "point", -8116658799088527026L);
        setLongField(term38415, term38415.getClass(), "totalPoint", 8485617704048210611L);
        setIntField(term38415, term38415.getClass(), "playCount", -1310910895);
        setIntField(term38415, term38415.getClass(), "jewelCount", -1504228047);
        setIntField(term38415, term38415.getClass(), "totalJewelCount", 1642235898);
        setIntField(term38415, term38415.getClass(), "medalCount", -719765151);
        setIntField(term38415, term38415.getClass(), "playerRating", 2039931383);
        setIntField(term38415, term38415.getClass(), "highestRating", -2109330879);
        setIntField(term38415, term38415.getClass(), "battlePoint", -1576801556);
        setIntField(term38415, term38415.getClass(), "bestBattlePoint", -1572718384);
        setIntField(term38415, term38415.getClass(), "overDamageBattlePoint", 1623201205);
        setBooleanField(term38415, term38415.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term38415, term38415.getClass(), "nameplateId", 259489188);
        setIntField(term38415, term38415.getClass(), "trophyId", 1709072289);
        setIntField(term38415, term38415.getClass(), "cardId", 688786687);
        setIntField(term38415, term38415.getClass(), "characterId", 1934256188);
        setIntField(term38415, term38415.getClass(), "characterVoiceNo", 1127725248);
        setIntField(term38415, term38415.getClass(), "tabSetting", 1789414533);
        setIntField(term38415, term38415.getClass(), "tabSortSetting", -1774273964);
        setIntField(term38415, term38415.getClass(), "cardCategorySetting", -1765697393);
        setIntField(term38415, term38415.getClass(), "cardSortSetting", 2101925650);
        setIntField(term38415, term38415.getClass(), "rivalScoreCategorySetting", -242176552);
        setIntField(term38415, term38415.getClass(), "playedTutorialBit", 776524710);
        setIntField(term38415, term38415.getClass(), "firstTutorialCancelNum", 1069095385);
        setLongField(term38415, term38415.getClass(), "sumTechHighScore", -2343035648899467663L);
        setLongField(term38415, term38415.getClass(), "sumTechBasicHighScore", -1155047331993508760L);
        setLongField(term38415, term38415.getClass(), "sumTechAdvancedHighScore", 3144720397872891648L);
        setLongField(term38415, term38415.getClass(), "sumTechExpertHighScore", -2622219131724744003L);
        setLongField(term38415, term38415.getClass(), "sumTechMasterHighScore", 9130132268364804177L);
        setLongField(term38415, term38415.getClass(), "sumTechLunaticHighScore", 7597058252879142457L);
        setLongField(term38415, term38415.getClass(), "sumBattleHighScore", -2916052431291931409L);
        setLongField(term38415, term38415.getClass(), "sumBattleBasicHighScore", 3771508378771734822L);
        setLongField(term38415, term38415.getClass(), "sumBattleAdvancedHighScore", 2727169839819823552L);
        setLongField(term38415, term38415.getClass(), "sumBattleExpertHighScore", -6164517614137158832L);
        setLongField(term38415, term38415.getClass(), "sumBattleMasterHighScore", 1093252632013547881L);
        setLongField(term38415, term38415.getClass(), "sumBattleLunaticHighScore", 8773809312823881228L);
        setField(term38415, term38415.getClass(), "eventWatchedDate", "IwgPFurObw");
        setField(term38415, term38415.getClass(), "cmEventWatchedDate", "WLaHlrYQyz");
        setField(term38415, term38415.getClass(), "firstGameId", "CaeIUTuUFo");
        setField(term38415, term38415.getClass(), "firstRomVersion", "rzoDGjHkzG");
        setField(term38415, term38415.getClass(), "firstDataVersion", "NsphHxYiuC");
        setField(term38415, term38415.getClass(), "firstPlayDate", "XYJztkznbY");
        setField(term38415, term38415.getClass(), "lastGameId", "NeTiWVoyjZ");
        setField(term38415, term38415.getClass(), "lastRomVersion", "CGeclMyIOP");
        setField(term38415, term38415.getClass(), "lastDataVersion", "yyWOYvIBsp");
        setField(term38415, term38415.getClass(), "compatibleCmVersion", "mmpgARMYFV");
        setField(term38415, term38415.getClass(), "lastPlayDate", "NUqhsZprdZ");
        setIntField(term38415, term38415.getClass(), "lastPlaceId", -1889206410);
        setField(term38415, term38415.getClass(), "lastPlaceName", "jkzgCqWJrA");
        setIntField(term38415, term38415.getClass(), "lastRegionId", -235874398);
        setField(term38415, term38415.getClass(), "lastRegionName", "rawiXxuyRn");
        setIntField(term38415, term38415.getClass(), "lastAllNetId", -978039004);
        setField(term38415, term38415.getClass(), "lastClientId", "ZyAecZGope");
        setIntField(term38415, term38415.getClass(), "lastUsedDeckId", 1162356859);
        setIntField(term38415, term38415.getClass(), "lastPlayMusicLevel", 175338916);
        setIntField(term38415, term38415.getClass(), "lastEmoneyBrand", -1484528924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleExpertHighScore", argTypes, term38415, args);
    }

};


