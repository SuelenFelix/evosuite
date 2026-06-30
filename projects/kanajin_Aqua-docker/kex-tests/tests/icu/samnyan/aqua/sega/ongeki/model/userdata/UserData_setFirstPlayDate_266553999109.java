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

public class UserData_setFirstPlayDate_266553999109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68283;

    public UserData_setFirstPlayDate_266553999109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term68287 = new Long(4100236067313034103L);
        term68283 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term68285 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term68301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68306 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68316 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term68283, term68283.getClass(), "id", -6838907525371973667L);
        setLongField(term68285, term68285.getClass(), "id", -7024469480394415540L);
        setField(term68285, term68285.getClass(), "extId", term68287);
        setField(term68285, term68285.getClass(), "luid", "xCNDHQZBKx");
        setIntField(term68302, term68302.getClass(), "year", 2010);
        setShortField(term68302, term68302.getClass(), "month", (short) 5);
        setShortField(term68302, term68302.getClass(), "day", (short) 21);
        setField(term68301, term68301.getClass(), "date", term68302);
        setByteField(term68306, term68306.getClass(), "hour", (byte) 2);
        setByteField(term68306, term68306.getClass(), "minute", (byte) 7);
        setByteField(term68306, term68306.getClass(), "second", (byte) 22);
        setIntField(term68306, term68306.getClass(), "nano", 178273852);
        setField(term68301, term68301.getClass(), "time", term68306);
        setField(term68285, term68285.getClass(), "registerTime", term68301);
        setIntField(term68312, term68312.getClass(), "year", 2020);
        setShortField(term68312, term68312.getClass(), "month", (short) 7);
        setShortField(term68312, term68312.getClass(), "day", (short) 27);
        setField(term68311, term68311.getClass(), "date", term68312);
        setByteField(term68316, term68316.getClass(), "hour", (byte) 23);
        setByteField(term68316, term68316.getClass(), "minute", (byte) 41);
        setByteField(term68316, term68316.getClass(), "second", (byte) 32);
        setIntField(term68316, term68316.getClass(), "nano", 523353963);
        setField(term68311, term68311.getClass(), "time", term68316);
        setField(term68285, term68285.getClass(), "accessTime", term68311);
        setField(term68283, term68283.getClass(), "card", term68285);
        setField(term68283, term68283.getClass(), "userName", "OfXdotjbuM");
        setIntField(term68283, term68283.getClass(), "level", 2114133243);
        setIntField(term68283, term68283.getClass(), "reincarnationNum", -1108430202);
        setLongField(term68283, term68283.getClass(), "exp", 8192919049584536731L);
        setLongField(term68283, term68283.getClass(), "point", 661658911296323350L);
        setLongField(term68283, term68283.getClass(), "totalPoint", 2352206876218352319L);
        setIntField(term68283, term68283.getClass(), "playCount", 972569482);
        setIntField(term68283, term68283.getClass(), "jewelCount", -924513639);
        setIntField(term68283, term68283.getClass(), "totalJewelCount", -1763498118);
        setIntField(term68283, term68283.getClass(), "medalCount", -1084106934);
        setIntField(term68283, term68283.getClass(), "playerRating", -1137769039);
        setIntField(term68283, term68283.getClass(), "highestRating", 753769464);
        setIntField(term68283, term68283.getClass(), "battlePoint", -2025824446);
        setIntField(term68283, term68283.getClass(), "bestBattlePoint", -203123521);
        setIntField(term68283, term68283.getClass(), "overDamageBattlePoint", 2107969370);
        setBooleanField(term68283, term68283.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term68283, term68283.getClass(), "nameplateId", -1606896209);
        setIntField(term68283, term68283.getClass(), "trophyId", 1824801079);
        setIntField(term68283, term68283.getClass(), "cardId", 1191665770);
        setIntField(term68283, term68283.getClass(), "characterId", -401274751);
        setIntField(term68283, term68283.getClass(), "characterVoiceNo", 2063937149);
        setIntField(term68283, term68283.getClass(), "tabSetting", 166881458);
        setIntField(term68283, term68283.getClass(), "tabSortSetting", 828853234);
        setIntField(term68283, term68283.getClass(), "cardCategorySetting", 1203278976);
        setIntField(term68283, term68283.getClass(), "cardSortSetting", 751787241);
        setIntField(term68283, term68283.getClass(), "rivalScoreCategorySetting", 477748320);
        setIntField(term68283, term68283.getClass(), "playedTutorialBit", 512793147);
        setIntField(term68283, term68283.getClass(), "firstTutorialCancelNum", -2061386860);
        setLongField(term68283, term68283.getClass(), "sumTechHighScore", -7692507274255908488L);
        setLongField(term68283, term68283.getClass(), "sumTechBasicHighScore", 2508296380707148646L);
        setLongField(term68283, term68283.getClass(), "sumTechAdvancedHighScore", -471151828695812251L);
        setLongField(term68283, term68283.getClass(), "sumTechExpertHighScore", -7531297671326780727L);
        setLongField(term68283, term68283.getClass(), "sumTechMasterHighScore", -6655674259185118023L);
        setLongField(term68283, term68283.getClass(), "sumTechLunaticHighScore", 687177988860711911L);
        setLongField(term68283, term68283.getClass(), "sumBattleHighScore", -2747979550793547397L);
        setLongField(term68283, term68283.getClass(), "sumBattleBasicHighScore", 9109639281020807778L);
        setLongField(term68283, term68283.getClass(), "sumBattleAdvancedHighScore", 6914197512599341154L);
        setLongField(term68283, term68283.getClass(), "sumBattleExpertHighScore", -6395079400634628442L);
        setLongField(term68283, term68283.getClass(), "sumBattleMasterHighScore", 7082509513795758490L);
        setLongField(term68283, term68283.getClass(), "sumBattleLunaticHighScore", 6894785617640026192L);
        setField(term68283, term68283.getClass(), "eventWatchedDate", "DNkENYBesD");
        setField(term68283, term68283.getClass(), "cmEventWatchedDate", "TSogTVVlxc");
        setField(term68283, term68283.getClass(), "firstGameId", "kWEJlReukq");
        setField(term68283, term68283.getClass(), "firstRomVersion", "jkCUxevJxb");
        setField(term68283, term68283.getClass(), "firstDataVersion", "WqobQIRpLc");
        setField(term68283, term68283.getClass(), "firstPlayDate", "jesZbitPYU");
        setField(term68283, term68283.getClass(), "lastGameId", "oIbEvXxpda");
        setField(term68283, term68283.getClass(), "lastRomVersion", "QyHVDeaOqb");
        setField(term68283, term68283.getClass(), "lastDataVersion", "ZwnEWySrcE");
        setField(term68283, term68283.getClass(), "compatibleCmVersion", "laQWfyDqCq");
        setField(term68283, term68283.getClass(), "lastPlayDate", "gMFGfpbPZE");
        setIntField(term68283, term68283.getClass(), "lastPlaceId", -678230923);
        setField(term68283, term68283.getClass(), "lastPlaceName", "QcfydYbOGP");
        setIntField(term68283, term68283.getClass(), "lastRegionId", 2001978730);
        setField(term68283, term68283.getClass(), "lastRegionName", "FdMzwKizAk");
        setIntField(term68283, term68283.getClass(), "lastAllNetId", 835522995);
        setField(term68283, term68283.getClass(), "lastClientId", "jjwHVTqCkP");
        setIntField(term68283, term68283.getClass(), "lastUsedDeckId", 209416345);
        setIntField(term68283, term68283.getClass(), "lastPlayMusicLevel", 119693843);
        setIntField(term68283, term68283.getClass(), "lastEmoneyBrand", 1525937366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uUAkxSFPyL";
        callMethod(klass, "setFirstPlayDate", argTypes, term68283, args);
    }

};


