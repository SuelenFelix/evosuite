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

public class UserTechCount_setAllBreakPlusCount_67638789610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366394;
     Object term366662;

    public UserTechCount_setAllBreakPlusCount_67638789610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term366400 = new Long(-888581501148999479L);
        term366394 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount"));
        Object term366396 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term366398 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term366414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term366415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term366419 = newInstance(Class.forName("java.time.LocalTime"));
        Object term366424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term366425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term366429 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term366394, term366394.getClass(), "id", -1692269993318314983L);
        setLongField(term366396, term366396.getClass(), "id", -4643273312319381951L);
        setLongField(term366398, term366398.getClass(), "id", 3007492099788543767L);
        setField(term366398, term366398.getClass(), "extId", term366400);
        setField(term366398, term366398.getClass(), "luid", "zdxKnjrAdp");
        setIntField(term366415, term366415.getClass(), "year", 2026);
        setShortField(term366415, term366415.getClass(), "month", (short) 11);
        setShortField(term366415, term366415.getClass(), "day", (short) 25);
        setField(term366414, term366414.getClass(), "date", term366415);
        setByteField(term366419, term366419.getClass(), "hour", (byte) 1);
        setByteField(term366419, term366419.getClass(), "minute", (byte) 35);
        setByteField(term366419, term366419.getClass(), "second", (byte) 42);
        setIntField(term366419, term366419.getClass(), "nano", 137834369);
        setField(term366414, term366414.getClass(), "time", term366419);
        setField(term366398, term366398.getClass(), "registerTime", term366414);
        setIntField(term366425, term366425.getClass(), "year", 2015);
        setShortField(term366425, term366425.getClass(), "month", (short) 8);
        setShortField(term366425, term366425.getClass(), "day", (short) 8);
        setField(term366424, term366424.getClass(), "date", term366425);
        setByteField(term366429, term366429.getClass(), "hour", (byte) 5);
        setByteField(term366429, term366429.getClass(), "minute", (byte) 27);
        setByteField(term366429, term366429.getClass(), "second", (byte) 0);
        setIntField(term366429, term366429.getClass(), "nano", 850217535);
        setField(term366424, term366424.getClass(), "time", term366429);
        setField(term366398, term366398.getClass(), "accessTime", term366424);
        setField(term366396, term366396.getClass(), "card", term366398);
        setField(term366396, term366396.getClass(), "userName", "HzjGAUNELB");
        setIntField(term366396, term366396.getClass(), "level", -849741546);
        setIntField(term366396, term366396.getClass(), "reincarnationNum", -1937174779);
        setLongField(term366396, term366396.getClass(), "exp", -1999173967372948234L);
        setLongField(term366396, term366396.getClass(), "point", 6126575679597289934L);
        setLongField(term366396, term366396.getClass(), "totalPoint", 7897375048916934980L);
        setIntField(term366396, term366396.getClass(), "playCount", -1640497846);
        setIntField(term366396, term366396.getClass(), "jewelCount", 1076015479);
        setIntField(term366396, term366396.getClass(), "totalJewelCount", -1032832266);
        setIntField(term366396, term366396.getClass(), "medalCount", 1795684555);
        setIntField(term366396, term366396.getClass(), "playerRating", 1025538440);
        setIntField(term366396, term366396.getClass(), "highestRating", 1409810516);
        setIntField(term366396, term366396.getClass(), "battlePoint", 61755648);
        setIntField(term366396, term366396.getClass(), "bestBattlePoint", -125178394);
        setIntField(term366396, term366396.getClass(), "overDamageBattlePoint", -297336657);
        setBooleanField(term366396, term366396.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term366396, term366396.getClass(), "nameplateId", 806993524);
        setIntField(term366396, term366396.getClass(), "trophyId", -1137828018);
        setIntField(term366396, term366396.getClass(), "cardId", -1426956244);
        setIntField(term366396, term366396.getClass(), "characterId", -1094674619);
        setIntField(term366396, term366396.getClass(), "characterVoiceNo", -1705806124);
        setIntField(term366396, term366396.getClass(), "tabSetting", -1731911586);
        setIntField(term366396, term366396.getClass(), "tabSortSetting", 1340516476);
        setIntField(term366396, term366396.getClass(), "cardCategorySetting", -1865748421);
        setIntField(term366396, term366396.getClass(), "cardSortSetting", 246862778);
        setIntField(term366396, term366396.getClass(), "rivalScoreCategorySetting", -1579107014);
        setIntField(term366396, term366396.getClass(), "playedTutorialBit", 1073735185);
        setIntField(term366396, term366396.getClass(), "firstTutorialCancelNum", 1881013178);
        setLongField(term366396, term366396.getClass(), "sumTechHighScore", -3109716088865231292L);
        setLongField(term366396, term366396.getClass(), "sumTechBasicHighScore", 543478520856142647L);
        setLongField(term366396, term366396.getClass(), "sumTechAdvancedHighScore", -7992558106149412798L);
        setLongField(term366396, term366396.getClass(), "sumTechExpertHighScore", -4362660880800303819L);
        setLongField(term366396, term366396.getClass(), "sumTechMasterHighScore", 8625216961524478229L);
        setLongField(term366396, term366396.getClass(), "sumTechLunaticHighScore", 1185879550570157924L);
        setLongField(term366396, term366396.getClass(), "sumBattleHighScore", 3712613340408306579L);
        setLongField(term366396, term366396.getClass(), "sumBattleBasicHighScore", 2278840661251538249L);
        setLongField(term366396, term366396.getClass(), "sumBattleAdvancedHighScore", 1265609930165797980L);
        setLongField(term366396, term366396.getClass(), "sumBattleExpertHighScore", -3095008892141913679L);
        setLongField(term366396, term366396.getClass(), "sumBattleMasterHighScore", -3882119035964300703L);
        setLongField(term366396, term366396.getClass(), "sumBattleLunaticHighScore", 7618447362888271060L);
        setField(term366396, term366396.getClass(), "eventWatchedDate", "HGSQVJCxul");
        setField(term366396, term366396.getClass(), "cmEventWatchedDate", "uIugAGTulK");
        setField(term366396, term366396.getClass(), "firstGameId", "LDtphCRvpE");
        setField(term366396, term366396.getClass(), "firstRomVersion", "bhNizQfATc");
        setField(term366396, term366396.getClass(), "firstDataVersion", "tOMKZFAgFD");
        setField(term366396, term366396.getClass(), "firstPlayDate", "GOiBZeyBWd");
        setField(term366396, term366396.getClass(), "lastGameId", "nUoGYOdMrB");
        setField(term366396, term366396.getClass(), "lastRomVersion", "nIJRcJvBkb");
        setField(term366396, term366396.getClass(), "lastDataVersion", "uXKYJaaymx");
        setField(term366396, term366396.getClass(), "compatibleCmVersion", "KGftLyoQLt");
        setField(term366396, term366396.getClass(), "lastPlayDate", "bwdIyOSWxE");
        setIntField(term366396, term366396.getClass(), "lastPlaceId", -2131132370);
        setField(term366396, term366396.getClass(), "lastPlaceName", "rNIXkEurbw");
        setIntField(term366396, term366396.getClass(), "lastRegionId", 1510835161);
        setField(term366396, term366396.getClass(), "lastRegionName", "tReLUSgFne");
        setIntField(term366396, term366396.getClass(), "lastAllNetId", -1251279077);
        setField(term366396, term366396.getClass(), "lastClientId", "OKtQfGFqdz");
        setIntField(term366396, term366396.getClass(), "lastUsedDeckId", 352394786);
        setIntField(term366396, term366396.getClass(), "lastPlayMusicLevel", 1806380200);
        setIntField(term366396, term366396.getClass(), "lastEmoneyBrand", -951001147);
        setField(term366394, term366394.getClass(), "user", term366396);
        setIntField(term366394, term366394.getClass(), "levelId", -768633205);
        setIntField(term366394, term366394.getClass(), "allBreakCount", -926002353);
        setIntField(term366394, term366394.getClass(), "allBreakPlusCount", 1751821066);
        term366662 = new Integer(1439906045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term366662;
        callMethod(klass, "setAllBreakPlusCount", argTypes, term366394, args);
    }

};


