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

public class UserLoginBonus_setId_20155616756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303477;
     Object term303756;

    public UserLoginBonus_setId_20155616756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term303483 = new Long(-590890905395927244L);
        term303477 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus"));
        Object term303479 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term303481 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term303497 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term303498 = newInstance(Class.forName("java.time.LocalDate"));
        Object term303502 = newInstance(Class.forName("java.time.LocalTime"));
        Object term303507 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term303508 = newInstance(Class.forName("java.time.LocalDate"));
        Object term303512 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term303477, term303477.getClass(), "id", 5632893799999587220L);
        setLongField(term303479, term303479.getClass(), "id", -4991775843149125020L);
        setLongField(term303481, term303481.getClass(), "id", -6901492179982524283L);
        setField(term303481, term303481.getClass(), "extId", term303483);
        setField(term303481, term303481.getClass(), "luid", "ykbbLncIeH");
        setIntField(term303498, term303498.getClass(), "year", 2020);
        setShortField(term303498, term303498.getClass(), "month", (short) 9);
        setShortField(term303498, term303498.getClass(), "day", (short) 26);
        setField(term303497, term303497.getClass(), "date", term303498);
        setByteField(term303502, term303502.getClass(), "hour", (byte) 9);
        setByteField(term303502, term303502.getClass(), "minute", (byte) 6);
        setByteField(term303502, term303502.getClass(), "second", (byte) 43);
        setIntField(term303502, term303502.getClass(), "nano", 114139483);
        setField(term303497, term303497.getClass(), "time", term303502);
        setField(term303481, term303481.getClass(), "registerTime", term303497);
        setIntField(term303508, term303508.getClass(), "year", 2021);
        setShortField(term303508, term303508.getClass(), "month", (short) 3);
        setShortField(term303508, term303508.getClass(), "day", (short) 12);
        setField(term303507, term303507.getClass(), "date", term303508);
        setByteField(term303512, term303512.getClass(), "hour", (byte) 7);
        setByteField(term303512, term303512.getClass(), "minute", (byte) 20);
        setByteField(term303512, term303512.getClass(), "second", (byte) 35);
        setIntField(term303512, term303512.getClass(), "nano", 419188300);
        setField(term303507, term303507.getClass(), "time", term303512);
        setField(term303481, term303481.getClass(), "accessTime", term303507);
        setField(term303479, term303479.getClass(), "card", term303481);
        setField(term303479, term303479.getClass(), "userName", "VGHbXUsaEW");
        setIntField(term303479, term303479.getClass(), "level", -24593882);
        setIntField(term303479, term303479.getClass(), "reincarnationNum", -283500717);
        setLongField(term303479, term303479.getClass(), "exp", 5573087159114485638L);
        setLongField(term303479, term303479.getClass(), "point", 7998610957306808991L);
        setLongField(term303479, term303479.getClass(), "totalPoint", 3838202966651326875L);
        setIntField(term303479, term303479.getClass(), "playCount", 1699540471);
        setIntField(term303479, term303479.getClass(), "jewelCount", -2140185654);
        setIntField(term303479, term303479.getClass(), "totalJewelCount", -2147118613);
        setIntField(term303479, term303479.getClass(), "medalCount", -1853768061);
        setIntField(term303479, term303479.getClass(), "playerRating", 565081738);
        setIntField(term303479, term303479.getClass(), "highestRating", 1614594325);
        setIntField(term303479, term303479.getClass(), "battlePoint", -2109591096);
        setIntField(term303479, term303479.getClass(), "bestBattlePoint", 1593580658);
        setIntField(term303479, term303479.getClass(), "overDamageBattlePoint", -1309148136);
        setBooleanField(term303479, term303479.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term303479, term303479.getClass(), "nameplateId", -1127186635);
        setIntField(term303479, term303479.getClass(), "trophyId", 1448224493);
        setIntField(term303479, term303479.getClass(), "cardId", -1142323876);
        setIntField(term303479, term303479.getClass(), "characterId", 10076911);
        setIntField(term303479, term303479.getClass(), "characterVoiceNo", 1698012699);
        setIntField(term303479, term303479.getClass(), "tabSetting", -572528273);
        setIntField(term303479, term303479.getClass(), "tabSortSetting", -858963817);
        setIntField(term303479, term303479.getClass(), "cardCategorySetting", 1913609184);
        setIntField(term303479, term303479.getClass(), "cardSortSetting", 1547124435);
        setIntField(term303479, term303479.getClass(), "rivalScoreCategorySetting", 1173200220);
        setIntField(term303479, term303479.getClass(), "playedTutorialBit", 2118630937);
        setIntField(term303479, term303479.getClass(), "firstTutorialCancelNum", 2096733563);
        setLongField(term303479, term303479.getClass(), "sumTechHighScore", 3110180453079559509L);
        setLongField(term303479, term303479.getClass(), "sumTechBasicHighScore", 8578032494815720104L);
        setLongField(term303479, term303479.getClass(), "sumTechAdvancedHighScore", 5779250164174538509L);
        setLongField(term303479, term303479.getClass(), "sumTechExpertHighScore", 7179850348153084465L);
        setLongField(term303479, term303479.getClass(), "sumTechMasterHighScore", -4983467636250478005L);
        setLongField(term303479, term303479.getClass(), "sumTechLunaticHighScore", -2379007529544350465L);
        setLongField(term303479, term303479.getClass(), "sumBattleHighScore", -3760587303915696882L);
        setLongField(term303479, term303479.getClass(), "sumBattleBasicHighScore", -5024966790582112989L);
        setLongField(term303479, term303479.getClass(), "sumBattleAdvancedHighScore", -9093020760093525382L);
        setLongField(term303479, term303479.getClass(), "sumBattleExpertHighScore", -2174412705461703110L);
        setLongField(term303479, term303479.getClass(), "sumBattleMasterHighScore", 7408020846602025654L);
        setLongField(term303479, term303479.getClass(), "sumBattleLunaticHighScore", -2444958705887090191L);
        setField(term303479, term303479.getClass(), "eventWatchedDate", "QrPAoffYrM");
        setField(term303479, term303479.getClass(), "cmEventWatchedDate", "GdfyxzrJPi");
        setField(term303479, term303479.getClass(), "firstGameId", "gWDuljoCTx");
        setField(term303479, term303479.getClass(), "firstRomVersion", "VWFCiHNcuV");
        setField(term303479, term303479.getClass(), "firstDataVersion", "oRdsFEiHOt");
        setField(term303479, term303479.getClass(), "firstPlayDate", "XLyilJzRkP");
        setField(term303479, term303479.getClass(), "lastGameId", "sYmdjjkiqc");
        setField(term303479, term303479.getClass(), "lastRomVersion", "DbPFJbunZe");
        setField(term303479, term303479.getClass(), "lastDataVersion", "rtoiCzynkp");
        setField(term303479, term303479.getClass(), "compatibleCmVersion", "tqjEBbhLxB");
        setField(term303479, term303479.getClass(), "lastPlayDate", "uwRpAOBIsu");
        setIntField(term303479, term303479.getClass(), "lastPlaceId", -985370976);
        setField(term303479, term303479.getClass(), "lastPlaceName", "HqceiaTGDi");
        setIntField(term303479, term303479.getClass(), "lastRegionId", 1891127566);
        setField(term303479, term303479.getClass(), "lastRegionName", "dDFpJDkWtW");
        setIntField(term303479, term303479.getClass(), "lastAllNetId", 306681917);
        setField(term303479, term303479.getClass(), "lastClientId", "VBtTmYfmNa");
        setIntField(term303479, term303479.getClass(), "lastUsedDeckId", 1749187707);
        setIntField(term303479, term303479.getClass(), "lastPlayMusicLevel", 823887972);
        setIntField(term303479, term303479.getClass(), "lastEmoneyBrand", 341855428);
        setField(term303477, term303477.getClass(), "user", term303479);
        setIntField(term303477, term303477.getClass(), "bonusId", 430075334);
        setIntField(term303477, term303477.getClass(), "bonusCount", 1489074052);
        setField(term303477, term303477.getClass(), "lastUpdateDate", "vCMPzUJdqC");
        term303756 = new Long(1789423280538101015L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term303756;
        callMethod(klass, "setId", argTypes, term303477, args);
    }

};


