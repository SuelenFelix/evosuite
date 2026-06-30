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

public class UserDeck_canEqual_9334275414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148432;
     Object term148701;

    public UserDeck_canEqual_9334275414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term148438 = new Long(-3602825674339018793L);
        term148432 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        Object term148434 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term148436 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term148452 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148453 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148457 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148462 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148463 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148467 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term148432, term148432.getClass(), "id", -7809601423198210480L);
        setLongField(term148434, term148434.getClass(), "id", -543773095973230253L);
        setLongField(term148436, term148436.getClass(), "id", -2401606027348836885L);
        setField(term148436, term148436.getClass(), "extId", term148438);
        setField(term148436, term148436.getClass(), "luid", "SaRTYiJrju");
        setIntField(term148453, term148453.getClass(), "year", 2018);
        setShortField(term148453, term148453.getClass(), "month", (short) 4);
        setShortField(term148453, term148453.getClass(), "day", (short) 12);
        setField(term148452, term148452.getClass(), "date", term148453);
        setByteField(term148457, term148457.getClass(), "hour", (byte) 3);
        setByteField(term148457, term148457.getClass(), "minute", (byte) 25);
        setByteField(term148457, term148457.getClass(), "second", (byte) 20);
        setIntField(term148457, term148457.getClass(), "nano", 226150592);
        setField(term148452, term148452.getClass(), "time", term148457);
        setField(term148436, term148436.getClass(), "registerTime", term148452);
        setIntField(term148463, term148463.getClass(), "year", 2014);
        setShortField(term148463, term148463.getClass(), "month", (short) 10);
        setShortField(term148463, term148463.getClass(), "day", (short) 6);
        setField(term148462, term148462.getClass(), "date", term148463);
        setByteField(term148467, term148467.getClass(), "hour", (byte) 11);
        setByteField(term148467, term148467.getClass(), "minute", (byte) 32);
        setByteField(term148467, term148467.getClass(), "second", (byte) 49);
        setIntField(term148467, term148467.getClass(), "nano", 542065255);
        setField(term148462, term148462.getClass(), "time", term148467);
        setField(term148436, term148436.getClass(), "accessTime", term148462);
        setField(term148434, term148434.getClass(), "card", term148436);
        setField(term148434, term148434.getClass(), "userName", "kdIjkdKJZy");
        setIntField(term148434, term148434.getClass(), "level", -533410760);
        setIntField(term148434, term148434.getClass(), "reincarnationNum", -1280711293);
        setLongField(term148434, term148434.getClass(), "exp", -1310276526213298903L);
        setLongField(term148434, term148434.getClass(), "point", -298582785645176709L);
        setLongField(term148434, term148434.getClass(), "totalPoint", 3782480503540109821L);
        setIntField(term148434, term148434.getClass(), "playCount", -986135027);
        setIntField(term148434, term148434.getClass(), "jewelCount", 759881914);
        setIntField(term148434, term148434.getClass(), "totalJewelCount", -1651145659);
        setIntField(term148434, term148434.getClass(), "medalCount", -1747737642);
        setIntField(term148434, term148434.getClass(), "playerRating", -875663853);
        setIntField(term148434, term148434.getClass(), "highestRating", -956550555);
        setIntField(term148434, term148434.getClass(), "battlePoint", -396229522);
        setIntField(term148434, term148434.getClass(), "bestBattlePoint", -1504505239);
        setIntField(term148434, term148434.getClass(), "overDamageBattlePoint", 363428862);
        setBooleanField(term148434, term148434.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term148434, term148434.getClass(), "nameplateId", -1175441949);
        setIntField(term148434, term148434.getClass(), "trophyId", -21088397);
        setIntField(term148434, term148434.getClass(), "cardId", 727645543);
        setIntField(term148434, term148434.getClass(), "characterId", 1617706309);
        setIntField(term148434, term148434.getClass(), "characterVoiceNo", -1771065834);
        setIntField(term148434, term148434.getClass(), "tabSetting", -1607856343);
        setIntField(term148434, term148434.getClass(), "tabSortSetting", -1393066070);
        setIntField(term148434, term148434.getClass(), "cardCategorySetting", 1089906374);
        setIntField(term148434, term148434.getClass(), "cardSortSetting", 1430244220);
        setIntField(term148434, term148434.getClass(), "rivalScoreCategorySetting", 871438955);
        setIntField(term148434, term148434.getClass(), "playedTutorialBit", 1578242981);
        setIntField(term148434, term148434.getClass(), "firstTutorialCancelNum", 243686870);
        setLongField(term148434, term148434.getClass(), "sumTechHighScore", 5437155557428035548L);
        setLongField(term148434, term148434.getClass(), "sumTechBasicHighScore", 4655777909179639910L);
        setLongField(term148434, term148434.getClass(), "sumTechAdvancedHighScore", 2172913056801018032L);
        setLongField(term148434, term148434.getClass(), "sumTechExpertHighScore", 1387954291994054143L);
        setLongField(term148434, term148434.getClass(), "sumTechMasterHighScore", -8710961692570727841L);
        setLongField(term148434, term148434.getClass(), "sumTechLunaticHighScore", 3293308348144230146L);
        setLongField(term148434, term148434.getClass(), "sumBattleHighScore", 9025826326511504223L);
        setLongField(term148434, term148434.getClass(), "sumBattleBasicHighScore", 8145587427801542191L);
        setLongField(term148434, term148434.getClass(), "sumBattleAdvancedHighScore", 3601936401055206836L);
        setLongField(term148434, term148434.getClass(), "sumBattleExpertHighScore", 279047664526540530L);
        setLongField(term148434, term148434.getClass(), "sumBattleMasterHighScore", -2473879161176971334L);
        setLongField(term148434, term148434.getClass(), "sumBattleLunaticHighScore", 877524736307609028L);
        setField(term148434, term148434.getClass(), "eventWatchedDate", "mKMrWcRWqL");
        setField(term148434, term148434.getClass(), "cmEventWatchedDate", "lFItgokSBJ");
        setField(term148434, term148434.getClass(), "firstGameId", "ttgZqAoLOg");
        setField(term148434, term148434.getClass(), "firstRomVersion", "nlbIjkRAop");
        setField(term148434, term148434.getClass(), "firstDataVersion", "gvsjHtWPEw");
        setField(term148434, term148434.getClass(), "firstPlayDate", "eKayOnVsvF");
        setField(term148434, term148434.getClass(), "lastGameId", "SWDyPmvaFP");
        setField(term148434, term148434.getClass(), "lastRomVersion", "NRIcMTUDMt");
        setField(term148434, term148434.getClass(), "lastDataVersion", "QbaWBJMCRe");
        setField(term148434, term148434.getClass(), "compatibleCmVersion", "JQpscjYgTt");
        setField(term148434, term148434.getClass(), "lastPlayDate", "RLNPkJhVuK");
        setIntField(term148434, term148434.getClass(), "lastPlaceId", -220352077);
        setField(term148434, term148434.getClass(), "lastPlaceName", "KqEJftTXuU");
        setIntField(term148434, term148434.getClass(), "lastRegionId", -248969650);
        setField(term148434, term148434.getClass(), "lastRegionName", "msSGXFHEfu");
        setIntField(term148434, term148434.getClass(), "lastAllNetId", 33246852);
        setField(term148434, term148434.getClass(), "lastClientId", "AtdQbyrrjU");
        setIntField(term148434, term148434.getClass(), "lastUsedDeckId", 1051049624);
        setIntField(term148434, term148434.getClass(), "lastPlayMusicLevel", 23316800);
        setIntField(term148434, term148434.getClass(), "lastEmoneyBrand", 1501200024);
        setField(term148432, term148432.getClass(), "user", term148434);
        setIntField(term148432, term148432.getClass(), "deckId", 813083025);
        setIntField(term148432, term148432.getClass(), "cardId1", 1439986578);
        setIntField(term148432, term148432.getClass(), "cardId2", -1393477237);
        setIntField(term148432, term148432.getClass(), "cardId3", 1806901617);
        term148701 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term148701;
        callMethod(klass, "canEqual", argTypes, term148432, args);
    }

};


