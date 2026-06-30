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

public class UserMusicDetail_setLevel_143620933622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413859;
     Object term414140;

    public UserMusicDetail_setLevel_143620933622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term413865 = new Long(-7503147844796296300L);
        term413859 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term413861 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term413863 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term413879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term413880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term413884 = newInstance(Class.forName("java.time.LocalTime"));
        Object term413889 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term413890 = newInstance(Class.forName("java.time.LocalDate"));
        Object term413894 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term413859, term413859.getClass(), "id", 1395216778754542716L);
        setLongField(term413861, term413861.getClass(), "id", 2411101880156047629L);
        setLongField(term413863, term413863.getClass(), "id", -3768411986370038550L);
        setField(term413863, term413863.getClass(), "extId", term413865);
        setField(term413863, term413863.getClass(), "luid", "JBmeEUWIqw");
        setIntField(term413880, term413880.getClass(), "year", 2024);
        setShortField(term413880, term413880.getClass(), "month", (short) 1);
        setShortField(term413880, term413880.getClass(), "day", (short) 26);
        setField(term413879, term413879.getClass(), "date", term413880);
        setByteField(term413884, term413884.getClass(), "hour", (byte) 6);
        setByteField(term413884, term413884.getClass(), "minute", (byte) 5);
        setByteField(term413884, term413884.getClass(), "second", (byte) 50);
        setIntField(term413884, term413884.getClass(), "nano", 91187229);
        setField(term413879, term413879.getClass(), "time", term413884);
        setField(term413863, term413863.getClass(), "registerTime", term413879);
        setIntField(term413890, term413890.getClass(), "year", 2024);
        setShortField(term413890, term413890.getClass(), "month", (short) 10);
        setShortField(term413890, term413890.getClass(), "day", (short) 12);
        setField(term413889, term413889.getClass(), "date", term413890);
        setByteField(term413894, term413894.getClass(), "hour", (byte) 13);
        setByteField(term413894, term413894.getClass(), "minute", (byte) 30);
        setByteField(term413894, term413894.getClass(), "second", (byte) 37);
        setIntField(term413894, term413894.getClass(), "nano", 903074102);
        setField(term413889, term413889.getClass(), "time", term413894);
        setField(term413863, term413863.getClass(), "accessTime", term413889);
        setField(term413861, term413861.getClass(), "card", term413863);
        setField(term413861, term413861.getClass(), "userName", "XSwQxfWQWM");
        setIntField(term413861, term413861.getClass(), "level", -1312609525);
        setIntField(term413861, term413861.getClass(), "reincarnationNum", -1464953069);
        setLongField(term413861, term413861.getClass(), "exp", 4031590063357445334L);
        setLongField(term413861, term413861.getClass(), "point", -2291451719844032873L);
        setLongField(term413861, term413861.getClass(), "totalPoint", 4761070343816232088L);
        setIntField(term413861, term413861.getClass(), "playCount", 170913608);
        setIntField(term413861, term413861.getClass(), "jewelCount", -1009932692);
        setIntField(term413861, term413861.getClass(), "totalJewelCount", -149626932);
        setIntField(term413861, term413861.getClass(), "medalCount", 843751126);
        setIntField(term413861, term413861.getClass(), "playerRating", 1871297801);
        setIntField(term413861, term413861.getClass(), "highestRating", 1932516294);
        setIntField(term413861, term413861.getClass(), "battlePoint", -1059409405);
        setIntField(term413861, term413861.getClass(), "bestBattlePoint", -57717459);
        setIntField(term413861, term413861.getClass(), "overDamageBattlePoint", -590563376);
        setBooleanField(term413861, term413861.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term413861, term413861.getClass(), "nameplateId", 868040354);
        setIntField(term413861, term413861.getClass(), "trophyId", -287737035);
        setIntField(term413861, term413861.getClass(), "cardId", 344953574);
        setIntField(term413861, term413861.getClass(), "characterId", -421215699);
        setIntField(term413861, term413861.getClass(), "characterVoiceNo", 56373728);
        setIntField(term413861, term413861.getClass(), "tabSetting", 1806055512);
        setIntField(term413861, term413861.getClass(), "tabSortSetting", 1136408459);
        setIntField(term413861, term413861.getClass(), "cardCategorySetting", -1627999071);
        setIntField(term413861, term413861.getClass(), "cardSortSetting", -555000719);
        setIntField(term413861, term413861.getClass(), "rivalScoreCategorySetting", -1828304987);
        setIntField(term413861, term413861.getClass(), "playedTutorialBit", -170220384);
        setIntField(term413861, term413861.getClass(), "firstTutorialCancelNum", -1849425514);
        setLongField(term413861, term413861.getClass(), "sumTechHighScore", 8592265957548297466L);
        setLongField(term413861, term413861.getClass(), "sumTechBasicHighScore", 6720711000974802766L);
        setLongField(term413861, term413861.getClass(), "sumTechAdvancedHighScore", 6570325299060665421L);
        setLongField(term413861, term413861.getClass(), "sumTechExpertHighScore", -8686580750635240114L);
        setLongField(term413861, term413861.getClass(), "sumTechMasterHighScore", -7557672529218103988L);
        setLongField(term413861, term413861.getClass(), "sumTechLunaticHighScore", -1846895773443116114L);
        setLongField(term413861, term413861.getClass(), "sumBattleHighScore", -2717950555073922756L);
        setLongField(term413861, term413861.getClass(), "sumBattleBasicHighScore", 2780483227921342947L);
        setLongField(term413861, term413861.getClass(), "sumBattleAdvancedHighScore", -4057389888370677202L);
        setLongField(term413861, term413861.getClass(), "sumBattleExpertHighScore", 3724819207994545578L);
        setLongField(term413861, term413861.getClass(), "sumBattleMasterHighScore", 3419771674833449860L);
        setLongField(term413861, term413861.getClass(), "sumBattleLunaticHighScore", -1622205259970016982L);
        setField(term413861, term413861.getClass(), "eventWatchedDate", "lLHzfczhsz");
        setField(term413861, term413861.getClass(), "cmEventWatchedDate", "supCgzTKJy");
        setField(term413861, term413861.getClass(), "firstGameId", "VhxGIhWmFW");
        setField(term413861, term413861.getClass(), "firstRomVersion", "qvIqLqIeKN");
        setField(term413861, term413861.getClass(), "firstDataVersion", "yWtysirSPQ");
        setField(term413861, term413861.getClass(), "firstPlayDate", "szRFPJVfNE");
        setField(term413861, term413861.getClass(), "lastGameId", "kVyXiPemWe");
        setField(term413861, term413861.getClass(), "lastRomVersion", "aFrMmwwBdj");
        setField(term413861, term413861.getClass(), "lastDataVersion", "UdkvrmHQkC");
        setField(term413861, term413861.getClass(), "compatibleCmVersion", "ZfHePbieUz");
        setField(term413861, term413861.getClass(), "lastPlayDate", "NMUTZRLgzn");
        setIntField(term413861, term413861.getClass(), "lastPlaceId", -1041518531);
        setField(term413861, term413861.getClass(), "lastPlaceName", "WXxKJukGsq");
        setIntField(term413861, term413861.getClass(), "lastRegionId", -508219470);
        setField(term413861, term413861.getClass(), "lastRegionName", "MNQBbzIzeZ");
        setIntField(term413861, term413861.getClass(), "lastAllNetId", -1618566872);
        setField(term413861, term413861.getClass(), "lastClientId", "CdSUsKlkUd");
        setIntField(term413861, term413861.getClass(), "lastUsedDeckId", 1360012431);
        setIntField(term413861, term413861.getClass(), "lastPlayMusicLevel", -460752057);
        setIntField(term413861, term413861.getClass(), "lastEmoneyBrand", -1982381121);
        setField(term413859, term413859.getClass(), "user", term413861);
        setIntField(term413859, term413859.getClass(), "musicId", 1209385326);
        setIntField(term413859, term413859.getClass(), "level", -2137960289);
        setIntField(term413859, term413859.getClass(), "playCount", -440211699);
        setIntField(term413859, term413859.getClass(), "techScoreMax", 604092751);
        setIntField(term413859, term413859.getClass(), "techScoreRank", 1775996673);
        setIntField(term413859, term413859.getClass(), "battleScoreMax", -359067105);
        setIntField(term413859, term413859.getClass(), "battleScoreRank", 1114409524);
        setIntField(term413859, term413859.getClass(), "maxComboCount", -231341318);
        setIntField(term413859, term413859.getClass(), "maxOverKill", -566645505);
        setIntField(term413859, term413859.getClass(), "maxTeamOverKill", -365373542);
        setBooleanField(term413859, term413859.getClass(), "isFullBell", true);
        setBooleanField(term413859, term413859.getClass(), "isFullCombo", true);
        setBooleanField(term413859, term413859.getClass(), "isAllBreake", true);
        setBooleanField(term413859, term413859.getClass(), "isLock", true);
        setIntField(term413859, term413859.getClass(), "clearStatus", 851112036);
        setBooleanField(term413859, term413859.getClass(), "isStoryWatched", true);
        term414140 = new Integer(-1044937599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term414140;
        callMethod(klass, "setLevel", argTypes, term413859, args);
    }

};


