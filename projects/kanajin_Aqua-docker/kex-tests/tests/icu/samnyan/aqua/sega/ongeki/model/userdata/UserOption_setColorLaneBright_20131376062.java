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

public class UserOption_setColorLaneBright_20131376062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337560;
     Object term337862;

    public UserOption_setColorLaneBright_20131376062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term337566 = new Long(-6206610574921547811L);
        term337560 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term337562 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term337564 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term337580 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term337581 = newInstance(Class.forName("java.time.LocalDate"));
        Object term337585 = newInstance(Class.forName("java.time.LocalTime"));
        Object term337590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term337591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term337595 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term337560, term337560.getClass(), "id", -1608845494544641328L);
        setLongField(term337562, term337562.getClass(), "id", -8064582724444959341L);
        setLongField(term337564, term337564.getClass(), "id", 8436100367053615781L);
        setField(term337564, term337564.getClass(), "extId", term337566);
        setField(term337564, term337564.getClass(), "luid", "FXSSjiCOco");
        setIntField(term337581, term337581.getClass(), "year", 2027);
        setShortField(term337581, term337581.getClass(), "month", (short) 9);
        setShortField(term337581, term337581.getClass(), "day", (short) 27);
        setField(term337580, term337580.getClass(), "date", term337581);
        setByteField(term337585, term337585.getClass(), "hour", (byte) 10);
        setByteField(term337585, term337585.getClass(), "minute", (byte) 43);
        setByteField(term337585, term337585.getClass(), "second", (byte) 29);
        setIntField(term337585, term337585.getClass(), "nano", 255303093);
        setField(term337580, term337580.getClass(), "time", term337585);
        setField(term337564, term337564.getClass(), "registerTime", term337580);
        setIntField(term337591, term337591.getClass(), "year", 2015);
        setShortField(term337591, term337591.getClass(), "month", (short) 10);
        setShortField(term337591, term337591.getClass(), "day", (short) 27);
        setField(term337590, term337590.getClass(), "date", term337591);
        setByteField(term337595, term337595.getClass(), "hour", (byte) 5);
        setByteField(term337595, term337595.getClass(), "minute", (byte) 21);
        setByteField(term337595, term337595.getClass(), "second", (byte) 50);
        setIntField(term337595, term337595.getClass(), "nano", 795619735);
        setField(term337590, term337590.getClass(), "time", term337595);
        setField(term337564, term337564.getClass(), "accessTime", term337590);
        setField(term337562, term337562.getClass(), "card", term337564);
        setField(term337562, term337562.getClass(), "userName", "kXCEmiluRH");
        setIntField(term337562, term337562.getClass(), "level", -433739653);
        setIntField(term337562, term337562.getClass(), "reincarnationNum", 1280913230);
        setLongField(term337562, term337562.getClass(), "exp", -4500988046225073531L);
        setLongField(term337562, term337562.getClass(), "point", 6150649770854973068L);
        setLongField(term337562, term337562.getClass(), "totalPoint", -7185628431706713997L);
        setIntField(term337562, term337562.getClass(), "playCount", -165337519);
        setIntField(term337562, term337562.getClass(), "jewelCount", -614897088);
        setIntField(term337562, term337562.getClass(), "totalJewelCount", -1208428955);
        setIntField(term337562, term337562.getClass(), "medalCount", 1421255899);
        setIntField(term337562, term337562.getClass(), "playerRating", -209156931);
        setIntField(term337562, term337562.getClass(), "highestRating", 1085147832);
        setIntField(term337562, term337562.getClass(), "battlePoint", 993987477);
        setIntField(term337562, term337562.getClass(), "bestBattlePoint", -1937524516);
        setIntField(term337562, term337562.getClass(), "overDamageBattlePoint", -1506820790);
        setBooleanField(term337562, term337562.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term337562, term337562.getClass(), "nameplateId", 132017940);
        setIntField(term337562, term337562.getClass(), "trophyId", 854450325);
        setIntField(term337562, term337562.getClass(), "cardId", -897775816);
        setIntField(term337562, term337562.getClass(), "characterId", -981127856);
        setIntField(term337562, term337562.getClass(), "characterVoiceNo", -1571223199);
        setIntField(term337562, term337562.getClass(), "tabSetting", -195000285);
        setIntField(term337562, term337562.getClass(), "tabSortSetting", -1232380087);
        setIntField(term337562, term337562.getClass(), "cardCategorySetting", 1857922489);
        setIntField(term337562, term337562.getClass(), "cardSortSetting", 1525147251);
        setIntField(term337562, term337562.getClass(), "rivalScoreCategorySetting", -1453895044);
        setIntField(term337562, term337562.getClass(), "playedTutorialBit", 1848491984);
        setIntField(term337562, term337562.getClass(), "firstTutorialCancelNum", 994437605);
        setLongField(term337562, term337562.getClass(), "sumTechHighScore", 4423892648993626209L);
        setLongField(term337562, term337562.getClass(), "sumTechBasicHighScore", -3661990817373119704L);
        setLongField(term337562, term337562.getClass(), "sumTechAdvancedHighScore", 1012021062728894114L);
        setLongField(term337562, term337562.getClass(), "sumTechExpertHighScore", 2837000041486669896L);
        setLongField(term337562, term337562.getClass(), "sumTechMasterHighScore", -8939197023249124746L);
        setLongField(term337562, term337562.getClass(), "sumTechLunaticHighScore", 3079601761822846717L);
        setLongField(term337562, term337562.getClass(), "sumBattleHighScore", -6063966938187546127L);
        setLongField(term337562, term337562.getClass(), "sumBattleBasicHighScore", -7711953690355286570L);
        setLongField(term337562, term337562.getClass(), "sumBattleAdvancedHighScore", 3124964952993763990L);
        setLongField(term337562, term337562.getClass(), "sumBattleExpertHighScore", 8964285946665091819L);
        setLongField(term337562, term337562.getClass(), "sumBattleMasterHighScore", -3768601036558264291L);
        setLongField(term337562, term337562.getClass(), "sumBattleLunaticHighScore", 2078331647939240516L);
        setField(term337562, term337562.getClass(), "eventWatchedDate", "cPhcOQNZzZ");
        setField(term337562, term337562.getClass(), "cmEventWatchedDate", "BMGDOpRTNy");
        setField(term337562, term337562.getClass(), "firstGameId", "sncYXgaBvq");
        setField(term337562, term337562.getClass(), "firstRomVersion", "mfUHkDZaIk");
        setField(term337562, term337562.getClass(), "firstDataVersion", "YgPDOKUqzz");
        setField(term337562, term337562.getClass(), "firstPlayDate", "YdnSnYhvAc");
        setField(term337562, term337562.getClass(), "lastGameId", "hSvzaodHpr");
        setField(term337562, term337562.getClass(), "lastRomVersion", "YfRaGHwBdR");
        setField(term337562, term337562.getClass(), "lastDataVersion", "arFaRpqMWw");
        setField(term337562, term337562.getClass(), "compatibleCmVersion", "wbwoFXnXWz");
        setField(term337562, term337562.getClass(), "lastPlayDate", "GVysWOMVsq");
        setIntField(term337562, term337562.getClass(), "lastPlaceId", -192901898);
        setField(term337562, term337562.getClass(), "lastPlaceName", "crOeGqTcwT");
        setIntField(term337562, term337562.getClass(), "lastRegionId", -1353342755);
        setField(term337562, term337562.getClass(), "lastRegionName", "MtKymqaPSE");
        setIntField(term337562, term337562.getClass(), "lastAllNetId", 2113052201);
        setField(term337562, term337562.getClass(), "lastClientId", "hoRdBWeRPt");
        setIntField(term337562, term337562.getClass(), "lastUsedDeckId", 726579405);
        setIntField(term337562, term337562.getClass(), "lastPlayMusicLevel", -45467197);
        setIntField(term337562, term337562.getClass(), "lastEmoneyBrand", 15535430);
        setField(term337560, term337560.getClass(), "user", term337562);
        setIntField(term337560, term337560.getClass(), "optionSet", -589173569);
        setIntField(term337560, term337560.getClass(), "speed", 2125317226);
        setIntField(term337560, term337560.getClass(), "mirror", 215682420);
        setIntField(term337560, term337560.getClass(), "judgeTiming", 153930368);
        setIntField(term337560, term337560.getClass(), "judgeAdjustment", -19098431);
        setIntField(term337560, term337560.getClass(), "abort", -1731445929);
        setIntField(term337560, term337560.getClass(), "stealthField", 1000472377);
        setIntField(term337560, term337560.getClass(), "tapSound", 1599635553);
        setIntField(term337560, term337560.getClass(), "volGuide", 302864149);
        setIntField(term337560, term337560.getClass(), "volAll", -1933457227);
        setIntField(term337560, term337560.getClass(), "volTap", -1434670867);
        setIntField(term337560, term337560.getClass(), "volCrTap", -1854265265);
        setIntField(term337560, term337560.getClass(), "volHold", 215107724);
        setIntField(term337560, term337560.getClass(), "volSide", 1732587086);
        setIntField(term337560, term337560.getClass(), "volFlick", 2044018788);
        setIntField(term337560, term337560.getClass(), "volBell", -74011134);
        setIntField(term337560, term337560.getClass(), "volEnemy", -1002087080);
        setIntField(term337560, term337560.getClass(), "volSkill", -1693852420);
        setIntField(term337560, term337560.getClass(), "volDamage", 949375494);
        setIntField(term337560, term337560.getClass(), "colorField", 1468356749);
        setIntField(term337560, term337560.getClass(), "colorLaneBright", -84035654);
        setIntField(term337560, term337560.getClass(), "colorWallBright", -1682690229);
        setIntField(term337560, term337560.getClass(), "colorLane", -1845030752);
        setIntField(term337560, term337560.getClass(), "colorSide", 585514910);
        setIntField(term337560, term337560.getClass(), "effectDamage", 1258991103);
        setIntField(term337560, term337560.getClass(), "effectPos", 436480605);
        setIntField(term337560, term337560.getClass(), "judgeDisp", -545501575);
        setIntField(term337560, term337560.getClass(), "judgePos", -1649127164);
        setIntField(term337560, term337560.getClass(), "judgeBreak", 1220852652);
        setIntField(term337560, term337560.getClass(), "judgeHit", 57731342);
        setIntField(term337560, term337560.getClass(), "platinumBreakDisp", -1661504604);
        setIntField(term337560, term337560.getClass(), "judgeCriticalBreak", 817080945);
        setIntField(term337560, term337560.getClass(), "matching", -48246280);
        setIntField(term337560, term337560.getClass(), "dispPlayerLv", 1315771735);
        setIntField(term337560, term337560.getClass(), "dispRating", -2020735596);
        setIntField(term337560, term337560.getClass(), "dispBP", -1211806847);
        setIntField(term337560, term337560.getClass(), "headphone", 1357757306);
        term337862 = new Integer(1294930935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term337862;
        callMethod(klass, "setColorLaneBright", argTypes, term337560, args);
    }

};


