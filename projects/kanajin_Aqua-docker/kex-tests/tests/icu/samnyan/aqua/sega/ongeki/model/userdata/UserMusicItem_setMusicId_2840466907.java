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

public class UserMusicItem_setMusicId_2840466907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3411;
     Object term3678;

    public UserMusicItem_setMusicId_2840466907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3417 = new Long(-7237588299778557629L);
        term3411 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem"));
        Object term3413 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term3415 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3436 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3441 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3442 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3446 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3411, term3411.getClass(), "id", -3948863953565024517L);
        setLongField(term3413, term3413.getClass(), "id", -6587807377747738663L);
        setLongField(term3415, term3415.getClass(), "id", -6301101997917060727L);
        setField(term3415, term3415.getClass(), "extId", term3417);
        setField(term3415, term3415.getClass(), "luid", "xIeFjkHkOe");
        setIntField(term3432, term3432.getClass(), "year", 2015);
        setShortField(term3432, term3432.getClass(), "month", (short) 9);
        setShortField(term3432, term3432.getClass(), "day", (short) 16);
        setField(term3431, term3431.getClass(), "date", term3432);
        setByteField(term3436, term3436.getClass(), "hour", (byte) 6);
        setByteField(term3436, term3436.getClass(), "minute", (byte) 19);
        setByteField(term3436, term3436.getClass(), "second", (byte) 42);
        setIntField(term3436, term3436.getClass(), "nano", 630084975);
        setField(term3431, term3431.getClass(), "time", term3436);
        setField(term3415, term3415.getClass(), "registerTime", term3431);
        setIntField(term3442, term3442.getClass(), "year", 2029);
        setShortField(term3442, term3442.getClass(), "month", (short) 6);
        setShortField(term3442, term3442.getClass(), "day", (short) 23);
        setField(term3441, term3441.getClass(), "date", term3442);
        setByteField(term3446, term3446.getClass(), "hour", (byte) 21);
        setByteField(term3446, term3446.getClass(), "minute", (byte) 55);
        setByteField(term3446, term3446.getClass(), "second", (byte) 27);
        setIntField(term3446, term3446.getClass(), "nano", 66889274);
        setField(term3441, term3441.getClass(), "time", term3446);
        setField(term3415, term3415.getClass(), "accessTime", term3441);
        setField(term3413, term3413.getClass(), "card", term3415);
        setField(term3413, term3413.getClass(), "userName", "SdCKLMIYnX");
        setIntField(term3413, term3413.getClass(), "level", -209654048);
        setIntField(term3413, term3413.getClass(), "reincarnationNum", 477625804);
        setLongField(term3413, term3413.getClass(), "exp", 8166095254618543564L);
        setLongField(term3413, term3413.getClass(), "point", -4598158870068953328L);
        setLongField(term3413, term3413.getClass(), "totalPoint", 138235087558060686L);
        setIntField(term3413, term3413.getClass(), "playCount", 252575029);
        setIntField(term3413, term3413.getClass(), "jewelCount", 57189932);
        setIntField(term3413, term3413.getClass(), "totalJewelCount", 1460722225);
        setIntField(term3413, term3413.getClass(), "medalCount", 1743224434);
        setIntField(term3413, term3413.getClass(), "playerRating", 842904495);
        setIntField(term3413, term3413.getClass(), "highestRating", 1008080511);
        setIntField(term3413, term3413.getClass(), "battlePoint", 1935707624);
        setIntField(term3413, term3413.getClass(), "bestBattlePoint", 1507074215);
        setIntField(term3413, term3413.getClass(), "overDamageBattlePoint", -282881827);
        setBooleanField(term3413, term3413.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term3413, term3413.getClass(), "nameplateId", -1183353915);
        setIntField(term3413, term3413.getClass(), "trophyId", -420030135);
        setIntField(term3413, term3413.getClass(), "cardId", 267763294);
        setIntField(term3413, term3413.getClass(), "characterId", -1497710478);
        setIntField(term3413, term3413.getClass(), "characterVoiceNo", 49950830);
        setIntField(term3413, term3413.getClass(), "tabSetting", -525257914);
        setIntField(term3413, term3413.getClass(), "tabSortSetting", 147209682);
        setIntField(term3413, term3413.getClass(), "cardCategorySetting", 34470066);
        setIntField(term3413, term3413.getClass(), "cardSortSetting", 2058711405);
        setIntField(term3413, term3413.getClass(), "rivalScoreCategorySetting", 1743683601);
        setIntField(term3413, term3413.getClass(), "playedTutorialBit", -945116798);
        setIntField(term3413, term3413.getClass(), "firstTutorialCancelNum", 1593461795);
        setLongField(term3413, term3413.getClass(), "sumTechHighScore", 5381386339318883012L);
        setLongField(term3413, term3413.getClass(), "sumTechBasicHighScore", -1333707622307134180L);
        setLongField(term3413, term3413.getClass(), "sumTechAdvancedHighScore", -4360569253593381888L);
        setLongField(term3413, term3413.getClass(), "sumTechExpertHighScore", 1457594663983990440L);
        setLongField(term3413, term3413.getClass(), "sumTechMasterHighScore", 3452833434644634217L);
        setLongField(term3413, term3413.getClass(), "sumTechLunaticHighScore", -8603648071751666348L);
        setLongField(term3413, term3413.getClass(), "sumBattleHighScore", -7884871963229073324L);
        setLongField(term3413, term3413.getClass(), "sumBattleBasicHighScore", -8649738738252714180L);
        setLongField(term3413, term3413.getClass(), "sumBattleAdvancedHighScore", -7278883608542636188L);
        setLongField(term3413, term3413.getClass(), "sumBattleExpertHighScore", -1539859611880912454L);
        setLongField(term3413, term3413.getClass(), "sumBattleMasterHighScore", 4100236067313034103L);
        setLongField(term3413, term3413.getClass(), "sumBattleLunaticHighScore", 1195529027276497124L);
        setField(term3413, term3413.getClass(), "eventWatchedDate", "OJJtVNPyKZ");
        setField(term3413, term3413.getClass(), "cmEventWatchedDate", "AKNapTAfmD");
        setField(term3413, term3413.getClass(), "firstGameId", "xJgPlLxpgC");
        setField(term3413, term3413.getClass(), "firstRomVersion", "EYtfuJaxiM");
        setField(term3413, term3413.getClass(), "firstDataVersion", "gCWtLVKVVe");
        setField(term3413, term3413.getClass(), "firstPlayDate", "fWKJoSoCwE");
        setField(term3413, term3413.getClass(), "lastGameId", "wfaXBpWAUH");
        setField(term3413, term3413.getClass(), "lastRomVersion", "VMeAzAHwZj");
        setField(term3413, term3413.getClass(), "lastDataVersion", "PznxWXsZME");
        setField(term3413, term3413.getClass(), "compatibleCmVersion", "ZzIujlwVsw");
        setField(term3413, term3413.getClass(), "lastPlayDate", "LWyEaeIyAo");
        setIntField(term3413, term3413.getClass(), "lastPlaceId", 515182546);
        setField(term3413, term3413.getClass(), "lastPlaceName", "yVMkkQhvmN");
        setIntField(term3413, term3413.getClass(), "lastRegionId", -936895502);
        setField(term3413, term3413.getClass(), "lastRegionName", "mvrkADEgpp");
        setIntField(term3413, term3413.getClass(), "lastAllNetId", -129547140);
        setField(term3413, term3413.getClass(), "lastClientId", "pXOkjyeIRb");
        setIntField(term3413, term3413.getClass(), "lastUsedDeckId", 199287428);
        setIntField(term3413, term3413.getClass(), "lastPlayMusicLevel", -1195339592);
        setIntField(term3413, term3413.getClass(), "lastEmoneyBrand", -376422566);
        setField(term3411, term3411.getClass(), "user", term3413);
        setIntField(term3411, term3411.getClass(), "musicId", 306847454);
        setIntField(term3411, term3411.getClass(), "status", 1745276158);
        term3678 = new Integer(2009020256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3678;
        callMethod(klass, "setMusicId", argTypes, term3411, args);
    }

};


