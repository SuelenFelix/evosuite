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

public class UserCard_setMaxLevel_36061750424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124660;
     Object term125005;

    public UserCard_setMaxLevel_36061750424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term124666 = new Long(7271112616766426991L);
        term124660 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term124662 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term124664 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term124680 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124681 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124685 = newInstance(Class.forName("java.time.LocalTime"));
        Object term124690 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124691 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124695 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term124660, term124660.getClass(), "id", 644376187957261763L);
        setLongField(term124662, term124662.getClass(), "id", 309291758724035492L);
        setLongField(term124664, term124664.getClass(), "id", -4795767300473220704L);
        setField(term124664, term124664.getClass(), "extId", term124666);
        setField(term124664, term124664.getClass(), "luid", "mwseGQwGCJ");
        setIntField(term124681, term124681.getClass(), "year", 2018);
        setShortField(term124681, term124681.getClass(), "month", (short) 2);
        setShortField(term124681, term124681.getClass(), "day", (short) 15);
        setField(term124680, term124680.getClass(), "date", term124681);
        setByteField(term124685, term124685.getClass(), "hour", (byte) 16);
        setByteField(term124685, term124685.getClass(), "minute", (byte) 4);
        setByteField(term124685, term124685.getClass(), "second", (byte) 19);
        setIntField(term124685, term124685.getClass(), "nano", 538124451);
        setField(term124680, term124680.getClass(), "time", term124685);
        setField(term124664, term124664.getClass(), "registerTime", term124680);
        setIntField(term124691, term124691.getClass(), "year", 2013);
        setShortField(term124691, term124691.getClass(), "month", (short) 10);
        setShortField(term124691, term124691.getClass(), "day", (short) 20);
        setField(term124690, term124690.getClass(), "date", term124691);
        setByteField(term124695, term124695.getClass(), "hour", (byte) 11);
        setByteField(term124695, term124695.getClass(), "minute", (byte) 17);
        setByteField(term124695, term124695.getClass(), "second", (byte) 1);
        setIntField(term124695, term124695.getClass(), "nano", 266879040);
        setField(term124690, term124690.getClass(), "time", term124695);
        setField(term124664, term124664.getClass(), "accessTime", term124690);
        setField(term124662, term124662.getClass(), "card", term124664);
        setField(term124662, term124662.getClass(), "userName", "GFnDQFsVrR");
        setIntField(term124662, term124662.getClass(), "level", -291574787);
        setIntField(term124662, term124662.getClass(), "reincarnationNum", 1661313090);
        setLongField(term124662, term124662.getClass(), "exp", 2287890107615738813L);
        setLongField(term124662, term124662.getClass(), "point", -2058901637668295041L);
        setLongField(term124662, term124662.getClass(), "totalPoint", 6438356254477357324L);
        setIntField(term124662, term124662.getClass(), "playCount", 1684314973);
        setIntField(term124662, term124662.getClass(), "jewelCount", 1244976316);
        setIntField(term124662, term124662.getClass(), "totalJewelCount", -1572789846);
        setIntField(term124662, term124662.getClass(), "medalCount", -1829984905);
        setIntField(term124662, term124662.getClass(), "playerRating", -1730584098);
        setIntField(term124662, term124662.getClass(), "highestRating", -1681411287);
        setIntField(term124662, term124662.getClass(), "battlePoint", -1796526306);
        setIntField(term124662, term124662.getClass(), "bestBattlePoint", 719664754);
        setIntField(term124662, term124662.getClass(), "overDamageBattlePoint", 1908542558);
        setBooleanField(term124662, term124662.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term124662, term124662.getClass(), "nameplateId", -1081520792);
        setIntField(term124662, term124662.getClass(), "trophyId", 1538397670);
        setIntField(term124662, term124662.getClass(), "cardId", 1892710246);
        setIntField(term124662, term124662.getClass(), "characterId", 1847407988);
        setIntField(term124662, term124662.getClass(), "characterVoiceNo", 15668872);
        setIntField(term124662, term124662.getClass(), "tabSetting", -1367697974);
        setIntField(term124662, term124662.getClass(), "tabSortSetting", 16297395);
        setIntField(term124662, term124662.getClass(), "cardCategorySetting", 623171819);
        setIntField(term124662, term124662.getClass(), "cardSortSetting", 1066443567);
        setIntField(term124662, term124662.getClass(), "rivalScoreCategorySetting", 547908690);
        setIntField(term124662, term124662.getClass(), "playedTutorialBit", -378543345);
        setIntField(term124662, term124662.getClass(), "firstTutorialCancelNum", -2144696087);
        setLongField(term124662, term124662.getClass(), "sumTechHighScore", -4591574973533034786L);
        setLongField(term124662, term124662.getClass(), "sumTechBasicHighScore", -273744759947165027L);
        setLongField(term124662, term124662.getClass(), "sumTechAdvancedHighScore", -4080001079379795937L);
        setLongField(term124662, term124662.getClass(), "sumTechExpertHighScore", 2897796040564769178L);
        setLongField(term124662, term124662.getClass(), "sumTechMasterHighScore", -5732675511571223411L);
        setLongField(term124662, term124662.getClass(), "sumTechLunaticHighScore", 8256783771016183024L);
        setLongField(term124662, term124662.getClass(), "sumBattleHighScore", 1072500001399572896L);
        setLongField(term124662, term124662.getClass(), "sumBattleBasicHighScore", 6988058642797646641L);
        setLongField(term124662, term124662.getClass(), "sumBattleAdvancedHighScore", 7471787611611364992L);
        setLongField(term124662, term124662.getClass(), "sumBattleExpertHighScore", -7535007912999518533L);
        setLongField(term124662, term124662.getClass(), "sumBattleMasterHighScore", -1557774302244970809L);
        setLongField(term124662, term124662.getClass(), "sumBattleLunaticHighScore", 8311133892224081946L);
        setField(term124662, term124662.getClass(), "eventWatchedDate", "UQmUTrbRaN");
        setField(term124662, term124662.getClass(), "cmEventWatchedDate", "pJVgbTDDrd");
        setField(term124662, term124662.getClass(), "firstGameId", "UzXAOjUtTa");
        setField(term124662, term124662.getClass(), "firstRomVersion", "NjTyNZneQx");
        setField(term124662, term124662.getClass(), "firstDataVersion", "WZgjoyroht");
        setField(term124662, term124662.getClass(), "firstPlayDate", "WsLIuqMrjH");
        setField(term124662, term124662.getClass(), "lastGameId", "bSGeeoWHWd");
        setField(term124662, term124662.getClass(), "lastRomVersion", "zrXiLofNaH");
        setField(term124662, term124662.getClass(), "lastDataVersion", "qNyGHnJtiu");
        setField(term124662, term124662.getClass(), "compatibleCmVersion", "TEpyPHqnFK");
        setField(term124662, term124662.getClass(), "lastPlayDate", "IuajqwVUGv");
        setIntField(term124662, term124662.getClass(), "lastPlaceId", -1629969931);
        setField(term124662, term124662.getClass(), "lastPlaceName", "XpFjyIwJKk");
        setIntField(term124662, term124662.getClass(), "lastRegionId", -1274836853);
        setField(term124662, term124662.getClass(), "lastRegionName", "rxVTeZJIuC");
        setIntField(term124662, term124662.getClass(), "lastAllNetId", -757528574);
        setField(term124662, term124662.getClass(), "lastClientId", "EPpDDOGAQG");
        setIntField(term124662, term124662.getClass(), "lastUsedDeckId", 673141075);
        setIntField(term124662, term124662.getClass(), "lastPlayMusicLevel", -1755544337);
        setIntField(term124662, term124662.getClass(), "lastEmoneyBrand", -1445578997);
        setField(term124660, term124660.getClass(), "user", term124662);
        setIntField(term124660, term124660.getClass(), "cardId", -1);
        setIntField(term124660, term124660.getClass(), "digitalStock", 1);
        setIntField(term124660, term124660.getClass(), "analogStock", 830228887);
        setIntField(term124660, term124660.getClass(), "level", -903090832);
        setIntField(term124660, term124660.getClass(), "maxLevel", 10);
        setIntField(term124660, term124660.getClass(), "exp", -1760776056);
        setIntField(term124660, term124660.getClass(), "printCount", 83069489);
        setIntField(term124660, term124660.getClass(), "useCount", 2053017168);
        setBooleanField(term124660, term124660.getClass(), "isNew", true);
        setField(term124660, term124660.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term124660, term124660.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term124660, term124660.getClass(), "skillId", -1780206644);
        setBooleanField(term124660, term124660.getClass(), "isAcquired", true);
        setField(term124660, term124660.getClass(), "created", "0000-00-00 00:00:00.0");
        term125005 = new Integer(507003800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term125005;
        callMethod(klass, "setMaxLevel", argTypes, term124660, args);
    }

};


