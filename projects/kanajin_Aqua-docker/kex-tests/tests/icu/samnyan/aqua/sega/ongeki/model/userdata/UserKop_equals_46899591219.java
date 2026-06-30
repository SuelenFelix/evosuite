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

public class UserKop_equals_46899591219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280176;
     Object term280470;

    public UserKop_equals_46899591219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term280182 = new Long(797798302378380033L);
        term280176 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term280178 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term280180 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term280196 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term280197 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280201 = newInstance(Class.forName("java.time.LocalTime"));
        Object term280206 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term280207 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280211 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term280176, term280176.getClass(), "id", 9172120251785587520L);
        setLongField(term280178, term280178.getClass(), "id", -347151418570759956L);
        setLongField(term280180, term280180.getClass(), "id", -8899128936835354252L);
        setField(term280180, term280180.getClass(), "extId", term280182);
        setField(term280180, term280180.getClass(), "luid", "iIhNOWZSiI");
        setIntField(term280197, term280197.getClass(), "year", 2020);
        setShortField(term280197, term280197.getClass(), "month", (short) 11);
        setShortField(term280197, term280197.getClass(), "day", (short) 9);
        setField(term280196, term280196.getClass(), "date", term280197);
        setByteField(term280201, term280201.getClass(), "hour", (byte) 20);
        setByteField(term280201, term280201.getClass(), "minute", (byte) 29);
        setByteField(term280201, term280201.getClass(), "second", (byte) 30);
        setIntField(term280201, term280201.getClass(), "nano", 115741693);
        setField(term280196, term280196.getClass(), "time", term280201);
        setField(term280180, term280180.getClass(), "registerTime", term280196);
        setIntField(term280207, term280207.getClass(), "year", 2021);
        setShortField(term280207, term280207.getClass(), "month", (short) 5);
        setShortField(term280207, term280207.getClass(), "day", (short) 9);
        setField(term280206, term280206.getClass(), "date", term280207);
        setByteField(term280211, term280211.getClass(), "hour", (byte) 8);
        setByteField(term280211, term280211.getClass(), "minute", (byte) 55);
        setByteField(term280211, term280211.getClass(), "second", (byte) 59);
        setIntField(term280211, term280211.getClass(), "nano", 660385314);
        setField(term280206, term280206.getClass(), "time", term280211);
        setField(term280180, term280180.getClass(), "accessTime", term280206);
        setField(term280178, term280178.getClass(), "card", term280180);
        setField(term280178, term280178.getClass(), "userName", "NQIBkRnfjL");
        setIntField(term280178, term280178.getClass(), "level", 679742629);
        setIntField(term280178, term280178.getClass(), "reincarnationNum", -951606500);
        setLongField(term280178, term280178.getClass(), "exp", 5830147752265719255L);
        setLongField(term280178, term280178.getClass(), "point", 280965406608975728L);
        setLongField(term280178, term280178.getClass(), "totalPoint", 7639856188918535500L);
        setIntField(term280178, term280178.getClass(), "playCount", 1648648355);
        setIntField(term280178, term280178.getClass(), "jewelCount", -1757205128);
        setIntField(term280178, term280178.getClass(), "totalJewelCount", 556277411);
        setIntField(term280178, term280178.getClass(), "medalCount", -734980227);
        setIntField(term280178, term280178.getClass(), "playerRating", 1184444999);
        setIntField(term280178, term280178.getClass(), "highestRating", 649536758);
        setIntField(term280178, term280178.getClass(), "battlePoint", 572127295);
        setIntField(term280178, term280178.getClass(), "bestBattlePoint", -906737781);
        setIntField(term280178, term280178.getClass(), "overDamageBattlePoint", 1837850084);
        setBooleanField(term280178, term280178.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term280178, term280178.getClass(), "nameplateId", 1470450665);
        setIntField(term280178, term280178.getClass(), "trophyId", 1923583635);
        setIntField(term280178, term280178.getClass(), "cardId", 1371516661);
        setIntField(term280178, term280178.getClass(), "characterId", 1190458831);
        setIntField(term280178, term280178.getClass(), "characterVoiceNo", -504185930);
        setIntField(term280178, term280178.getClass(), "tabSetting", -876397761);
        setIntField(term280178, term280178.getClass(), "tabSortSetting", -2125188076);
        setIntField(term280178, term280178.getClass(), "cardCategorySetting", 1650623983);
        setIntField(term280178, term280178.getClass(), "cardSortSetting", -1103828562);
        setIntField(term280178, term280178.getClass(), "rivalScoreCategorySetting", -496314738);
        setIntField(term280178, term280178.getClass(), "playedTutorialBit", -1147690688);
        setIntField(term280178, term280178.getClass(), "firstTutorialCancelNum", 1474442364);
        setLongField(term280178, term280178.getClass(), "sumTechHighScore", -6001785523246968480L);
        setLongField(term280178, term280178.getClass(), "sumTechBasicHighScore", 4099861051274708919L);
        setLongField(term280178, term280178.getClass(), "sumTechAdvancedHighScore", -7681340227438910964L);
        setLongField(term280178, term280178.getClass(), "sumTechExpertHighScore", 4216857913602851960L);
        setLongField(term280178, term280178.getClass(), "sumTechMasterHighScore", -7940994801884388331L);
        setLongField(term280178, term280178.getClass(), "sumTechLunaticHighScore", 5063929436543663813L);
        setLongField(term280178, term280178.getClass(), "sumBattleHighScore", 6706098735269753726L);
        setLongField(term280178, term280178.getClass(), "sumBattleBasicHighScore", -5786361633209070386L);
        setLongField(term280178, term280178.getClass(), "sumBattleAdvancedHighScore", -6955507797414999186L);
        setLongField(term280178, term280178.getClass(), "sumBattleExpertHighScore", 1823200075406636321L);
        setLongField(term280178, term280178.getClass(), "sumBattleMasterHighScore", -1746552782033884109L);
        setLongField(term280178, term280178.getClass(), "sumBattleLunaticHighScore", -825416128870830513L);
        setField(term280178, term280178.getClass(), "eventWatchedDate", "roYYoUvuve");
        setField(term280178, term280178.getClass(), "cmEventWatchedDate", "saBbwEJwaU");
        setField(term280178, term280178.getClass(), "firstGameId", "deyNBzGoAl");
        setField(term280178, term280178.getClass(), "firstRomVersion", "FBbQyFgPdH");
        setField(term280178, term280178.getClass(), "firstDataVersion", "AjdUNyCugb");
        setField(term280178, term280178.getClass(), "firstPlayDate", "dKDzzuLoLW");
        setField(term280178, term280178.getClass(), "lastGameId", "EPVoKzYjsa");
        setField(term280178, term280178.getClass(), "lastRomVersion", "exwRDMTrUH");
        setField(term280178, term280178.getClass(), "lastDataVersion", "THLGPyhTxM");
        setField(term280178, term280178.getClass(), "compatibleCmVersion", "XdUkazWzCb");
        setField(term280178, term280178.getClass(), "lastPlayDate", "pqVRGoWaeR");
        setIntField(term280178, term280178.getClass(), "lastPlaceId", -1979534719);
        setField(term280178, term280178.getClass(), "lastPlaceName", "JqdeuiBTPA");
        setIntField(term280178, term280178.getClass(), "lastRegionId", 358862811);
        setField(term280178, term280178.getClass(), "lastRegionName", "tDOAjYoXYW");
        setIntField(term280178, term280178.getClass(), "lastAllNetId", -607854753);
        setField(term280178, term280178.getClass(), "lastClientId", "cniOQvwvCr");
        setIntField(term280178, term280178.getClass(), "lastUsedDeckId", -660755702);
        setIntField(term280178, term280178.getClass(), "lastPlayMusicLevel", 679880948);
        setIntField(term280178, term280178.getClass(), "lastEmoneyBrand", 1895163953);
        setField(term280176, term280176.getClass(), "user", term280178);
        setField(term280176, term280176.getClass(), "authKey", "KxinsOQMeG");
        setIntField(term280176, term280176.getClass(), "kopId", -691223106);
        setIntField(term280176, term280176.getClass(), "areaId", -818213947);
        setIntField(term280176, term280176.getClass(), "totalTechScore", -1160766511);
        setIntField(term280176, term280176.getClass(), "totalPlatinumScore", -1983614159);
        setField(term280176, term280176.getClass(), "techRecordDate", "mbuEVrmMpD");
        setBooleanField(term280176, term280176.getClass(), "isTotalTechNewRecord", true);
        term280470 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term280470;
        callMethod(klass, "equals", argTypes, term280176, args);
    }

};


