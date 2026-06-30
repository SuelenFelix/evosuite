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

public class UserKop_init_18968759530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270742;

    public UserKop_init_18968759530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term270746 = new Long(-6792339614909987294L);
        term270742 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term270744 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term270760 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term270761 = newInstance(Class.forName("java.time.LocalDate"));
        Object term270765 = newInstance(Class.forName("java.time.LocalTime"));
        Object term270770 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term270771 = newInstance(Class.forName("java.time.LocalDate"));
        Object term270775 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term270742, term270742.getClass(), "id", -2035236351195435931L);
        setLongField(term270744, term270744.getClass(), "id", 2353997147592668754L);
        setField(term270744, term270744.getClass(), "extId", term270746);
        setField(term270744, term270744.getClass(), "luid", "RiNlMPpFPw");
        setIntField(term270761, term270761.getClass(), "year", 2013);
        setShortField(term270761, term270761.getClass(), "month", (short) 2);
        setShortField(term270761, term270761.getClass(), "day", (short) 5);
        setField(term270760, term270760.getClass(), "date", term270761);
        setByteField(term270765, term270765.getClass(), "hour", (byte) 9);
        setByteField(term270765, term270765.getClass(), "minute", (byte) 41);
        setByteField(term270765, term270765.getClass(), "second", (byte) 23);
        setIntField(term270765, term270765.getClass(), "nano", 128082787);
        setField(term270760, term270760.getClass(), "time", term270765);
        setField(term270744, term270744.getClass(), "registerTime", term270760);
        setIntField(term270771, term270771.getClass(), "year", 2028);
        setShortField(term270771, term270771.getClass(), "month", (short) 7);
        setShortField(term270771, term270771.getClass(), "day", (short) 15);
        setField(term270770, term270770.getClass(), "date", term270771);
        setByteField(term270775, term270775.getClass(), "hour", (byte) 2);
        setByteField(term270775, term270775.getClass(), "minute", (byte) 10);
        setByteField(term270775, term270775.getClass(), "second", (byte) 41);
        setIntField(term270775, term270775.getClass(), "nano", 72203883);
        setField(term270770, term270770.getClass(), "time", term270775);
        setField(term270744, term270744.getClass(), "accessTime", term270770);
        setField(term270742, term270742.getClass(), "card", term270744);
        setField(term270742, term270742.getClass(), "userName", "mJUknTnMoF");
        setIntField(term270742, term270742.getClass(), "level", -1175843203);
        setIntField(term270742, term270742.getClass(), "reincarnationNum", -146651029);
        setLongField(term270742, term270742.getClass(), "exp", 2891569319809230545L);
        setLongField(term270742, term270742.getClass(), "point", -4799973750933173971L);
        setLongField(term270742, term270742.getClass(), "totalPoint", 3341675853327783576L);
        setIntField(term270742, term270742.getClass(), "playCount", 1149377423);
        setIntField(term270742, term270742.getClass(), "jewelCount", -427763498);
        setIntField(term270742, term270742.getClass(), "totalJewelCount", 14128917);
        setIntField(term270742, term270742.getClass(), "medalCount", 1973133173);
        setIntField(term270742, term270742.getClass(), "playerRating", 1880699249);
        setIntField(term270742, term270742.getClass(), "highestRating", 828210237);
        setIntField(term270742, term270742.getClass(), "battlePoint", 617709052);
        setIntField(term270742, term270742.getClass(), "bestBattlePoint", -1475639720);
        setIntField(term270742, term270742.getClass(), "overDamageBattlePoint", -676962701);
        setBooleanField(term270742, term270742.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term270742, term270742.getClass(), "nameplateId", -697101236);
        setIntField(term270742, term270742.getClass(), "trophyId", -1534444558);
        setIntField(term270742, term270742.getClass(), "cardId", 1271435487);
        setIntField(term270742, term270742.getClass(), "characterId", 1526872682);
        setIntField(term270742, term270742.getClass(), "characterVoiceNo", 470395773);
        setIntField(term270742, term270742.getClass(), "tabSetting", 1966072241);
        setIntField(term270742, term270742.getClass(), "tabSortSetting", 2108900398);
        setIntField(term270742, term270742.getClass(), "cardCategorySetting", 1744719785);
        setIntField(term270742, term270742.getClass(), "cardSortSetting", 1795343970);
        setIntField(term270742, term270742.getClass(), "rivalScoreCategorySetting", -1650657014);
        setIntField(term270742, term270742.getClass(), "playedTutorialBit", 2107394839);
        setIntField(term270742, term270742.getClass(), "firstTutorialCancelNum", 1203559115);
        setLongField(term270742, term270742.getClass(), "sumTechHighScore", 563408943435752980L);
        setLongField(term270742, term270742.getClass(), "sumTechBasicHighScore", -7440779687942559461L);
        setLongField(term270742, term270742.getClass(), "sumTechAdvancedHighScore", -7787321607419384458L);
        setLongField(term270742, term270742.getClass(), "sumTechExpertHighScore", 265930224867104476L);
        setLongField(term270742, term270742.getClass(), "sumTechMasterHighScore", -2146197557018073263L);
        setLongField(term270742, term270742.getClass(), "sumTechLunaticHighScore", 8876130768964930404L);
        setLongField(term270742, term270742.getClass(), "sumBattleHighScore", -2196282296874268749L);
        setLongField(term270742, term270742.getClass(), "sumBattleBasicHighScore", 8161723171808749414L);
        setLongField(term270742, term270742.getClass(), "sumBattleAdvancedHighScore", -8881978677676263555L);
        setLongField(term270742, term270742.getClass(), "sumBattleExpertHighScore", -4301796834555723485L);
        setLongField(term270742, term270742.getClass(), "sumBattleMasterHighScore", 1008522736363382122L);
        setLongField(term270742, term270742.getClass(), "sumBattleLunaticHighScore", 8273282359330391824L);
        setField(term270742, term270742.getClass(), "eventWatchedDate", "EriFQVVsYo");
        setField(term270742, term270742.getClass(), "cmEventWatchedDate", "PDCfhQKGsz");
        setField(term270742, term270742.getClass(), "firstGameId", "LLOgknEuqU");
        setField(term270742, term270742.getClass(), "firstRomVersion", "YPuXXabbQT");
        setField(term270742, term270742.getClass(), "firstDataVersion", "ysYFcjbmKr");
        setField(term270742, term270742.getClass(), "firstPlayDate", "ENDtqsidqV");
        setField(term270742, term270742.getClass(), "lastGameId", "vAYeBSSlRp");
        setField(term270742, term270742.getClass(), "lastRomVersion", "pvKNUuBUeT");
        setField(term270742, term270742.getClass(), "lastDataVersion", "paIiUFEXVG");
        setField(term270742, term270742.getClass(), "compatibleCmVersion", "RhdoUtwGNW");
        setField(term270742, term270742.getClass(), "lastPlayDate", "TdPikAQSWD");
        setIntField(term270742, term270742.getClass(), "lastPlaceId", -735043039);
        setField(term270742, term270742.getClass(), "lastPlaceName", "czyIZPfIiS");
        setIntField(term270742, term270742.getClass(), "lastRegionId", 374592590);
        setField(term270742, term270742.getClass(), "lastRegionName", "WTSBaHJKIf");
        setIntField(term270742, term270742.getClass(), "lastAllNetId", -1110893653);
        setField(term270742, term270742.getClass(), "lastClientId", "RQXVNnHMfw");
        setIntField(term270742, term270742.getClass(), "lastUsedDeckId", -480361808);
        setIntField(term270742, term270742.getClass(), "lastPlayMusicLevel", -1011653088);
        setIntField(term270742, term270742.getClass(), "lastEmoneyBrand", 215281647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term270742;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


