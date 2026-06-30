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

public class UserMusicItem_getStatus_17478147744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1705;

    public UserMusicItem_getStatus_17478147744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1711 = new Long(5270370404989704783L);
        term1705 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem"));
        Object term1707 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term1709 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1725 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1726 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1730 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1735 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1736 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1740 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1705, term1705.getClass(), "id", -6723783499250797216L);
        setLongField(term1707, term1707.getClass(), "id", 41775768178052008L);
        setLongField(term1709, term1709.getClass(), "id", 6682528376118987775L);
        setField(term1709, term1709.getClass(), "extId", term1711);
        setField(term1709, term1709.getClass(), "luid", "fhkbdRViHi");
        setIntField(term1726, term1726.getClass(), "year", 2029);
        setShortField(term1726, term1726.getClass(), "month", (short) 8);
        setShortField(term1726, term1726.getClass(), "day", (short) 29);
        setField(term1725, term1725.getClass(), "date", term1726);
        setByteField(term1730, term1730.getClass(), "hour", (byte) 15);
        setByteField(term1730, term1730.getClass(), "minute", (byte) 50);
        setByteField(term1730, term1730.getClass(), "second", (byte) 1);
        setIntField(term1730, term1730.getClass(), "nano", 277971904);
        setField(term1725, term1725.getClass(), "time", term1730);
        setField(term1709, term1709.getClass(), "registerTime", term1725);
        setIntField(term1736, term1736.getClass(), "year", 2022);
        setShortField(term1736, term1736.getClass(), "month", (short) 11);
        setShortField(term1736, term1736.getClass(), "day", (short) 16);
        setField(term1735, term1735.getClass(), "date", term1736);
        setByteField(term1740, term1740.getClass(), "hour", (byte) 15);
        setByteField(term1740, term1740.getClass(), "minute", (byte) 54);
        setByteField(term1740, term1740.getClass(), "second", (byte) 2);
        setIntField(term1740, term1740.getClass(), "nano", 733274103);
        setField(term1735, term1735.getClass(), "time", term1740);
        setField(term1709, term1709.getClass(), "accessTime", term1735);
        setField(term1707, term1707.getClass(), "card", term1709);
        setField(term1707, term1707.getClass(), "userName", "uWHnvSvaPl");
        setIntField(term1707, term1707.getClass(), "level", 1861318859);
        setIntField(term1707, term1707.getClass(), "reincarnationNum", 1474524152);
        setLongField(term1707, term1707.getClass(), "exp", 682356318767179819L);
        setLongField(term1707, term1707.getClass(), "point", -7291743527973326814L);
        setLongField(term1707, term1707.getClass(), "totalPoint", -5963439350418910964L);
        setIntField(term1707, term1707.getClass(), "playCount", 568954359);
        setIntField(term1707, term1707.getClass(), "jewelCount", 53410913);
        setIntField(term1707, term1707.getClass(), "totalJewelCount", -375014958);
        setIntField(term1707, term1707.getClass(), "medalCount", 1107176718);
        setIntField(term1707, term1707.getClass(), "playerRating", 480137250);
        setIntField(term1707, term1707.getClass(), "highestRating", -341152642);
        setIntField(term1707, term1707.getClass(), "battlePoint", -2015854073);
        setIntField(term1707, term1707.getClass(), "bestBattlePoint", 538259104);
        setIntField(term1707, term1707.getClass(), "overDamageBattlePoint", 96566506);
        setBooleanField(term1707, term1707.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term1707, term1707.getClass(), "nameplateId", -343325701);
        setIntField(term1707, term1707.getClass(), "trophyId", 107945604);
        setIntField(term1707, term1707.getClass(), "cardId", -1963464809);
        setIntField(term1707, term1707.getClass(), "characterId", 71190297);
        setIntField(term1707, term1707.getClass(), "characterVoiceNo", 1202361360);
        setIntField(term1707, term1707.getClass(), "tabSetting", -2015048153);
        setIntField(term1707, term1707.getClass(), "tabSortSetting", -2063457669);
        setIntField(term1707, term1707.getClass(), "cardCategorySetting", -1222006000);
        setIntField(term1707, term1707.getClass(), "cardSortSetting", 2095798786);
        setIntField(term1707, term1707.getClass(), "rivalScoreCategorySetting", -1565502840);
        setIntField(term1707, term1707.getClass(), "playedTutorialBit", 344323424);
        setIntField(term1707, term1707.getClass(), "firstTutorialCancelNum", 9726679);
        setLongField(term1707, term1707.getClass(), "sumTechHighScore", 9013624480170062917L);
        setLongField(term1707, term1707.getClass(), "sumTechBasicHighScore", 7862575738391801707L);
        setLongField(term1707, term1707.getClass(), "sumTechAdvancedHighScore", 50358265865610362L);
        setLongField(term1707, term1707.getClass(), "sumTechExpertHighScore", 5510783420697225605L);
        setLongField(term1707, term1707.getClass(), "sumTechMasterHighScore", 6005241913654469005L);
        setLongField(term1707, term1707.getClass(), "sumTechLunaticHighScore", -1983291584002806658L);
        setLongField(term1707, term1707.getClass(), "sumBattleHighScore", 5946780097489996391L);
        setLongField(term1707, term1707.getClass(), "sumBattleBasicHighScore", -8652538484981166496L);
        setLongField(term1707, term1707.getClass(), "sumBattleAdvancedHighScore", 2701184207686293431L);
        setLongField(term1707, term1707.getClass(), "sumBattleExpertHighScore", 4474998035090263139L);
        setLongField(term1707, term1707.getClass(), "sumBattleMasterHighScore", 2848819812340321742L);
        setLongField(term1707, term1707.getClass(), "sumBattleLunaticHighScore", -8876856890348836498L);
        setField(term1707, term1707.getClass(), "eventWatchedDate", "kBdSllIBVz");
        setField(term1707, term1707.getClass(), "cmEventWatchedDate", "TJmVBGfTML");
        setField(term1707, term1707.getClass(), "firstGameId", "tPlsykYBqO");
        setField(term1707, term1707.getClass(), "firstRomVersion", "bLPjGVBhlX");
        setField(term1707, term1707.getClass(), "firstDataVersion", "whBvTVIIlC");
        setField(term1707, term1707.getClass(), "firstPlayDate", "IgRJUzaCwW");
        setField(term1707, term1707.getClass(), "lastGameId", "JUmudUmaaV");
        setField(term1707, term1707.getClass(), "lastRomVersion", "KoyGrUJeJW");
        setField(term1707, term1707.getClass(), "lastDataVersion", "HqBOwkVqjD");
        setField(term1707, term1707.getClass(), "compatibleCmVersion", "MAcUBcBckh");
        setField(term1707, term1707.getClass(), "lastPlayDate", "oVgzLbrsFr");
        setIntField(term1707, term1707.getClass(), "lastPlaceId", -25637976);
        setField(term1707, term1707.getClass(), "lastPlaceName", "vQVyKLdtaz");
        setIntField(term1707, term1707.getClass(), "lastRegionId", 1555897383);
        setField(term1707, term1707.getClass(), "lastRegionName", "OWKQODBLzb");
        setIntField(term1707, term1707.getClass(), "lastAllNetId", 202001407);
        setField(term1707, term1707.getClass(), "lastClientId", "wGmYcqUkgE");
        setIntField(term1707, term1707.getClass(), "lastUsedDeckId", 158873461);
        setIntField(term1707, term1707.getClass(), "lastPlayMusicLevel", -430151637);
        setIntField(term1707, term1707.getClass(), "lastEmoneyBrand", -1697741339);
        setField(term1705, term1705.getClass(), "user", term1707);
        setIntField(term1705, term1705.getClass(), "musicId", 98922530);
        setIntField(term1705, term1705.getClass(), "status", -1388471422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term1705, args);
    }

};


