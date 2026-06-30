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

public class UserKop_getKopId_3167803954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272587;

    public UserKop_getKopId_3167803954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term272593 = new Long(3161040540173678206L);
        term272587 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term272589 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term272591 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term272607 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term272608 = newInstance(Class.forName("java.time.LocalDate"));
        Object term272612 = newInstance(Class.forName("java.time.LocalTime"));
        Object term272617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term272618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term272622 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term272587, term272587.getClass(), "id", 8593326811264035526L);
        setLongField(term272589, term272589.getClass(), "id", 1317540450335888553L);
        setLongField(term272591, term272591.getClass(), "id", 2930658351355459737L);
        setField(term272591, term272591.getClass(), "extId", term272593);
        setField(term272591, term272591.getClass(), "luid", "HjAPJUaLTX");
        setIntField(term272608, term272608.getClass(), "year", 2026);
        setShortField(term272608, term272608.getClass(), "month", (short) 10);
        setShortField(term272608, term272608.getClass(), "day", (short) 27);
        setField(term272607, term272607.getClass(), "date", term272608);
        setByteField(term272612, term272612.getClass(), "hour", (byte) 13);
        setByteField(term272612, term272612.getClass(), "minute", (byte) 28);
        setByteField(term272612, term272612.getClass(), "second", (byte) 2);
        setIntField(term272612, term272612.getClass(), "nano", 546979873);
        setField(term272607, term272607.getClass(), "time", term272612);
        setField(term272591, term272591.getClass(), "registerTime", term272607);
        setIntField(term272618, term272618.getClass(), "year", 2011);
        setShortField(term272618, term272618.getClass(), "month", (short) 9);
        setShortField(term272618, term272618.getClass(), "day", (short) 22);
        setField(term272617, term272617.getClass(), "date", term272618);
        setByteField(term272622, term272622.getClass(), "hour", (byte) 5);
        setByteField(term272622, term272622.getClass(), "minute", (byte) 47);
        setByteField(term272622, term272622.getClass(), "second", (byte) 44);
        setIntField(term272622, term272622.getClass(), "nano", 154012278);
        setField(term272617, term272617.getClass(), "time", term272622);
        setField(term272591, term272591.getClass(), "accessTime", term272617);
        setField(term272589, term272589.getClass(), "card", term272591);
        setField(term272589, term272589.getClass(), "userName", "DNZRxHzfUW");
        setIntField(term272589, term272589.getClass(), "level", 1697610319);
        setIntField(term272589, term272589.getClass(), "reincarnationNum", -87021135);
        setLongField(term272589, term272589.getClass(), "exp", 7761366848640837538L);
        setLongField(term272589, term272589.getClass(), "point", 6652236389886836648L);
        setLongField(term272589, term272589.getClass(), "totalPoint", 965446130266626846L);
        setIntField(term272589, term272589.getClass(), "playCount", 619691165);
        setIntField(term272589, term272589.getClass(), "jewelCount", -124163210);
        setIntField(term272589, term272589.getClass(), "totalJewelCount", 200992733);
        setIntField(term272589, term272589.getClass(), "medalCount", 1285682550);
        setIntField(term272589, term272589.getClass(), "playerRating", -852602236);
        setIntField(term272589, term272589.getClass(), "highestRating", -442221418);
        setIntField(term272589, term272589.getClass(), "battlePoint", 974356617);
        setIntField(term272589, term272589.getClass(), "bestBattlePoint", 660265178);
        setIntField(term272589, term272589.getClass(), "overDamageBattlePoint", 1982277135);
        setBooleanField(term272589, term272589.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term272589, term272589.getClass(), "nameplateId", 405631945);
        setIntField(term272589, term272589.getClass(), "trophyId", -1114642017);
        setIntField(term272589, term272589.getClass(), "cardId", 322604433);
        setIntField(term272589, term272589.getClass(), "characterId", -863608100);
        setIntField(term272589, term272589.getClass(), "characterVoiceNo", -809977936);
        setIntField(term272589, term272589.getClass(), "tabSetting", -584343331);
        setIntField(term272589, term272589.getClass(), "tabSortSetting", 1773024551);
        setIntField(term272589, term272589.getClass(), "cardCategorySetting", -1168008314);
        setIntField(term272589, term272589.getClass(), "cardSortSetting", -1880112250);
        setIntField(term272589, term272589.getClass(), "rivalScoreCategorySetting", -84187747);
        setIntField(term272589, term272589.getClass(), "playedTutorialBit", -674794156);
        setIntField(term272589, term272589.getClass(), "firstTutorialCancelNum", -321760913);
        setLongField(term272589, term272589.getClass(), "sumTechHighScore", -1648406244982796389L);
        setLongField(term272589, term272589.getClass(), "sumTechBasicHighScore", -6522452746686415514L);
        setLongField(term272589, term272589.getClass(), "sumTechAdvancedHighScore", 7733757909983273588L);
        setLongField(term272589, term272589.getClass(), "sumTechExpertHighScore", -6006034545470263947L);
        setLongField(term272589, term272589.getClass(), "sumTechMasterHighScore", 238657803570299348L);
        setLongField(term272589, term272589.getClass(), "sumTechLunaticHighScore", -967011152107451426L);
        setLongField(term272589, term272589.getClass(), "sumBattleHighScore", 3606814530654223478L);
        setLongField(term272589, term272589.getClass(), "sumBattleBasicHighScore", 395992112824653293L);
        setLongField(term272589, term272589.getClass(), "sumBattleAdvancedHighScore", -4324282798219104256L);
        setLongField(term272589, term272589.getClass(), "sumBattleExpertHighScore", -7735030717299405043L);
        setLongField(term272589, term272589.getClass(), "sumBattleMasterHighScore", -1310236160215504134L);
        setLongField(term272589, term272589.getClass(), "sumBattleLunaticHighScore", 5435119851827403881L);
        setField(term272589, term272589.getClass(), "eventWatchedDate", "RFTLcXaXOf");
        setField(term272589, term272589.getClass(), "cmEventWatchedDate", "RdDqdChRRF");
        setField(term272589, term272589.getClass(), "firstGameId", "pchpUleqKe");
        setField(term272589, term272589.getClass(), "firstRomVersion", "VICIPgrdFz");
        setField(term272589, term272589.getClass(), "firstDataVersion", "JKiUJuSwov");
        setField(term272589, term272589.getClass(), "firstPlayDate", "axHXnsAsPO");
        setField(term272589, term272589.getClass(), "lastGameId", "QYbbRPmFfv");
        setField(term272589, term272589.getClass(), "lastRomVersion", "jHkmYGgAnp");
        setField(term272589, term272589.getClass(), "lastDataVersion", "TICBysdfuB");
        setField(term272589, term272589.getClass(), "compatibleCmVersion", "nCZmfjNayQ");
        setField(term272589, term272589.getClass(), "lastPlayDate", "rhQpxOnBRb");
        setIntField(term272589, term272589.getClass(), "lastPlaceId", -99070568);
        setField(term272589, term272589.getClass(), "lastPlaceName", "jMaSLvIsta");
        setIntField(term272589, term272589.getClass(), "lastRegionId", 597463097);
        setField(term272589, term272589.getClass(), "lastRegionName", "sSyiKfZXEJ");
        setIntField(term272589, term272589.getClass(), "lastAllNetId", 639141268);
        setField(term272589, term272589.getClass(), "lastClientId", "ioALTdlErP");
        setIntField(term272589, term272589.getClass(), "lastUsedDeckId", 2102047934);
        setIntField(term272589, term272589.getClass(), "lastPlayMusicLevel", -2040700684);
        setIntField(term272589, term272589.getClass(), "lastEmoneyBrand", -1560806486);
        setField(term272587, term272587.getClass(), "user", term272589);
        setField(term272587, term272587.getClass(), "authKey", "STfCNGDtwG");
        setIntField(term272587, term272587.getClass(), "kopId", 1221263863);
        setIntField(term272587, term272587.getClass(), "areaId", -2144870229);
        setIntField(term272587, term272587.getClass(), "totalTechScore", 552083040);
        setIntField(term272587, term272587.getClass(), "totalPlatinumScore", -1642633870);
        setField(term272587, term272587.getClass(), "techRecordDate", "NobNtKSnxv");
        setBooleanField(term272587, term272587.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKopId", argTypes, term272587, args);
    }

};


