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

public class UserCard_getLevel_2564687467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114571;

    public UserCard_getLevel_2564687467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term114577 = new Long(4576699120365923235L);
        term114571 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term114573 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term114575 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term114591 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114592 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114596 = newInstance(Class.forName("java.time.LocalTime"));
        Object term114601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114606 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term114571, term114571.getClass(), "id", -1428303263489085003L);
        setLongField(term114573, term114573.getClass(), "id", -8729285495352788630L);
        setLongField(term114575, term114575.getClass(), "id", -4131346277258860590L);
        setField(term114575, term114575.getClass(), "extId", term114577);
        setField(term114575, term114575.getClass(), "luid", "PfneRKTZrA");
        setIntField(term114592, term114592.getClass(), "year", 2019);
        setShortField(term114592, term114592.getClass(), "month", (short) 8);
        setShortField(term114592, term114592.getClass(), "day", (short) 7);
        setField(term114591, term114591.getClass(), "date", term114592);
        setByteField(term114596, term114596.getClass(), "hour", (byte) 5);
        setByteField(term114596, term114596.getClass(), "minute", (byte) 54);
        setByteField(term114596, term114596.getClass(), "second", (byte) 59);
        setIntField(term114596, term114596.getClass(), "nano", 56284870);
        setField(term114591, term114591.getClass(), "time", term114596);
        setField(term114575, term114575.getClass(), "registerTime", term114591);
        setIntField(term114602, term114602.getClass(), "year", 2023);
        setShortField(term114602, term114602.getClass(), "month", (short) 9);
        setShortField(term114602, term114602.getClass(), "day", (short) 23);
        setField(term114601, term114601.getClass(), "date", term114602);
        setByteField(term114606, term114606.getClass(), "hour", (byte) 14);
        setByteField(term114606, term114606.getClass(), "minute", (byte) 52);
        setByteField(term114606, term114606.getClass(), "second", (byte) 34);
        setIntField(term114606, term114606.getClass(), "nano", 879945118);
        setField(term114601, term114601.getClass(), "time", term114606);
        setField(term114575, term114575.getClass(), "accessTime", term114601);
        setField(term114573, term114573.getClass(), "card", term114575);
        setField(term114573, term114573.getClass(), "userName", "LTQEgDpWsr");
        setIntField(term114573, term114573.getClass(), "level", 43806434);
        setIntField(term114573, term114573.getClass(), "reincarnationNum", 1869537390);
        setLongField(term114573, term114573.getClass(), "exp", -5617062546218022600L);
        setLongField(term114573, term114573.getClass(), "point", -2165346898713982368L);
        setLongField(term114573, term114573.getClass(), "totalPoint", -6074191035520916517L);
        setIntField(term114573, term114573.getClass(), "playCount", -912321180);
        setIntField(term114573, term114573.getClass(), "jewelCount", 332710777);
        setIntField(term114573, term114573.getClass(), "totalJewelCount", 1307238592);
        setIntField(term114573, term114573.getClass(), "medalCount", 1917900339);
        setIntField(term114573, term114573.getClass(), "playerRating", -166475832);
        setIntField(term114573, term114573.getClass(), "highestRating", -1426746104);
        setIntField(term114573, term114573.getClass(), "battlePoint", 1293555421);
        setIntField(term114573, term114573.getClass(), "bestBattlePoint", -1861656988);
        setIntField(term114573, term114573.getClass(), "overDamageBattlePoint", -2030143064);
        setBooleanField(term114573, term114573.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term114573, term114573.getClass(), "nameplateId", 2036980797);
        setIntField(term114573, term114573.getClass(), "trophyId", -935931812);
        setIntField(term114573, term114573.getClass(), "cardId", 1486721984);
        setIntField(term114573, term114573.getClass(), "characterId", 279609538);
        setIntField(term114573, term114573.getClass(), "characterVoiceNo", -1364161498);
        setIntField(term114573, term114573.getClass(), "tabSetting", -1602874517);
        setIntField(term114573, term114573.getClass(), "tabSortSetting", 522533128);
        setIntField(term114573, term114573.getClass(), "cardCategorySetting", 2076616628);
        setIntField(term114573, term114573.getClass(), "cardSortSetting", -138960474);
        setIntField(term114573, term114573.getClass(), "rivalScoreCategorySetting", 541109635);
        setIntField(term114573, term114573.getClass(), "playedTutorialBit", -1533186568);
        setIntField(term114573, term114573.getClass(), "firstTutorialCancelNum", 916419043);
        setLongField(term114573, term114573.getClass(), "sumTechHighScore", 9136522293174537916L);
        setLongField(term114573, term114573.getClass(), "sumTechBasicHighScore", -5973888354917585048L);
        setLongField(term114573, term114573.getClass(), "sumTechAdvancedHighScore", -6749144750536665254L);
        setLongField(term114573, term114573.getClass(), "sumTechExpertHighScore", 3914568255612611848L);
        setLongField(term114573, term114573.getClass(), "sumTechMasterHighScore", 4259147536426697041L);
        setLongField(term114573, term114573.getClass(), "sumTechLunaticHighScore", -775673225877885921L);
        setLongField(term114573, term114573.getClass(), "sumBattleHighScore", -1158666311846705636L);
        setLongField(term114573, term114573.getClass(), "sumBattleBasicHighScore", -1394796225658991697L);
        setLongField(term114573, term114573.getClass(), "sumBattleAdvancedHighScore", 5755793287906211230L);
        setLongField(term114573, term114573.getClass(), "sumBattleExpertHighScore", 2305575913253105150L);
        setLongField(term114573, term114573.getClass(), "sumBattleMasterHighScore", -5487631964804068250L);
        setLongField(term114573, term114573.getClass(), "sumBattleLunaticHighScore", -6503681682105040265L);
        setField(term114573, term114573.getClass(), "eventWatchedDate", "SzvLbLIVwG");
        setField(term114573, term114573.getClass(), "cmEventWatchedDate", "mKnmYOhILq");
        setField(term114573, term114573.getClass(), "firstGameId", "YXXfMygQcG");
        setField(term114573, term114573.getClass(), "firstRomVersion", "sQAHuaiApa");
        setField(term114573, term114573.getClass(), "firstDataVersion", "xDMxegGKqV");
        setField(term114573, term114573.getClass(), "firstPlayDate", "zPKOGLLGZN");
        setField(term114573, term114573.getClass(), "lastGameId", "lajHHsoSDZ");
        setField(term114573, term114573.getClass(), "lastRomVersion", "YdUxGeeDjc");
        setField(term114573, term114573.getClass(), "lastDataVersion", "TbgzoLhCKy");
        setField(term114573, term114573.getClass(), "compatibleCmVersion", "MXAuemWmBo");
        setField(term114573, term114573.getClass(), "lastPlayDate", "IEbHsgLKBk");
        setIntField(term114573, term114573.getClass(), "lastPlaceId", 467264395);
        setField(term114573, term114573.getClass(), "lastPlaceName", "uFZktToTuS");
        setIntField(term114573, term114573.getClass(), "lastRegionId", 943715309);
        setField(term114573, term114573.getClass(), "lastRegionName", "pVpSARCHtf");
        setIntField(term114573, term114573.getClass(), "lastAllNetId", 2013085557);
        setField(term114573, term114573.getClass(), "lastClientId", "wnvCIiaAYo");
        setIntField(term114573, term114573.getClass(), "lastUsedDeckId", -1067501154);
        setIntField(term114573, term114573.getClass(), "lastPlayMusicLevel", -479195168);
        setIntField(term114573, term114573.getClass(), "lastEmoneyBrand", -1151891321);
        setField(term114571, term114571.getClass(), "user", term114573);
        setIntField(term114571, term114571.getClass(), "cardId", -1);
        setIntField(term114571, term114571.getClass(), "digitalStock", 1);
        setIntField(term114571, term114571.getClass(), "analogStock", 1141278466);
        setIntField(term114571, term114571.getClass(), "level", -1649439614);
        setIntField(term114571, term114571.getClass(), "maxLevel", 10);
        setIntField(term114571, term114571.getClass(), "exp", 498535038);
        setIntField(term114571, term114571.getClass(), "printCount", -135256376);
        setIntField(term114571, term114571.getClass(), "useCount", -1073689224);
        setBooleanField(term114571, term114571.getClass(), "isNew", true);
        setField(term114571, term114571.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term114571, term114571.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term114571, term114571.getClass(), "skillId", -706123233);
        setBooleanField(term114571, term114571.getClass(), "isAcquired", true);
        setField(term114571, term114571.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term114571, args);
    }

};


