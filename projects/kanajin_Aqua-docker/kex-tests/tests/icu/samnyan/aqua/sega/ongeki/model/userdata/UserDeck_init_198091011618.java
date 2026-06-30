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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class UserDeck_init_198091011618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149720;
     Object term149722;
     Object term149985;
     Object term149987;
     Object term149989;
     Object term149991;

    public UserDeck_init_198091011618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149720 = new Long(-8947305271123519501L);
        Long term149726 = new Long(6073193746616629086L);
        term149722 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term149724 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term149740 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149741 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149745 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149750 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149751 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149755 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term149722, term149722.getClass(), "id", -6129129644694228850L);
        setLongField(term149724, term149724.getClass(), "id", 940017538508675526L);
        setField(term149724, term149724.getClass(), "extId", term149726);
        setField(term149724, term149724.getClass(), "luid", "qZMBOEMrvQ");
        setIntField(term149741, term149741.getClass(), "year", 2012);
        setShortField(term149741, term149741.getClass(), "month", (short) 3);
        setShortField(term149741, term149741.getClass(), "day", (short) 30);
        setField(term149740, term149740.getClass(), "date", term149741);
        setByteField(term149745, term149745.getClass(), "hour", (byte) 22);
        setByteField(term149745, term149745.getClass(), "minute", (byte) 56);
        setByteField(term149745, term149745.getClass(), "second", (byte) 8);
        setIntField(term149745, term149745.getClass(), "nano", 786128521);
        setField(term149740, term149740.getClass(), "time", term149745);
        setField(term149724, term149724.getClass(), "registerTime", term149740);
        setIntField(term149751, term149751.getClass(), "year", 2023);
        setShortField(term149751, term149751.getClass(), "month", (short) 9);
        setShortField(term149751, term149751.getClass(), "day", (short) 9);
        setField(term149750, term149750.getClass(), "date", term149751);
        setByteField(term149755, term149755.getClass(), "hour", (byte) 3);
        setByteField(term149755, term149755.getClass(), "minute", (byte) 52);
        setByteField(term149755, term149755.getClass(), "second", (byte) 58);
        setIntField(term149755, term149755.getClass(), "nano", 185910636);
        setField(term149750, term149750.getClass(), "time", term149755);
        setField(term149724, term149724.getClass(), "accessTime", term149750);
        setField(term149722, term149722.getClass(), "card", term149724);
        setField(term149722, term149722.getClass(), "userName", "GGqdxvNUQz");
        setIntField(term149722, term149722.getClass(), "level", -1710809144);
        setIntField(term149722, term149722.getClass(), "reincarnationNum", -1253292706);
        setLongField(term149722, term149722.getClass(), "exp", 6665211323593812695L);
        setLongField(term149722, term149722.getClass(), "point", -2114437712032811752L);
        setLongField(term149722, term149722.getClass(), "totalPoint", 6291677338383312205L);
        setIntField(term149722, term149722.getClass(), "playCount", 1627263304);
        setIntField(term149722, term149722.getClass(), "jewelCount", 2005816851);
        setIntField(term149722, term149722.getClass(), "totalJewelCount", -293521593);
        setIntField(term149722, term149722.getClass(), "medalCount", 1850801712);
        setIntField(term149722, term149722.getClass(), "playerRating", -1360189234);
        setIntField(term149722, term149722.getClass(), "highestRating", -1602849275);
        setIntField(term149722, term149722.getClass(), "battlePoint", 1177628254);
        setIntField(term149722, term149722.getClass(), "bestBattlePoint", 1828135720);
        setIntField(term149722, term149722.getClass(), "overDamageBattlePoint", -1714978703);
        setBooleanField(term149722, term149722.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term149722, term149722.getClass(), "nameplateId", -100914335);
        setIntField(term149722, term149722.getClass(), "trophyId", 789838565);
        setIntField(term149722, term149722.getClass(), "cardId", 1970218200);
        setIntField(term149722, term149722.getClass(), "characterId", -742793739);
        setIntField(term149722, term149722.getClass(), "characterVoiceNo", 160879345);
        setIntField(term149722, term149722.getClass(), "tabSetting", 1294846385);
        setIntField(term149722, term149722.getClass(), "tabSortSetting", -663912774);
        setIntField(term149722, term149722.getClass(), "cardCategorySetting", 1537502993);
        setIntField(term149722, term149722.getClass(), "cardSortSetting", -821343526);
        setIntField(term149722, term149722.getClass(), "rivalScoreCategorySetting", -578811370);
        setIntField(term149722, term149722.getClass(), "playedTutorialBit", 1509308001);
        setIntField(term149722, term149722.getClass(), "firstTutorialCancelNum", -235361641);
        setLongField(term149722, term149722.getClass(), "sumTechHighScore", -2173508651719953612L);
        setLongField(term149722, term149722.getClass(), "sumTechBasicHighScore", -3710671805467041675L);
        setLongField(term149722, term149722.getClass(), "sumTechAdvancedHighScore", -6247652526094725034L);
        setLongField(term149722, term149722.getClass(), "sumTechExpertHighScore", 4892582287990776802L);
        setLongField(term149722, term149722.getClass(), "sumTechMasterHighScore", 2999542969249403500L);
        setLongField(term149722, term149722.getClass(), "sumTechLunaticHighScore", 960843898717469842L);
        setLongField(term149722, term149722.getClass(), "sumBattleHighScore", 2056240579807414305L);
        setLongField(term149722, term149722.getClass(), "sumBattleBasicHighScore", -3745685287247381097L);
        setLongField(term149722, term149722.getClass(), "sumBattleAdvancedHighScore", 2313424594057262102L);
        setLongField(term149722, term149722.getClass(), "sumBattleExpertHighScore", 8553528264236607225L);
        setLongField(term149722, term149722.getClass(), "sumBattleMasterHighScore", -6635023661669980046L);
        setLongField(term149722, term149722.getClass(), "sumBattleLunaticHighScore", -6923137362583562534L);
        setField(term149722, term149722.getClass(), "eventWatchedDate", "HVZRnOxaVb");
        setField(term149722, term149722.getClass(), "cmEventWatchedDate", "OGdPqQpijy");
        setField(term149722, term149722.getClass(), "firstGameId", "KeJHaUwtNs");
        setField(term149722, term149722.getClass(), "firstRomVersion", "fTVsHSQKPY");
        setField(term149722, term149722.getClass(), "firstDataVersion", "PmiKCfPhji");
        setField(term149722, term149722.getClass(), "firstPlayDate", "lAeBISqCrk");
        setField(term149722, term149722.getClass(), "lastGameId", "HnnPhDNDyi");
        setField(term149722, term149722.getClass(), "lastRomVersion", "krnrkIPbzN");
        setField(term149722, term149722.getClass(), "lastDataVersion", "mplyyLrKQK");
        setField(term149722, term149722.getClass(), "compatibleCmVersion", "oLdidoDNLS");
        setField(term149722, term149722.getClass(), "lastPlayDate", "EbcXzUOlTx");
        setIntField(term149722, term149722.getClass(), "lastPlaceId", -1537530133);
        setField(term149722, term149722.getClass(), "lastPlaceName", "cskZnajTgh");
        setIntField(term149722, term149722.getClass(), "lastRegionId", 223751596);
        setField(term149722, term149722.getClass(), "lastRegionName", "WZVuzItKLn");
        setIntField(term149722, term149722.getClass(), "lastAllNetId", 302291440);
        setField(term149722, term149722.getClass(), "lastClientId", "GlWTGuZeKv");
        setIntField(term149722, term149722.getClass(), "lastUsedDeckId", -1607360552);
        setIntField(term149722, term149722.getClass(), "lastPlayMusicLevel", -343779783);
        setIntField(term149722, term149722.getClass(), "lastEmoneyBrand", 1396187222);
        term149985 = new Integer(1061941712);
        term149987 = new Integer(2121750597);
        term149989 = new Integer(972099051);
        term149991 = new Integer(-834814848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term149720;
        args[1] = term149722;
        args[2] = term149985;
        args[3] = term149987;
        args[4] = term149989;
        args[5] = term149991;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


