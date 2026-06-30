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

public class UserTechEvent_toString_29146254720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360617;

    public UserTechEvent_toString_29146254720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term360623 = new Long(5023047512459111304L);
        term360617 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term360619 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term360621 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term360637 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term360638 = newInstance(Class.forName("java.time.LocalDate"));
        Object term360642 = newInstance(Class.forName("java.time.LocalTime"));
        Object term360647 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term360648 = newInstance(Class.forName("java.time.LocalDate"));
        Object term360652 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term360617, term360617.getClass(), "id", 3044148237325234105L);
        setLongField(term360619, term360619.getClass(), "id", -6220334523100553748L);
        setLongField(term360621, term360621.getClass(), "id", -9041979941014629385L);
        setField(term360621, term360621.getClass(), "extId", term360623);
        setField(term360621, term360621.getClass(), "luid", "URIHtqSRbl");
        setIntField(term360638, term360638.getClass(), "year", 2025);
        setShortField(term360638, term360638.getClass(), "month", (short) 6);
        setShortField(term360638, term360638.getClass(), "day", (short) 18);
        setField(term360637, term360637.getClass(), "date", term360638);
        setByteField(term360642, term360642.getClass(), "hour", (byte) 22);
        setByteField(term360642, term360642.getClass(), "minute", (byte) 0);
        setByteField(term360642, term360642.getClass(), "second", (byte) 37);
        setIntField(term360642, term360642.getClass(), "nano", 773671650);
        setField(term360637, term360637.getClass(), "time", term360642);
        setField(term360621, term360621.getClass(), "registerTime", term360637);
        setIntField(term360648, term360648.getClass(), "year", 2012);
        setShortField(term360648, term360648.getClass(), "month", (short) 11);
        setShortField(term360648, term360648.getClass(), "day", (short) 18);
        setField(term360647, term360647.getClass(), "date", term360648);
        setByteField(term360652, term360652.getClass(), "hour", (byte) 16);
        setByteField(term360652, term360652.getClass(), "minute", (byte) 27);
        setByteField(term360652, term360652.getClass(), "second", (byte) 35);
        setIntField(term360652, term360652.getClass(), "nano", 90549720);
        setField(term360647, term360647.getClass(), "time", term360652);
        setField(term360621, term360621.getClass(), "accessTime", term360647);
        setField(term360619, term360619.getClass(), "card", term360621);
        setField(term360619, term360619.getClass(), "userName", "GmzeyuSiId");
        setIntField(term360619, term360619.getClass(), "level", 1492263182);
        setIntField(term360619, term360619.getClass(), "reincarnationNum", 821538783);
        setLongField(term360619, term360619.getClass(), "exp", -1985320261027582545L);
        setLongField(term360619, term360619.getClass(), "point", -7995370119926981400L);
        setLongField(term360619, term360619.getClass(), "totalPoint", 2848425155488257467L);
        setIntField(term360619, term360619.getClass(), "playCount", 2074801750);
        setIntField(term360619, term360619.getClass(), "jewelCount", -491375519);
        setIntField(term360619, term360619.getClass(), "totalJewelCount", 1569215214);
        setIntField(term360619, term360619.getClass(), "medalCount", -919781253);
        setIntField(term360619, term360619.getClass(), "playerRating", -121012736);
        setIntField(term360619, term360619.getClass(), "highestRating", -2079916421);
        setIntField(term360619, term360619.getClass(), "battlePoint", 1582150466);
        setIntField(term360619, term360619.getClass(), "bestBattlePoint", 1064081178);
        setIntField(term360619, term360619.getClass(), "overDamageBattlePoint", -1226673488);
        setBooleanField(term360619, term360619.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term360619, term360619.getClass(), "nameplateId", -760931192);
        setIntField(term360619, term360619.getClass(), "trophyId", 1656460078);
        setIntField(term360619, term360619.getClass(), "cardId", 16684362);
        setIntField(term360619, term360619.getClass(), "characterId", 1644760430);
        setIntField(term360619, term360619.getClass(), "characterVoiceNo", -1053027283);
        setIntField(term360619, term360619.getClass(), "tabSetting", 1397765827);
        setIntField(term360619, term360619.getClass(), "tabSortSetting", 267976660);
        setIntField(term360619, term360619.getClass(), "cardCategorySetting", -273854504);
        setIntField(term360619, term360619.getClass(), "cardSortSetting", -1822882897);
        setIntField(term360619, term360619.getClass(), "rivalScoreCategorySetting", 1141240157);
        setIntField(term360619, term360619.getClass(), "playedTutorialBit", -1616417450);
        setIntField(term360619, term360619.getClass(), "firstTutorialCancelNum", -971861724);
        setLongField(term360619, term360619.getClass(), "sumTechHighScore", -3831360368029216749L);
        setLongField(term360619, term360619.getClass(), "sumTechBasicHighScore", 4534837600635482499L);
        setLongField(term360619, term360619.getClass(), "sumTechAdvancedHighScore", 688198321234489448L);
        setLongField(term360619, term360619.getClass(), "sumTechExpertHighScore", 4724574905247402475L);
        setLongField(term360619, term360619.getClass(), "sumTechMasterHighScore", 1538813546094904928L);
        setLongField(term360619, term360619.getClass(), "sumTechLunaticHighScore", -6799374698436832245L);
        setLongField(term360619, term360619.getClass(), "sumBattleHighScore", 4961459760675489377L);
        setLongField(term360619, term360619.getClass(), "sumBattleBasicHighScore", -4666787698135164877L);
        setLongField(term360619, term360619.getClass(), "sumBattleAdvancedHighScore", -7834607274524722842L);
        setLongField(term360619, term360619.getClass(), "sumBattleExpertHighScore", -2741982761661364946L);
        setLongField(term360619, term360619.getClass(), "sumBattleMasterHighScore", 6957304200870988767L);
        setLongField(term360619, term360619.getClass(), "sumBattleLunaticHighScore", -2037528194076429365L);
        setField(term360619, term360619.getClass(), "eventWatchedDate", "TzTgdBjicJ");
        setField(term360619, term360619.getClass(), "cmEventWatchedDate", "YQeHIhsjLc");
        setField(term360619, term360619.getClass(), "firstGameId", "nQZbRxPqNd");
        setField(term360619, term360619.getClass(), "firstRomVersion", "yuUiVhpeab");
        setField(term360619, term360619.getClass(), "firstDataVersion", "kakhqlEqNc");
        setField(term360619, term360619.getClass(), "firstPlayDate", "KbEBQtbxfu");
        setField(term360619, term360619.getClass(), "lastGameId", "NiFBBzDPrf");
        setField(term360619, term360619.getClass(), "lastRomVersion", "CaAyNRyeYX");
        setField(term360619, term360619.getClass(), "lastDataVersion", "TuExFSrfbK");
        setField(term360619, term360619.getClass(), "compatibleCmVersion", "OfCtSFOSgO");
        setField(term360619, term360619.getClass(), "lastPlayDate", "bKdUlqfUZU");
        setIntField(term360619, term360619.getClass(), "lastPlaceId", -1522121562);
        setField(term360619, term360619.getClass(), "lastPlaceName", "yXIwLnRQnO");
        setIntField(term360619, term360619.getClass(), "lastRegionId", -151706548);
        setField(term360619, term360619.getClass(), "lastRegionName", "NRTlEvMmfg");
        setIntField(term360619, term360619.getClass(), "lastAllNetId", 897321487);
        setField(term360619, term360619.getClass(), "lastClientId", "ikCxfIiFaC");
        setIntField(term360619, term360619.getClass(), "lastUsedDeckId", 1915967332);
        setIntField(term360619, term360619.getClass(), "lastPlayMusicLevel", -705559056);
        setIntField(term360619, term360619.getClass(), "lastEmoneyBrand", -1497037899);
        setField(term360617, term360617.getClass(), "user", term360619);
        setIntField(term360617, term360617.getClass(), "eventId", 1713915130);
        setIntField(term360617, term360617.getClass(), "totalTechScore", 1026752780);
        setIntField(term360617, term360617.getClass(), "totalPlatinumScore", 72356072);
        setField(term360617, term360617.getClass(), "techRecordDate", "fKdehbolLE");
        setBooleanField(term360617, term360617.getClass(), "isRankingRewarded", true);
        setBooleanField(term360617, term360617.getClass(), "isTotalTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term360617, args);
    }

};


