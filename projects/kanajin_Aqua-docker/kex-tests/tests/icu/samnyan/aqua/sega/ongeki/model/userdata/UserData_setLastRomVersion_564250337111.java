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

public class UserData_setLastRomVersion_564250337111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69173;

    public UserData_setLastRomVersion_564250337111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term69177 = new Long(-2783999800714825789L);
        term69173 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term69175 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term69191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69196 = newInstance(Class.forName("java.time.LocalTime"));
        Object term69201 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69202 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69206 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term69173, term69173.getClass(), "id", -76742459051684573L);
        setLongField(term69175, term69175.getClass(), "id", -480849831745649018L);
        setField(term69175, term69175.getClass(), "extId", term69177);
        setField(term69175, term69175.getClass(), "luid", "baLJgqNNUx");
        setIntField(term69192, term69192.getClass(), "year", 2028);
        setShortField(term69192, term69192.getClass(), "month", (short) 6);
        setShortField(term69192, term69192.getClass(), "day", (short) 21);
        setField(term69191, term69191.getClass(), "date", term69192);
        setByteField(term69196, term69196.getClass(), "hour", (byte) 2);
        setByteField(term69196, term69196.getClass(), "minute", (byte) 38);
        setByteField(term69196, term69196.getClass(), "second", (byte) 11);
        setIntField(term69196, term69196.getClass(), "nano", 40256095);
        setField(term69191, term69191.getClass(), "time", term69196);
        setField(term69175, term69175.getClass(), "registerTime", term69191);
        setIntField(term69202, term69202.getClass(), "year", 2017);
        setShortField(term69202, term69202.getClass(), "month", (short) 5);
        setShortField(term69202, term69202.getClass(), "day", (short) 17);
        setField(term69201, term69201.getClass(), "date", term69202);
        setByteField(term69206, term69206.getClass(), "hour", (byte) 22);
        setByteField(term69206, term69206.getClass(), "minute", (byte) 56);
        setByteField(term69206, term69206.getClass(), "second", (byte) 28);
        setIntField(term69206, term69206.getClass(), "nano", 581659115);
        setField(term69201, term69201.getClass(), "time", term69206);
        setField(term69175, term69175.getClass(), "accessTime", term69201);
        setField(term69173, term69173.getClass(), "card", term69175);
        setField(term69173, term69173.getClass(), "userName", "GlPSGqVaBj");
        setIntField(term69173, term69173.getClass(), "level", -1557704101);
        setIntField(term69173, term69173.getClass(), "reincarnationNum", -764615686);
        setLongField(term69173, term69173.getClass(), "exp", 2663952840595678383L);
        setLongField(term69173, term69173.getClass(), "point", -5909178556872079483L);
        setLongField(term69173, term69173.getClass(), "totalPoint", 6482532353438050098L);
        setIntField(term69173, term69173.getClass(), "playCount", -762034217);
        setIntField(term69173, term69173.getClass(), "jewelCount", 481600552);
        setIntField(term69173, term69173.getClass(), "totalJewelCount", 1415008678);
        setIntField(term69173, term69173.getClass(), "medalCount", -768389527);
        setIntField(term69173, term69173.getClass(), "playerRating", 88636719);
        setIntField(term69173, term69173.getClass(), "highestRating", -18572829);
        setIntField(term69173, term69173.getClass(), "battlePoint", 1220825104);
        setIntField(term69173, term69173.getClass(), "bestBattlePoint", -401847632);
        setIntField(term69173, term69173.getClass(), "overDamageBattlePoint", 1538271896);
        setBooleanField(term69173, term69173.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term69173, term69173.getClass(), "nameplateId", 840990489);
        setIntField(term69173, term69173.getClass(), "trophyId", -793012848);
        setIntField(term69173, term69173.getClass(), "cardId", -2041331473);
        setIntField(term69173, term69173.getClass(), "characterId", -416355601);
        setIntField(term69173, term69173.getClass(), "characterVoiceNo", 439309680);
        setIntField(term69173, term69173.getClass(), "tabSetting", -1717455505);
        setIntField(term69173, term69173.getClass(), "tabSortSetting", 1898536358);
        setIntField(term69173, term69173.getClass(), "cardCategorySetting", 1296009499);
        setIntField(term69173, term69173.getClass(), "cardSortSetting", -427335137);
        setIntField(term69173, term69173.getClass(), "rivalScoreCategorySetting", 9865038);
        setIntField(term69173, term69173.getClass(), "playedTutorialBit", 1202401386);
        setIntField(term69173, term69173.getClass(), "firstTutorialCancelNum", 1173310137);
        setLongField(term69173, term69173.getClass(), "sumTechHighScore", -6626335919437093314L);
        setLongField(term69173, term69173.getClass(), "sumTechBasicHighScore", 557973204177777642L);
        setLongField(term69173, term69173.getClass(), "sumTechAdvancedHighScore", 1482362208900211503L);
        setLongField(term69173, term69173.getClass(), "sumTechExpertHighScore", -1129843632528067304L);
        setLongField(term69173, term69173.getClass(), "sumTechMasterHighScore", -354016106743752379L);
        setLongField(term69173, term69173.getClass(), "sumTechLunaticHighScore", 726307351633159651L);
        setLongField(term69173, term69173.getClass(), "sumBattleHighScore", -9018117462270242726L);
        setLongField(term69173, term69173.getClass(), "sumBattleBasicHighScore", -3250841166001991044L);
        setLongField(term69173, term69173.getClass(), "sumBattleAdvancedHighScore", -8761479282111843329L);
        setLongField(term69173, term69173.getClass(), "sumBattleExpertHighScore", -4801997186754480510L);
        setLongField(term69173, term69173.getClass(), "sumBattleMasterHighScore", 4966511745890103930L);
        setLongField(term69173, term69173.getClass(), "sumBattleLunaticHighScore", -1806994155328201304L);
        setField(term69173, term69173.getClass(), "eventWatchedDate", "jieMNXAAbL");
        setField(term69173, term69173.getClass(), "cmEventWatchedDate", "NbmTxmqOjh");
        setField(term69173, term69173.getClass(), "firstGameId", "rLDmBbcLaC");
        setField(term69173, term69173.getClass(), "firstRomVersion", "tUKcXglBlG");
        setField(term69173, term69173.getClass(), "firstDataVersion", "ZGptycjjRq");
        setField(term69173, term69173.getClass(), "firstPlayDate", "kXJaxapFer");
        setField(term69173, term69173.getClass(), "lastGameId", "OEeAVwVwuj");
        setField(term69173, term69173.getClass(), "lastRomVersion", "WEgFuDZsxi");
        setField(term69173, term69173.getClass(), "lastDataVersion", "kvcaSGNTHd");
        setField(term69173, term69173.getClass(), "compatibleCmVersion", "opXkGeBDoI");
        setField(term69173, term69173.getClass(), "lastPlayDate", "UHxidCtatV");
        setIntField(term69173, term69173.getClass(), "lastPlaceId", 957107652);
        setField(term69173, term69173.getClass(), "lastPlaceName", "LRzADDSjVT");
        setIntField(term69173, term69173.getClass(), "lastRegionId", 292629613);
        setField(term69173, term69173.getClass(), "lastRegionName", "lpFCMaAYxj");
        setIntField(term69173, term69173.getClass(), "lastAllNetId", 1420755413);
        setField(term69173, term69173.getClass(), "lastClientId", "fzHVMNSLii");
        setIntField(term69173, term69173.getClass(), "lastUsedDeckId", -755973893);
        setIntField(term69173, term69173.getClass(), "lastPlayMusicLevel", -890311309);
        setIntField(term69173, term69173.getClass(), "lastEmoneyBrand", 2132845865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TxymnVINZF";
        callMethod(klass, "setLastRomVersion", argTypes, term69173, args);
    }

};


