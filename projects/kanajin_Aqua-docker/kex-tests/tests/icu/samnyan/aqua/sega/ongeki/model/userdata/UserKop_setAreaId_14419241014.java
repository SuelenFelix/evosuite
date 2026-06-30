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

public class UserKop_setAreaId_14419241014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277776;
     Object term278070;

    public UserKop_setAreaId_14419241014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term277782 = new Long(-6656996002079682356L);
        term277776 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term277778 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term277780 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term277796 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277797 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277801 = newInstance(Class.forName("java.time.LocalTime"));
        Object term277806 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277807 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277811 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term277776, term277776.getClass(), "id", 1655870298753813817L);
        setLongField(term277778, term277778.getClass(), "id", 2357241028119955426L);
        setLongField(term277780, term277780.getClass(), "id", -5324073230021944005L);
        setField(term277780, term277780.getClass(), "extId", term277782);
        setField(term277780, term277780.getClass(), "luid", "chPkouOrOD");
        setIntField(term277797, term277797.getClass(), "year", 2013);
        setShortField(term277797, term277797.getClass(), "month", (short) 2);
        setShortField(term277797, term277797.getClass(), "day", (short) 17);
        setField(term277796, term277796.getClass(), "date", term277797);
        setByteField(term277801, term277801.getClass(), "hour", (byte) 5);
        setByteField(term277801, term277801.getClass(), "minute", (byte) 34);
        setByteField(term277801, term277801.getClass(), "second", (byte) 24);
        setIntField(term277801, term277801.getClass(), "nano", 216223624);
        setField(term277796, term277796.getClass(), "time", term277801);
        setField(term277780, term277780.getClass(), "registerTime", term277796);
        setIntField(term277807, term277807.getClass(), "year", 2020);
        setShortField(term277807, term277807.getClass(), "month", (short) 6);
        setShortField(term277807, term277807.getClass(), "day", (short) 23);
        setField(term277806, term277806.getClass(), "date", term277807);
        setByteField(term277811, term277811.getClass(), "hour", (byte) 8);
        setByteField(term277811, term277811.getClass(), "minute", (byte) 49);
        setByteField(term277811, term277811.getClass(), "second", (byte) 23);
        setIntField(term277811, term277811.getClass(), "nano", 796980154);
        setField(term277806, term277806.getClass(), "time", term277811);
        setField(term277780, term277780.getClass(), "accessTime", term277806);
        setField(term277778, term277778.getClass(), "card", term277780);
        setField(term277778, term277778.getClass(), "userName", "VKPVssVIga");
        setIntField(term277778, term277778.getClass(), "level", -1999242840);
        setIntField(term277778, term277778.getClass(), "reincarnationNum", 1818877333);
        setLongField(term277778, term277778.getClass(), "exp", -6761592027578213447L);
        setLongField(term277778, term277778.getClass(), "point", 8504225803473974632L);
        setLongField(term277778, term277778.getClass(), "totalPoint", 3527305262960233420L);
        setIntField(term277778, term277778.getClass(), "playCount", 827624209);
        setIntField(term277778, term277778.getClass(), "jewelCount", 174843203);
        setIntField(term277778, term277778.getClass(), "totalJewelCount", -706967184);
        setIntField(term277778, term277778.getClass(), "medalCount", 62466636);
        setIntField(term277778, term277778.getClass(), "playerRating", 1422188460);
        setIntField(term277778, term277778.getClass(), "highestRating", 1515963311);
        setIntField(term277778, term277778.getClass(), "battlePoint", -1987619758);
        setIntField(term277778, term277778.getClass(), "bestBattlePoint", 1289398504);
        setIntField(term277778, term277778.getClass(), "overDamageBattlePoint", -478425883);
        setBooleanField(term277778, term277778.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term277778, term277778.getClass(), "nameplateId", 497647155);
        setIntField(term277778, term277778.getClass(), "trophyId", 256113501);
        setIntField(term277778, term277778.getClass(), "cardId", -1303798368);
        setIntField(term277778, term277778.getClass(), "characterId", 1964540866);
        setIntField(term277778, term277778.getClass(), "characterVoiceNo", -849495861);
        setIntField(term277778, term277778.getClass(), "tabSetting", 1939955202);
        setIntField(term277778, term277778.getClass(), "tabSortSetting", -1844148148);
        setIntField(term277778, term277778.getClass(), "cardCategorySetting", -1398507404);
        setIntField(term277778, term277778.getClass(), "cardSortSetting", 1202772241);
        setIntField(term277778, term277778.getClass(), "rivalScoreCategorySetting", 343636399);
        setIntField(term277778, term277778.getClass(), "playedTutorialBit", 245937466);
        setIntField(term277778, term277778.getClass(), "firstTutorialCancelNum", 1590592660);
        setLongField(term277778, term277778.getClass(), "sumTechHighScore", -5512549347212162731L);
        setLongField(term277778, term277778.getClass(), "sumTechBasicHighScore", -7830210952668061187L);
        setLongField(term277778, term277778.getClass(), "sumTechAdvancedHighScore", -758098018342252289L);
        setLongField(term277778, term277778.getClass(), "sumTechExpertHighScore", 1591194837657362385L);
        setLongField(term277778, term277778.getClass(), "sumTechMasterHighScore", 6059922663321305799L);
        setLongField(term277778, term277778.getClass(), "sumTechLunaticHighScore", 8279158889094885898L);
        setLongField(term277778, term277778.getClass(), "sumBattleHighScore", 2432741719277316542L);
        setLongField(term277778, term277778.getClass(), "sumBattleBasicHighScore", -5380569180497102187L);
        setLongField(term277778, term277778.getClass(), "sumBattleAdvancedHighScore", -5461078358912443357L);
        setLongField(term277778, term277778.getClass(), "sumBattleExpertHighScore", -5228826526232226650L);
        setLongField(term277778, term277778.getClass(), "sumBattleMasterHighScore", -2154764693839161815L);
        setLongField(term277778, term277778.getClass(), "sumBattleLunaticHighScore", -8269564708795402463L);
        setField(term277778, term277778.getClass(), "eventWatchedDate", "iskHdVFxha");
        setField(term277778, term277778.getClass(), "cmEventWatchedDate", "eWaksCBVal");
        setField(term277778, term277778.getClass(), "firstGameId", "EoJdXAfClg");
        setField(term277778, term277778.getClass(), "firstRomVersion", "WazOABAwle");
        setField(term277778, term277778.getClass(), "firstDataVersion", "OQYRpobHXe");
        setField(term277778, term277778.getClass(), "firstPlayDate", "jcUOVEvSEy");
        setField(term277778, term277778.getClass(), "lastGameId", "RvzDiamKiS");
        setField(term277778, term277778.getClass(), "lastRomVersion", "hFfCZPaDUh");
        setField(term277778, term277778.getClass(), "lastDataVersion", "sroouWPwJV");
        setField(term277778, term277778.getClass(), "compatibleCmVersion", "WDAdIiHeDJ");
        setField(term277778, term277778.getClass(), "lastPlayDate", "eQGvbQZIRc");
        setIntField(term277778, term277778.getClass(), "lastPlaceId", -961432262);
        setField(term277778, term277778.getClass(), "lastPlaceName", "zWuKRjEfdp");
        setIntField(term277778, term277778.getClass(), "lastRegionId", 1209212860);
        setField(term277778, term277778.getClass(), "lastRegionName", "zPSdflqnmk");
        setIntField(term277778, term277778.getClass(), "lastAllNetId", -410679486);
        setField(term277778, term277778.getClass(), "lastClientId", "uOyOpAymZk");
        setIntField(term277778, term277778.getClass(), "lastUsedDeckId", -1925224017);
        setIntField(term277778, term277778.getClass(), "lastPlayMusicLevel", -1707884987);
        setIntField(term277778, term277778.getClass(), "lastEmoneyBrand", -2125421174);
        setField(term277776, term277776.getClass(), "user", term277778);
        setField(term277776, term277776.getClass(), "authKey", "xtPjvtnPnN");
        setIntField(term277776, term277776.getClass(), "kopId", 1829883671);
        setIntField(term277776, term277776.getClass(), "areaId", 1045788676);
        setIntField(term277776, term277776.getClass(), "totalTechScore", 1329142128);
        setIntField(term277776, term277776.getClass(), "totalPlatinumScore", 2042557161);
        setField(term277776, term277776.getClass(), "techRecordDate", "lbTGbReUrp");
        setBooleanField(term277776, term277776.getClass(), "isTotalTechNewRecord", false);
        term278070 = new Integer(-341916705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term278070;
        callMethod(klass, "setAreaId", argTypes, term277776, args);
    }

};


