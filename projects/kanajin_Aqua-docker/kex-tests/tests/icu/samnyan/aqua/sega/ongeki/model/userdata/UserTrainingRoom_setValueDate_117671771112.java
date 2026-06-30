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

public class UserTrainingRoom_setValueDate_117671771112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18990;

    public UserTrainingRoom_setValueDate_117671771112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18996 = new Long(-6645965768855543712L);
        term18990 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        Object term18992 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term18994 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term19010 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19011 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19015 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19020 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19021 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19025 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term18990, term18990.getClass(), "id", 1729206737148270563L);
        setLongField(term18992, term18992.getClass(), "id", -932981811228171529L);
        setLongField(term18994, term18994.getClass(), "id", 5817794709356277010L);
        setField(term18994, term18994.getClass(), "extId", term18996);
        setField(term18994, term18994.getClass(), "luid", "bVbexZPmwW");
        setIntField(term19011, term19011.getClass(), "year", 2025);
        setShortField(term19011, term19011.getClass(), "month", (short) 12);
        setShortField(term19011, term19011.getClass(), "day", (short) 16);
        setField(term19010, term19010.getClass(), "date", term19011);
        setByteField(term19015, term19015.getClass(), "hour", (byte) 7);
        setByteField(term19015, term19015.getClass(), "minute", (byte) 53);
        setByteField(term19015, term19015.getClass(), "second", (byte) 23);
        setIntField(term19015, term19015.getClass(), "nano", 532991944);
        setField(term19010, term19010.getClass(), "time", term19015);
        setField(term18994, term18994.getClass(), "registerTime", term19010);
        setIntField(term19021, term19021.getClass(), "year", 2024);
        setShortField(term19021, term19021.getClass(), "month", (short) 2);
        setShortField(term19021, term19021.getClass(), "day", (short) 5);
        setField(term19020, term19020.getClass(), "date", term19021);
        setByteField(term19025, term19025.getClass(), "hour", (byte) 12);
        setByteField(term19025, term19025.getClass(), "minute", (byte) 28);
        setByteField(term19025, term19025.getClass(), "second", (byte) 37);
        setIntField(term19025, term19025.getClass(), "nano", 689695229);
        setField(term19020, term19020.getClass(), "time", term19025);
        setField(term18994, term18994.getClass(), "accessTime", term19020);
        setField(term18992, term18992.getClass(), "card", term18994);
        setField(term18992, term18992.getClass(), "userName", "tvxYdqiyGc");
        setIntField(term18992, term18992.getClass(), "level", -134324004);
        setIntField(term18992, term18992.getClass(), "reincarnationNum", -1813266173);
        setLongField(term18992, term18992.getClass(), "exp", -205762347192500511L);
        setLongField(term18992, term18992.getClass(), "point", -4987344934532917085L);
        setLongField(term18992, term18992.getClass(), "totalPoint", 4832511106024339541L);
        setIntField(term18992, term18992.getClass(), "playCount", -1201819537);
        setIntField(term18992, term18992.getClass(), "jewelCount", 2135922049);
        setIntField(term18992, term18992.getClass(), "totalJewelCount", -263876378);
        setIntField(term18992, term18992.getClass(), "medalCount", -755209283);
        setIntField(term18992, term18992.getClass(), "playerRating", -616562794);
        setIntField(term18992, term18992.getClass(), "highestRating", 750084083);
        setIntField(term18992, term18992.getClass(), "battlePoint", -1603460382);
        setIntField(term18992, term18992.getClass(), "bestBattlePoint", -298939768);
        setIntField(term18992, term18992.getClass(), "overDamageBattlePoint", -767031634);
        setBooleanField(term18992, term18992.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term18992, term18992.getClass(), "nameplateId", -2072469750);
        setIntField(term18992, term18992.getClass(), "trophyId", 2106616847);
        setIntField(term18992, term18992.getClass(), "cardId", 403107947);
        setIntField(term18992, term18992.getClass(), "characterId", -1433815725);
        setIntField(term18992, term18992.getClass(), "characterVoiceNo", -1445089135);
        setIntField(term18992, term18992.getClass(), "tabSetting", -291618851);
        setIntField(term18992, term18992.getClass(), "tabSortSetting", -378436487);
        setIntField(term18992, term18992.getClass(), "cardCategorySetting", 584949609);
        setIntField(term18992, term18992.getClass(), "cardSortSetting", 879795058);
        setIntField(term18992, term18992.getClass(), "rivalScoreCategorySetting", -1016087889);
        setIntField(term18992, term18992.getClass(), "playedTutorialBit", 1968287557);
        setIntField(term18992, term18992.getClass(), "firstTutorialCancelNum", 1101385603);
        setLongField(term18992, term18992.getClass(), "sumTechHighScore", 7840243516767232066L);
        setLongField(term18992, term18992.getClass(), "sumTechBasicHighScore", -4069312743655862444L);
        setLongField(term18992, term18992.getClass(), "sumTechAdvancedHighScore", 3233502115953753827L);
        setLongField(term18992, term18992.getClass(), "sumTechExpertHighScore", -308461294344616496L);
        setLongField(term18992, term18992.getClass(), "sumTechMasterHighScore", -6325201865655646423L);
        setLongField(term18992, term18992.getClass(), "sumTechLunaticHighScore", -9093996849713569099L);
        setLongField(term18992, term18992.getClass(), "sumBattleHighScore", -1234885562462779381L);
        setLongField(term18992, term18992.getClass(), "sumBattleBasicHighScore", 2678845111978352940L);
        setLongField(term18992, term18992.getClass(), "sumBattleAdvancedHighScore", 873013799050926004L);
        setLongField(term18992, term18992.getClass(), "sumBattleExpertHighScore", 132446939133186077L);
        setLongField(term18992, term18992.getClass(), "sumBattleMasterHighScore", 4369503082568083627L);
        setLongField(term18992, term18992.getClass(), "sumBattleLunaticHighScore", -1148001666040486410L);
        setField(term18992, term18992.getClass(), "eventWatchedDate", "ZEXFoMSKeG");
        setField(term18992, term18992.getClass(), "cmEventWatchedDate", "HvxahUfZcJ");
        setField(term18992, term18992.getClass(), "firstGameId", "WkLpmqoQxy");
        setField(term18992, term18992.getClass(), "firstRomVersion", "XiNoscmYhd");
        setField(term18992, term18992.getClass(), "firstDataVersion", "asMqnMNrZp");
        setField(term18992, term18992.getClass(), "firstPlayDate", "pqFUMTCKJd");
        setField(term18992, term18992.getClass(), "lastGameId", "PTEndmPMzk");
        setField(term18992, term18992.getClass(), "lastRomVersion", "aJQuCOCvZs");
        setField(term18992, term18992.getClass(), "lastDataVersion", "lHYNCJRiOv");
        setField(term18992, term18992.getClass(), "compatibleCmVersion", "QVLresHoaP");
        setField(term18992, term18992.getClass(), "lastPlayDate", "IbxeAMwLVt");
        setIntField(term18992, term18992.getClass(), "lastPlaceId", 1980267589);
        setField(term18992, term18992.getClass(), "lastPlaceName", "bShlAqoTmZ");
        setIntField(term18992, term18992.getClass(), "lastRegionId", -2009434910);
        setField(term18992, term18992.getClass(), "lastRegionName", "nOKlKlNhtU");
        setIntField(term18992, term18992.getClass(), "lastAllNetId", -374887532);
        setField(term18992, term18992.getClass(), "lastClientId", "gXFNBHJSey");
        setIntField(term18992, term18992.getClass(), "lastUsedDeckId", -165487736);
        setIntField(term18992, term18992.getClass(), "lastPlayMusicLevel", -608393431);
        setIntField(term18992, term18992.getClass(), "lastEmoneyBrand", 298082829);
        setField(term18990, term18990.getClass(), "user", term18992);
        setField(term18990, term18990.getClass(), "authKey", "wUcSfItZgv");
        setIntField(term18990, term18990.getClass(), "roomId", -1494372780);
        setIntField(term18990, term18990.getClass(), "cardId", 703799187);
        setField(term18990, term18990.getClass(), "valueDate", "rOfPCPHmtJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EnmiAvfpJv";
        callMethod(klass, "setValueDate", argTypes, term18990, args);
    }

};


