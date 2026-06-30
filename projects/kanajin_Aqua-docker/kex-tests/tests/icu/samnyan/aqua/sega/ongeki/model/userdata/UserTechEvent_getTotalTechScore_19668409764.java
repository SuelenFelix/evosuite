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

public class UserTechEvent_getTotalTechScore_19668409764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352926;

    public UserTechEvent_getTotalTechScore_19668409764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term352932 = new Long(2978561187278004830L);
        term352926 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term352928 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term352930 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term352946 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term352947 = newInstance(Class.forName("java.time.LocalDate"));
        Object term352951 = newInstance(Class.forName("java.time.LocalTime"));
        Object term352956 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term352957 = newInstance(Class.forName("java.time.LocalDate"));
        Object term352961 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term352926, term352926.getClass(), "id", 5683506910276581444L);
        setLongField(term352928, term352928.getClass(), "id", 946316970661807758L);
        setLongField(term352930, term352930.getClass(), "id", -6632839377173157119L);
        setField(term352930, term352930.getClass(), "extId", term352932);
        setField(term352930, term352930.getClass(), "luid", "GycLTgttWW");
        setIntField(term352947, term352947.getClass(), "year", 2013);
        setShortField(term352947, term352947.getClass(), "month", (short) 5);
        setShortField(term352947, term352947.getClass(), "day", (short) 10);
        setField(term352946, term352946.getClass(), "date", term352947);
        setByteField(term352951, term352951.getClass(), "hour", (byte) 10);
        setByteField(term352951, term352951.getClass(), "minute", (byte) 43);
        setByteField(term352951, term352951.getClass(), "second", (byte) 24);
        setIntField(term352951, term352951.getClass(), "nano", 908301019);
        setField(term352946, term352946.getClass(), "time", term352951);
        setField(term352930, term352930.getClass(), "registerTime", term352946);
        setIntField(term352957, term352957.getClass(), "year", 2015);
        setShortField(term352957, term352957.getClass(), "month", (short) 11);
        setShortField(term352957, term352957.getClass(), "day", (short) 13);
        setField(term352956, term352956.getClass(), "date", term352957);
        setByteField(term352961, term352961.getClass(), "hour", (byte) 14);
        setByteField(term352961, term352961.getClass(), "minute", (byte) 45);
        setByteField(term352961, term352961.getClass(), "second", (byte) 47);
        setIntField(term352961, term352961.getClass(), "nano", 629262088);
        setField(term352956, term352956.getClass(), "time", term352961);
        setField(term352930, term352930.getClass(), "accessTime", term352956);
        setField(term352928, term352928.getClass(), "card", term352930);
        setField(term352928, term352928.getClass(), "userName", "uwJstDKsVD");
        setIntField(term352928, term352928.getClass(), "level", -1811289877);
        setIntField(term352928, term352928.getClass(), "reincarnationNum", -2138351988);
        setLongField(term352928, term352928.getClass(), "exp", 1202020573765280215L);
        setLongField(term352928, term352928.getClass(), "point", -4815758825936005454L);
        setLongField(term352928, term352928.getClass(), "totalPoint", -2773572056601481085L);
        setIntField(term352928, term352928.getClass(), "playCount", -667844036);
        setIntField(term352928, term352928.getClass(), "jewelCount", 1613117337);
        setIntField(term352928, term352928.getClass(), "totalJewelCount", 906019813);
        setIntField(term352928, term352928.getClass(), "medalCount", -1968619562);
        setIntField(term352928, term352928.getClass(), "playerRating", 1552657763);
        setIntField(term352928, term352928.getClass(), "highestRating", 716467535);
        setIntField(term352928, term352928.getClass(), "battlePoint", 623661019);
        setIntField(term352928, term352928.getClass(), "bestBattlePoint", 1861359165);
        setIntField(term352928, term352928.getClass(), "overDamageBattlePoint", 279977482);
        setBooleanField(term352928, term352928.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term352928, term352928.getClass(), "nameplateId", -1928066935);
        setIntField(term352928, term352928.getClass(), "trophyId", -1119292784);
        setIntField(term352928, term352928.getClass(), "cardId", -982747498);
        setIntField(term352928, term352928.getClass(), "characterId", -1572622840);
        setIntField(term352928, term352928.getClass(), "characterVoiceNo", -581756252);
        setIntField(term352928, term352928.getClass(), "tabSetting", 1628958864);
        setIntField(term352928, term352928.getClass(), "tabSortSetting", -1991340208);
        setIntField(term352928, term352928.getClass(), "cardCategorySetting", -1854505303);
        setIntField(term352928, term352928.getClass(), "cardSortSetting", 665490168);
        setIntField(term352928, term352928.getClass(), "rivalScoreCategorySetting", -941791336);
        setIntField(term352928, term352928.getClass(), "playedTutorialBit", -758672115);
        setIntField(term352928, term352928.getClass(), "firstTutorialCancelNum", 452432817);
        setLongField(term352928, term352928.getClass(), "sumTechHighScore", -3290402052385732042L);
        setLongField(term352928, term352928.getClass(), "sumTechBasicHighScore", -3436404454635876221L);
        setLongField(term352928, term352928.getClass(), "sumTechAdvancedHighScore", 6641363220242151312L);
        setLongField(term352928, term352928.getClass(), "sumTechExpertHighScore", -105629919155183789L);
        setLongField(term352928, term352928.getClass(), "sumTechMasterHighScore", 7299470739033250762L);
        setLongField(term352928, term352928.getClass(), "sumTechLunaticHighScore", -9221804225321648509L);
        setLongField(term352928, term352928.getClass(), "sumBattleHighScore", 2427007585891434773L);
        setLongField(term352928, term352928.getClass(), "sumBattleBasicHighScore", -9060624763659215758L);
        setLongField(term352928, term352928.getClass(), "sumBattleAdvancedHighScore", -5622748430866546891L);
        setLongField(term352928, term352928.getClass(), "sumBattleExpertHighScore", 6220076833558857052L);
        setLongField(term352928, term352928.getClass(), "sumBattleMasterHighScore", 43280004887715355L);
        setLongField(term352928, term352928.getClass(), "sumBattleLunaticHighScore", -2458990209429323625L);
        setField(term352928, term352928.getClass(), "eventWatchedDate", "dYbYVZpyrO");
        setField(term352928, term352928.getClass(), "cmEventWatchedDate", "TbocXEeCgV");
        setField(term352928, term352928.getClass(), "firstGameId", "XqMSHTzUPO");
        setField(term352928, term352928.getClass(), "firstRomVersion", "EmvEPcAWUC");
        setField(term352928, term352928.getClass(), "firstDataVersion", "eYwiSsNNkK");
        setField(term352928, term352928.getClass(), "firstPlayDate", "BHehYJQVPd");
        setField(term352928, term352928.getClass(), "lastGameId", "nVWxttpuiM");
        setField(term352928, term352928.getClass(), "lastRomVersion", "MIzbUrkpmM");
        setField(term352928, term352928.getClass(), "lastDataVersion", "cQeqBzoQRS");
        setField(term352928, term352928.getClass(), "compatibleCmVersion", "IvdDxaAJeq");
        setField(term352928, term352928.getClass(), "lastPlayDate", "UeVRhMzTDV");
        setIntField(term352928, term352928.getClass(), "lastPlaceId", 137156501);
        setField(term352928, term352928.getClass(), "lastPlaceName", "grLdsAhTPT");
        setIntField(term352928, term352928.getClass(), "lastRegionId", 1742277429);
        setField(term352928, term352928.getClass(), "lastRegionName", "BTPeodwzDD");
        setIntField(term352928, term352928.getClass(), "lastAllNetId", -988582796);
        setField(term352928, term352928.getClass(), "lastClientId", "ubUePLMRTF");
        setIntField(term352928, term352928.getClass(), "lastUsedDeckId", -1470588255);
        setIntField(term352928, term352928.getClass(), "lastPlayMusicLevel", -721898193);
        setIntField(term352928, term352928.getClass(), "lastEmoneyBrand", -25458774);
        setField(term352926, term352926.getClass(), "user", term352928);
        setIntField(term352926, term352926.getClass(), "eventId", 1715379525);
        setIntField(term352926, term352926.getClass(), "totalTechScore", 693133880);
        setIntField(term352926, term352926.getClass(), "totalPlatinumScore", -57222570);
        setField(term352926, term352926.getClass(), "techRecordDate", "ZKIUkIqRSP");
        setBooleanField(term352926, term352926.getClass(), "isRankingRewarded", false);
        setBooleanField(term352926, term352926.getClass(), "isTotalTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalTechScore", argTypes, term352926, args);
    }

};


