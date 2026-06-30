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

public class UserBoss_init_7155266580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133727;

    public UserBoss_init_7155266580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term133731 = new Long(2535970782317488741L);
        term133727 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term133729 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term133745 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133746 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133750 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133755 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133756 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133760 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term133727, term133727.getClass(), "id", 2222370681590272622L);
        setLongField(term133729, term133729.getClass(), "id", -8120209621895873873L);
        setField(term133729, term133729.getClass(), "extId", term133731);
        setField(term133729, term133729.getClass(), "luid", "XmRRZpyFKp");
        setIntField(term133746, term133746.getClass(), "year", 2014);
        setShortField(term133746, term133746.getClass(), "month", (short) 3);
        setShortField(term133746, term133746.getClass(), "day", (short) 25);
        setField(term133745, term133745.getClass(), "date", term133746);
        setByteField(term133750, term133750.getClass(), "hour", (byte) 21);
        setByteField(term133750, term133750.getClass(), "minute", (byte) 11);
        setByteField(term133750, term133750.getClass(), "second", (byte) 20);
        setIntField(term133750, term133750.getClass(), "nano", 320642457);
        setField(term133745, term133745.getClass(), "time", term133750);
        setField(term133729, term133729.getClass(), "registerTime", term133745);
        setIntField(term133756, term133756.getClass(), "year", 2020);
        setShortField(term133756, term133756.getClass(), "month", (short) 4);
        setShortField(term133756, term133756.getClass(), "day", (short) 20);
        setField(term133755, term133755.getClass(), "date", term133756);
        setByteField(term133760, term133760.getClass(), "hour", (byte) 15);
        setByteField(term133760, term133760.getClass(), "minute", (byte) 24);
        setByteField(term133760, term133760.getClass(), "second", (byte) 35);
        setIntField(term133760, term133760.getClass(), "nano", 679127969);
        setField(term133755, term133755.getClass(), "time", term133760);
        setField(term133729, term133729.getClass(), "accessTime", term133755);
        setField(term133727, term133727.getClass(), "card", term133729);
        setField(term133727, term133727.getClass(), "userName", "QXOnXJGHZk");
        setIntField(term133727, term133727.getClass(), "level", 1286975918);
        setIntField(term133727, term133727.getClass(), "reincarnationNum", 1198027781);
        setLongField(term133727, term133727.getClass(), "exp", 7023978034023070217L);
        setLongField(term133727, term133727.getClass(), "point", -558143402887160730L);
        setLongField(term133727, term133727.getClass(), "totalPoint", -2619955165672102351L);
        setIntField(term133727, term133727.getClass(), "playCount", -488875141);
        setIntField(term133727, term133727.getClass(), "jewelCount", 168611945);
        setIntField(term133727, term133727.getClass(), "totalJewelCount", 1037377774);
        setIntField(term133727, term133727.getClass(), "medalCount", 270481103);
        setIntField(term133727, term133727.getClass(), "playerRating", -515394013);
        setIntField(term133727, term133727.getClass(), "highestRating", 2109927830);
        setIntField(term133727, term133727.getClass(), "battlePoint", 145834234);
        setIntField(term133727, term133727.getClass(), "bestBattlePoint", -228810962);
        setIntField(term133727, term133727.getClass(), "overDamageBattlePoint", 1375191716);
        setBooleanField(term133727, term133727.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term133727, term133727.getClass(), "nameplateId", 740991259);
        setIntField(term133727, term133727.getClass(), "trophyId", -592719629);
        setIntField(term133727, term133727.getClass(), "cardId", 1432125390);
        setIntField(term133727, term133727.getClass(), "characterId", -2117682827);
        setIntField(term133727, term133727.getClass(), "characterVoiceNo", -735213364);
        setIntField(term133727, term133727.getClass(), "tabSetting", -1015936088);
        setIntField(term133727, term133727.getClass(), "tabSortSetting", 653864647);
        setIntField(term133727, term133727.getClass(), "cardCategorySetting", 43072711);
        setIntField(term133727, term133727.getClass(), "cardSortSetting", -1716297843);
        setIntField(term133727, term133727.getClass(), "rivalScoreCategorySetting", -456659197);
        setIntField(term133727, term133727.getClass(), "playedTutorialBit", -765777411);
        setIntField(term133727, term133727.getClass(), "firstTutorialCancelNum", -975098081);
        setLongField(term133727, term133727.getClass(), "sumTechHighScore", -7633859116020875088L);
        setLongField(term133727, term133727.getClass(), "sumTechBasicHighScore", -501883360362201128L);
        setLongField(term133727, term133727.getClass(), "sumTechAdvancedHighScore", 1887353392386757827L);
        setLongField(term133727, term133727.getClass(), "sumTechExpertHighScore", -784626884548224978L);
        setLongField(term133727, term133727.getClass(), "sumTechMasterHighScore", -959380225800500565L);
        setLongField(term133727, term133727.getClass(), "sumTechLunaticHighScore", -88247015965244313L);
        setLongField(term133727, term133727.getClass(), "sumBattleHighScore", 3335075750529131701L);
        setLongField(term133727, term133727.getClass(), "sumBattleBasicHighScore", -4236940003113045567L);
        setLongField(term133727, term133727.getClass(), "sumBattleAdvancedHighScore", 336267317356958481L);
        setLongField(term133727, term133727.getClass(), "sumBattleExpertHighScore", 5600422224348526021L);
        setLongField(term133727, term133727.getClass(), "sumBattleMasterHighScore", 2486565521948952498L);
        setLongField(term133727, term133727.getClass(), "sumBattleLunaticHighScore", 1734576773982658252L);
        setField(term133727, term133727.getClass(), "eventWatchedDate", "tckSURIPmO");
        setField(term133727, term133727.getClass(), "cmEventWatchedDate", "GZSnqwBCPQ");
        setField(term133727, term133727.getClass(), "firstGameId", "zxdSWLKWYw");
        setField(term133727, term133727.getClass(), "firstRomVersion", "VurQtsudbR");
        setField(term133727, term133727.getClass(), "firstDataVersion", "KdIGyBXZVB");
        setField(term133727, term133727.getClass(), "firstPlayDate", "eKvGCdbyoP");
        setField(term133727, term133727.getClass(), "lastGameId", "MgMUmPLywB");
        setField(term133727, term133727.getClass(), "lastRomVersion", "pNJhowQpXJ");
        setField(term133727, term133727.getClass(), "lastDataVersion", "gyfupqhzxo");
        setField(term133727, term133727.getClass(), "compatibleCmVersion", "WUwUHGneAq");
        setField(term133727, term133727.getClass(), "lastPlayDate", "zlVKedpZvy");
        setIntField(term133727, term133727.getClass(), "lastPlaceId", 93863517);
        setField(term133727, term133727.getClass(), "lastPlaceName", "PEUAKKJLwI");
        setIntField(term133727, term133727.getClass(), "lastRegionId", -1434712378);
        setField(term133727, term133727.getClass(), "lastRegionName", "cYvFrvYBOd");
        setIntField(term133727, term133727.getClass(), "lastAllNetId", -1932255799);
        setField(term133727, term133727.getClass(), "lastClientId", "WfCGsRvHTg");
        setIntField(term133727, term133727.getClass(), "lastUsedDeckId", -178856156);
        setIntField(term133727, term133727.getClass(), "lastPlayMusicLevel", -414924394);
        setIntField(term133727, term133727.getClass(), "lastEmoneyBrand", 515944055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term133727;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


