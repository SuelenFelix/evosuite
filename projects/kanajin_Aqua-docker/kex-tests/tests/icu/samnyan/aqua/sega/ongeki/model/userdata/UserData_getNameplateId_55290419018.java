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

public class UserData_getNameplateId_55290419018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29532;

    public UserData_getNameplateId_55290419018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29536 = new Long(463622836963501975L);
        term29532 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term29534 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term29550 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29551 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29555 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29560 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29561 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29565 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term29532, term29532.getClass(), "id", -8538252445590221089L);
        setLongField(term29534, term29534.getClass(), "id", -6690821836959514088L);
        setField(term29534, term29534.getClass(), "extId", term29536);
        setField(term29534, term29534.getClass(), "luid", "JayazbYDLK");
        setIntField(term29551, term29551.getClass(), "year", 2020);
        setShortField(term29551, term29551.getClass(), "month", (short) 10);
        setShortField(term29551, term29551.getClass(), "day", (short) 8);
        setField(term29550, term29550.getClass(), "date", term29551);
        setByteField(term29555, term29555.getClass(), "hour", (byte) 15);
        setByteField(term29555, term29555.getClass(), "minute", (byte) 57);
        setByteField(term29555, term29555.getClass(), "second", (byte) 17);
        setIntField(term29555, term29555.getClass(), "nano", 288139529);
        setField(term29550, term29550.getClass(), "time", term29555);
        setField(term29534, term29534.getClass(), "registerTime", term29550);
        setIntField(term29561, term29561.getClass(), "year", 2022);
        setShortField(term29561, term29561.getClass(), "month", (short) 6);
        setShortField(term29561, term29561.getClass(), "day", (short) 12);
        setField(term29560, term29560.getClass(), "date", term29561);
        setByteField(term29565, term29565.getClass(), "hour", (byte) 14);
        setByteField(term29565, term29565.getClass(), "minute", (byte) 3);
        setByteField(term29565, term29565.getClass(), "second", (byte) 7);
        setIntField(term29565, term29565.getClass(), "nano", 637592645);
        setField(term29560, term29560.getClass(), "time", term29565);
        setField(term29534, term29534.getClass(), "accessTime", term29560);
        setField(term29532, term29532.getClass(), "card", term29534);
        setField(term29532, term29532.getClass(), "userName", "ORDuSTrpNA");
        setIntField(term29532, term29532.getClass(), "level", -378961519);
        setIntField(term29532, term29532.getClass(), "reincarnationNum", -400280008);
        setLongField(term29532, term29532.getClass(), "exp", 5914687538634916345L);
        setLongField(term29532, term29532.getClass(), "point", -1596611740124054468L);
        setLongField(term29532, term29532.getClass(), "totalPoint", -7304801244306393588L);
        setIntField(term29532, term29532.getClass(), "playCount", -1191957775);
        setIntField(term29532, term29532.getClass(), "jewelCount", 14181775);
        setIntField(term29532, term29532.getClass(), "totalJewelCount", 667778327);
        setIntField(term29532, term29532.getClass(), "medalCount", 395074450);
        setIntField(term29532, term29532.getClass(), "playerRating", -2028511200);
        setIntField(term29532, term29532.getClass(), "highestRating", 1415605360);
        setIntField(term29532, term29532.getClass(), "battlePoint", 896275171);
        setIntField(term29532, term29532.getClass(), "bestBattlePoint", 466010);
        setIntField(term29532, term29532.getClass(), "overDamageBattlePoint", -169463842);
        setBooleanField(term29532, term29532.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term29532, term29532.getClass(), "nameplateId", -2106837394);
        setIntField(term29532, term29532.getClass(), "trophyId", -533202192);
        setIntField(term29532, term29532.getClass(), "cardId", -1349617857);
        setIntField(term29532, term29532.getClass(), "characterId", 1346331516);
        setIntField(term29532, term29532.getClass(), "characterVoiceNo", 1018925421);
        setIntField(term29532, term29532.getClass(), "tabSetting", -1658031378);
        setIntField(term29532, term29532.getClass(), "tabSortSetting", -863483345);
        setIntField(term29532, term29532.getClass(), "cardCategorySetting", -1722702406);
        setIntField(term29532, term29532.getClass(), "cardSortSetting", 549278914);
        setIntField(term29532, term29532.getClass(), "rivalScoreCategorySetting", -1490125498);
        setIntField(term29532, term29532.getClass(), "playedTutorialBit", -1443119347);
        setIntField(term29532, term29532.getClass(), "firstTutorialCancelNum", 1962181481);
        setLongField(term29532, term29532.getClass(), "sumTechHighScore", 1676018795123486151L);
        setLongField(term29532, term29532.getClass(), "sumTechBasicHighScore", 8578275227150470673L);
        setLongField(term29532, term29532.getClass(), "sumTechAdvancedHighScore", -2637969624924642017L);
        setLongField(term29532, term29532.getClass(), "sumTechExpertHighScore", 1486119760230388070L);
        setLongField(term29532, term29532.getClass(), "sumTechMasterHighScore", 8298987863520566549L);
        setLongField(term29532, term29532.getClass(), "sumTechLunaticHighScore", 4361302085818491893L);
        setLongField(term29532, term29532.getClass(), "sumBattleHighScore", -2025074482272457806L);
        setLongField(term29532, term29532.getClass(), "sumBattleBasicHighScore", -5564465000971559787L);
        setLongField(term29532, term29532.getClass(), "sumBattleAdvancedHighScore", -6320896470659278539L);
        setLongField(term29532, term29532.getClass(), "sumBattleExpertHighScore", 1357834364621364655L);
        setLongField(term29532, term29532.getClass(), "sumBattleMasterHighScore", 5242528388479853404L);
        setLongField(term29532, term29532.getClass(), "sumBattleLunaticHighScore", -9094760859641883612L);
        setField(term29532, term29532.getClass(), "eventWatchedDate", "hysThIPoEJ");
        setField(term29532, term29532.getClass(), "cmEventWatchedDate", "dfZepHfGwh");
        setField(term29532, term29532.getClass(), "firstGameId", "zjfMxUERFZ");
        setField(term29532, term29532.getClass(), "firstRomVersion", "ooVlhmiOff");
        setField(term29532, term29532.getClass(), "firstDataVersion", "dUNzDLXJcj");
        setField(term29532, term29532.getClass(), "firstPlayDate", "OrVSjRJVwa");
        setField(term29532, term29532.getClass(), "lastGameId", "cdZEcINJAM");
        setField(term29532, term29532.getClass(), "lastRomVersion", "qumYSwcWHz");
        setField(term29532, term29532.getClass(), "lastDataVersion", "raNzcEorkV");
        setField(term29532, term29532.getClass(), "compatibleCmVersion", "nEgozCeoUr");
        setField(term29532, term29532.getClass(), "lastPlayDate", "EWGMzlcOnW");
        setIntField(term29532, term29532.getClass(), "lastPlaceId", 1798831879);
        setField(term29532, term29532.getClass(), "lastPlaceName", "XeSDJYKMBf");
        setIntField(term29532, term29532.getClass(), "lastRegionId", 1393855580);
        setField(term29532, term29532.getClass(), "lastRegionName", "tIsFcOGTUX");
        setIntField(term29532, term29532.getClass(), "lastAllNetId", -849064032);
        setField(term29532, term29532.getClass(), "lastClientId", "XUVRcnELFP");
        setIntField(term29532, term29532.getClass(), "lastUsedDeckId", -184659375);
        setIntField(term29532, term29532.getClass(), "lastPlayMusicLevel", 629005618);
        setIntField(term29532, term29532.getClass(), "lastEmoneyBrand", -2006508013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameplateId", argTypes, term29532, args);
    }

};


