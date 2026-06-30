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

public class UserEventPoint_getPoint_1203062044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383253;

    public UserEventPoint_getPoint_1203062044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term383259 = new Long(2123432481270520381L);
        term383253 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint"));
        Object term383255 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term383257 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term383273 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term383274 = newInstance(Class.forName("java.time.LocalDate"));
        Object term383278 = newInstance(Class.forName("java.time.LocalTime"));
        Object term383283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term383284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term383288 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term383253, term383253.getClass(), "id", -5111224200908701943L);
        setLongField(term383255, term383255.getClass(), "id", -7826627318336849653L);
        setLongField(term383257, term383257.getClass(), "id", 8042931746608828019L);
        setField(term383257, term383257.getClass(), "extId", term383259);
        setField(term383257, term383257.getClass(), "luid", "fOHEhGuUUg");
        setIntField(term383274, term383274.getClass(), "year", 2029);
        setShortField(term383274, term383274.getClass(), "month", (short) 3);
        setShortField(term383274, term383274.getClass(), "day", (short) 22);
        setField(term383273, term383273.getClass(), "date", term383274);
        setByteField(term383278, term383278.getClass(), "hour", (byte) 22);
        setByteField(term383278, term383278.getClass(), "minute", (byte) 42);
        setByteField(term383278, term383278.getClass(), "second", (byte) 24);
        setIntField(term383278, term383278.getClass(), "nano", 58236443);
        setField(term383273, term383273.getClass(), "time", term383278);
        setField(term383257, term383257.getClass(), "registerTime", term383273);
        setIntField(term383284, term383284.getClass(), "year", 2029);
        setShortField(term383284, term383284.getClass(), "month", (short) 7);
        setShortField(term383284, term383284.getClass(), "day", (short) 27);
        setField(term383283, term383283.getClass(), "date", term383284);
        setByteField(term383288, term383288.getClass(), "hour", (byte) 17);
        setByteField(term383288, term383288.getClass(), "minute", (byte) 56);
        setByteField(term383288, term383288.getClass(), "second", (byte) 24);
        setIntField(term383288, term383288.getClass(), "nano", 713288287);
        setField(term383283, term383283.getClass(), "time", term383288);
        setField(term383257, term383257.getClass(), "accessTime", term383283);
        setField(term383255, term383255.getClass(), "card", term383257);
        setField(term383255, term383255.getClass(), "userName", "aLqxLSQZUV");
        setIntField(term383255, term383255.getClass(), "level", 1679732083);
        setIntField(term383255, term383255.getClass(), "reincarnationNum", 1455354031);
        setLongField(term383255, term383255.getClass(), "exp", -6374395861117229768L);
        setLongField(term383255, term383255.getClass(), "point", 6490699819027011983L);
        setLongField(term383255, term383255.getClass(), "totalPoint", -2537306775218796188L);
        setIntField(term383255, term383255.getClass(), "playCount", -479884372);
        setIntField(term383255, term383255.getClass(), "jewelCount", -388769623);
        setIntField(term383255, term383255.getClass(), "totalJewelCount", -1411774268);
        setIntField(term383255, term383255.getClass(), "medalCount", -1489677537);
        setIntField(term383255, term383255.getClass(), "playerRating", 1023502131);
        setIntField(term383255, term383255.getClass(), "highestRating", 101904286);
        setIntField(term383255, term383255.getClass(), "battlePoint", -632829801);
        setIntField(term383255, term383255.getClass(), "bestBattlePoint", -720542814);
        setIntField(term383255, term383255.getClass(), "overDamageBattlePoint", 1324205627);
        setBooleanField(term383255, term383255.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term383255, term383255.getClass(), "nameplateId", 141491355);
        setIntField(term383255, term383255.getClass(), "trophyId", -1726123666);
        setIntField(term383255, term383255.getClass(), "cardId", -721273148);
        setIntField(term383255, term383255.getClass(), "characterId", 1544983960);
        setIntField(term383255, term383255.getClass(), "characterVoiceNo", -454445488);
        setIntField(term383255, term383255.getClass(), "tabSetting", -1269368459);
        setIntField(term383255, term383255.getClass(), "tabSortSetting", 155992700);
        setIntField(term383255, term383255.getClass(), "cardCategorySetting", 2146767325);
        setIntField(term383255, term383255.getClass(), "cardSortSetting", -1706373500);
        setIntField(term383255, term383255.getClass(), "rivalScoreCategorySetting", 1190883323);
        setIntField(term383255, term383255.getClass(), "playedTutorialBit", -155282799);
        setIntField(term383255, term383255.getClass(), "firstTutorialCancelNum", 356711917);
        setLongField(term383255, term383255.getClass(), "sumTechHighScore", -2339510948302869949L);
        setLongField(term383255, term383255.getClass(), "sumTechBasicHighScore", 8138170671628177815L);
        setLongField(term383255, term383255.getClass(), "sumTechAdvancedHighScore", 5505865472140811625L);
        setLongField(term383255, term383255.getClass(), "sumTechExpertHighScore", 429199666093587473L);
        setLongField(term383255, term383255.getClass(), "sumTechMasterHighScore", 1209338344375712618L);
        setLongField(term383255, term383255.getClass(), "sumTechLunaticHighScore", -4814472907937260403L);
        setLongField(term383255, term383255.getClass(), "sumBattleHighScore", 8226424455148910373L);
        setLongField(term383255, term383255.getClass(), "sumBattleBasicHighScore", -538732099579850806L);
        setLongField(term383255, term383255.getClass(), "sumBattleAdvancedHighScore", 1922586527366625044L);
        setLongField(term383255, term383255.getClass(), "sumBattleExpertHighScore", 3161900777113723718L);
        setLongField(term383255, term383255.getClass(), "sumBattleMasterHighScore", 6920657306761809073L);
        setLongField(term383255, term383255.getClass(), "sumBattleLunaticHighScore", -6956664515754592948L);
        setField(term383255, term383255.getClass(), "eventWatchedDate", "zvLGnbURFt");
        setField(term383255, term383255.getClass(), "cmEventWatchedDate", "wIvieWeekP");
        setField(term383255, term383255.getClass(), "firstGameId", "XuxDybywFI");
        setField(term383255, term383255.getClass(), "firstRomVersion", "PsWelseMiy");
        setField(term383255, term383255.getClass(), "firstDataVersion", "dzpJmULODm");
        setField(term383255, term383255.getClass(), "firstPlayDate", "bFFfTyoSrS");
        setField(term383255, term383255.getClass(), "lastGameId", "SHgrzqZHRT");
        setField(term383255, term383255.getClass(), "lastRomVersion", "FZBIjQCiXh");
        setField(term383255, term383255.getClass(), "lastDataVersion", "VESlPlopQx");
        setField(term383255, term383255.getClass(), "compatibleCmVersion", "OEMsAODkNO");
        setField(term383255, term383255.getClass(), "lastPlayDate", "tdqUpTsaRe");
        setIntField(term383255, term383255.getClass(), "lastPlaceId", -1763236075);
        setField(term383255, term383255.getClass(), "lastPlaceName", "lRMvHtzzNz");
        setIntField(term383255, term383255.getClass(), "lastRegionId", 1648371741);
        setField(term383255, term383255.getClass(), "lastRegionName", "VFvCpVlVOs");
        setIntField(term383255, term383255.getClass(), "lastAllNetId", 2098069304);
        setField(term383255, term383255.getClass(), "lastClientId", "jGLoUhBQxd");
        setIntField(term383255, term383255.getClass(), "lastUsedDeckId", 915549905);
        setIntField(term383255, term383255.getClass(), "lastPlayMusicLevel", 1614271293);
        setIntField(term383255, term383255.getClass(), "lastEmoneyBrand", 916937411);
        setField(term383253, term383253.getClass(), "user", term383255);
        setIntField(term383253, term383253.getClass(), "eventId", -1018351102);
        setLongField(term383253, term383253.getClass(), "point", -2535398161903796714L);
        setBooleanField(term383253, term383253.getClass(), "isRankingRewarded", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term383253, args);
    }

};


