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

public class UserData_getLastRegionId_85900413755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45183;

    public UserData_getLastRegionId_85900413755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term45187 = new Long(1368340889161782793L);
        term45183 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term45185 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term45201 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45202 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45206 = newInstance(Class.forName("java.time.LocalTime"));
        Object term45211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45216 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term45183, term45183.getClass(), "id", -992268380840969737L);
        setLongField(term45185, term45185.getClass(), "id", 476691819773991950L);
        setField(term45185, term45185.getClass(), "extId", term45187);
        setField(term45185, term45185.getClass(), "luid", "SMoWUILIhn");
        setIntField(term45202, term45202.getClass(), "year", 2020);
        setShortField(term45202, term45202.getClass(), "month", (short) 4);
        setShortField(term45202, term45202.getClass(), "day", (short) 2);
        setField(term45201, term45201.getClass(), "date", term45202);
        setByteField(term45206, term45206.getClass(), "hour", (byte) 11);
        setByteField(term45206, term45206.getClass(), "minute", (byte) 26);
        setByteField(term45206, term45206.getClass(), "second", (byte) 22);
        setIntField(term45206, term45206.getClass(), "nano", 168224721);
        setField(term45201, term45201.getClass(), "time", term45206);
        setField(term45185, term45185.getClass(), "registerTime", term45201);
        setIntField(term45212, term45212.getClass(), "year", 2010);
        setShortField(term45212, term45212.getClass(), "month", (short) 10);
        setShortField(term45212, term45212.getClass(), "day", (short) 26);
        setField(term45211, term45211.getClass(), "date", term45212);
        setByteField(term45216, term45216.getClass(), "hour", (byte) 6);
        setByteField(term45216, term45216.getClass(), "minute", (byte) 28);
        setByteField(term45216, term45216.getClass(), "second", (byte) 52);
        setIntField(term45216, term45216.getClass(), "nano", 197540216);
        setField(term45211, term45211.getClass(), "time", term45216);
        setField(term45185, term45185.getClass(), "accessTime", term45211);
        setField(term45183, term45183.getClass(), "card", term45185);
        setField(term45183, term45183.getClass(), "userName", "SvSKSCjgTM");
        setIntField(term45183, term45183.getClass(), "level", 419332770);
        setIntField(term45183, term45183.getClass(), "reincarnationNum", 1742733401);
        setLongField(term45183, term45183.getClass(), "exp", 1984510319790430917L);
        setLongField(term45183, term45183.getClass(), "point", 3343066350756629253L);
        setLongField(term45183, term45183.getClass(), "totalPoint", 8321218207244044171L);
        setIntField(term45183, term45183.getClass(), "playCount", 1634939612);
        setIntField(term45183, term45183.getClass(), "jewelCount", -590256406);
        setIntField(term45183, term45183.getClass(), "totalJewelCount", -1319797966);
        setIntField(term45183, term45183.getClass(), "medalCount", -388682282);
        setIntField(term45183, term45183.getClass(), "playerRating", 2028706829);
        setIntField(term45183, term45183.getClass(), "highestRating", -656080518);
        setIntField(term45183, term45183.getClass(), "battlePoint", 1769230265);
        setIntField(term45183, term45183.getClass(), "bestBattlePoint", -1946503216);
        setIntField(term45183, term45183.getClass(), "overDamageBattlePoint", 467573222);
        setBooleanField(term45183, term45183.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term45183, term45183.getClass(), "nameplateId", -197212451);
        setIntField(term45183, term45183.getClass(), "trophyId", 213194885);
        setIntField(term45183, term45183.getClass(), "cardId", 364063308);
        setIntField(term45183, term45183.getClass(), "characterId", -787041664);
        setIntField(term45183, term45183.getClass(), "characterVoiceNo", 2141179437);
        setIntField(term45183, term45183.getClass(), "tabSetting", -826972140);
        setIntField(term45183, term45183.getClass(), "tabSortSetting", 737250028);
        setIntField(term45183, term45183.getClass(), "cardCategorySetting", -1870044711);
        setIntField(term45183, term45183.getClass(), "cardSortSetting", -719110417);
        setIntField(term45183, term45183.getClass(), "rivalScoreCategorySetting", -1866172730);
        setIntField(term45183, term45183.getClass(), "playedTutorialBit", 1129688211);
        setIntField(term45183, term45183.getClass(), "firstTutorialCancelNum", 2126253731);
        setLongField(term45183, term45183.getClass(), "sumTechHighScore", -5240010545022869760L);
        setLongField(term45183, term45183.getClass(), "sumTechBasicHighScore", 4229766107425466349L);
        setLongField(term45183, term45183.getClass(), "sumTechAdvancedHighScore", -4012171283483306843L);
        setLongField(term45183, term45183.getClass(), "sumTechExpertHighScore", -8117956180112977495L);
        setLongField(term45183, term45183.getClass(), "sumTechMasterHighScore", 342373123317498636L);
        setLongField(term45183, term45183.getClass(), "sumTechLunaticHighScore", -6848455207927551525L);
        setLongField(term45183, term45183.getClass(), "sumBattleHighScore", -7429834768466188126L);
        setLongField(term45183, term45183.getClass(), "sumBattleBasicHighScore", 2537051314451371644L);
        setLongField(term45183, term45183.getClass(), "sumBattleAdvancedHighScore", 1503652575237136976L);
        setLongField(term45183, term45183.getClass(), "sumBattleExpertHighScore", -1765527138913795029L);
        setLongField(term45183, term45183.getClass(), "sumBattleMasterHighScore", -1702769190313660197L);
        setLongField(term45183, term45183.getClass(), "sumBattleLunaticHighScore", 4850987747626140720L);
        setField(term45183, term45183.getClass(), "eventWatchedDate", "UFxnRbWtog");
        setField(term45183, term45183.getClass(), "cmEventWatchedDate", "NSxzAUSujy");
        setField(term45183, term45183.getClass(), "firstGameId", "FEezgglqXC");
        setField(term45183, term45183.getClass(), "firstRomVersion", "rvYqMRgiPA");
        setField(term45183, term45183.getClass(), "firstDataVersion", "qOZXeUUmdz");
        setField(term45183, term45183.getClass(), "firstPlayDate", "FCovVZHqPx");
        setField(term45183, term45183.getClass(), "lastGameId", "jSTBfkWjge");
        setField(term45183, term45183.getClass(), "lastRomVersion", "uKYhZULSHp");
        setField(term45183, term45183.getClass(), "lastDataVersion", "xdYuLllgpn");
        setField(term45183, term45183.getClass(), "compatibleCmVersion", "ayonlqalLA");
        setField(term45183, term45183.getClass(), "lastPlayDate", "fzzIOVxKdF");
        setIntField(term45183, term45183.getClass(), "lastPlaceId", 1637943121);
        setField(term45183, term45183.getClass(), "lastPlaceName", "cdvmxZaBEK");
        setIntField(term45183, term45183.getClass(), "lastRegionId", -1889806893);
        setField(term45183, term45183.getClass(), "lastRegionName", "QHYZiyDyPC");
        setIntField(term45183, term45183.getClass(), "lastAllNetId", 2101844302);
        setField(term45183, term45183.getClass(), "lastClientId", "kcHMyiheuH");
        setIntField(term45183, term45183.getClass(), "lastUsedDeckId", 1975711832);
        setIntField(term45183, term45183.getClass(), "lastPlayMusicLevel", -712035661);
        setIntField(term45183, term45183.getClass(), "lastEmoneyBrand", -545530498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionId", argTypes, term45183, args);
    }

};


