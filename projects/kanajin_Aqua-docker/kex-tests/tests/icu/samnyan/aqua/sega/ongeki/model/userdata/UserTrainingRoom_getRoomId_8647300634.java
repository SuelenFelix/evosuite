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

public class UserTrainingRoom_getRoomId_8647300634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14771;

    public UserTrainingRoom_getRoomId_8647300634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14777 = new Long(-484994522244390100L);
        term14771 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        Object term14773 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term14775 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term14791 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14792 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14796 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14801 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14802 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14806 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term14771, term14771.getClass(), "id", -8697239524885136781L);
        setLongField(term14773, term14773.getClass(), "id", 6465539339431559532L);
        setLongField(term14775, term14775.getClass(), "id", -5304831679802174866L);
        setField(term14775, term14775.getClass(), "extId", term14777);
        setField(term14775, term14775.getClass(), "luid", "PNoWXrsFic");
        setIntField(term14792, term14792.getClass(), "year", 2028);
        setShortField(term14792, term14792.getClass(), "month", (short) 4);
        setShortField(term14792, term14792.getClass(), "day", (short) 1);
        setField(term14791, term14791.getClass(), "date", term14792);
        setByteField(term14796, term14796.getClass(), "hour", (byte) 16);
        setByteField(term14796, term14796.getClass(), "minute", (byte) 22);
        setByteField(term14796, term14796.getClass(), "second", (byte) 32);
        setIntField(term14796, term14796.getClass(), "nano", 406353763);
        setField(term14791, term14791.getClass(), "time", term14796);
        setField(term14775, term14775.getClass(), "registerTime", term14791);
        setIntField(term14802, term14802.getClass(), "year", 2019);
        setShortField(term14802, term14802.getClass(), "month", (short) 7);
        setShortField(term14802, term14802.getClass(), "day", (short) 19);
        setField(term14801, term14801.getClass(), "date", term14802);
        setByteField(term14806, term14806.getClass(), "hour", (byte) 10);
        setByteField(term14806, term14806.getClass(), "minute", (byte) 54);
        setByteField(term14806, term14806.getClass(), "second", (byte) 55);
        setIntField(term14806, term14806.getClass(), "nano", 244650454);
        setField(term14801, term14801.getClass(), "time", term14806);
        setField(term14775, term14775.getClass(), "accessTime", term14801);
        setField(term14773, term14773.getClass(), "card", term14775);
        setField(term14773, term14773.getClass(), "userName", "QZBHZqZope");
        setIntField(term14773, term14773.getClass(), "level", -1514240086);
        setIntField(term14773, term14773.getClass(), "reincarnationNum", 2052244839);
        setLongField(term14773, term14773.getClass(), "exp", 1909175111101717943L);
        setLongField(term14773, term14773.getClass(), "point", 8499930868919012909L);
        setLongField(term14773, term14773.getClass(), "totalPoint", 6252795312796363233L);
        setIntField(term14773, term14773.getClass(), "playCount", -1763480506);
        setIntField(term14773, term14773.getClass(), "jewelCount", -1541297110);
        setIntField(term14773, term14773.getClass(), "totalJewelCount", -1581464804);
        setIntField(term14773, term14773.getClass(), "medalCount", -1954937310);
        setIntField(term14773, term14773.getClass(), "playerRating", -460657407);
        setIntField(term14773, term14773.getClass(), "highestRating", 941003590);
        setIntField(term14773, term14773.getClass(), "battlePoint", -1825624890);
        setIntField(term14773, term14773.getClass(), "bestBattlePoint", 413214164);
        setIntField(term14773, term14773.getClass(), "overDamageBattlePoint", 355911655);
        setBooleanField(term14773, term14773.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term14773, term14773.getClass(), "nameplateId", 1811833766);
        setIntField(term14773, term14773.getClass(), "trophyId", 735987104);
        setIntField(term14773, term14773.getClass(), "cardId", -1784072578);
        setIntField(term14773, term14773.getClass(), "characterId", 2011764585);
        setIntField(term14773, term14773.getClass(), "characterVoiceNo", -860680764);
        setIntField(term14773, term14773.getClass(), "tabSetting", -963198667);
        setIntField(term14773, term14773.getClass(), "tabSortSetting", -1007935918);
        setIntField(term14773, term14773.getClass(), "cardCategorySetting", 1485731037);
        setIntField(term14773, term14773.getClass(), "cardSortSetting", 1304396087);
        setIntField(term14773, term14773.getClass(), "rivalScoreCategorySetting", 1782600602);
        setIntField(term14773, term14773.getClass(), "playedTutorialBit", -185892708);
        setIntField(term14773, term14773.getClass(), "firstTutorialCancelNum", -203163250);
        setLongField(term14773, term14773.getClass(), "sumTechHighScore", 3968143267572761057L);
        setLongField(term14773, term14773.getClass(), "sumTechBasicHighScore", 2712394591642260550L);
        setLongField(term14773, term14773.getClass(), "sumTechAdvancedHighScore", -1211273460223868511L);
        setLongField(term14773, term14773.getClass(), "sumTechExpertHighScore", -8172564209423941839L);
        setLongField(term14773, term14773.getClass(), "sumTechMasterHighScore", -4561371668792438386L);
        setLongField(term14773, term14773.getClass(), "sumTechLunaticHighScore", 7065003857377879971L);
        setLongField(term14773, term14773.getClass(), "sumBattleHighScore", 2243864141567980599L);
        setLongField(term14773, term14773.getClass(), "sumBattleBasicHighScore", 353705949229610067L);
        setLongField(term14773, term14773.getClass(), "sumBattleAdvancedHighScore", 3288572082902580031L);
        setLongField(term14773, term14773.getClass(), "sumBattleExpertHighScore", -8698230272673009418L);
        setLongField(term14773, term14773.getClass(), "sumBattleMasterHighScore", -8792567429538693571L);
        setLongField(term14773, term14773.getClass(), "sumBattleLunaticHighScore", 3810487266967550400L);
        setField(term14773, term14773.getClass(), "eventWatchedDate", "VBUahCvyxC");
        setField(term14773, term14773.getClass(), "cmEventWatchedDate", "MlzTkzKMCX");
        setField(term14773, term14773.getClass(), "firstGameId", "UqKUbMyPMJ");
        setField(term14773, term14773.getClass(), "firstRomVersion", "QpYltHAdyY");
        setField(term14773, term14773.getClass(), "firstDataVersion", "lbmSGBwIiV");
        setField(term14773, term14773.getClass(), "firstPlayDate", "DAxyHoTLzZ");
        setField(term14773, term14773.getClass(), "lastGameId", "fhZgTouhCC");
        setField(term14773, term14773.getClass(), "lastRomVersion", "wrikqJwXvL");
        setField(term14773, term14773.getClass(), "lastDataVersion", "UiWhvbypdr");
        setField(term14773, term14773.getClass(), "compatibleCmVersion", "CgleElJNje");
        setField(term14773, term14773.getClass(), "lastPlayDate", "ZrchvNGMtd");
        setIntField(term14773, term14773.getClass(), "lastPlaceId", 498473526);
        setField(term14773, term14773.getClass(), "lastPlaceName", "WaEcyVlcIx");
        setIntField(term14773, term14773.getClass(), "lastRegionId", 1186917020);
        setField(term14773, term14773.getClass(), "lastRegionName", "ONcbPCQnHd");
        setIntField(term14773, term14773.getClass(), "lastAllNetId", 1670041824);
        setField(term14773, term14773.getClass(), "lastClientId", "AobDaplFLl");
        setIntField(term14773, term14773.getClass(), "lastUsedDeckId", 2140388634);
        setIntField(term14773, term14773.getClass(), "lastPlayMusicLevel", 21095258);
        setIntField(term14773, term14773.getClass(), "lastEmoneyBrand", -1793997256);
        setField(term14771, term14771.getClass(), "user", term14773);
        setField(term14771, term14771.getClass(), "authKey", "pDkMNnAGgv");
        setIntField(term14771, term14771.getClass(), "roomId", -1271598018);
        setIntField(term14771, term14771.getClass(), "cardId", 157967613);
        setField(term14771, term14771.getClass(), "valueDate", "PaCpFXGzdX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoomId", argTypes, term14771, args);
    }

};


