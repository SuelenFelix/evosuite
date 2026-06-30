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

public class UserOption_getTapSound_107228473110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313071;

    public UserOption_getTapSound_107228473110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term313077 = new Long(8931772176819893873L);
        term313071 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term313073 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term313075 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term313091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term313101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313106 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term313071, term313071.getClass(), "id", -4518909364986026779L);
        setLongField(term313073, term313073.getClass(), "id", 7436948230191634203L);
        setLongField(term313075, term313075.getClass(), "id", -8371360127926366740L);
        setField(term313075, term313075.getClass(), "extId", term313077);
        setField(term313075, term313075.getClass(), "luid", "WohVHpctDb");
        setIntField(term313092, term313092.getClass(), "year", 2024);
        setShortField(term313092, term313092.getClass(), "month", (short) 1);
        setShortField(term313092, term313092.getClass(), "day", (short) 16);
        setField(term313091, term313091.getClass(), "date", term313092);
        setByteField(term313096, term313096.getClass(), "hour", (byte) 19);
        setByteField(term313096, term313096.getClass(), "minute", (byte) 24);
        setByteField(term313096, term313096.getClass(), "second", (byte) 37);
        setIntField(term313096, term313096.getClass(), "nano", 310724537);
        setField(term313091, term313091.getClass(), "time", term313096);
        setField(term313075, term313075.getClass(), "registerTime", term313091);
        setIntField(term313102, term313102.getClass(), "year", 2018);
        setShortField(term313102, term313102.getClass(), "month", (short) 1);
        setShortField(term313102, term313102.getClass(), "day", (short) 11);
        setField(term313101, term313101.getClass(), "date", term313102);
        setByteField(term313106, term313106.getClass(), "hour", (byte) 22);
        setByteField(term313106, term313106.getClass(), "minute", (byte) 49);
        setByteField(term313106, term313106.getClass(), "second", (byte) 21);
        setIntField(term313106, term313106.getClass(), "nano", 384803149);
        setField(term313101, term313101.getClass(), "time", term313106);
        setField(term313075, term313075.getClass(), "accessTime", term313101);
        setField(term313073, term313073.getClass(), "card", term313075);
        setField(term313073, term313073.getClass(), "userName", "BGfsLiPDgD");
        setIntField(term313073, term313073.getClass(), "level", -1259795501);
        setIntField(term313073, term313073.getClass(), "reincarnationNum", 2135167581);
        setLongField(term313073, term313073.getClass(), "exp", -2095948577529287073L);
        setLongField(term313073, term313073.getClass(), "point", 3630197622832600484L);
        setLongField(term313073, term313073.getClass(), "totalPoint", 5468520144370716904L);
        setIntField(term313073, term313073.getClass(), "playCount", -732115520);
        setIntField(term313073, term313073.getClass(), "jewelCount", 441210816);
        setIntField(term313073, term313073.getClass(), "totalJewelCount", 1491573390);
        setIntField(term313073, term313073.getClass(), "medalCount", -263423483);
        setIntField(term313073, term313073.getClass(), "playerRating", 1461876287);
        setIntField(term313073, term313073.getClass(), "highestRating", -2077900576);
        setIntField(term313073, term313073.getClass(), "battlePoint", 1315949345);
        setIntField(term313073, term313073.getClass(), "bestBattlePoint", -165571895);
        setIntField(term313073, term313073.getClass(), "overDamageBattlePoint", -1773441307);
        setBooleanField(term313073, term313073.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term313073, term313073.getClass(), "nameplateId", -205848544);
        setIntField(term313073, term313073.getClass(), "trophyId", -887384593);
        setIntField(term313073, term313073.getClass(), "cardId", -845902757);
        setIntField(term313073, term313073.getClass(), "characterId", 1259462576);
        setIntField(term313073, term313073.getClass(), "characterVoiceNo", 1096752196);
        setIntField(term313073, term313073.getClass(), "tabSetting", -796862449);
        setIntField(term313073, term313073.getClass(), "tabSortSetting", -1652791090);
        setIntField(term313073, term313073.getClass(), "cardCategorySetting", -1234698980);
        setIntField(term313073, term313073.getClass(), "cardSortSetting", 219686926);
        setIntField(term313073, term313073.getClass(), "rivalScoreCategorySetting", -1838719573);
        setIntField(term313073, term313073.getClass(), "playedTutorialBit", -428877223);
        setIntField(term313073, term313073.getClass(), "firstTutorialCancelNum", -1727427440);
        setLongField(term313073, term313073.getClass(), "sumTechHighScore", 4917812597653636966L);
        setLongField(term313073, term313073.getClass(), "sumTechBasicHighScore", 8876747287977424845L);
        setLongField(term313073, term313073.getClass(), "sumTechAdvancedHighScore", 2493191978428510846L);
        setLongField(term313073, term313073.getClass(), "sumTechExpertHighScore", -8301300458799031249L);
        setLongField(term313073, term313073.getClass(), "sumTechMasterHighScore", -9198703242475925267L);
        setLongField(term313073, term313073.getClass(), "sumTechLunaticHighScore", -3592619227282913890L);
        setLongField(term313073, term313073.getClass(), "sumBattleHighScore", 6410718077509555818L);
        setLongField(term313073, term313073.getClass(), "sumBattleBasicHighScore", -5671477264311690566L);
        setLongField(term313073, term313073.getClass(), "sumBattleAdvancedHighScore", -1743421886284239958L);
        setLongField(term313073, term313073.getClass(), "sumBattleExpertHighScore", 891943564567271453L);
        setLongField(term313073, term313073.getClass(), "sumBattleMasterHighScore", 1071538253053581793L);
        setLongField(term313073, term313073.getClass(), "sumBattleLunaticHighScore", 7084473603418395000L);
        setField(term313073, term313073.getClass(), "eventWatchedDate", "yLaQUBjMnt");
        setField(term313073, term313073.getClass(), "cmEventWatchedDate", "mkcRXETGnk");
        setField(term313073, term313073.getClass(), "firstGameId", "fGetqfuQPh");
        setField(term313073, term313073.getClass(), "firstRomVersion", "FgmlvXIJBW");
        setField(term313073, term313073.getClass(), "firstDataVersion", "kJeiktswgv");
        setField(term313073, term313073.getClass(), "firstPlayDate", "TKekvcxSzY");
        setField(term313073, term313073.getClass(), "lastGameId", "YEjRoxCQOP");
        setField(term313073, term313073.getClass(), "lastRomVersion", "xiwMNXuhDv");
        setField(term313073, term313073.getClass(), "lastDataVersion", "prjeAjeant");
        setField(term313073, term313073.getClass(), "compatibleCmVersion", "qZxkdvJOsd");
        setField(term313073, term313073.getClass(), "lastPlayDate", "ZvanAlshXP");
        setIntField(term313073, term313073.getClass(), "lastPlaceId", -838541413);
        setField(term313073, term313073.getClass(), "lastPlaceName", "JsHqsJhBWD");
        setIntField(term313073, term313073.getClass(), "lastRegionId", 547667338);
        setField(term313073, term313073.getClass(), "lastRegionName", "qxayeVXQhZ");
        setIntField(term313073, term313073.getClass(), "lastAllNetId", 555268442);
        setField(term313073, term313073.getClass(), "lastClientId", "SHVaBCTtHF");
        setIntField(term313073, term313073.getClass(), "lastUsedDeckId", -591610853);
        setIntField(term313073, term313073.getClass(), "lastPlayMusicLevel", 380909580);
        setIntField(term313073, term313073.getClass(), "lastEmoneyBrand", -828253718);
        setField(term313071, term313071.getClass(), "user", term313073);
        setIntField(term313071, term313071.getClass(), "optionSet", 1597658782);
        setIntField(term313071, term313071.getClass(), "speed", -1600372385);
        setIntField(term313071, term313071.getClass(), "mirror", -1988901529);
        setIntField(term313071, term313071.getClass(), "judgeTiming", 1316428434);
        setIntField(term313071, term313071.getClass(), "judgeAdjustment", 357838303);
        setIntField(term313071, term313071.getClass(), "abort", 1232073677);
        setIntField(term313071, term313071.getClass(), "stealthField", -1467737409);
        setIntField(term313071, term313071.getClass(), "tapSound", 1053406248);
        setIntField(term313071, term313071.getClass(), "volGuide", -379667315);
        setIntField(term313071, term313071.getClass(), "volAll", 632837650);
        setIntField(term313071, term313071.getClass(), "volTap", 1534101651);
        setIntField(term313071, term313071.getClass(), "volCrTap", 40210623);
        setIntField(term313071, term313071.getClass(), "volHold", -2034728751);
        setIntField(term313071, term313071.getClass(), "volSide", 644137680);
        setIntField(term313071, term313071.getClass(), "volFlick", -1900421772);
        setIntField(term313071, term313071.getClass(), "volBell", -197874252);
        setIntField(term313071, term313071.getClass(), "volEnemy", 1412785358);
        setIntField(term313071, term313071.getClass(), "volSkill", 410202257);
        setIntField(term313071, term313071.getClass(), "volDamage", -2082861847);
        setIntField(term313071, term313071.getClass(), "colorField", 1391329978);
        setIntField(term313071, term313071.getClass(), "colorLaneBright", 1336089129);
        setIntField(term313071, term313071.getClass(), "colorWallBright", -600588040);
        setIntField(term313071, term313071.getClass(), "colorLane", 664854678);
        setIntField(term313071, term313071.getClass(), "colorSide", -756857294);
        setIntField(term313071, term313071.getClass(), "effectDamage", -700896821);
        setIntField(term313071, term313071.getClass(), "effectPos", -338063559);
        setIntField(term313071, term313071.getClass(), "judgeDisp", 1648891802);
        setIntField(term313071, term313071.getClass(), "judgePos", 1928733375);
        setIntField(term313071, term313071.getClass(), "judgeBreak", 1536408549);
        setIntField(term313071, term313071.getClass(), "judgeHit", 1873113546);
        setIntField(term313071, term313071.getClass(), "platinumBreakDisp", -1046505415);
        setIntField(term313071, term313071.getClass(), "judgeCriticalBreak", -1590513127);
        setIntField(term313071, term313071.getClass(), "matching", -582722508);
        setIntField(term313071, term313071.getClass(), "dispPlayerLv", 1770955610);
        setIntField(term313071, term313071.getClass(), "dispRating", -258435141);
        setIntField(term313071, term313071.getClass(), "dispBP", -1525264094);
        setIntField(term313071, term313071.getClass(), "headphone", -1611383163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTapSound", argTypes, term313071, args);
    }

};


