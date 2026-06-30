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

public class UserData_setSumTechLunaticHighScore_120717769797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63083;
     Object term63346;

    public UserData_setSumTechLunaticHighScore_120717769797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term63087 = new Long(-4598158870068953328L);
        term63083 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term63085 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term63101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63106 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63116 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term63083, term63083.getClass(), "id", 1801519101190376402L);
        setLongField(term63085, term63085.getClass(), "id", 2662948409033106270L);
        setField(term63085, term63085.getClass(), "extId", term63087);
        setField(term63085, term63085.getClass(), "luid", "hFvoVHxToy");
        setIntField(term63102, term63102.getClass(), "year", 2022);
        setShortField(term63102, term63102.getClass(), "month", (short) 5);
        setShortField(term63102, term63102.getClass(), "day", (short) 28);
        setField(term63101, term63101.getClass(), "date", term63102);
        setByteField(term63106, term63106.getClass(), "hour", (byte) 20);
        setByteField(term63106, term63106.getClass(), "minute", (byte) 42);
        setByteField(term63106, term63106.getClass(), "second", (byte) 20);
        setIntField(term63106, term63106.getClass(), "nano", 528388661);
        setField(term63101, term63101.getClass(), "time", term63106);
        setField(term63085, term63085.getClass(), "registerTime", term63101);
        setIntField(term63112, term63112.getClass(), "year", 2029);
        setShortField(term63112, term63112.getClass(), "month", (short) 5);
        setShortField(term63112, term63112.getClass(), "day", (short) 12);
        setField(term63111, term63111.getClass(), "date", term63112);
        setByteField(term63116, term63116.getClass(), "hour", (byte) 23);
        setByteField(term63116, term63116.getClass(), "minute", (byte) 20);
        setByteField(term63116, term63116.getClass(), "second", (byte) 4);
        setIntField(term63116, term63116.getClass(), "nano", 378307890);
        setField(term63111, term63111.getClass(), "time", term63116);
        setField(term63085, term63085.getClass(), "accessTime", term63111);
        setField(term63083, term63083.getClass(), "card", term63085);
        setField(term63083, term63083.getClass(), "userName", "ZybsWgYCUR");
        setIntField(term63083, term63083.getClass(), "level", 820400430);
        setIntField(term63083, term63083.getClass(), "reincarnationNum", -1841078275);
        setLongField(term63083, term63083.getClass(), "exp", 2498989652284962947L);
        setLongField(term63083, term63083.getClass(), "point", 1617580635228094061L);
        setLongField(term63083, term63083.getClass(), "totalPoint", 1814900684861511674L);
        setIntField(term63083, term63083.getClass(), "playCount", -875421053);
        setIntField(term63083, term63083.getClass(), "jewelCount", 212464780);
        setIntField(term63083, term63083.getClass(), "totalJewelCount", -1698447008);
        setIntField(term63083, term63083.getClass(), "medalCount", 1429592368);
        setIntField(term63083, term63083.getClass(), "playerRating", -1997064536);
        setIntField(term63083, term63083.getClass(), "highestRating", 798438929);
        setIntField(term63083, term63083.getClass(), "battlePoint", 795184090);
        setIntField(term63083, term63083.getClass(), "bestBattlePoint", 1181730734);
        setIntField(term63083, term63083.getClass(), "overDamageBattlePoint", -668958857);
        setBooleanField(term63083, term63083.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term63083, term63083.getClass(), "nameplateId", -427688960);
        setIntField(term63083, term63083.getClass(), "trophyId", 343387902);
        setIntField(term63083, term63083.getClass(), "cardId", 1492345954);
        setIntField(term63083, term63083.getClass(), "characterId", 1891017572);
        setIntField(term63083, term63083.getClass(), "characterVoiceNo", -391361805);
        setIntField(term63083, term63083.getClass(), "tabSetting", 1171290917);
        setIntField(term63083, term63083.getClass(), "tabSortSetting", 267258768);
        setIntField(term63083, term63083.getClass(), "cardCategorySetting", 1779008869);
        setIntField(term63083, term63083.getClass(), "cardSortSetting", -1058856035);
        setIntField(term63083, term63083.getClass(), "rivalScoreCategorySetting", -91024448);
        setIntField(term63083, term63083.getClass(), "playedTutorialBit", -744517334);
        setIntField(term63083, term63083.getClass(), "firstTutorialCancelNum", -855464783);
        setLongField(term63083, term63083.getClass(), "sumTechHighScore", 5234836956955605304L);
        setLongField(term63083, term63083.getClass(), "sumTechBasicHighScore", -3576853629648013478L);
        setLongField(term63083, term63083.getClass(), "sumTechAdvancedHighScore", 3816599890845966921L);
        setLongField(term63083, term63083.getClass(), "sumTechExpertHighScore", 792163591827266376L);
        setLongField(term63083, term63083.getClass(), "sumTechMasterHighScore", -4750734247445918143L);
        setLongField(term63083, term63083.getClass(), "sumTechLunaticHighScore", -6408813588921610323L);
        setLongField(term63083, term63083.getClass(), "sumBattleHighScore", 3457189632555792192L);
        setLongField(term63083, term63083.getClass(), "sumBattleBasicHighScore", 9010920462347251642L);
        setLongField(term63083, term63083.getClass(), "sumBattleAdvancedHighScore", 9164839186810859146L);
        setLongField(term63083, term63083.getClass(), "sumBattleExpertHighScore", -3178643500157507028L);
        setLongField(term63083, term63083.getClass(), "sumBattleMasterHighScore", -595230351619160986L);
        setLongField(term63083, term63083.getClass(), "sumBattleLunaticHighScore", -5444968106400021040L);
        setField(term63083, term63083.getClass(), "eventWatchedDate", "YZNLZnNFNI");
        setField(term63083, term63083.getClass(), "cmEventWatchedDate", "uHcUlIseio");
        setField(term63083, term63083.getClass(), "firstGameId", "bsmWXOcLZJ");
        setField(term63083, term63083.getClass(), "firstRomVersion", "ltTwdndtbe");
        setField(term63083, term63083.getClass(), "firstDataVersion", "XaldiIeyMi");
        setField(term63083, term63083.getClass(), "firstPlayDate", "lkujDCFpdm");
        setField(term63083, term63083.getClass(), "lastGameId", "sGfzmhpQEH");
        setField(term63083, term63083.getClass(), "lastRomVersion", "FqGkFGXAbg");
        setField(term63083, term63083.getClass(), "lastDataVersion", "SSWEZgFiFO");
        setField(term63083, term63083.getClass(), "compatibleCmVersion", "spphrCslQA");
        setField(term63083, term63083.getClass(), "lastPlayDate", "EPkEFVlZrY");
        setIntField(term63083, term63083.getClass(), "lastPlaceId", 1496015170);
        setField(term63083, term63083.getClass(), "lastPlaceName", "jySnpYEVPv");
        setIntField(term63083, term63083.getClass(), "lastRegionId", 412507839);
        setField(term63083, term63083.getClass(), "lastRegionName", "VdHqujFzSo");
        setIntField(term63083, term63083.getClass(), "lastAllNetId", -143522206);
        setField(term63083, term63083.getClass(), "lastClientId", "cZbOKEdKPs");
        setIntField(term63083, term63083.getClass(), "lastUsedDeckId", 70726858);
        setIntField(term63083, term63083.getClass(), "lastPlayMusicLevel", -1883665560);
        setIntField(term63083, term63083.getClass(), "lastEmoneyBrand", -1304361419);
        term63346 = new Long(2514186329283267145L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term63346;
        callMethod(klass, "setSumTechLunaticHighScore", argTypes, term63083, args);
    }

};


